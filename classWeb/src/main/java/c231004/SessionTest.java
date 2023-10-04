package c231004;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -606927649300003709L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // 사과 주세요 == Apple Please == 링고 구다사이

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		
		HttpSession session = request.getSession();
		// 13D1C7E2C430CB21E62E5A351D4E6288 << 암호화 방법 중 하나를 사용중
		response.getWriter().println(session.getId() + "<br />");
		response.getWriter().println(session.getCreationTime() + "<br />");
		response.getWriter().println(session.getMaxInactiveInterval() + "<br />");
		response.getWriter().println(session.getLastAccessedTime() + "<br />");
		response.getWriter().println(session.getAttribute("test-session") + "<br />");
		
		session.setMaxInactiveInterval(10);
		
		session.setAttribute("test-session", "하이염");
//		session.invalidate(); // 세션을 즉시 삭제한다.
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
