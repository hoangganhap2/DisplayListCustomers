package Servlet;

import customers.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customer = new ArrayList<>();
        customer.add(new Customers("Cậu Vàng",19,"Ấn Độ","http://media.bastillepost.com/wp-content/uploads/global/2017/09/MIkami-Yua5.jpg"));
        customer.add(new Customers("Ông Giáo",22,"Japan","https://pbs.twimg.com/media/D8I6gZ7WsAA8wR8.jpg"));
        customer.add(new Customers("Lão Hạc",20,"Việt Nam","https://i.pinimg.com/originals/52/7c/82/527c82f6b4b973a48763e0479d2d3871.jpg"));

        request.setAttribute("customers",customer);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customers.jsp");
        requestDispatcher.forward(request,response);
    }

}
