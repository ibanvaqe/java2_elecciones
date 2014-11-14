public class Partido {

	String nombre_par;
	String presidente;
	int n_miembros;

	public Partido (String nombre_par, String presidente, int n_miembros) {

		this.nombre_par=nombre_par;
	    this.presidente=presidente;
	    this.n_miembros=n_miembros;
	}


    public void setNombre_par(String nombre_par)
    {
        this.nombre_par=nombre_par;
    }
 
     public void setPresidente(String presidente)
    {
        this.presidente=presidente;
    }
     public void setN_miembros(int n_miembros)
    {
        this.n_miembros=n_miembros;
    }
    
  	public String getNombre_par() 
 	{	
	return nombre_par;
 	}	
 	public int getN_miembros() 
 	{	
	return n_miembros;
 	}
  	public String getPresidente() 
 	{	
	return presidente;
 	}
 	
}