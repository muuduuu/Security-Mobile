package androidx.camera.core.impl;

import androidx.camera.core.impl.Y0;

/* renamed from: androidx.camera.core.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1442j extends Y0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f14605a;

    C1442j(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f14605a = th;
    }

    @Override // androidx.camera.core.impl.Y0.a
    public Throwable a() {
        return this.f14605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y0.a) {
            return this.f14605a.equals(((Y0.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f14605a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f14605a + "}";
    }
}
