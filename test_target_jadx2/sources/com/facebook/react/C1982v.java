package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.config.ReactFeatureFlags;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1982v {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f22503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22504b;

    /* renamed from: c, reason: collision with root package name */
    private O4.h f22505c;

    /* renamed from: d, reason: collision with root package name */
    private Callback f22506d;

    /* renamed from: e, reason: collision with root package name */
    private C1997z f22507e;

    /* renamed from: com.facebook.react.v$a */
    class a extends C1997z {
        a(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
            super(activity, o10, str, bundle, z10);
        }

        @Override // com.facebook.react.C1997z
        protected Z b() {
            Z createRootView = C1982v.this.createRootView();
            return createRootView == null ? super.b() : createRootView;
        }
    }

    @Deprecated
    public C1982v(Activity activity, String str) {
        this.f22503a = activity;
        this.f22504b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i10, String[] strArr, int[] iArr, Object[] objArr) {
        O4.h hVar = this.f22505c;
        if (hVar == null || !hVar.onRequestPermissionsResult(i10, strArr, iArr)) {
            return;
        }
        this.f22505c = null;
    }

    protected Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    protected Z createRootView() {
        return null;
    }

    protected Context getContext() {
        return (Context) AbstractC4012a.c(this.f22503a);
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.f22504b;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    protected C1997z getReactDelegate() {
        return this.f22507e;
    }

    public A getReactHost() {
        return ((InterfaceC1995x) getPlainActivity().getApplication()).b();
    }

    public J getReactInstanceManager() {
        return this.f22507e.d();
    }

    protected O getReactNativeHost() {
        return ((InterfaceC1995x) getPlainActivity().getApplication()).a();
    }

    protected boolean isFabricEnabled() {
        return ReactFeatureFlags.enableFabricRenderer;
    }

    protected boolean isWideColorGamutEnabled() {
        return false;
    }

    protected void loadApp(String str) {
        this.f22507e.i(str);
        getPlainActivity().setContentView(this.f22507e.f());
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f22507e.j(i10, i11, intent, true);
    }

    public boolean onBackPressed() {
        return this.f22507e.k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f22507e.l(configuration);
    }

    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        Bundle composeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.f22503a.getWindow().setColorMode(1);
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f22507e = new C1997z(getPlainActivity(), getReactHost(), mainComponentName, composeLaunchOptions);
        } else {
            this.f22507e = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, composeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    public void onDestroy() {
        this.f22507e.m();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f22507e.p(i10, keyEvent);
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f22507e.q(i10);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f22507e.v(i10, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        return this.f22507e.r(intent);
    }

    public void onPause() {
        this.f22507e.n();
    }

    public void onRequestPermissionsResult(final int i10, final String[] strArr, final int[] iArr) {
        this.f22506d = new Callback() { // from class: com.facebook.react.u
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                C1982v.this.b(i10, strArr, iArr, objArr);
            }
        };
    }

    public void onResume() {
        this.f22507e.o();
        Callback callback = this.f22506d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f22506d = null;
        }
    }

    public void onUserLeaveHint() {
        C1997z c1997z = this.f22507e;
        if (c1997z != null) {
            c1997z.s();
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        this.f22507e.t(z10);
    }

    public void requestPermissions(String[] strArr, int i10, O4.h hVar) {
        this.f22505c = hVar;
        getPlainActivity().requestPermissions(strArr, i10);
    }

    public C1982v(AbstractActivityC1928s abstractActivityC1928s, String str) {
        this.f22503a = abstractActivityC1928s;
        this.f22504b = str;
    }
}
