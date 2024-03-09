package com.example.practic3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practic3.databinding.Fragment4Binding;

public class Fragment4 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment4Binding binding = Fragment4Binding.inflate(getLayoutInflater());

        binding.button.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString("bundleKey", "Результат от нижнего фрагмента");
            getParentFragmentManager().setFragmentResult(
                    "requestKey", result);
        });

        return binding.getRoot();
    }
}