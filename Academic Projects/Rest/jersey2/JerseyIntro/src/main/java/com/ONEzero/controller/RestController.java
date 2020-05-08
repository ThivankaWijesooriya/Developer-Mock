package com.ONEzero.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.ONEzero.DAO.StudentDAO;
import com.ONEzero.DAO.StudentDAOImpl;
import com.ONEzero.model.Student;


@Path("/Student")
public class RestController {
	
		
	@Path("/Name")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName() {
		
		return "Hello Thivanka";
	}

	
	
	@Path("/AllStudents")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Student> getStudents(){
		
		StudentDAO stdao = new StudentDAOImpl();
		List<Student> stlist = stdao.getAllStudents();
		
		return stlist;
	}
	
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id")int id){
		
	   StudentDAO stdao = new StudentDAOImpl();
	   Student stobj = stdao.getStudent(id);
		
		return stobj;
	}
	
	@Path("/Create")
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes(MediaType.APPLICATION_JSON)
	public void createStudent(Student stobj){
		
		StudentDAO st = new StudentDAOImpl();
		st.createStudent(stobj);
	}
	
	
	@Path("/Update")
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(Student stobj) {
		
		StudentDAO st = new StudentDAOImpl();
		st.updateStudent(stobj);
		
	}
	
	@Path("/Delete/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes(MediaType.APPLICATION_JSON)
	public void DeleteStudent(@PathParam("id")int id) {
		
		StudentDAO st = new StudentDAOImpl();
		st.deleteStudent(id);
		
	}

}
