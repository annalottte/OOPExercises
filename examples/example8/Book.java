package oop.part6.examples.example8;

class Book {
    private final int bookId;
    private final String bookTitle;

    public Book(int bookId, String bookTitle) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
