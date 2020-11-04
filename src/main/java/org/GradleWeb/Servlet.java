package org.GradleWeb;
////注释。。。。。。。
import java.io.IOException;

@WebServlet("/Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("do post");
        int a =20 ;
        int b = 50;
        int c = a+b;
        System.out.println(a);
        System.out.println(c);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("do post");
        int a =20 ;
        int b = 50;
        int c = a+b;
        System.out.println(a);
        System.out.println(c);
    }
}
