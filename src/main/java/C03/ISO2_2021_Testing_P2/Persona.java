package C03.ISO2_2021_Testing_P2;

public class Persona {

	private int edad;
	private boolean enfermo;
	private boolean contactoInfectado10dias;
	private boolean sintomas;
	private boolean pasaporteCovid;
	private boolean profesionImprescindible;
	
	public Persona(int edad, boolean enfermo, boolean contactoInfectado10dias, boolean sintomas, boolean pasaporteCovid,boolean profesionImprescindible) {
		super();
		this.edad = edad;
		this.enfermo = enfermo;
		this.contactoInfectado10dias = contactoInfectado10dias;
		this.sintomas = sintomas;
		this.pasaporteCovid = pasaporteCovid;
		this.profesionImprescindible = profesionImprescindible;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}

	public boolean isContactoInfectado10dias() {
		return contactoInfectado10dias;
	}

	public void setContactoInfectado10dias(boolean contactoInfectado10dias) {
		this.contactoInfectado10dias = contactoInfectado10dias;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isPasaporteCovid() {
		return pasaporteCovid;
	}

	public void setPasaporteCovid(boolean pasaporteCovid) {
		this.pasaporteCovid = pasaporteCovid;
	}

	public boolean isProfesionImprescindible() {
		return profesionImprescindible;
	}

	public void setProfesionImprescindible(boolean profesionImprescindible) {
		this.profesionImprescindible = profesionImprescindible;
	}
	
	
}
