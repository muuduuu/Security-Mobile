package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public final Y1 f24418a;

    /* renamed from: b, reason: collision with root package name */
    final C2400y f24419b;

    /* renamed from: c, reason: collision with root package name */
    final Map f24420c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f24421d = new HashMap();

    public Y1(Y1 y12, C2400y c2400y) {
        this.f24418a = y12;
        this.f24419b = c2400y;
    }

    public final InterfaceC2329q a(InterfaceC2329q interfaceC2329q) {
        return this.f24419b.b(this, interfaceC2329q);
    }

    public final InterfaceC2329q b(C2230f c2230f) {
        InterfaceC2329q interfaceC2329q = InterfaceC2329q.f24620U;
        Iterator v10 = c2230f.v();
        while (v10.hasNext()) {
            interfaceC2329q = this.f24419b.b(this, c2230f.B(((Integer) v10.next()).intValue()));
            if (interfaceC2329q instanceof C2248h) {
                break;
            }
        }
        return interfaceC2329q;
    }

    public final Y1 c() {
        return new Y1(this, this.f24419b);
    }

    public final boolean d(String str) {
        if (this.f24420c.containsKey(str)) {
            return true;
        }
        Y1 y12 = this.f24418a;
        if (y12 != null) {
            return y12.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC2329q interfaceC2329q) {
        Y1 y12;
        Map map = this.f24420c;
        if (!map.containsKey(str) && (y12 = this.f24418a) != null && y12.d(str)) {
            y12.e(str, interfaceC2329q);
        } else {
            if (this.f24421d.containsKey(str)) {
                return;
            }
            if (interfaceC2329q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC2329q);
            }
        }
    }

    public final void f(String str, InterfaceC2329q interfaceC2329q) {
        if (this.f24421d.containsKey(str)) {
            return;
        }
        if (interfaceC2329q == null) {
            this.f24420c.remove(str);
        } else {
            this.f24420c.put(str, interfaceC2329q);
        }
    }

    public final void g(String str, InterfaceC2329q interfaceC2329q) {
        f(str, interfaceC2329q);
        this.f24421d.put(str, Boolean.TRUE);
    }

    public final InterfaceC2329q h(String str) {
        Map map = this.f24420c;
        if (map.containsKey(str)) {
            return (InterfaceC2329q) map.get(str);
        }
        Y1 y12 = this.f24418a;
        if (y12 != null) {
            return y12.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
