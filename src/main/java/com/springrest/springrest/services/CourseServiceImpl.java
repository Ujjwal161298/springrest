package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145,"java Course","This is java Course"));
		list.add(new Course(147,"sql Course","This is sql Course"));
		list.add(new Course(143,"springboot Course","This is springboot Course"));
		
		
	}

    
	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	
	}



