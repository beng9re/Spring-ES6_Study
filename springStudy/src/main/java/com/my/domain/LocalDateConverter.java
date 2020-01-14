package com.my.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.Optional;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {
	
	
		@Override
	    public Date convertToDatabaseColumn(LocalDate localDate) {
	        return Optional.ofNullable(localDate)
	                .map(Date::valueOf)
	                .orElse(null);
	    }

	    @Override
	    public LocalDate convertToEntityAttribute(Date date) {
	    	return Optional.ofNullable(date)
            .map(Date::toLocalDate)
            .orElse(null);

	    }
	

};
