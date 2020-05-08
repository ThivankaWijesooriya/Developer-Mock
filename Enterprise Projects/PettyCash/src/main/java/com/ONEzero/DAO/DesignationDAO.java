package com.ONEzero.DAO;


import com.ONEzero.model.Designation;

public interface DesignationDAO {
	
	public abstract void createDesignation(Designation designation);
	public abstract String getAllDesignation();
	public abstract String getDesignationToEmployeeMast();
	public abstract void updateDesignationById(Designation designation);
    public abstract void deleteDesignationById(Designation designation);
    public abstract String getDesignationByName(String Designame);

}
