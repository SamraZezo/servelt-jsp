package miss.xing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import miss.xing.model.User;

import java.io.IOException;

@WebServlet("/request")
public class RequestServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("playlist","Servelt jsp");
        req.setAttribute("user",new User("s","d"));
        req.getRequestDispatcher("/result").forward(req,resp);
    }
}
