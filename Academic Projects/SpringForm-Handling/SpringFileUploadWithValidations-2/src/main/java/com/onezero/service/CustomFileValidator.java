package com.onezero.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;
import com.onezero.model.File;

@Component
public class CustomFileValidator implements Validator{
public static final String PNG_MIME_TYPE="image/png";
public static final long TEN_MB_IN_BYTES = 10485760;
	@Override
	public boolean supports(Class<?> clazz) {
		return File.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		File fileUploadModel = (File)target;
		MultipartFile picture = fileUploadModel.getPicture();
		if(picture.isEmpty()){
			errors.rejectValue("picture", "upload.file.required");
		}
		else if(!PNG_MIME_TYPE.equalsIgnoreCase(picture.getContentType())){
			errors.rejectValue("picture", "upload.invalid.file.type");
		}
		
		else if(picture.getSize() > TEN_MB_IN_BYTES){
			errors.rejectValue("picture", "upload.exceeded.file.size");
		}
		
	}
	


}
