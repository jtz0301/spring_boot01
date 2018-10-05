package com.boot.security.server2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.security.server.dao.UserDao;
import com.boot.security.server.model.SysUser;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	private UserDao userDao;

	@Test
	public void password() {
		String string = passwordEncoder.encode("admin");
		System.out.println(string);
		System.out.println(string.length());
	}
	
	
	
	@Test
	public void test() {
		List<SysUser> queryAll = userDao.queryAll();
		for (SysUser sysUser : queryAll) {
			System.out.println("===="+sysUser);
		}
	}
}
