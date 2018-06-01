package soroLaurenti;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Equipo equipo = new Equipo("caso00.in", "caso00.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso01.in", "caso01.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso02.in", "caso02.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso03.in", "caso03.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso04.in", "caso04.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso05.in", "caso05.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso06.in", "caso06.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso07.in", "caso07.out");
		equipo.resolver();
		
		 equipo = new Equipo("caso08.in", "caso08.out");
		equipo.resolver();
		
	}

}
