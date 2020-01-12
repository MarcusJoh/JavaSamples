
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aPostServlet")
public class aPostServlet extends HttpServlet {

    private static final long serialVersionUID = 1 ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

 
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>login data</h1>");
        printWriter.print("<p> pass= :: " + password + "</p>");
      
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

       
    }
}