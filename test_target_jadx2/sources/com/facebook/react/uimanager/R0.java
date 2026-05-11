package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import b5.InterfaceC1650a;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import s5.C4313a;
import s5.C4314b;

/* loaded from: classes.dex */
public class R0 {

    /* renamed from: A, reason: collision with root package name */
    private static final String f22180A = "R0";

    /* renamed from: b, reason: collision with root package name */
    private final C1936c0 f22182b;

    /* renamed from: e, reason: collision with root package name */
    private final i f22185e;

    /* renamed from: f, reason: collision with root package name */
    private final ReactApplicationContext f22186f;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC1650a f22191k;

    /* renamed from: o, reason: collision with root package name */
    private long f22195o;

    /* renamed from: p, reason: collision with root package name */
    private long f22196p;

    /* renamed from: q, reason: collision with root package name */
    private long f22197q;

    /* renamed from: r, reason: collision with root package name */
    private long f22198r;

    /* renamed from: s, reason: collision with root package name */
    private long f22199s;

    /* renamed from: t, reason: collision with root package name */
    private long f22200t;

    /* renamed from: u, reason: collision with root package name */
    private long f22201u;

    /* renamed from: v, reason: collision with root package name */
    private long f22202v;

    /* renamed from: w, reason: collision with root package name */
    private long f22203w;

    /* renamed from: x, reason: collision with root package name */
    private long f22204x;

    /* renamed from: y, reason: collision with root package name */
    private long f22205y;

    /* renamed from: z, reason: collision with root package name */
    private long f22206z;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f22181a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final Object f22183c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f22184d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f22187g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f22188h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f22189i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayDeque f22190j = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    private boolean f22192l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22193m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22194n = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f22208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayDeque f22209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f22210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f22211e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22212f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f22213g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f22214h;

