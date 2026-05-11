package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2921x {

    /* renamed from: A, reason: collision with root package name */
    private double[] f29088A;

    /* renamed from: B, reason: collision with root package name */
    private int f29089B;

    /* renamed from: C, reason: collision with root package name */
    private int f29090C;

    /* renamed from: D, reason: collision with root package name */
    private int f29091D;

    /* renamed from: E, reason: collision with root package name */
    private int f29092E;

    /* renamed from: F, reason: collision with root package name */
    private int f29093F;

    /* renamed from: G, reason: collision with root package name */
    private int f29094G;

    /* renamed from: H, reason: collision with root package name */
    private int f29095H;

    /* renamed from: I, reason: collision with root package name */
    private int f29096I;

    /* renamed from: J, reason: collision with root package name */
    private int f29097J;

    /* renamed from: K, reason: collision with root package name */
    private int f29098K;

    /* renamed from: L, reason: collision with root package name */
    private int f29099L;

    /* renamed from: M, reason: collision with root package name */
    private final float f29100M;

    /* renamed from: N, reason: collision with root package name */
    private final float f29101N;

    /* renamed from: O, reason: collision with root package name */
    private final float f29102O;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f29103a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f29104b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f29105c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f29106d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f29107e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f29108f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f29109g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f29110h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f29111i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f29112j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f29113k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f29114l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f29115m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f29116n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f29117o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f29118p;

    /* renamed from: q, reason: collision with root package name */
    private double f29119q;

    /* renamed from: r, reason: collision with root package name */
    private C2919v f29120r;

    /* renamed from: s, reason: collision with root package name */
    private double f29121s;

    /* renamed from: t, reason: collision with root package name */
    private double f29122t;

    /* renamed from: u, reason: collision with root package name */
    private double f29123u;

    /* renamed from: v, reason: collision with root package name */
    private double f29124v;

    /* renamed from: w, reason: collision with root package name */
    private SVGLength[] f29125w;

    /* renamed from: x, reason: collision with root package name */
    private SVGLength[] f29126x;

    /* renamed from: y, reason: collision with root package name */
    private SVGLength[] f29127y;

    /* renamed from: z, reason: collision with root package name */
    private SVGLength[] f29128z;

    C2921x(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        this.f29103a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f29104b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f29105c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f29106d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f29107e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f29108f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f29109g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f29110h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f29111i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.f29112j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.f29113k = arrayList11;
        this.f29114l = new ArrayList();
        this.f29115m = new ArrayList();
        this.f29116n = new ArrayList();
        this.f29117o = new ArrayList();
        this.f29118p = new ArrayList();
        this.f29119q = 12.0d;
        this.f29120r = C2919v.f29064p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f29125w = sVGLengthArr;
        this.f29126x = new SVGLength[0];
        this.f29127y = new SVGLength[0];
        this.f29128z = new SVGLength[0];
        this.f29088A = new double[]{0.0d};
        this.f29094G = -1;
        this.f29095H = -1;
        this.f29096I = -1;
        this.f29097J = -1;
        this.f29098K = -1;
        this.f29100M = f10;
        this.f29101N = f11;
        this.f29102O = f12;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f29126x);
        arrayList4.add(this.f29127y);
        arrayList5.add(this.f29128z);
        arrayList6.add(this.f29088A);
        arrayList7.add(Integer.valueOf(this.f29094G));
        arrayList8.add(Integer.valueOf(this.f29095H));
        arrayList9.add(Integer.valueOf(this.f29096I));
        arrayList10.add(Integer.valueOf(this.f29097J));
        arrayList11.add(Integer.valueOf(this.f29098K));
        arrayList.add(this.f29120r);
        q();
    }

    private double[] a(ArrayList arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((SVGLength) arrayList.get(i10)).f28946a;
        }
        return dArr;
    }

    private SVGLength[] e(ArrayList arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVGLengthArr[i10] = (SVGLength) arrayList.get(i10);
        }
        return sVGLengthArr;
    }

    private C2919v f(C2923z c2923z) {
        if (this.f29099L > 0) {
            return this.f29120r;
        }
        for (C2923z parentTextRoot = c2923z.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C2919v b10 = parentTextRoot.t().b();
            if (b10 != C2919v.f29064p) {
                return b10;
            }
        }
        return C2919v.f29064p;
    }

    private static void h(ArrayList arrayList, int i10) {
        while (i10 >= 0) {
            arrayList.set(i10, Integer.valueOf(((Integer) arrayList.get(i10)).intValue() + 1));
            i10--;
        }
    }

    private void q() {
        this.f29114l.add(Integer.valueOf(this.f29089B));
        this.f29115m.add(Integer.valueOf(this.f29090C));
        this.f29116n.add(Integer.valueOf(this.f29091D));
        this.f29117o.add(Integer.valueOf(this.f29092E));
        this.f29118p.add(Integer.valueOf(this.f29093F));
    }

    private void r(C2923z c2923z, ReadableMap readableMap) {
        C2919v f10 = f(c2923z);
        this.f29099L++;
        if (readableMap == null) {
            this.f29103a.add(f10);
            return;
        }
        C2919v c2919v = new C2919v(readableMap, f10, this.f29100M);
        this.f29119q = c2919v.f29065a;
        this.f29103a.add(c2919v);
        this.f29120r = c2919v;
    }

    private void s() {
        this.f29093F = 0;
        this.f29092E = 0;
        this.f29091D = 0;
        this.f29090C = 0;
        this.f29089B = 0;
        this.f29098K = -1;
        this.f29097J = -1;
        this.f29096I = -1;
        this.f29095H = -1;
        this.f29094G = -1;
        this.f29124v = 0.0d;
        this.f29123u = 0.0d;
        this.f29122t = 0.0d;
        this.f29121s = 0.0d;
    }

    C2919v b() {
        return this.f29120r;
    }

    double c() {
        return this.f29119q;
    }

    float d() {
        return this.f29102O;
    }

    float g() {
        return this.f29101N;
    }

    double i() {
        h(this.f29111i, this.f29091D);
        int i10 = this.f29096I + 1;
        SVGLength[] sVGLengthArr = this.f29127y;
        if (i10 < sVGLengthArr.length) {
            this.f29096I = i10;
            this.f29123u += K.a(sVGLengthArr[i10], this.f29101N, 0.0d, this.f29100M, this.f29119q);
        }
        return this.f29123u;
    }

    double j() {
        h(this.f29112j, this.f29092E);
        int i10 = this.f29097J + 1;
        SVGLength[] sVGLengthArr = this.f29128z;
        if (i10 < sVGLengthArr.length) {
            this.f29097J = i10;
            this.f29124v += K.a(sVGLengthArr[i10], this.f29102O, 0.0d, this.f29100M, this.f29119q);
        }
        return this.f29124v;
    }

    double k() {
        h(this.f29113k, this.f29093F);
        int min = Math.min(this.f29098K + 1, this.f29088A.length - 1);
        this.f29098K = min;
        return this.f29088A[min];
    }

    double l(double d10) {
        h(this.f29109g, this.f29089B);
        int i10 = this.f29094G + 1;
        SVGLength[] sVGLengthArr = this.f29125w;
        if (i10 < sVGLengthArr.length) {
            this.f29123u = 0.0d;
            this.f29094G = i10;
            this.f29121s = K.a(sVGLengthArr[i10], this.f29101N, 0.0d, this.f29100M, this.f29119q);
        }
        double d11 = this.f29121s + d10;
        this.f29121s = d11;
        return d11;
    }

    double m() {
        h(this.f29110h, this.f29090C);
        int i10 = this.f29095H + 1;
        SVGLength[] sVGLengthArr = this.f29126x;
        if (i10 < sVGLengthArr.length) {
            this.f29124v = 0.0d;
            this.f29095H = i10;
            this.f29122t = K.a(sVGLengthArr[i10], this.f29102O, 0.0d, this.f29100M, this.f29119q);
        }
        return this.f29122t;
    }

    void n() {
        this.f29103a.remove(this.f29099L);
        this.f29114l.remove(this.f29099L);
        this.f29115m.remove(this.f29099L);
        this.f29116n.remove(this.f29099L);
        this.f29117o.remove(this.f29099L);
        this.f29118p.remove(this.f29099L);
        int i10 = this.f29099L - 1;
        this.f29099L = i10;
        int i11 = this.f29089B;
        int i12 = this.f29090C;
        int i13 = this.f29091D;
        int i14 = this.f29092E;
        int i15 = this.f29093F;
        this.f29120r = (C2919v) this.f29103a.get(i10);
        this.f29089B = ((Integer) this.f29114l.get(this.f29099L)).intValue();
        this.f29090C = ((Integer) this.f29115m.get(this.f29099L)).intValue();
        this.f29091D = ((Integer) this.f29116n.get(this.f29099L)).intValue();
        this.f29092E = ((Integer) this.f29117o.get(this.f29099L)).intValue();
        this.f29093F = ((Integer) this.f29118p.get(this.f29099L)).intValue();
        if (i11 != this.f29089B) {
            this.f29104b.remove(i11);
            this.f29125w = (SVGLength[]) this.f29104b.get(this.f29089B);
            this.f29094G = ((Integer) this.f29109g.get(this.f29089B)).intValue();
        }
        if (i12 != this.f29090C) {
            this.f29105c.remove(i12);
            this.f29126x = (SVGLength[]) this.f29105c.get(this.f29090C);
            this.f29095H = ((Integer) this.f29110h.get(this.f29090C)).intValue();
        }
        if (i13 != this.f29091D) {
            this.f29106d.remove(i13);
            this.f29127y = (SVGLength[]) this.f29106d.get(this.f29091D);
            this.f29096I = ((Integer) this.f29111i.get(this.f29091D)).intValue();
        }
        if (i14 != this.f29092E) {
            this.f29107e.remove(i14);
            this.f29128z = (SVGLength[]) this.f29107e.get(this.f29092E);
            this.f29097J = ((Integer) this.f29112j.get(this.f29092E)).intValue();
        }
        if (i15 != this.f29093F) {
            this.f29108f.remove(i15);
            this.f29088A = (double[]) this.f29108f.get(this.f29093F);
            this.f29098K = ((Integer) this.f29113k.get(this.f29093F)).intValue();
        }
    }

    void o(C2923z c2923z, ReadableMap readableMap) {
        r(c2923z, readableMap);
        q();
    }

    void p(boolean z10, m0 m0Var, ReadableMap readableMap, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (z10) {
            s();
        }
        r(m0Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.f29089B++;
            this.f29094G = -1;
            this.f29109g.add(-1);
            SVGLength[] e10 = e(arrayList);
            this.f29125w = e10;
            this.f29104b.add(e10);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.f29090C++;
            this.f29095H = -1;
            this.f29110h.add(-1);
            SVGLength[] e11 = e(arrayList2);
            this.f29126x = e11;
            this.f29105c.add(e11);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.f29091D++;
            this.f29096I = -1;
            this.f29111i.add(-1);
            SVGLength[] e12 = e(arrayList3);
            this.f29127y = e12;
            this.f29106d.add(e12);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.f29092E++;
            this.f29097J = -1;
            this.f29112j.add(-1);
            SVGLength[] e13 = e(arrayList4);
            this.f29128z = e13;
            this.f29107e.add(e13);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.f29093F++;
            this.f29098K = -1;
            this.f29113k.add(-1);
            double[] a10 = a(arrayList5);
            this.f29088A = a10;
            this.f29108f.add(a10);
        }
        q();
    }
}
