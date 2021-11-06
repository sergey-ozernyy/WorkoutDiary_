package com.example.workoutdiary.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "exercises")
public class Exercise implements Serializable {

    @NonNull
    @PrimaryKey
    public int id;

    @NonNull
    @ColumnInfo(name = "workout_id")
    public int workoutId;

    @NonNull
    @ColumnInfo
    public String name;

    @ColumnInfo
    public int reps;

    @ColumnInfo
    public int sets;

    @ColumnInfo
    public int weight;

    @ColumnInfo
    public int relax;

    public Exercise() {
    }

    public int getId(){
        return id;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRelax() {
        return relax;
    }

    public void setRelax(int relax) {
        this.relax = relax;
    }
}
