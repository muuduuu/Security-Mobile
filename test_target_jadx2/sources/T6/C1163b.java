package T6;

import S6.a;
import V6.AbstractC1286q;

/* renamed from: T6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1163b {

    /* renamed from: a, reason: collision with root package name */
    private final int f9390a;

    /* renamed from: b, reason: collision with root package name */
    private final S6.a f9391b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f9392c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9393d;

    private C1163b(S6.a aVar, a.d dVar, String str) {
        this.f9391b = aVar;
        this.f9392c = dVar;
        this.f9393d = str;
        this.f9390a = AbstractC1286q.b(aVar, dVar, str);
    }

    public static C1163b a(S6.a aVar, a.d dVar, String str) {
        return new C1163b(aVar, dVar, str);
    }

    public final String b() {
        return this.f9391b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1163b)) {
            return false;
        }
        C1163b c1163b = (C1163b) obj;
        return AbstractC1286q.a(this.f9391b, c1163b.f9391b) && AbstractC1286q.a(this.f9392c, c1163b.f9392c) && AbstractC1286q.a(this.f9393d, c1163b.f9393d);
    }

    public final int hashCode() {
        return this.f9390a;
    }
}
