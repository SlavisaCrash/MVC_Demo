import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Slavisa on 3.5.2017..
 */
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        RequestDispatcher rd;

        //Authenticator authenticator = new Authenticator();
       // String result = authenticator.authenticate(username, password);

       String adminUsername = this.getServletConfig().getInitParameter("username");
       String adminPassword = this.getServletConfig().getInitParameter("password");


        if((adminUsername.equals(username)) && (adminPassword.equals(password))) {

            rd = request.getRequestDispatcher("/success.jsp");
            User user = new User(username, password);
            request.setAttribute("user", user);

        } else {

            rd = request.getRequestDispatcher("/error.jsp");
        }
        rd.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
