public class Habitante {

	String nombre, apellido1, apellido2;
	int edad,codigopostal,dni;

	/*public Habitante (String nombre, String apellido1, String apellido2,int edad,int codigopostal,int dni) {

		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.edad=edad;
		this.codigopostal=codigopostal;
		this.dni=dni;
	}*/

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
 
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public void setCodigopostal(int codigopostal)
    {
        this.codigopostal=codigopostal;
    }
    public void setDni(int dni)
    {
        this.dni=dni;
    }  
 
 	public String getNombre() 
 	{	
	return this.nombre;
 	}

 	public String getApellido1() 
 	{	
	return this.apellido1;
 	}
 	public String getApellido2() 
 	{	
	return this.apellido2;
 	}
 	public int getEdad() 
 	{	
	return this.edad;
 	}
 	public int getCodigopostal() 
 	{	
	return this.codigopostal;
 	}
 	public int getDni() 
 	{	
	return this.dni;
 	}
}