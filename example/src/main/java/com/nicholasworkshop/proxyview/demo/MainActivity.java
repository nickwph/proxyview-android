package com.nicholasworkshop.proxyview.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.nicholasworkshop.proxyview.demo.fragment.RecyclerViewFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getFragmentManager()
                .beginTransaction()
//                .replace(R.id.content, new ImageViewFragment())
//                .replace(R.id.content, new VideoViewFragment())
//                .replace(R.id.content, new ListViewFragment())
                .replace(R.id.content, new RecyclerViewFragment())
                .commit();
    }
}
