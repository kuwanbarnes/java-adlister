import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "guessViewServlet", urlPatterns = "/guess")
public class guessViewServlet   extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
        request.setAttribute("userGuess", userGuess);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userGuess"));
        request.getRequestDispatcher("user-Guess.jsp").forward(request, response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("userGuess"));

        request.setAttribute("userGuess", userGuess);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        System.out.println(request.getParameter("userGuess"));

        if (userGuess == 2) {
            request.getRequestDispatcher("correct").forward(request, response);

        }else{
            request.getRequestDispatcher("incorrect").forward(request, response);
        }
    }
}