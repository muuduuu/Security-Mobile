package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.K0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import s0.AbstractC4304c;

/* renamed from: androidx.core.view.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514p0 {

    /* renamed from: a, reason: collision with root package name */
    private e f16162a;

    /* renamed from: androidx.core.view.p0$b */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        public b(int i10) {
            this.mDispatchMode = i10;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(C1514p0 c1514p0) {
        }

        public void onPrepare(C1514p0 c1514p0) {
        }

        public abstract K0 onProgress(K0 k02, List list);

        public a onStart(C1514p0 c1514p0, a aVar) {
            return aVar;
        }
    }

    /* renamed from: androidx.core.view.p0$c */
    private static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private static final Interpolator f16165e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f16166f = new W0.a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f16167g = new DecelerateInterpolator();

        /* renamed from: androidx.core.view.p0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f16168a;

            /* renamed from: b, reason: collision with root package name */
            private K0 f16169b;

            /* renamed from: androidx.core.view.p0$c$a$a, reason: collision with other inner class name */
            class C0276a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C1514p0 f16170a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ K0 f16171b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ K0 f16172c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f16173d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f16174e;

                C0276a(C1514p0 c1514p0, K0 k02, K0 k03, int i10, View view) {
                    this.f16170a = c1514p0;
                    this.f16171b = k02;
                    this.f16172c = k03;
                    this.f16173d = i10;
                    this.f16174e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f16170a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f16174e, c.o(this.f16171b, this.f16172c, this.f16170a.b(), this.f16173d), Collections.singletonList(this.f16170a));
                }
            }

            /* renamed from: androidx.core.view.p0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C1514p0 f16176a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f16177b;

                b(C1514p0 c1514p0, View view) {
                    this.f16176a = c1514p0;
                    this.f16177b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f16176a.e(1.0f);
                    c.i(this.f16177b, this.f16176a);
                }
            }

            /* renamed from: androidx.core.view.p0$c$a$c, reason: collision with other inner class name */
            class RunnableC0277c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f16179a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1514p0 f16180b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f16181c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f16182d;

                RunnableC0277c(View view, C1514p0 c1514p0, a aVar, ValueAnimator valueAnimator) {
                    this.f16179a = view;
                    this.f16180b = c1514p0;
                    this.f16181c = aVar;
                    this.f16182d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f16179a, this.f16180b, this.f16181c);
                    this.f16182d.start();
                }
            }

            a(View view, b bVar) {
                this.f16168a = bVar;
                K0 H10 = AbstractC1484a0.H(view);
                this.f16169b = H10 != null ? new K0.b(H10).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f16169b = K0.x(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                K0 x10 = K0.x(windowInsets, view);
                if (this.f16169b == null) {
                    this.f16169b = AbstractC1484a0.H(view);
                }
                if (this.f16169b == null) {
                    this.f16169b = x10;
                    return c.m(view, windowInsets);
                }
                b n10 = c.n(view);
                if (n10 != null && Objects.equals(n10.mDispachedInsets, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int e10 = c.e(x10, this.f16169b);
                if (e10 == 0) {
                    return c.m(view, windowInsets);
                }
                K0 k02 = this.f16169b;
                C1514p0 c1514p0 = new C1514p0(e10, c.g(e10, x10, k02), 160L);
                c1514p0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1514p0.a());
                a f10 = c.f(x10, k02, e10);
                c.j(view, c1514p0, windowInsets, false);
                duration.addUpdateListener(new C0276a(c1514p0, x10, k02, e10, view));
                duration.addListener(new b(c1514p0, view));
                L.a(view, new RunnableC0277c(view, c1514p0, f10, duration));
                this.f16169b = x10;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static int e(K0 k02, K0 k03) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!k02.f(i11).equals(k03.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(K0 k02, K0 k03, int i10) {
            androidx.core.graphics.e f10 = k02.f(i10);
            androidx.core.graphics.e f11 = k03.f(i10);
            return new a(androidx.core.graphics.e.b(Math.min(f10.f15924a, f11.f15924a), Math.min(f10.f15925b, f11.f15925b), Math.min(f10.f15926c, f11.f15926c), Math.min(f10.f15927d, f11.f15927d)), androidx.core.graphics.e.b(Math.max(f10.f15924a, f11.f15924a), Math.max(f10.f15925b, f11.f15925b), Math.max(f10.f15926c, f11.f15926c), Math.max(f10.f15927d, f11.f15927d)));
        }

        static Interpolator g(int i10, K0 k02, K0 k03) {
            return (i10 & 8) != 0 ? k02.f(K0.m.b()).f15927d > k03.f(K0.m.b()).f15927d ? f16165e : f16166f : f16167g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C1514p0 c1514p0) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onEnd(c1514p0);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c1514p0);
                }
            }
        }

        static void j(View view, C1514p0 c1514p0, WindowInsets windowInsets, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.mDispachedInsets = windowInsets;
                if (!z10) {
                    n10.onPrepare(c1514p0);
                    z10 = n10.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c1514p0, windowInsets, z10);
                }
            }
        }

        static void k(View view, K0 k02, List list) {
            b n10 = n(view);
            if (n10 != null) {
                k02 = n10.onProgress(k02, list);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), k02, list);
                }
            }
        }

        static void l(View view, C1514p0 c1514p0, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.onStart(c1514p0, aVar);
                if (n10.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c1514p0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC4304c.f40698L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(AbstractC4304c.f40705S);
            if (tag instanceof a) {
                return ((a) tag).f16168a;
            }
            return null;
        }

        static K0 o(K0 k02, K0 k03, float f10, int i10) {
            K0.b bVar = new K0.b(k02);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.b(i11, k02.f(i11));
                } else {
                    androidx.core.graphics.e f11 = k02.f(i11);
                    androidx.core.graphics.e f12 = k03.f(i11);
                    float f13 = 1.0f - f10;
                    bVar.b(i11, K0.n(f11, (int) (((f11.f15924a - f12.f15924a) * f13) + 0.5d), (int) (((f11.f15925b - f12.f15925b) * f13) + 0.5d), (int) (((f11.f15926c - f12.f15926c) * f13) + 0.5d), (int) (((f11.f15927d - f12.f15927d) * f13) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(AbstractC4304c.f40698L);
            if (bVar == null) {
                view.setTag(AbstractC4304c.f40705S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h10 = h(view, bVar);
            view.setTag(AbstractC4304c.f40705S, h10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    /* renamed from: androidx.core.view.p0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f16189a;

        /* renamed from: b, reason: collision with root package name */
        private float f16190b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f16191c;

        /* renamed from: d, reason: collision with root package name */
        private final long f16192d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f16189a = i10;
            this.f16191c = interpolator;
            this.f16192d = j10;
        }

        public long a() {
            return this.f16192d;
        }

        public float b() {
            Interpolator interpolator = this.f16191c;
            return interpolator != null ? interpolator.getInterpolation(this.f16190b) : this.f16190b;
        }

        public int c() {
            return this.f16189a;
        }

        public void d(float f10) {
            this.f16190b = f10;
        }
    }

    public C1514p0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16162a = new d(i10, interpolator, j10);
        } else {
            this.f16162a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C1514p0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1514p0(windowInsetsAnimation);
    }

    public long a() {
        return this.f16162a.a();
    }

    public float b() {
        return this.f16162a.b();
    }

    public int c() {
        return this.f16162a.c();
    }

    public void e(float f10) {
        this.f16162a.d(f10);
    }

    /* renamed from: androidx.core.view.p0$d */
    private static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        private final WindowInsetsAnimation f16184e;

        /* renamed from: androidx.core.view.p0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f16185a;

            /* renamed from: b, reason: collision with root package name */
            private List f16186b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList f16187c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap f16188d;

            a(b bVar) {
                super(bVar.getDispatchMode());
                this.f16188d = new HashMap();
                this.f16185a = bVar;
            }

            private C1514p0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C1514p0 c1514p0 = (C1514p0) this.f16188d.get(windowInsetsAnimation);
                if (c1514p0 != null) {
                    return c1514p0;
                }
                C1514p0 f10 = C1514p0.f(windowInsetsAnimation);
                this.f16188d.put(windowInsetsAnimation, f10);
                return f10;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16185a.onEnd(a(windowInsetsAnimation));
                this.f16188d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16185a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f16187c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f16187c = arrayList2;
                    this.f16186b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = A0.a(list.get(size));
                    C1514p0 a11 = a(a10);
                    fraction = a10.getFraction();
                    a11.e(fraction);
                    this.f16187c.add(a11);
                }
                return this.f16185a.onProgress(K0.w(windowInsets), this.f16186b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f16185a.onStart(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f16184e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            AbstractC1529x0.a();
            return AbstractC1527w0.a(aVar.a().f(), aVar.b().f());
        }

        public static androidx.core.graphics.e f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.e.e(upperBound);
        }

        public static androidx.core.graphics.e g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.e.e(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.C1514p0.e
        public long a() {
            long durationMillis;
            durationMillis = this.f16184e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C1514p0.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f16184e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C1514p0.e
        public int c() {
            int typeMask;
            typeMask = this.f16184e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.C1514p0.e
        public void d(float f10) {
            this.f16184e.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC1525v0.a(i10, interpolator, j10));
        }
    }

    /* renamed from: androidx.core.view.p0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.e f16163a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.e f16164b;

        public a(androidx.core.graphics.e eVar, androidx.core.graphics.e eVar2) {
            this.f16163a = eVar;
            this.f16164b = eVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.e a() {
            return this.f16163a;
        }

        public androidx.core.graphics.e b() {
            return this.f16164b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f16163a + " upper=" + this.f16164b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f16163a = d.g(bounds);
            this.f16164b = d.f(bounds);
        }
    }

    private C1514p0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16162a = new d(windowInsetsAnimation);
        }
    }
}
