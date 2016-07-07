package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="subgrupos")

public class Subgrupo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	

 private int subgrupo_id;
 private  String literal;
 private String descripcion;
 
private  int requisito_id;
 
 
 
 
public int getRequisito_id() {
	return requisito_id;
}
public void setRequisito_id(int requisito_id) {
	this.requisito_id = requisito_id;
}


public int getSubgrupo_id() {
	return subgrupo_id;
}
public void setSubgrupo_id(int subgrupo_id) {
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
 
 
 
}
