package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1438h extends AbstractC1449m0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14590a;

    C1438h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f14590a = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC1449m0
    public Object b() {
        return this.f14590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1449m0) {
            return this.f14590a.equals(((AbstractC1449m0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14590a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f14590a + "}";
    }
}
