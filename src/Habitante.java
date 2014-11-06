public class Habitante {

	String nombre, apellido1, apellido2, direccion;
	int edad, codigopostal;

	public Habitante (String nombre, String apellido1, String apellido2, String direccion,Int edad,Int codigopostal) {

		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.direccion=direccion;
		this.edad=edad;
		this.codigopostal=codigopostal;
	}

	public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setApellido1(String apellido1)
    {
        this.apellido1=apellido1;
    }
    public void setApellido2(String apellido2)
    {
        this.apellido2=apellido2;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }

    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public void setCodigopostal(int codigopostal)
    {
        this.codigopostal=codigopostal;
    } 
 
 	public String getNombre() 
 	{	
	return.nombre;
 	}

 	public String getApellido1() 
 	{	
	return.apellido1;
 	}
 	public String getApellido2() 
 	{	
	return.apellido2;
 	}
 	public String getDireccion() 
 	{	
	return.direccion;
 	}
 	public int getEdad() 
 	{	
	return.edad;
 	}
 	public int getCodigopostal() 
 	{	
	return.codigopostal;
 	}
}