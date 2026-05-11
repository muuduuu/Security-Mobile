package com.facebook.react.uimanager;

import a5.C1351a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import c5.C1729b;
import c5.C1730c;
import c5.C1732e;
import c5.C1735h;
import com.facebook.react.bridge.ReadableArray;
import e5.C3080b;
import e5.C3082d;
import e5.C3084f;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.uimanager.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1931a f22315a = new C1931a();

    private C1931a() {
    }

    public static final void a(View view, Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        C1729b f10 = f22315a.f(view);
        if (f10 == null) {
            canvas.clipRect(rect);
            return;
        }
        Path q10 = f10.q();
        if (q10 != null) {
            q10.offset(rect.left, rect.top);
            canvas.clipPath(q10);
        } else {
            RectF r10 = f10.r();
            Intrinsics.checkNotNullExpressionValue(r10, "getPaddingBoxRect(...)");
            r10.offset(rect.left, rect.top);
            canvas.clipRect(r10);
        }
    }

    private final C1729b b(View view) {
        C1730c c10 = c(view);
        if (c10.b() != null) {
            return c10.b();
        }
        C1729b c1729b = new C1729b(view.getContext());
        view.setBackground(c10.g(c1729b));
        return c1729b;
    }

    private final C1730c c(View view) {
        if (view.getBackground() instanceof C1730c) {
            Drawable background = view.getBackground();
            Intrinsics.e(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (C1730c) background;
        }
        C1730c c1730c = new C1730c(view.getBackground(), null, null, null, null, 30, null);
        view.setBackground(c1730c);
        return c1730c;
    }

    public static final Integer d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C1729b f10 = f22315a.f(view);
        if (f10 != null) {
            return Integer.valueOf(f10.k());
        }
        return null;
    }

    public static final X e(View view, EnumC3081c corner) {
        C3082d h10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        C1729b f10 = f22315a.f(view);
        if (f10 == null || (h10 = f10.h()) == null) {
            return null;
        }
        return h10.a(corner);
    }

    private final C1729b f(View view) {
        C1730c g10 = g(view);
        if (g10 != null) {
            return g10.b();
        }
        return null;
    }

    private final C1730c g(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C1730c) {
            return (C1730c) background;
        }
        return null;
    }

    public static final void h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getBackground() instanceof C1730c) {
            Drawable background = view.getBackground();
            Intrinsics.e(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((C1730c) background).d());
        }
    }

    public static final void i(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof C1730c)) {
            return;
        }
        f22315a.b(view).E(num != null ? num.intValue() : 0);
    }

    public static final void j(View view, List list) {
        Intrinsics.checkNotNullParameter(view, "view");
        f22315a.b(view).w(list);
    }

    public static final void k(View view, e5.j edge, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        f22315a.b(view).y(edge.toSpacingType(), num);
    }

    public static final void l(View view, EnumC3081c corner, X x10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        C1931a c1931a = f22315a;
        c1931a.b(view).A(corner, x10);
        C1730c c10 = c1931a.c(view);
        if (Build.VERSION.SDK_INT >= 28) {
            for (Drawable drawable : c10.e()) {
                if (drawable instanceof C1735h) {
                    C1735h c1735h = (C1735h) drawable;
                    C3082d c11 = c1735h.c();
                    if (c11 == null) {
                        c11 = new C3082d(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    c1735h.d(c11);
                    C3082d c12 = c1735h.c();
                    if (c12 != null) {
                        c12.d(corner, x10);
                    }
                    drawable.invalidateSelf();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            for (Drawable drawable2 : c10.c()) {
                if (drawable2 instanceof C1732e) {
                    C1732e c1732e = (C1732e) drawable2;
                    C3082d c13 = c1732e.c();
                    if (c13 == null) {
                        c13 = new C3082d(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    c1732e.f(c13);
                    C3082d c14 = c1732e.c();
                    if (c14 != null) {
                        c14.d(corner, x10);
                    }
                    drawable2.invalidateSelf();
                }
            }
        }
    }

    public static final void m(View view, EnumC3083e enumC3083e) {
        Intrinsics.checkNotNullParameter(view, "view");
        f22315a.b(view).B(enumC3083e);
    }

    public static final void n(View view, e5.j edge, Float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        C1931a c1931a = f22315a;
        c1931a.b(view).D(edge.toSpacingType(), f10 != null ? C1944g0.f22418a.b(f10.floatValue()) : Float.NaN);
        if (Build.VERSION.SDK_INT >= 29) {
            C1730c c10 = c1931a.c(view);
            C3080b a10 = c10.a();
            if (a10 == null) {
                a10 = new C3080b();
            }
            c10.f(a10);
            C3080b a11 = c10.a();
            if (a11 != null) {
                a11.b(edge, f10);
            }
            for (Drawable drawable : c10.c()) {
                Intrinsics.e(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                ((C1732e) drawable).e(c10.a());
                drawable.invalidateSelf();
            }
        }
    }

    public static final void o(View view, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (readableArray == null) {
            p(view, CollectionsKt.j());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3084f a10 = C3084f.f32229g.a(readableArray.getMap(i10));
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(a10);
        }
        p(view, arrayList);
    }

    public static final void p(View view, List shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shadows, "shadows");
        if (C1351a.c(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C3080b a10 = f22315a.c(view).a();
        Iterator it = shadows.iterator();
        while (it.hasNext()) {
            C3084f c3084f = (C3084f) it.next();
            float d10 = c3084f.d();
            float e10 = c3084f.e();
            Integer b10 = c3084f.b();
            int intValue = b10 != null ? b10.intValue() : -16777216;
            Float a11 = c3084f.a();
            float floatValue = a11 != null ? a11.floatValue() : 0.0f;
            Float f10 = c3084f.f();
            float floatValue2 = f10 != null ? f10.floatValue() : 0.0f;
            Boolean c10 = c3084f.c();
            boolean booleanValue = c10 != null ? c10.booleanValue() : false;
            if (booleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList2.add(new C1732e(context, f22315a.b(view).h(), a10, intValue, d10, e10, floatValue, floatValue2));
            } else if (!booleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList.add(new C1735h(context2, f22315a.b(view).h(), intValue, d10, e10, floatValue, floatValue2));
            }
        }
        view.setBackground(f22315a.c(view).i(arrayList, arrayList2));
    }

    public static final void q(View view, Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(f22315a.c(view).h(drawable));
    }
}
