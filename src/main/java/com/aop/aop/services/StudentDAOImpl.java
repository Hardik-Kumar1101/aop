package com.aop.aop.services;

import com.aop.aop.dao.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student addStudent(String fname, String sname) {
        System.out.println("Add student service method called");
        Student stud = new Student();
        stud.setFirstName(fname);
        stud.setSecondName(sname);
        if(fname.length()<=3)
            throw new RuntimeException("Length of firstname must be 4 or more" );
        return stud;
    }
}

