package com.google.gson;

import java.util.Set;

/* loaded from: classes2.dex */
public final class k extends h {

    /* renamed from: a, reason: collision with root package name */
    private final P8.h f28656a = new P8.h(false);

    public Set A() {
        return this.f28656a.entrySet();
    }

    public h B(String str) {
        return (h) this.f28656a.get(str);
    }

    public boolean D(String str) {
        return this.f28656a.containsKey(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof k) && ((k) obj).f28656a.equals(this.f28656a));
    }

    public int hashCode() {
        return this.f28656a.hashCode();
    }

    public void v(String str, h hVar) {
        P8.h hVar2 = this.f28656a;
        if (hVar == null) {
            hVar = j.f28655a;
        }
        hVar2.put(str, hVar);
    }

    public void w(String str, Number number) {
        v(str, number == null ? j.f28655a : new n(number));
    }
}
