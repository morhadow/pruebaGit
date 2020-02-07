
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] personas= new Persona[2];

		
		personas[0]= new Persona("Joselu", "Florenzi", "65897558A");
		personas[1]= new Alumno("Pedro", "Picapiedra", "95475445U", "Derecho", 5568);
		
		for(Persona e: personas) {
			 System.out.println(e.getDatos());

		}

	}

}
