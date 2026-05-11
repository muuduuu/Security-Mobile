package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class c extends r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final g8.c f27879a;

    /* renamed from: b, reason: collision with root package name */
    final r f27880b;

    c(g8.c cVar, r rVar) {
        this.f27879a = (g8.c) g8.h.h(cVar);
        this.f27880b = (r) g8.h.h(rVar);
    }

    @Override // com.google.common.collect.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27880b.compare(this.f27879a.apply(obj), this.f27879a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27879a.equals(cVar.f27879a) && this.f27880b.equals(cVar.f27880b);
    }

    public int hashCode() {
        return g8.f.b(this.f27879a, this.f27880b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27880b);
        String valueOf2 = String.valueOf(this.f27879a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
