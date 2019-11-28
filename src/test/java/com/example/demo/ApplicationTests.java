package com.example.demo;

/**
 * https://howtodoinjava.com/spring-boot2/testing/testing-support/
 * 
 * //@ExtendWith(SpringExtension.class)  // included in @WebFluxTest
	@WebFluxTest(controllers = EmployeeController.class)
	@Import(EmployeeService.class)
	public class EmployeeControllerTest 
	{
	    //
	}

	//mockning
	@ExtendWith(MockitoExtension.class)
	public class EmployeeControllerTest 
	{
	    //
	}
 */

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void testContextLoadsTest() {
	}

}
