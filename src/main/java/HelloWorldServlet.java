import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    int counter;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userSaid = req.getParameter("name");
        String userSaid2 = req.getParameter("reset");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        counter++;
        String title = "Total Number of Hits";
        if (userSaid != null) {
            out.printf("<h1>Hello, %s</h1>",userSaid);
            out.printf("<h1>" + title + "</h1>\n" + counter + "</h2>\n");
            out.println("<html><head/><body>");
            out.println("<a href=\"" +
                    getServletContext().getContextPath() +
                    req.getServletPath() +
                    "?reset=counter" + "\">Reset</a>");
            out.println("</body></html>");
        }else if(userSaid2.equals("counter")){
            counter = 0;
            out.printf("<h1>You restarted the counter</h1>");
            out.printf("<h1>" + title + "</h1>\n" + counter + "</h2>\n");

        }else
        {

            out.printf("<h1>Hello,World!<h1>");



        }
    }
}

