package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.b;

/* loaded from: classes2.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34860a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f34861b = new int[2];

    public a(boolean z10) {
        this.f34860a = z10;
    }

    private io.sentry.internal.gestures.b b(View view) {
        try {
            String b10 = i.b(view);
            String canonicalName = view.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = view.getClass().getSimpleName();
            }
            return new io.sentry.internal.gestures.b(view, canonicalName, b10, null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean c(View view, boolean z10) {
        if (z10) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean d(View view, boolean z10) {
        return (c(view, z10) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    private boolean f(View view, float f10, float f11) {
        view.getLocationOnScreen(this.f34861b);
        int[] iArr = this.f34861b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        return f10 >= ((float) i10) && f10 <= ((float) (i10 + view.getWidth())) && f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getHeight()));
    }

    @Override // io.sentry.internal.gestures.a
    public io.sentry.internal.gestures.b a(Object obj, float f10, float f11, b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (f(view, f10, f11)) {
            if (aVar == b.a.CLICKABLE && e(view)) {
                return b(view);
            }
            if (aVar == b.a.SCROLLABLE && d(view, this.f34860a)) {
                return b(view);
            }
        }
        return null;
    }
}
