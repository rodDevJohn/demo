package com.example.demo.procedureModel;

public class Parametro {
	
	
	private String atributo;
	private String original;
	private String nuevo;
	
	public Parametro () {}
	
	
	
	public Parametro(String atributo, String original, String nuevo) {
		super();
		this.atributo = atributo;
		this.original = original;
		this.nuevo = nuevo;
	}



	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getNuevo() {
		return nuevo;
	}

	public void setNuevo(String nuevo) {
		this.nuevo = nuevo;
	};
	
	
	
}
