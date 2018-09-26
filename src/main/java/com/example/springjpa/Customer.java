package com.example.springjpa;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']",id, firstName, lastName);
    }

}