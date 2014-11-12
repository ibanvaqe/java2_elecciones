import java.util.*;
import java.io.*;


public class Elecciones {
	public static void main (String[] args)  throws IOException  {


//Habitante
	String nombre_hab = "Iban";
	String apelli1_hab = "Vaquerizo";
	String apelli2_hab = "Juez";
	String direc_hab = "Calle San Jose 22";
	int edad_hab = 25;
	int dni_hab = 343435;

	String[] resultadohab = new String[4];
	int[] resultadonum1 = new int[3];
	
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
	resultadohab[3]=habitante.getDireccion();

	System.out.println("\n nombre: " + resultadohab[0]  + "\n primer apellido: " + resultadohab[1] + "\n segundo apellido: " + resultadohab[2]);
	System.out.println();
	
	Scanner sc = new Scanner(System.in);
		System.out.println("\n Que quieres hacer: (E) Editar , (L) Leer o (S) Salir;
	
	//PARTIDO POLITICO
	
	//ARRAYLIST
	ArrayList <String> listapartidos = new ArrayList <String> ();  
    FileReader fr = new FileReader("listadoPartidos.txt");
    BufferedReader br = new BufferedReader(fr); 

	
	String contenido;
	
	while ((contenido = br.readLine()) != null)
		{
		
		listapartidos.add(contenido);
		  //System.out.println(s);
			
		}
	//muestra con un for la lista de partidos
	for(int i=0; i<listapartidos.size(); i++)
		{
			System.out.println("    " + listapartidos.get(i));
		}
	
	        // Vaciar el ArrayList
	listapartidos.clear();

	
	}


}