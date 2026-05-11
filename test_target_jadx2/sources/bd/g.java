package bd;

import Kc.EnumC0934f;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.V;
import Kc.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import wc.InterfaceC5068n;
import yd.AbstractC5197E;
import yd.AbstractC5221x;
import yd.C5196D;
import yd.e0;
import yd.i0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class g {
    public static final String a(InterfaceC0933e klass, B typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String c10 = typeMappingConfiguration.c(klass);
        if (c10 != null) {
            return c10;
        }
        InterfaceC0941m b10 = klass.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        String e10 = id.h.b(klass.getName()).e();
        Intrinsics.checkNotNullExpressionValue(e10, "getIdentifier(...)");
        if (b10 instanceof K) {
            id.c e11 = ((K) b10).e();
            if (e11.d()) {
                return e10;
            }
            StringBuilder sb2 = new StringBuilder();
            String b11 = e11.b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            sb2.append(StringsKt.y(b11, '.', '/', false, 4, null));
            sb2.append('/');
            sb2.append(e10);
            return sb2.toString();
        }
        InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
        if (interfaceC0933e == null) {
            throw new IllegalArgumentException("Unexpected container: " + b10 + " for " + klass);
        }
        String a10 = typeMappingConfiguration.a(interfaceC0933e);
        if (a10 == null) {
            a10 = a(interfaceC0933e, typeMappingConfiguration);
        }
        return a10 + '$' + e10;
    }

    public static /* synthetic */ String b(InterfaceC0933e interfaceC0933e, B b10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b10 = C.f18938a;
        }
        return a(interfaceC0933e, b10);
    }

    public static final boolean c(InterfaceC0929a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC0940l) {
            return true;
        }
        AbstractC5197E g10 = descriptor.g();
        Intrinsics.d(g10);
        if (Hc.g.C0(g10)) {
            AbstractC5197E g11 = descriptor.g();
            Intrinsics.d(g11);
            if (!q0.l(g11) && !(descriptor instanceof V)) {
                return true;
            }
        }
        return false;
    }

    public static final Object d(AbstractC5197E kotlinType, p factory, D mode, B typeMappingConfiguration, m mVar, InterfaceC5068n writeGenericType) {
        Object obj;
        AbstractC5197E abstractC5197E;
        Object d10;
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        AbstractC5197E e10 = typeMappingConfiguration.e(kotlinType);
        if (e10 != null) {
            return d(e10, factory, mode, typeMappingConfiguration, mVar, writeGenericType);
        }
        if (Hc.f.r(kotlinType)) {
            return d(Hc.k.a(kotlinType), factory, mode, typeMappingConfiguration, mVar, writeGenericType);
        }
        kotlin.reflect.jvm.internal.impl.types.checker.o oVar = kotlin.reflect.jvm.internal.impl.types.checker.o.f36699a;
        Object b10 = E.b(oVar, kotlinType, factory, mode);
        if (b10 != null) {
            Object a10 = E.a(factory, b10, mode.d());
            writeGenericType.n(kotlinType, a10, mode);
            return a10;
        }
        e0 W02 = kotlinType.W0();
        if (W02 instanceof C5196D) {
            C5196D c5196d = (C5196D) W02;
            AbstractC5197E i10 = c5196d.i();
            if (i10 == null) {
                i10 = typeMappingConfiguration.b(c5196d.a());
            }
            return d(Bd.a.y(i10), factory, mode, typeMappingConfiguration, mVar, writeGenericType);
        }
        InterfaceC0936h d11 = W02.d();
        if (d11 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.k.m(d11)) {
            Object d12 = factory.d("error/NonExistentClass");
            typeMappingConfiguration.f(kotlinType, (InterfaceC0933e) d11);
            return d12;
        }
        boolean z10 = d11 instanceof InterfaceC0933e;
        if (z10 && Hc.g.c0(kotlinType)) {
            if (kotlinType.U0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            i0 i0Var = (i0) kotlinType.U0().get(0);
            AbstractC5197E type = i0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (i0Var.a() == u0.IN_VARIANCE) {
                d10 = factory.d("java/lang/Object");
            } else {
                u0 a11 = i0Var.a();
                Intrinsics.checkNotNullExpressionValue(a11, "getProjectionKind(...)");
                d10 = d(type, factory, mode.f(a11, true), typeMappingConfiguration, mVar, writeGenericType);
            }
            return factory.c('[' + factory.a(d10));
        }
        if (!z10) {
            if (d11 instanceof f0) {
                AbstractC5197E j10 = Bd.a.j((f0) d11);
                if (kotlinType.X0()) {
                    j10 = Bd.a.w(j10);
                }
                return d(j10, factory, mode, typeMappingConfiguration, null, Gd.e.b());
            }
            if ((d11 instanceof Kc.e0) && mode.b()) {
                return d(((Kc.e0) d11).b0(), factory, mode, typeMappingConfiguration, mVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (kd.h.b(d11) && !mode.c() && (abstractC5197E = (AbstractC5197E) AbstractC5221x.a(oVar, kotlinType)) != null) {
            return d(abstractC5197E, factory, mode.g(), typeMappingConfiguration, mVar, writeGenericType);
        }
        if (mode.e() && Hc.g.l0((InterfaceC0933e) d11)) {
            obj = factory.f();
        } else {
            InterfaceC0933e interfaceC0933e = (InterfaceC0933e) d11;
            InterfaceC0933e a12 = interfaceC0933e.a();
            Intrinsics.checkNotNullExpressionValue(a12, "getOriginal(...)");
            Object d13 = typeMappingConfiguration.d(a12);
            if (d13 == null) {
                if (interfaceC0933e.o() == EnumC0934f.ENUM_ENTRY) {
                    InterfaceC0941m b11 = interfaceC0933e.b();
                    Intrinsics.e(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC0933e = (InterfaceC0933e) b11;
                }
                InterfaceC0933e a13 = interfaceC0933e.a();
                Intrinsics.checkNotNullExpressionValue(a13, "getOriginal(...)");
                obj = factory.d(a(a13, typeMappingConfiguration));
            } else {
                obj = d13;
            }
        }
        writeGenericType.n(kotlinType, obj, mode);
        return obj;
    }

    public static /* synthetic */ Object e(AbstractC5197E abstractC5197E, p pVar, D d10, B b10, m mVar, InterfaceC5068n interfaceC5068n, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            interfaceC5068n = Gd.e.b();
        }
        return d(abstractC5197E, pVar, d10, b10, mVar, interfaceC5068n);
    }
}
