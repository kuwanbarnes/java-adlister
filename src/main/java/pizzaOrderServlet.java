
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class pizzaOrderServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
//        request.setAttribute("name", request.getParameter("name"));  // The same but different.
        request.getRequestDispatcher("pizza-order-form.jsp").forward(request, response);
String crust = request.getParameter("crust");
request.setAttribute("crust",crust);
        System.out.println(request.getParameter("crust"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String crust = request.getParameter("crust");
        System.out.println("crust = "+ crust);
        response.getWriter().println(crust);

        String sauce = request.getParameter("sauce");
        System.out.println("sauce = "+ sauce);
        response.getWriter().println(sauce);

        String beef = request.getParameter("beef");
        System.out.println("toppings = "+ beef);
        response.getWriter().println(beef);

        String pepperoni = request.getParameter("pepperoni");
        System.out.println("toppings = "+ pepperoni);
        response.getWriter().println(pepperoni);

        String ham = request.getParameter("ham");
        System.out.println("toppings = "+ ham);
        response.getWriter().println(ham);

        String address = request.getParameter("Address");
        System.out.println("address = "+ address);
        response.getWriter().println(address);
    }

}
