package com.example.workoutdiary.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.workoutdiary.R;
import com.example.workoutdiary.model.Workout;
import com.example.workoutdiary.viewmodel.WorkoutListViewModel;

import java.util.List;


public class WorkoutListFragment extends Fragment {

    private RecyclerView workoutRecyclerView;
    private WorkoutAdapter mAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_workout_list, container, false);
        workoutRecyclerView = (RecyclerView) view.findViewById(R.id.workout_recycler_view);
        workoutRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();

        return view;
    }

    private void updateUI(){
        List<Workout> workouts = new WorkoutListViewModel().workouts;
        mAdapter = new WorkoutAdapter(workouts);
        workoutRecyclerView.setAdapter(mAdapter);
    }






}