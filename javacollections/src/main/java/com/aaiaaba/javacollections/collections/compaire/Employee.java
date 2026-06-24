package com.aaiaaba.javacollections.collections.compaire;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

    @Override
    public String toString() {
        return "id : "+this.id+" and name : "+this.name;
    }
	@Override
	public int compareTo(Employee o) {

		int id1 = this.name.length();
		int id2 = o.name.length();

        if (id1 > id2) {
            return +1;
        } else if (id1 > id2) {
            return -1;
        } else {
            return 0;
        }

	}

}
