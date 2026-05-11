package c0;

import android.util.Range;

/* loaded from: classes.dex */
public class m0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f19262a;

    public m0(r0 r0Var) {
        y0.f.a(r0Var.d());
        this.f19262a = r0Var;
    }

    @Override // c0.r0
    public int b() {
        return this.f19262a.g();
    }

    @Override // c0.r0
    public Range c() {
        return this.f19262a.c();
    }

    @Override // c0.r0
    public boolean d() {
        return this.f19262a.d();
    }

    @Override // c0.r0
    public Range e(int i10) {
        return this.f19262a.f(i10);
    }

    @Override // c0.r0
    public Range f(int i10) {
        return this.f19262a.e(i10);
    }

    @Override // c0.r0
    public int g() {
        return this.f19262a.b();
    }

    @Override // c0.r0
    public Range h() {
        return this.f19262a.j();
    }

    @Override // c0.r0
    public boolean i(int i10, int i11) {
        return this.f19262a.i(i11, i10);
    }

    @Override // c0.r0
    public Range j() {
        return this.f19262a.h();
    }
}
