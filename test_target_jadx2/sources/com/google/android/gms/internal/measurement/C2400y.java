package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2400y {

    /* renamed from: a, reason: collision with root package name */
    final Map f24694a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final L f24695b = new L();

    public C2400y() {
        a(new C2382w());
        a(new C2409z());
        a(new A());
        a(new E());
        a(new J());
        a(new K());
        a(new M());
    }

    final void a(AbstractC2391x abstractC2391x) {
        Iterator it = abstractC2391x.f24681a.iterator();
        while (it.hasNext()) {
            this.f24694a.put(((N) it.next()).zzb().toString(), abstractC2391x);
        }
    }

    public final InterfaceC2329q b(Y1 y12, InterfaceC2329q interfaceC2329q) {
        AbstractC2412z2.l(y12);
        if (!(interfaceC2329q instanceof r)) {
            return interfaceC2329q;
        }
        r rVar = (r) interfaceC2329q;
        ArrayList c10 = rVar.c();
        String b10 = rVar.b();
        Map map = this.f24694a;
        return (map.containsKey(b10) ? (AbstractC2391x) map.get(b10) : this.f24695b).a(b10, y12, c10);
    }
}
