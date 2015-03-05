package com.bignerdranch.android.runtracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by larrikin on 3/5/15.
 */
public class RunFragment extends Fragment {
    
    private Button mStartButton, mStopButton;
    private TextView mStartedTextView, mLatitudeTextView, mLongitudeTextView, mAltitudeTextView,
        mDurationTextView;
    
    @Override
    public void onCreate(Bundle savedInstanceStation) {
        super.onCreate(savedInstanceStation);
        setRetainInstance(true);
    }
}
