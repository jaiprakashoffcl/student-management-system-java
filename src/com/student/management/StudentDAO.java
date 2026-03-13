package com.student.management;

import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s){

        try{

            Connection con=DBConnection.getConnection();

            String query="INSERT INTO students(name,department,marks) VALUES(?,?,?)";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,s.name);
            ps.setString(2,s.department);
            ps.setInt(3,s.marks);

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void viewStudents(){

        try{

            Connection con=DBConnection.getConnection();

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM students");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id")+" "+
                        rs.getString("name")+" "+
                        rs.getString("department")+" "+
                        rs.getInt("marks")
                );
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void updateStudent(Student s){

        try{

            Connection con=DBConnection.getConnection();

            String query="UPDATE students SET name=?,department=?,marks=? WHERE id=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,s.name);
            ps.setString(2,s.department);
            ps.setInt(3,s.marks);
            ps.setInt(4,s.id);

            ps.executeUpdate();

            System.out.println("Student Updated");

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void deleteStudent(int id){

        try{

            Connection con=DBConnection.getConnection();

            String query="DELETE FROM students WHERE id=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Student Deleted");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}