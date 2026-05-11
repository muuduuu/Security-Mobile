package c2;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1720c {

    /* renamed from: a, reason: collision with root package name */
    private final C1719b f19358a;

    /* renamed from: b, reason: collision with root package name */
    private R1.a f19359b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f19360c;

    public C1720c() {
        this.f19358a = new C1719b();
        this.f19360c = null;
    }

    public Object a(C1719b c1719b) {
        return this.f19360c;
    }

    public final Object b(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        return a(this.f19358a.h(f10, f11, obj, obj2, f12, f13, f14));
    }

    public final void c(R1.a aVar) {
        this.f19359b = aVar;
    }

    public C1720c(Object obj) {
        this.f19358a = new C1719b();
        this.f19360c = obj;
    }
}
