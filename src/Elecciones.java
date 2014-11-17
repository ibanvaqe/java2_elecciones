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

//Partido

	String nombre_partido ="Pokemon";
	String presidente_partido ="Ash";
	int n_miembros_partido = 1;
	
	String resultadopol1;
	String resultadopol2;
	int resultadopol3;


//CONSTRUCTORES DE LAS CLASES

	Habitante habitante = new Habitante("","","","",0,0);
	Inmueble inmueble = new Inmueble();
	EspacioPublico espaciopublico = new EspacioPublico();
	Ayuntamiento ayuntamiento = new Ayuntamiento();
	Partido partidoele = new Partido("","",0);


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
/*
	System.out.println("\n nombre: " + resultadohab[0]  + "\n primer apellido: " + resultadohab[1] + "\n segundo apellido: " + resultadohab[2]);
	System.out.println();
	

	*/
	//PARTIDO POLITICO
	
	partidoele.setNombre_par(nombre_partido);
    partidoele.setPresidente(presidente_partido);
    partidoele.setN_miembros(n_miembros_partido);
    
    resultadopol1=partidoele.getNombre_par();
    resultadopol2=partidoele.getPresidente();
    resultadopol3=partidoele.getN_miembros();
    
    
	
	//ARRAYLIST

	//ArrayList <String> listapartidos = new ArrayList <String> ();  
    FileReader fr = new FileReader("listadoPartidos.txt");
    BufferedReader br = new BufferedReader(fr); 

	
	String contenido;
	
	/*
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
	*/
	
	ArrayList <Partido> parti = new ArrayList <Partido> ();
	String col1="",  col2="";
	int col3=0;
	
	while((contenido = br.readLine()) != null)
	{
		StringTokenizer st = new StringTokenizer(contenido,",");
		 // counting tokens
      	//System.out.println("Total tokens : " + st.countTokens());
      
		while(st.hasMoreTokens())
		{
			//System.out.println(st.nextToken());
			for(int x=0;x<st.countTokens();x++)
			{
			String col = st.nextToken();
			//System.out.println(col);
			if(x==0)
			{
				col1=col;
				//System.out.println(var1);
			}
			else if(x==1)
			{
				col2=col;
				//System.out.println(var2);
			}
			else 
			{
				col3=Integer.parseInt(col);
			
				//System.out.println(col3);
				
			}
			}
		}

	parti.add(new Partido(col1,col2,col3));
		
	}
	
	for(int i=0; i<parti.size(); i++)
     {
            System.out.println("  nombre: "+parti.get(i).getNombre_par() +" presidente: "+parti.get(i).getPresidente()+" n_miembros: "+ parti.get(i).getN_miembros());
     }
            
        // Vaciar el ArrayList
        parti.clear();

		
		ArrayList <Habitante> habi = new ArrayList <Habitante> ();
		FileReader fr2 = new FileReader("censo.txt");
    	BufferedReader br2 = new BufferedReader(fr2); 
	
		 
		String hab1="", hab2="", hab3="", hab4="";
		int hab5=0, hab6=0;
		
		while((contenido = br2.readLine()) != null)
		{
		StringTokenizer st2 = new StringTokenizer(contenido);
			for(int y=0;y<6;y++)
			{
			String hab = st2.nextToken(",");
			//System.out.println(hab);
				if(y==0)
				{
					hab1=hab;
				}
				else if(y==1)
				{
					hab2=hab;
				}
				else if(y==2)
				{
					hab3=hab;
				}else if(y==3)
				{
					hab4=hab;
				}else if(y==4)
				{
					hab5=Integer.parseInt(hab);
					//System.out.println(hab5);
				}
				else
				{
					hab6=Integer.parseInt(hab);
					//System.out.println(hab6);
				}
			}
			if (hab5>17)
			{		
			habi.add(new Habitante(hab1,hab2,hab3,hab4,hab5,hab6));
			}
		}
	
		for(int i=0; i<habi.size(); i++)
	     {
	            System.out.println("  nombre: "+habi.get(i).getNombre() +" primer apellido: "+habi.get(i).getApellido1()+" segundo apellido: "+ habi.get(i).getApellido2()+" direccion: "+ habi.get(i).getDireccion()
	            +" edad: "+habi.get(i).getEdad()+" dni: "+habi.get(i).getDni());
	     }
	            
	        //Vaciar el ArrayList
	    	habi.clear();
		
				
  }

}
