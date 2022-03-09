package com.scu.vinh.springdatajpa.dto;

import com.scu.vinh.springdatajpa.dto.responseDto.AuthorResponseDto;
import com.scu.vinh.springdatajpa.dto.responseDto.BookResponseDto;
import com.scu.vinh.springdatajpa.dto.responseDto.CategoryResponseDto;
import com.scu.vinh.springdatajpa.model.Author;
import com.scu.vinh.springdatajpa.model.Book;
import com.scu.vinh.springdatajpa.model.Category;

import java.util.ArrayList;
import java.util.List;

public class mapper {
    public static BookResponseDto bookToBookResponseDto(Book book) {
        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setId(book.getId());
        bookResponseDto.setCategoryName(book.getCategory().getName());
        List<String> names = new ArrayList<>();
        List<Author> authors = book.getAuthors();
        for (Author author: authors) {
            names.add(author.getName());
        }
        bookResponseDto.setAuthorNames(names);
        return bookResponseDto;
    }

    public static List<BookResponseDto> booksToBookResponseDtos(List<Book> books) {
        List<BookResponseDto> bookResponseDtos = new ArrayList<>();
        for (Book book: books) {
            bookResponseDtos.add(bookToBookResponseDto(book));
        }
        return bookResponseDtos;
    }

    public static AuthorResponseDto authorToAuthorResponseDto(Author author) {
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setId(author.getId());
        authorResponseDto.setName(author.getName());
        List<String> names = new ArrayList<>();
        List<Book> books = author.getBooks();
        for (Book book: books) {
            names.add(book.getName());
        }
        authorResponseDto.setBookNames(names);
        return authorResponseDto;
    }

    public static List<AuthorResponseDto> authorsToAuthorResponseDtos(List<Author> authors) {
        List<AuthorResponseDto> authorResponseDtos = new ArrayList<>();
        for (Author author: authors) {
            authorResponseDtos.add(authorToAuthorResponseDto(author));
        }
        return authorResponseDtos;
    }

    public static CategoryResponseDto categoryToCategoryRepsonseDto(Category category) {
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setId(category.getId());
        categoryResponseDto.setName(category.getName());
        List<String> names = new ArrayList<>();
        List<Book> books = category.getBooks();
        for (Book book: books) {
            names.add(book.getName());
        }
        categoryResponseDto.setBookNames(names);
        return categoryResponseDto;
    }

    public static List<CategoryResponseDto> categoriesToCategoryRepsonseDtos(List<Category> categories) {
        List<CategoryResponseDto> categoryResponseDtos = new ArrayList<>();
        for(Category category:categories) {
            categoryResponseDtos.add(categoryToCategoryRepsonseDto(category));
        }
        return categoryResponseDtos;
    }
}
