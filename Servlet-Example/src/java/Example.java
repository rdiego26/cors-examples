
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramos
 */
@WebServlet(name = "DataCompanyInfosJson", urlPatterns = {"/json"})
public class Example extends HttpServlet {
    
    private JSONObject retorno = new JSONObject();
    private PrintWriter pw;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        
        //CORS
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        response.setHeader("Access-Control-Allow-Headers", "Accept-Ranges, Content-Encoding, Content-Length, Content-Range, Content-Type, Accept, Range");
        response.setHeader("Access-Control-Expose-Headers", "Accept-Ranges, Content-Encoding, Content-Length, Content-Range"); 
        
        
        retorno.put("author", "Diego Ramos");
        
        pw = response.getWriter();
        pw.write( retorno.toString() );
        
        
    }
    
    
    
}
