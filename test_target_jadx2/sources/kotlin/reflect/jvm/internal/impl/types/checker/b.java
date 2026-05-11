package kotlin.reflect.jvm.internal.impl.types.checker;

import Hc.j;
import Kc.C0953z;
import Kc.E;
import Kc.EnumC0934f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.f0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ld.C3626a;
import md.C3687n;
import od.AbstractC3778c;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.AbstractC5222y;
import yd.C5196D;
import yd.C5198F;
import yd.C5213o;
import yd.G;
import yd.J;
import yd.L;
import yd.M;
import yd.P;
import yd.d0;
import yd.e0;
import yd.i0;
import yd.n0;
import yd.o0;
import yd.q0;
import yd.t0;
import yd.u0;

/* loaded from: classes3.dex */
public interface b extends o0, Ad.q {

    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        public static final class C0539a extends d0.c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f36670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f36671b;

            C0539a(b bVar, n0 n0Var) {
                this.f36670a = bVar;
                this.f36671b = n0Var;
            }

            @Override // yd.d0.c
            public Ad.j a(d0 state, Ad.i type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                b bVar = this.f36670a;
                n0 n0Var = this.f36671b;
                Ad.i V10 = bVar.V(type);
                Intrinsics.e(V10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                AbstractC5197E n10 = n0Var.n((AbstractC5197E) V10, u0.INVARIANT);
                Intrinsics.checkNotNullExpressionValue(n10, "safeSubstitute(...)");
                Ad.j b10 = bVar.b(n10);
                Intrinsics.d(b10);
                return b10;
            }
        }

        public static boolean A(b bVar, Ad.i receiver, id.c fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof AbstractC5197E) {
                return ((AbstractC5197E) receiver).i().A1(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean B(b bVar, Ad.n receiver, Ad.m mVar) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
            }
            if (mVar == null ? true : mVar instanceof e0) {
                return Bd.a.m((f0) receiver, (e0) mVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean C(b bVar, Ad.j a10, Ad.j b10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            if (!(a10 instanceof M)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + C5142C.b(a10.getClass())).toString());
            }
            if (b10 instanceof M) {
                return ((M) a10).U0() == ((M) b10).U0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + C5142C.b(b10.getClass())).toString());
        }

        public static Ad.i D(b bVar, List types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return d.a(types);
        }

