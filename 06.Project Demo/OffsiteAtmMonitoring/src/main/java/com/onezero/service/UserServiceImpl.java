package com.onezero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onezero.dao.UserDao;
import com.onezero.model.User;

@Service
@Transactional(transactionManager="globalTransactionManager")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByName(String username) {

		if (username.startsWith("B")) {

			return userDao.getUserByName(username);

		}

		else {

			
			return userDao.getUserByName(username.substring(2).trim());

		}

	}

}
