package yd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5223z extends AbstractC5222y implements InterfaceC5211m {

    /* renamed from: e, reason: collision with root package name */
    public static final a f45573e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static boolean f45574f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45575d;

    /* renamed from: yd.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5223z(M lowerBound, M upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    private final void i1() {
        if (!f45574f || this.f45575d) {
            return;
        }
        this.f45575d = true;
        AbstractC5194B.b(e1());
        AbstractC5194B.b(f1());
        Intrinsics.b(e1(), f1());
        kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a.c(e1(), f1());
    }

    @Override // yd.InterfaceC5211m
    public AbstractC5197E D(AbstractC5197E replacement) {
        t0 d10;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        t0 Z02 = replacement.Z0();
        if (Z02 instanceof AbstractC5222y) {
            d10 = Z02;
        } else {
            if (!(Z02 instanceof M)) {
                throw new lc.m();
            }
            M m10 = (M) Z02;
            d10 = C5198F.d(m10, m10.a1(true));
        }
        return s0.b(d10, Z02);
    }

    @Override // yd.InterfaceC5211m
    public boolean I0() {
        return (e1().W0().d() instanceof Kc.f0) && Intrinsics.b(e1().W0(), f1().W0());
    }

    @Override // yd.t0
    public t0 a1(boolean z10) {
        return C5198F.d(e1().a1(z10), f1().a1(z10));
    }

    @Override // yd.t0
    public t0 c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return C5198F.d(e1().c1(newAttributes), f1().c1(newAttributes));
    }

    @Override // yd.AbstractC5222y
    public M d1() {
        i1();
        return e1();
    }

    @Override // yd.AbstractC5222y
    public String g1(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.n()) {
            return renderer.t(renderer.w(e1()), renderer.w(f1()), Bd.a.i(this));
        }
        return '(' + renderer.w(e1()) + ".." + renderer.w(f1()) + ')';
    }

    @Override // yd.t0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC5222y g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(e1());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5197E a11 = kotlinTypeRefiner.a(f1());
        Intrinsics.e(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5223z((M) a10, (M) a11);
    }

    @Override // yd.AbstractC5222y
    public String toString() {
        return '(' + e1() + ".." + f1() + ')';
    }
}
