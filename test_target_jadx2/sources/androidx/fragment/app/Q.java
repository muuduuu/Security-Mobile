package androidx.fragment.app;

import android.view.View;
import j0.C3476a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r1.C3987e;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f16831a;

    /* renamed from: b, reason: collision with root package name */
    public static final T f16832b;

    /* renamed from: c, reason: collision with root package name */
    public static final T f16833c;

    static {
        Q q10 = new Q();
        f16831a = q10;
        f16832b = new S();
        f16833c = q10.b();
    }

    private Q() {
    }

    public static final void a(ComponentCallbacksC1573o inFragment, ComponentCallbacksC1573o outFragment, boolean z10, C3476a sharedElements, boolean z11) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z10) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    private final T b() {
        try {
            Intrinsics.e(C3987e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (T) C3987e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(C3476a c3476a, C3476a namedViews) {
        Intrinsics.checkNotNullParameter(c3476a, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = c3476a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c3476a.j(size))) {
                c3476a.h(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
