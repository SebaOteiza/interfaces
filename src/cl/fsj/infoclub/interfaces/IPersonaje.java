package cl.fsj.infoclub.interfaces;

public interface IPersonaje { // se declara interface no CLASS SE RECOMIENDA PONER UNA I antes del nombre PARA SABER QUE ES UNA INTERFACE 
	//PODEMOS COLOCAR PROTOTIPOS DE METODOS, SOLO SE DECLARA EL TIPO, RETORNO, NOMBRE Y PARAMETROS DE ENTRADA 
	// ASI LAS CLASES PUEDEN IMPLEMENTAR LAS INTERFACES 
	
	void immprimirHola(); //METODOS  
	
	int enteros(int x); //recibe en el parentesis un int x un entero x 
	//metodo entero que se llama enteros 
	//TIPO DE RETORNO, NOMNBRE Y PARAMETROS 
	//VAMOS A IMPLEMENTAR LA INTERFACE EN OTRA CLASE 
	

}

//LO QUE HACE ES TENER UNA LISTA DE LOS METODOS QUE VAMOS A OCUPAR EN NUESTRAS CLASES 
//EJEMPLO SI YO TUVIERA CLASE CLIENTE, CLASE CLIENTE VA A TENER CONTROLADORES QUE SON PARA GREGAR, ELIMINAR, ACTUALIZAR O GUARDAR CLIENTE,
//SI YO QUISIERA QUE TODAS LAS CLASES TUVIERAN ESOS METODOS, LOS METO EN UNA INTERFACE 
//EN ESTE EJEMPLO TIENE DOS METODOS IMPRIMIR HORA Y INT ENTEROS 
//DATOS ESCENCIALES DEL METODO LUEGO SE DETALLAN EN LAS DEMAS CLASES 