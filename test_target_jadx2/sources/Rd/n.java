package rd;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class n extends AbstractC4300a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f40662d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f40663b;

    /* renamed from: c, reason: collision with root package name */
    private final h f40664c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String message, Collection types) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC5197E) it.next()).w());
            }
            Gd.f b10 = Fd.a.b(arrayList);
            h b11 = rd.b.f40600d.b(message, b10);
            return b10.size() <= 1 ? b11 : new n(message, b11, null);
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40665a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0929a invoke(InterfaceC0929a selectMostSpecificInEachOverridableGroup) {
            Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40666a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0929a invoke(Z selectMostSpecificInEachOverridableGroup) {
            Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f40667a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0929a invoke(U selectMostSpecificInEachOverridableGroup) {
            Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ n(String str, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVar);
    }

    public static final h j(String str, Collection collection) {
        return f40662d.a(str, collection);
    }

    @Override // rd.AbstractC4300a, rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return kd.n.a(super.a(name, location), c.f40666a);
    }

    @Override // rd.AbstractC4300a, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return kd.n.a(super.c(name, location), d.f40667a);
    }

    @Override // rd.AbstractC4300a, rd.k
    public Collection g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection g10 = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g10) {
            if (((InterfaceC0941m) obj) instanceof InterfaceC0929a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        Intrinsics.e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt.w0(kd.n.a(list, b.f40665a), list2);
    }

    @Override // rd.AbstractC4300a
    protected h i() {
        return this.f40664c;
    }

    private n(String str, h hVar) {
        this.f40663b = str;
        this.f40664c = hVar;
    }
}
