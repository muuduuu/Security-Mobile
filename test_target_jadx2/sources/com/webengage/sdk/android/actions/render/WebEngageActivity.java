package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.webengage.sdk.android.C2958f;

/* loaded from: classes2.dex */
public class WebEngageActivity extends Activity {
    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C2958f.a(getApplicationContext()).start(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        C2958f.a(getApplicationContext()).stop(this);
    }
}
