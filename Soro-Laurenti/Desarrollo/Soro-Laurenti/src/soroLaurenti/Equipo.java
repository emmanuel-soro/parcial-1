package soroLaurenti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.PrintWriter;
import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Equipo {

	private File entrada;
	private File salida;
	private Colaborador[] colaboradores;
	private int cantRespuestas;
	private List<Coincidencia> coincidencias;

	private static final String PATH_ENTRADA = "../../Preparacion de prueba/Lote de Prueba/Entrada/";
	private static final String PATH_SALIDA = "../../Ejecucion de prueba/Salida obtenida/";

	public Equipo(String entrada, String salida) throws FileNotFoundException {
		this.entrada = new File(PATH_ENTRADA + entrada);
		this.salida = new File(PATH_SALIDA + salida);

		this.coincidencias = new ArrayList<>();

		Scanner fileScanner = new Scanner(this.entrada);

		this.cantRespuestas = fileScanner.nextInt();
		this.colaboradores = new Colaborador[fileScanner.nextInt()];

		for (int i = 0; i < colaboradores.length; i++) {
			colaboradores[i] = new Colaborador(fileScanner.next());
		}
		fileScanner.close();
	}

	private void ordenarColaboradores() {

		List<Colaborador> list = Arrays.asList(colaboradores);

		list.sort(new Comparator<Colaborador>() {

			@Override
			public int compare(Colaborador o1, Colaborador o2) {
				return o1.getRespuestas().compareTo(o2.getRespuestas());
			}
		});

		this.colaboradores = (Colaborador[]) list.toArray();

	}

	public void resolver() {

		Colaborador colabActual = colaboradores[0];
		char[] respActual = colabActual.getRespuestas().toCharArray();
		Colaborador colabSiguiente;
		char[] respSiguiente;
		String coinRtaActual = "";
		int cantCoinActual = 1;
		int indiceRespuestaActual = 0;

		for (int i = 1; i < colaboradores.length; i++) {
			colabSiguiente = colaboradores[i];
			respSiguiente = colabSiguiente.getRespuestas().toCharArray();

			for (int j = indiceRespuestaActual; j < cantRespuestas; j++) {

				if (respActual[j] == respSiguiente[j]) {
					coinRtaActual += respActual[j];
				} else {
					// ver donde incrementar
					cantCoinActual++;
					indiceRespuestaActual = j;
					break;
				}
			}

			if (i + 1 != colaboradores.length) {
				Colaborador aux = colaboradores[i + 1];
				String auxChars = aux.getRespuestas().substring(0, respActual.length);

				if (auxChars.equals(coinRtaActual)) {
					cantCoinActual++;

				} else {
					coincidencias.add(new Coincidencia(coinRtaActual, cantCoinActual));
					coinRtaActual = "";
					cantCoinActual = 1;
					indiceRespuestaActual = 0;
				}
				colabActual = colabSiguiente;
				respActual = respSiguiente;
			}

		}

		this.coincidencias.sort(new Comparator<Coincidencia>() {

			@Override
			public int compare(Coincidencia o1, Coincidencia o2) {

				return o2.getCantidadColaboradoresCoicidentes() > o1.getCantidadColaboradoresCoicidentes() ? 1
						: o2.getCantidadColaboradoresCoicidentes() == o1.getCantidadColaboradoresCoicidentes() ? 0 : -1;

			}
		});
		
		
		Coincidencia coin=  this.coincidencias.get(0);
		
		try(FileWriter fw = new FileWriter(this.salida); PrintWriter pw = new PrintWriter(fw)) {
			
			pw.println((int)Math.pow(coin.getRespuestas().length(), 2) * coin.getCantidadColaboradoresCoicidentes());
			pw.println(coin.getRespuestas());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
