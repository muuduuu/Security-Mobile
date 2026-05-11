package J2;

import J2.b;
import J2.g;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    b.r f4483a;

    /* renamed from: b, reason: collision with root package name */
    e f4484b;

    /* renamed from: c, reason: collision with root package name */
    String f4485c;

    /* renamed from: d, reason: collision with root package name */
    g.C0847b f4486d;

    /* renamed from: e, reason: collision with root package name */
    String f4487e;

    /* renamed from: f, reason: collision with root package name */
    g.C0847b f4488f;

    public f() {
        this.f4483a = null;
        this.f4484b = null;
        this.f4485c = null;
        this.f4486d = null;
        this.f4487e = null;
        this.f4488f = null;
    }

    public boolean a() {
        b.r rVar = this.f4483a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.f4484b != null;
    }

    public boolean c() {
        return this.f4485c != null;
    }

    public boolean d() {
        return this.f4487e != null;
    }

    public boolean e() {
        return this.f4486d != null;
    }

    public boolean f() {
        return this.f4488f != null;
    }

    public f g(float f10, float f11, float f12, float f13) {
        this.f4488f = new g.C0847b(f10, f11, f12, f13);
        return this;
    }

    public f(f fVar) {
        this.f4483a = null;
        this.f4484b = null;
        this.f4485c = null;
        this.f4486d = null;
        this.f4487e = null;
        this.f4488f = null;
        if (fVar == null) {
            return;
        }
        this.f4483a = fVar.f4483a;
        this.f4484b = fVar.f4484b;
        this.f4486d = fVar.f4486d;
        this.f4487e = fVar.f4487e;
        this.f4488f = fVar.f4488f;
    }
}
