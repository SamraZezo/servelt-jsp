package miss.xing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class CookieServelt  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie user = new Cookie("user","tina");
        user.setMaxAge(10 * 60);//10m
        resp.addCookie(user);
        Cookie playlist = new Cookie("playlist","jsp");
        user.setMaxAge(10 * 60);//10m
        resp.addCookie(playlist);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<a href=\"result\"> go ti result</a>");
        out.println("</body></html>");




    }
}
