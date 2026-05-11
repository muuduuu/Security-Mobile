package yd;

import Kc.InterfaceC0936h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.AbstractC3728a;

/* renamed from: yd.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5196D implements e0, Ad.h {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5197E f45426a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f45427b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45428c;

    /* renamed from: yd.D$a */
    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return C5196D.this.b(kotlinTypeRefiner).h();
        }
    }

    /* renamed from: yd.D$b */
    public static final class b implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f45430a;

        public b(Function1 function1) {
            this.f45430a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC5197E abstractC5197E = (AbstractC5197E) obj;
            Function1 function1 = this.f45430a;
            Intrinsics.d(abstractC5197E);
            String obj3 = function1.invoke(abstractC5197E).toString();
            AbstractC5197E abstractC5197E2 = (AbstractC5197E) obj2;
            Function1 function12 = this.f45430a;
            Intrinsics.d(abstractC5197E2);
            return AbstractC3728a.a(obj3, function12.invoke(abstractC5197E2).toString());
        }
    }

    /* renamed from: yd.D$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45431a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(AbstractC5197E it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* renamed from: yd.D$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f45432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(1);
            this.f45432a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC5197E abstractC5197E) {
            Function1 function1 = this.f45432a;
            Intrinsics.d(abstractC5197E);
            return function1.invoke(abstractC5197E).toString();
        }
    }

    public C5196D(Collection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f45427b = linkedHashSet;
        this.f45428c = linkedHashSet.hashCode();
    }

    public static /* synthetic */ String k(C5196D c5196d, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = c.f45431a;
        }
        return c5196d.j(function1);
    }

    @Override // yd.e0
    public Collection a() {
        return this.f45427b;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5196D) {
            return Intrinsics.b(this.f45427b, ((C5196D) obj).f45427b);
        }
        return false;
    }

    public final rd.h g() {
        return rd.n.f40662d.a("member scope for intersection type", this.f45427b);
    }

    public final M h() {
        return C5198F.l(a0.f45478b.i(), this, CollectionsKt.j(), false, g(), new a());
    }

    public int hashCode() {
        return this.f45428c;
    }

    public final AbstractC5197E i() {
        return this.f45426a;
    }

    public final String j(Function1 getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.l0(CollectionsKt.F0(this.f45427b, new b(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new d(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // yd.e0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5196D b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection a10 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(a10, 10));
        Iterator it = a10.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC5197E) it.next()).g1(kotlinTypeRefiner));
            z10 = true;
        }
        C5196D c5196d = null;
        if (z10) {
            AbstractC5197E i10 = i();
            c5196d = new C5196D(arrayList).m(i10 != null ? i10.g1(kotlinTypeRefiner) : null);
        }
        return c5196d == null ? this : c5196d;
    }

    public final C5196D m(AbstractC5197E abstractC5197E) {
        return new C5196D(this.f45427b, abstractC5197E);
    }

    public String toString() {
        return k(this, null, 1, null);
    }

    @Override // yd.e0
    public Hc.g v() {
        Hc.g v10 = ((AbstractC5197E) this.f45427b.iterator().next()).W0().v();
        Intrinsics.checkNotNullExpressionValue(v10, "getBuiltIns(...)");
        return v10;
    }

    private C5196D(Collection collection, AbstractC5197E abstractC5197E) {
        this(collection);
        this.f45426a = abstractC5197E;
    }
}