        a(int i10, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j10, long j11, long j12, long j13) {
            this.f22207a = i10;
            this.f22208b = arrayList;
            this.f22209c = arrayDeque;
            this.f22210d = arrayList2;
            this.f22211e = j10;
            this.f22212f = j11;
            this.f22213g = j12;
            this.f22214h = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4314b.a(0L, "DispatchUI").a("BatchId", this.f22207a).c();
            try {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList = this.f22208b;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            try {
                                gVar.c();
                            } catch (RetryableMountingLayerException e10) {
                                if (gVar.a() == 0) {
                                    gVar.b();
                                    R0.this.f22187g.add(gVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(R0.f22180A, new ReactNoCrashSoftException(e10));
                                }
                            } catch (Throwable th) {
                                ReactSoftExceptionLogger.logSoftException(R0.f22180A, th);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f22209c;
                    if (arrayDeque != null) {
                        Iterator it2 = arrayDeque.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).j();
                        }
                    }
                    ArrayList arrayList2 = this.f22210d;
                    if (arrayList2 != null) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((r) it3.next()).j();
                        }
                    }
                    if (R0.this.f22194n && R0.this.f22196p == 0) {
                        R0.this.f22196p = this.f22211e;
                        R0.this.f22197q = SystemClock.uptimeMillis();
                        R0.this.f22198r = this.f22212f;
                        R0.this.f22199s = this.f22213g;
                        R0.this.f22200t = uptimeMillis;
                        R0 r02 = R0.this;
                        r02.f22201u = r02.f22197q;
                        R0.this.f22204x = this.f22214h;
                        C4313a.b(0L, "delayBeforeDispatchViewUpdates", 0, R0.this.f22196p * 1000000);
                        C4313a.h(0L, "delayBeforeDispatchViewUpdates", 0, R0.this.f22199s * 1000000);
                        C4313a.b(0L, "delayBeforeBatchRunStart", 0, R0.this.f22199s * 1000000);
                        C4313a.h(0L, "delayBeforeBatchRunStart", 0, R0.this.f22200t * 1000000);
                    }
                    R0.this.f22182b.clearLayoutAnimation();
                    if (R0.this.f22191k != null) {
                        R0.this.f22191k.b();
                    }
                    C4313a.i(0L);
                } catch (Exception e11) {
                    R0.this.f22193m = true;
                    throw e11;
                }
            } catch (Throwable th2) {
                C4313a.i(0L);
                throw th2;
            }
        }
    }

    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            R0.this.R();
        }
    }

    private final class c extends v {

        /* renamed from: c, reason: collision with root package name */
        private final int f22217c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f22218d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f22219e;

        public c(int i10, int i11, boolean z10, boolean z11) {
            super(i10);
            this.f22217c = i11;
            this.f22219e = z10;
            this.f22218d = z11;
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            if (this.f22219e) {
                R0.this.f22182b.clearJSResponder();
            } else {
                R0.this.f22182b.setJSResponder(this.f22271a, this.f22217c, this.f22218d);
            }
        }
    }

    private class d implements r {

        /* renamed from: a, reason: collision with root package name */
        private final ReadableMap f22221a;

        /* renamed from: b, reason: collision with root package name */
        private final Callback f22222b;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.configureLayoutAnimation(this.f22221a, this.f22222b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f22221a = readableMap;
            this.f22222b = callback;
        }
    }

    private final class e extends v {

        /* renamed from: c, reason: collision with root package name */
        private final F0 f22224c;

        /* renamed from: d, reason: collision with root package name */
        private final String f22225d;

        /* renamed from: e, reason: collision with root package name */
        private final C1973v0 f22226e;

        public e(F0 f02, int i10, String str, C1973v0 c1973v0) {
            super(i10);
            this.f22224c = f02;
            this.f22225d = str;
            this.f22226e = c1973v0;
            C4313a.l(0L, "createView", this.f22271a);
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            C4313a.f(0L, "createView", this.f22271a);
            R0.this.f22182b.createView(this.f22224c, this.f22271a, this.f22225d, this.f22226e);
        }
    }

    private final class f extends v implements g {

        /* renamed from: c, reason: collision with root package name */
        private final int f22228c;

        /* renamed from: d, reason: collision with root package name */
        private final ReadableArray f22229d;

        /* renamed from: e, reason: collision with root package name */
        private int f22230e;

        public f(int i10, int i11, ReadableArray readableArray) {
            super(i10);
            this.f22230e = 0;
            this.f22228c = i11;
            this.f22229d = readableArray;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public int a() {
            return this.f22230e;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public void b() {
            this.f22230e++;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public void c() {
            R0.this.f22182b.dispatchCommand(this.f22271a, this.f22228c, this.f22229d);
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.dispatchCommand(this.f22271a, this.f22228c, this.f22229d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(R0.f22180A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    private interface g {
        int a();

        void b();

        void c();
    }

    private final class h extends v implements g {

        /* renamed from: c, reason: collision with root package name */
        private final String f22232c;

        /* renamed from: d, reason: collision with root package name */
        private final ReadableArray f22233d;

        /* renamed from: e, reason: collision with root package name */
        private int f22234e;

        public h(int i10, String str, ReadableArray readableArray) {
            super(i10);
            this.f22234e = 0;
            this.f22232c = str;
            this.f22233d = readableArray;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public int a() {
            return this.f22234e;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public void b() {
            this.f22234e++;
        }

        @Override // com.facebook.react.uimanager.R0.g
        public void c() {
            R0.this.f22182b.dispatchCommand(this.f22271a, this.f22232c, this.f22233d);
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.dispatchCommand(this.f22271a, this.f22232c, this.f22233d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(R0.f22180A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    private class i extends N {

        /* renamed from: a, reason: collision with root package name */
        private final int f22236a;

        private void a(long j10) {
            r rVar;
            while (16 - ((System.nanoTime() - j10) / 1000000) >= this.f22236a) {
                synchronized (R0.this.f22184d) {
                    try {
                        if (R0.this.f22190j.isEmpty()) {
                            return;
                        } else {
                            rVar = (r) R0.this.f22190j.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    rVar.j();
                    R0.this.f22195o += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e10) {
                    R0.this.f22193m = true;
                    throw e10;
                }
            }
        }

        @Override // com.facebook.react.uimanager.N
        public void doFrameGuarded(long j10) {
            if (R0.this.f22193m) {
                AbstractC1721a.J("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C4313a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                a(j10);
                C4313a.i(0L);
                R0.this.R();
                com.facebook.react.modules.core.a.h().k(a.EnumC0379a.DISPATCH_UI, this);
            } catch (Throwable th) {
                C4313a.i(0L);
                throw th;
            }
        }

        private i(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f22236a = i10;
        }
    }

    private final class j implements r {

        /* renamed from: a, reason: collision with root package name */
        private final int f22238a;

        /* renamed from: b, reason: collision with root package name */
        private final float f22239b;

        /* renamed from: c, reason: collision with root package name */
        private final float f22240c;

        /* renamed from: d, reason: collision with root package name */
        private final Callback f22241d;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.measure(this.f22238a, R0.this.f22181a);
                float f10 = R0.this.f22181a[0];
                float f11 = R0.this.f22181a[1];
                int findTargetTagForTouch = R0.this.f22182b.findTargetTagForTouch(this.f22238a, this.f22239b, this.f22240c);
                try {
                    R0.this.f22182b.measure(findTargetTagForTouch, R0.this.f22181a);
                    this.f22241d.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(C1944g0.e(R0.this.f22181a[0] - f10)), Float.valueOf(C1944g0.e(R0.this.f22181a[1] - f11)), Float.valueOf(C1944g0.e(R0.this.f22181a[2])), Float.valueOf(C1944g0.e(R0.this.f22181a[3])));
                } catch (Q unused) {
                    this.f22241d.invoke(new Object[0]);
                }
            } catch (Q unused2) {
                this.f22241d.invoke(new Object[0]);
            }
        }

        private j(int i10, float f10, float f11, Callback callback) {
            this.f22238a = i10;
            this.f22239b = f10;
            this.f22240c = f11;
            this.f22241d = callback;
        }
    }

    private final class k extends v {

        /* renamed from: c, reason: collision with root package name */
        private final int[] f22243c;

        /* renamed from: d, reason: collision with root package name */
        private final a1[] f22244d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f22245e;

        public k(int i10, int[] iArr, a1[] a1VarArr, int[] iArr2) {
            super(i10);
            this.f22243c = iArr;
            this.f22244d = a1VarArr;
            this.f22245e = iArr2;
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.manageChildren(this.f22271a, this.f22243c, this.f22244d, this.f22245e);
        }
    }

    private final class l implements r {

        /* renamed from: a, reason: collision with root package name */
        private final int f22247a;

        /* renamed from: b, reason: collision with root package name */
        private final Callback f22248b;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.measureInWindow(this.f22247a, R0.this.f22181a);
                this.f22248b.invoke(Float.valueOf(C1944g0.e(R0.this.f22181a[0])), Float.valueOf(C1944g0.e(R0.this.f22181a[1])), Float.valueOf(C1944g0.e(R0.this.f22181a[2])), Float.valueOf(C1944g0.e(R0.this.f22181a[3])));
            } catch (C1940e0 unused) {
                this.f22248b.invoke(new Object[0]);
            }
        }

        private l(int i10, Callback callback) {
            this.f22247a = i10;
            this.f22248b = callback;
        }
    }

    private final class m implements r {

        /* renamed from: a, reason: collision with root package name */
        private final int f22250a;

        /* renamed from: b, reason: collision with root package name */
        private final Callback f22251b;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.measure(this.f22250a, R0.this.f22181a);
                this.f22251b.invoke(0, 0, Float.valueOf(C1944g0.e(R0.this.f22181a[2])), Float.valueOf(C1944g0.e(R0.this.f22181a[3])), Float.valueOf(C1944g0.e(R0.this.f22181a[0])), Float.valueOf(C1944g0.e(R0.this.f22181a[1])));
            } catch (C1940e0 unused) {
                this.f22251b.invoke(new Object[0]);
            }
        }

        private m(int i10, Callback callback) {
            this.f22250a = i10;
            this.f22251b = callback;
        }
    }

    private final class n extends v {
        public n(int i10) {
            super(i10);
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.removeRootView(this.f22271a);
        }
    }

    private final class o extends v {

        /* renamed from: c, reason: collision with root package name */
        private final int f22254c;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            try {
                R0.this.f22182b.sendAccessibilityEvent(this.f22271a, this.f22254c);
            } catch (RetryableMountingLayerException e10) {
                ReactSoftExceptionLogger.logSoftException(R0.f22180A, e10);
            }
        }

        private o(int i10, int i11) {
            super(i10);
            this.f22254c = i11;
        }
    }

    private class p implements r {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f22256a;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.setLayoutAnimationEnabled(this.f22256a);
        }

        private p(boolean z10) {
            this.f22256a = z10;
        }
    }

    private class q implements r {

        /* renamed from: a, reason: collision with root package name */
        private final J0 f22258a;

        public q(J0 j02) {
            this.f22258a = j02;
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            this.f22258a.a(R0.this.f22182b);
        }
    }

    public interface r {
        void j();
    }

    private final class s extends v {

        /* renamed from: c, reason: collision with root package name */
        private final int f22260c;

        /* renamed from: d, reason: collision with root package name */
        private final int f22261d;

        /* renamed from: e, reason: collision with root package name */
        private final int f22262e;

        /* renamed from: f, reason: collision with root package name */
        private final int f22263f;

        /* renamed from: g, reason: collision with root package name */
        private final int f22264g;

        /* renamed from: h, reason: collision with root package name */
        private final com.facebook.yoga.h f22265h;

        public s(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
            super(i11);
            this.f22260c = i10;
            this.f22261d = i12;
            this.f22262e = i13;
            this.f22263f = i14;
            this.f22264g = i15;
            this.f22265h = hVar;
            C4313a.l(0L, "updateLayout", this.f22271a);
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            C4313a.f(0L, "updateLayout", this.f22271a);
            R0.this.f22182b.updateLayout(this.f22260c, this.f22271a, this.f22261d, this.f22262e, this.f22263f, this.f22264g, this.f22265h);
        }
    }

    private final class t extends v {

        /* renamed from: c, reason: collision with root package name */
        private final C1973v0 f22267c;

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.updateProperties(this.f22271a, this.f22267c);
        }

        private t(int i10, C1973v0 c1973v0) {
            super(i10);
            this.f22267c = c1973v0;
        }
    }

    private final class u extends v {

        /* renamed from: c, reason: collision with root package name */
        private final Object f22269c;

        public u(int i10, Object obj) {
            super(i10);
            this.f22269c = obj;
        }

        @Override // com.facebook.react.uimanager.R0.r
        public void j() {
            R0.this.f22182b.updateViewExtraData(this.f22271a, this.f22269c);
        }
    }

    private abstract class v implements r {

        /* renamed from: a, reason: collision with root package name */
        public int f22271a;

        public v(int i10) {
            this.f22271a = i10;
        }
    }

    public R0(ReactApplicationContext reactApplicationContext, C1936c0 c1936c0, int i10) {
        this.f22182b = c1936c0;
        this.f22185e = new i(reactApplicationContext, i10 == -1 ? 8 : i10);
        this.f22186f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.f22193m) {
            AbstractC1721a.J("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f22183c) {
            if (this.f22189i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.f22189i;
            this.f22189i = new ArrayList();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.f22194n) {
                this.f22202v = SystemClock.uptimeMillis() - uptimeMillis;
                this.f22203w = this.f22195o;
                this.f22194n = false;
                C4313a.b(0L, "batchedExecutionTime", 0, uptimeMillis * 1000000);
                C4313a.g(0L, "batchedExecutionTime", 0);
            }
            this.f22195o = 0L;
        }
    }

    public void A() {
        this.f22188h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f22188h.add(new d(readableMap, callback));
    }

    public void C(F0 f02, int i10, String str, C1973v0 c1973v0) {
        synchronized (this.f22184d) {
            this.f22205y++;
            this.f22190j.addLast(new e(f02, i10, str, c1973v0));
        }
    }

    public void D(int i10, int i11, ReadableArray readableArray) {
        this.f22187g.add(new f(i10, i11, readableArray));
    }

    public void E(int i10, String str, ReadableArray readableArray) {
        this.f22187g.add(new h(i10, str, readableArray));
    }

    public void F(int i10, float f10, float f11, Callback callback) {
        this.f22188h.add(new j(i10, f10, f11, callback));
    }

    public void G(int i10, int[] iArr, a1[] a1VarArr, int[] iArr2) {
        this.f22188h.add(new k(i10, iArr, a1VarArr, iArr2));
    }

    public void H(int i10, Callback callback) {
        this.f22188h.add(new m(i10, callback));
    }

    public void I(int i10, Callback callback) {
        this.f22188h.add(new l(i10, callback));
    }

    public void J(int i10) {
        this.f22188h.add(new n(i10));
    }

    public void K(int i10, int i11) {
        this.f22188h.add(new o(i10, i11));
    }

    public void L(int i10, int i11, boolean z10) {
        this.f22188h.add(new c(i10, i11, false, z10));
    }

    public void M(boolean z10) {
        this.f22188h.add(new p(z10));
    }

    public void N(J0 j02) {
        this.f22188h.add(new q(j02));
    }

    public void O(int i10, Object obj) {
        this.f22188h.add(new u(i10, obj));
    }

    public void P(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        this.f22188h.add(new s(i10, i11, i12, i13, i14, i15, hVar));
    }

    public void Q(int i10, String str, C1973v0 c1973v0) {
        this.f22206z++;
        this.f22188h.add(new t(i10, c1973v0));
    }

    C1936c0 S() {
        return this.f22182b;
    }

    public Map T() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f22196p));
        hashMap.put("CommitEndTime", Long.valueOf(this.f22197q));
        hashMap.put("LayoutTime", Long.valueOf(this.f22198r));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f22199s));
        hashMap.put("RunStartTime", Long.valueOf(this.f22200t));
        hashMap.put("RunEndTime", Long.valueOf(this.f22201u));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f22202v));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f22203w));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f22204x));
        hashMap.put("CreateViewCount", Long.valueOf(this.f22205y));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.f22206z));
        return hashMap;
    }

    public boolean U() {
        return this.f22188h.isEmpty() && this.f22187g.isEmpty();
    }

    void V() {
        this.f22192l = false;
        com.facebook.react.modules.core.a.h().n(a.EnumC0379a.DISPATCH_UI, this.f22185e);
        R();
    }

    public void W(J0 j02) {
        this.f22188h.add(0, new q(j02));
    }

    public void X() {
        this.f22194n = true;
        this.f22196p = 0L;
        this.f22205y = 0L;
        this.f22206z = 0L;
    }

    void Y() {
        this.f22192l = true;
        if (G4.a.g()) {
            return;
        }
        com.facebook.react.modules.core.a.h().k(a.EnumC0379a.DISPATCH_UI, this.f22185e);
    }

    public void Z(InterfaceC1650a interfaceC1650a) {
        this.f22191k = interfaceC1650a;
    }

    public void y(int i10, View view) {
        this.f22182b.addRootView(i10, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void z(int i10, long j10, long j11) {
        long j12;
        long uptimeMillis;
        long currentThreadTimeMillis;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayDeque arrayDeque;
        C4314b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i10).c();
        try {
            uptimeMillis = SystemClock.uptimeMillis();
            currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j12 = 0;
            j12 = 0;
            if (this.f22187g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = this.f22187g;
                this.f22187g = new ArrayList();
                arrayList = arrayList3;
            }
            if (this.f22188h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList arrayList4 = this.f22188h;
                this.f22188h = new ArrayList();
                arrayList2 = arrayList4;
            }
            synchronized (this.f22184d) {
                try {
                    try {
                        if (!this.f22190j.isEmpty()) {
                            ArrayDeque arrayDeque2 = this.f22190j;
                            this.f22190j = new ArrayDeque();
                            j12 = arrayDeque2;
                        }
                        arrayDeque = j12;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InterfaceC1650a interfaceC1650a = this.f22191k;
            if (interfaceC1650a != null) {
                interfaceC1650a.a();
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = 0;
        }
        try {
            a aVar = new a(i10, arrayList, arrayDeque, arrayList2, j10, j11, uptimeMillis, currentThreadTimeMillis);
            j12 = 0;
            j12 = 0;
            C4314b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i10).c();
            synchronized (this.f22183c) {
                C4313a.i(0L);
                this.f22189i.add(aVar);
            }
            if (!this.f22192l) {
                UiThreadUtil.runOnUiThread(new b(this.f22186f));
            }
            C4313a.i(0L);
        } catch (Throwable th4) {
            th = th4;
            j12 = 0;
            C4313a.i(j12);
            throw th;
        }
    }
}
