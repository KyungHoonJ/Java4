package servletTest;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SecondServ extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6417956420648078883L;

	@Override
	public void init() throws ServletException {
		System.out.println("요청 받아서 컨테이너 세팅22");
	}
	
	@Override
	public void destroy() {
		System.out.println("컨테이너 종료 시 삭제22");
	}
	
	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse res
			) throws ServletException, IOException {
		System.out.println("Get 받았음22");
	}
}


