package com.aaiaaba.fileiostreams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -685879790579057578L; 
	
	int id;
	String name;
	double salary;
	transient int ssn;

	Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "id: " + this.id + " name: " + this.name + " salary: " + this.salary + " ssn: " + this.ssn;
	}

}
