package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class V7 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    private final B3 f24397c;

    /* renamed from: d, reason: collision with root package name */
    final Map f24398d;

    public V7(B3 b32) {
        super("require");
        this.f24398d = new HashMap();
        this.f24397c = b32;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        InterfaceC2329q interfaceC2329q;
        AbstractC2412z2.a("require", 1, list);
        String a10 = y12.a((InterfaceC2329q) list.get(0)).a();
        Map map = this.f24398d;
        if (map.containsKey(a10)) {
            return (InterfaceC2329q) map.get(a10);
        }
        Map map2 = this.f24397c.f24195a;
        if (map2.containsKey(a10)) {
            try {
                interfaceC2329q = (InterfaceC2329q) ((Callable) map2.get(a10)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(a10)));
            }
        } else {
            interfaceC2329q = InterfaceC2329q.f24620U;
        }
        if (interfaceC2329q instanceof AbstractC2275k) {
            this.f24398d.put(a10, (AbstractC2275k) interfaceC2329q);
        }
        return interfaceC2329q;
    }
}
