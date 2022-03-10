package com.scu.vinh.springdatajpa.service;

import com.scu.vinh.springdatajpa.dto.mapper;
import com.scu.vinh.springdatajpa.dto.requestDto.BookRequestDto;
import com.scu.vinh.springdatajpa.dto.responseDto.BookResponseDto;
import com.scu.vinh.springdatajpa.model.Author;
import com.scu.vinh.springdatajpa.model.Book;
import com.scu.vinh.springdatajpa.model.Category;
import com.scu.vinh.springdatajpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;
    private final CategoryService categoryService;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorService authorService, CategoryService categoryService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
        this.categoryService = categoryService;
    }

    @Override
    public BookResponseDto addBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setName(bookRequestDto.getName());
        if(bookRequestDto.getAuthorIds().isEmpty()) {
            throw new IllegalArgumentException("You need at least on author");
        }else {
            List<Author> authors = new ArrayList<>();
            for (Long authorId: bookRequestDto.getAuthorIds()) {
                authors.add(authorService.getAuthor(authorId));
            }
            book.setAuthors(authors);
        }

        if(bookRequestDto.getCategoryId() == null)
            throw new IllegalArgumentException("You need at least on Category");
        Category category = categoryService.getCategory(bookRequestDto.getCategoryId());
        book.setCategory(category);
        Book book1 = bookRepository.save(book);
        return mapper.bookToBookResponseDto(book1);
    }

    @Override
    public BookResponseDto getBookById(Long bookId) {

        return null;
    }

    @Override
    public Book getBook(Long bookId) {
        return null;
    }

    @Override
    public BookResponseDto deleteBook(Long bookId) {
        return null;
    }

    @Override
    public BookResponseDto editBook(Long bookId, BookRequestDto bookRequestDto) {
        return null;
    }

    @Override
    public BookResponseDto addAuthorToBook(Long bookId, Long authorId) {
        return null;
    }

    @Override
    public BookResponseDto deleteAuthorFromBook(Long bookId, Long authorId) {
        return null;
    }

    @Override
    public BookResponseDto addCategoryToBook(Long bookId, Long categoryId) {
        return null;
    }

    @Override
    public BookResponseDto removeCategoryFromBook(Long bookId, Long CategoryId) {
        return null;
    }
}
