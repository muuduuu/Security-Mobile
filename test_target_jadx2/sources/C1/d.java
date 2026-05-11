package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f758a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f759b;

    public d(String key, Long l10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f758a = key;
        this.f759b = l10;
    }

    public final String a() {
        return this.f758a;
    }

    public final Long b() {
        return this.f759b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f758a, dVar.f758a) && Intrinsics.b(this.f759b, dVar.f759b);
    }

    public int hashCode() {
        int hashCode = this.f758a.hashCode() * 31;
        Long l10 = this.f759b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f758a + ", value=" + this.f759b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
