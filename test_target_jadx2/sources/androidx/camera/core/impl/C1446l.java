package androidx.camera.core.impl;

import androidx.camera.core.impl.b1;

/* renamed from: androidx.camera.core.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1446l extends b1 {

    /* renamed from: a, reason: collision with root package name */
    private final b1.b f14627a;

    /* renamed from: b, reason: collision with root package name */
    private final b1.a f14628b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14629c;

    C1446l(b1.b bVar, b1.a aVar, long j10) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f14627a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f14628b = aVar;
        this.f14629c = j10;
    }

    @Override // androidx.camera.core.impl.b1
    public b1.a c() {
        return this.f14628b;
    }

    @Override // androidx.camera.core.impl.b1
    public b1.b d() {
        return this.f14627a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f14627a.equals(b1Var.d()) && this.f14628b.equals(b1Var.c()) && this.f14629c == b1Var.f();
    }

    @Override // androidx.camera.core.impl.b1
    public long f() {
        return this.f14629c;
    }

    public int hashCode() {
        int hashCode = (((this.f14627a.hashCode() ^ 1000003) * 1000003) ^ this.f14628b.hashCode()) * 1000003;
        long j10 = this.f14629c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f14627a + ", configSize=" + this.f14628b + ", streamUseCase=" + this.f14629c + "}";
    }
}
