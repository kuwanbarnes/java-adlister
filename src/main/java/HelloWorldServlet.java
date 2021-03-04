import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userSaid = req.getParameter("name");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();


        if (userSaid != null) {
            out.printf("<h1>Hello, %s</h1>",userSaid);

        }else
        {

            out.printf("<h1>Hello,World!<h1>");



        }
    }
}

