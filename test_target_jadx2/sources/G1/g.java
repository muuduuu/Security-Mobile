package G1;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f2840a = new f();

    public f a() {
        return this.f2840a;
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
        return this.f2840a.p();
    }

    public boolean f(Exception exc) {
        return this.f2840a.q(exc);
    }

    public boolean g(Object obj) {
        return this.f2840a.r(obj);
    }
}
