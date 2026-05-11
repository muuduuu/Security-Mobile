package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* renamed from: com.facebook.react.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1928s extends androidx.appcompat.app.d implements O4.b, O4.g {

    /* renamed from: a, reason: collision with root package name */
    private final C1982v f22137a = B();

    protected AbstractActivityC1928s() {
    }

    protected abstract C1982v B();

    public C1997z C() {
        return this.f22137a.getReactDelegate();
    }

    @Override // O4.b
    public void b() {
        super.onBackPressed();
    }

    @Override // O4.g
    public void c(String[] strArr, int i10, O4.h hVar) {
        this.f22137a.requestPermissions(strArr, i10, hVar);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f22137a.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onBackPressed() {
        if (this.f22137a.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.d, androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f22137a.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22137a.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f22137a.onDestroy();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f22137a.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f22137a.onKeyLongPress(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f22137a.onKeyUp(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f22137a.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f22137a.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f22137a.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f22137a.onResume();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f22137a.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f22137a.onWindowFocusChanged(z10);
    }
}
