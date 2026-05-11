package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.C3687n;
import qc.AbstractC3958a;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.C5196D;
import yd.C5213o;
import yd.M;
import yd.Q;
import yd.a0;
import yd.t0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f36703a = new u();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a START = new c("START", 0);
        public static final a ACCEPT_NULL = new C0540a("ACCEPT_NULL", 1);
        public static final a UNKNOWN = new d("UNKNOWN", 2);
        public static final a NOT_NULL = new b("NOT_NULL", 3);

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.u$a$a, reason: collision with other inner class name */
        static final class C0540a extends a {
            C0540a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.u.a
            public a combine(t0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.u.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b combine(t0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.u.a
            public a combine(t0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.u.a
            public a combine(t0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                a resultNullability = getResultNullability(nextType);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a combine(t0 t0Var);

        protected final a getResultNullability(t0 t0Var) {
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            if (t0Var.X0()) {
                return ACCEPT_NULL;
            }
            if (t0Var instanceof C5213o) {
                ((C5213o) t0Var).i1();
            }
            return n.f36698a.a(t0Var) ? NOT_NULL : UNKNOWN;
        }

        private a(String str, int i10) {
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f36704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set) {
            super(0);
            this.f36704a = set;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "This collections cannot be empty! input types: " + CollectionsKt.l0(this.f36704a, null, null, null, 0, null, null, 63, null);
        }
    }

    /* synthetic */ class c extends AbstractC5156i implements Function2 {
        c(Object obj) {
            super(2, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(u.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC5197E p02, AbstractC5197E p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return Boolean.valueOf(((u) this.f44980b).e(p02, p12));
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "isStrictSupertype";
        }
    }

    /* synthetic */ class d extends AbstractC5156i implements Function2 {
        d(Object obj) {
            super(2, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(m.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC5197E p02, AbstractC5197E p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return Boolean.valueOf(((m) this.f44980b).b(p02, p12));
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "equalTypes";
        }
    }

    private u() {
    }

    private final Collection b(Collection collection, Function2 function2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            M m10 = (M) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    M m11 = (M) it2.next();
                    if (m11 != m10) {
                        Intrinsics.d(m11);
                        Intrinsics.d(m10);
                        if (((Boolean) function2.invoke(m11, m10)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final M d(Set set) {
        if (set.size() == 1) {
            return (M) CollectionsKt.z0(set);
        }
        new b(set);
        Collection b10 = b(set, new c(this));
        b10.isEmpty();
        M b11 = C3687n.f37486f.b(b10);
        if (b11 != null) {
            return b11;
        }
        Collection b12 = b(b10, new d(l.f36692b.a()));
        b12.isEmpty();
        return b12.size() < 2 ? (M) CollectionsKt.z0(b12) : new C5196D(set).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        m a10 = l.f36692b.a();
        return a10.c(abstractC5197E, abstractC5197E2) && !a10.c(abstractC5197E2, abstractC5197E);
    }

    public final M c(List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<M> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            M m10 = (M) it.next();
            if (m10.W0() instanceof C5196D) {
                Collection a10 = m10.W0().a();
                Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
                Collection<AbstractC5197E> collection = a10;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(collection, 10));
                for (AbstractC5197E abstractC5197E : collection) {
                    Intrinsics.d(abstractC5197E);
                    M d10 = AbstractC5194B.d(abstractC5197E);
                    if (m10.X0()) {
                        d10 = d10.a1(true);
                    }
                    arrayList2.add(d10);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m10);
            }
        }
        a aVar = a.START;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar = aVar.combine((t0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (M m11 : arrayList) {
            if (aVar == a.NOT_NULL) {
                if (m11 instanceof i) {
                    m11 = Q.k((i) m11);
                }
                m11 = Q.i(m11, false, 1, null);
            }
            linkedHashSet.add(m11);
        }
        List list = types;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((M) it3.next()).V0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((a0) next).u((a0) it4.next());
        }
        return d(linkedHashSet).c1((a0) next);
    }
}
