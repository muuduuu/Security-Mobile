package Ec;

import Ec.AbstractC0829h;
import Ec.AbstractC0830i;
import Ec.y;
import Fc.f;
import Fc.h;
import Kc.AbstractC0947t;
import Kc.InterfaceC0941m;
import Kc.U;
import gd.AbstractC3218a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import wd.C5078j;
import yd.q0;

/* loaded from: classes3.dex */
public abstract class z {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Fc.e b(y.a aVar, boolean z10) {
        AbstractC0829h.e c10;
        Method c11;
        Fc.e aVar2;
        AbstractC3218a.c z11;
        Method F10;
        Method l10;
        if (n.f2062a.a().d(aVar.u().Y())) {
            return Fc.i.f2696a;
        }
        AbstractC0830i f10 = I.f1950a.f(aVar.u().S());
        if (f10 instanceof AbstractC0830i.c) {
            AbstractC0830i.c cVar = (AbstractC0830i.c) f10;
            AbstractC3218a.d f11 = cVar.f();
            if (z10) {
                if (f11.D()) {
                    z11 = f11.y();
                    F10 = z11 == null ? aVar.u().M().F(cVar.d().getString(z11.u()), cVar.d().getString(z11.t())) : null;
                    if (F10 == null) {
                        aVar2 = !Modifier.isStatic(F10.getModifiers()) ? aVar.R() ? new f.h.a(F10, f(aVar)) : new f.h.e(F10) : d(aVar) ? aVar.R() ? new f.h.b(F10) : new f.h.C0060f(F10) : aVar.R() ? new f.h.c(F10, f(aVar)) : new f.h.g(F10);
                    } else if (kd.h.e(aVar.u().S()) && Intrinsics.b(aVar.u().S().h(), AbstractC0947t.f5588d)) {
                        Class r10 = Fc.k.r(aVar.u().S().b());
                        if (r10 == null || (l10 = Fc.k.l(r10, aVar.u().S())) == null) {
                            throw new D("Underlying property of inline class " + aVar.u() + " should have a field");
                        }
                        aVar2 = aVar.R() ? new h.a(l10, f(aVar)) : new h.b(l10);
                    } else {
                        Field X10 = aVar.u().X();
                        if (X10 == null) {
                            throw new D("No accessors or field is found for property " + aVar.u());
                        }
                        aVar2 = c(aVar, z10, X10);
                    }
                }
                z11 = null;
                if (z11 == null) {
                }
                if (F10 == null) {
                }
            } else {
                if (f11.E()) {
                    z11 = f11.z();
                    if (z11 == null) {
                    }
                    if (F10 == null) {
                    }
                }
                z11 = null;
                if (z11 == null) {
                }
                if (F10 == null) {
                }
            }
        } else if (f10 instanceof AbstractC0830i.a) {
            aVar2 = c(aVar, z10, ((AbstractC0830i.a) f10).b());
        } else {
            if (!(f10 instanceof AbstractC0830i.b)) {
                if (!(f10 instanceof AbstractC0830i.d)) {
                    throw new lc.m();
                }
                if (z10) {
                    c10 = ((AbstractC0830i.d) f10).b();
                } else {
                    c10 = ((AbstractC0830i.d) f10).c();
                    if (c10 == null) {
                        throw new D("No setter found for property " + aVar.u());
                    }
                }
                Method F11 = aVar.u().M().F(c10.c(), c10.b());
                if (F11 != null) {
                    Modifier.isStatic(F11.getModifiers());
                    return aVar.R() ? new f.h.a(F11, f(aVar)) : new f.h.e(F11);
                }
                throw new D("No accessor found for property " + aVar.u());
            }
            if (z10) {
                c11 = ((AbstractC0830i.b) f10).b();
            } else {
                AbstractC0830i.b bVar = (AbstractC0830i.b) f10;
                c11 = bVar.c();
                if (c11 == null) {
                    throw new D("No source found for setter of Java method property: " + bVar.b());
                }
            }
            aVar2 = aVar.R() ? new f.h.a(c11, f(aVar)) : new f.h.e(c11);
        }
        return Fc.k.i(aVar2, aVar.S(), false, 2, null);
    }

    private static final Fc.f c(y.a aVar, boolean z10, Field field) {
        Fc.f aVar2;
        if (g(aVar.u().S()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar2 = aVar.R() ? new f.g.a(field, e(aVar), f(aVar)) : new f.g.c(field, e(aVar));
            } else {
                if (!aVar.R()) {
                    return new f.AbstractC0059f.c(field);
                }
                aVar2 = new f.AbstractC0059f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.R() ? new f.AbstractC0059f.b(field) : new f.AbstractC0059f.d(field);
            }
            aVar2 = aVar.R() ? new f.g.b(field, e(aVar)) : new f.g.d(field, e(aVar));
        } else {
            if (z10) {
                return new f.AbstractC0059f.e(field);
            }
            aVar2 = new f.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(y.a aVar) {
        return aVar.u().S().i().A1(L.j());
    }

    private static final boolean e(y.a aVar) {
        return !q0.l(aVar.u().S().getType());
    }

    public static final Object f(y.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.u().T();
    }

    private static final boolean g(U u10) {
        InterfaceC0941m b10 = u10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        if (!kd.f.x(b10)) {
            return false;
        }
        InterfaceC0941m b11 = b10.b();
        return !(kd.f.C(b11) || kd.f.t(b11)) || ((u10 instanceof C5078j) && hd.i.f(((C5078j) u10).K()));
    }
}
