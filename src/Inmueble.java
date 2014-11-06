public class Inmueble {

	String tipo , antiguedad , direccion;

	public Inmueble (String tipo, String antiguedad, String direccion) {

		this.tipo=tipo;
		this.antiguedad=antiguedad;
		this.direccion=direccion;
	}


    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public void setAntiguedad(String antiguedad)
    {
        this.antiguedad=antiguedad;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    
  	public String getTipo() 
 	{	
	return.tipo;
 	}	
 	public String getAntiguedad() 
 	{	
	return.antiguedad;
 	}
 	public String getDireccion() 
 	{	
	return.direccion;
 	}   
 
}
