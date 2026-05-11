package yd;

import Kc.InterfaceC0936h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5213o extends AbstractC5215q implements InterfaceC5211m, Ad.e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f45555d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final M f45556b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45557c;

    /* renamed from: yd.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(t0 t0Var) {
            t0Var.W0();
            return (t0Var.W0().d() instanceof Kc.f0) || (t0Var instanceof kotlin.reflect.jvm.internal.impl.types.checker.i);
        }

        public static /* synthetic */ C5213o c(a aVar, t0 t0Var, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(t0Var, z10, z11);
        }

        private final boolean d(t0 t0Var, boolean z10) {
            if (!a(t0Var)) {
                return false;
            }
            InterfaceC0936h d10 = t0Var.W0().d();
            Mc.K k10 = d10 instanceof Mc.K ? (Mc.K) d10 : null;
            if (k10 == null || k10.c1()) {
                return (z10 && (t0Var.W0().d() instanceof Kc.f0)) ? q0.l(t0Var) : !kotlin.reflect.jvm.internal.impl.types.checker.n.f36698a.a(t0Var);
            }
            return true;
        }

        public final C5213o b(t0 type, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof C5213o) {
                return (C5213o) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof AbstractC5222y) {
                AbstractC5222y abstractC5222y = (AbstractC5222y) type;
                Intrinsics.b(abstractC5222y.e1().W0(), abstractC5222y.f1().W0());
            }
            return new C5213o(AbstractC5194B.c(type).a1(false), z10, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ C5213o(M m10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m10, z10);
    }

    @Override // yd.InterfaceC5211m
    public AbstractC5197E D(AbstractC5197E replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return Q.e(replacement.Z0(), this.f45557c);
    }

    @Override // yd.InterfaceC5211m
    public boolean I0() {
        f1().W0();
        return f1().W0().d() instanceof Kc.f0;
    }

    @Override // yd.AbstractC5215q, yd.AbstractC5197E
    public boolean X0() {
        return false;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        return z10 ? f1().a1(z10) : this;
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C5213o(f1().c1(newAttributes), this.f45557c);
    }

    @Override // yd.AbstractC5215q
    protected M f1() {
        return this.f45556b;
    }

    public final M i1() {
        return this.f45556b;
    }

    @Override // yd.AbstractC5215q
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C5213o h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C5213o(delegate, this.f45557c);
    }

    @Override // yd.M
    public String toString() {
        return f1() + " & Any";
    }

    private C5213o(M m10, boolean z10) {
        this.f45556b = m10;
        this.f45557c = z10;
    }
}
