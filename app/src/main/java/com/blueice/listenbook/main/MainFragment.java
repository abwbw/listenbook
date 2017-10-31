package com.blueice.listenbook.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blueice.listenbook.R;
import com.blueice.listenbook.base.view.BaseFragment;

/**
 * Created by wangbinwei on 2017/10/31.
 */

public class MainFragment extends BaseFragment {
    private BottomNavigationView mBottomNv;

    public static MainFragment newInstance(){
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View layout = inflater.inflate(R.layout.fragment_main, container, false);

        mBottomNv = layout.findViewById(R.id.bottom_menu_bnv);

        return layout;
    }
}
