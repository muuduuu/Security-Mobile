package Q1;

import R1.a;
import W1.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f8043a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8044b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8045c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final t.a f8046d;

    /* renamed from: e, reason: collision with root package name */
    private final R1.a f8047e;

    /* renamed from: f, reason: collision with root package name */
    private final R1.a f8048f;

    /* renamed from: g, reason: collision with root package name */
    private final R1.a f8049g;

    public u(X1.b bVar, W1.t tVar) {
        this.f8043a = tVar.c();
        this.f8044b = tVar.g();
        this.f8046d = tVar.f();
        R1.d p10 = tVar.e().p();
        this.f8047e = p10;
        R1.d p11 = tVar.b().p();
        this.f8048f = p11;
        R1.d p12 = tVar.d().p();
        this.f8049g = p12;
        bVar.i(p10);
        bVar.i(p11);
        bVar.i(p12);
        p10.a(this);
        p11.a(this);
        p12.a(this);
    }

    @Override // R1.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f8045c.size(); i10++) {
            ((a.b) this.f8045c.get(i10)).a();
        }
    }

    void d(a.b bVar) {
        this.f8045c.add(bVar);
    }

    public R1.a e() {
        return this.f8048f;
    }

    public R1.a h() {
        return this.f8049g;
    }

    public R1.a i() {
        return this.f8047e;
    }

    t.a j() {
        return this.f8046d;
    }

    public boolean k() {
        return this.f8044b;
    }

    @Override // Q1.c
    public void b(List list, List list2) {
    }
}
