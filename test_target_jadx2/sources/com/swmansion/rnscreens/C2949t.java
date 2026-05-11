package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import com.facebook.react.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.swmansion.rnscreens.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2949t extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final ArrayList f30031a;

    /* renamed from: b, reason: collision with root package name */
    protected androidx.fragment.app.G f30032b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30033c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30034d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30035e;

    /* renamed from: f, reason: collision with root package name */
    private final O4.a f30036f;

    /* renamed from: g, reason: collision with root package name */
    private z f30037g;

    /* renamed from: com.swmansion.rnscreens.t$a */
    public static final class a extends O4.a {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C2949t.this.f30035e = false;
            C2949t c2949t = C2949t.this;
            c2949t.measure(View.MeasureSpec.makeMeasureSpec(c2949t.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C2949t.this.getHeight(), 1073741824));
            C2949t c2949t2 = C2949t.this;
            c2949t2.layout(c2949t2.getLeft(), C2949t.this.getTop(), C2949t.this.getRight(), C2949t.this.getBottom());
        }
    }

    public C2949t(Context context) {
        super(context);
        this.f30031a = new ArrayList();
        this.f30036f = new a();
    }

    private final void f(androidx.fragment.app.P p10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        p10.b(getId(), componentCallbacksC1573o);
    }

    private final void i(androidx.fragment.app.P p10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        p10.m(componentCallbacksC1573o);
    }

    private final androidx.fragment.app.G j(Z z10) {
        boolean z11;
        androidx.fragment.app.G supportFragmentManager;
        Context context = z10.getContext();
        while (true) {
            z11 = context instanceof AbstractActivityC1577t;
            if (z11 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z11) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC1577t abstractActivityC1577t = (AbstractActivityC1577t) context;
        if (abstractActivityC1577t.getSupportFragmentManager().v0().isEmpty()) {
            androidx.fragment.app.G supportFragmentManager2 = abstractActivityC1577t.getSupportFragmentManager();
            Intrinsics.d(supportFragmentManager2);
            return supportFragmentManager2;
        }
        try {
            supportFragmentManager = androidx.fragment.app.G.g0(z10).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            supportFragmentManager = abstractActivityC1577t.getSupportFragmentManager();
        }
        Intrinsics.d(supportFragmentManager);
        return supportFragmentManager;
    }

    private final r.a k(z zVar) {
        return zVar.m().getActivityState();
    }

    private final void r() {
        this.f30034d = true;
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((F0) context).b().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.s
            @Override // java.lang.Runnable
            public final void run() {
                C2949t.s(C2949t.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C2949t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u();
    }

    private final void setFragmentManager(androidx.fragment.app.G g10) {
        this.f30032b = g10;
        v();
    }

    private final void x(androidx.fragment.app.G g10) {
        androidx.fragment.app.P n10 = g10.n();
        Intrinsics.checkNotNullExpressionValue(n10, "beginTransaction(...)");
        boolean z10 = false;
        for (ComponentCallbacksC1573o componentCallbacksC1573o : g10.v0()) {
            if ((componentCallbacksC1573o instanceof y) && ((y) componentCallbacksC1573o).m().getContainer() == this) {
                n10.m(componentCallbacksC1573o);
                z10 = true;
            }
        }
        if (z10) {
            n10.j();
        }
    }

    private final void z() {
        boolean z10;
        Unit unit;
        ViewParent viewParent = this;
        while (true) {
            z10 = viewParent instanceof Z;
            if (z10 || (viewParent instanceof r) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            Intrinsics.checkNotNullExpressionValue(viewParent, "getParent(...)");
        }
        if (!(viewParent instanceof r)) {
            if (!z10) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(j((Z) viewParent));
            return;
        }
        z fragmentWrapper = ((r) viewParent).getFragmentWrapper();
        if (fragmentWrapper != null) {
            this.f30037g = fragmentWrapper;
            fragmentWrapper.r(this);
            androidx.fragment.app.G childFragmentManager = fragmentWrapper.f().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager);
            unit = Unit.f36324a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Parent Screen does not have its Fragment attached");
        }
    }

    protected z c(r screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new y(screen);
    }

    public final void d(r screen, int i10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        z c10 = c(screen);
        screen.setFragmentWrapper(c10);
        this.f30031a.add(i10, c10);
        screen.setContainer(this);
        r();
    }

    public final void e() {
        if (this.f30031a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.P g10 = g();
        r topScreen = getTopScreen();
        Intrinsics.e(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        ComponentCallbacksC1573o fragment = topScreen.getFragment();
        Intrinsics.e(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(g10, fragment);
        ArrayList arrayList = this.f30031a;
        f(g10, ((z) arrayList.get(arrayList.size() - 2)).f());
        ComponentCallbacksC1573o fragment2 = topScreen.getFragment();
        Intrinsics.e(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(g10, fragment2);
        g10.j();
    }

    protected final androidx.fragment.app.P g() {
        androidx.fragment.app.G g10 = this.f30032b;
        if (g10 == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.P t10 = g10.n().t(true);
        Intrinsics.checkNotNullExpressionValue(t10, "setReorderingAllowed(...)");
        return t10;
    }

    public final int getScreenCount() {
        return this.f30031a.size();
    }

    public r getTopScreen() {
        Object obj;
        Iterator it = this.f30031a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k((z) obj) == r.a.ON_TOP) {
                break;
            }
        }
        z zVar = (z) obj;
        if (zVar != null) {
            return zVar.m();
        }
        return null;
    }

    public final void h() {
        if (this.f30031a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.P g10 = g();
        ArrayList arrayList = this.f30031a;
        i(g10, ((z) arrayList.get(arrayList.size() - 2)).f());
        g10.j();
    }

    public final r l(int i10) {
        return ((z) this.f30031a.get(i10)).m();
    }

    public final z m(int i10) {
        Object obj = this.f30031a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (z) obj;
    }

    public boolean n(z zVar) {
        return CollectionsKt.V(this.f30031a, zVar);
    }

    public final void o() {
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30033c = true;
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.fragment.app.G g10 = this.f30032b;
        if (g10 != null && !g10.I0()) {
            x(g10);
            g10.d0();
        }
        z zVar = this.f30037g;
        if (zVar != null) {
            zVar.b(this);
        }
        this.f30037g = null;
        super.onDetachedFromWindow();
        this.f30033c = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    protected void p() {
        z fragmentWrapper;
        r topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.s();
    }

    public final void q() {
        r topScreen = getTopScreen();
        Intrinsics.e(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int e10 = L0.e(getContext());
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher c10 = L0.c((ReactContext) context, topScreen.getId());
            if (c10 != null) {
                c10.c(new ha.g(e10, topScreen.getId()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f30035e || this.f30036f == null) {
            return;
        }
        this.f30035e = true;
        com.facebook.react.modules.core.a.f21757f.a().k(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.f30036f);
    }

    public void t() {
        androidx.fragment.app.P g10 = g();
        androidx.fragment.app.G g11 = this.f30032b;
        if (g11 == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(g11.v0());
        Iterator it = this.f30031a.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            Intrinsics.d(zVar);
            if (k(zVar) == r.a.INACTIVE && zVar.f().isAdded()) {
                i(g10, zVar.f());
            }
            hashSet.remove(zVar.f());
        }
        boolean z10 = false;
        if (!hashSet.isEmpty()) {
            for (ComponentCallbacksC1573o componentCallbacksC1573o : (ComponentCallbacksC1573o[]) hashSet.toArray(new ComponentCallbacksC1573o[0])) {
                if ((componentCallbacksC1573o instanceof y) && ((y) componentCallbacksC1573o).m().getContainer() == null) {
                    i(g10, componentCallbacksC1573o);
                }
            }
        }
        boolean z11 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f30031a.iterator();
        while (it2.hasNext()) {
            z zVar2 = (z) it2.next();
            Intrinsics.d(zVar2);
            r.a k10 = k(zVar2);
            r.a aVar = r.a.INACTIVE;
            if (k10 != aVar && !zVar2.f().isAdded()) {
                f(g10, zVar2.f());
                z10 = true;
            } else if (k10 != aVar && z10) {
                i(g10, zVar2.f());
                arrayList.add(zVar2);
            }
            zVar2.m().setTransitioning(z11);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            f(g10, ((z) it3.next()).f());
        }
        g10.j();
    }

    public final void u() {
        androidx.fragment.app.G g10;
        if (this.f30034d && this.f30033c && (g10 = this.f30032b) != null) {
            if (g10 == null || !g10.I0()) {
                this.f30034d = false;
                t();
                p();
            }
        }
    }

    protected final void v() {
        this.f30034d = true;
        u();
    }

    public void w() {
        Iterator it = this.f30031a.iterator();
        while (it.hasNext()) {
            ((z) it.next()).m().setContainer(null);
        }
        this.f30031a.clear();
        r();
    }

    public void y(int i10) {
        ((z) this.f30031a.get(i10)).m().setContainer(null);
        this.f30031a.remove(i10);
        r();
    }
}
