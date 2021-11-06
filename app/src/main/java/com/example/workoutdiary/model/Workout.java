package com.example.workoutdiary.model;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.workoutdiary.model.database.ConverterMarks;
import com.example.workoutdiary.model.database.dao.ConverterDate;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity(tableName = "workouts")
public class Workout implements Serializable {

    @NonNull
    @PrimaryKey
    public int id;

    @NonNull
    @TypeConverters({ConverterDate.class})
    public LocalDateTime date;

    @TypeConverters({ConverterMarks.class})
    public List<String> marks;

    public Workout(){}

    public Workout(LocalDateTime date, List<String> marks) {
        this.date = date;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(@NonNull LocalDateTime date) {
        this.date = date;
    }

    public List<String> getMarks() {
        return marks;
    }

    public void setMarks(List<String> marks) {
        this.marks = marks;
    }
}
