package com.userapp.service;

import com.userapp.exception.WrongUsernameException;

public class UserServiceImpl implements IUserService{
	public void validateUsername(String username)  {
		if (username.equals ("Kiruthigaa")) {
			System.out.println("Welcome "+username);
		}
		else{
		//throw new WrongUsernameException("Username is wrong");
		}
	}

	public void checkPassword(String password) {
		int length=password.length();
		if(length<5) {
			System.out.println("Password is too short");
			}
			else if(length>15) {
				System.out.println("Password is too long");
			}
			else {
				System.out.println("Perfect password");
			}
		}
		
		
	}
		
	
		
