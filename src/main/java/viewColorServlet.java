
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "viewColorServlet", urlPatterns = "/viewcolor")
public class viewColorServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        String color = request.getParameter("userColor");
        request.setAttribute("userColor",color);
        System.out.println(request.getParameter("userColor"));
        request.getRequestDispatcher("view-color.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        String color = request.getParameter("userColor");
        request.setAttribute("userColor",color);
        System.out.println(request.getParameter("userColor"));
        request.getRequestDispatcher("view-color.jsp").forward(request, response);
    }

}