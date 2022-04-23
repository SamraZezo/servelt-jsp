package miss.xing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import miss.xing.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.stream.Stream;

@WebServlet("/result")
public class ResultServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        User user = (User) req.getAttribute("user");
//        out.println("post method *-*-*-*-*--*-*-*-*-*-**-*-*-***-*-*-*-*-*-*-*-* ");
//        out.println("playlist : " +  req.getAttribute("playlist"));
//        out.println("first name : " + user.getFirstName());
//        out.println("last name : " + user.getLastName());


//        The below code is the result page for ApplicationScope demo
        out.println("App Name: " + getServletContext().getAttribute("AppName"));
        out.println("Author: " + getServletContext().getAttribute("Author"));
 //       The code below is the result page for Cookie Exchange
//        Cookie[] cookies = req.getCookies();
//        out.println("user: " + this.getCookieValueByName(cookies, "user").get());
//        out.println("playlist: " + this.getCookieValueByName(cookies, "playlist").orElse("Cannot find playlist Cookie"));


    }
//    private Optional<String> getCookieValueByName(Cookie[] cookies,String name){
//        return Stream.of(cookies)
//                .filter(cookie -> name.equals(cookie.getName()))
//                .map(Cookie::getValue)
//                .findAny();
//    }
}