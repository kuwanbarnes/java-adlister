
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "viewColorServlet", urlPatterns = "/viewcolor")
public class viewColorServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        request.getRequestDispatcher("view-color.jsp").forward(request, response);
        String crust = request.getParameter("crust");
        request.setAttribute("crust",crust);
        System.out.println(request.getParameter("crust"));
    }

}