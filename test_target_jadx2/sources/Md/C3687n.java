package md;

import Kc.G;
import Kc.InterfaceC0936h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.a0;
import yd.e0;
import yd.k0;
import yd.m0;
import yd.u0;

/* renamed from: md.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3687n implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f37486f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f37487a;

    /* renamed from: b, reason: collision with root package name */
    private final G f37488b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f37489c;

    /* renamed from: d, reason: collision with root package name */
    private final M f37490d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f37491e;

    /* renamed from: md.n$a */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: md.n$a$a, reason: collision with other inner class name */
        private static final class EnumC0565a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC0565a[] $VALUES;
            public static final EnumC0565a COMMON_SUPER_TYPE = new EnumC0565a("COMMON_SUPER_TYPE", 0);
            public static final EnumC0565a INTERSECTION_TYPE = new EnumC0565a("INTERSECTION_TYPE", 1);

            private static final /* synthetic */ EnumC0565a[] $values() {
                return new EnumC0565a[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
            }

            static {
                EnumC0565a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = AbstractC3958a.a($values);
            }

            private EnumC0565a(String str, int i10) {
            }

            public static EnumC0565a valueOf(String str) {
                return (EnumC0565a) Enum.valueOf(EnumC0565a.class, str);
            }

            public static EnumC0565a[] values() {
                return (EnumC0565a[]) $VALUES.clone();
            }
        }

        /* renamed from: md.n$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37492a;

            static {
                int[] iArr = new int[EnumC0565a.values().length];
                try {
                    iArr[EnumC0565a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0565a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f37492a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final M a(Collection collection, EnumC0565a enumC0565a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                M m10 = (M) it.next();
                next = C3687n.f37486f.e((M) next, m10, enumC0565a);
            }
            return (M) next;
        }

        private final M c(C3687n c3687n, C3687n c3687n2, EnumC0565a enumC0565a) {
            Set h02;
            int i10 = b.f37492a[enumC0565a.ordinal()];
            if (i10 == 1) {
                h02 = CollectionsKt.h0(c3687n.k(), c3687n2.k());
            } else {
                if (i10 != 2) {
                    throw new lc.m();
                }
                h02 = CollectionsKt.T0(c3687n.k(), c3687n2.k());
            }
            return C5198F.e(a0.f45478b.i(), new C3687n(c3687n.f37487a, c3687n.f37488b, h02, null), false);
        }

        private final M d(C3687n c3687n, M m10) {
            if (c3687n.k().contains(m10)) {
                return m10;
            }
            return null;
        }

        private final M e(M m10, M m11, EnumC0565a enumC0565a) {
            if (m10 == null || m11 == null) {
                return null;
            }
            e0 W02 = m10.W0();
            e0 W03 = m11.W0();
            boolean z10 = W02 instanceof C3687n;
            if (z10 && (W03 instanceof C3687n)) {
                return c((C3687n) W02, (C3687n) W03, enumC0565a);
            }
            if (z10) {
                return d((C3687n) W02, m11);
            }
            if (W03 instanceof C3687n) {
                return d((C3687n) W03, m10);
            }
            return null;
        }

        public final M b(Collection types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return a(types, EnumC0565a.INTERSECTION_TYPE);
        }

        private a() {
        }
    }

    /* renamed from: md.n$b */
    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            M y10 = C3687n.this.v().x().y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
            List p10 = CollectionsKt.p(m0.f(y10, CollectionsKt.e(new k0(u0.IN_VARIANCE, C3687n.this.f37490d)), null, 2, null));
            if (!C3687n.this.m()) {
                p10.add(C3687n.this.v().L());
            }
            return p10;
        }
    }

    /* renamed from: md.n$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37494a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC5197E it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    public /* synthetic */ C3687n(long j10, G g10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g10, set);
    }

    private final List l() {
        return (List) this.f37491e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        Collection a10 = AbstractC3692s.a(this.f37488b);
        if ((a10 instanceof Collection) && a10.isEmpty()) {
            return true;
        }
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            if (this.f37489c.contains((AbstractC5197E) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final String n() {
        return '[' + CollectionsKt.l0(this.f37489c, ",", null, null, 0, null, c.f37494a, 30, null) + ']';
    }

    @Override // yd.e0
    public Collection a() {
        return l();
    }

    @Override // yd.e0
    public e0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // yd.e0
    public List c() {
        return CollectionsKt.j();
    }

    @Override // yd.e0
    public InterfaceC0936h d() {
        return null;
    }

    @Override // yd.e0
    public boolean e() {
        return false;
    }

    public final Set k() {
        return this.f37489c;
    }

    public String toString() {
        return "IntegerLiteralType" + n();
    }

    @Override // yd.e0
    public Hc.g v() {
        return this.f37488b.v();
    }

    private C3687n(long j10, G g10, Set set) {
        this.f37490d = C5198F.e(a0.f45478b.i(), this, false);
        this.f37491e = lc.i.a(new b());
        this.f37487a = j10;
        this.f37488b = g10;
        this.f37489c = set;
    }
}
