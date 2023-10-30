package oop.part6.examples.example8;

import java.util.List;

class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Book findBookByTitle(String bookTitle) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getBookTitle().equals(bookTitle)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book '" + bookTitle + "' not found in the library.");
    }
}
