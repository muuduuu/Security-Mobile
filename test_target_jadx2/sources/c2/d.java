package c2;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private float f19361a;

    /* renamed from: b, reason: collision with root package name */
    private float f19362b;

    public d(float f10, float f11) {
        this.f19361a = f10;
        this.f19362b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f19361a == f10 && this.f19362b == f11;
    }

    public float b() {
        return this.f19361a;
    }

    public float c() {
        return this.f19362b;
    }

    public void d(float f10, float f11) {
        this.f19361a = f10;
        this.f19362b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
