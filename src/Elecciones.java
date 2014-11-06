import java.util.*;

public class Elecciones {
public static void main (String[] args) {

	String nombre_hab = "Iban";
	String apelli1_hab = "Vaquerizo";
	String apelli2_hab = "Juez";
	String direc_hab = "Calle San Jose 22";
	int edad_hab = "25";
	int dni_hab = "343435"
	String resultado;

	 

	Habitante habitante = new Habitante();

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce el nombre del habitante ");
	nombre_hab = sc.next();

	habitante.setNombre(nombre_hab);

	resultado=habitante.getNombre();

	System.out.println(resultado);
}


}