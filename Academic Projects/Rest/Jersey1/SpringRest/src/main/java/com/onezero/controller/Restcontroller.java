package com.onezero.controller;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onezero.DAO.CustomerDAO;
import com.onezero.DAO.EmployeeDAO;
import com.onezero.modal.Customer;
import com.onezero.modal.Employee;


@Path("/xml")
public class Restcontroller {

	/*ArrayList<Employee> emlist = new ArrayList<Employee>();*/
/*	EmployeeDAO employee123 = new EmployeeDAO();*/
	
	@GET
	@Path("/EmployeeXML")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Employee> showemployee() {
		

		return new EmployeeDAO().getList();
		
	
	}
	
	@GET
	@Path("/EmployeeXML/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee employee(@PathParam("id")int id) {
		

		return new EmployeeDAO().getEmployee(id);
	
	}
	
   @POST
   @Path("/EmployeeXML/POST")
   @Consumes(MediaType.APPLICATION_XML)
   @Produces(MediaType.APPLICATION_XML)
	public Employee ADDemployee(Employee employeeobj) {
		
	   return new EmployeeDAO().SetEmployee(employeeobj);
	   
		
	
	}
   
   
   @GET
   @Path("/customer/getALL")
   @Produces(MediaType.APPLICATION_XML)
   public ArrayList<Customer> getALLCustomers(){
	   
	   return new CustomerDAO().getALLCustomer();
   }
   
   @GET
   @Path("/customer/{customerid}")
   @Produces(MediaType.APPLICATION_XML)
   public Customer getCustomer(@PathParam("customerid") int id)
  {
	   
	   
	   return new CustomerDAO().getCustomer(id);
   }
   
   @POST
   @Path("/customer/addcustomer")
   @Produces(MediaType.APPLICATION_XML)
   public Customer createCustomer(Customer newcustomer)
  {
	   
	   
	   return new CustomerDAO().createCustomer(newcustomer);
   } 
   
   @PUT
   @Path("/customer/updatecustomer")
   @Produces(MediaType.APPLICATION_XML)
   public Customer updateCustomer(Customer updatedcustomer)
   {
 	   
 	   
 	   return new CustomerDAO().updateCustomer(updatedcustomer);
    } 
   
   
   @DELETE
   @Path("/customer/deletecustomer/{customerid}")
   @Produces(MediaType.APPLICATION_XML)
   public void deleteCustomer(@PathParam("customerid")int id)
   {
	   CustomerDAO object = new  CustomerDAO();
	   object.deleteCustomer(id);
 	  
    } 

}