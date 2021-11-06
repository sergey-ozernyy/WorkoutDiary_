package com.example.workoutdiary.model.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.workoutdiary.model.Exercise;
import com.example.workoutdiary.model.Workout;
import com.example.workoutdiary.model.database.dao.ExerciseDao;
import com.example.workoutdiary.model.database.dao.WorkoutDao;

@Database(entities = {Workout.class, Exercise.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ExerciseDao exerciseDao();

    public abstract WorkoutDao workoutDao();

}
