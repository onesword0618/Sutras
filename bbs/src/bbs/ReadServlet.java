package bbs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(name = "read", urlPatterns = "/read")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		perform(request, response);
	}

	protected void perform(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BbsController controller = BbsController.getInstance();
		List<Topic> topics = controller.geTopics();

		request.setAttribute("topics", topics); //$NON-NLS-1$

		request.getRequestDispatcher("/read.jsp").forward(request, response); //$NON-NLS-1$
	}
}
