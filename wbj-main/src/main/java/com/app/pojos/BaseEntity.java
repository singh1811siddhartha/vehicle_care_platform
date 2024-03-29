package com.app.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*", maxAge = 3600)
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + "]";
	}

	public BaseEntity(Long id) {
		super();
		this.id = id;
	}

	public BaseEntity() {
		
	}
	
}

