package androidx.camera.core.impl;

import androidx.camera.core.impl.V;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1430d extends V.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f14555a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f14556b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f14557c;

    C1430d(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f14555a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f14556b = cls;
        this.f14557c = obj;
    }

    @Override // androidx.camera.core.impl.V.a
    public String c() {
        return this.f14555a;
    }

    @Override // androidx.camera.core.impl.V.a
    public Object d() {
        return this.f14557c;
    }

    @Override // androidx.camera.core.impl.V.a
    public Class e() {
        return this.f14556b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V.a)) {
            return false;
        }
        V.a aVar = (V.a) obj;
        if (this.f14555a.equals(aVar.c()) && this.f14556b.equals(aVar.e())) {
            Object obj2 = this.f14557c;
            if (obj2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f14555a.hashCode() ^ 1000003) * 1000003) ^ this.f14556b.hashCode()) * 1000003;
        Object obj = this.f14557c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f14555a + ", valueClass=" + this.f14556b + ", token=" + this.f14557c + "}";
    }
}
