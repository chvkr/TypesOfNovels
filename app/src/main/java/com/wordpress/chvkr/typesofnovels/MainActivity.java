package com.wordpress.chvkr.typesofnovels;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {



        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return StartFragment.newInstance();
                case 1: return MysteryFragment.newInstance();
                case 2: return RomanceFragment.newInstance();
                case 3: return ThrillerFragment.newInstance();
                case 4: return ScienceFictionFragment.newInstance();
                case 5: return FantasyFragment.newInstance();
                case 6: return HistoricalFictionFragment.newInstance();
                default: return MysteryFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 7;
        }
    }


}
