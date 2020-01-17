package com.example.exo1_tp1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;

import androidx.annotation.Nullable;

public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        addPreferencesFromResource(R.xml.preference);
        super.onCreate(savedInstanceState, persistentState);
    }
}
