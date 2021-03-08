import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "incorrectServlet", urlPatterns = "/incorrect")
public class incorrectServlet  extends HttpServlet {
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
        System.out.println("Loser!");
        request.getRequestDispatcher("incorrect").forward(request, response);

    }
}



