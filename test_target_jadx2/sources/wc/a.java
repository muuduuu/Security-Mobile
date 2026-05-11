package Wc;

import Zc.p;
import Zc.r;
import Zc.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Zc.g f11429a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f11430b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f11431c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f11432d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11433e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f11434f;

    /* renamed from: Wc.a$a, reason: collision with other inner class name */
    static final class C0213a extends xc.m implements Function1 {
        C0213a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r m10) {
            Intrinsics.checkNotNullParameter(m10, "m");
            return Boolean.valueOf(((Boolean) a.this.f11430b.invoke(m10)).booleanValue() && !p.c(m10));
        }
    }

    public a(Zc.g jClass, Function1 memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f11429a = jClass;
        this.f11430b = memberFilter;
        C0213a c0213a = new C0213a();
        this.f11431c = c0213a;
        Sequence n10 = kotlin.sequences.j.n(CollectionsKt.T(jClass.T()), c0213a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : n10) {
            id.f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f11432d = linkedHashMap;
        Sequence n11 = kotlin.sequences.j.n(CollectionsKt.T(this.f11429a.I()), this.f11430b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : n11) {
            linkedHashMap2.put(((Zc.n) obj3).getName(), obj3);
        }
        this.f11433e = linkedHashMap2;
        Collection r10 = this.f11429a.r();
        Function1 function1 = this.f11430b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : r10) {
            if (((Boolean) function1.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(arrayList, 10)), 16));
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f11434f = linkedHashMap3;
    }

    @Override // Wc.b
    public Set a() {
        Sequence n10 = kotlin.sequences.j.n(CollectionsKt.T(this.f11429a.T()), this.f11431c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = n10.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Wc.b
    public Collection b(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f11432d.get(name);
        if (list == null) {
            list = CollectionsKt.j();
        }
        return list;
    }

    @Override // Wc.b
    public Zc.n c(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Zc.n) this.f11433e.get(name);
    }

    @Override // Wc.b
    public Set d() {
        return this.f11434f.keySet();
    }

    @Override // Wc.b
    public w e(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (w) this.f11434f.get(name);
    }

    @Override // Wc.b
    public Set f() {
        Sequence n10 = kotlin.sequences.j.n(CollectionsKt.T(this.f11429a.I()), this.f11430b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = n10.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Zc.n) it.next()).getName());
        }
        return linkedHashSet;
    }
}
