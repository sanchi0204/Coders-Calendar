package com.noobsever.codingcontests.Screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.noobsever.codingcontests.R;

public class LayoutOneActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    NavigationView mNavigationOne;
    MaterialToolbar mTopbarOne;
    DrawerLayout mDrawerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_one);

        mNavigationOne = findViewById(R.id.navigation_one);
        mTopbarOne = findViewById(R.id.top_bar_one);
        mDrawerOne = findViewById(R.id.drawer_one);

        setSupportActionBar(mTopbarOne);

        mNavigationOne.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle mToggle = new ActionBarDrawerToggle(this, mDrawerOne, mTopbarOne,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close){
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
            }
        };
        mToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.design_default_color_on_primary));
        mDrawerOne.addDrawerListener(mToggle);
        mToggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_settings:
                //mDrawerOne.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_notifications:

                break;
             //add for all menu options
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_layout:
                // add action
                break;
            case R.id.menu_search:
                // add action
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}