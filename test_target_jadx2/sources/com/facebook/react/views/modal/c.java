package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import c3.AbstractC1721a;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.r;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.j;
import com.facebook.react.views.view.o;
import i5.C3321a;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends ViewGroup implements LifecycleEventListener {

    /* renamed from: j, reason: collision with root package name */
    private static final a f22569j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Dialog f22570a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22571b;

    /* renamed from: c, reason: collision with root package name */
    private DialogInterface.OnShowListener f22572c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0385c f22573d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22574e;

    /* renamed from: f, reason: collision with root package name */
    private String f22575f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22576g;

    /* renamed from: h, reason: collision with root package name */
    private final b f22577h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22578i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends j implements A0 {

        /* renamed from: a, reason: collision with root package name */
        private E0 f22579a;

        /* renamed from: b, reason: collision with root package name */
        private EventDispatcher f22580b;

        /* renamed from: c, reason: collision with root package name */
        private int f22581c;

        /* renamed from: d, reason: collision with root package name */
        private int f22582d;

        /* renamed from: e, reason: collision with root package name */
        private final T f22583e;

        /* renamed from: f, reason: collision with root package name */
        private S f22584f;

        public static final class a extends GuardedRunnable {
            a(F0 f02) {
                super(f02);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(b.this.getId(), b.this.f22581c, b.this.f22582d);
                }
            }
        }

        public b(Context context) {
            super(context);
            this.f22583e = new T(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.f22584f = new S(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final F0 getReactContext() {
            Context context = getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (F0) context;
        }

        @Override // com.facebook.react.uimanager.A0
        public void a(Throwable t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            getReactContext().b().handleException(new RuntimeException(t10));
        }

        @Override // com.facebook.react.uimanager.A0
        public void b(View childView, MotionEvent ev) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null) {
                this.f22583e.g(ev, eventDispatcher);
                S s10 = this.f22584f;
                if (s10 != null) {
                    s10.p(childView, ev, eventDispatcher);
                }
            }
        }

        @Override // com.facebook.react.uimanager.A0
        public void d(View childView, MotionEvent ev) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null) {
                this.f22583e.f(ev, eventDispatcher);
            }
            S s10 = this.f22584f;
            if (s10 != null) {
                s10.o();
            }
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.f22580b;
        }

        public final E0 getStateWrapper$ReactAndroid_release() {
            return this.f22579a;
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent event) {
            S s10;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null && (s10 = this.f22584f) != null) {
                s10.k(event, eventDispatcher, false);
            }
            return super.onHoverEvent(event);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent event) {
            S s10;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null && (s10 = this.f22584f) != null) {
                s10.k(event, eventDispatcher, true);
            }
            return super.onHoverEvent(event);
        }

        @Override // com.facebook.react.views.view.j, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null) {
                this.f22583e.d(event, eventDispatcher, getReactContext());
                S s10 = this.f22584f;
                if (s10 != null) {
                    s10.k(event, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // com.facebook.react.views.view.j, android.view.View
        protected void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            this.f22581c = i10;
            this.f22582d = i11;
            u(i10, i11);
        }

        @Override // com.facebook.react.views.view.j, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.f22580b;
            if (eventDispatcher != null) {
                this.f22583e.d(event, eventDispatcher, getReactContext());
                S s10 = this.f22584f;
                if (s10 != null) {
                    s10.k(event, eventDispatcher, false);
                }
            }
            super.onTouchEvent(event);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z10) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.f22580b = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(E0 e02) {
            this.f22579a = e02;
        }

        public final void u(int i10, int i11) {
            Unit unit;
            C1944g0 c1944g0 = C1944g0.f22418a;
            float d10 = c1944g0.d(i10);
            float d11 = c1944g0.d(i11);
            E0 e02 = this.f22579a;
            if (e02 != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", d10);
                writableNativeMap.putDouble("screenHeight", d11);
                e02.updateState(writableNativeMap);
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                getReactContext().runOnNativeModulesQueueThread(new a(getReactContext()));
            }
        }
    }

    /* renamed from: com.facebook.react.views.modal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0385c {
        void a(DialogInterface dialogInterface);
    }

    public static final class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialog, int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 1) {
                return false;
            }
            if (i10 == 4 || i10 == 111) {
                InterfaceC0385c onRequestCloseListener = c.this.getOnRequestCloseListener();
                if (onRequestCloseListener == null) {
                    throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
                }
                onRequestCloseListener.a(dialog);
                return true;
            }
            Context context = c.this.getContext();
            Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i10, event);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(F0 context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        context.addLifecycleEventListener(this);
        this.f22577h = new b(context);
    }

    private final void a() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f22570a;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) C3321a.a(dialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                dialog.dismiss();
            }
            this.f22570a = null;
            this.f22578i = true;
            ViewParent parent = this.f22577h.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final void d() {
        Dialog dialog = this.f22570a;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Intrinsics.checkNotNullExpressionValue(window, "checkNotNull(...)");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & 1024) != 0) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
            }
            o.b(window, this.f22574e);
            if (this.f22571b) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e10) {
            AbstractC1721a.o("ReactNative", "ReactModalHostView: error while setting window flags: ", e10.getMessage());
        }
    }

    private final void e() {
        WindowInsetsController insetsController;
        int systemBarsAppearance;
        WindowInsetsController insetsController2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Dialog dialog = this.f22570a;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Intrinsics.checkNotNullExpressionValue(window, "checkNotNull(...)");
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        insetsController = window2.getInsetsController();
        if (insetsController == null) {
            throw new IllegalStateException("Required value was null.");
        }
        systemBarsAppearance = insetsController.getSystemBarsAppearance();
        int i10 = systemBarsAppearance & 8;
        insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(i10, 8);
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f22577h);
        if (!this.f22574e) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((F0) context).getCurrentActivity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f22577h.addView(view, i10);
    }

    public final void b() {
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((F0) context).removeLifecycleEventListener(this);
        a();
    }

    public final void c() {
        Window window;
        UiThreadUtil.assertOnUiThread();
        if (!this.f22578i) {
            d();
            return;
        }
        a();
        this.f22578i = false;
        String str = this.f22575f;
        int i10 = Intrinsics.b(str, "fade") ? r.f21956e : Intrinsics.b(str, "slide") ? r.f21957f : r.f21955d;
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i10);
        this.f22570a = dialog;
        Window window2 = dialog.getWindow();
        Objects.requireNonNull(window2);
        window2.setFlags(8, 8);
        dialog.setContentView(getContentView());
        d();
        dialog.setOnShowListener(this.f22572c);
        dialog.setOnKeyListener(new d());
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
        if (this.f22576g && (window = dialog.getWindow()) != null) {
            window.addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        e();
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.clearFlags(8);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        this.f22577h.dispatchProvideStructure(structure);
    }

    public final String getAnimationType() {
        return this.f22575f;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f22577h.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f22577h.getChildCount();
    }

    public final Dialog getDialog() {
        return this.f22570a;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.f22577h.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.f22576g;
    }

    public final InterfaceC0385c getOnRequestCloseListener() {
        return this.f22573d;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.f22572c;
    }

    public final E0 getStateWrapper() {
        return this.f22577h.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.f22574e;
    }

    public final boolean getTransparent() {
        return this.f22571b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f22577h.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f22577h.removeView(getChildAt(i10));
    }

    public final void setAnimationType(String str) {
        this.f22575f = str;
        this.f22578i = true;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f22577h.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z10) {
        this.f22576g = z10;
        this.f22578i = true;
    }

    @Override // android.view.View
    public void setId(int i10) {
        super.setId(i10);
        this.f22577h.setId(i10);
    }

    public final void setOnRequestCloseListener(InterfaceC0385c interfaceC0385c) {
        this.f22573d = interfaceC0385c;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f22572c = onShowListener;
    }

    public final void setStateWrapper(E0 e02) {
        this.f22577h.setStateWrapper$ReactAndroid_release(e02);
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.f22574e = z10;
        this.f22578i = true;
    }

    public final void setTransparent(boolean z10) {
        this.f22571b = z10;
    }
}
