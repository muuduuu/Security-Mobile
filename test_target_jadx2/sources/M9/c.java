package M9;

import Q0.b;
import Q0.f;
import Q0.g;
import android.os.CancellationSignal;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C0;
import androidx.core.view.J0;
import androidx.core.view.K0;
import androidx.core.view.i1;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import xc.m;
import zc.AbstractC5272a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private J0 f6098a;

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f6099b;

    /* renamed from: c, reason: collision with root package name */
    private Function1 f6100c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f6101d = i.a(new C0122c());

    /* renamed from: e, reason: collision with root package name */
    private boolean f6102e;

    /* renamed from: f, reason: collision with root package name */
    private f f6103f;

    static final class a extends m implements Function1 {
        a() {
            super(1);
        }

        public final void a(float f10) {
            c.this.m(AbstractC5272a.c(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Unit.f36324a;
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J0 f6105a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J0 j02) {
            super(0);
            this.f6105a = j02;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f6105a.c().f15927d);
        }
    }

    /* renamed from: M9.c$c, reason: collision with other inner class name */
    static final class C0122c extends m implements Function0 {

        /* renamed from: M9.c$c$a */
        public static final class a implements C0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f6107a;

            a(c cVar) {
                this.f6107a = cVar;
            }

            @Override // androidx.core.view.C0
            public void a(J0 j02) {
                this.f6107a.q();
            }

            @Override // androidx.core.view.C0
            public void b(J0 controller, int i10) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                this.f6107a.p(controller);
            }

            @Override // androidx.core.view.C0
            public void c(J0 controller) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                this.f6107a.q();
            }
        }

        C0122c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(c.this);
        }
    }

    private final void d(boolean z10, Float f10) {
        J0 j02 = this.f6098a;
        if (j02 == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        f b10 = Q0.c.b(new a(), new b(j02), z10 ? j02.e().f15927d : j02.d().f15927d);
        if (b10.q() == null) {
            b10.t(new g());
        }
        g spring = b10.q();
        Intrinsics.c(spring, "spring");
        spring.d(1.0f);
        spring.f(1500.0f);
        if (f10 != null) {
            b10.k(f10.floatValue());
        }
        b10.b(new b.q() { // from class: M9.b
            @Override // Q0.b.q
            public final void a(Q0.b bVar, boolean z11, float f11, float f12) {
                c.f(c.this, bVar, z11, f11, f12);
            }
        });
        b10.l();
        this.f6103f = b10;
    }

    static /* synthetic */ void e(c cVar, boolean z10, Float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        cVar.d(z10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0, Q0.b bVar, boolean z10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.b(bVar, this$0.f6103f)) {
            this$0.f6103f = null;
        }
        this$0.i();
    }

    private final C0122c.a j() {
        return (C0122c.a) this.f6101d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(J0 j02) {
        this.f6099b = null;
        this.f6098a = j02;
        Function1 function1 = this.f6100c;
        if (function1 != null) {
            function1.invoke(j02);
        }
        this.f6100c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.f6098a = null;
        this.f6099b = null;
        this.f6102e = false;
        f fVar = this.f6103f;
        if (fVar != null) {
            fVar.c();
        }
        this.f6103f = null;
        this.f6100c = null;
    }

    public static /* synthetic */ void s(c cVar, View view, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        cVar.r(view, function1);
    }

    public final void g(Float f10) {
        J0 j02 = this.f6098a;
        if (j02 == null) {
            CancellationSignal cancellationSignal = this.f6099b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        M9.a.f6095a.b(false);
        int i10 = j02.c().f15927d;
        int i11 = j02.e().f15927d;
        int i12 = j02.d().f15927d;
        if (f10 != null) {
            d(f10.floatValue() < 0.0f, f10);
            return;
        }
        if (i10 == i11) {
            j02.a(true);
            return;
        }
        if (i10 == i12) {
            j02.a(false);
        } else if (j02.b() >= 0.15f) {
            e(this, !this.f6102e, null, 2, null);
        } else {
            e(this, this.f6102e, null, 2, null);
        }
    }

    public final void h() {
        J0 j02 = this.f6098a;
        if (j02 != null) {
            j02.a(this.f6102e);
        }
        CancellationSignal cancellationSignal = this.f6099b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        f fVar = this.f6103f;
        if (fVar != null) {
            fVar.c();
        }
        q();
    }

    public final void i() {
        J0 j02 = this.f6098a;
        if (j02 == null) {
            CancellationSignal cancellationSignal = this.f6099b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i10 = j02.c().f15927d;
        int i11 = j02.e().f15927d;
        int i12 = j02.d().f15927d;
        if (i10 == i11) {
            j02.a(true);
            return;
        }
        if (i10 == i12) {
            j02.a(false);
        } else if (j02.b() >= 0.15f) {
            j02.a(!this.f6102e);
        } else {
            j02.a(this.f6102e);
        }
    }

    public final int k() {
        J0 j02 = this.f6098a;
        if (j02 != null) {
            return j02.c().f15927d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int l(int i10) {
        J0 j02 = this.f6098a;
        if (j02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        M9.a.f6095a.b(true);
        return m(j02.c().f15927d - i10);
    }

    public final int m(int i10) {
        J0 j02 = this.f6098a;
        if (j02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int i11 = j02.d().f15927d;
        int i12 = j02.e().f15927d;
        boolean z10 = this.f6102e;
        int i13 = z10 ? i12 : i11;
        int i14 = z10 ? i11 : i12;
        int k10 = kotlin.ranges.d.k(i10, i11, i12);
        int i15 = j02.c().f15927d - k10;
        j02.f(e.b(0, 0, 0, k10), 1.0f, (k10 - i13) / (i14 - i13));
        return i15;
    }

    public final boolean n() {
        return this.f6098a != null;
    }

    public final boolean o() {
        return this.f6099b != null;
    }

    public final void r(View view, Function1 function1) {
        LinearInterpolator linearInterpolator;
        Intrinsics.checkNotNullParameter(view, "view");
        if (n()) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
        }
        K0 H10 = AbstractC1484a0.H(view);
        boolean z10 = false;
        if (H10 != null && H10.p(K0.m.b())) {
            z10 = true;
        }
        this.f6102e = z10;
        this.f6099b = new CancellationSignal();
        this.f6100c = function1;
        M9.a.f6095a.b(true);
        i1 L10 = AbstractC1484a0.L(view);
        if (L10 != null) {
            int b10 = K0.m.b();
            linearInterpolator = d.f6108a;
            L10.a(b10, -1L, linearInterpolator, this.f6099b, j());
        }
    }
}
