package com.pradeep.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.pradeep.mybatis.mapper.StudentMapper;
import com.pradeep.mybatis.model.Student;

public class StudentDAO {
	
	
	public List<Student> select(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			List<Student> list = session.selectList("Student.selectStudent");
			return list;
		} finally {
			session.close();
		}
	}
	
	
	public List<Student> selectAnnotations(){
		
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();

		try {
			
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			List<Student> list = mapper.getAllStudents();
			
			return list;
		} finally {
			session.close();
		}
	}

}
