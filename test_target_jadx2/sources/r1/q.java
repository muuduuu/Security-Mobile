package R1;

import c2.C1718a;
import c2.C1720c;
import java.util.Collections;

/* loaded from: classes.dex */
public class q extends a {

    /* renamed from: i, reason: collision with root package name */
    private final Object f8443i;

    public q(C1720c c1720c) {
        this(c1720c, null);
    }

    @Override // R1.a
    float c() {
        return 1.0f;
    }

    @Override // R1.a
    public Object h() {
        C1720c c1720c = this.f8376e;
        Object obj = this.f8443i;
        return c1720c.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // R1.a
    Object i(C1718a c1718a, float f10) {
        return h();
    }

    @Override // R1.a
    public void l() {
        if (this.f8376e != null) {
            super.l();
        }
    }

    @Override // R1.a
    public void n(float f10) {
        this.f8375d = f10;
    }

    public q(C1720c c1720c, Object obj) {
        super(Collections.emptyList());
        o(c1720c);
        this.f8443i = obj;
    }
}
