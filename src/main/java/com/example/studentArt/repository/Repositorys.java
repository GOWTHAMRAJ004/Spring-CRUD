package com.example.studentArt.repository;

import com.example.studentArt.module.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Repositorys{
    List<Student> student = new ArrayList<Student>();
    public void addStudent(Student s1){
        student.add(s1);
    }
    public List<Student> display(){
        return student;
    }
    public Student search(int id){
            for(Student s1 : student){
                if(s1.getId() == id){
                    return s1;
                }
            }
            return null;
    }
    public void delete (int id){
        student.removeIf(student -> student.getId() == id);
    }
}
