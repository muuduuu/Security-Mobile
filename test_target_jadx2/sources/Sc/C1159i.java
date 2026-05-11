package Sc;

import Kc.InterfaceC0930b;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* renamed from: Sc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1159i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1159i f9037a = new C1159i();

    /* renamed from: Sc.i$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9038a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C1159i.f9037a.b(it));
        }
    }

    private C1159i() {
    }

    private final boolean c(InterfaceC0930b interfaceC0930b) {
        if (CollectionsKt.V(C1157g.f9031a.c(), AbstractC3778c.h(interfaceC0930b)) && interfaceC0930b.m().isEmpty()) {
            return true;
        }
        if (!Hc.g.g0(interfaceC0930b)) {
            return false;
        }
        Collection f10 = interfaceC0930b.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
        Collection<InterfaceC0930b> collection = f10;
        if (!collection.isEmpty()) {
            for (InterfaceC0930b interfaceC0930b2 : collection) {
                C1159i c1159i = f9037a;
                Intrinsics.d(interfaceC0930b2);
                if (c1159i.b(interfaceC0930b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(InterfaceC0930b interfaceC0930b) {
        id.f fVar;
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        Hc.g.g0(interfaceC0930b);
        InterfaceC0930b f10 = AbstractC3778c.f(AbstractC3778c.t(interfaceC0930b), false, a.f9038a, 1, null);
        if (f10 == null || (fVar = (id.f) C1157g.f9031a.a().get(AbstractC3778c.l(f10))) == null) {
            return null;
        }
        return fVar.c();
    }

    public final boolean b(InterfaceC0930b callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (C1157g.f9031a.d().contains(callableMemberDescriptor.getName())) {
            return c(callableMemberDescriptor);
        }
        return false;
    }
}
