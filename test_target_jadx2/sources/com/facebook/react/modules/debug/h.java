package com.facebook.react.modules.debug;

import android.view.Choreographer;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {

    /* renamed from: n, reason: collision with root package name */
    private static final a f21775n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactContext f21776a;

    /* renamed from: b, reason: collision with root package name */
    private Choreographer f21777b;

    /* renamed from: c, reason: collision with root package name */
    private final UIManagerModule f21778c;

    /* renamed from: d, reason: collision with root package name */
    private final d f21779d;

    /* renamed from: e, reason: collision with root package name */
    private long f21780e;

    /* renamed from: f, reason: collision with root package name */
    private long f21781f;

    /* renamed from: g, reason: collision with root package name */
    private int f21782g;

    /* renamed from: h, reason: collision with root package name */
    private int f21783h;

    /* renamed from: i, reason: collision with root package name */
    private int f21784i;

    /* renamed from: j, reason: collision with root package name */
    private int f21785j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21786k;

    /* renamed from: l, reason: collision with root package name */
    private double f21787l;

    /* renamed from: m, reason: collision with root package name */
    private TreeMap f21788m;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f21789a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21790b;

        /* renamed from: c, reason: collision with root package name */
        private final int f21791c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21792d;

        /* renamed from: e, reason: collision with root package name */
        private final double f21793e;

        /* renamed from: f, reason: collision with root package name */
        private final double f21794f;

        /* renamed from: g, reason: collision with root package name */
        private final int f21795g;

        public b(int i10, int i11, int i12, int i13, double d10, double d11, int i14) {
            this.f21789a = i10;
            this.f21790b = i11;
            this.f21791c = i12;
            this.f21792d = i13;
            this.f21793e = d10;
            this.f21794f = d11;
            this.f21795g = i14;
        }
    }

    public h(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f21776a = reactContext;
        this.f21778c = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f21779d = new d();
        this.f21780e = -1L;
        this.f21781f = -1L;
        this.f21787l = 60.0d;
    }

    public static /* synthetic */ void l(h hVar, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = hVar.f21787l;
        }
        hVar.k(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        this$0.f21777b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        this$0.f21777b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this$0);
        }
    }

    public final int c() {
        return this.f21784i;
    }

    public final int d() {
        return (int) (((this.f21787l * i()) / 1000) + 1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f21780e == -1) {
            this.f21780e = j10;
        }
        long j11 = this.f21781f;
        this.f21781f = j10;
        if (this.f21779d.d(j11, j10)) {
            this.f21785j++;
        }
        this.f21782g++;
        int d10 = d();
        if ((d10 - this.f21783h) - 1 >= 4) {
            this.f21784i++;
        }
        if (this.f21786k) {
            AbstractC4012a.c(this.f21788m);
            b bVar = new b(g(), h(), d10, this.f21784i, e(), f(), i());
            TreeMap treeMap = this.f21788m;
            if (treeMap != null) {
            }
        }
        this.f21783h = d10;
        Choreographer choreographer = this.f21777b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f21781f == this.f21780e) {
            return 0.0d;
        }
        return (g() * 1.0E9d) / (this.f21781f - this.f21780e);
    }

    public final double f() {
        if (this.f21781f == this.f21780e) {
            return 0.0d;
        }
        return (h() * 1.0E9d) / (this.f21781f - this.f21780e);
    }

    public final int g() {
        return this.f21782g - 1;
    }

    public final int h() {
        return this.f21785j - 1;
    }

    public final int i() {
        return ((int) (this.f21781f - this.f21780e)) / HVFrameRecorder.BITRATE;
    }

    public final void j() {
        this.f21780e = -1L;
        this.f21781f = -1L;
        this.f21782g = 0;
        this.f21784i = 0;
        this.f21785j = 0;
        this.f21786k = false;
        this.f21788m = null;
    }

    public final void k(double d10) {
        if (!this.f21776a.isBridgeless()) {
            this.f21776a.getCatalystInstance().addBridgeIdleDebugListener(this.f21779d);
        }
        UIManagerModule uIManagerModule = this.f21778c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.f21779d);
        }
        this.f21787l = d10;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.f
            @Override // java.lang.Runnable
            public final void run() {
                h.m(h.this);
            }
        });
    }

    public final void n() {
        if (!this.f21776a.isBridgeless()) {
            this.f21776a.getCatalystInstance().removeBridgeIdleDebugListener(this.f21779d);
        }
        UIManagerModule uIManagerModule = this.f21778c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.g
            @Override // java.lang.Runnable
            public final void run() {
                h.o(h.this);
            }
        });
    }
}
