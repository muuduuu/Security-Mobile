package rd;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd.k;
import xc.C5142C;
import xc.u;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class e extends i {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f40634d = {C5142C.k(new u(C5142C.b(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0933e f40635b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.i f40636c;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List i10 = e.this.i();
            return CollectionsKt.w0(i10, e.this.j(i10));
        }
    }

    public static final class b extends kd.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f40638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f40639b;

        b(ArrayList arrayList, e eVar) {
            this.f40638a = arrayList;
            this.f40639b = eVar;
        }

        @Override // kd.k
        public void a(InterfaceC0930b fakeOverride) {
            Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
            kd.l.K(fakeOverride, null);
            this.f40638a.add(fakeOverride);
        }

        @Override // kd.j
        protected void e(InterfaceC0930b fromSuper, InterfaceC0930b fromCurrent) {
            Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
            Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f40639b.l() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public e(xd.n storageManager, InterfaceC0933e containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f40635b = containingClass;
        this.f40636c = storageManager.d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j(List list) {
        Collection j10;
        ArrayList arrayList = new ArrayList(3);
        Collection a10 = this.f40635b.r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList2, k.a.a(((AbstractC5197E) it.next()).w(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC0930b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            id.f name = ((InterfaceC0930b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            id.f fVar = (id.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean valueOf = Boolean.valueOf(((InterfaceC0930b) obj4) instanceof InterfaceC0952y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                kd.l lVar = kd.l.f36296f;
                List list4 = list3;
                if (booleanValue) {
                    j10 = new ArrayList();
                    for (Object obj6 : list) {
                        if (Intrinsics.b(((InterfaceC0952y) obj6).getName(), fVar)) {
                            j10.add(obj6);
                        }
                    }
                } else {
                    j10 = CollectionsKt.j();
                }
                lVar.v(fVar, list4, j10, this.f40635b, new b(arrayList, this));
            }
        }
        return Gd.a.c(arrayList);
    }

    private final List k() {
        return (List) xd.m.a(this.f40636c, this, f40634d[0]);
    }

    @Override // rd.i, rd.h
    public Collection a(id.f name, Rc.b location) {
        List list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List k10 = k();
        if (k10.isEmpty()) {
            list = CollectionsKt.j();
        } else {
            Gd.f fVar = new Gd.f();
            for (Object obj : k10) {
                if ((obj instanceof Z) && Intrinsics.b(((Z) obj).getName(), name)) {
                    fVar.add(obj);
                }
            }
            list = fVar;
        }
        return list;
    }

    @Override // rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        List list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List k10 = k();
        if (k10.isEmpty()) {
            list = CollectionsKt.j();
        } else {
            Gd.f fVar = new Gd.f();
            for (Object obj : k10) {
                if ((obj instanceof U) && Intrinsics.b(((U) obj).getName(), name)) {
                    fVar.add(obj);
                }
            }
            list = fVar;
        }
        return list;
    }

    @Override // rd.i, rd.k
    public Collection g(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return !kindFilter.a(d.f40619p.m()) ? CollectionsKt.j() : k();
    }

    protected abstract List i();

    protected final InterfaceC0933e l() {
        return this.f40635b;
    }
}
