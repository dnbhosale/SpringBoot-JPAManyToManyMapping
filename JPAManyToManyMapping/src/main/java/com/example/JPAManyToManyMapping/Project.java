package com.example.JPAManyToManyMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
    @ManyToMany(mappedBy = "projects")
    private Set<Programmer> programmers = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Programmer> getProgrammers() {
		return programmers;
	}
	public void setProgrammers(Set<Programmer> programmers) {
		this.programmers = programmers;
	}
	
	 public void addProgrammer(Programmer programmer) {
	        programmers.add(programmer);
	        programmer.getProjects().add(this);
	    }

	    public void removeProgrammer(Programmer programmer) {
	        programmers.remove(programmer);
	        programmer.getProjects().remove(this);
	    }
}
