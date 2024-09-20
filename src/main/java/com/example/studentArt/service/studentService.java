package com.example.studentArt.service;

import com.example.studentArt.module.Student;
import com.example.studentArt.repository.Repositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
private Repositorys repo;
    public void addStudent(Student s1){
       repo.addStudent(s1);
    }
    public List<Student> display(){
       return repo.display();
    }
    public Student search(int id){
       return repo.search(id);
    }
    public void delete (int id){
       repo.delete(id);
    }
}
