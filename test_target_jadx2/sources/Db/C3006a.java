package db;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3006a {

    /* renamed from: a, reason: collision with root package name */
    private final String f31335a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f31336b;

    public C3006a(String str, Long l10) {
        this.f31335a = str;
        this.f31336b = l10;
    }

    public final String a() {
        return this.f31335a;
    }

    public final Long b() {
        return this.f31336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3006a)) {
            return false;
        }
        C3006a c3006a = (C3006a) obj;
        return Intrinsics.b(this.f31335a, c3006a.f31335a) && Intrinsics.b(this.f31336b, c3006a.f31336b);
    }

    public int hashCode() {
        String str = this.f31335a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f31336b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "AdditionalFileData(fileName=" + this.f31335a + ", fileSize=" + this.f31336b + ")";
    }
}
