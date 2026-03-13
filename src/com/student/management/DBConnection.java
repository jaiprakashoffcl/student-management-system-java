package com.student.management;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url="jdbc:mysql://localhost:3306/studentdb";
    static String user="root";
    static String password="root";

    public static Connection getConnection(){

        try{
            Connection con=DriverManager.getConnection(url,user,password);
            return con;
        }
        catch(Exception e){
            System.out.println(e);
        }

        return null;
    }
}