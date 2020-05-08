package com.ONEzero.DAO;


import com.ONEzero.model.Shift;

public interface ShiftDAO {
	
	
	public abstract void createShift(Shift shift);
	public abstract String getAllshifts();  
	public abstract String getShiftByid(String shiftname);
	public abstract void updateShiftById(Shift shift);
    public abstract void deleteShiftById(Shift shift);
  

}
