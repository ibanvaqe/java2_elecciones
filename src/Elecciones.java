import java.util.*;
import java.io.*;


public class Elecciones {
	public static void main (String[] args) {


//Habitante
	String nombre_hab = "Iban";
	String apelli1_hab = "Vaquerizo";
	String apelli2_hab = "Juez";
	String direc_hab = "Calle San Jose 22";
	int edad_hab = 25;
	int dni_hab = 343435;

	String[] resultadohab = new String[4]
	int[] resultadonum1 = new int[3]
	
//Inmueble

	String tipo_in = "casa";
	String antiguedad_in = "22/09/1999"; 
	String direccion = "larretxe 2";
	
//EspacioPublico

	String nombre_es = "larretxe";
	String tipo_es = "calle";
	String localidad_es = "Zarautz";
	
//Ayuntamiento

	String localidad_ayu = "Zarautz";
	String direccion_ayu = "Iribar";
	String nom_alcalde = "Pepe";

//Partido

	String nombre_par = "ADO";
	int n_miembros = 34; 


//CONSTRUCTORES DE LAS CLASES

	Habitante habitante = new Habitante();
	Inmueble inmueble = new Inmueble();
	EspacioPublico espaciopublico = new EspacioPublico();
	Ayuntamiento ayuntamiento = new Ayuntamiento();
	Partido partido = new Partido();
	
//Valores de la clase Habitante	
	habitante.setNombre(nombre_hab);
	habitante.setApellido1(apelli1_hab);
	habitante.setApellido2(apelli2_hab);
	habitante.setDireccion(direc_hab);
	habitante.setEdad(edad_hab);
	habitante.setDni(dni_hab);

	resultadohab[0]=habitante.getNombre();
	resultadohab[1]=habitante.getApellido1();
	resultadohab[2]=habitante.getApellido2();
	resultadonum1[3]=habitante.getDireccion();

	System.out.println("\n nombre:" resultado[0]  + "\n primer apellido" resultado[1] + "\n segundo apellido:" resultado[2]);
	
	
	
	
	//ARRAYLIST
	
	BufferedReader fr = new BufferedReader ( new Filereader("/home/zubiri/ProyectosJava/java2_elecciones/src/listadoPartidos.txt"));
	
	ArrayList<Integer> listapartidos = new ArrayList<Integer>();  
	
	String contenido;
	
	while ((contenido = fr.readLine()) = !null)
		{
		
		listapartidos.add(contenido);
		  //System.out.println(s);
			
		}
	//muestra con un for la lista de partidos
	for(int i=0; i<listapartidos.size(); i++)
		{
			System.out.println("    "+listapartidos.get(i));
		}
	
	        // Vaciar el ArrayList
	lista_partidos.clear();
}


}