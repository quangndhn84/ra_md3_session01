package ra.jsp_servlet_demo.servlet;

import ra.jsp_servlet_demo.entity.UserData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Khởi tạo đối tượng UserData
        UserData userData = new UserData(1,"Nguyễn Văn A","nva@gmail.com",20);
        //add đối tượng userData vào request
        request.setAttribute("userData",userData);
        //Chuyển request sang trang userInformation.jsp
        request.getRequestDispatcher("views/userInformation.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}