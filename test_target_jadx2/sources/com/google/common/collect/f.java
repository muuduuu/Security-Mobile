package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class f extends r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f27881a;

    f(Comparator comparator) {
        this.f27881a = (Comparator) g8.h.h(comparator);
    }

    @Override // com.google.common.collect.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27881a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f27881a.equals(((f) obj).f27881a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27881a.hashCode();
    }

    public String toString() {
        return this.f27881a.toString();
    }
}
