package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import model.Book;
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
			String genero = (String) principal.getComboBox().getSelectedItem();
			Book aux = graph.findMostPopularBookByGenre(genero);
			if (aux != null) {
				principal.updateLabelText(aux.toString());
			}else {
				principal.updateLabelText("No hay ejercicios para mostrar");
			}

		}

	}

	private ArrayList<Book> books = new ArrayList<>();
	public ArrayList<String> generes1 = new ArrayList<>(
			Arrays.asList("Ciencia ficción", "Fantasía", "Distopía", "Aventura", "Romance"));

	public ArrayList<String> generes2 = new ArrayList<>(
			Arrays.asList("Misterio", "Thriller", "Suspenso", "Policial", "Ciencia ficción"));

	public ArrayList<String> generes3 = new ArrayList<>(
			Arrays.asList("Romance", "Drama", "Comedia romántica", "Novela rosa", "Fantasía"));

	public ArrayList<String> generes4 = new ArrayList<>(
			Arrays.asList("Histórica", "Biografía", "Novela histórica", "Realismo mágico", "Aventura"));

	public ArrayList<String> generes5 = new ArrayList<>(
			Arrays.asList("Terror", "Suspenso psicológico", "Horror cósmico", "Gótico", "Distopía"));

	private void data() {
		Book book1;
		Book book2;
		Book book3;
		Book book4;
		Book book5;
		Book book6;
		Book book7;
		Book book8;
		Book book9;
		Book book10;
		graph.addBook(book1 = new Book("1984", generes1, "George Orwell", 9, 1));
		graph.addBook(book2 = new Book("Fahrenheit 451", generes2, "Ray Bradbury", 8, 2));
		graph.addBook(book3 = new Book("Dune", generes3, "Frank Herbert", 7, 3));
		graph.addBook(book4 = new Book("Cosmos", generes4, "Carl Sagan", 8, 4));
		graph.addBook(book5 = new Book("Sapiens: De animales a dioses", generes5, "Yuval Noah Harari", 9, 5));
		graph.addBook(book6 = new Book("El señor de los anillos", generes1, "J.R.R. Tolkien", 9, 6));
		graph.addBook(book7 = new Book("Steve Jobs", generes2, "Walter Isaacson", 7, 7));
		graph.addBook(book8 = new Book("El código Da Vinci", generes3, "Dan Brown", 8, 8));
		graph.addBook(book9 = new Book("Freakonomics", generes4, "Steven D. Levitt", 6, 9));
		graph.addBook(book10 = new Book("La isla del tesoro", generes5, "Robert Louis Stevenson", 7, 10));
		graph.addBook(new Book("Por quién doblan las campanas", generes1, "Ernest Hemingway", 9, 11));
		graph.addBook(new Book("Cien años de soledad", generes2, "Gabriel García Márquez", 8, 12));
		graph.addBook(new Book("Rayuela", generes3, "Julio Cortázar", 7, 13));
		graph.addBook(new Book("Don Quijote de la Mancha", generes4, "Miguel de Cervantes Saavedra", 8, 14));
		graph.addBook(new Book("El amor en los tiempos del cólera", generes5, "Gabriel García Márquez", 9, 15));
		graph.addBook(new Book("El Aleph", generes1, "Jorge Luis Borges", 8, 16));
		graph.addBook(new Book("La sombra del viento", generes2, "Carlos Ruiz Zafón", 7, 17));
		graph.addBook(new Book("Pedro Páramo", generes3, "Juan Rulfo", 8, 18));
		graph.addBook(new Book("Los detectives salvajes", generes4, "Roberto Bolaño", 9, 19));
		graph.addBook(new Book("Ficciones", generes5, "Jorge Luis Borges", 7, 20));

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
