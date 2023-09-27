package c230926.studentServ;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.student.StudentDAO;
import c230926.student.StudentVO;

/**
 * Servlet implementation class Student
 */
@WebServlet("/student")
public class Student extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6216851063516554042L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("id : " + request.getParameter("id"));
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.getList();
		StudentVO student = null;
		if(request.getParameter("id") != null) {
			student = dao.getStudent(
				Integer.parseInt(request.getParameter("id"))
			);
		}
		System.out.println(list.size());
		String html = "<html>";
		html += "<head>";
		html += "<meta charset='UTF-8' />";
		html += "<title>";
		html += "학생 목록";
		html += "</title>";
		html += "</head>";
		html += "<body>";
		if(student == null) {
			html += "<form action='student' method='post'>";
			html += "<input type='text' name='student-id' placeholder='ID' />";
			html += "<input type='text' name='student-pw' placeholder='PASSWORD' />";
			html += "<button>로그인</button>";
			html += "</form>";
		} else {
			html += "<div>";
			html += student.getName() + "님 어서오세요.";
			html += "</div>";
			html += "<a href='./student'><button>로그아웃</button></a>";
		}
		html += "<ol>";
		for(int i = 0; i < list.size(); ++i) {
			html += "<li>";
			html += list.get(i).getName();
			html += "</li>";
		}
		html += "</ol>";
		html += "</body>";
		html += "</html>";
		System.out.println(html);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String studentId = request.getParameter("student-id");
		StudentDAO dao = new StudentDAO();
		StudentVO temp = dao.getStudent(studentId);
		System.out.println(temp);
		if(temp != null && temp.getStudentPw().equals(request.getParameter("student-pw"))) 
			response.sendRedirect("student" + "?id=" + temp.getId());
		else 
			response.sendRedirect("student");
//		response.getWriter().append("testing");
	}
}
