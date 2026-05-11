package Kc;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kc.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0953z extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private final id.f f5605a;

    /* renamed from: b, reason: collision with root package name */
    private final Ad.j f5606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0953z(id.f underlyingPropertyName, Ad.j underlyingType) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f5605a = underlyingPropertyName;
        this.f5606b = underlyingType;
    }

    @Override // Kc.h0
    public boolean a(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.b(this.f5605a, name);
    }

    @Override // Kc.h0
    public List b() {
        return CollectionsKt.e(lc.t.a(this.f5605a, this.f5606b));
    }

    public final id.f d() {
        return this.f5605a;
    }

    public final Ad.j e() {
        return this.f5606b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f5605a + ", underlyingType=" + this.f5606b + ')';
    }
}
