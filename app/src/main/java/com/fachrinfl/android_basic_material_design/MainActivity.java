package com.fachrinfl.android_basic_material_design;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tab Layout");
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Icon Only
        adapter.addFragment(new Recents_Fragment(), "Recent");
        adapter.addFragment(new Favorites_Fragment(), "Favorite");
        adapter.addFragment(new NearBy_Fragment(), "Near By");

        // Title Only
        /*adapter.addFragment(new One_Fragment(), "Item Tab One");
        adapter.addFragment(new Two_Fragment(), "Item Tab Two");
        adapter.addFragment(new Three_Fragment(), "Item Tab Three");
        adapter.addFragment(new Three_Fragment(), "Item Tab Four");
        adapter.addFragment(new Three_Fragment(), "Item Tab Five");
        adapter.addFragment(new Three_Fragment(), "Item Tab Six");*/


        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.icn_phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.icn_heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.icn_account);

        tabLayout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorSelectTabIndocator), PorterDuff.Mode.SRC_IN);

        tabLayout.setOnTabSelectedListener(
                new TabLayout.ViewPagerOnTabSelectedListener(viewPager) {

                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        super.onTabSelected(tab);
                        int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.colorSelectTabIndocator);
                        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {
                        super.onTabUnselected(tab);
                        int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.colorUnSelectTab);
                        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {
                        super.onTabReselected(tab);
                    }
                }
        );

    }
}
