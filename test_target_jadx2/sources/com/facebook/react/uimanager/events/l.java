package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.B0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f22381a = new l();

    private l() {
    }

    public static final void a(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        A0 a10 = B0.a(view);
        if (a10 != null) {
            a10.d(view, event);
        }
    }

    public static final void b(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        A0 a10 = B0.a(view);
        if (a10 != null) {
            a10.b(view, event);
        }
    }
}
