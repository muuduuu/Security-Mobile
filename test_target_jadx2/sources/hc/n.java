package Hc;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.K;
import id.C3367b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import yd.AbstractC5197E;
import yd.q0;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3984a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f3985b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set f3986c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f3987d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f3988e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f3989f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f3990g;

    static {
        m[] values = m.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (m mVar : values) {
            arrayList.add(mVar.getTypeName());
        }
        f3985b = CollectionsKt.S0(arrayList);
        l[] values2 = l.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (l lVar : values2) {
            arrayList2.add(lVar.getTypeName());
        }
        f3986c = CollectionsKt.S0(arrayList2);
        f3987d = new HashMap();
        f3988e = new HashMap();
        f3989f = G.j(t.a(l.UBYTEARRAY, id.f.o("ubyteArrayOf")), t.a(l.USHORTARRAY, id.f.o("ushortArrayOf")), t.a(l.UINTARRAY, id.f.o("uintArrayOf")), t.a(l.ULONGARRAY, id.f.o("ulongArrayOf")));
        m[] values3 = m.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (m mVar2 : values3) {
            linkedHashSet.add(mVar2.getArrayClassId().j());
        }
        f3990g = linkedHashSet;
        for (m mVar3 : m.values()) {
            f3987d.put(mVar3.getArrayClassId(), mVar3.getClassId());
            f3988e.put(mVar3.getClassId(), mVar3.getArrayClassId());
        }
    }

    private n() {
    }

    public static final boolean d(AbstractC5197E type) {
        InterfaceC0936h d10;
        Intrinsics.checkNotNullParameter(type, "type");
        if (q0.w(type) || (d10 = type.W0().d()) == null) {
            return false;
        }
        return f3984a.c(d10);
    }

    public final C3367b a(C3367b arrayClassId) {
        Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
        return (C3367b) f3987d.get(arrayClassId);
    }

    public final boolean b(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f3990g.contains(name);
    }

    public final boolean c(InterfaceC0941m descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        InterfaceC0941m b10 = descriptor.b();
        return (b10 instanceof K) && Intrinsics.b(((K) b10).e(), j.f3891y) && f3985b.contains(descriptor.getName());
    }
}
