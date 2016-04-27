package com.wordpress.chvkr.typesofnovels;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cvr on 23-Apr-16.
 */
public class StartFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View s = inflater.inflate(R.layout.start_fragment, container, false);
        return s;
    }

    public static StartFragment newInstance() {

        StartFragment s = new StartFragment();

        return s;
    }

}
