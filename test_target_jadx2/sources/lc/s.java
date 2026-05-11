package lc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37139a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37140b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37141c;

    public s(Object obj, Object obj2, Object obj3) {
        this.f37139a = obj;
        this.f37140b = obj2;
        this.f37141c = obj3;
    }

    public final Object a() {
        return this.f37139a;
    }

    public final Object b() {
        return this.f37140b;
    }

    public final Object c() {
        return this.f37141c;
    }

    public final Object d() {
        return this.f37139a;
    }

    public final Object e() {
        return this.f37140b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.b(this.f37139a, sVar.f37139a) && Intrinsics.b(this.f37140b, sVar.f37140b) && Intrinsics.b(this.f37141c, sVar.f37141c);
    }

    public final Object f() {
        return this.f37141c;
    }

    public int hashCode() {
        Object obj = this.f37139a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f37140b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f37141c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f37139a + ", " + this.f37140b + ", " + this.f37141c + ')';
    }
}
