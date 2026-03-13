package com.student.management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StudentDAO dao=new StudentDAO();

        while(true){

            System.out.println("\n===== Student Management System =====");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Update Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit");

            int choice=sc.nextInt();

            if(choice==1){

                sc.nextLine();

                System.out.println("Enter Name");
                String name=sc.nextLine();

                System.out.println("Enter Department");
                String dept=sc.nextLine();

                System.out.println("Enter Marks");
                int marks=sc.nextInt();

                Student s=new Student(name,dept,marks);

                dao.addStudent(s);
            }

            else if(choice==2){

                dao.viewStudents();

            }

            else if(choice==3){

                System.out.println("Enter Student ID");
                int id=sc.nextInt();

                sc.nextLine();

                System.out.println("Enter New Name");
                String name=sc.nextLine();

                System.out.println("Enter New Department");
                String dept=sc.nextLine();

                System.out.println("Enter New Marks");
                int marks=sc.nextInt();

                Student s=new Student(id,name,dept,marks);

                dao.updateStudent(s);
            }

            else if(choice==4){

                System.out.println("Enter Student ID to Delete");
                int id=sc.nextInt();

                dao.deleteStudent(id);
            }

            else if(choice==5){

                System.out.println("Exiting...");
                break;
            }
        }
    }
}