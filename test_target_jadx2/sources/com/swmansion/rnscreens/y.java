package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import ga.AnimationAnimationListenerC3211d;
import ha.C3302b;
import ia.AbstractC3361b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;
import u5.C4870a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0011\b\u0016\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0003:.\u001fB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0004J\u001f\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u0017\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u00109R(\u0010@\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b?\u0010\u0004\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0007R \u0010E\u001a\b\u0012\u0004\u0012\u00020+0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010FR\u0016\u0010I\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\u001dR\u0016\u0010J\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0016\u0010L\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010FR\u0016\u0010N\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0014\u0010P\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010O¨\u0006R"}, d2 = {"Lcom/swmansion/rnscreens/y;", "Landroidx/fragment/app/o;", "Lcom/swmansion/rnscreens/z;", "<init>", "()V", "Lcom/swmansion/rnscreens/r;", "screenView", "(Lcom/swmansion/rnscreens/r;)V", BuildConfig.FLAVOR, "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "s", "Landroid/app/Activity;", "e", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "k", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/y$b;", Keys.EVENT, BuildConfig.FLAVOR, "F", "(Lcom/swmansion/rnscreens/y$b;)Z", "c", "(Lcom/swmansion/rnscreens/y$b;)V", "fragmentWrapper", "H", "(Lcom/swmansion/rnscreens/y$b;Lcom/swmansion/rnscreens/z;)V", "o", "G", BuildConfig.FLAVOR, "alpha", "closing", "M", "(FZ)V", "Lcom/swmansion/rnscreens/t;", "r", "(Lcom/swmansion/rnscreens/t;)V", "b", "Q", "P", "onDestroy", "S", "K", "I", "L", "J", "animationEnd", "N", "(Z)V", C4870a.f43493a, "Lcom/swmansion/rnscreens/r;", "m", "()Lcom/swmansion/rnscreens/r;", "R", "getScreen$annotations", "screen", BuildConfig.FLAVOR, "Ljava/util/List;", "q", "()Ljava/util/List;", "childScreenContainers", "Z", "shouldUpdateOnResume", "d", "transitionProgress", "canDispatchWillAppear", "f", "canDispatchAppear", "g", "isTransitioning", "()Landroidx/fragment/app/o;", "fragment", "h", "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class y extends ComponentCallbacksC1573o implements z {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public r screen;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List childScreenContainers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shouldUpdateOnResume;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float transitionProgress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchWillAppear;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean canDispatchAppear;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioning;

    /* renamed from: com.swmansion.rnscreens.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            return (short) (f10 == 0.0f ? 1 : f10 == 1.0f ? 2 : 3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DID_APPEAR = new b("DID_APPEAR", 0);
        public static final b WILL_APPEAR = new b("WILL_APPEAR", 1);
        public static final b DID_DISAPPEAR = new b("DID_DISAPPEAR", 2);
        public static final b WILL_DISAPPEAR = new b("WILL_DISAPPEAR", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{DID_APPEAR, WILL_APPEAR, DID_DISAPPEAR, WILL_DISAPPEAR};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30082a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30082a = iArr;
        }
    }

    public y() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void I() {
        H(b.DID_APPEAR, this);
        M(1.0f, false);
    }

    private final void J() {
        H(b.DID_DISAPPEAR, this);
        M(1.0f, true);
    }

    private final void K() {
        H(b.WILL_APPEAR, this);
        M(0.0f, false);
    }

    private final void L() {
        H(b.WILL_DISAPPEAR, this);
        M(0.0f, true);
    }

    private final void N(final boolean animationEnd) {
        ComponentCallbacksC1573o parentFragment;
        this.isTransitioning = !animationEnd;
        if (getParentFragment() instanceof AnimationAnimationListenerC3211d) {
            ComponentCallbacksC1573o parentFragment2 = getParentFragment();
            parentFragment = parentFragment2 != null ? parentFragment2.getParentFragment() : null;
        } else {
            parentFragment = getParentFragment();
        }
        if (parentFragment == null || ((parentFragment instanceof y) && !((y) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.O(animationEnd, this);
                    }
                });
            } else if (animationEnd) {
                J();
            } else {
                L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(boolean z10, y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            this$0.I();
        } else {
            this$0.K();
        }
    }

    private final void S() {
        AbstractActivityC1577t activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            L.f29898a.x(m(), activity, k());
        }
    }

    public boolean F(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f30082a[event.ordinal()];
        if (i10 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i10 == 2) {
            return this.canDispatchAppear;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new lc.m();
            }
            if (!this.canDispatchAppear) {
                return true;
            }
        } else if (!this.canDispatchWillAppear) {
            return true;
        }
        return false;
    }

    public void G() {
        Context context = m().getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int e10 = L0.e(reactContext);
        EventDispatcher c10 = L0.c(reactContext, m().getId());
        if (c10 != null) {
            c10.c(new C3302b(e10, m().getId()));
        }
    }

    public void H(b event, z fragmentWrapper) {
        com.facebook.react.uimanager.events.d iVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        ComponentCallbacksC1573o f10 = fragmentWrapper.f();
        if (f10 instanceof C) {
            C c10 = (C) f10;
            if (c10.F(event)) {
                r m10 = c10.m();
                fragmentWrapper.c(event);
                int f11 = L0.f(m10);
                int i10 = d.f30082a[event.ordinal()];
                if (i10 == 1) {
                    iVar = new ha.i(f11, m10.getId());
                } else if (i10 == 2) {
                    iVar = new ha.e(f11, m10.getId());
                } else if (i10 == 3) {
                    iVar = new ha.j(f11, m10.getId());
                } else {
                    if (i10 != 4) {
                        throw new lc.m();
                    }
                    iVar = new ha.f(f11, m10.getId());
                }
                Context context = m().getContext();
                Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher c11 = L0.c((ReactContext) context, m().getId());
                if (c11 != null) {
                    c11.c(iVar);
                }
                fragmentWrapper.o(event);
            }
        }
    }

    public void M(float alpha, boolean closing) {
        if (!(this instanceof C) || this.transitionProgress == alpha) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, alpha));
        this.transitionProgress = max;
        short a10 = INSTANCE.a(max);
        C2949t container = m().getContainer();
        boolean goingForward = container instanceof B ? ((B) container).getGoingForward() : false;
        Context context = m().getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher c10 = L0.c(reactContext, m().getId());
        if (c10 != null) {
            c10.c(new ha.h(L0.e(reactContext), m().getId(), this.transitionProgress, closing, goingForward, a10));
        }
    }

    public void P() {
        N(true);
    }

    public void Q() {
        N(false);
    }

    public void R(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.screen = rVar;
    }

    @Override // com.swmansion.rnscreens.z
    public void b(C2949t container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.v
    public void c(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f30082a[event.ordinal()];
        if (i10 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i10 == 2) {
            this.canDispatchAppear = false;
        } else if (i10 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i10 != 4) {
                return;
            }
            this.canDispatchAppear = true;
        }
    }

    @Override // com.swmansion.rnscreens.z
    public Activity e() {
        ComponentCallbacksC1573o fragment;
        AbstractActivityC1577t activity;
        AbstractActivityC1577t activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = m().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = m().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof r) && (fragment = ((r) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.InterfaceC2938h
    public ComponentCallbacksC1573o f() {
        return this;
    }

    @Override // com.swmansion.rnscreens.z
    public ReactContext k() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (m().getContext() instanceof ReactContext) {
            Context context2 = m().getContext();
            Intrinsics.e(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = m().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof r) {
                r rVar = (r) container;
                if (rVar.getContext() instanceof ReactContext) {
                    Context context3 = rVar.getContext();
                    Intrinsics.e(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.z
    public r m() {
        r rVar = this.screen;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.v("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.v
    public void o(b event) {
        z fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        List childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((C2949t) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r topScreen = ((C2949t) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                H(event, fragmentWrapper);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(AbstractC3361b.b(m()));
        return cVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onDestroy() {
        super.onDestroy();
        C2949t container = m().getContainer();
        if (container == null || !container.n(m().getFragmentWrapper())) {
            Context context = m().getContext();
            if (context instanceof ReactContext) {
                int e10 = L0.e(context);
                EventDispatcher c10 = L0.c((ReactContext) context, m().getId());
                if (c10 != null) {
                    c10.c(new ha.g(e10, m().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            L.f29898a.x(m(), e(), k());
        }
    }

    @Override // com.swmansion.rnscreens.z
    /* renamed from: q, reason: from getter */
    public List getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.z
    public void r(C2949t container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().add(container);
    }

    public void s() {
        S();
    }

    public y(r screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        R(screenView);
    }
}
