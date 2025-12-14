package com.leo.player;

import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.browser.trusted.TrustedWebActivityLauncherActivity;

public class MainActivity extends TrustedWebActivityLauncherActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
