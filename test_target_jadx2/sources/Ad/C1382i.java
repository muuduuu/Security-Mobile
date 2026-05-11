package ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ad.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1382i {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1381h f12675a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12676b;

    public C1382i(EnumC1381h qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f12675a = qualifier;
        this.f12676b = z10;
    }

    public static /* synthetic */ C1382i b(C1382i c1382i, EnumC1381h enumC1381h, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC1381h = c1382i.f12675a;
        }
        if ((i10 & 2) != 0) {
            z10 = c1382i.f12676b;
        }
        return c1382i.a(enumC1381h, z10);
    }

    public final C1382i a(EnumC1381h qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new C1382i(qualifier, z10);
    }

    public final EnumC1381h c() {
        return this.f12675a;
    }

    public final boolean d() {
        return this.f12676b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1382i)) {
            return false;
        }
        C1382i c1382i = (C1382i) obj;
        return this.f12675a == c1382i.f12675a && this.f12676b == c1382i.f12676b;
    }

    public int hashCode() {
        return (this.f12675a.hashCode() * 31) + Boolean.hashCode(this.f12676b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f12675a + ", isForWarningOnly=" + this.f12676b + ')';
    }

    public /* synthetic */ C1382i(EnumC1381h enumC1381h, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC1381h, (i10 & 2) != 0 ? false : z10);
    }
}
