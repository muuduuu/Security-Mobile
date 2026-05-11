package p6;

import q6.C3923a;

/* loaded from: classes2.dex */
public class k extends e {

    /* renamed from: g, reason: collision with root package name */
    static final int f38354g = e.a("VP8X");

    /* renamed from: d, reason: collision with root package name */
    byte f38355d;

    /* renamed from: e, reason: collision with root package name */
    public int f38356e;

    /* renamed from: f, reason: collision with root package name */
    public int f38357f;

    @Override // p6.e
    void b(C3923a c3923a) {
        this.f38355d = c3923a.peek();
        c3923a.skip(3L);
        this.f38356e = c3923a.a();
        this.f38357f = c3923a.a();
    }

    boolean d() {
        return (this.f38355d & 16) == 16;
    }

    boolean e() {
        return (this.f38355d & 2) == 2;
    }
}
