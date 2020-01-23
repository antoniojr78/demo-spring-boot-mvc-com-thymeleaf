package com.ajunior.spring.mvc.domain;

import javax.persistence.*; // import javax.persistence.Entity;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	// OBS.: The Id will be inherited through AbstractEntity
	
	/* or just @Column(nullable = false, unique = true, length = 60)
	 because in this case the column name is the same as the attribute name */
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
