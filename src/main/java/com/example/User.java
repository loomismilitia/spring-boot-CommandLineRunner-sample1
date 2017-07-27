package com.example;

import lombok.Getter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * User entity
 */
@Getter
@Entity
class User extends AbstractPersistable<Integer> {

	private String name;

	User() {
		//jpa thank you \m/
	}

	User(String name) {
		this.name = name;
	}
}
