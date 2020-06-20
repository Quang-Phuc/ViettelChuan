package edu.fa.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.fa.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:springmvc-servlet.xml" })
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	@Test
	public void testLogin(){
		User user = new User();
		user.setUserName("lamquangphuc1996");
		
		assertNotNull(userService.findOneUserByUserName("lamquangphuc1996"));
}
}
