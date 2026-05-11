package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public interface A {
    boolean a();

    E4.a b(Context context, String str, Bundle bundle);

    void c(Context context);

    void d(Activity activity);

    void e(B b10);

    void f(Activity activity);

    D4.a g(String str);

    void h(Activity activity, O4.b bVar);

    C4.e i();

    void j(Activity activity);

    ReactContext k();

    void l(B b10);

    void onActivityResult(Activity activity, int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z10);

    D4.a start();
}
