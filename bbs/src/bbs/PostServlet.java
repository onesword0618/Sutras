package bbs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "post", urlPatterns = "/post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PostServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request,response);
	}

	protected void perform(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title"); //$NON-NLS-1$
		String content = request.getParameter("content"); //$NON-NLS-1$
		Topic topic = new Topic();
		topic.setTitle(title);
		topic.setContent(content);
		BbsController controller = BbsController.getInstance();
		controller.postTopic(topic);
		request.getRequestDispatcher("/read").forward(request, response); //$NON-NLS-1$
	}
}
