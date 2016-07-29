package com.pradeep.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;

import com.pradeep.mybatis.model.Student;

public interface StudentMapper {
	
	@Select("SELECT ID,NAME,BRANCH,PERCENTAGE,PHONE,EMAIL from student ")
	@ConstructorArgs(value = {
	        @Arg(column="id",javaType=Integer.class),
	        @Arg(column="name",javaType=String.class),
	        @Arg(column="branch",javaType=String.class),
	        @Arg(column="percentage",javaType=Integer.class),
	        @Arg(column="phone",javaType=Integer.class),
	        @Arg(column="email",javaType=String.class)
	})
	public List<Student> getAllStudents();

}
