

public class Habitante {

	String  nombre, apellido1, apellido2, direccion;
	int  edad, dni;

	public Habitante (String nombre, String apellido1, String apellido2, String direccion, int edad, int dni) {

		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.direccion=direccion;
		this.edad=edad;
		this.dni=dni;
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
 	public String getDireccion() 
 	{	
	return this.direccion;
 	}
 	public int getEdad() 
 	{	
	return this.edad;
 	}
 	
 	public int getDni() 
 	{	
	return this.dni;
 	}
}