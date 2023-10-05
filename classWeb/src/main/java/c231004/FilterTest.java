package c231004;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterTest
 */
@WebFilter("/api")
public class FilterTest extends HttpFilter implements Filter {

	private static final long serialVersionUID = 8569559904709436356L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public FilterTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain

//		HttpSession session = ((HttpServletRequest)request).getSession();
//		session.setAttribute("testing", "아하하하?");
//		request.setAttribute("userId", "정경훈");
//		response.getWriter().print("<html><head><meta charset='utf-8' /></head><body><h1>");
		chain.doFilter(request, response);
//		response.getWriter().print("</h1></body></html>");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
