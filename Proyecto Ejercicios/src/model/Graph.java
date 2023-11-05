package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private List<Book> books;
    private List<Map<Book, Integer>> adyacencia;
    private ArrayList<Book> recommendedBooks = new ArrayList<Book>();

    /* es una lista de mapas. Cada mapa representa las conexiones entre un libro y
    sus libros adyacentes.La clave del mapa es un libro adyacente y el valor 
    es un entero que representa el peso de la conexión.*/
    public List<Book> getRecommendedBooks() {
        return recommendedBooks;
    }

    public Graph() {
        books = new ArrayList<>();
        adyacencia = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        adyacencia.add(new HashMap<>());// Se agrega una lista vacía para las conexiones del nuevo libro

    }

    // Método para agregar una arista (conexión entre libros con géneros en común)
    public void addConexion() {
        boolean foundConnection = true; // Variable para controlar el bucle while

        while (foundConnection) { // Bucle principal
            foundConnection = false; // Reinicia la variable foundConnection a false

            // Bucle para recorrer los libros en la lista
            for (int i = 0; i < books.size(); i++) {
                Book book1 = books.get(i); // Obtiene el libro en la posición i

                // Bucle para comparar book1 con los libros restantes en la lista
                for (int j = i + 1; j < books.size(); j++) {
                    Book book2 = books.get(j); // Obtiene el libro en la posición j

                    // Bucle para recorrer los géneros del libro1
                    for (int k = 0; k < book1.getGeneres_book().size(); k++) {
                        String genreBook1 = book1.getGeneres_book().get(k); // Obtiene el género en la posición k del libro1

                        // Bucle para recorrer los géneros del libro2
                        for (int l = 0; l < book2.getGeneres_book().size(); l++) {
                            String genreBook2 = book2.getGeneres_book().get(l); // Obtiene el género en la posición l del libro2

                            // Verifica si los géneros son iguales
                            if (genreBook1.equals(genreBook2)) {
                                // Obtiene las conexiones existentes para book1 y book2
                                Map<Book, Integer> book1Connections = adyacencia.get(i);
                                Map<Book, Integer> book2Connections = adyacencia.get(j);

                                // Verifica si book1 y book2 aún no están conectados
                                if (!book1Connections.containsKey(book2) && !book2Connections.containsKey(book1)) {
                                    // Calcula el peso de la conexión como la suma de la popularidad de ambos libros
                                    int weight = book1.getPopularity() + book2.getPopularity();

                                    // Agrega la conexión en ambos sentidos
                                    book1Connections.put(book2, weight);
                                    book2Connections.put(book1, weight);

                                    foundConnection = true; // Actualiza foundConnection a true para continuar el bucle
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Book findMostPopularBookByGenre(String genre) {
        Book mostPopularBook = null; // Variable para almacenar el libro más popular
        int maxPopularity = Integer.MIN_VALUE; // Variable para almacenar la popularidad máxima encontrada

        // Bucle para recorrer los libros en la lista
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i); // Obtiene el libro en la posición i

            // Verifica si el libro tiene el género buscado y no está en la lista de libros recomendados
            if (book.getGeneres_book().contains(genre) && !recommendedBooks.contains(book)) {
                Map<Book, Integer> connections = adyacencia.get(i); // Obtiene las conexiones del libro

                // Bucle para recorrer las conexiones del libro
                for (Map.Entry<Book, Integer> entry : connections.entrySet()) {
                    Book connectedBook = entry.getKey(); // Obtiene el libro conectado
                    int connectionWeight = entry.getValue(); // Obtiene el peso de la conexión
                    // Verifica si el libro conectado tiene el género buscado, tiene una conexión más popular
                    // que el libro actual y no está en la lista de libros recomendados
                    if (connectedBook.getGeneres_book().contains(genre)) {
                        if (!recommendedBooks.contains(connectedBook)) {
                            if (connectionWeight > maxPopularity) {
                                mostPopularBook = connectedBook;
                                maxPopularity = connectionWeight; 
                            }
                        }
                    }

                }
            }
        }

        // Si se encontró un libro más popular, se agrega a la lista de libros recomendados
        if (mostPopularBook != null) {
            recommendedBooks.add(mostPopularBook);
        }

        return mostPopularBook; // Devuelve el libro más popular encontrado
    }   
}
