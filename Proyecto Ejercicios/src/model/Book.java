package model;

import java.util.ArrayList;

public class Book {

    protected String title;
    protected ArrayList<String> generes_book;
    protected String author;
    protected int popularity;
    protected int id_book;

    public Book(String title, ArrayList<String> generes_book, String author, int popularity, int id_book) {
        this.title = title;
        this.generes_book = generes_book;
        this.author = author;
        this.popularity = popularity;
        this.id_book = id_book;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getGeneres_book() {
        return generes_book;
    }

    public String getAuthor() {
        return author;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getIdBook() {
        return id_book;
    }

    @Override
    public String toString() {
    	StringBuilder generos= new StringBuilder();
    	for (int i = 0; i < generes_book.size(); i++) {
			generos.append("\n"+generes_book.get(i));
		}
        return "Title=" + title + "\nGeneres_book:" + generos + "\nauthor=" + author + "\npopularity=" + popularity + "\nid_book=" + id_book;
    }

}
