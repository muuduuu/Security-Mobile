package ad;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ad.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1386k {

    /* renamed from: a, reason: collision with root package name */
    private final C1392q f12715a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12716b;

    public C1386k(C1392q c1392q, List parametersInfo) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f12715a = c1392q;
        this.f12716b = parametersInfo;
    }

    public final List a() {
        return this.f12716b;
    }

    public final C1392q b() {
        return this.f12715a;
    }
}
