package Sc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.T;
import Kc.U;
import Kc.Z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.M;

/* loaded from: classes3.dex */
public abstract class H {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8991a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C1159i.f9037a.b(AbstractC3778c.t(it)));
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8992a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C1155e.f9026o.j((Z) it));
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8993a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Hc.g.g0(it) && C1156f.m(it) != null);
        }
    }

    public static final boolean a(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        return d(interfaceC0930b) != null;
    }

    public static final String b(InterfaceC0930b callableMemberDescriptor) {
        InterfaceC0930b t10;
        id.f i10;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC0930b c10 = c(callableMemberDescriptor);
        if (c10 == null || (t10 = AbstractC3778c.t(c10)) == null) {
            return null;
        }
        if (t10 instanceof U) {
            return C1159i.f9037a.a(t10);
        }
        if (!(t10 instanceof Z) || (i10 = C1155e.f9026o.i((Z) t10)) == null) {
            return null;
        }
        return i10.c();
    }

    private static final InterfaceC0930b c(InterfaceC0930b interfaceC0930b) {
        if (Hc.g.g0(interfaceC0930b)) {
            return d(interfaceC0930b);
        }
        return null;
    }

    public static final InterfaceC0930b d(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        if (!I.f8994a.g().contains(interfaceC0930b.getName()) && !C1157g.f9031a.d().contains(AbstractC3778c.t(interfaceC0930b).getName())) {
            return null;
        }
        if (interfaceC0930b instanceof U ? true : interfaceC0930b instanceof T) {
            return AbstractC3778c.f(interfaceC0930b, false, a.f8991a, 1, null);
        }
        if (interfaceC0930b instanceof Z) {
            return AbstractC3778c.f(interfaceC0930b, false, b.f8992a, 1, null);
        }
        return null;
    }

    public static final InterfaceC0930b e(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        InterfaceC0930b d10 = d(interfaceC0930b);
        if (d10 != null) {
            return d10;
        }
        C1156f c1156f = C1156f.f9028o;
        id.f name = interfaceC0930b.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (c1156f.l(name)) {
            return AbstractC3778c.f(interfaceC0930b, false, c.f8993a, 1, null);
        }
        return null;
    }

    public static final boolean f(InterfaceC0933e interfaceC0933e, InterfaceC0929a specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC0941m b10 = specialCallableDescriptor.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        M y10 = ((InterfaceC0933e) b10).y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        for (InterfaceC0933e s10 = kd.f.s(interfaceC0933e); s10 != null; s10 = kd.f.s(s10)) {
            if (!(s10 instanceof Uc.c) && kotlin.reflect.jvm.internal.impl.types.checker.s.b(s10.y(), y10) != null) {
                return !Hc.g.g0(s10);
            }
        }
        return false;
    }

    public static final boolean g(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        return AbstractC3778c.t(interfaceC0930b).b() instanceof Uc.c;
    }

    public static final boolean h(InterfaceC0930b interfaceC0930b) {
        Intrinsics.checkNotNullParameter(interfaceC0930b, "<this>");
        return g(interfaceC0930b) || Hc.g.g0(interfaceC0930b);
    }
}
