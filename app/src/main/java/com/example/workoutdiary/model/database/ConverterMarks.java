package com.example.workoutdiary.model.database;

import androidx.room.TypeConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterMarks {

    @TypeConverter
    public String fromMarks(List<String> marks){
        return marks.stream().collect(Collectors.joining(","));
    }

    @TypeConverter
    public List<String> toMarks(String data){
        return Arrays.asList(data.split(","));
    }
}
