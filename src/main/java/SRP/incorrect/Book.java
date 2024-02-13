package SRP.incorrect;

public class Book {
    // Properties
    private String name;
    private String author;
    private String text;

    // Constructor
    public Book (String name, String author, String text){
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

    /*
    * Method unrelated to the book, it is just output
     */

    // Print text to console
    public void printTextToConsole(){
        System.out.println(text);
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