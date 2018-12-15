package bbs;

import java.util.Date;

public class Topic {

	/** 連番 */
	private int id;
	/** タイトル */
	private String title;
	/** 内容 */
	private String content;
	/** 投稿日 */
	private Date postData;

	public String toString() {
		return super.toString()
				+ ",id" + this.id //$NON-NLS-1$
				+ ",title" + this.title //$NON-NLS-1$
				+ ",content" + this.content //$NON-NLS-1$
				+ ",postDate" + this.postData //$NON-NLS-1$
		;
	}

	// getter,setter
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String contetnt) {
		this.content = contetnt;
	}

	public Date getPostData() {
		return this.postData;
	}

	public void setPostDate(Date date) {
		this.postData = date;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
