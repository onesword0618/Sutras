package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class MinatoIndex
 */
@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = this.getServletContext();

		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV"); //$NON-NLS-1$

		if (siteEV == null) {

			siteEV = new SiteEV();
		}

		// リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8"); //$NON-NLS-1$
		String action = request.getParameter("action"); //$NON-NLS-1$

		// サイトの評価処理
		SiteEVLogic siteEVLogic = new SiteEVLogic();
		if (action != null && action.equals("like")) { //$NON-NLS-1$
			siteEVLogic.like(siteEV);
		} else if (action != null && action.equals("dislike")) { //$NON-NLS-1$
			siteEVLogic.dislike(siteEV);
		}

		// アプリケーションスコープにサイト評価を保存
		application.setAttribute("siteEV", siteEV); //$NON-NLS-1$

		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp"); //$NON-NLS-1$
		dispatcher.forward(request, response);
	}
}
