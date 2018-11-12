package com.example.seonmi.ns.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.seonmi.ns.RealtimeFragment;
import com.example.seonmi.ns.newsEnglishFragment;
import com.example.seonmi.ns.newsKoreanFragment;
import com.example.seonmi.ns.scrapFragment;

public class FragementAdapter extends FragmentPagerAdapter {

    private static int PAGE_NUMBER = 4;

    public FragementAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return  RealtimeFragment.newInstance();
            case 1 :
                return  newsKoreanFragment.newInstance();
            case 2 :
                return newsEnglishFragment.newInstance();
            case 3 :
                return scrapFragment.newInstance();
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 :
                return "실시간뉴스";
            case 1 :
                return "국내뉴스";
            case 2 :
                return "해외뉴스";
            case 3:
                return "스크랩뉴스";
            default:
                return  null;
        }
    }
}
