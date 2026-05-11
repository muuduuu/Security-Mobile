package Q;

import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.UUID;

/* loaded from: classes.dex */
class i implements l1.a {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f7807a;

    i() {
        this(B0.d0());
    }

    @Override // androidx.camera.core.impl.l1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j c() {
        return new j(G0.b0(this.f7807a));
    }

    @Override // A.C
    public A0 b() {
        return this.f7807a;
    }

    public i d(m1.b bVar) {
        b().x(l1.f14636F, bVar);
        return this;
    }

    public i e(Class cls) {
        b().x(H.m.f3079c, cls);
        if (b().f(H.m.f3078b, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public i f(String str) {
        b().x(H.m.f3078b, str);
        return this;
    }

    i(B0 b02) {
        this.f7807a = b02;
        Class cls = (Class) b02.f(H.m.f3079c, null);
        if (cls == null || cls.equals(h.class)) {
            d(m1.b.STREAM_SHARING);
            e(h.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
