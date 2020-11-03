package org.GradleWeb;
//怎么搞
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do post");
        int a = 10;
        int b =30;
        int c =a+b;
        System.out.println(c);
        System.out.println(b);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do get");
        int a = 10;
        int b =30;
        int c =a+b;
        System.out.println(c);
        System.out.println(b);
    }
}
