package Capitulo14;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	Gato g1=new Gato("macho");
	Gato g2=new Gato("macho");
	
	try{
		Gato g3=g1.apareaCon(g2);
	}catch(ExcepcionMismoSexo ems) {
		System.out.println("Error");
	}
	}
}


class Gato{
	private String raza;
	private String Sexo;
	public Gato (String s, String r) {
	raza = r;
	Sexo=s;
	}
	public Gato(String s) {
	Sexo=s;
	raza = "siamés";
	}
	public Gato () {
	Sexo="hembra";
	raza = "siamés";
	}
	public String toString() {
	return super.toString()
	+ "Raza: " + this.raza
	+ "\n*************************\n";
	}
	/**
	* Hace que el gato maulle.
	*/
	public void maulla() {
	System.out.println("Miauuuu");
	}
	/**
	* Hace que el gato ronronee
	*/
	public void ronronea() {
	System.out.println("mrrrrrr");
	}
	/**
	* Hace que el gato coma.
	* A los gatos les gusta el pescado, si le damos otra comida
	* la rechazará.
	*
	* @param comida la comida que se le ofrece al gato
	*/
	public void come(String comida) {
	if (comida.equals("pescado")) {
	System.out.println("Hmmmm, gracias");
	} else {
	System.out.println("Lo siento, yo solo como pescado");
	}
	}
	public String getSexo() {
		return Sexo;
	}
	/**
	* Pone a pelear dos gatos.
	* Solo se van a pelear dos machos entre sí.
	*
	* @param contrincante es el gato contra el que pelear
	*/
	public void peleaCon(Gato contrincante) {
	if (this.getSexo() == "hembra") {
	System.out.println("no me gusta pelear");
	} else {
	if (contrincante.getSexo() == "hembra") {
	System.out.println("no peleo contra gatitas");
	} else {
	System.out.println("ven aquí que te vas a enterar");
	}
	}
	}
	public Gato apareaCon(Gato g) throws ExcepcionMismoSexo{
			if(g.Sexo.equals(this.Sexo)) {
				throw new ExcepcionMismoSexo();
			}
			return new Gato();
		
	}
}

class ExcepcionMismoSexo extends Exception{
	public ExcepcionMismoSexo(){
		System.out.println("ExcepcionMismoSexo: Un gato debe ser macho y otra hembra");
	}
}