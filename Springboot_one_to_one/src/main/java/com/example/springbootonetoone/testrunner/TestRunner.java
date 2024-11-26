package com.example.springbootonetoone.testrunner;

import com.example.springbootonetoone.entity.Book;
import com.example.springbootonetoone.entity.Student;
import com.example.springbootonetoone.repo.Bookrepo;
import com.example.springbootonetoone.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private Bookrepo bookrepo;

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello World");


        Book bk1=new Book(10,"Data-Structure");
        Book bk2=new Book(20,"Springboot");
        Book bk3=new Book(30,"Programming");


        bookrepo.save(bk1);
        bookrepo.save(bk2);
        bookrepo.save(bk3);

        Student st1=new Student(100,"Prajwal","Baramati",bk1);
        Student st2=new Student(200,"Ninad","Latur",bk2);
//        Student st3=new Student();

        studentRepo.save(st1);
        studentRepo.save(st2);



    }
}
