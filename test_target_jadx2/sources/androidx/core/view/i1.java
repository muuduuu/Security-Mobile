package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final e f16135a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f16136a;

        /* renamed from: b, reason: collision with root package name */
        private final O f16137b;

        a(Window window, O o10) {
            this.f16136a = window;
            this.f16137b = o10;
        }

        private void i(int i10) {
            if (i10 == 1) {
                j(4);
            } else if (i10 == 2) {
                j(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f16137b.a();
            }
        }

        private void l(int i10) {
            if (i10 == 1) {
                m(4);
                n(1024);
            } else if (i10 == 2) {
                m(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f16137b.b();
            }
        }

        @Override // androidx.core.view.i1.e
        void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, C0 c02) {
        }

        @Override // androidx.core.view.i1.e
        int b() {
            return 0;
        }

        @Override // androidx.core.view.i1.e
        void c(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    i(i11);
                }
            }
        }

        @Override // androidx.core.view.i1.e
        void g(int i10) {
            if (i10 == 0) {
                m(6144);
                return;
            }
            if (i10 == 1) {
                m(4096);
                j(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                m(2048);
                j(4096);
            }
        }

        @Override // androidx.core.view.i1.e
        void h(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    l(i11);
                }
            }
        }

        protected void j(int i10) {
            View decorView = this.f16136a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void k(int i10) {
            this.f16136a.addFlags(i10);
        }

        protected void m(int i10) {
            View decorView = this.f16136a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void n(int i10) {
            this.f16136a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.i1.e
        public void f(boolean z10) {
            if (!z10) {
                m(8192);
                return;
            }
            n(67108864);
            k(Integer.MIN_VALUE);
            j(8192);
        }
    }

    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.i1.e
        public boolean d() {
            return (this.f16136a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.i1.e
        public void e(boolean z10) {
            if (!z10) {
                m(16);
                return;
            }
            n(134217728);
            k(Integer.MIN_VALUE);
            j(16);
        }
    }

    private static class e {
        e() {
        }

        abstract void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, C0 c02);

        abstract int b();

        abstract void c(int i10);

        public boolean d() {
            return false;
        }

        public void e(boolean z10) {
        }

        public abstract void f(boolean z10);

        abstract void g(int i10);

        abstract void h(int i10);
    }

    private i1(WindowInsetsController windowInsetsController) {
        this.f16135a = new d(windowInsetsController, this, new O(windowInsetsController));
    }

    public static i1 i(WindowInsetsController windowInsetsController) {
        return new i1(windowInsetsController);
    }

    public void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, C0 c02) {
        this.f16135a.a(i10, j10, interpolator, cancellationSignal, c02);
    }

    public int b() {
        return this.f16135a.b();
    }

    public void c(int i10) {
        this.f16135a.c(i10);
    }

    public boolean d() {
        return this.f16135a.d();
    }

    public void e(boolean z10) {
        this.f16135a.e(z10);
    }

    public void f(boolean z10) {
        this.f16135a.f(z10);
    }

    public void g(int i10) {
        this.f16135a.g(i10);
    }

    public void h(int i10) {
        this.f16135a.h(i10);
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final i1 f16138a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f16139b;

        /* renamed from: c, reason: collision with root package name */
        final O f16140c;

        /* renamed from: d, reason: collision with root package name */
        private final j0.i f16141d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f16142e;

        class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a, reason: collision with root package name */
            private J0 f16143a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0 f16144b;

            a(C0 c02) {
                this.f16144b = c02;
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f16144b.a(windowInsetsAnimationController == null ? null : this.f16143a);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f16144b.c(this.f16143a);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                J0 j02 = new J0(windowInsetsAnimationController);
                this.f16143a = j02;
                this.f16144b.b(j02, i10);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        d(Window window, i1 i1Var, O o10) {
            this(r0, i1Var, o10);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f16142e = window;
        }

        @Override // androidx.core.view.i1.e
        void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, C0 c02) {
            this.f16139b.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(c02));
        }

        @Override // androidx.core.view.i1.e
        int b() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f16139b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.i1.e
        void c(int i10) {
            if ((i10 & 8) != 0) {
                this.f16140c.a();
            }
            this.f16139b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.i1.e
        public boolean d() {
            int systemBarsAppearance;
            this.f16139b.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f16139b.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.i1.e
        public void e(boolean z10) {
            if (z10) {
                if (this.f16142e != null) {
                    i(16);
                }
                this.f16139b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f16142e != null) {
                    j(16);
                }
                this.f16139b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.i1.e
        public void f(boolean z10) {
            if (z10) {
                if (this.f16142e != null) {
                    i(8192);
                }
                this.f16139b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f16142e != null) {
                    j(8192);
                }
                this.f16139b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.i1.e
        void g(int i10) {
            this.f16139b.setSystemBarsBehavior(i10);
        }

        @Override // androidx.core.view.i1.e
        void h(int i10) {
            if ((i10 & 8) != 0) {
                this.f16140c.b();
            }
            this.f16139b.show(i10 & (-9));
        }

        protected void i(int i10) {
            View decorView = this.f16142e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void j(int i10) {
            View decorView = this.f16142e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, i1 i1Var, O o10) {
            this.f16141d = new j0.i();
            this.f16139b = windowInsetsController;
            this.f16138a = i1Var;
            this.f16140c = o10;
        }
    }

    public i1(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16135a = new d(window, this, o10);
        } else if (i10 >= 26) {
            this.f16135a = new c(window, o10);
        } else {
            this.f16135a = new b(window, o10);
        }
    }
}
