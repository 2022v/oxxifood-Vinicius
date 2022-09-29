package br.com.ifpe.oxxifoodVinicius.util.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
@EqualsAndHashCode(of = {"id"})
public class EntidadeNegocio implements Serializable{

	private static final long serialVersionUID = 1848098079296052528L;



	private Long id;
	private Boolean habilitado;
}
