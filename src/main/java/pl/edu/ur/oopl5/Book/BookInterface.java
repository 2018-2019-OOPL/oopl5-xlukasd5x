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
public interface BookInterface {
    String getTitle();
    String getAuthor();
    int getPages();
    int getYear();
    int getPrice();
    
    void setTitle(String title);
    void setAuthor(String author);
    void setPages(int pages);
    void setYear(int year);
    void setPrice(int price);
}
