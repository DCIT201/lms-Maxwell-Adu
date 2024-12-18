/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Bobsy King", "Harper Lee", 1960);
        Book book2 = new Book("Nonlon lorryes", "Nerly Bob", 1949);
        Book book3 = new Book("Mood setter", "Herman Melville", 1851);
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book1.setTitle("Bently Queen");
        book1.setYearPublished(2015);

        System.out.println("\nUpdated Book Details:");
        System.out.println(book1);
        
        System.out.println("\nDetails of book2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year Published: " + book2.getYearPublished());
    }
}
