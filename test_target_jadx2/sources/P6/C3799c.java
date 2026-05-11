package p6;

import q6.C3923a;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3799c extends e {

    /* renamed from: m, reason: collision with root package name */
    static final int f38330m = e.a("ANMF");

    /* renamed from: d, reason: collision with root package name */
    int f38331d;

    /* renamed from: e, reason: collision with root package name */
    int f38332e;

    /* renamed from: f, reason: collision with root package name */
    int f38333f;

    /* renamed from: g, reason: collision with root package name */
    int f38334g;

    /* renamed from: h, reason: collision with root package name */
    int f38335h;

    /* renamed from: i, reason: collision with root package name */
    byte f38336i;

    /* renamed from: j, reason: collision with root package name */
    C3797a f38337j;

    /* renamed from: k, reason: collision with root package name */
    i f38338k;

    /* renamed from: l, reason: collision with root package name */
    j f38339l;

    @Override // p6.e
    void b(C3923a c3923a) {
        int available = c3923a.available();
        this.f38331d = c3923a.d();
        this.f38332e = c3923a.d();
        this.f38333f = c3923a.a();
        this.f38334g = c3923a.a();
        this.f38335h = c3923a.d();
        this.f38336i = c3923a.peek();
        long j10 = available - this.f38348b;
        while (c3923a.available() > j10) {
            e c10 = m.c(c3923a);
            if (c10 instanceof C3797a) {
                this.f38337j = (C3797a) c10;
            } else if (c10 instanceof i) {
                this.f38338k = (i) c10;
            } else if (c10 instanceof j) {
                this.f38339l = (j) c10;
            }
        }
    }

    boolean d() {
        return (this.f38336i & 2) == 2;
    }

    boolean e() {
        return (this.f38336i & 1) == 1;
    }
}
