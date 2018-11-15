package com.oasystem.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import com.oasystem.utl.MySqlTest;
/**
 * Created by zyf on 2018/10/24.
 */
public class LoginServlet extends HttpServlet {
     @Override

     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         OutputStream out = resp.getOutputStream();

         String username = req.getParameter("logginname");
 
         String password = req.getParameter("logginpwd");
 
         //String validationCode = req.getParameter("validationCode");
 
         HttpSession session = req.getSession();
 
         //String validation_code = (String)session.getAttribute("validation_code");
 
         /*if(validationCode.equalsIgnoreCase(validation_code)){
 
             System.out.println("验证码正确");
 
         }else{
 
             System.out.println("验证码错误");
 
         }*/
 
         MySqlTest mss = new MySqlTest();
 
         String result = mss.checkUser(username,password);
 
         if (result.equals("hasUserNameAndPasswordCorrect")) {
 
             System.out.println("用户名和密码均正确");
 
 
             System.out.println("用户名正确,密码不正确");
 
         } else if (result.equals("hasNoUserName")) {
 
             System.out.println("没有此用户");
 
         }
 
         //转发到result.jsp
 
         RequestDispatcher rd = req.getRequestDispatcher("index.html");
 
        rd.forward(req, resp);
 
     }
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request,response);
     }
 
}
