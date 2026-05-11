package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1967s0;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.InterfaceC1965r0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC4012a;
import s5.C4313a;

/* loaded from: classes.dex */
public class Z extends FrameLayout implements A0, InterfaceC1965r0 {

    /* renamed from: a, reason: collision with root package name */
    private J f21160a;

    /* renamed from: b, reason: collision with root package name */
    private String f21161b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f21162c;

    /* renamed from: d, reason: collision with root package name */
    private a f21163d;

    /* renamed from: e, reason: collision with root package name */
    private int f21164e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21165f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21166g;

    /* renamed from: h, reason: collision with root package name */
    private com.facebook.react.uimanager.T f21167h;

    /* renamed from: i, reason: collision with root package name */
    private com.facebook.react.uimanager.S f21168i;

    /* renamed from: j, reason: collision with root package name */
    private final C1994w f21169j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21170k;

    /* renamed from: l, reason: collision with root package name */
    private int f21171l;

    /* renamed from: m, reason: collision with root package name */
    private int f21172m;

    /* renamed from: n, reason: collision with root package name */
    private int f21173n;

    /* renamed from: o, reason: collision with root package name */
    private int f21174o;

    /* renamed from: p, reason: collision with root package name */
    private int f21175p;

    /* renamed from: q, reason: collision with root package name */
    private int f21176q;

    /* renamed from: r, reason: collision with root package name */
    private int f21177r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f21178s;

    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f21179a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21180b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21181c = false;

        /* renamed from: d, reason: collision with root package name */
        private int f21182d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f21183e = 0;

