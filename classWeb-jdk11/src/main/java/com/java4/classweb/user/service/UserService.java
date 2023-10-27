package com.java4.classweb.user.service;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java4.classweb.user.dao.UserDAO;
import com.java4.classweb.user.domain.User;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	public void add(User user) {
		System.out.println(cryptoPassword(user.getPassword(), "SHA-512"));
		user.setPassword(cryptoPassword(user.getPassword(), "SHA-256"));
		userDAO.add(user);
		System.out.println(user);
	}
	
	public User login(User user) {
		User tempUser = userDAO.get(user.getUserId());
		if(tempUser != null && tempUser.getPassword().equals(
				cryptoPassword(user.getPassword(), "SHA-256"))
				) {
			return tempUser;
		} else return null;
	}
	
	// 21cde4d988f56671f11783fe57bd25ceb073a30e2061e4c242f928588f243dedd9bb1053ea9deb45e60faeaa1eb104f833a11454d281569c479159cb9defa780
	private String cryptoPassword(String password, String method) {
		try {
			MessageDigest md = MessageDigest.getInstance(method);
			md.update(password.getBytes());
			byte[] sha256Hash = md.digest();
			StringBuilder sb = new StringBuilder();
			for(byte b : sha256Hash) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
