
public class Ayuntamiento {

	String localidad , direccion , cargo;

	public Ayuntamiento (String localidad, String direccion, String cargo) {

		this.localidad=localidad;
		this.direccion=direccion;
		this.cargo=cargo;
	}
	public void setLocalidad(String localidad)
    {
        this.localidad=localidad;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public void setCargo(String cargo)
    {
        this.cargo=cargo;
    }

    public String getLocalidad() 
 	{	
	return.localidad;
 	}
 	public String getDireccion() 
 	{	
	return.direccion;
 	}
 	public String getCargo() 
 	{	
	return.cargo;
 	}
}
