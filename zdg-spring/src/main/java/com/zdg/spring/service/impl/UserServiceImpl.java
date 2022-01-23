package com.zdg.spring.service.impl;

import com.zdg.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author zdg
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void sayHi() {
		System.out.println("hi...");
	}
}
