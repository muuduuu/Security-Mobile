package v;

import A.B;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import v.C4896g;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4898i implements C4896g.a {

    /* renamed from: a, reason: collision with root package name */
    static final C4896g f43787a = new C4896g(new C4898i());

    /* renamed from: b, reason: collision with root package name */
    private static final Set f43788b = Collections.singleton(B.f7d);

    C4898i() {
    }

    @Override // v.C4896g.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // v.C4896g.a
    public Set b(B b10) {
        y0.f.b(B.f7d.equals(b10), "DynamicRange is not supported: " + b10);
        return f43788b;
    }

    @Override // v.C4896g.a
    public Set c() {
        return f43788b;
    }
}
