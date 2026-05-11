package Cd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1087a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1088b;

    public a(Object obj, Object obj2) {
        this.f1087a = obj;
        this.f1088b = obj2;
    }

    public final Object a() {
        return this.f1087a;
    }

    public final Object b() {
        return this.f1088b;
    }

    public final Object c() {
        return this.f1087a;
    }

    public final Object d() {
        return this.f1088b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f1087a, aVar.f1087a) && Intrinsics.b(this.f1088b, aVar.f1088b);
    }

    public int hashCode() {
        Object obj = this.f1087a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1088b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f1087a + ", upper=" + this.f1088b + ')';
    }
}
