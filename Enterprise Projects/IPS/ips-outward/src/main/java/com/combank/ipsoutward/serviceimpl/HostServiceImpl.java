package com.combank.ipsoutward.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.combank.ipsoutward.service.HostService;
import com.combank.ipsoutward.util.HostClientUtil;

public class HostServiceImpl implements HostService {

	@Autowired
	private HostClientUtil hostClientUtil;

	@Override
	public Object postToHost(Object dataSet) {
		return hostClientUtil.postToHost(dataSet);
	}

}
