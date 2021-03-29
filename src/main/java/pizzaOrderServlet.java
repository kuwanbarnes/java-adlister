
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class pizzaOrderServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        request.getRequestDispatcher("pizza-order-form.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("pizza_size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("Address");

        if (crust != null && sauce != null && size != null && toppings != null && address != null) {
            System.out.println("crust = " + crust);
            System.out.println("sauce = " + sauce);
            System.out.println("pizza_size = " + size);

            for (int i = 0; i < toppings.length - 1; i++) {
                System.out.println("toppings = " + toppings[i]);
            }
            System.out.println("address = " + address);
        }else{
            System.out.println("User did not fill out all forms");
        }
    }

}
