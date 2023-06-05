package com.example.JPAManyToManyMapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaManyToManyMappingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	ProgrammerRepository programmerRepository;
	
	@Test
	public void addNew() {
		
		Programmer programmer=new Programmer();
		programmer.setName("Dnyan");
		programmer.setSal(232342);
		Project projects=new Project();
		projects.setName("WICKES");
		projects.setName("Sunrise");
		programmer.addProject(projects);
		
		programmerRepository.save(programmer);
		
	}

}
