package com.stheno.tomcat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HelloWorld Get!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HelloWorld ゲット!</h1>");
        out.println("<form method=\"post\" action=\"" + super.getServletContext().getContextPath() + request.getServletPath() + "\">");
        out.println("<input type=\"text\" name=\"login_id\" value=\"\"/>");
        out.println("<input type=\"submit\" name=\"hello_post\" value=\"to post.\"/>");
        out.println("</form");
        out.println("</body>");
        out.println("</html>");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HelloWorld Post!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HelloWorld ポスト!</h1>");
        out.println("<a href=\"" + super.getServletContext().getContextPath() + request.getServletPath() + "\">HelloWorld Get!</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
	}

}
