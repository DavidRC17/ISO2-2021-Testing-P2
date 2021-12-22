package C03.ISO2_2021_Testing_P2;
import C03.ISO2_2021_Testing_P2.Persona;
public class main {

	public static void main(String[] args) {
		
	}
	
	
	public static boolean puedeViajar(Persona persona, Pandemia pandemia, int numPlazas) {
		boolean puedeViajar = false;
		
		
		if(persona.isEnfermo() || persona.isContactoInfectado10dias() || persona.isSintomas()) {
			puedeViajar = false;
			
		}else if(persona.isPasaporteCovid() && !persona.isEnfermo() && numPlazas>=1) {
			puedeViajar = true;
			
		}else {
			if(pandemia.getNivel() == 0 && numPlazas>=1) {
				puedeViajar = true;
			}
			
			if(pandemia.getNivel() == 2 && persona.isProfesionImprescindible() && numPlazas>=1) {
				puedeViajar = true;
			}
			
			else if(pandemia.getNivel() == 2 && !persona.isProfesionImprescindible() && numPlazas*0.40 >= 1) {
				puedeViajar = true;
			}
			
			if(pandemia.getNivel() == 3 && persona.isProfesionImprescindible() && numPlazas>=1) {
				puedeViajar = true;
			}
			
			else if(pandemia.getNivel() == 3 && !persona.isProfesionImprescindible() && numPlazas*0.20 >= 1) {
				puedeViajar = true;
			}
			
			
			if(pandemia.getNivel() == 4 && persona.isProfesionImprescindible() && numPlazas>=1) {
				puedeViajar = true;
			}
			
			else if(pandemia.getNivel() == 4 && !persona.isProfesionImprescindible() && numPlazas*0.10 >= 1) {
				puedeViajar = true;
			}
			
			if(pandemia.getNivel() == 4 && persona.getEdad() > 65) {
				puedeViajar = false;
			}
			
			if(puedeViajar == true) {
				numPlazas = numPlazas - 1;
			}
				
		}

		return puedeViajar;
	}
	
	public static double calcularPrecio(int precioBase, Persona persona, Pandemia pandemia, int numPlazas) {
		double precio = precioBase;
		if(puedeViajar(persona, pandemia, numPlazas)) {
			if(pandemia.getNivel() == 0 && persona.getEdad() < 23) {
	
				precio = precioBase * 0.60;
			}	
				
			if(pandemia.getNivel() == 0 && persona.getEdad() > 65) {
				
				precio = precioBase * 0.80;
					
			}
			
			if(pandemia.getNivel() == 1 && persona.getEdad() < 23) {
				
				precio = precioBase * 0.30;
			}	
				
			if(pandemia.getNivel() == 1 && persona.getEdad() > 65) {
				
				precio = precioBase * 0.50;
					
			}
			
			if(pandemia.getNivel() == 2 && persona.getEdad() < 23) {
				
				precio = precioBase ;
			}	
				
			if(pandemia.getNivel() == 2 && persona.getEdad() > 65) {
				
				precio = precioBase * 1.20;
					
			}
			
			if(pandemia.getNivel() == 3 && persona.getEdad() < 23) {
				
				precio = precioBase * 1.20;
			}	
				
			if(pandemia.getNivel() == 3 && persona.getEdad() > 65) {
				
				precio = precioBase * 1.50;
					
			}
			
			if(pandemia.getNivel() == 4 && persona.getEdad() < 23) {
				
				precio = precioBase * 1.50;				
		
			}
			
		}
		return precio;
	}
	
	public static int  calcularNivelPandemia(Pandemia pandemia, int numPlazas) {
		int nivel = -1;
		if(pandemia.getIACastillaLaMancha() < 100) {
			pandemia.setNivel(0);
			pandemia.setAforo(100);
			nivel = 0;
		}
		if(pandemia.getIACastillaLaMancha() >=100 && pandemia.getIACastillaLaMancha() <=200) {
			pandemia.setNivel(1);
			pandemia.setAforo(80);
			numPlazas = (int) (numPlazas * 0.80);
			nivel = 1;
		}
		if(pandemia.getIACastillaLaMancha() >=201 && pandemia.getIACastillaLaMancha() <=300) {
			pandemia.setNivel(2);
			pandemia.setAforo(60);
			numPlazas = (int) (numPlazas * 0.60);
			nivel = 2;
		}
		if(pandemia.getIACastillaLaMancha() >=301 && pandemia.getIACastillaLaMancha() <=500) {
			pandemia.setNivel(3);
			pandemia.setAforo(40);
			numPlazas = (int) (numPlazas * 0.40);
			nivel = 3;
		}
		if(pandemia.getIACastillaLaMancha() >=501) {
			pandemia.setNivel(4);
			pandemia.setAforo(30);
			numPlazas = (int) (numPlazas * 0.30);
			nivel = 4;
		}
		
		return nivel;	
	}
	
	
	
	
	
	

}
