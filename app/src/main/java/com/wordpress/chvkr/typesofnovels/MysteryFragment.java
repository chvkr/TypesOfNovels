package com.wordpress.chvkr.typesofnovels;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by cvr on 23-Apr-16.
 */
public class MysteryFragment extends Fragment {

    private Button button,button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.mystery_fragment, container, false);

        button = (Button) v.findViewById(R.id.button);
        button2 = (Button) v.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (isNetworkAvailable()) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://flavorwire.com/434548/50-essential-mystery-novels-that-everyone-should-read"));
                    startActivity(intent);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (isNetworkAvailable()) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Mystery_fiction"));
                    startActivity(intent);
                }
            }
        });


        return v;
    }

    /**
     *  Creating an instance for class MysteryFragment
     * @return The instance of MysteryFragment
     */
    public static MysteryFragment newInstance() {

        MysteryFragment m = new MysteryFragment();

        return m;
    }

    /**
     * Check if there is internet connection or not
     * @return The result of the internet connectivity
     */
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            Toast.makeText(getContext().getApplicationContext(), "You need a network connection.", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

}
