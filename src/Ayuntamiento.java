
public class Ayuntamiento {

	String localidad , direccion , nom_alcalde;

	public Ayuntamiento (String localidad, String direccion, String nom_alcalde) {

		this.localidad=localidad;
		this.direccion=direccion;
		this.nom_alcalde=nom_alcalde;
	}
	public void setLocalidad(String localidad)
    {
        this.localidad=localidad;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public void setNom_alcalde(String nom_alcalde)
    {
        this.nom_alcalde=nom_alcalde;
    }

    public String getLocalidad() 
 	{	
	return.localidad;
 	}
 	public String getDireccion() 
 	{	
	return.direccion;
 	}
 	public String getNom_alcalde() 
 	{	
	return.nom_alcalde;
 	}
}
