package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.F0;
import ea.AbstractC3109d;
import ea.C3112g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final a f29776g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactContext f29777a;

    /* renamed from: b, reason: collision with root package name */
    private final C3112g f29778b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3109d f29779c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f29780d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29781e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29782f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof A0)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private a() {
        }
    }

    public final class b extends AbstractC3109d {
        public b() {
        }

        @Override // ea.AbstractC3109d
        protected void f0() {
            i.this.f29781e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (i.this.f() instanceof A0) {
                ((A0) i.this.f()).b(i.this.f(), obtain);
            }
            obtain.recycle();
        }

        @Override // ea.AbstractC3109d
        protected void g0(MotionEvent event, MotionEvent sourceEvent) {
            C3112g N10;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
            if (Q() == 0 && (!i.this.f29781e || (N10 = N()) == null || !N10.r())) {
                n();
                i.this.f29781e = false;
            }
            if (event.getActionMasked() == 1) {
                z();
            }
        }
    }

    public i(ReactContext context, ViewGroup wrappedView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.f29777a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        if (id2 < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + wrappedView).toString());
        }
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((F0) context).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.d(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        g registry = rNGestureHandlerModule.getRegistry();
        ViewGroup b10 = f29776g.b(wrappedView);
        this.f29780d = b10;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + b10);
        C3112g c3112g = new C3112g(wrappedView, registry, new m());
        c3112g.B(0.1f);
        this.f29778b = c3112g;
        b bVar = new b();
        bVar.F0(-id2);
        this.f29779c = bVar;
        registry.j(bVar);
        registry.c(bVar.R(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k();
    }

    private final void k() {
        AbstractC3109d abstractC3109d = this.f29779c;
        if (abstractC3109d == null || abstractC3109d.Q() != 2) {
            return;
        }
        abstractC3109d.i();
        abstractC3109d.z();
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C3112g c3112g = this.f29778b;
        if (c3112g != null) {
            c3112g.d(view);
        }
    }

    public final boolean e(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.f29782f = true;
        C3112g c3112g = this.f29778b;
        Intrinsics.d(c3112g);
        c3112g.x(ev);
        this.f29782f = false;
        return this.f29781e;
    }

    public final ViewGroup f() {
        return this.f29780d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.h(i.this);
                }
            });
        }
    }

    public final void i() {
        if (this.f29778b == null || this.f29782f) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f29780d);
        ReactContext reactContext = this.f29777a;
        Intrinsics.e(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((F0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        Intrinsics.d(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        g registry = rNGestureHandlerModule.getRegistry();
        AbstractC3109d abstractC3109d = this.f29779c;
        Intrinsics.d(abstractC3109d);
        registry.g(abstractC3109d.R());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
