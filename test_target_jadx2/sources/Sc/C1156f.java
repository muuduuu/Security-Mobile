package Sc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0952y;
import Sc.I;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* renamed from: Sc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1156f extends I {

    /* renamed from: o, reason: collision with root package name */
    public static final C1156f f9028o = new C1156f();

    /* renamed from: Sc.f$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9029a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C1156f.f9028o.j(it));
        }
    }

    /* renamed from: Sc.f$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9030a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf((it instanceof InterfaceC0952y) && C1156f.f9028o.j(it));
        }
    }

    private C1156f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(InterfaceC0930b interfaceC0930b) {
        return CollectionsKt.V(I.f8994a.e(), bd.y.d(interfaceC0930b));
    }

    public static final InterfaceC0952y k(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        C1156f c1156f = f9028o;
        id.f name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (c1156f.l(name)) {
            return (InterfaceC0952y) AbstractC3778c.f(functionDescriptor, false, a.f9029a, 1, null);
        }
        return null;
    }

    public static final I.b m(InterfaceC0930b interfaceC0930b) {
        InterfaceC0930b f10;
        String d10;
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        I.a aVar = I.f8994a;
        if (!aVar.d().contains(interfaceC0930b.getName()) || (f10 = AbstractC3778c.f(interfaceC0930b, false, b.f9030a, 1, null)) == null || (d10 = bd.y.d(f10)) == null) {
            return null;
        }
        return aVar.l(d10);
    }

    public final boolean l(id.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return I.f8994a.d().contains(fVar);
    }
}
