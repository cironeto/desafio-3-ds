package com.devsuperior.bds04.dto;

import java.io.Serializable;

import com.devsuperior.bds04.entities.City;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CityDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;

	@NotNull
	@NotBlank(message = "Campo requerido")
	private String name;
	
	public CityDto() {
	}

	public CityDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CityDto(City entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
