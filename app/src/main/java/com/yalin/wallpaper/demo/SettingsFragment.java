package com.yalin.wallpaper.demo;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Trev on 10/16/17.
 */

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.normal_prefs);
    }
}
