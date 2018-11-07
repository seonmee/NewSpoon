package com.example.seonmi.ns;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class scrapFragment extends Fragment {


    public scrapFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static scrapFragment newInstance() {
        scrapFragment fragment = new scrapFragment();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

}
