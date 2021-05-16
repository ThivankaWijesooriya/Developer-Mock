package com.synapsys.gp.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;

public class CachedBodyServletInputStream extends ServletInputStream {

	private InputStream cachedBodyInputStream;

    public CachedBodyServletInputStream(byte[] cachedBody) {
    	if(cachedBody != null && cachedBody.length > 0) {
    		this.cachedBodyInputStream = new ByteArrayInputStream(cachedBody);
    	} 
    }

	@Override
	public boolean isFinished() {
		try {
			return cachedBodyInputStream.available() == 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isReady() {
		if(cachedBodyInputStream != null) {
			return true;
		}			
		return false;
	}

	@Override
	public void setReadListener(ReadListener listener) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public int read() throws IOException {
		if(cachedBodyInputStream != null) {
		  return cachedBodyInputStream.read();
		}
		return 0;
	}
	
}
