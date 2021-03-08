
import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet(name = "pickcolorServlet", urlPatterns = "/pickcolor")
public class pickcolorServlet   extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userColor = request.getParameter("Usercolor");
        request.setAttribute("userColor", userColor);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userColor"));
        request.getRequestDispatcher("pick-color.jsp").forward(request, response);


        }
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        String userColor = request.getParameter("userColor");
        request.setAttribute("userColor", userColor);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userColor"));

        request.getRequestDispatcher("viewcolor").forward(request, response);

    }
}
