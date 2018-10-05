package com.boot.security.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.boot.security.server.dao.UserDao;
import com.boot.security.server.model.SysUser;


@SpringBootTest
@RunWith(SpringRunner.class)
/*@ComponentScan(basePackageClasses = {UserDao.class})*/
/*@MapperScan(basePackages = { "com.jz.dao","com.boot.security.server.*"})*/
public class UserTest {
	
	
	@Autowired
	private UserDao userDao;
	
	
	@Test
	public void test() {
		/*List<SysUser> queryAll = userDao.queryAll();
		for (SysUser user : queryAll) {
			System.out.println("user==="+user);
		}*/
		
		SysUser byId = userDao.getById(1l);
		System.out.println(byId);
	}
	

}
