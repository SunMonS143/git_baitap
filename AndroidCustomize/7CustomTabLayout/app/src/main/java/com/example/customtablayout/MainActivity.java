package com.example.customtablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.customtablayout.fragment.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        viewPager.addOnAdapterChangeListener(new ViewPager.OnAdapterChangeListener() {
            @Override
            public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter oldAdapter, @Nullable PagerAdapter newAdapter) {

            }
            public void onPageSelected(int position){
                    switch (position){
                        case 0:
                            bottomNavigationView.getMenu().findItem(R.id.menu_news).setChecked(true);
                            break;

                        case 1:
                            bottomNavigationView.getMenu().findItem(R.id.home_news).setChecked(true);
                            break;

                        case 2:
                            bottomNavigationView.getMenu().findItem(R.id.favorite_new).setChecked(true);
                            break;
                    }
            }

            public void onPageScrollStateChanged(int state){

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_news:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.home_news:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.favorite_new:
                        viewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }
}