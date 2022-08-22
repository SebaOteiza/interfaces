package Modelo;

public class Estudiante extends Persona {

	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CUANDO LA CLASE NO TIENE ATRIBUTOS Y DEBES EXTENDER DE OTRA CLASE, SE REALIZA = SOURCE, GENERATE CONSTRUCTOR FROM SUPERCLASS
	public Estudiante(String nombre, String rut, boolean presente) {
		super(nombre, rut, presente);
		// TODO Auto-generated constructor stub
	}

}
