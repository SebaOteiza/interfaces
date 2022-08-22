package Modelo;

import cl.fsj.infoclub.interfaces.IPersonaje;

public class Persona implements IPersonaje { // LE IMPLEMENTE IPERSONAJE, AL HACER ESTO ME DIRA QUE TENGO UN ERROR PORQUE DEBO IMPLEMENTAR LOS DOS METODOS QUE CREE EN IINTERFACE
	
	//COMO LO HAGO PARA CAMBIAR UNA VARIABLE SI DESPUES ME DOY CUENTA QUE ME EQUIVOQUE: ME PONGO SOBRE LA PALABRA A CAMBIAR, CLIC DERECHO, REFACTOR Y RENAME
	
	 String nombre;
	 String rut;
	 boolean presente;
	
	 // CONSTRUCTOR VACIO
	public Persona() {
		super();
	}

	
	//CONSTRUCTOR LLENO 
	public Persona(String nombre, String rut, boolean presente) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.presente = presente;
	}

		//GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	//TO STRING 
	//el arrobaoverride sobre carga el metodo persona, el TOSTRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", presente=" + presente + "]";
	}

	
	//DE AQUI PA ABAJO TRABAJO LOS METODOS DE LA CLASE PERSONA 
	//ESTOS DOS METODOS ABAJO VIENEN DE INTERFACE 
	
	
	//METODOS IMPORTADOS DE CLASE INTERFACES 
	@Override
	public void immprimirHola() {
		System.out.println("Hola mundo"); 
		
	}

	@Override
	public int enteros(int x) {
	
		int total =0;
		total = x + 1;
		return total;
	}
	
	
	
}