public class Partido {

	String nombre_par;
	int n_miembros;

	/*public Partido (String nombre_par,int n_miembros) {

		this.nombre_par=nombre_par;
		this.n_miembros=n_miembros;
	
	}*/


    public void setNombre_par(String nombre_par)
    {
        this.nombre_par=nombre_par;
    }
    public void setN_miembros(int n_miembros)
    {
        this.n_miembros=n_miembros;
    }
  
    
  	public String getNombre_par() 
 	{	
	return this.nombre_par;
 	}	
 	public int getN_miembros() 
 	{	
	return this.n_miembros;
 	}
}