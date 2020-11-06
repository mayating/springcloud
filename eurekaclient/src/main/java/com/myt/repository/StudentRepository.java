package com.myt.repository;

import com.myt.entity.Student;

import java.util.Collection;

/**
 * @program: springcloud
 * @description:
 * @author: Ma YaTing
 * @create: 2020-11-06 07:54
 */
public interface StudentRepository {

    //查询全部
    public Collection<Student> findAll();
    //根据id查询
    public Student findById(long id);
    //保存
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
