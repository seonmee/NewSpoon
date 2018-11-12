package com.example.seonmi.ns;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class RealtimeFragment extends Fragment {

    public static RealtimeFragment newInstance() {

        Bundle args = new Bundle();

        RealtimeFragment fragment = new RealtimeFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
