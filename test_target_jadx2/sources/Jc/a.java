package Jc;

import Kc.AbstractC0947t;
import Kc.D;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.a0;
import Mc.G;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import xd.n;

/* loaded from: classes3.dex */
public final class a extends rd.e {

    /* renamed from: e, reason: collision with root package name */
    public static final C0098a f4886e = new C0098a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final id.f f4887f;

    /* renamed from: Jc.a$a, reason: collision with other inner class name */
    public static final class C0098a {
        public /* synthetic */ C0098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final id.f a() {
            return a.f4887f;
        }

        private C0098a() {
        }
    }

    static {
        id.f o10 = id.f.o("clone");
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        f4887f = o10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n storageManager, InterfaceC0933e containingClass) {
        super(storageManager, containingClass);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
    }

    @Override // rd.e
    protected List i() {
        G u12 = G.u1(l(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), f4887f, InterfaceC0930b.a.DECLARATION, a0.f5560a);
        u12.a1(null, l().S0(), CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j(), AbstractC3778c.j(l()).i(), D.OPEN, AbstractC0947t.f5587c);
        return CollectionsKt.e(u12);
    }
}
