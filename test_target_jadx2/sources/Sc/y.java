package Sc;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f9076a;

    public y(EnumMap defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.f9076a = defaultQualifiers;
    }

    public final r a(EnumC1152b enumC1152b) {
        return (r) this.f9076a.get(enumC1152b);
    }

    public final EnumMap b() {
        return this.f9076a;
    }
}
