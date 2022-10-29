package com.anmv.frontend;

import com.anmv.backend.BookRepository;
import com.anmv.entity.Book;
import com.anmv.entity.StatusEnum;

public class BookProgram {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();

        Book book = new Book();
        book.setTitle("Book 4");
        book.setStatus(StatusEnum.REJECT);

        bookRepository.createBook(book);
    }
}
