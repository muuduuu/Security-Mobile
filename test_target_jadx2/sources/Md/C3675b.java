package md;

import Kc.G;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: md.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3675b extends AbstractC3680g {

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f37476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3675b(List value, Function1 computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.f37476b = computeType;
    }

    @Override // md.AbstractC3680g
    public AbstractC5197E a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        AbstractC5197E abstractC5197E = (AbstractC5197E) this.f37476b.invoke(module);
        if (!Hc.g.c0(abstractC5197E) && !Hc.g.q0(abstractC5197E)) {
            Hc.g.D0(abstractC5197E);
        }
        return abstractC5197E;
    }
}
