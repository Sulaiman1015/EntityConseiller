package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletmvc.model.DeptPaire;


@WebServlet("/AppServlet")
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptNum = req.getParameter("num");
        String deptName = numDeptMapper.findDept(deptNum);
        String addr = null;
        req.setAttribute("dept",deptName);
        if(deptName == null){
            addr = "/WEB-INF/results/missing-num.jsp";
            req.getRequestDispatcher(addr).forward(req,resp);
        }else {
        	
        	DeptPaire deptPaire = new DeptPaire(deptNum, deptName);
        			
            addr = "/WEB-INF/results/show-dept.jsp";
            req.getRequestDispatcher(addr).forward(req,resp);
        }
    
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
