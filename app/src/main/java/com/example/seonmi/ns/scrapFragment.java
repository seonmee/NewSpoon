package com.example.seonmi.ns;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class scrapFragment extends Fragment {

    public scrapFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scrap,container,false);
        return view;
    }

    public static scrapFragment newInstance() {
        scrapFragment fragment = new scrapFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


}
