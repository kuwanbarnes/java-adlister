import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "guessViewServlet", urlPatterns = "/guess")
public class guessViewServlet   extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.

        request.getRequestDispatcher("user-Guess.jsp").forward(request, response);

    }
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        int userGuess = Integer.parseInt(request.getParameter("userGuess"));
int randomnum =(int)(Math.round(Math.random()*2)+1);
if (userGuess == randomnum){
    request.getRequestDispatcher("/correct").forward(request, response);
}else{
    request.getRequestDispatcher("/incorrect").forward(request, response);

//        request.setAttribute("name", request.getParameter("name"));  // The same but different.




        }
    }
}