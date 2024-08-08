package com.example.demospringgithubactions; 

import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 

import com.example.demospringgithubactions.controller.HelloWorld; 
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; 
import org.springframework.test.context.junit4.SpringRunner; 
import org.springframework.test.web.servlet.MockMvc; 

//@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorld.class) 
class DemoSpringgithubactionsApplicationTests { 

	@Autowired
	private MockMvc mockMvc; 

	@Test
	public void checkSuccessMessage() throws Exception 
	{ 
		this.mockMvc 
			.perform(get("/")) 
			.andExpect(status().isOk()) 
			.andExpect(content().string( 
				containsString("Yaay!! you did it XD"))); 
	} 
}
