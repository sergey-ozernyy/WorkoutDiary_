package com.example.workoutdiary.model.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.workoutdiary.model.Exercise;

import java.util.List;

@Dao
public interface ExerciseDao {

    @Query("SELECT * FROM exercises WHERE id = :id")
    public Exercise getById(int id);

    @Query("SELECT * FROM exercises WHERE workout_id = :workoutId")
    public List<Exercise> getByWorkoutId(int workoutId);

    @Insert
    void insert(Exercise exercise);

    @Update
    void update(Exercise exercise);

    @Delete
    void delete(Exercise exercise);
}
