package soroLaurenti;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Equipo equipo = null;

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
		
		equipo = new Equipo("pelado/caso10.in", "caso10.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso11.in", "caso11.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso12.in", "caso12.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso13.in", "caso13.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso14.in", "caso14.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso15.in", "caso15.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso16.in", "caso16.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso17.in", "caso17.out");
		equipo.resolver();

		equipo = new Equipo("pelado/caso18.in", "caso18.out");
		equipo.resolver();

	}

}
