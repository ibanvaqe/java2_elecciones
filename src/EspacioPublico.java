public class EspacioPublico {

	String nombre, tipo, localidad;

	/*public EspacioPublico (String nombre, String tipo, String localidad) {

		this.nombre=nombre;
		this.tipo=tipo;
		this.localidad=localidad;
	}*/

	public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    
 	public String getNombre() 
 	{	
	return this.nombre;
 	}
 	public String getTipo() 
 	{	
	return this.tipo;
 	}
 	public String getLocalidad() 
 	{	
	return this.localidad;
 	}
}