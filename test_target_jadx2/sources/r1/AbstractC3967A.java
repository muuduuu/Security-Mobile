package r1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.AbstractC1484a0;

/* renamed from: r1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3967A {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3979M f38955a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f38956b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f38957c;

    /* renamed from: r1.A$a */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC3967A.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            AbstractC3967A.g(view, f10.floatValue());
        }
    }

    /* renamed from: r1.A$b */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC1484a0.t(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC1484a0.x0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f38955a = new C3978L();
        } else {
            f38955a = new C3977K();
        }
        f38956b = new a(Float.class, "translationAlpha");
        f38957c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f38955a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f38955a.b(view);
    }

    static InterfaceC3982P d(View view) {
        return new C3981O(view);
    }

    static void e(View view) {
        f38955a.c(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f38955a.d(view, i10, i11, i12, i13);
    }

    static void g(View view, float f10) {
        f38955a.e(view, f10);
    }

    static void h(View view, int i10) {
        f38955a.f(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f38955a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f38955a.h(view, matrix);
    }
}
