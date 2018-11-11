package com.example.seonmi.ns;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.seonmi.ns.Adapter.ItemShowAdapter;
import com.example.seonmi.ns.Bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

public class scrapFragment extends Fragment {

    private List<ItemBean> mItemList ;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;

    public scrapFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.fragment_scrap,container,false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.scrap_list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        mItemList = new ArrayList<ItemBean>();

        for(int i = 0; i <5 ; i ++) {

            ItemBean itemBean = new ItemBean("키워드");
            mItemList.add(itemBean);
        };

        adapter = new ItemShowAdapter(mItemList,view.getContext());
        mRecyclerView.setAdapter(adapter);

        return view;
    }

    public static scrapFragment newInstance() {
        scrapFragment fragment = new scrapFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

}
