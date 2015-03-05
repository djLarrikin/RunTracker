package com.bignerdranch.android.runtracker;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class RunActivity extends SingleFragmentActivity {

    protected android.support.v4.app.Fragment createFragment() {

        return new RunFragment();
    }
}
