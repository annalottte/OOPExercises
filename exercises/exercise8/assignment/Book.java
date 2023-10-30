package oop.part6.exercises.exercise8.assignment;

class Book {
    private final int bookId;
    private final String bookName;
    private final String author;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + author;
    }
}