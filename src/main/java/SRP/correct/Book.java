package SRP.correct;

public class Book {
    // Properties
    private String name;
    private String author;
    private String text;

    // Constructor
    public Book(String name, String author, String text){
        this.name = name;
        this.author = author;
        this.text = text;
    }

    /*
    * Methods relate to the book properties
     */

    // Replace a word in text
    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    // Check if a word is in text
    public boolean isWordInText(String word){
        return text.contains(word);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}