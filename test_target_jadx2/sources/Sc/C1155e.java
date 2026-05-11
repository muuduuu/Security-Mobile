package Sc;

import Kc.InterfaceC0930b;
import Kc.Z;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* renamed from: Sc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1155e extends I {

    /* renamed from: o, reason: collision with root package name */
    public static final C1155e f9026o = new C1155e();

    /* renamed from: Sc.e$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z f9027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f9027a = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(I.f8994a.j().containsKey(bd.y.d(this.f9027a)));
        }
    }

    private C1155e() {
    }

    public final id.f i(Z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Map j10 = I.f8994a.j();
        String d10 = bd.y.d(functionDescriptor);
        if (d10 == null) {
            return null;
        }
        return (id.f) j10.get(d10);
    }

    public final boolean j(Z functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Hc.g.g0(functionDescriptor) && AbstractC3778c.f(functionDescriptor, false, new a(functionDescriptor), 1, null) != null;
    }

    public final boolean k(Z z10) {
        Intrinsics.checkNotNullParameter(z10, "<this>");
        return Intrinsics.b(z10.getName().c(), "removeAt") && Intrinsics.b(bd.y.d(z10), I.f8994a.h().d());
    }
}
