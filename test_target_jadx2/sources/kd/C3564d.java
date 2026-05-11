package kd;

import Kc.C;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.a0;
import Kc.f0;
import java.util.Collection;
import kd.l;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import yd.e0;

/* renamed from: kd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3564d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3564d f36286a = new C3564d();

    /* renamed from: kd.d$a */
    static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36287a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: kd.d$b */
    static final class b extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0929a f36288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0929a f36289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
            super(2);
            this.f36288a = interfaceC0929a;
            this.f36289b = interfaceC0929a2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
            return Boolean.valueOf(Intrinsics.b(interfaceC0941m, this.f36288a) && Intrinsics.b(interfaceC0941m2, this.f36289b));
        }
    }

    /* renamed from: kd.d$c */
    static final class c extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36290a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2) {
            return Boolean.FALSE;
        }
    }

    private C3564d() {
    }

    public static /* synthetic */ boolean c(C3564d c3564d, InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, boolean z10, boolean z11, boolean z12, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return c3564d.b(interfaceC0929a, interfaceC0929a2, z10, z13, z12, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z10, InterfaceC0929a a10, InterfaceC0929a b10, e0 c12, e0 c22) {
        Intrinsics.checkNotNullParameter(a10, "$a");
        Intrinsics.checkNotNullParameter(b10, "$b");
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (Intrinsics.b(c12, c22)) {
            return true;
        }
        InterfaceC0936h d10 = c12.d();
        InterfaceC0936h d11 = c22.d();
        if ((d10 instanceof f0) && (d11 instanceof f0)) {
            return f36286a.i((f0) d10, (f0) d11, z10, new b(a10, b10));
        }
        return false;
    }

    private final boolean e(InterfaceC0933e interfaceC0933e, InterfaceC0933e interfaceC0933e2) {
        return Intrinsics.b(interfaceC0933e.r(), interfaceC0933e2.r());
    }

    public static /* synthetic */ boolean g(C3564d c3564d, InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return c3564d.f(interfaceC0941m, interfaceC0941m2, z10, z11);
    }

    public static /* synthetic */ boolean j(C3564d c3564d, f0 f0Var, f0 f0Var2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = c.f36290a;
        }
        return c3564d.i(f0Var, f0Var2, z10, function2);
    }

    private final boolean k(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2, Function2 function2, boolean z10) {
        InterfaceC0941m b10 = interfaceC0941m.b();
        InterfaceC0941m b11 = interfaceC0941m2.b();
        return ((b10 instanceof InterfaceC0930b) || (b11 instanceof InterfaceC0930b)) ? ((Boolean) function2.invoke(b10, b11)).booleanValue() : g(this, b10, b11, z10, false, 8, null);
    }

    private final a0 l(InterfaceC0929a interfaceC0929a) {
        while (interfaceC0929a instanceof InterfaceC0930b) {
            InterfaceC0930b interfaceC0930b = (InterfaceC0930b) interfaceC0929a;
            if (interfaceC0930b.o() != InterfaceC0930b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection f10 = interfaceC0930b.f();
            Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
            interfaceC0929a = (InterfaceC0930b) CollectionsKt.B0(f10);
            if (interfaceC0929a == null) {
                return null;
            }
        }
        return interfaceC0929a.j();
    }

    public final boolean b(InterfaceC0929a a10, InterfaceC0929a b10, boolean z10, boolean z11, boolean z12, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.b(a10, b10)) {
            return true;
        }
        if (!Intrinsics.b(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof C) && (b10 instanceof C) && ((C) a10).R() != ((C) b10).R()) {
            return false;
        }
        if ((Intrinsics.b(a10.b(), b10.b()) && (!z10 || !Intrinsics.b(l(a10), l(b10)))) || f.E(a10) || f.E(b10) || !k(a10, b10, a.f36287a, z10)) {
            return false;
        }
        l i10 = l.i(kotlinTypeRefiner, new C3563c(z10, a10, b10));
        Intrinsics.checkNotNullExpressionValue(i10, "create(...)");
        l.i.a c10 = i10.E(a10, b10, null, !z12).c();
        l.i.a aVar = l.i.a.OVERRIDABLE;
        return c10 == aVar && i10.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean f(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2, boolean z10, boolean z11) {
        return ((interfaceC0941m instanceof InterfaceC0933e) && (interfaceC0941m2 instanceof InterfaceC0933e)) ? e((InterfaceC0933e) interfaceC0941m, (InterfaceC0933e) interfaceC0941m2) : ((interfaceC0941m instanceof f0) && (interfaceC0941m2 instanceof f0)) ? j(this, (f0) interfaceC0941m, (f0) interfaceC0941m2, z10, null, 8, null) : ((interfaceC0941m instanceof InterfaceC0929a) && (interfaceC0941m2 instanceof InterfaceC0929a)) ? c(this, (InterfaceC0929a) interfaceC0941m, (InterfaceC0929a) interfaceC0941m2, z10, z11, false, g.a.f36674a, 16, null) : ((interfaceC0941m instanceof K) && (interfaceC0941m2 instanceof K)) ? Intrinsics.b(((K) interfaceC0941m).e(), ((K) interfaceC0941m2).e()) : Intrinsics.b(interfaceC0941m, interfaceC0941m2);
    }

    public final boolean h(f0 a10, f0 b10, boolean z10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return j(this, a10, b10, z10, null, 8, null);
    }

    public final boolean i(f0 a10, f0 b10, boolean z10, Function2 equivalentCallables) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.b(a10, b10)) {
            return true;
        }
        return !Intrinsics.b(a10.b(), b10.b()) && k(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
