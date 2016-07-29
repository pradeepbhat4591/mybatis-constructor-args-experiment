package com.pradeep.mybatis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pradeep.mybatis.dao.StudentDAO;
import com.pradeep.mybatis.model.Student;

public class TestApp {

	private static StudentDAO studentDAO;

	@BeforeClass
	public static void runBeforeClass() {
		studentDAO = new StudentDAO();
	}

	@AfterClass
	public static void runAfterClass() {
		studentDAO = null;
	}

	@Test
	public void testSelect() {

		List<Student> list = studentDAO.select();

		assertNotNull(list);
		assertEquals(1, list.size());

		for (Student student : list) {
			System.out.println(student.toString());
		}
	}

	@Test
	public void testSelectAnnotations() {

		List<Student> list = studentDAO.selectAnnotations();

		assertNotNull(list);
		assertEquals(1, list.size());

		for (Student student : list) {
			System.out.println(student.toString());
		}
	}

}
