package Sc;

import ad.C1382i;
import ad.EnumC1381h;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final C1382i f9049a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection f9050b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9051c;

    public r(C1382i nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f9049a = nullabilityQualifier;
        this.f9050b = qualifierApplicabilityTypes;
        this.f9051c = z10;
    }

    public static /* synthetic */ r b(r rVar, C1382i c1382i, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1382i = rVar.f9049a;
        }
        if ((i10 & 2) != 0) {
            collection = rVar.f9050b;
        }
        if ((i10 & 4) != 0) {
            z10 = rVar.f9051c;
        }
        return rVar.a(c1382i, collection, z10);
    }

    public final r a(C1382i nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new r(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f9051c;
    }

    public final C1382i d() {
        return this.f9049a;
    }

    public final Collection e() {
        return this.f9050b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.b(this.f9049a, rVar.f9049a) && Intrinsics.b(this.f9050b, rVar.f9050b) && this.f9051c == rVar.f9051c;
    }

    public int hashCode() {
        return (((this.f9049a.hashCode() * 31) + this.f9050b.hashCode()) * 31) + Boolean.hashCode(this.f9051c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f9049a + ", qualifierApplicabilityTypes=" + this.f9050b + ", definitelyNotNull=" + this.f9051c + ')';
    }

    public /* synthetic */ r(C1382i c1382i, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1382i, collection, (i10 & 4) != 0 ? c1382i.c() == EnumC1381h.NOT_NULL : z10);
    }
}
