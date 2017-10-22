package com.yalin.wallpaper.demo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * @author jinyalin
 * @since 2017/7/24.
 */

public class SettingActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
