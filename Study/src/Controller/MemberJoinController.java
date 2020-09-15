package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.MemberJoinService;

@WebServlet("/memberjoin")
public class MemberJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberJoinController() {
        super();
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	MemberJoinService mjoinService = new MemberJoinService(); 
    	int joinResult = mjoinService.memberJoin(request, response);
    	if(joinResult>0) {
    		response.sendRedirect("MemberJoinSuccess.jsp");
    	}else {
    		response.sendRedirect("MemberJoinFail.jsp");
    	}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
