package com.ForWomen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CheckBoxServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String title = "Bu Sözü Dikkatli Okumalısın";
		if (request.getParameter("woman") != null && request.getParameter("man") == null)
		{
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
			out.println(docType + "<html>\n" + "<head><meta http-equiv='Content-Type' content='text/html;charset=UTF-8'/><title>" + title + "</title></head>\n"
					 + "<body bgcolor=\"#FF8ADE\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
					 + "<p>Güçlü ol, çünkü karşındaki ön yargılar ve engeller sen doğmadan çok önce kondu.</p>\n" + "<p>Ama istersen hepsini aşabilirsin.</p>\n" 
					 + "<b>Çünkü sen dünyadaki ne düşündüğü belli olmayan tek canlısın.</b>" + "<b><i> Sen KADINSIN! </i></b>" + "</body></html>");
		}
		else if (request.getParameter("man") != null && request.getParameter("woman") == null)
		{
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
			out.println(docType + "<html>\n" + "<head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'><title>" + title + "</title></head>\n" + "<body bgcolor=\"#67AEFB\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
					 + "<p>Sen baştan kaybetmişsin dostum.</p>\n" 
					 + "<p>Geçmiş olsun.</p>\n" + "</body></html>");
		}
		else if(request.getParameter("man") != null && request.getParameter("woman") != null)
		{
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
			out.println(docType + "<html>\n" + "<head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'><title>" + title + "</title></head>\n" + "<body bgcolor=\"#D837EA\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
					 + "<p>Bence kimlik karmaşası yaşıyorsun dostum.</p>\n" + "</body></html>");
		}
		else if(request.getParameter("man") == null && request.getParameter("woman") == null)
		{
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
			out.println(docType + "<html>\n" + "<head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'><title>" + title + "</title></head>\n" + "<body bgcolor=\"#A9F959\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
					 + "<p>Bence bi karar ver dostum. Böyle olmaz.</p>\n" + "</body></html>");
		}
		
	}
	
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doGet(request, response);
	}

}
