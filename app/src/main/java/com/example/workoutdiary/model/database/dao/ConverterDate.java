package com.example.workoutdiary.model.database.dao;

import androidx.room.TypeConverter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.TimeZone;


public class ConverterDate {

    @TypeConverter
    public long fromDate(LocalDateTime date){
        return date.getLong(ChronoField.MILLI_OF_DAY);
    }

    @TypeConverter
    public LocalDateTime toDate(long date){
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date), TimeZone.getDefault().toZoneId());
    }
}
