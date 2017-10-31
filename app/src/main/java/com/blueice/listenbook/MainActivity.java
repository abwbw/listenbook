package com.blueice.listenbook;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.blueice.listenbook.main.MainFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG_FRAGMENT = "Content";

    private FrameLayout mContentFl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentFl = findViewById(R.id.content_fl);


        Fragment fragment = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);

        if(fragment == null){
            fragment = MainFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content_fl, fragment, TAG_FRAGMENT).commit();
        }

    }
}
