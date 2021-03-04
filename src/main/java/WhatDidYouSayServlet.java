import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "WhatDidYouSayServlet", urlPatterns = "/what-did-you-say")
public class WhatDidYouSayServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userSaid = req.getParameter("name");
        resp.setContentType("text/html");
        hitCount++;
        PrintWriter out = resp.getWriter();
        String title = "Total Number of Hits";
        if (userSaid != null) {
            out.printf("<h1>Hello, %s</h1>",userSaid);
            out.printf("<h1 align >" + title + "</h1>\n" + hitCount + "</h2>\n");
        } else {
            out.println("<h1>You're no fun, you know</h1>"+ "<h2 align = \"center\">" + hitCount + "</h2>\n");
        }
    }
}
