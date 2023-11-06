package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import model.Exercise;
import model.Graph;
import view.PrincipalWindow;

public class Manager implements ActionListener {

	Graph graph = new Graph();
	private PrincipalWindow principal;

	public Manager() {
		createGraph();
		principal = new PrincipalWindow(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comand = e.getActionCommand();
		if (comand.equals("Buscar")) {
			String muscularGroup = (String) principal.getComboBox().getSelectedItem();
			double bmi = 0.0; // Parte por añadir (peso (kg) / altura * altura (m))
			Exercise aux = graph.findMostRecommendedExerciseByMuscularGroup(muscularGroup, bmi);
			if (aux != null) {
				principal.updateLabelText(aux.toString());
			} else {
				principal.updateLabelText("No hay mas libros para recomendar");
			}

		}

	}

	private ArrayList<Exercise> ExcerciseList = new ArrayList<>();
	public ArrayList<String> armMuscles = new ArrayList<>(
			Arrays.asList("Biceps", "Tríceps", "Antebrazos"));

	public ArrayList<String> shoulderMuscles = new ArrayList<>(
			Arrays.asList("Deltoides"));

	public ArrayList<String> hindTrunkMuscles = new ArrayList<>(
			Arrays.asList("Trapecio", "Dorsal ancho"));

	public ArrayList<String> anteriorTrunkMuscles = new ArrayList<>(
			Arrays.asList("Pectorales", "Abdominales", "Oblicuos", "Serrato"));

	public ArrayList<String> hipMuscles = new ArrayList<>(
			Arrays.asList("Fascia lata", "Glúteos"));

	public ArrayList<String> thighMuscles = new ArrayList<>(
			Arrays.asList("Cuadriceps", "Aductor", "Isquiotibiales"));
	
	public ArrayList<String> legMuscles = new ArrayList<>(
			Arrays.asList("Gemelos", "Tibial anterior"));

	private void data() {

		graph.addExcercise(new Exercise("Curl de biceps con barra.", armMuscles, "3", 0.0, 0.0, 1));
		graph.addExcercise(new Exercise("Curl de biceps con mancuernas", armMuscles, "3", 0.0, 0.0, 2));
		graph.addExcercise(new Exercise("Curl de martillo", armMuscles, "4", 0.0, 0.0, 3));
		graph.addExcercise(new Exercise("Press de tríceps en polea alta", armMuscles, "3", 0.0, 0.0, 4));
		graph.addExcercise(new Exercise("Fondos en paralelas", armMuscles, "3", 0.0, 0.0, 5));
		graph.addExcercise(new Exercise("Extensión de triceps con mancuerna.", armMuscles, "3", 0.0, 0.0, 6));
		graph.addExcercise(new Exercise("Press de hombros (press militar)", shoulderMuscles, "3", 0.0, 0.0, 7));
		graph.addExcercise(new Exercise("Elevaciones laterales con mancuernas", shoulderMuscles, "3", 0.0, 0.0, 8));
		graph.addExcercise(new Exercise("Elevaciones frontales con mancuernas", shoulderMuscles, "3", 0.0, 0.0, 9));
		graph.addExcercise(new Exercise("Encogimientos de hombros con barra", hindTrunkMuscles, "3", 0.0, 0.0, 10));
		graph.addExcercise(new Exercise("Encogimientos de hombros con mancuernas", hindTrunkMuscles, "3", 0.0, 0.0, 11));
		graph.addExcercise(new Exercise("Dominadas o Pull-Ups", hindTrunkMuscles, "3", 0.0, 0.0, 12));
		graph.addExcercise(new Exercise("Pulldown en polea alta", hindTrunkMuscles, "3", 0.0, 0.0, 13));
		graph.addExcercise(new Exercise("Peso muerto", hindTrunkMuscles, "3", 0.0, 0.0, 14));
		graph.addExcercise(new Exercise("Press de banco (bench press)", anteriorTrunkMuscles, "3", 0.0, 0.0, 15));
		graph.addExcercise(new Exercise("Fondos en máquina de pecho", anteriorTrunkMuscles, "3", 0.0, 0.0, 16));
		graph.addExcercise(new Exercise("Aperturas con mancuernas", anteriorTrunkMuscles, "3", 0.0, 0.0, 17));
		graph.addExcercise(new Exercise("Crunch abdominal", anteriorTrunkMuscles, "3", 0.0, 0.0, 18));
		graph.addExcercise(new Exercise("Plancha abdominal", anteriorTrunkMuscles, "3", 0.0, 0.0, 19));
		graph.addExcercise(new Exercise("Elevación de piernas colgado", anteriorTrunkMuscles, "3", 0.0, 0.0, 20));
		graph.addExcercise(new Exercise("Push-ups con progresión de desplazamiento", anteriorTrunkMuscles, "3", 0, 0, 21));
		graph.addExcercise(new Exercise("Fondos declinados", anteriorTrunkMuscles, "3", 0, 0, 22));
		graph.addExcercise(new Exercise("Giros rusos", anteriorTrunkMuscles, "3", 0, 0, 23));
		graph.addExcercise(new Exercise("Flexiones laterales con pesas", anteriorTrunkMuscles, "3", 0, 0, 24));
		graph.addExcercise(new Exercise("Sentadillas (Sumo y Bárbaras)", hipMuscles, "3", 0, 0, 25));
		graph.addExcercise(new Exercise("Prensa de piernas", hipMuscles, "3", 0, 0, 26));
		graph.addExcercise(new Exercise("Hip Thrust (levantamiento de cadera)", hipMuscles, "3", 0, 0, 27));
		graph.addExcercise(new Exercise("Sentadillas (tradicional, frontal, hack)", thighMuscles, "3", 0, 0, 28));
		graph.addExcercise(new Exercise("Extensiones de cuádriceps en máquina", thighMuscles, "3", 0, 0, 29));
		graph.addExcercise(new Exercise("Zancadas", thighMuscles, "3", 0, 0, 30));
		graph.addExcercise(new Exercise("Aductores en máquina", thighMuscles, "3", 0, 0, 31));
		graph.addExcercise(new Exercise("Sentadillas sumo", thighMuscles, "3", 0, 0, 32));
		graph.addExcercise(new Exercise("Prensa de piernas cerrada", thighMuscles, "3", 0, 0, 33));
		graph.addExcercise(new Exercise("Curl de piernas tumbado", thighMuscles, "3", 0, 0, 34));
		graph.addExcercise(new Exercise("Peso muerto", thighMuscles, "3", 0, 0, 35));
		graph.addExcercise(new Exercise("Glute Ham Raise (ejercicio de máquina)", thighMuscles, "3", 0, 0, 36));
		graph.addExcercise(new Exercise("Elevaciones de talones en máquina", legMuscles, "3", 0, 0, 37));
		graph.addExcercise(new Exercise("Elevaciones de talones con mancuernas", legMuscles, "3", 0, 0, 38));
		graph.addExcercise(new Exercise("Saltos de tijera", legMuscles, "3", 0, 0, 39));
		graph.addExcercise(new Exercise("Elevación de talones sentado", legMuscles, "3", 0, 0, 40));
		



	}

	private void createGraph() {
		data();
		graph.addConexion();
	}

	public static void main(String[] args) {
		Manager go = new Manager();
		go.createGraph();

	}

}
