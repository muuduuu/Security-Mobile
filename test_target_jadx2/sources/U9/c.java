package U9;

import L9.h;
import L9.k;
import O9.i;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1512o0;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.views.view.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class c extends j {

    /* renamed from: l, reason: collision with root package name */
    public static final a f10359l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final String f10360m = C5142C.b(c.class).q();

    /* renamed from: a, reason: collision with root package name */
    private final F0 f10361a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10362b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10363c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10364d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10365e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10366f;

    /* renamed from: g, reason: collision with root package name */
    private j f10367g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10368h;

    /* renamed from: i, reason: collision with root package name */
    private i f10369i;

    /* renamed from: j, reason: collision with root package name */
    private final O9.j f10370j;

    /* renamed from: k, reason: collision with root package name */
    private final R9.b f10371k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return c.f10360m;
        }

        private a() {
        }
    }

    /* synthetic */ class b extends xc.j implements Function0 {
        b(Object obj) {
            super(0, obj, c.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return ((c) this.f44980b).getKeyboardCallback();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(F0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f10361a = reactContext;
        O9.j jVar = new O9.j(K0.m.g(), K0.m.b(), 1, this.f10363c);
        this.f10370j = jVar;
        this.f10371k = new R9.b(this, reactContext, jVar, new b(this));
        setTag(f10360m);
    }

    private final void A() {
        F();
        k.c(this);
    }

    private final void B() {
        i iVar = this.f10369i;
        if (iVar != null) {
            iVar.d();
        }
        final j jVar = this.f10367g;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: U9.b
            @Override // java.lang.Runnable
            public final void run() {
                c.C(j.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(j jVar) {
        L9.j.a(jVar);
    }

    private final void E() {
        String str;
        if (this.f10361a.getCurrentActivity() == null) {
            P9.a aVar = P9.a.f7630a;
            str = d.f10372a;
            P9.a.d(aVar, str, "Can not setup keyboard animation listener, since `currentActivity` is null", null, 4, null);
            return;
        }
        this.f10367g = new j(getContext());
        ViewGroup a10 = h.a(this.f10361a);
        if (a10 != null) {
            a10.addView(this.f10367g);
        }
        i iVar = new i(this, this, this.f10361a, this.f10370j);
        this.f10369i = iVar;
        j jVar = this.f10367g;
        if (jVar != null) {
            AbstractC1484a0.N0(jVar, iVar);
            AbstractC1484a0.F0(jVar, this.f10369i);
            k.c(jVar);
        }
    }

    private final void F() {
        View b10 = h.b(this.f10361a);
        if (b10 != null) {
            AbstractC1484a0.F0(b10, new I() { // from class: U9.a
                @Override // androidx.core.view.I
                public final K0 p(View view, K0 k02) {
                    K0 G10;
                    G10 = c.G(c.this, view, k02);
                    return G10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0 G(c this$0, View v10, K0 insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        ViewGroup a10 = h.a(this$0.f10361a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        boolean z10 = this$0.f10365e;
        boolean z11 = true;
        boolean z12 = !z10 || this$0.f10362b;
        if (z10 && !this$0.f10363c) {
            z11 = false;
        }
        androidx.core.graphics.e f10 = insets.f(K0.m.e());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        androidx.core.graphics.e f11 = insets.f(K0.m.g());
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        layoutParams.setMargins(f10.f15924a, z12 ? 0 : f11.f15925b, f10.f15926c, z11 ? 0 : f10.f15927d);
        if (a10 != null) {
            a10.setLayoutParams(layoutParams);
        }
        K0 c02 = AbstractC1484a0.c0(v10, insets);
        Intrinsics.checkNotNullExpressionValue(c02, "onApplyWindowInsets(...)");
        return c02.q(c02.j(), this$0.f10362b ? 0 : c02.l(), c02.k(), c02.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i getKeyboardCallback() {
        return this.f10369i;
    }

    private final void v() {
        E();
        this.f10371k.c();
    }

    private final void w() {
        B();
        this.f10371k.b();
    }

    private final void x() {
        F();
        w();
    }

    private final void y() {
        F();
        v();
    }

    public final void D() {
        boolean z10 = this.f10365e || this.f10364d;
        if (this.f10366f != z10) {
            this.f10366f = z10;
            Activity currentActivity = this.f10361a.getCurrentActivity();
            if (currentActivity != null) {
                AbstractC1512o0.b(currentActivity.getWindow(), true ^ this.f10366f);
            }
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10368h) {
            v();
        } else {
            this.f10368h = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w();
    }

    public final void setActive(boolean z10) {
        this.f10365e = z10;
        if (z10) {
            y();
        } else {
            x();
        }
    }

    public final void setNavigationBarTranslucent(boolean z10) {
        this.f10363c = z10;
        this.f10370j.e(z10);
    }

    public final void setPreserveEdgeToEdge(boolean z10) {
        this.f10364d = z10;
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.f10362b = z10;
    }

    public final void z(boolean z10) {
        if (!this.f10365e || this.f10362b == z10) {
            return;
        }
        this.f10362b = z10;
        A();
    }
}
