package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class K0 {

    /* renamed from: b, reason: collision with root package name */
    public static final K0 f16032b;

    /* renamed from: a, reason: collision with root package name */
    private final l f16033a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f16034a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f16035b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f16036c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f16037d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f16034a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f16035b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f16036c = declaredField3;
                declaredField3.setAccessible(true);
                f16037d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static K0 a(View view) {
            if (f16037d && view.isAttachedToWindow()) {
                try {
                    Object obj = f16034a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f16035b.get(obj);
                        Rect rect2 = (Rect) f16036c.get(obj);
                        if (rect != null && rect2 != null) {
                            K0 a10 = new b().c(androidx.core.graphics.e.c(rect)).d(androidx.core.graphics.e.c(rect2)).a();
                            a10.t(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.K0.f
        void c(int i10, androidx.core.graphics.e eVar) {
            this.f16045c.setInsets(n.a(i10), eVar.f());
        }

        e(K0 k02) {
            super(k02);
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final K0 f16046a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.e[] f16047b;

        f() {
            this(new K0((K0) null));
        }

        protected final void a() {
            androidx.core.graphics.e[] eVarArr = this.f16047b;
            if (eVarArr != null) {
                androidx.core.graphics.e eVar = eVarArr[m.c(1)];
                androidx.core.graphics.e eVar2 = this.f16047b[m.c(2)];
                if (eVar2 == null) {
                    eVar2 = this.f16046a.f(2);
                }
                if (eVar == null) {
                    eVar = this.f16046a.f(1);
                }
                g(androidx.core.graphics.e.a(eVar, eVar2));
                androidx.core.graphics.e eVar3 = this.f16047b[m.c(16)];
                if (eVar3 != null) {
                    f(eVar3);
                }
                androidx.core.graphics.e eVar4 = this.f16047b[m.c(32)];
                if (eVar4 != null) {
                    d(eVar4);
                }
                androidx.core.graphics.e eVar5 = this.f16047b[m.c(64)];
                if (eVar5 != null) {
                    h(eVar5);
                }
            }
        }

        abstract K0 b();

        void c(int i10, androidx.core.graphics.e eVar) {
            if (this.f16047b == null) {
                this.f16047b = new androidx.core.graphics.e[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f16047b[m.c(i11)] = eVar;
                }
            }
        }

        void d(androidx.core.graphics.e eVar) {
        }

        abstract void e(androidx.core.graphics.e eVar);

        void f(androidx.core.graphics.e eVar) {
        }

        abstract void g(androidx.core.graphics.e eVar);

        void h(androidx.core.graphics.e eVar) {
        }

        f(K0 k02) {
            this.f16046a = k02;
        }
    }

    private static class i extends h {
        i(K0 k02, WindowInsets windowInsets) {
            super(k02, windowInsets);
        }

        @Override // androidx.core.view.K0.l
        K0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f16053c.consumeDisplayCutout();
            return K0.w(consumeDisplayCutout);
        }

        @Override // androidx.core.view.K0.g, androidx.core.view.K0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f16053c, iVar.f16053c) && Objects.equals(this.f16057g, iVar.f16057g);
        }

        @Override // androidx.core.view.K0.l
        r f() {
            DisplayCutout displayCutout;
            displayCutout = this.f16053c.getDisplayCutout();
            return r.e(displayCutout);
        }

        @Override // androidx.core.view.K0.l
        public int hashCode() {
            return this.f16053c.hashCode();
        }

        i(K0 k02, i iVar) {
            super(k02, iVar);
        }
    }

    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final K0 f16062q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f16062q = K0.w(windowInsets);
        }

        k(K0 k02, WindowInsets windowInsets) {
            super(k02, windowInsets);
        }

        @Override // androidx.core.view.K0.g, androidx.core.view.K0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.K0.g, androidx.core.view.K0.l
        public androidx.core.graphics.e g(int i10) {
            Insets insets;
            insets = this.f16053c.getInsets(n.a(i10));
            return androidx.core.graphics.e.e(insets);
        }

        @Override // androidx.core.view.K0.g, androidx.core.view.K0.l
        public boolean p(int i10) {
            boolean isVisible;
            isVisible = this.f16053c.isVisible(n.a(i10));
            return isVisible;
        }

        k(K0 k02, k kVar) {
            super(k02, kVar);
        }
    }

    private static class l {

        /* renamed from: b, reason: collision with root package name */
        static final K0 f16063b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final K0 f16064a;

        l(K0 k02) {
            this.f16064a = k02;
        }

        K0 a() {
            return this.f16064a;
        }

        K0 b() {
            return this.f16064a;
        }

        K0 c() {
            return this.f16064a;
        }

        void d(View view) {
        }

        void e(K0 k02) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && y0.b.a(k(), lVar.k()) && y0.b.a(i(), lVar.i()) && y0.b.a(f(), lVar.f());
        }

        r f() {
            return null;
        }

        androidx.core.graphics.e g(int i10) {
            return androidx.core.graphics.e.f15923e;
        }

        androidx.core.graphics.e h() {
            return k();
        }

        public int hashCode() {
            return y0.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.e i() {
            return androidx.core.graphics.e.f15923e;
        }

        androidx.core.graphics.e j() {
            return k();
        }

        androidx.core.graphics.e k() {
            return androidx.core.graphics.e.f15923e;
        }

        androidx.core.graphics.e l() {
            return k();
        }

        K0 m(int i10, int i11, int i12, int i13) {
            return f16063b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        boolean p(int i10) {
            return true;
        }

        public void q(androidx.core.graphics.e[] eVarArr) {
        }

        void r(androidx.core.graphics.e eVar) {
        }

        void s(K0 k02) {
        }

        public void t(androidx.core.graphics.e eVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 128;
        }

        public static int b() {
            return 8;
        }

        static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int d() {
            return 32;
        }

        public static int e() {
            return 2;
        }

        public static int f() {
            return 1;
        }

        public static int g() {
            return 7;
        }
    }

    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16032b = k.f16062q;
        } else {
            f16032b = l.f16063b;
        }
    }

    private K0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16033a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f16033a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f16033a = new i(this, windowInsets);
        } else {
            this.f16033a = new h(this, windowInsets);
        }
    }

    static androidx.core.graphics.e n(androidx.core.graphics.e eVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, eVar.f15924a - i10);
        int max2 = Math.max(0, eVar.f15925b - i11);
        int max3 = Math.max(0, eVar.f15926c - i12);
        int max4 = Math.max(0, eVar.f15927d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? eVar : androidx.core.graphics.e.b(max, max2, max3, max4);
    }

    public static K0 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static K0 x(WindowInsets windowInsets, View view) {
        K0 k02 = new K0((WindowInsets) y0.f.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            k02.t(AbstractC1484a0.H(view));
            k02.d(view.getRootView());
        }
        return k02;
    }

    public K0 a() {
        return this.f16033a.a();
    }

    public K0 b() {
        return this.f16033a.b();
    }

    public K0 c() {
        return this.f16033a.c();
    }

    void d(View view) {
        this.f16033a.d(view);
    }

    public r e() {
        return this.f16033a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K0) {
            return y0.b.a(this.f16033a, ((K0) obj).f16033a);
        }
        return false;
    }

    public androidx.core.graphics.e f(int i10) {
        return this.f16033a.g(i10);
    }

    public androidx.core.graphics.e g() {
        return this.f16033a.i();
    }

    public androidx.core.graphics.e h() {
        return this.f16033a.j();
    }

    public int hashCode() {
        l lVar = this.f16033a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f16033a.k().f15927d;
    }

    public int j() {
        return this.f16033a.k().f15924a;
    }

    public int k() {
        return this.f16033a.k().f15926c;
    }

    public int l() {
        return this.f16033a.k().f15925b;
    }

    public K0 m(int i10, int i11, int i12, int i13) {
        return this.f16033a.m(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f16033a.n();
    }

    public boolean p(int i10) {
        return this.f16033a.p(i10);
    }

    public K0 q(int i10, int i11, int i12, int i13) {
        return new b(this).d(androidx.core.graphics.e.b(i10, i11, i12, i13)).a();
    }

    void r(androidx.core.graphics.e[] eVarArr) {
        this.f16033a.q(eVarArr);
    }

    void s(androidx.core.graphics.e eVar) {
        this.f16033a.r(eVar);
    }

    void t(K0 k02) {
        this.f16033a.s(k02);
    }

    void u(androidx.core.graphics.e eVar) {
        this.f16033a.t(eVar);
    }

    public WindowInsets v() {
        l lVar = this.f16033a;
        if (lVar instanceof g) {
            return ((g) lVar).f16053c;
        }
        return null;
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f16039e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f16040f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f16041g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f16042h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f16043c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e f16044d;

        c() {
            this.f16043c = i();
        }

        private static WindowInsets i() {
            if (!f16040f) {
                try {
                    f16039e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f16040f = true;
            }
            Field field = f16039e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f16042h) {
                try {
                    f16041g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f16042h = true;
            }
            Constructor constructor = f16041g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.K0.f
        K0 b() {
            a();
            K0 w10 = K0.w(this.f16043c);
            w10.r(this.f16047b);
            w10.u(this.f16044d);
            return w10;
        }

        @Override // androidx.core.view.K0.f
        void e(androidx.core.graphics.e eVar) {
            this.f16044d = eVar;
        }

        @Override // androidx.core.view.K0.f
        void g(androidx.core.graphics.e eVar) {
            WindowInsets windowInsets = this.f16043c;
            if (windowInsets != null) {
                this.f16043c = windowInsets.replaceSystemWindowInsets(eVar.f15924a, eVar.f15925b, eVar.f15926c, eVar.f15927d);
            }
        }

        c(K0 k02) {
            super(k02);
            this.f16043c = k02.v();
        }
    }

    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f16045c;

        d() {
            this.f16045c = x0.j.a();
        }

        @Override // androidx.core.view.K0.f
        K0 b() {
            WindowInsets build;
            a();
            build = this.f16045c.build();
            K0 w10 = K0.w(build);
            w10.r(this.f16047b);
            return w10;
        }

        @Override // androidx.core.view.K0.f
        void d(androidx.core.graphics.e eVar) {
            this.f16045c.setMandatorySystemGestureInsets(eVar.f());
        }

        @Override // androidx.core.view.K0.f
        void e(androidx.core.graphics.e eVar) {
            this.f16045c.setStableInsets(eVar.f());
        }

        @Override // androidx.core.view.K0.f
        void f(androidx.core.graphics.e eVar) {
            this.f16045c.setSystemGestureInsets(eVar.f());
        }

        @Override // androidx.core.view.K0.f
        void g(androidx.core.graphics.e eVar) {
            this.f16045c.setSystemWindowInsets(eVar.f());
        }

        @Override // androidx.core.view.K0.f
        void h(androidx.core.graphics.e eVar) {
            this.f16045c.setTappableElementInsets(eVar.f());
        }

        d(K0 k02) {
            super(k02);
            WindowInsets.Builder a10;
            WindowInsets v10 = k02.v();
            if (v10 != null) {
                a10 = Q0.a(v10);
            } else {
                a10 = x0.j.a();
            }
            this.f16045c = a10;
        }
    }

    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.e f16058m;

        h(K0 k02, WindowInsets windowInsets) {
            super(k02, windowInsets);
            this.f16058m = null;
        }

        @Override // androidx.core.view.K0.l
        K0 b() {
            return K0.w(this.f16053c.consumeStableInsets());
        }

        @Override // androidx.core.view.K0.l
        K0 c() {
            return K0.w(this.f16053c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.K0.l
        final androidx.core.graphics.e i() {
            if (this.f16058m == null) {
                this.f16058m = androidx.core.graphics.e.b(this.f16053c.getStableInsetLeft(), this.f16053c.getStableInsetTop(), this.f16053c.getStableInsetRight(), this.f16053c.getStableInsetBottom());
            }
            return this.f16058m;
        }

        @Override // androidx.core.view.K0.l
        boolean n() {
            return this.f16053c.isConsumed();
        }

        @Override // androidx.core.view.K0.l
        public void t(androidx.core.graphics.e eVar) {
            this.f16058m = eVar;
        }

        h(K0 k02, h hVar) {
            super(k02, hVar);
            this.f16058m = null;
            this.f16058m = hVar.f16058m;
        }
    }

    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f16048h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f16049i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f16050j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f16051k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f16052l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f16053c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e[] f16054d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.e f16055e;

        /* renamed from: f, reason: collision with root package name */
        private K0 f16056f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.e f16057g;

        g(K0 k02, WindowInsets windowInsets) {
            super(k02);
            this.f16055e = null;
            this.f16053c = windowInsets;
        }

        private androidx.core.graphics.e u(int i10, boolean z10) {
            androidx.core.graphics.e eVar = androidx.core.graphics.e.f15923e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    eVar = androidx.core.graphics.e.a(eVar, v(i11, z10));
                }
            }
            return eVar;
        }

        private androidx.core.graphics.e w() {
            K0 k02 = this.f16056f;
            return k02 != null ? k02.g() : androidx.core.graphics.e.f15923e;
        }

        private androidx.core.graphics.e x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f16048h) {
                z();
            }
            Method method = f16049i;
            if (method != null && f16050j != null && f16051k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f16051k.get(f16052l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.e.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void z() {
            try {
                f16049i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f16050j = cls;
                f16051k = cls.getDeclaredField("mVisibleInsets");
                f16052l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f16051k.setAccessible(true);
                f16052l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f16048h = true;
        }

        @Override // androidx.core.view.K0.l
        void d(View view) {
            androidx.core.graphics.e x10 = x(view);
            if (x10 == null) {
                x10 = androidx.core.graphics.e.f15923e;
            }
            r(x10);
        }

        @Override // androidx.core.view.K0.l
        void e(K0 k02) {
            k02.t(this.f16056f);
            k02.s(this.f16057g);
        }

        @Override // androidx.core.view.K0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f16057g, ((g) obj).f16057g);
            }
            return false;
        }

        @Override // androidx.core.view.K0.l
        public androidx.core.graphics.e g(int i10) {
            return u(i10, false);
        }

        @Override // androidx.core.view.K0.l
        final androidx.core.graphics.e k() {
            if (this.f16055e == null) {
                this.f16055e = androidx.core.graphics.e.b(this.f16053c.getSystemWindowInsetLeft(), this.f16053c.getSystemWindowInsetTop(), this.f16053c.getSystemWindowInsetRight(), this.f16053c.getSystemWindowInsetBottom());
            }
            return this.f16055e;
        }

        @Override // androidx.core.view.K0.l
        K0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(K0.w(this.f16053c));
            bVar.d(K0.n(k(), i10, i11, i12, i13));
            bVar.c(K0.n(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.K0.l
        boolean o() {
            return this.f16053c.isRound();
        }

        @Override // androidx.core.view.K0.l
        boolean p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !y(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.K0.l
        public void q(androidx.core.graphics.e[] eVarArr) {
            this.f16054d = eVarArr;
        }

        @Override // androidx.core.view.K0.l
        void r(androidx.core.graphics.e eVar) {
            this.f16057g = eVar;
        }

        @Override // androidx.core.view.K0.l
        void s(K0 k02) {
            this.f16056f = k02;
        }

        protected androidx.core.graphics.e v(int i10, boolean z10) {
            androidx.core.graphics.e g10;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.e.b(0, Math.max(w().f15925b, k().f15925b), 0, 0) : androidx.core.graphics.e.b(0, k().f15925b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.e w10 = w();
                    androidx.core.graphics.e i12 = i();
                    return androidx.core.graphics.e.b(Math.max(w10.f15924a, i12.f15924a), 0, Math.max(w10.f15926c, i12.f15926c), Math.max(w10.f15927d, i12.f15927d));
                }
                androidx.core.graphics.e k10 = k();
                K0 k02 = this.f16056f;
                g10 = k02 != null ? k02.g() : null;
                int i13 = k10.f15927d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f15927d);
                }
                return androidx.core.graphics.e.b(k10.f15924a, 0, k10.f15926c, i13);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.e.f15923e;
                }
                K0 k03 = this.f16056f;
                r e10 = k03 != null ? k03.e() : f();
                return e10 != null ? androidx.core.graphics.e.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.e.f15923e;
            }
            androidx.core.graphics.e[] eVarArr = this.f16054d;
            g10 = eVarArr != null ? eVarArr[m.c(8)] : null;
            if (g10 != null) {
                return g10;
            }
            androidx.core.graphics.e k11 = k();
            androidx.core.graphics.e w11 = w();
            int i14 = k11.f15927d;
            if (i14 > w11.f15927d) {
                return androidx.core.graphics.e.b(0, 0, 0, i14);
            }
            androidx.core.graphics.e eVar = this.f16057g;
            return (eVar == null || eVar.equals(androidx.core.graphics.e.f15923e) || (i11 = this.f16057g.f15927d) <= w11.f15927d) ? androidx.core.graphics.e.f15923e : androidx.core.graphics.e.b(0, 0, 0, i11);
        }

        protected boolean y(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !v(i10, false).equals(androidx.core.graphics.e.f15923e);
        }

        g(K0 k02, g gVar) {
            this(k02, new WindowInsets(gVar.f16053c));
        }
    }

    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.e f16059n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.e f16060o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.e f16061p;

        j(K0 k02, WindowInsets windowInsets) {
            super(k02, windowInsets);
            this.f16059n = null;
            this.f16060o = null;
            this.f16061p = null;
        }

        @Override // androidx.core.view.K0.l
        androidx.core.graphics.e h() {
            Insets mandatorySystemGestureInsets;
            if (this.f16060o == null) {
                mandatorySystemGestureInsets = this.f16053c.getMandatorySystemGestureInsets();
                this.f16060o = androidx.core.graphics.e.e(mandatorySystemGestureInsets);
            }
            return this.f16060o;
        }

        @Override // androidx.core.view.K0.l
        androidx.core.graphics.e j() {
            Insets systemGestureInsets;
            if (this.f16059n == null) {
                systemGestureInsets = this.f16053c.getSystemGestureInsets();
                this.f16059n = androidx.core.graphics.e.e(systemGestureInsets);
            }
            return this.f16059n;
        }

        @Override // androidx.core.view.K0.l
        androidx.core.graphics.e l() {
            Insets tappableElementInsets;
            if (this.f16061p == null) {
                tappableElementInsets = this.f16053c.getTappableElementInsets();
                this.f16061p = androidx.core.graphics.e.e(tappableElementInsets);
            }
            return this.f16061p;
        }

        @Override // androidx.core.view.K0.g, androidx.core.view.K0.l
        K0 m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f16053c.inset(i10, i11, i12, i13);
            return K0.w(inset);
        }

        @Override // androidx.core.view.K0.h, androidx.core.view.K0.l
        public void t(androidx.core.graphics.e eVar) {
        }

        j(K0 k02, j jVar) {
            super(k02, jVar);
            this.f16059n = null;
            this.f16060o = null;
            this.f16061p = null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f16038a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f16038a = new e();
            } else if (i10 >= 29) {
                this.f16038a = new d();
            } else {
                this.f16038a = new c();
            }
        }

        public K0 a() {
            return this.f16038a.b();
        }

        public b b(int i10, androidx.core.graphics.e eVar) {
            this.f16038a.c(i10, eVar);
            return this;
        }

        public b c(androidx.core.graphics.e eVar) {
            this.f16038a.e(eVar);
            return this;
        }

        public b d(androidx.core.graphics.e eVar) {
            this.f16038a.g(eVar);
            return this;
        }

        public b(K0 k02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f16038a = new e(k02);
            } else if (i10 >= 29) {
                this.f16038a = new d(k02);
            } else {
                this.f16038a = new c(k02);
            }
        }
    }

    public K0(K0 k02) {
        if (k02 != null) {
            l lVar = k02.f16033a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f16033a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f16033a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f16033a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f16033a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f16033a = new g(this, (g) lVar);
            } else {
                this.f16033a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f16033a = new l(this);
    }
}
