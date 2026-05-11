package Ec;

import Ec.AbstractC0829h;
import Ec.AbstractC0830i;
import Hc.j;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.V;
import Kc.W;
import Kc.a0;
import dd.C3027d;
import dd.C3032i;
import dd.C3037n;
import gd.AbstractC3218a;
import hd.d;
import id.C3367b;
import java.lang.reflect.Method;
import kd.AbstractC3565e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import od.AbstractC3778c;
import wd.C5078j;
import wd.InterfaceC5070b;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f1950a = new I();

    /* renamed from: b, reason: collision with root package name */
    private static final C3367b f1951b;

    static {
        C3367b m10 = C3367b.m(new id.c("java.lang.Void"));
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        f1951b = m10;
    }

    private I() {
    }

    private final Hc.h a(Class cls) {
        if (cls.isPrimitive()) {
            return pd.e.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(InterfaceC0952y interfaceC0952y) {
        if (AbstractC3565e.p(interfaceC0952y) || AbstractC3565e.q(interfaceC0952y)) {
            return true;
        }
        return Intrinsics.b(interfaceC0952y.getName(), Jc.a.f4886e.a()) && interfaceC0952y.m().isEmpty();
    }

    private final AbstractC0829h.e d(InterfaceC0952y interfaceC0952y) {
        return new AbstractC0829h.e(new d.b(e(interfaceC0952y), bd.y.c(interfaceC0952y, false, false, 1, null)));
    }

    private final String e(InterfaceC0930b interfaceC0930b) {
        String b10 = Sc.H.b(interfaceC0930b);
        if (b10 != null) {
            return b10;
        }
        if (interfaceC0930b instanceof V) {
            String c10 = AbstractC3778c.t(interfaceC0930b).getName().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            return Sc.A.b(c10);
        }
        if (interfaceC0930b instanceof W) {
            String c11 = AbstractC3778c.t(interfaceC0930b).getName().c();
            Intrinsics.checkNotNullExpressionValue(c11, "asString(...)");
            return Sc.A.e(c11);
        }
        String c12 = interfaceC0930b.getName().c();
        Intrinsics.checkNotNullExpressionValue(c12, "asString(...)");
        return c12;
    }

    public final C3367b c(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            Hc.h a10 = a(componentType);
            if (a10 != null) {
                return new C3367b(Hc.j.f3891y, a10.getArrayTypeName());
            }
            C3367b m10 = C3367b.m(j.a.f3947i.l());
            Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
            return m10;
        }
        if (Intrinsics.b(klass, Void.TYPE)) {
            return f1951b;
        }
        Hc.h a11 = a(klass);
        if (a11 != null) {
            return new C3367b(Hc.j.f3891y, a11.getTypeName());
        }
        C3367b a12 = Pc.d.a(klass);
        if (!a12.k()) {
            Jc.c cVar = Jc.c.f4890a;
            id.c b10 = a12.b();
            Intrinsics.checkNotNullExpressionValue(b10, "asSingleFqName(...)");
            C3367b m11 = cVar.m(b10);
            if (m11 != null) {
                return m11;
            }
        }
        return a12;
    }

    public final AbstractC0830i f(U possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        U a10 = ((U) kd.f.L(possiblyOverriddenProperty)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "getOriginal(...)");
        if (a10 instanceof C5078j) {
            C5078j c5078j = (C5078j) a10;
            C3037n K10 = c5078j.K();
            i.f propertySignature = AbstractC3218a.f33677d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            AbstractC3218a.d dVar = (AbstractC3218a.d) fd.e.a(K10, propertySignature);
            if (dVar != null) {
                return new AbstractC0830i.c(a10, K10, dVar, c5078j.e0(), c5078j.Y());
            }
        } else if (a10 instanceof Uc.f) {
            a0 j10 = ((Uc.f) a10).j();
            Yc.a aVar = j10 instanceof Yc.a ? (Yc.a) j10 : null;
            Zc.l b10 = aVar != null ? aVar.b() : null;
            if (b10 instanceof Pc.r) {
                return new AbstractC0830i.a(((Pc.r) b10).Y());
            }
            if (b10 instanceof Pc.u) {
                Method Y10 = ((Pc.u) b10).Y();
                W l10 = a10.l();
                a0 j11 = l10 != null ? l10.j() : null;
                Yc.a aVar2 = j11 instanceof Yc.a ? (Yc.a) j11 : null;
                Zc.l b11 = aVar2 != null ? aVar2.b() : null;
                Pc.u uVar = b11 instanceof Pc.u ? (Pc.u) b11 : null;
                return new AbstractC0830i.b(Y10, uVar != null ? uVar.Y() : null);
            }
            throw new D("Incorrect resolution sequence for Java field " + a10 + " (source = " + b10 + ')');
        }
        V d10 = a10.d();
        Intrinsics.d(d10);
        AbstractC0829h.e d11 = d(d10);
        W l11 = a10.l();
        return new AbstractC0830i.d(d11, l11 != null ? d(l11) : null);
    }

    public final AbstractC0829h g(InterfaceC0952y possiblySubstitutedFunction) {
        Method Y10;
        d.b b10;
        d.b e10;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC0952y a10 = ((InterfaceC0952y) kd.f.L(possiblySubstitutedFunction)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "getOriginal(...)");
        if (!(a10 instanceof InterfaceC5070b)) {
            if (a10 instanceof Uc.e) {
                a0 j10 = ((Uc.e) a10).j();
                Yc.a aVar = j10 instanceof Yc.a ? (Yc.a) j10 : null;
                Zc.l b11 = aVar != null ? aVar.b() : null;
                Pc.u uVar = b11 instanceof Pc.u ? (Pc.u) b11 : null;
                if (uVar != null && (Y10 = uVar.Y()) != null) {
                    return new AbstractC0829h.c(Y10);
                }
                throw new D("Incorrect resolution sequence for Java method " + a10);
            }
            if (!(a10 instanceof Uc.b)) {
                if (b(a10)) {
                    return d(a10);
                }
                throw new D("Unknown origin of " + a10 + " (" + a10.getClass() + ')');
            }
            a0 j11 = ((Uc.b) a10).j();
            Yc.a aVar2 = j11 instanceof Yc.a ? (Yc.a) j11 : null;
            Zc.l b12 = aVar2 != null ? aVar2.b() : null;
            if (b12 instanceof Pc.o) {
                return new AbstractC0829h.b(((Pc.o) b12).Y());
            }
            if (b12 instanceof Pc.l) {
                Pc.l lVar = (Pc.l) b12;
                if (lVar.x()) {
                    return new AbstractC0829h.a(lVar.C());
                }
            }
            throw new D("Incorrect resolution sequence for Java constructor " + a10 + " (" + b12 + ')');
        }
        InterfaceC5070b interfaceC5070b = (InterfaceC5070b) a10;
        kotlin.reflect.jvm.internal.impl.protobuf.p K10 = interfaceC5070b.K();
        if ((K10 instanceof C3032i) && (e10 = hd.i.f34080a.e((C3032i) K10, interfaceC5070b.e0(), interfaceC5070b.Y())) != null) {
            return new AbstractC0829h.e(e10);
        }
        if (!(K10 instanceof C3027d) || (b10 = hd.i.f34080a.b((C3027d) K10, interfaceC5070b.e0(), interfaceC5070b.Y())) == null) {
            return d(a10);
        }
        InterfaceC0941m b13 = possiblySubstitutedFunction.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getContainingDeclaration(...)");
        if (kd.h.b(b13)) {
            return new AbstractC0829h.e(b10);
        }
        InterfaceC0941m b14 = possiblySubstitutedFunction.b();
        Intrinsics.checkNotNullExpressionValue(b14, "getContainingDeclaration(...)");
        if (!kd.h.d(b14)) {
            return new AbstractC0829h.d(b10);
        }
        InterfaceC0940l interfaceC0940l = (InterfaceC0940l) possiblySubstitutedFunction;
        if (interfaceC0940l.H()) {
            if (!Intrinsics.b(b10.c(), "constructor-impl") || !StringsKt.q(b10.b(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + b10).toString());
            }
        } else {
            if (!Intrinsics.b(b10.c(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + b10).toString());
            }
            InterfaceC0933e I10 = interfaceC0940l.I();
            Intrinsics.checkNotNullExpressionValue(I10, "getConstructedClass(...)");
            String t10 = Fc.k.t(I10);
            if (StringsKt.q(b10.b(), ")V", false, 2, null)) {
                b10 = d.b.e(b10, null, StringsKt.p0(b10.b(), "V") + t10, 1, null);
            } else if (!StringsKt.q(b10.b(), t10, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + b10).toString());
            }
        }
        return new AbstractC0829h.e(b10);
    }
}
