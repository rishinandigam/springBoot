package com.spbootprojects.mydairy.myapp.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;


    private  String name;
    private String description;
    private String designation;
    private String experience;
    private  String department;




    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", designation='" + designation + '\'' +
                ", experience='" + experience + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(long id, String name, String description,

                   String designation, String experience, String department) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.designation = designation;
        this.experience = experience;
        this.department = department;
    }
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



}
