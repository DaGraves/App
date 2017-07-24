package com.example.david.app2.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.david.app2.Home.HomeActivity;
import com.example.david.app2.Leader.LeaderActivity;
import com.example.david.app2.Likes.LikesActivity;
import com.example.david.app2.Post.PostActivity;
import com.example.david.app2.Profile.ProfileActivity;
import com.example.david.app2.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by David on 7/14/2017.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewex){
        Log.d(TAG, "setupBottomNavigationView: setting up NavigationView");
        bottomNavigationViewex.enableAnimation(false);
        bottomNavigationViewex.enableItemShiftingMode(false);
        bottomNavigationViewex.enableShiftingMode(false);
        bottomNavigationViewex.setTextVisibility(false);
    }


    public static void enableNavigation(final Context context,BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_leader:
                        Intent intent2 = new Intent(context, LeaderActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, PostActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_profile:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }
}
