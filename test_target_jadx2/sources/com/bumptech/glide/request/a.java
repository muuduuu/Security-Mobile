package com.bumptech.glide.request;

import D2.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i2.EnumC3314b;
import i2.l;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import r2.C4004c;
import r2.n;
import r2.t;
import r2.v;
import v2.AbstractC4919i;
import v2.C4913c;
import v2.C4916f;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f20340a;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f20344e;

    /* renamed from: f, reason: collision with root package name */
    private int f20345f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f20346g;

    /* renamed from: h, reason: collision with root package name */
    private int f20347h;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20352m;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f20354o;

    /* renamed from: p, reason: collision with root package name */
    private int f20355p;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20359t;

    /* renamed from: u, reason: collision with root package name */
    private Resources.Theme f20360u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20361v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20362w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20363x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20365z;

    /* renamed from: b, reason: collision with root package name */
    private float f20341b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private k2.j f20342c = k2.j.f36076e;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.h f20343d = com.bumptech.glide.h.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20348i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f20349j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f20350k = -1;

    /* renamed from: l, reason: collision with root package name */
    private i2.f f20351l = C2.b.c();

    /* renamed from: n, reason: collision with root package name */
    private boolean f20353n = true;

    /* renamed from: q, reason: collision with root package name */
    private i2.h f20356q = new i2.h();

    /* renamed from: r, reason: collision with root package name */
    private Map f20357r = new D2.b();

    /* renamed from: s, reason: collision with root package name */
    private Class f20358s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20364y = true;

    private boolean R(int i10) {
        return S(this.f20340a, i10);
    }

    private static boolean S(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a a0(n nVar, l lVar) {
        return b0(nVar, lVar, true);
    }

    private a b0(n nVar, l lVar, boolean z10) {
        a l02 = z10 ? l0(nVar, lVar) : X(nVar, lVar);
        l02.f20364y = true;
        return l02;
    }

    private a c0() {
        return this;
    }

    public final Drawable A() {
        return this.f20346g;
    }

    public final int B() {
        return this.f20347h;
    }

    public final com.bumptech.glide.h C() {
        return this.f20343d;
    }

    public final Class D() {
        return this.f20358s;
    }

    public final i2.f E() {
        return this.f20351l;
    }

    public final float G() {
        return this.f20341b;
    }

    public final Resources.Theme H() {
        return this.f20360u;
    }

    public final Map J() {
        return this.f20357r;
    }

    public final boolean K() {
        return this.f20365z;
    }

    public final boolean L() {
        return this.f20362w;
    }

    protected final boolean M() {
        return this.f20361v;
    }

    public final boolean N(a aVar) {
        return Float.compare(aVar.f20341b, this.f20341b) == 0 && this.f20345f == aVar.f20345f && D2.l.e(this.f20344e, aVar.f20344e) && this.f20347h == aVar.f20347h && D2.l.e(this.f20346g, aVar.f20346g) && this.f20355p == aVar.f20355p && D2.l.e(this.f20354o, aVar.f20354o) && this.f20348i == aVar.f20348i && this.f20349j == aVar.f20349j && this.f20350k == aVar.f20350k && this.f20352m == aVar.f20352m && this.f20353n == aVar.f20353n && this.f20362w == aVar.f20362w && this.f20363x == aVar.f20363x && this.f20342c.equals(aVar.f20342c) && this.f20343d == aVar.f20343d && this.f20356q.equals(aVar.f20356q) && this.f20357r.equals(aVar.f20357r) && this.f20358s.equals(aVar.f20358s) && D2.l.e(this.f20351l, aVar.f20351l) && D2.l.e(this.f20360u, aVar.f20360u);
    }

    public final boolean O() {
        return this.f20348i;
    }

    public final boolean P() {
        return R(8);
    }

    boolean Q() {
        return this.f20364y;
    }

    public final boolean T() {
        return this.f20352m;
    }

    public final boolean U() {
        return D2.l.u(this.f20350k, this.f20349j);
    }

    public a V() {
        this.f20359t = true;
        return c0();
    }

    public a W(boolean z10) {
        if (this.f20361v) {
            return clone().W(z10);
        }
        this.f20363x = z10;
        this.f20340a |= 524288;
        return d0();
    }

    final a X(n nVar, l lVar) {
        if (this.f20361v) {
            return clone().X(nVar, lVar);
        }
        l(nVar);
        return j0(lVar, false);
    }

    public a Y(int i10, int i11) {
        if (this.f20361v) {
            return clone().Y(i10, i11);
        }
        this.f20350k = i10;
        this.f20349j = i11;
        this.f20340a |= 512;
        return d0();
    }

    public a Z(com.bumptech.glide.h hVar) {
        if (this.f20361v) {
            return clone().Z(hVar);
        }
        this.f20343d = (com.bumptech.glide.h) k.d(hVar);
        this.f20340a |= 8;
        return d0();
    }

    public a a(a aVar) {
        if (this.f20361v) {
            return clone().a(aVar);
        }
        if (S(aVar.f20340a, 2)) {
            this.f20341b = aVar.f20341b;
        }
        if (S(aVar.f20340a, 262144)) {
            this.f20362w = aVar.f20362w;
        }
        if (S(aVar.f20340a, 1048576)) {
            this.f20365z = aVar.f20365z;
        }
        if (S(aVar.f20340a, 4)) {
            this.f20342c = aVar.f20342c;
        }
        if (S(aVar.f20340a, 8)) {
            this.f20343d = aVar.f20343d;
        }
        if (S(aVar.f20340a, 16)) {
            this.f20344e = aVar.f20344e;
            this.f20345f = 0;
            this.f20340a &= -33;
        }
        if (S(aVar.f20340a, 32)) {
            this.f20345f = aVar.f20345f;
            this.f20344e = null;
            this.f20340a &= -17;
        }
        if (S(aVar.f20340a, 64)) {
            this.f20346g = aVar.f20346g;
            this.f20347h = 0;
            this.f20340a &= -129;
        }
        if (S(aVar.f20340a, 128)) {
            this.f20347h = aVar.f20347h;
            this.f20346g = null;
            this.f20340a &= -65;
        }
        if (S(aVar.f20340a, PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            this.f20348i = aVar.f20348i;
        }
        if (S(aVar.f20340a, 512)) {
            this.f20350k = aVar.f20350k;
            this.f20349j = aVar.f20349j;
        }
        if (S(aVar.f20340a, 1024)) {
            this.f20351l = aVar.f20351l;
        }
        if (S(aVar.f20340a, 4096)) {
            this.f20358s = aVar.f20358s;
        }
        if (S(aVar.f20340a, 8192)) {
            this.f20354o = aVar.f20354o;
            this.f20355p = 0;
            this.f20340a &= -16385;
        }
        if (S(aVar.f20340a, 16384)) {
            this.f20355p = aVar.f20355p;
            this.f20354o = null;
            this.f20340a &= -8193;
        }
        if (S(aVar.f20340a, 32768)) {
            this.f20360u = aVar.f20360u;
        }
        if (S(aVar.f20340a, 65536)) {
            this.f20353n = aVar.f20353n;
        }
        if (S(aVar.f20340a, 131072)) {
            this.f20352m = aVar.f20352m;
        }
        if (S(aVar.f20340a, 2048)) {
            this.f20357r.putAll(aVar.f20357r);
            this.f20364y = aVar.f20364y;
        }
        if (S(aVar.f20340a, 524288)) {
            this.f20363x = aVar.f20363x;
        }
        if (!this.f20353n) {
            this.f20357r.clear();
            int i10 = this.f20340a;
            this.f20352m = false;
            this.f20340a = i10 & (-133121);
            this.f20364y = true;
        }
        this.f20340a |= aVar.f20340a;
        this.f20356q.d(aVar.f20356q);
        return d0();
    }

    public a b() {
        if (this.f20359t && !this.f20361v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f20361v = true;
        return V();
    }

    public a d() {
        return a0(n.f39166d, new r2.l());
    }

    protected final a d0() {
        if (this.f20359t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return c0();
    }

    public a e0(i2.g gVar, Object obj) {
        if (this.f20361v) {
            return clone().e0(gVar, obj);
        }
        k.d(gVar);
        k.d(obj);
        this.f20356q.e(gVar, obj);
        return d0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return N((a) obj);
        }
        return false;
    }

    public a f0(i2.f fVar) {
        if (this.f20361v) {
            return clone().f0(fVar);
        }
        this.f20351l = (i2.f) k.d(fVar);
        this.f20340a |= 1024;
        return d0();
    }

    public a g0(float f10) {
        if (this.f20361v) {
            return clone().g0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f20341b = f10;
        this.f20340a |= 2;
        return d0();
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i2.h hVar = new i2.h();
            aVar.f20356q = hVar;
            hVar.d(this.f20356q);
            D2.b bVar = new D2.b();
            aVar.f20357r = bVar;
            bVar.putAll(this.f20357r);
            aVar.f20359t = false;
            aVar.f20361v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a h0(boolean z10) {
        if (this.f20361v) {
            return clone().h0(true);
        }
        this.f20348i = !z10;
        this.f20340a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return d0();
    }

    public int hashCode() {
        return D2.l.p(this.f20360u, D2.l.p(this.f20351l, D2.l.p(this.f20358s, D2.l.p(this.f20357r, D2.l.p(this.f20356q, D2.l.p(this.f20343d, D2.l.p(this.f20342c, D2.l.q(this.f20363x, D2.l.q(this.f20362w, D2.l.q(this.f20353n, D2.l.q(this.f20352m, D2.l.o(this.f20350k, D2.l.o(this.f20349j, D2.l.q(this.f20348i, D2.l.p(this.f20354o, D2.l.o(this.f20355p, D2.l.p(this.f20346g, D2.l.o(this.f20347h, D2.l.p(this.f20344e, D2.l.o(this.f20345f, D2.l.m(this.f20341b)))))))))))))))))))));
    }

    public a i(Class cls) {
        if (this.f20361v) {
            return clone().i(cls);
        }
        this.f20358s = (Class) k.d(cls);
        this.f20340a |= 4096;
        return d0();
    }

    public a i0(l lVar) {
        return j0(lVar, true);
    }

    a j0(l lVar, boolean z10) {
        if (this.f20361v) {
            return clone().j0(lVar, z10);
        }
        v vVar = new v(lVar, z10);
        k0(Bitmap.class, lVar, z10);
        k0(Drawable.class, vVar, z10);
        k0(BitmapDrawable.class, vVar.c(), z10);
        k0(C4913c.class, new C4916f(lVar), z10);
        return d0();
    }

    public a k(k2.j jVar) {
        if (this.f20361v) {
            return clone().k(jVar);
        }
        this.f20342c = (k2.j) k.d(jVar);
        this.f20340a |= 4;
        return d0();
    }

    a k0(Class cls, l lVar, boolean z10) {
        if (this.f20361v) {
            return clone().k0(cls, lVar, z10);
        }
        k.d(cls);
        k.d(lVar);
        this.f20357r.put(cls, lVar);
        int i10 = this.f20340a;
        this.f20353n = true;
        this.f20340a = 67584 | i10;
        this.f20364y = false;
        if (z10) {
            this.f20340a = i10 | 198656;
            this.f20352m = true;
        }
        return d0();
    }

    public a l(n nVar) {
        return e0(n.f39170h, k.d(nVar));
    }

    final a l0(n nVar, l lVar) {
        if (this.f20361v) {
            return clone().l0(nVar, lVar);
        }
        l(nVar);
        return i0(lVar);
    }

    public a m(int i10) {
        return e0(C4004c.f39149b, Integer.valueOf(i10));
    }

    public a m0(boolean z10) {
        if (this.f20361v) {
            return clone().m0(z10);
        }
        this.f20365z = z10;
        this.f20340a |= 1048576;
        return d0();
    }

    public a n(EnumC3314b enumC3314b) {
        k.d(enumC3314b);
        return e0(t.f39172f, enumC3314b).e0(AbstractC4919i.f43858a, enumC3314b);
    }

    public final k2.j o() {
        return this.f20342c;
    }

    public final int p() {
        return this.f20345f;
    }

    public final Drawable q() {
        return this.f20344e;
    }

    public final Drawable s() {
        return this.f20354o;
    }

    public final int v() {
        return this.f20355p;
    }

    public final boolean w() {
        return this.f20363x;
    }

    public final i2.h x() {
        return this.f20356q;
    }

    public final int y() {
        return this.f20349j;
    }

    public final int z() {
        return this.f20350k;
    }
}
