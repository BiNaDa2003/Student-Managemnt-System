/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.studentmanagementsystem;

/**
 *
 * @author Binada Dewndara
 */
public class Student {
private final int id;
private final String name;
private final int age;
private final String grade;


    public Student(int id, String name, int age, String grade) {
          this.id = id;
          this.name = name;
          this.age = age;
          this.grade = grade;


    }
    
    public int getId(){
        return id;
   
}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

    
        

    void displayInfo() {
        System.out.println("id" + " " + id + " " + "name" + " " + name +" " + "age" + " " + age +" " + "grade" + " " + grade);
        
    }
    
}