        public static boolean E(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return Hc.g.w0((e0) receiver, j.a.f3933b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean F(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).d() instanceof InterfaceC0933e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean G(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
                return (interfaceC0933e == null || !E.a(interfaceC0933e) || interfaceC0933e.o() == EnumC0934f.ENUM_ENTRY || interfaceC0933e.o() == EnumC0934f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean H(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean I(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return G.a((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean J(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
                return (interfaceC0933e != null ? interfaceC0933e.H0() : null) instanceof C0953z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean K(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return receiver instanceof C3687n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean L(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return receiver instanceof C5196D;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean M(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return ((M) receiver).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean N(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof J;
        }

        public static boolean O(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return Hc.g.w0((e0) receiver, j.a.f3935c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean P(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return q0.l((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean Q(b bVar, Ad.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof C3626a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean R(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return Hc.g.s0((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean S(b bVar, Ad.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).i1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean T(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return receiver instanceof L;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean U(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof M)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
            }
            if (!G.a((AbstractC5197E) receiver)) {
                M m10 = (M) receiver;
                if (!(m10.W0().d() instanceof Kc.e0) && (m10.W0().d() != null || (receiver instanceof C3626a) || (receiver instanceof i) || (receiver instanceof C5213o) || (m10.W0() instanceof C3687n) || V(bVar, receiver))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean V(b bVar, Ad.j jVar) {
            return (jVar instanceof P) && bVar.d(((P) jVar).N0());
        }

        public static boolean W(b bVar, Ad.l receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean X(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return Bd.a.p((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return Bd.a.q((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static boolean Z(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof t0)) {
                return false;
            }
            ((t0) receiver).W0();
            return false;
        }

        public static boolean a(b bVar, Ad.m c12, Ad.m c22) {
            Intrinsics.checkNotNullParameter(c12, "c1");
            Intrinsics.checkNotNullParameter(c22, "c2");
            if (!(c12 instanceof e0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + C5142C.b(c12.getClass())).toString());
            }
            if (c22 instanceof e0) {
                return Intrinsics.b(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + C5142C.b(c22.getClass())).toString());
        }

        public static boolean a0(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                return d10 != null && Hc.g.B0(d10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static int b(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return ((AbstractC5197E) receiver).U0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j b0(b bVar, Ad.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5222y) {
                return ((AbstractC5222y) receiver).e1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.k c(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return (Ad.k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i c0(b bVar, Ad.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).h1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.d d(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                if (receiver instanceof P) {
                    return bVar.a(((P) receiver).N0());
                }
                if (receiver instanceof i) {
                    return (i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i d0(b bVar, Ad.i receiver) {
            t0 b10;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof t0) {
                b10 = c.b((t0) receiver);
                return b10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.e e(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                if (receiver instanceof C5213o) {
                    return (C5213o) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static d0 e0(b bVar, boolean z10, boolean z11) {
            return kotlin.reflect.jvm.internal.impl.types.checker.a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static Ad.f f(b bVar, Ad.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5222y) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j f0(b bVar, Ad.e receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof C5213o) {
                return ((C5213o) receiver).i1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.g g(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                t0 Z02 = ((AbstractC5197E) receiver).Z0();
                if (Z02 instanceof AbstractC5222y) {
                    return (AbstractC5222y) Z02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static int g0(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).c().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j h(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                t0 Z02 = ((AbstractC5197E) receiver).Z0();
                if (Z02 instanceof M) {
                    return (M) Z02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Collection h0(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Ad.m e10 = bVar.e(receiver);
            if (e10 instanceof C3687n) {
                return ((C3687n) e10).k();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.l i(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return Bd.a.a((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.l i0(b bVar, Ad.c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j j(b bVar, Ad.j type, Ad.b status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof M) {
                return k.b((M) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C5142C.b(type.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d0.c j0(b bVar, Ad.j type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof M) {
                return new C0539a(bVar, yd.f0.f45524c.a((AbstractC5197E) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C5142C.b(type.getClass())).toString());
        }

        public static Ad.b k(b bVar, Ad.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Collection k0(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                Collection a10 = ((e0) receiver).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
                return a10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i l(b bVar, Ad.j lowerBound, Ad.j upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof M)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C5142C.b(bVar.getClass())).toString());
            }
            if (upperBound instanceof M) {
                return C5198F.d((M) lowerBound, (M) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C5142C.b(bVar.getClass())).toString());
        }

        public static Ad.c l0(b bVar, Ad.d receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.l m(b bVar, Ad.i receiver, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return (Ad.l) ((AbstractC5197E) receiver).U0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.m m0(b bVar, Ad.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return ((M) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static List n(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return ((AbstractC5197E) receiver).U0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j n0(b bVar, Ad.g receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5222y) {
                return ((AbstractC5222y) receiver).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static id.d o(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC3778c.m((InterfaceC0933e) d10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i o0(b bVar, Ad.i receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof Ad.j) {
                return bVar.c((Ad.j) receiver, z10);
            }
            if (!(receiver instanceof Ad.g)) {
                throw new IllegalStateException("sealed");
            }
            Ad.g gVar = (Ad.g) receiver;
            return bVar.t(bVar.c(bVar.g(gVar), z10), bVar.c(bVar.f(gVar), z10));
        }

        public static Ad.n p(b bVar, Ad.m receiver, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                Object obj = ((e0) receiver).c().get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (Ad.n) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.j p0(b bVar, Ad.j receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof M) {
                return ((M) receiver).a1(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static List q(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                List c10 = ((e0) receiver).c();
                Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
                return c10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Hc.h r(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Hc.g.P((InterfaceC0933e) d10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Hc.h s(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Hc.g.S((InterfaceC0933e) d10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i t(b bVar, Ad.n receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof f0) {
                return Bd.a.j((f0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i u(b bVar, Ad.l receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).getType().Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.n v(b bVar, Ad.m receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC0936h d10 = ((e0) receiver).d();
                if (d10 instanceof f0) {
                    return (f0) d10;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.i w(b bVar, Ad.i receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof AbstractC5197E) {
                return kd.h.k((AbstractC5197E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static List x(b bVar, Ad.n receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof f0) {
                List upperBounds = ((f0) receiver).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.s y(b bVar, Ad.l receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof i0) {
                u0 a10 = ((i0) receiver).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getProjectionKind(...)");
                return Ad.p.a(a10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }

        public static Ad.s z(b bVar, Ad.n receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof f0) {
                u0 u10 = ((f0) receiver).u();
                Intrinsics.checkNotNullExpressionValue(u10, "getVariance(...)");
                return Ad.p.a(u10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C5142C.b(receiver.getClass())).toString());
        }
    }

    @Override // Ad.o
    Ad.d a(Ad.j jVar);

    @Override // Ad.o
    Ad.j b(Ad.i iVar);

    @Override // Ad.o
    Ad.j c(Ad.j jVar, boolean z10);

    @Override // Ad.o
    boolean d(Ad.j jVar);

    @Override // Ad.o
    Ad.m e(Ad.j jVar);

    @Override // Ad.o
    Ad.j f(Ad.g gVar);

    @Override // Ad.o
    Ad.j g(Ad.g gVar);

    Ad.i t(Ad.j jVar, Ad.j jVar2);
}
