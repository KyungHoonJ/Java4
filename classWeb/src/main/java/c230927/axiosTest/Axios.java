package c230927.axiosTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Axios
 */
@WebServlet("/axios")
public class Axios extends HttpServlet {

	private static final long serialVersionUID = -8342154843064801324L;
	List<String> tempList = new ArrayList<String>();
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
		String temp = request.getParameter("test");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(temp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String temp = request.getParameter("test");
		tempList.add(temp);
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		tempList.stream().forEach((item)->{
			sb.append("\"");
			sb.append(item);
			sb.append("\"");
			sb.append(",");
		});
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(sb.toString());
	}

}
