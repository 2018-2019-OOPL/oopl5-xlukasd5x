/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.Book;

/**
 *
 * @author student
 */
public class Book implements BookInterface{
    private String title;
    private String author;
    private int pages;
    private int year;
    private int price;
    
    public Book(){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void showData(){
        System.out.println("Ksiazka: ");
        System.out.println("Tytul: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ilosc stron: " + this.pages);
        System.out.println("Rok wydania: " + this.year);
        System.out.println("Cena: " + this.price);
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Cos tam");
        book1.setAuthor("Ktos tam");
        book1.setPages(350);
        book1.setYear(2010);
        book1.setPrice(15);
        book1.showData();
}
}
