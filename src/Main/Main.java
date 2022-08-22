package Main;

import java.util.ArrayList;

import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.Profesor;

public class Main {

	public static void main(String[] args) { //METODO MAIN INSTANCIA EL PROGRAMA, LO EJECUTA
		
		int cant;
		
		
		//En el método main, vamos a hacer dos listas una de Estudiante y otra de
		//Profesor para conocer quiénes están presentes durante una reunión de estudios. (ABAJO)
		
		
		//EL ARRAYLIST  ES DE TIPO ESTUDIANTE
		//ArrayList<Estudiante>  listaEstudiantes = new ArrayList<>(); //ARRAYLIST DE LA CLASE ESTUDIANTES
		
		
		//ArrayList<Profesor> listaProfesores = new ArrayList<>(); //ARRAYLIST DE CLASE PROFESOR 
		//ARRAYLIST LISTA DE TIPO PROFESOR 

		//ARRAYLIST DE TIPO PROFESOR, EN CADA NUEVO ELEMENTO SE PONE UN NUEVO OBJETO DE ESE TIPO(PROFESOR EN ESE CASO)
		
		//ARRIBA HAY DOS LISTAS, UNA DE ESTUDIANTES Y PROFESORES 
		
		//A LA LISTA ESTUDIANTE LE ESTOY PASANDO UN OBJETO ESTUDIANTE QUE TIENE EN ESTE CASO 3 PARAMETROS, LE AGRREGAMOS UN NUEVO OBJETO, LE AGREGO UN NUEVO OBJETO
		//listaEstudiantes.add(new Estudiante("1", "Juan", true)); //ESTOS SON LOS PARAMETROS QUE RECIBE DE LA CLASE PADRE PERSONA
		//listaEstudiantes.add(new Estudiante("2", "Andrés", true));
		//listaEstudiantes.add(new Estudiante("3", "Juan", false));
		
		//CARGA PARA LA LISTA PROFESRORES 
		//listaProfesores.add(new Profesor("10", "Jose", true));
	
		
		//for(Profesor profesor : listaProfesores) { //ACA IMPRIME EL TO STRING, ESO MUESTRA TODOS LOS PARAMETROS DE LA CLASE PADRE 
		//	System.out.println(profesor.toString()); //FOR PARA RECORRERE IMPRIMIR LISTA DE PROFESORES 
				
		//	}
		
		//SI HUBIESE QUERIDO IMPRIMIR DIRECTO PROFESOR.TOSTRING  NO ME DEJA PORQUE NO ESTA INSTANCIADO, Profesor (clase) de objeto profesor
		
			//for(Estudiante estudiante : listaEstudiantes) {
			//	System.out.println(estudiante.toString()); // FOR PARA RECORRER E IMPRIMIR LISTA ESTUDIANTES 
				
		//	}
			
		
		ArrayList<Persona> lista = new ArrayList<>(); //GRACIAS POLOMORFISMO (SE IMPORTA DEL MODELO!!!) INSTACIA TRATADA COMO SUPER CLASE, ARRAYLIST DE LA SUPER CLASE. POLI:PROPIEDAD QUE VAMOS ADQUIRIENDO AL MONMENTO DE TRABAJAR CON LAS HERENCIAS 
		//CUANDO TENGO UN EXTENDS (HERENCIAS) PUEDO MOVER Y UTILIZAR MIS METODOS EN LAS OTRAS CLASES O SUPER CLASES 
		//el polimorfismo nos permite compartir los metodos entre clases, en este caso el to string 
		
		/* Esto es posible gracias al polimorfismo que dice que la instancia de una subclase
		(Estudiante y Profesor) puede ser tratada como si fuese una instancia de su superclase
		(Persona) durante la ejecución del programa. De esta forma es posible utilizar métodos que
		se compartan entre la superclase y la subclase, como lo es el método toString(). Pero si
		se utiliza un método que la instancia no tiene, arrojará una excepción de método no
		encontrado.*/
		
		//CARGA DE LISTA PERSONA CON ESTUDIANTES Y PROFESORES DE TIPO  ESTUDIANTE Y PROFESOR
		
		lista.add(new Estudiante("Juan", "189984578", true)); //CON EL NEW ESTUDIANTE
		lista.add(new Estudiante("Andres", "54548485", true));//CON EL NEW PROFESOR 
		lista.add(new Estudiante("Juan", "454448545", false)); //A ESTAS LISTAS LE PASAMOS  (INSTANCIAMOS) ESTUDANTES Y PROFESORES COMO ATRIBUTOS 
		lista.add(new Profesor("Jose","546546584", true));
	
		//for(Persona individuo : lista) {
		//System.out.println(individuo.toString()); //RECORRIDO E IMPRESION DE LISTA 
		//el tostring NOS TRAE LOS ATRIBUTOS DE CLASE PERSONA 
		// Recorrer la lista con un for-each, iterando con los objetos del tipo Persona e imprimimos en pantalla (ABAJO SE HACE)
                                                                                          

		//CASTEO DE CLASES (ABAJO) Nos va a devolver la clase a la que pertenece cada elemento (estudiante, estudinte, estudiante, profesor)
		
		//TRASFORMAR DE UN TIPO DE VARIABLE PRIMITIVO A OTRO U OTRA CLASE EN OTRO TIPO DE CLASE 
		//PERO SOLO SI ESTOS OBJETOS TIENEN RELACION POR MEDIO DE UNA HERENCIA 
		//NO SE PUEDEN CASTEAR ENTRE SUB CLASES 
		
		/*Basado en el ejercicio anterior, vamos a imprimir el nombre de las clases de cada instancia
		dentro de la lista utilizando getClass(), esto nos retornará un tipo de dato llamado class
		que sirve para comparar clases, entre otras cosas. Para esto, le agregaremos el método
		getSimpleName() el cual convierte el nombre de la clase a un String y lo usaremos para
		imprimir en pantalla. */
		 
		
		//PARA EL FOR EACH 
		//EN ESTUDIANTE NUESTRA VARIABLE ES ENTERO
		
		for(Persona individuo : lista) {
			System.out.println(individuo.getClass().getSimpleName());
			
			
			//get CLASS imprime la clase de cada instancia SI SOLO IMPRIMO ESTO ME MUESTRA EL PAQUETE EL MODELO Y LA CLASE 
			//get simplename lo convierte en String e imprime en pantalla CON ESTO ME IMPRIME SIMPLIFICADO (COMO SE VE EN CONSOLA)
			
			//FOR(PERSONA PERSONA : LISTA){
			//ESTUDIANTE ESTUDIANTE = (ESTUDIANTE) PERSONA;
			//SYSTEM.OUT.PRINTLN(PERSONA.GET.cLASS().GETsIMPLENAME());
			//System.OUT.PRINT(ESTUDIANTE.get.Edad());
			
			//el casteo no permite el casteo entre sub clases, en este ejemplo no puedo castear entre estudiante y profesor PERO SI ENTRE LA SUPER CLASE Y SUB CLASE 
			
		} 
		
		// LLAMAR UN METODO DE OTRA CLASE
		// CUANDO TRAIGO UN OBJETO DE OTRA CLASE PARA ACA LO ESTOY INSTANCIANDO
		cant = lista.size(); // UTILIZA LA LISTA COMPLETA CANTIDAD ES EL TOTAL DE LA LISTA

		Persona p = new Persona(); // NUEVA INSTANCIA DE PERSONA
		System.out.println(p.enteros(cant)); // IMPRIME 5 PORQUE EN PERSONA PUSIMOS X + 1 entonces en el main asignamos
												// tamaño de lista a cantidad para tener un int usado como variable
		// ARRIBA SE DECLARO ENTERO CANT
		// INSTANCIAMOS UNA P DE PERSONA, USAMOS ESA P PARA TRAER EK METODO, EN ESTE
		// CASO PERSONA PORQUE EL METODO ESTA EN PERSONA

		Estudiante e = new Estudiante();
		System.out.println(e.enteros(cant));//cantidad es el tamaño de la lista 
		
		
			
		}
			
	
		
	}

	
	



/* ABSTRACCION: SABER QUE SE DEBE HACER ALGO PERO NO NECESITO SABER EL CÓMO / MANERA DE GENERALIZAR EL PROBLEMA, PARA LUEGO SUBDIVIDIRLO 
 * TOMA LOS DATOS Y SOLO VEAMOS LOS RELEVANTES, MIRAR DESDE UNA MIRADA MACRO Y SOLO PRIORIZAR LO RELEVANTE
 * EJEMPLO: UN AUTO SE VE COMO AUTO Y NO COMO TODOS SUS COMPONENTES 
 * AYUDA A AGRUPAR Y CLASIFICAR OBJETOS EN JAVA
 * 
 * 
 * INTERFACES: INTERFACE EN VEZ DE CLASS 
 * 	Las interfaces se declaran utilizando la palabra reservada “interface” en lugar de “class” y
	proveen una lista de prototipos de métodos, lo que significa que solo se declara tipo de
	retorno, nombre y parámetros de entrada
 * LA INTERFASE LA CREAMOS 
 * 
 * 
 * 
 */
