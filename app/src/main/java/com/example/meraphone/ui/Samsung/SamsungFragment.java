package com.example.meraphone.ui.Samsung;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meraphone.Adapters.DetailsAdapter;
import com.example.meraphone.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SamsungFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String> nNames=new ArrayList<>();
    private ArrayList<String> mImagesURLs=new ArrayList<>();
    private ArrayList<String> ncost=new ArrayList<>();



    public SamsungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=  inflater.inflate(R.layout.fragment_samsung, container, false);

      return view;
    }

}


