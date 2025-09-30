/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.studentmanagementsystem;

/**
 *
 * @author Binada Dewndara
 */
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("= = = Student Management System = = =");
        showmenu();  
    }
    
    public static void showmenu(){
        while(true){
            System.out.println("1.Add Student");
            System.out.println("2.view All Students");
            System.out.println("3.Search Studdent");
            System.out.println("4.Exit");
            System.out.println("Choose a option : ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> addstudent();
                case 2 -> viewstudent();
                case 3 -> searchstudent();
                case 4 -> {
                    System.out.println("Thank You for using Student Managemt System");
                    return;
                }
             
                        
                    
                    
            }
            defualt: {
            System.out.println("Invalid Option! Try Again....");
            
        }
       
            
        }
    }

    private static void addstudent() {
        System.out.print("Enter the Student ID :");
        int id = scanner.nextInt();
        
        System.out.print("Enter the Student name :");
        String name = scanner.next();
        
        System.out.print("Enter the Age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter the Grade :");
        String grade = scanner.nextLine();
        
        Student student = new Student(id, name, age, grade);
        students.add(student);
        System.out.println("Student add sucessfully !!!");
            
        
        
    }

    private static void searchstudent() {
        System.out.print("Enter the Student ID :");
        int id = scanner.nextInt();
        
        for(Student child : students){
           
            if(child.equals(id)){
                System.out.println("Student Found");
                child.displayInfo();
                return;
            } 
            else{
                System.out.println("Not Found");
            }
            
            
        }
        
    }

    private static void viewstudent() {
       if(students.isEmpty()){
           System.out.println("Not Found");
           return;
       }
        System.out.println("===All Students===");
        for(Student child : students){
            child.displayInfo();
        }
    }
}

