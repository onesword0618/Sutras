package bbs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbsController {

	// インスタンス
	private static BbsController controller = new BbsController();

	// 連番用のカウンタ
	private int idCounter;

	// bbsのリスト
	private List<Topic> topics = new ArrayList<Topic>();

	/**
	 * インスタンスを取得する
	 * @return
	 */
	public static BbsController getInstance() {
		return controller;
	}

	private BbsController() {

	}

	public void postTopic(Topic topic) {

		synchronized (this) {

			topic.setId(this.idCounter++);
			topic.setPostDate(new Date());
			this.topics.add(topic);
		}
	}

	public List<Topic> geTopics() {
		return new ArrayList<Topic>(this.topics);
	}
}
