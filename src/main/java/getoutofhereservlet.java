
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "getoutofhereervlet",urlPatterns = "/get-out")
public class getoutofhereservlet  extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.sendRedirect("/hello-world");
    }
}
