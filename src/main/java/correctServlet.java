import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "correctServlet", urlPatterns = "/guess")
public class correctServlet   extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
        request.setAttribute("userGuess", userGuess);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userGuess"));
        request.getRequestDispatcher("viewGuess.jsp").forward(request, response);


    }
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
        request.setAttribute("userGuess", userGuess);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userGuess"));
        System.out.println("Winner!");
        request.getRequestDispatcher("correct").forward(request, response);

    }
}

