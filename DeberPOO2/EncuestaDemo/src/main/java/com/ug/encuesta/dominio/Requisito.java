package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany; 

@Entity(name="requisitos")

public class Requisito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private int requisito_id;
private Double  subgrupo_id;
private String literal;
private String descripcion;
private Boolean tiene_sangria;
private Boolean es_calificable;
private Float peso_relativo;
@ManyToMany


public int getRequisito_id() {
	return requisito_id;
		
}
public void setRequisito_id(int requisito_id) {
	this.requisito_id = requisito_id;
}

public Double getSubgrupo_id() {
	return subgrupo_id;
}
public void setSubgrupo_id(Double subgrupo_id) {
	this.subgrupo_id = subgrupo_id;
}
public String getLiteral() {
	return literal;
}
public void setLiteral(String literal) {
	this.literal = literal;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Boolean getTiene_sangria() {
	return tiene_sangria;
}
public void setTiene_sangria(Boolean tiene_sangria) {
	this.tiene_sangria = tiene_sangria;
}
public Boolean getEs_calificable() {
	return es_calificable;
}
public void setEs_calificable(Boolean es_calificable) {
	this.es_calificable = es_calificable;
}
public Float getPeso_relativo() {
	return peso_relativo;
}
public void setPeso_relativo(Float peso_relativo) {
	this.peso_relativo = peso_relativo;
}




}
