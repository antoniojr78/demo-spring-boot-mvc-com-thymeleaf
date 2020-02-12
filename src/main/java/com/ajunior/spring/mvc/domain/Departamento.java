package com.ajunior.spring.mvc.domain;

import java.util.List;

import javax.persistence.*; // import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	// OBS.: The Id will be inherited through AbstractEntity
	
	/* or just @Column(nullable = false, unique = true, length = 60)
	 because in this case the column name is the same as the attribute name */
	@NotBlank(message = "O Nome do Departamento é obrigatório. ")
	@Size(min = 3, max = 60, message = "O Nome do Departamento deve ter entre {min} e {max} caracteres. ")
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
}
