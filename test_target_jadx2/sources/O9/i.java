package O9;

import K9.f;
import O9.l;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1514p0;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends C1514p0.b implements I, l {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.react.views.view.j f7132a;

    /* renamed from: b, reason: collision with root package name */
    private final View f7133b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f7134c;

    /* renamed from: d, reason: collision with root package name */
    private final j f7135d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7136e;

    /* renamed from: f, reason: collision with root package name */
    private double f7137f;

    /* renamed from: g, reason: collision with root package name */
    private double f7138g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7139h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7140i;

    /* renamed from: j, reason: collision with root package name */
    private int f7141j;

    /* renamed from: k, reason: collision with root package name */
    private int f7142k;

    /* renamed from: l, reason: collision with root package name */
    private HashSet f7143l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7144m;

    /* renamed from: n, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f7145n;

    /* renamed from: o, reason: collision with root package name */
    private e f7146o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.facebook.react.views.view.j eventPropagationView, View view, F0 f02, j config) {
        super(config.b());
        Intrinsics.checkNotNullParameter(eventPropagationView, "eventPropagationView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7132a = eventPropagationView;
        this.f7133b = view;
        this.f7134c = f02;
        this.f7135d = config;
        this.f7136e = L0.f(eventPropagationView);
        this.f7142k = -1;
        this.f7143l = new HashSet();
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: O9.h
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                i.e(i.this, view2, view3);
            }
        };
        this.f7145n = onGlobalFocusChangeListener;
        if ((config.a() & config.d()) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values");
        }
        this.f7146o = new e(view, eventPropagationView, f02);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(i this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view2 instanceof EditText) {
            this$0.f7142k = ((EditText) view2).getId();
            if (!this$0.f7139h || view == null) {
                return;
            }
            F0 f02 = this$0.f7134c;
            int id2 = this$0.f7132a.getId();
            int i10 = this$0.f7136e;
            int id3 = this$0.f7132a.getId();
            f.a aVar = K9.f.f5492f;
            L9.i.a(f02, id2, new K9.f(i10, id3, aVar.d(), this$0.f7137f, 1.0d, 0, this$0.f7142k));
            L9.i.a(this$0.f7134c, this$0.f7132a.getId(), new K9.f(this$0.f7136e, this$0.f7132a.getId(), aVar.a(), this$0.f7137f, 1.0d, 0, this$0.f7142k));
            L9.i.b(this$0.f7134c, "KeyboardController::keyboardWillShow", this$0.g(this$0.f7137f));
            L9.i.b(this$0.f7134c, "KeyboardController::keyboardDidShow", this$0.g(this$0.f7137f));
        }
    }

    private final double f() {
        androidx.core.graphics.e f10;
        androidx.core.graphics.e f11;
        K0 H10 = AbstractC1484a0.H(this.f7133b);
        int i10 = 0;
        int i11 = (H10 == null || (f11 = H10.f(K0.m.b())) == null) ? 0 : f11.f15927d;
        if (!this.f7135d.c() && H10 != null && (f10 = H10.f(K0.m.e())) != null) {
            i10 = f10.f15927d;
        }
        return kotlin.ranges.d.b(L9.e.a(i11 - i10), 0.0d);
    }

    private final WritableMap g(double d10) {
        WritableMap createMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
        createMap.putDouble("height", d10);
        createMap.putInt("duration", this.f7141j);
        createMap.putDouble("timestamp", System.currentTimeMillis());
        createMap.putInt("target", this.f7142k);
        EditText b10 = T9.a.f9501a.b();
        createMap.putString("type", b10 != null ? L9.d.d(b10) : null);
        createMap.putString("appearance", L9.i.c(this.f7134c));
        return createMap;
    }

    private final boolean h() {
        return this.f7141j == -1;
    }

    private final boolean i() {
        K0 H10 = AbstractC1484a0.H(this.f7133b);
        if (H10 != null) {
            return H10.p(K0.m.b());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i this$0, C1514p0 animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "$animation");
        double f10 = this$0.f();
        this$0.f7139h = this$0.i();
        this$0.f7138g = f10;
        if (this$0.f7143l.contains(animation)) {
            this$0.f7141j = 0;
            this$0.f7143l.remove(animation);
            return;
        }
        L9.i.b(this$0.f7134c, "KeyboardController::" + (!this$0.f7139h ? "keyboardDidHide" : "keyboardDidShow"), this$0.g(f10));
        L9.i.a(this$0.f7134c, this$0.f7132a.getId(), new K9.f(this$0.f7136e, this$0.f7132a.getId(), K9.f.f5492f.a(), f10, !this$0.f7139h ? 0.0d : 1.0d, this$0.f7141j, this$0.f7142k));
        this$0.f7141j = 0;
        L9.i.e(this$0.f7134c, this$0.f7132a.getId());
    }

    private final void l(double d10) {
        this.f7141j = 0;
        L9.i.b(this.f7134c, "KeyboardController::keyboardWillShow", g(d10));
        f.a aVar = K9.f.f5492f;
        Iterator it = CollectionsKt.m(aVar.d(), aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            L9.i.a(this.f7134c, this.f7132a.getId(), new K9.f(this.f7136e, this.f7132a.getId(), (f.a.EnumC0104a) it.next(), d10, 1.0d, 0, this.f7142k));
        }
        L9.i.b(this.f7134c, "KeyboardController::keyboardDidShow", g(d10));
        L9.i.e(this.f7134c, this.f7132a.getId());
        this.f7137f = d10;
    }

    public static /* synthetic */ void o(i iVar, Double d10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        iVar.n(d10, bool);
    }

    @Override // O9.l
    public void a(boolean z10) {
        this.f7144m = z10;
    }

    public final void d() {
        this.f7133b.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f7145n);
        e eVar = this.f7146o;
        if (eVar != null) {
            eVar.h();
        }
    }

    public boolean j() {
        return this.f7144m;
    }

    public void m(boolean z10) {
        l.a.a(this, z10);
    }

    public final void n(Double d10, Boolean bool) {
        i iVar = this;
        double doubleValue = d10 != null ? d10.doubleValue() : f();
        boolean booleanValue = bool != null ? bool.booleanValue() : i();
        iVar.f7139h = booleanValue;
        iVar.f7138g = doubleValue;
        iVar.f7140i = false;
        iVar.f7141j = 0;
        L9.i.b(iVar.f7134c, "KeyboardController::" + (!booleanValue ? "keyboardDidHide" : "keyboardDidShow"), iVar.g(doubleValue));
        f.a aVar = K9.f.f5492f;
        Iterator it = CollectionsKt.m(aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            L9.i.a(iVar.f7134c, iVar.f7132a.getId(), new K9.f(iVar.f7136e, iVar.f7132a.getId(), (f.a.EnumC0104a) it.next(), doubleValue, !iVar.f7139h ? 0.0d : 1.0d, iVar.f7141j, iVar.f7142k));
            iVar = this;
        }
    }

    @Override // androidx.core.view.C1514p0.b
    public void onEnd(final C1514p0 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onEnd(animation);
        if (!L9.l.a(animation) || j()) {
            return;
        }
        this.f7140i = false;
        this.f7141j = (int) animation.a();
        Runnable runnable = new Runnable() { // from class: O9.g
            @Override // java.lang.Runnable
            public final void run() {
                i.k(i.this, animation);
            }
        };
        if (h()) {
            this.f7133b.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.core.view.C1514p0.b
    public K0 onProgress(K0 insets, List runningAnimations) {
        Object obj;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        Iterator it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C1514p0 c1514p0 = (C1514p0) obj;
            if (L9.l.a(c1514p0) && !this.f7143l.contains(c1514p0)) {
                break;
            }
        }
        boolean z10 = obj == null;
        if (!j() && !z10) {
            androidx.core.graphics.e f10 = insets.f(this.f7135d.a());
            Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
            androidx.core.graphics.e NONE = insets.f(this.f7135d.d());
            Intrinsics.checkNotNullExpressionValue(NONE, "getInsets(...)");
            if (this.f7135d.c()) {
                NONE = androidx.core.graphics.e.f15923e;
                Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            }
            androidx.core.graphics.e a10 = androidx.core.graphics.e.a(androidx.core.graphics.e.d(f10, NONE), androidx.core.graphics.e.f15923e);
            Intrinsics.checkNotNullExpressionValue(a10, "let(...)");
            float f11 = a10.f15927d - a10.f15925b;
            double a11 = L9.e.a(f11);
            double d10 = 0.0d;
            try {
                double abs = Math.abs(a11 / this.f7137f);
                if (!Double.isNaN(abs)) {
                    if (!Double.isInfinite(abs)) {
                        d10 = abs;
                    }
                }
            } catch (ArithmeticException e10) {
                P9.a aVar = P9.a.f7630a;
                str = k.f7151a;
                P9.a.d(aVar, str, "Caught arithmetic exception during `progress` calculation: " + e10, null, 4, null);
            }
            double d11 = d10;
            P9.a aVar2 = P9.a.f7630a;
            str2 = k.f7151a;
            M9.a aVar3 = M9.a.f6095a;
            P9.a.b(aVar2, str2, "DiffY: " + f11 + " " + a11 + " " + d11 + " " + aVar3.a() + " " + this.f7142k, null, 4, null);
            L9.i.a(this.f7134c, this.f7132a.getId(), new K9.f(this.f7136e, this.f7132a.getId(), aVar3.a() ? K9.f.f5492f.b() : K9.f.f5492f.c(), a11, d11, this.f7141j, this.f7142k));
        }
        return insets;
    }

    @Override // androidx.core.view.C1514p0.b
    public C1514p0.a onStart(C1514p0 animation, C1514p0.a bounds) {
        String str;
        boolean z10;
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (!L9.l.a(animation) || j()) {
            return bounds;
        }
        this.f7140i = true;
        this.f7139h = i();
        this.f7141j = (int) animation.a();
        double f10 = f();
        if (this.f7139h) {
            this.f7137f = f10;
        }
        e eVar = this.f7146o;
        if (eVar != null) {
            eVar.m();
        }
        boolean z11 = (f10 == 0.0d || this.f7138g == f10) ? false : true;
        boolean z12 = this.f7139h && this.f7138g != 0.0d;
        if (z11 && z12) {
            z10 = k.f7152b;
            if (z10) {
                l(f10);
                this.f7143l.add(animation);
                return bounds;
            }
        }
        L9.i.b(this.f7134c, "KeyboardController::" + (!this.f7139h ? "keyboardWillHide" : "keyboardWillShow"), g(f10));
        P9.a aVar = P9.a.f7630a;
        str = k.f7151a;
        P9.a.b(aVar, str, "HEIGHT:: " + f10 + " TAG:: " + this.f7142k, null, 4, null);
        L9.i.a(this.f7134c, this.f7132a.getId(), new K9.f(this.f7136e, this.f7132a.getId(), K9.f.f5492f.d(), f10, this.f7139h ? 1.0d : 0.0d, this.f7141j, this.f7142k));
        C1514p0.a onStart = super.onStart(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(onStart, "onStart(...)");
        return onStart;
    }

    @Override // androidx.core.view.I
    public K0 p(View v10, K0 insets) {
        boolean z10;
        String str;
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        double f10 = f();
        boolean z11 = (this.f7139h && i()) && !(this.f7140i || M9.a.f6095a.a());
        boolean z12 = this.f7137f == f10;
        if (z11 && !z12) {
            z10 = k.f7152b;
            if (!z10) {
                P9.a aVar = P9.a.f7630a;
                str = k.f7151a;
                P9.a.b(aVar, str, "onApplyWindowInsets: " + this.f7137f + " -> " + f10, null, 4, null);
                e eVar = this.f7146o;
                if (eVar != null) {
                    eVar.m();
                }
                l(f10);
            }
        }
        return insets;
    }
}
