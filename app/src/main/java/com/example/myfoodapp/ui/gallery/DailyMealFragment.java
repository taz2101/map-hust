package com.example.myfoodapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myfoodapp.R;
import com.example.myfoodapp.databinding.DailyMealFragmentBinding;

public class DailyMealFragment extends Fragment {

    private DailyMealFragment binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        return root;
    }
}
