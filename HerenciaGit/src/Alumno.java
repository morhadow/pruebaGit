
public class Alumno extends Persona {
private String carrera;
private int nia;
private String nombre, apellido, dni;

public Alumno(String nombre, String apellido, String dni, String carrera, int nia) {
	super(nombre,apellido,dni);
	this.carrera=carrera;
	this.nia=nia;
}

public String getdatosAlumno( ) {
	return " estudia " +carrera +" y su nia es " +nia;
}

public String getCarrera() {
	return carrera;
}

public void setCarrera(String carrera) {
	this.carrera = carrera;
}

public int getNia() {
	return nia;
}

public void setNia(int nia) {
	this.nia = nia;
}




}
