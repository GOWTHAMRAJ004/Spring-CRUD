package com.example.studentArt;

import com.example.studentArt.module.Student;
import com.example.studentArt.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class StudentArtApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentArtApplication.class, args);
		studentService s1 = context.getBean(studentService.class);
		Scanner scanner = new Scanner(System.in);
		int next = 0;
		while (true){
			System.out.println("1: Save student");
			System.out.println("2: Search student");
			System.out.println("3: Delete student");
			System.out.println("4: Display students");
			System.out.println("5: Exit");
			next = scanner.nextInt();
			scanner.nextLine();
			 if(next == 1){
				 System.out.println("enter your name ");
				 String name = scanner.nextLine();
				 System.out.println("enter your roll no");
				 int roll = scanner.nextInt();
				 scanner.nextLine();
				 System.out.println("enter your sec");
				 String sec = scanner.nextLine();
				 Student stude = context.getBean(Student.class);
				 stude.setSec(sec);
				 stude.setName(name);
				 stude.setId(roll);
				 s1.addStudent(stude);
			 }
			 if(next == 2){
				 System.out.println("enter the id to be searched");
				 int id = scanner.nextInt();
				 Student foundStudent = s1.search(id);
				 if (foundStudent != null) {
					 System.out.println("Student found: " + foundStudent);
				 } else {
					 System.out.println("Student not found.");
				 }
			 }
			 if(next == 3){
				 System.out.println("enter the id to be delete");
				 int id = scanner.nextInt();
				 s1.delete(id);
			 }
			 if(next == 4){
				 List<Student> students = s1.display();
				 System.out.println("Students:");
				 for (Student s : students) {
					 System.out.println(s);
				 }
			 }
			 if(next == 5){
				 break;
			 }
		}
	}

}
