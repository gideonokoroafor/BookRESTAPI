package com.gideon.jpa_template_database.mappers.impl;

import com.gideon.jpa_template_database.domain.dto.BookDto;
import com.gideon.jpa_template_database.domain.entities.BookEntity;
import com.gideon.jpa_template_database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mapper <BookEntity, BookDto>{

    private final ModelMapper modelMapper;

    public BookMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity book) {
        return modelMapper.map(book, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
