package com.scu.vinh.springdatajpa.service;

import com.scu.vinh.springdatajpa.dto.requestDto.BookRequestDto;
import com.scu.vinh.springdatajpa.dto.responseDto.BookResponseDto;
import com.scu.vinh.springdatajpa.model.Book;
import com.scu.vinh.springdatajpa.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    public BookResponseDto addBook(BookRequestDto bookRequestDto);
    public BookResponseDto getBookById(Long bookId);
    public Book getBook(Long bookId);
    public BookResponseDto deleteBook(Long bookId);
    public BookResponseDto editBook(Long bookId, BookRequestDto bookRequestDto);
    public BookResponseDto addAuthorToBook(Long bookId, Long authorId);
    public BookResponseDto deleteAuthorFromBook(Long bookId, Long authorId);
    public BookResponseDto addCategoryToBook(Long bookId, Long categoryId);
    public BookResponseDto removeCategoryFromBook(Long bookId, Long CategoryId);
}
