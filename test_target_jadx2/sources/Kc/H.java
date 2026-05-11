package Kc;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f5532a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(List underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f5532a = underlyingPropertyNamesToTypes;
        Map r10 = kotlin.collections.G.r(b());
        if (r10.size() != b().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f5533b = r10;
    }

    @Override // Kc.h0
    public boolean a(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f5533b.containsKey(name);
    }

    @Override // Kc.h0
    public List b() {
        return this.f5532a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + b() + ')';
    }
}
