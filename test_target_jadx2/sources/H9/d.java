package h9;

import V6.AbstractC1287s;
import X8.C1298d;
import g9.C3205e;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final f f33994a;

    /* renamed from: b, reason: collision with root package name */
    private final C1298d f33995b;

    d(f fVar, C1298d c1298d) {
        this.f33994a = fVar;
        this.f33995b = c1298d;
    }

    public final C3299a a() {
        return b(C3299a.f33985h);
    }

    public final C3299a b(C3205e c3205e) {
        AbstractC1287s.n(c3205e, "You must provide a valid FaceDetectorOptions.");
        return new C3299a((i) this.f33994a.b(c3205e), this.f33995b, c3205e, null);
    }
}
