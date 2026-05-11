package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import b5.InterfaceC1650a;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r4.AbstractC4012a;
import s5.C4313a;
import s5.C4314b;
import x4.C5109a;

/* loaded from: classes.dex */
public class K0 {

    /* renamed from: a, reason: collision with root package name */
    protected Object f22164a;

    /* renamed from: b, reason: collision with root package name */
    protected final EventDispatcher f22165b;

    /* renamed from: c, reason: collision with root package name */
    protected final ReactApplicationContext f22166c;

    /* renamed from: d, reason: collision with root package name */
    protected final C0 f22167d;

    /* renamed from: e, reason: collision with root package name */
    private final i1 f22168e;

    /* renamed from: f, reason: collision with root package name */
    private final R0 f22169f;

    /* renamed from: g, reason: collision with root package name */
    private final C1938d0 f22170g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f22171h;

    /* renamed from: i, reason: collision with root package name */
    private long f22172i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f22173j;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1969t0 f22174a;

        a(InterfaceC1969t0 interfaceC1969t0) {
            this.f22174a = interfaceC1969t0;
        }

        @Override // java.lang.Runnable
        public void run() {
            K0.this.f22167d.b(this.f22174a);
        }
    }

    K0(ReactApplicationContext reactApplicationContext, i1 i1Var, EventDispatcher eventDispatcher, int i10) {
        this(reactApplicationContext, i1Var, new R0(reactApplicationContext, new C1936c0(i1Var), i10), eventDispatcher);
    }

    private void A(InterfaceC1969t0 interfaceC1969t0) {
        if (interfaceC1969t0.m()) {
            for (int i10 = 0; i10 < interfaceC1969t0.c(); i10++) {
                A(interfaceC1969t0.b(i10));
            }
            interfaceC1969t0.X(this.f22170g);
        }
    }

    private void L(InterfaceC1969t0 interfaceC1969t0) {
        C1938d0.j(interfaceC1969t0);
        this.f22167d.g(interfaceC1969t0.r());
        for (int c10 = interfaceC1969t0.c() - 1; c10 >= 0; c10--) {
            L(interfaceC1969t0.b(c10));
        }
        interfaceC1969t0.q();
    }

    private void c(InterfaceC1969t0 interfaceC1969t0) {
        NativeModule nativeModule = (ViewManager) AbstractC4012a.c(this.f22168e.c(interfaceC1969t0.O()));
        if (!(nativeModule instanceof P)) {
            throw new Q("Trying to use view " + interfaceC1969t0.O() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        P p10 = (P) nativeModule;
        if (p10 == null || !p10.needsCustomLayoutForChildren()) {
            return;
        }
        throw new Q("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + interfaceC1969t0.O() + "). Use measure instead.");
    }

    private boolean e(int i10, String str) {
        if (this.f22167d.c(i10) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i10 + ", since the view does not exist";
        if (C5109a.f44775b) {
            throw new Q(str2);
        }
        AbstractC1721a.J("ReactNative", str2);
        return false;
    }

    private void n() {
        if (this.f22169f.U()) {
            m(-1);
        }
    }

    private void y(int i10, int i11, int[] iArr) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        InterfaceC1969t0 c11 = this.f22167d.c(i11);
        if (c10 == null || c11 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (c10 != null) {
                i10 = i11;
            }
            sb2.append(i10);
            sb2.append(" does not exist");
            throw new Q(sb2.toString());
        }
        if (c10 != c11) {
            for (InterfaceC1969t0 parent = c10.getParent(); parent != c11; parent = parent.getParent()) {
                if (parent == null) {
                    throw new Q("Tag " + i11 + " is not an ancestor of tag " + i10);
                }
            }
        }
        z(c10, c11, iArr);
    }

    private void z(InterfaceC1969t0 interfaceC1969t0, InterfaceC1969t0 interfaceC1969t02, int[] iArr) {
        int i10;
        int i11;
        if (interfaceC1969t0 == interfaceC1969t02 || interfaceC1969t0.u()) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = Math.round(interfaceC1969t0.V());
            i11 = Math.round(interfaceC1969t0.R());
            for (InterfaceC1969t0 parent = interfaceC1969t0.getParent(); parent != interfaceC1969t02; parent = parent.getParent()) {
                AbstractC4012a.c(parent);
                c(parent);
                i10 += Math.round(parent.V());
                i11 += Math.round(parent.R());
            }
            c(interfaceC1969t02);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = interfaceC1969t0.D();
        iArr[3] = interfaceC1969t0.d();
    }

    public void B() {
        this.f22173j = false;
        this.f22168e.f();
    }

    public void C() {
    }

    public void D() {
        this.f22169f.V();
    }

    public void E() {
        this.f22169f.Y();
    }

    public void F(J0 j02) {
        this.f22169f.W(j02);
    }

    public void G() {
        this.f22169f.X();
    }

    public void H(View view, int i10, F0 f02) {
        synchronized (this.f22164a) {
            InterfaceC1969t0 h10 = h();
            h10.Q(i10);
            h10.B(f02);
            f02.runOnNativeModulesQueueThread(new a(h10));
            this.f22169f.y(i10, view);
        }
    }

    public void I(int i10) {
        synchronized (this.f22164a) {
            this.f22167d.h(i10);
        }
    }

    public void J(int i10) {
        I(i10);
        this.f22169f.J(i10);
    }

    protected final void K(InterfaceC1969t0 interfaceC1969t0) {
        L(interfaceC1969t0);
        interfaceC1969t0.a();
    }

    public int M(int i10) {
        if (this.f22167d.f(i10)) {
            return i10;
        }
        InterfaceC1969t0 N10 = N(i10);
        if (N10 != null) {
            return N10.J();
        }
        AbstractC1721a.J("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i10);
        return 0;
    }

    public final InterfaceC1969t0 N(int i10) {
        return this.f22167d.c(i10);
    }

    protected final ViewManager O(String str) {
        return this.f22168e.e(str);
    }

    public void P(int i10, int i11) {
        this.f22169f.K(i10, i11);
    }

    public void Q(int i10, ReadableArray readableArray) {
        if (this.f22173j) {
            synchronized (this.f22164a) {
                try {
                    InterfaceC1969t0 c10 = this.f22167d.c(i10);
                    for (int i11 = 0; i11 < readableArray.size(); i11++) {
                        InterfaceC1969t0 c11 = this.f22167d.c(readableArray.getInt(i11));
                        if (c11 == null) {
                            throw new Q("Trying to add unknown view tag: " + readableArray.getInt(i11));
                        }
                        c10.K(c11, i11);
                    }
                    this.f22170g.k(c10, readableArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void R(int i10, boolean z10) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        if (c10 == null) {
            return;
        }
        while (c10.I() == EnumC1934b0.NONE) {
            c10 = c10.getParent();
        }
        this.f22169f.L(c10.r(), i10, z10);
    }

    public void S(boolean z10) {
        this.f22169f.M(z10);
    }

    public void T(InterfaceC1650a interfaceC1650a) {
        this.f22169f.Z(interfaceC1650a);
    }

    public void U(int i10, Object obj) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        if (c10 != null) {
            c10.G(obj);
            n();
        } else {
            AbstractC1721a.J("ReactNative", "Attempt to set local data for view with unknown tag: " + i10);
        }
    }

    public void V(int i10, C1973v0 c1973v0) {
        UiThreadUtil.assertOnUiThread();
        this.f22169f.S().updateProperties(i10, c1973v0);
    }

    public void W(int i10, int i11, int i12, int i13, int i14) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        if (c10 == null) {
            AbstractC1721a.J("ReactNative", "Tried to update size of non-existent tag: " + i10);
            return;
        }
        c10.v(4, i12);
        c10.v(1, i11);
        c10.v(5, i14);
        c10.v(3, i13);
        n();
    }

    public void X(int i10, int i11, int i12) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        if (c10 != null) {
            c10.C(i11);
            c10.g(i12);
            n();
        } else {
            AbstractC1721a.J("ReactNative", "Tried to update size of non-existent tag: " + i10);
        }
    }

    public void Y(int i10, int i11, int i12) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        if (c10 != null) {
            Z(c10, i11, i12);
            return;
        }
        AbstractC1721a.J("ReactNative", "Tried to update non-existent root tag: " + i10);
    }

    public void Z(InterfaceC1969t0 interfaceC1969t0, int i10, int i11) {
        interfaceC1969t0.h(i10, i11);
    }

    public void a(J0 j02) {
        this.f22169f.N(j02);
    }

    public void a0(int i10, String str, ReadableMap readableMap) {
        if (this.f22173j) {
            if (this.f22168e.c(str) == null) {
                throw new Q("Got unknown view type: " + str);
            }
            InterfaceC1969t0 c10 = this.f22167d.c(i10);
            if (c10 == null) {
                throw new Q("Trying to update non-existent view with tag " + i10);
            }
            if (readableMap != null) {
                C1973v0 c1973v0 = new C1973v0(readableMap);
                c10.c0(c1973v0);
                t(c10, str, c1973v0);
            }
        }
    }

    protected void b(InterfaceC1969t0 interfaceC1969t0, float f10, float f11, List list) {
        if (interfaceC1969t0.m()) {
            if (interfaceC1969t0.L(f10, f11) && interfaceC1969t0.M() && !this.f22167d.f(interfaceC1969t0.r())) {
                list.add(interfaceC1969t0);
            }
            Iterable o10 = interfaceC1969t0.o();
            if (o10 != null) {
                Iterator it = o10.iterator();
                while (it.hasNext()) {
                    b((InterfaceC1969t0) it.next(), interfaceC1969t0.V() + f10, interfaceC1969t0.R() + f11, list);
                }
            }
            interfaceC1969t0.p(f10, f11, this.f22169f, this.f22170g);
            interfaceC1969t0.e();
            this.f22170g.p(interfaceC1969t0);
        }
    }

    protected void b0() {
        C4313a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i10 = 0; i10 < this.f22167d.d(); i10++) {
            try {
                InterfaceC1969t0 c10 = this.f22167d.c(this.f22167d.e(i10));
                if (c10.getWidthMeasureSpec() != null && c10.getHeightMeasureSpec() != null) {
                    C4314b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", c10.r()).c();
                    try {
                        A(c10);
                        C4313a.i(0L);
                        d(c10);
                        C4314b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", c10.r()).c();
                        try {
                            ArrayList<InterfaceC1969t0> arrayList = new ArrayList();
                            b(c10, 0.0f, 0.0f, arrayList);
                            for (InterfaceC1969t0 interfaceC1969t0 : arrayList) {
                                this.f22165b.c(C1942f0.c(-1, interfaceC1969t0.r(), interfaceC1969t0.T(), interfaceC1969t0.F(), interfaceC1969t0.D(), interfaceC1969t0.d()));
                            }
                            C4313a.i(0L);
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c0(int i10, int i11, Callback callback) {
        InterfaceC1969t0 c10 = this.f22167d.c(i10);
        InterfaceC1969t0 c11 = this.f22167d.c(i11);
        if (c10 == null || c11 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(c10.Z(c11)));
        }
    }

    protected void d(InterfaceC1969t0 interfaceC1969t0) {
        C4314b.a(0L, "cssRoot.calculateLayout").a("rootTag", interfaceC1969t0.r()).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = interfaceC1969t0.getWidthMeasureSpec().intValue();
            int intValue2 = interfaceC1969t0.getHeightMeasureSpec().intValue();
            float f10 = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f10 = View.MeasureSpec.getSize(intValue2);
            }
            interfaceC1969t0.S(size, f10);
        } finally {
            C4313a.i(0L);
            this.f22172i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void f() {
        this.f22169f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f22169f.B(readableMap, callback);
    }

    protected InterfaceC1969t0 h() {
        C1971u0 c1971u0 = new C1971u0();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f22166c)) {
            c1971u0.k(com.facebook.yoga.h.RTL);
        }
        c1971u0.j("Root");
        return c1971u0;
    }

    protected InterfaceC1969t0 i(String str) {
        return this.f22168e.c(str).createShadowNodeInstance(this.f22166c);
    }

    public void j(int i10, String str, int i11, ReadableMap readableMap) {
        C1973v0 c1973v0;
        if (this.f22173j) {
            synchronized (this.f22164a) {
                try {
                    InterfaceC1969t0 i12 = i(str);
                    InterfaceC1969t0 c10 = this.f22167d.c(i11);
                    AbstractC4012a.d(c10, "Root node with tag " + i11 + " doesn't exist");
                    i12.Q(i10);
                    i12.j(str);
                    i12.A(c10.r());
                    i12.B(c10.H());
                    this.f22167d.a(i12);
                    if (readableMap != null) {
                        c1973v0 = new C1973v0(readableMap);
                        i12.c0(c1973v0);
                    } else {
                        c1973v0 = null;
                    }
                    s(i12, i11, c1973v0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(int i10, int i11, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + i11)) {
            this.f22169f.D(i10, i11, readableArray);
        }
    }

    public void l(int i10, String str, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + str)) {
            this.f22169f.E(i10, str, readableArray);
        }
    }

    public void m(int i10) {
        C4314b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i10).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            b0();
            this.f22170g.o();
            this.f22169f.z(i10, uptimeMillis, this.f22172i);
        } finally {
            C4313a.i(0L);
        }
    }

    public void o(int i10, float f10, float f11, Callback callback) {
        this.f22169f.F(i10, f10, f11, callback);
    }

    public Map p() {
        return this.f22169f.T();
    }

    public int q() {
        return this.f22169f.S().getRootViewNum();
    }

    R0 r() {
        return this.f22169f;
    }

    protected void s(InterfaceC1969t0 interfaceC1969t0, int i10, C1973v0 c1973v0) {
        if (interfaceC1969t0.u()) {
            return;
        }
        this.f22170g.g(interfaceC1969t0, interfaceC1969t0.H(), c1973v0);
    }

    protected void t(InterfaceC1969t0 interfaceC1969t0, String str, C1973v0 c1973v0) {
        if (interfaceC1969t0.u()) {
            return;
        }
        this.f22170g.m(interfaceC1969t0, str, c1973v0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r25 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r11 != r25.size()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        throw new com.facebook.react.uimanager.Q("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (!this.f22173j) {
            return;
        }
        synchronized (this.f22164a) {
            try {
                InterfaceC1969t0 c10 = this.f22167d.c(i10);
                int size = readableArray6 == null ? 0 : readableArray.size();
                int size2 = readableArray3 == null ? 0 : readableArray3.size();
                int size3 = readableArray5 == null ? 0 : readableArray5.size();
                if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                    throw new Q("Size of moveFrom != size of moveTo!");
                }
                int i11 = size + size2;
                a1[] a1VarArr = new a1[i11];
                int i12 = size + size3;
                int[] iArr = new int[i12];
                try {
                    int[] iArr2 = new int[i12];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        AbstractC4012a.c(readableArray);
                        AbstractC4012a.c(readableArray2);
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = i12;
                            int i15 = readableArray6.getInt(i13);
                            int r10 = c10.b(i15).r();
                            a1VarArr[i13] = new a1(r10, readableArray2.getInt(i13));
                            iArr[i13] = i15;
                            iArr2[i13] = r10;
                            i13++;
                            readableArray6 = readableArray;
                            i12 = i14;
                            iArr3 = iArr3;
                            c10 = c10;
                        }
                    }
                    InterfaceC1969t0 interfaceC1969t0 = c10;
                    int[] iArr4 = iArr3;
                    int i16 = i12;
                    if (size2 > 0) {
                        AbstractC4012a.c(readableArray3);
                        AbstractC4012a.c(readableArray4);
                        for (int i17 = 0; i17 < size2; i17++) {
                            a1VarArr[size + i17] = new a1(readableArray3.getInt(i17), readableArray4.getInt(i17));
                        }
                    }
                    if (size3 > 0) {
                        AbstractC4012a.c(readableArray5);
                        int i18 = 0;
                        while (i18 < size3) {
                            int i19 = readableArray5.getInt(i18);
                            InterfaceC1969t0 interfaceC1969t02 = interfaceC1969t0;
                            int r11 = interfaceC1969t02.b(i19).r();
                            int i20 = size + i18;
                            iArr[i20] = i19;
                            iArr2[i20] = r11;
                            iArr4[i18] = r11;
                            i18++;
                            interfaceC1969t0 = interfaceC1969t02;
                        }
                    }
                    InterfaceC1969t0 interfaceC1969t03 = interfaceC1969t0;
                    Arrays.sort(a1VarArr, a1.f22317c);
                    Arrays.sort(iArr);
                    int i21 = -1;
                    for (int i22 = i16 - 1; i22 >= 0; i22--) {
                        int i23 = iArr[i22];
                        if (i23 == i21) {
                            throw new Q("Repeated indices in Removal list for view tag: " + i10);
                        }
                        interfaceC1969t03.f(i23);
                        i21 = iArr[i22];
                    }
                    int i24 = 0;
                    while (i24 < i11) {
                        a1 a1Var = a1VarArr[i24];
                        int[] iArr5 = iArr2;
                        InterfaceC1969t0 c11 = this.f22167d.c(a1Var.f22318a);
                        if (c11 == null) {
                            throw new Q("Trying to add unknown view tag: " + a1Var.f22318a);
                        }
                        interfaceC1969t03.K(c11, a1Var.f22319b);
                        i24++;
                        iArr2 = iArr5;
                    }
                    this.f22170g.i(interfaceC1969t03, iArr, iArr2, a1VarArr, iArr4);
                    for (int i25 = 0; i25 < size3; i25++) {
                        K(this.f22167d.c(iArr4[i25]));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void v(int i10, Callback callback) {
        if (this.f22173j) {
            this.f22169f.H(i10, callback);
        }
    }

    public void w(int i10, Callback callback) {
        if (this.f22173j) {
            this.f22169f.I(i10, callback);
        }
    }

    public void x(int i10, int i11, Callback callback, Callback callback2) {
        if (this.f22173j) {
            try {
                y(i10, i11, this.f22171h);
                callback2.invoke(Float.valueOf(C1944g0.e(this.f22171h[0])), Float.valueOf(C1944g0.e(this.f22171h[1])), Float.valueOf(C1944g0.e(this.f22171h[2])), Float.valueOf(C1944g0.e(this.f22171h[3])));
            } catch (Q e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    protected K0(ReactApplicationContext reactApplicationContext, i1 i1Var, R0 r02, EventDispatcher eventDispatcher) {
        this.f22164a = new Object();
        C0 c02 = new C0();
        this.f22167d = c02;
        this.f22171h = new int[4];
        this.f22172i = 0L;
        this.f22173j = true;
        this.f22166c = reactApplicationContext;
        this.f22168e = i1Var;
        this.f22169f = r02;
        this.f22170g = new C1938d0(r02, c02);
        this.f22165b = eventDispatcher;
    }
}
