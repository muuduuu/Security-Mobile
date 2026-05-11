package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.C3628c;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.AbstractC5205g;
import yd.AbstractC5222y;
import yd.C5196D;
import yd.C5198F;
import yd.M;
import yd.e0;
import yd.i0;
import yd.s0;
import yd.t0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class f extends AbstractC5205g {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36673a = new a();

        private a() {
        }
    }

    /* synthetic */ class b extends AbstractC5156i implements Function1 {
        b(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(f.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(Ad.i p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((f) this.f44980b).a(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "prepareType";
        }
    }

    private final M c(M m10) {
        AbstractC5197E type;
        e0 W02 = m10.W0();
        C5196D c5196d = null;
        r3 = null;
        t0 t0Var = null;
        if (!(W02 instanceof C3628c)) {
            if (!(W02 instanceof C5196D) || !m10.X0()) {
                return m10;
            }
            C5196D c5196d2 = (C5196D) W02;
            Collection a10 = c5196d2.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(a10, 10));
            Iterator it = a10.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(Bd.a.w((AbstractC5197E) it.next()));
                z10 = true;
            }
            if (z10) {
                AbstractC5197E i10 = c5196d2.i();
                c5196d = new C5196D(arrayList).m(i10 != null ? Bd.a.w(i10) : null);
            }
            if (c5196d != null) {
                c5196d2 = c5196d;
            }
            return c5196d2.h();
        }
        C3628c c3628c = (C3628c) W02;
        i0 f10 = c3628c.f();
        if (f10.a() != u0.IN_VARIANCE) {
            f10 = null;
        }
        if (f10 != null && (type = f10.getType()) != null) {
            t0Var = type.Z0();
        }
        t0 t0Var2 = t0Var;
        if (c3628c.h() == null) {
            i0 f11 = c3628c.f();
            Collection a11 = c3628c.a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(a11, 10));
            Iterator it2 = a11.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC5197E) it2.next()).Z0());
            }
            c3628c.j(new j(f11, arrayList2, null, 4, null));
        }
        Ad.b bVar = Ad.b.FOR_SUBTYPING;
        j h10 = c3628c.h();
        Intrinsics.d(h10);
        return new i(bVar, h10, t0Var2, m10.V0(), m10.X0(), false, 32, null);
    }

    @Override // yd.AbstractC5205g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 a(Ad.i type) {
        t0 d10;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof AbstractC5197E)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        t0 Z02 = ((AbstractC5197E) type).Z0();
        if (Z02 instanceof M) {
            d10 = c((M) Z02);
        } else {
            if (!(Z02 instanceof AbstractC5222y)) {
                throw new lc.m();
            }
            AbstractC5222y abstractC5222y = (AbstractC5222y) Z02;
            M c10 = c(abstractC5222y.e1());
            M c11 = c(abstractC5222y.f1());
            d10 = (c10 == abstractC5222y.e1() && c11 == abstractC5222y.f1()) ? Z02 : C5198F.d(c10, c11);
        }
        return s0.c(d10, Z02, new b(this));
    }
}
