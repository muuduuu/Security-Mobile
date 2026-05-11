package o0;

import java.util.ArrayList;
import o0.e;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3738c {

    /* renamed from: a, reason: collision with root package name */
    protected e f37640a;

    /* renamed from: b, reason: collision with root package name */
    protected e f37641b;

    /* renamed from: c, reason: collision with root package name */
    protected e f37642c;

    /* renamed from: d, reason: collision with root package name */
    protected e f37643d;

    /* renamed from: e, reason: collision with root package name */
    protected e f37644e;

    /* renamed from: f, reason: collision with root package name */
    protected e f37645f;

    /* renamed from: g, reason: collision with root package name */
    protected e f37646g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f37647h;

    /* renamed from: i, reason: collision with root package name */
    protected int f37648i;

    /* renamed from: j, reason: collision with root package name */
    protected int f37649j;

    /* renamed from: k, reason: collision with root package name */
    protected float f37650k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f37651l;

    /* renamed from: m, reason: collision with root package name */
    int f37652m;

    /* renamed from: n, reason: collision with root package name */
    int f37653n;

    /* renamed from: o, reason: collision with root package name */
    boolean f37654o;

    /* renamed from: p, reason: collision with root package name */
    private int f37655p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37656q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f37657r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f37658s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f37659t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f37660u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37661v;

    public C3738c(e eVar, int i10, boolean z10) {
        this.f37640a = eVar;
        this.f37655p = i10;
        this.f37656q = z10;
    }

    private void b() {
        int i10 = this.f37655p * 2;
        e eVar = this.f37640a;
        this.f37654o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f37648i++;
            e[] eVarArr = eVar.f37682E0;
            int i11 = this.f37655p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f37680D0[i11] = null;
            if (eVar.T() != 8) {
                this.f37651l++;
                e.b s10 = eVar.s(this.f37655p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f37652m += eVar.C(this.f37655p);
                }
                int e10 = this.f37652m + eVar.f37704W[i10].e();
                this.f37652m = e10;
                int i12 = i10 + 1;
                this.f37652m = e10 + eVar.f37704W[i12].e();
                int e11 = this.f37653n + eVar.f37704W[i10].e();
                this.f37653n = e11;
                this.f37653n = e11 + eVar.f37704W[i12].e();
                if (this.f37641b == null) {
                    this.f37641b = eVar;
                }
                this.f37643d = eVar;
                e.b[] bVarArr = eVar.f37707Z;
                int i13 = this.f37655p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f37756y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f37649j++;
                        float f10 = eVar.f37678C0[i13];
                        if (f10 > 0.0f) {
                            this.f37650k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f37657r = true;
                            } else {
                                this.f37658s = true;
                            }
                            if (this.f37647h == null) {
                                this.f37647h = new ArrayList();
                            }
                            this.f37647h.add(eVar);
                        }
                        if (this.f37645f == null) {
                            this.f37645f = eVar;
                        }
                        e eVar4 = this.f37646g;
                        if (eVar4 != null) {
                            eVar4.f37680D0[this.f37655p] = eVar;
                        }
                        this.f37646g = eVar;
                    }
                    if (this.f37655p == 0) {
                        if (eVar.f37752w != 0) {
                            this.f37654o = false;
                        } else if (eVar.f37758z != 0 || eVar.f37673A != 0) {
                            this.f37654o = false;
                        }
                    } else if (eVar.f37754x != 0) {
                        this.f37654o = false;
                    } else if (eVar.f37677C != 0 || eVar.f37679D != 0) {
                        this.f37654o = false;
                    }
                    if (eVar.f37715d0 != 0.0f) {
                        this.f37654o = false;
                        this.f37660u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f37682E0[this.f37655p] = eVar;
            }
            d dVar = eVar.f37704W[i10 + 1].f37667f;
            if (dVar != null) {
                e eVar5 = dVar.f37665d;
                d dVar2 = eVar5.f37704W[i10].f37667f;
                if (dVar2 != null && dVar2.f37665d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f37641b;
        if (eVar6 != null) {
            this.f37652m -= eVar6.f37704W[i10].e();
        }
        e eVar7 = this.f37643d;
        if (eVar7 != null) {
            this.f37652m -= eVar7.f37704W[i10 + 1].e();
        }
        this.f37642c = eVar;
        if (this.f37655p == 0 && this.f37656q) {
            this.f37644e = eVar;
        } else {
            this.f37644e = this.f37640a;
        }
        this.f37659t = this.f37658s && this.f37657r;
    }

    private static boolean c(e eVar, int i10) {
        int i11;
        return eVar.T() != 8 && eVar.f37707Z[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f37756y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f37661v) {
            b();
        }
        this.f37661v = true;
    }
}
