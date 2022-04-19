package miss.xing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class userServelt extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("get  method  ----------*-*---*-*-*-*-*");
        out.println("first name : " +  req.getParameter("fname"));
        out.println("first name : " +  req.getParameter("lname"));


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("post method *-*-*-*-*--*-*-*-*-*-**-*-*-***-*-*-*-*-*-*-*-* ");
        out.println("first name : " +  req.getParameter("fname"));
        out.println("first name : " +  req.getParameter("lname"));
    }
}