        a() {
            C1978y.f(Z.this.getContext().getApplicationContext());
            this.f21179a = new Rect();
            this.f21180b = (int) C1944g0.g(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) Z.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f21183e == rotation) {
                return;
            }
            this.f21183e = rotation;
            C1978y.e(Z.this.getContext().getApplicationContext());
            f(rotation);
        }

        private void c() {
            int ime;
            boolean isVisible;
            int ime2;
            Insets insets;
            int systemBars;
            Insets insets2;
            int i10;
            int i11;
            Z.this.getRootView().getWindowVisibleDisplayFrame(this.f21179a);
            WindowInsets rootWindowInsets = Z.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                return;
            }
            ime = WindowInsets.Type.ime();
            isVisible = rootWindowInsets.isVisible(ime);
            if (isVisible != this.f21181c) {
                this.f21181c = isVisible;
                if (!isVisible) {
                    Z.this.r("keyboardDidHide", e(C1944g0.e(this.f21179a.height()), 0.0d, C1944g0.e(this.f21179a.width()), 0.0d));
                    return;
                }
                ime2 = WindowInsets.Type.ime();
                insets = rootWindowInsets.getInsets(ime2);
                systemBars = WindowInsets.Type.systemBars();
                insets2 = rootWindowInsets.getInsets(systemBars);
                i10 = insets.bottom;
                i11 = insets2.bottom;
                int i12 = i10 - i11;
                ViewGroup.LayoutParams layoutParams = Z.this.getRootView().getLayoutParams();
                AbstractC4012a.a(layoutParams instanceof WindowManager.LayoutParams);
                Z.this.r("keyboardDidShow", e(C1944g0.e(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.f21179a.bottom - i12 : this.f21179a.bottom), C1944g0.e(this.f21179a.left), C1944g0.e(this.f21179a.width()), C1944g0.e(i12)));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            r0 = r0.getDisplayCutout();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void d() {
            DisplayCutout displayCutout;
            Z.this.getRootView().getWindowVisibleDisplayFrame(this.f21179a);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (r0 = Z.this.getRootView().getRootWindowInsets()) == null || displayCutout == null) ? 0 : displayCutout.getSafeInsetTop();
            int i10 = (C1978y.d().heightPixels - this.f21179a.bottom) + safeInsetTop;
            int i11 = this.f21182d;
            if (i11 != i10 && i10 > this.f21180b) {
                this.f21182d = i10;
                this.f21181c = true;
                Z.this.r("keyboardDidShow", e(C1944g0.e(r4), C1944g0.e(this.f21179a.left), C1944g0.e(this.f21179a.width()), C1944g0.e(this.f21182d)));
            } else {
                if (i11 == 0 || i10 > this.f21180b) {
                    return;
                }
                this.f21182d = 0;
                this.f21181c = false;
                Z.this.r("keyboardDidHide", e(C1944g0.e(r3.height()), 0.0d, C1944g0.e(this.f21179a.width()), 0.0d));
            }
        }

        private WritableMap e(double d10, double d11, double d12, double d13) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d13);
            createMap2.putDouble("screenX", d11);
            createMap2.putDouble("width", d12);
            createMap2.putDouble("screenY", d10);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void f(int i10) {
            String str;
            double d10;
            boolean z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    str = "landscape-primary";
                    d10 = -90.0d;
                } else if (i10 == 2) {
                    str = "portrait-secondary";
                    d10 = 180.0d;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d10 = 90.0d;
                }
                z10 = true;
            } else {
                str = "portrait-primary";
                d10 = 0.0d;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("name", str);
            createMap.putDouble("rotationDegrees", d10);
            createMap.putBoolean("isLandscape", z10);
            Z.this.r("namedOrientationDidChange", createMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = Z.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Z.this.i() && Z.this.o()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    public interface b {
    }

    public Z(Context context) {
        super(context);
        this.f21164e = 0;
        this.f21169j = new C1994w(this);
        this.f21170k = false;
        this.f21171l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f21172m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f21173n = 0;
        this.f21174o = 0;
        this.f21175p = Integer.MIN_VALUE;
        this.f21176q = Integer.MIN_VALUE;
        this.f21177r = 1;
        this.f21178s = new AtomicInteger(0);
        k();
    }

    private void f() {
        C4313a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new com.facebook.react.uimanager.Q("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.f21165f) {
                return;
            }
            this.f21165f = true;
            ((J) AbstractC4012a.c(this.f21160a)).t(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            C4313a.i(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f21163d == null) {
            this.f21163d = new a();
        }
        return this.f21163d;
    }

    private void k() {
        setRootViewTag(C1967s0.a());
        setClipChildren(false);
    }

    private boolean l() {
        if (!i() || !o()) {
            AbstractC1721a.J("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        }
        if (this.f21167h == null) {
            AbstractC1721a.J("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.f21168i != null) {
            return true;
        }
        AbstractC1721a.J("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i10 = this.f21164e;
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    private void q() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void s() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f21171l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f21172m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void w(boolean z10, int i10, int i11) {
        UIManager g10;
        int i12;
        int i13;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!j()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC1721a.J("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean m10 = m();
        if (m10 && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            AbstractC1721a.m("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (g10 = L0.g(currentReactContext, getUIManagerType())) != null) {
            if (m10) {
                Point b10 = B0.b(this);
                i12 = b10.x;
                i13 = b10.y;
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (z10 || i12 != this.f21175p || i13 != this.f21176q) {
                g10.updateRootLayoutSpecs(getRootViewTag(), i10, i11, i12, i13);
            }
            this.f21175p = i12;
            this.f21176q = i13;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.A0
    public void a(Throwable th) {
        if (!i()) {
            throw new RuntimeException(th);
        }
        getCurrentReactContext().handleException(new com.facebook.react.uimanager.Q(th.getMessage(), this, th));
    }

    @Override // com.facebook.react.uimanager.A0
    public void b(View view, MotionEvent motionEvent) {
        EventDispatcher b10;
        com.facebook.react.uimanager.S s10;
        if (l() && (b10 = L0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f21167h.g(motionEvent, b10);
            if (view == null || (s10 = this.f21168i) == null) {
                return;
            }
            s10.p(view, motionEvent, b10);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public void c(int i10) {
        if (i10 != 101) {
            return;
        }
        p();
    }

    @Override // com.facebook.react.uimanager.A0
    public void d(View view, MotionEvent motionEvent) {
        EventDispatcher b10;
        if (l() && (b10 = L0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f21167h.f(motionEvent, b10);
            com.facebook.react.uimanager.S s10 = this.f21168i;
            if (s10 != null) {
                s10.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e10) {
            a(e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (i() && o()) {
            this.f21169j.d(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        AbstractC1721a.J("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public void e() {
        C4313a.c(0L, "ReactRootView.runApplication");
        try {
            if (j() && o()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    C4313a.i(0L);
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f21170k) {
                    w(true, this.f21171l, this.f21172m);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f21166g = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                C4313a.i(0L);
            }
        } finally {
            C4313a.i(0L);
        }
    }

    protected void finalize() {
        super.finalize();
        AbstractC4012a.b(!this.f21165f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    protected void g(MotionEvent motionEvent, boolean z10) {
        if (!i() || !o()) {
            AbstractC1721a.J("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f21168i == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC1721a.J("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            }
        } else {
            EventDispatcher b10 = L0.b(getCurrentReactContext(), getUIManagerType());
            if (b10 != null) {
                this.f21168i.k(motionEvent, b10, z10);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public Bundle getAppProperties() {
        return this.f21162c;
    }

    public ReactContext getCurrentReactContext() {
        J j10 = this.f21160a;
        if (j10 == null) {
            return null;
        }
        return j10.D();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public int getHeightMeasureSpec() {
        return this.f21172m;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public String getJSModuleName() {
        return (String) AbstractC4012a.c(this.f21161b);
    }

    public J getReactInstanceManager() {
        return this.f21160a;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public int getRootViewTag() {
        return this.f21164e;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public AtomicInteger getState() {
        return this.f21178s;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public int getUIManagerType() {
        return this.f21177r;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public int getWidthMeasureSpec() {
        return this.f21171l;
    }

    protected void h(MotionEvent motionEvent) {
        if (!i() || !o()) {
            AbstractC1721a.J("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f21167h == null) {
            AbstractC1721a.J("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return;
        }
        EventDispatcher b10 = L0.b(getCurrentReactContext(), getUIManagerType());
        if (b10 != null) {
            this.f21167h.d(motionEvent, b10, getCurrentReactContext());
        }
    }

    public boolean i() {
        J j10 = this.f21160a;
        return (j10 == null || j10.D() == null) ? false : true;
    }

    public boolean j() {
        return this.f21160a != null;
    }

    public boolean o() {
        return this.f21165f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            q();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (o()) {
            q();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (i() && o()) {
            this.f21169j.a();
            super.onFocusChanged(z10, i10, rect);
        } else {
            AbstractC1721a.J("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        g(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        g(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            h(motionEvent);
        }
        g(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f21170k && m()) {
            w(false, this.f21171l, this.f21172m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000c, B:5:0x0012, B:9:0x001d, B:13:0x002c, B:14:0x0057, B:18:0x0060, B:19:0x008a, B:21:0x0095, B:23:0x009b, B:24:0x00b0, B:30:0x00a1, B:32:0x00a5, B:34:0x00a9, B:36:0x0066, B:38:0x006c, B:41:0x0033, B:43:0x0039), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000c, B:5:0x0012, B:9:0x001d, B:13:0x002c, B:14:0x0057, B:18:0x0060, B:19:0x008a, B:21:0x0095, B:23:0x009b, B:24:0x00b0, B:30:0x00a1, B:32:0x00a5, B:34:0x00a9, B:36:0x0066, B:38:0x006c, B:41:0x0033, B:43:0x0039), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[Catch: all -> 0x0019, LOOP:0: B:36:0x0066->B:38:0x006c, LOOP_END, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000c, B:5:0x0012, B:9:0x001d, B:13:0x002c, B:14:0x0057, B:18:0x0060, B:19:0x008a, B:21:0x0095, B:23:0x009b, B:24:0x00b0, B:30:0x00a1, B:32:0x00a5, B:34:0x00a9, B:36:0x0066, B:38:0x006c, B:41:0x0033, B:43:0x0039), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039 A[Catch: all -> 0x0019, LOOP:1: B:41:0x0033->B:43:0x0039, LOOP_END, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000c, B:5:0x0012, B:9:0x001d, B:13:0x002c, B:14:0x0057, B:18:0x0060, B:19:0x008a, B:21:0x0095, B:23:0x009b, B:24:0x00b0, B:30:0x00a1, B:32:0x00a5, B:34:0x00a9, B:36:0x0066, B:38:0x006c, B:41:0x0033, B:43:0x0039), top: B:2:0x000c }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int mode;
        int i12;
        int i13;
        int mode2;
        int i14;
        C4313a.c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            if (i10 == this.f21171l && i11 == this.f21172m) {
                z10 = false;
                this.f21171l = i10;
                this.f21172m = i11;
                mode = View.MeasureSpec.getMode(i10);
                if (mode != Integer.MIN_VALUE && mode != 0) {
                    i12 = View.MeasureSpec.getSize(i10);
                    mode2 = View.MeasureSpec.getMode(i11);
                    if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
                        i14 = View.MeasureSpec.getSize(i11);
                        setMeasuredDimension(i12, i14);
                        this.f21170k = true;
                        if (!j() && !o()) {
                            f();
                        } else if (!z10 || this.f21173n != i12 || this.f21174o != i14) {
                            w(true, this.f21171l, this.f21172m);
                        }
                        this.f21173n = i12;
                        this.f21174o = i14;
                        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
                        C4313a.i(0L);
                    }
                    i14 = 0;
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt = getChildAt(i15);
                        i14 = Math.max(i14, childAt.getTop() + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom());
                    }
                    setMeasuredDimension(i12, i14);
                    this.f21170k = true;
                    if (!j()) {
                    }
                    if (!z10) {
                    }
                    w(true, this.f21171l, this.f21172m);
                    this.f21173n = i12;
                    this.f21174o = i14;
                    ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
                    C4313a.i(0L);
                }
                i12 = 0;
                for (i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt2 = getChildAt(i13);
                    i12 = Math.max(i12, childAt2.getLeft() + childAt2.getMeasuredWidth() + childAt2.getPaddingLeft() + childAt2.getPaddingRight());
                }
                mode2 = View.MeasureSpec.getMode(i11);
                if (mode2 != Integer.MIN_VALUE) {
                    i14 = View.MeasureSpec.getSize(i11);
                    setMeasuredDimension(i12, i14);
                    this.f21170k = true;
                    if (!j()) {
                    }
                    if (!z10) {
                    }
                    w(true, this.f21171l, this.f21172m);
                    this.f21173n = i12;
                    this.f21174o = i14;
                    ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
                    C4313a.i(0L);
                }
                i14 = 0;
                while (i15 < getChildCount()) {
                }
                setMeasuredDimension(i12, i14);
                this.f21170k = true;
                if (!j()) {
                }
                if (!z10) {
                }
                w(true, this.f21171l, this.f21172m);
                this.f21173n = i12;
                this.f21174o = i14;
                ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
                C4313a.i(0L);
            }
            z10 = true;
            this.f21171l = i10;
            this.f21172m = i11;
            mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                i12 = View.MeasureSpec.getSize(i10);
                mode2 = View.MeasureSpec.getMode(i11);
                if (mode2 != Integer.MIN_VALUE) {
                }
                i14 = 0;
                while (i15 < getChildCount()) {
                }
                setMeasuredDimension(i12, i14);
                this.f21170k = true;
                if (!j()) {
                }
                if (!z10) {
                }
                w(true, this.f21171l, this.f21172m);
                this.f21173n = i12;
                this.f21174o = i14;
                ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
                C4313a.i(0L);
            }
            i12 = 0;
            while (i13 < getChildCount()) {
            }
            mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 != Integer.MIN_VALUE) {
            }
            i14 = 0;
            while (i15 < getChildCount()) {
            }
            setMeasuredDimension(i12, i14);
            this.f21170k = true;
            if (!j()) {
            }
            if (!z10) {
            }
            w(true, this.f21171l, this.f21172m);
            this.f21173n = i12;
            this.f21174o = i14;
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            C4313a.i(0L);
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            C4313a.i(0L);
            throw th;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            h(motionEvent);
        }
        g(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f21166g) {
            this.f21166g = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f21164e);
        }
    }

    public void p() {
        this.f21167h = new com.facebook.react.uimanager.T(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f21168i = new com.facebook.react.uimanager.S(this);
        }
    }

    void r(String str, WritableMap writableMap) {
        if (j()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (i() && o()) {
            this.f21169j.e(view2);
            super.requestChildFocus(view, view2);
        } else {
            AbstractC1721a.J("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f21162c = bundle;
        if (n()) {
            e();
        }
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z10) {
        this.f21177r = z10 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public void setRootViewTag(int i10) {
        this.f21164e = i10;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1965r0
    public void setShouldLogContentAppeared(boolean z10) {
        this.f21166g = z10;
    }

    public boolean t(MotionEvent motionEvent) {
        return true;
    }

    public void u(J j10, String str, Bundle bundle) {
        C4313a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            AbstractC4012a.b(this.f21160a == null, "This root view has already been attached to a catalyst instance manager");
            this.f21160a = j10;
            this.f21161b = str;
            this.f21162c = bundle;
            j10.z();
            if (G4.a.d()) {
                if (!this.f21170k) {
                    s();
                }
                f();
            }
            C4313a.i(0L);
        } catch (Throwable th) {
            C4313a.i(0L);
            throw th;
        }
    }

    public void v() {
        UiThreadUtil.assertOnUiThread();
        J j10 = this.f21160a;
        if (j10 != null && this.f21165f) {
            j10.B(this);
            this.f21165f = false;
        }
        this.f21160a = null;
        this.f21166g = false;
    }
}
