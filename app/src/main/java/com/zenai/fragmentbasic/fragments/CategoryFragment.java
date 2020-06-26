package com.zenai.fragmentbasic.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zenai.fragmentbasic.R;

public class CategoryFragment extends Fragment implements View.OnClickListener {



    public CategoryFragment() {
        // Required empty public constructor
    }

    public static CategoryFragment newInstance(String param1, String param2) {
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        Button homeButton = view.findViewById(R.id.btn_lifestyle);
        homeButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_lifestyle) {
            FragmentManager fragmentManager = getFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            if (fragmentManager != null) {
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, homeFragment, HomeFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}