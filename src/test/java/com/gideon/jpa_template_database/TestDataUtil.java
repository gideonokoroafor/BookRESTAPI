package com.gideon.jpa_template_database;

import com.gideon.jpa_template_database.domain.dto.AuthorDto;
import com.gideon.jpa_template_database.domain.dto.BookDto;
import com.gideon.jpa_template_database.domain.entities.AuthorEntity;
import com.gideon.jpa_template_database.domain.entities.BookEntity;

public class TestDataUtil {
    private TestDataUtil(){}

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Jane Doe")
                .age(98)
                .build();
    }

    public static AuthorDto createTestAuthorDtoA() {
        return AuthorDto.builder()
                .id(1L)
                .name("Jane Doe")
                .age(98)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(2L)
                .name("Mike A")
                .age(46)
                .build();
    }
    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(3L)
                .name("Jiraya Sensei")
                .age(25)
                .build();
    }

    public static BookEntity createTestBookA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-6453-4231-0")
                .title("The Land of Magic")
                .author(authorEntity)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-2-6453-4231-0")
                .title("The Land of Sea")
                .author(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-3-6453-4231-0")
                .title("The Land of Fire")
                .author(authorEntity)
                .build();
    }

    public static BookDto createTestBookDtoA(final AuthorDto author) {
        return BookDto.builder()
                .isbn("978-1-6453-4231-0")
                .title("The Land of Magic")
                .author(author)
                .build();
    }
}
