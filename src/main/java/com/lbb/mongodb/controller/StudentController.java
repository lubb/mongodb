package com.lbb.mongodb.controller;

import java.util.List;

import com.lbb.mongodb.dao.StudentDao;
import com.lbb.mongodb.model.Student;
import com.lbb.mongodb.model.StudentScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mongo")
public class StudentController {

    @Autowired
    private StudentDao studentDao;



    /**
     * 向mongondb添加一个document对象
     */
    @RequestMapping("/add")
    public void add() {
        Student student=new Student();
        student.setName("hzb");
        student.setSex("man");
        student.setAge(31);
        student.setDes("hzb_father");
        StudentScore score=new StudentScore();
        score.setChinese("88");
        score.setEnglish("93");
        score.setDes("hzb_child");
        student.setStudentScore(score);

        Student student1=new Student();
        student1.setName("xiaweihu");
        student1.setSex("man");
        student1.setAge(31);
        student1.setDes("xiaweihu_father");
        StudentScore score1=new StudentScore();
        score1.setChinese("66");
        score1.setEnglish("54");
        score1.setDes("xiaweihu_child");
        student1.setStudentScore(score1);

        Student student2=new Student();
        student2.setName("hzb");
        student2.setSex("man");
        student2.setAge(31);
        student2.setDes("hzb_father");
        StudentScore score2=new StudentScore();
        score2.setChinese("77");
        score2.setEnglish("99");
        score2.setDes("hzb_child2");
        student2.setStudentScore(score2);
        studentDao.save(student);
        studentDao.save(student1);
        studentDao.save(student2);
    }
}
