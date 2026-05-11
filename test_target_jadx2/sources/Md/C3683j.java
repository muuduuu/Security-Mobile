package md;

import Kc.AbstractC0951x;
import Kc.G;
import Kc.InterfaceC0933e;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;

/* renamed from: md.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3683j extends AbstractC3680g {

    /* renamed from: b, reason: collision with root package name */
    private final C3367b f37482b;

    /* renamed from: c, reason: collision with root package name */
    private final id.f f37483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3683j(C3367b enumClassId, id.f enumEntryName) {
        super(lc.t.a(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f37482b = enumClassId;
        this.f37483c = enumEntryName;
    }

    @Override // md.AbstractC3680g
    public AbstractC5197E a(G module) {
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC0933e a10 = AbstractC0951x.a(module, this.f37482b);
        M m10 = null;
        if (a10 != null) {
            if (!kd.f.A(a10)) {
                a10 = null;
            }
            if (a10 != null) {
                m10 = a10.y();
            }
        }
        if (m10 != null) {
            return m10;
        }
        kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_ENUM_TYPE;
        String c3367b = this.f37482b.toString();
        Intrinsics.checkNotNullExpressionValue(c3367b, "toString(...)");
        String fVar = this.f37483c.toString();
        Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, c3367b, fVar);
    }

    public final id.f c() {
        return this.f37483c;
    }

    @Override // md.AbstractC3680g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37482b.j());
        sb2.append('.');
        sb2.append(this.f37483c);
        return sb2.toString();
    }
}
