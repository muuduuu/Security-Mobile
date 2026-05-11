package W4;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f11395a = new d();

    public d a() {
        return this.f11395a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f11395a.x();
    }

    public boolean f(Exception exc) {
        return this.f11395a.y(exc);
    }

    public boolean g(Object obj) {
        return this.f11395a.z(obj);
    }
}
