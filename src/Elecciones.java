import java.util.*;

public class Elecciones {
public static void main (String[] args) {

	String nombre_hab = "Xuxo";

	Array [] resultado = new String [6];  

	Habitante habitante = new Habitante();

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce el nombre del habitante ");
	//nombre_hab = sc.next();

	habitante.setNombre(nombre_hab);

	resultado[0]=habitante.getNombre();

	System.out.print(resultado[0]);
}


}