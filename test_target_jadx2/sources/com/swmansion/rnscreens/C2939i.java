package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.K0;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2939i implements androidx.core.view.I, LifecycleEventListener {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f29963d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f29964e;

    /* renamed from: a, reason: collision with root package name */
    public static final C2939i f29960a = new C2939i();

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f29961b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference f29962c = new WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f29965f = true;

    private C2939i() {
    }

    private final boolean b() {
        return !f29963d || f29962c.get() == null;
    }

    private final View c() {
        return (View) f29962c.get();
    }

    public final void a(androidx.core.view.I listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f29961b.add(listener);
    }

    public final boolean d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!b()) {
            return false;
        }
        AbstractC1484a0.F0(view, this);
        f29962c = new WeakReference(view);
        f29963d = true;
        return true;
    }

    public final void e(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f29964e) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        f29964e = true;
        context.addLifecycleEventListener(this);
    }

    public final void f(androidx.core.view.I listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f29961b.remove(listener);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View c10 = c();
        if (f29963d && c10 != null) {
            AbstractC1484a0.F0(c10, null);
            f29963d = false;
            f29962c.clear();
        }
        f29964e = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // androidx.core.view.I
    public K0 p(View v10, K0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        K0 c02 = f29965f ? AbstractC1484a0.c0(v10, insets) : insets;
        Intrinsics.d(c02);
        Iterator it = f29961b.iterator();
        while (it.hasNext()) {
            c02 = ((androidx.core.view.I) it.next()).p(v10, insets);
            Intrinsics.checkNotNullExpressionValue(c02, "onApplyWindowInsets(...)");
        }
        return c02;
    }
}
