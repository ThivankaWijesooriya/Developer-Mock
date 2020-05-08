package com.onezero.model;



import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

public class File {
	
	@NotNull(message="Is required")
	private String message;
	

	@NotNull(message="Is required")
	private MultipartFile picture;

	@NotNull(message="Is required")
	private byte [] profilepic;

	
	public String getMessage() {
		return message;
	}
	
	public File() {};
	public File(byte[] pic) {
		
		this.profilepic = pic;
		
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public byte[] getProfilepic() {
		return profilepic;
	}

	public void setProfilepic(byte[] profilepic) {
		this.profilepic = profilepic;
	}

	public MultipartFile getPicture() {
		return picture;
	}

	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}



}
