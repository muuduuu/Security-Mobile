package Ec;

import Ec.F;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;
import wd.InterfaceC5074f;
import wd.InterfaceC5075g;
import xc.AbstractC5147H;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.u0;

/* loaded from: classes3.dex */
public final class B implements kotlin.reflect.p, InterfaceC0833l {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f1935d = {C5142C.k(new xc.u(C5142C.b(B.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final f0 f1936a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f1937b;

    /* renamed from: c, reason: collision with root package name */
    private final C f1938c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1939a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1939a = iArr;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List upperBounds = B.this.n().getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            List list = upperBounds;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new A((AbstractC5197E) it.next(), null, 2, null));
            }
            return arrayList;
        }
    }

    public B(C c10, f0 descriptor) {
        C0832k c0832k;
        Object f02;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f1936a = descriptor;
        this.f1937b = F.c(new b());
        if (c10 == null) {
            InterfaceC0941m b10 = n().b();
            Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
            if (b10 instanceof InterfaceC0933e) {
                f02 = d((InterfaceC0933e) b10);
            } else {
                if (!(b10 instanceof InterfaceC0930b)) {
                    throw new D("Unknown type parameter container: " + b10);
                }
                InterfaceC0941m b11 = ((InterfaceC0930b) b10).b();
                Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
                if (b11 instanceof InterfaceC0933e) {
                    c0832k = d((InterfaceC0933e) b11);
                } else {
                    InterfaceC5075g interfaceC5075g = b10 instanceof InterfaceC5075g ? (InterfaceC5075g) b10 : null;
                    if (interfaceC5075g == null) {
                        throw new D("Non-class callable descriptor must be deserialized: " + b10);
                    }
                    kotlin.reflect.d e10 = AbstractC5011a.e(b(interfaceC5075g));
                    Intrinsics.e(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c0832k = (C0832k) e10;
                }
                f02 = b10.f0(new C0826e(c0832k), Unit.f36324a);
            }
            Intrinsics.d(f02);
            c10 = (C) f02;
        }
        this.f1938c = c10;
    }

    private final Class b(InterfaceC5075g interfaceC5075g) {
        Class d10;
        InterfaceC5074f i02 = interfaceC5075g.i0();
        bd.n nVar = i02 instanceof bd.n ? (bd.n) i02 : null;
        Object g10 = nVar != null ? nVar.g() : null;
        Oc.f fVar = g10 instanceof Oc.f ? (Oc.f) g10 : null;
        if (fVar != null && (d10 = fVar.d()) != null) {
            return d10;
        }
        throw new D("Container of deserialized member is not resolved: " + interfaceC5075g);
    }

    private final C0832k d(InterfaceC0933e interfaceC0933e) {
        Class q10 = L.q(interfaceC0933e);
        C0832k c0832k = (C0832k) (q10 != null ? AbstractC5011a.e(q10) : null);
        if (c0832k != null) {
            return c0832k;
        }
        throw new D("Type parameter container is not resolved: " + interfaceC0933e.b());
    }

    @Override // Ec.InterfaceC0833l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f0 n() {
        return this.f1936a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (Intrinsics.b(this.f1938c, b10.f1938c) && Intrinsics.b(getName(), b10.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.p
    public String getName() {
        String c10 = n().getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10;
    }

    @Override // kotlin.reflect.p
    public List getUpperBounds() {
        Object b10 = this.f1937b.b(this, f1935d[0]);
        Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
        return (List) b10;
    }

    public int hashCode() {
        return (this.f1938c.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return AbstractC5147H.f44967a.a(this);
    }

    @Override // kotlin.reflect.p
    public kotlin.reflect.q u() {
        int i10 = a.f1939a[n().u().ordinal()];
        if (i10 == 1) {
            return kotlin.reflect.q.INVARIANT;
        }
        if (i10 == 2) {
            return kotlin.reflect.q.IN;
        }
        if (i10 == 3) {
            return kotlin.reflect.q.OUT;
        }
        throw new lc.m();
    }
}
