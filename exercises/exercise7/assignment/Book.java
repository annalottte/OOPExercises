package oop.part6.exercises.exercise7.assignment;

class Book implements Comparable<Book> {
    private final int bookId;
    private final String bookTitle;
    private final String author;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookTitle = bookName;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookTitle + ", Author: " + author;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookTitle.compareTo(o.bookTitle);
    }
}