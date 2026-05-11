package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.uimanager.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1938d0 {

    /* renamed from: a, reason: collision with root package name */
    private final R0 f22330a;

    /* renamed from: b, reason: collision with root package name */
    private final C0 f22331b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f22332c = new SparseBooleanArray();

    /* renamed from: com.facebook.react.uimanager.d0$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1969t0 f22333a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22334b;

        a(InterfaceC1969t0 interfaceC1969t0, int i10) {
            this.f22333a = interfaceC1969t0;
            this.f22334b = i10;
        }
    }

    public C1938d0(R0 r02, C0 c02) {
        this.f22330a = r02;
        this.f22331b = c02;
    }

    private void a(InterfaceC1969t0 interfaceC1969t0, InterfaceC1969t0 interfaceC1969t02, int i10) {
        AbstractC4012a.a(interfaceC1969t02.I() != EnumC1934b0.PARENT);
        for (int i11 = 0; i11 < interfaceC1969t02.c(); i11++) {
            InterfaceC1969t0 b10 = interfaceC1969t02.b(i11);
            AbstractC4012a.a(b10.a0() == null);
            int x10 = interfaceC1969t0.x();
            if (b10.I() == EnumC1934b0.NONE) {
                d(interfaceC1969t0, b10, i10);
            } else {
                b(interfaceC1969t0, b10, i10);
            }
            i10 += interfaceC1969t0.x() - x10;
        }
    }

    private void b(InterfaceC1969t0 interfaceC1969t0, InterfaceC1969t0 interfaceC1969t02, int i10) {
        interfaceC1969t0.z(interfaceC1969t02, i10);
        this.f22330a.G(interfaceC1969t0.r(), null, new a1[]{new a1(interfaceC1969t02.r(), i10)}, null);
        if (interfaceC1969t02.I() != EnumC1934b0.PARENT) {
            a(interfaceC1969t0, interfaceC1969t02, i10 + 1);
        }
    }

    private void c(InterfaceC1969t0 interfaceC1969t0, InterfaceC1969t0 interfaceC1969t02, int i10) {
        int w10 = interfaceC1969t0.w(interfaceC1969t0.b(i10));
        if (interfaceC1969t0.I() != EnumC1934b0.PARENT) {
            a s10 = s(interfaceC1969t0, w10);
            if (s10 == null) {
                return;
            }
            InterfaceC1969t0 interfaceC1969t03 = s10.f22333a;
            w10 = s10.f22334b;
            interfaceC1969t0 = interfaceC1969t03;
        }
        if (interfaceC1969t02.I() != EnumC1934b0.NONE) {
            b(interfaceC1969t0, interfaceC1969t02, w10);
        } else {
            d(interfaceC1969t0, interfaceC1969t02, w10);
        }
    }

    private void d(InterfaceC1969t0 interfaceC1969t0, InterfaceC1969t0 interfaceC1969t02, int i10) {
        a(interfaceC1969t0, interfaceC1969t02, i10);
    }

    private void e(InterfaceC1969t0 interfaceC1969t0) {
        int r10 = interfaceC1969t0.r();
        if (this.f22332c.get(r10)) {
            return;
        }
        this.f22332c.put(r10, true);
        int T10 = interfaceC1969t0.T();
        int F10 = interfaceC1969t0.F();
        for (InterfaceC1969t0 parent = interfaceC1969t0.getParent(); parent != null && parent.I() != EnumC1934b0.PARENT; parent = parent.getParent()) {
            if (!parent.u()) {
                T10 += Math.round(parent.V());
                F10 += Math.round(parent.R());
            }
        }
        f(interfaceC1969t0, T10, F10);
    }

    private void f(InterfaceC1969t0 interfaceC1969t0, int i10, int i11) {
        if (interfaceC1969t0.I() != EnumC1934b0.NONE && interfaceC1969t0.a0() != null) {
            this.f22330a.P(interfaceC1969t0.Y().r(), interfaceC1969t0.r(), i10, i11, interfaceC1969t0.D(), interfaceC1969t0.d(), interfaceC1969t0.getLayoutDirection());
            return;
        }
        for (int i12 = 0; i12 < interfaceC1969t0.c(); i12++) {
            InterfaceC1969t0 b10 = interfaceC1969t0.b(i12);
            int r10 = b10.r();
            if (!this.f22332c.get(r10)) {
                this.f22332c.put(r10, true);
                f(b10, b10.T() + i10, b10.F() + i11);
            }
        }
    }

    public static void j(InterfaceC1969t0 interfaceC1969t0) {
        interfaceC1969t0.s();
    }

    private static boolean n(C1973v0 c1973v0) {
        if (c1973v0 == null) {
            return true;
        }
        if (c1973v0.c("collapsable") && !c1973v0.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = c1973v0.f22495a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!m1.a(c1973v0.f22495a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(InterfaceC1969t0 interfaceC1969t0, boolean z10) {
        if (interfaceC1969t0.I() != EnumC1934b0.PARENT) {
            for (int c10 = interfaceC1969t0.c() - 1; c10 >= 0; c10--) {
                q(interfaceC1969t0.b(c10), z10);
            }
        }
        InterfaceC1969t0 a02 = interfaceC1969t0.a0();
        if (a02 != null) {
            int y10 = a02.y(interfaceC1969t0);
            a02.U(y10);
            this.f22330a.G(a02.r(), new int[]{y10}, null, z10 ? new int[]{interfaceC1969t0.r()} : null);
        }
    }

    private void r(InterfaceC1969t0 interfaceC1969t0, C1973v0 c1973v0) {
        InterfaceC1969t0 parent = interfaceC1969t0.getParent();
        if (parent == null) {
            interfaceC1969t0.b0(false);
            return;
        }
        int N10 = parent.N(interfaceC1969t0);
        parent.f(N10);
        q(interfaceC1969t0, false);
        interfaceC1969t0.b0(false);
        this.f22330a.C(interfaceC1969t0.H(), interfaceC1969t0.r(), interfaceC1969t0.O(), c1973v0);
        parent.K(interfaceC1969t0, N10);
        c(parent, interfaceC1969t0, N10);
        for (int i10 = 0; i10 < interfaceC1969t0.c(); i10++) {
            c(interfaceC1969t0, interfaceC1969t0.b(i10), i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(interfaceC1969t0.r());
        sb2.append(" - rootTag: ");
        sb2.append(interfaceC1969t0.J());
        sb2.append(" - hasProps: ");
        sb2.append(c1973v0 != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f22332c.size());
        AbstractC1721a.s("NativeViewHierarchyOptimizer", sb2.toString());
        AbstractC4012a.a(this.f22332c.size() == 0);
        e(interfaceC1969t0);
        for (int i11 = 0; i11 < interfaceC1969t0.c(); i11++) {
            e(interfaceC1969t0.b(i11));
        }
        this.f22332c.clear();
    }

    private a s(InterfaceC1969t0 interfaceC1969t0, int i10) {
        while (interfaceC1969t0.I() != EnumC1934b0.PARENT) {
            InterfaceC1969t0 parent = interfaceC1969t0.getParent();
            if (parent == null) {
                return null;
            }
            i10 = i10 + (interfaceC1969t0.I() == EnumC1934b0.LEAF ? 1 : 0) + parent.w(interfaceC1969t0);
            interfaceC1969t0 = parent;
        }
        return new a(interfaceC1969t0, i10);
    }

    public void g(InterfaceC1969t0 interfaceC1969t0, F0 f02, C1973v0 c1973v0) {
        interfaceC1969t0.b0(interfaceC1969t0.O().equals(ReactViewManager.REACT_CLASS) && n(c1973v0));
        if (interfaceC1969t0.I() != EnumC1934b0.NONE) {
            this.f22330a.C(f02, interfaceC1969t0.r(), interfaceC1969t0.O(), c1973v0);
        }
    }

    public void h(InterfaceC1969t0 interfaceC1969t0) {
        if (interfaceC1969t0.d0()) {
            r(interfaceC1969t0, null);
        }
    }

    public void i(InterfaceC1969t0 interfaceC1969t0, int[] iArr, int[] iArr2, a1[] a1VarArr, int[] iArr3) {
        boolean z10;
        for (int i10 : iArr2) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArr3.length) {
                    z10 = false;
                    break;
                } else {
                    if (iArr3[i11] == i10) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            q(this.f22331b.c(i10), z10);
        }
        for (a1 a1Var : a1VarArr) {
            c(interfaceC1969t0, this.f22331b.c(a1Var.f22318a), a1Var.f22319b);
        }
    }

    public void k(InterfaceC1969t0 interfaceC1969t0, ReadableArray readableArray) {
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            c(interfaceC1969t0, this.f22331b.c(readableArray.getInt(i10)), i10);
        }
    }

    public void l(InterfaceC1969t0 interfaceC1969t0) {
        e(interfaceC1969t0);
    }

    public void m(InterfaceC1969t0 interfaceC1969t0, String str, C1973v0 c1973v0) {
        if (interfaceC1969t0.d0() && !n(c1973v0)) {
            r(interfaceC1969t0, c1973v0);
        } else {
            if (interfaceC1969t0.d0()) {
                return;
            }
            this.f22330a.Q(interfaceC1969t0.r(), str, c1973v0);
        }
    }

    public void o() {
        this.f22332c.clear();
    }

    void p(InterfaceC1969t0 interfaceC1969t0) {
        this.f22332c.clear();
    }
}
