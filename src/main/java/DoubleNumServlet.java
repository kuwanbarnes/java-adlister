
import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet(name = "WhoAreYouServlet", urlPatterns = "/who-are-you")
public class DoubleNumServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
       int userNUM =Integer.parseInt(request.getParameter("num"));
        request.setAttribute("num",userNUM);
        request.setAttribute("dubnum",userNUM*2);
        request.getRequestDispatcher("dub-num.jsp").forward(request, response);
    }
}