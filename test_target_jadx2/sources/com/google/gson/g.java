package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g extends h implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f28511a;

    public g() {
        this.f28511a = new ArrayList();
    }

    private h B() {
        int size = this.f28511a.size();
        if (size == 1) {
            return (h) this.f28511a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void A(String str) {
        this.f28511a.add(str == null ? j.f28655a : new n(str));
    }

    @Override // com.google.gson.h
    public int c() {
        return B().c();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f28511a.equals(this.f28511a));
    }

    public int hashCode() {
        return this.f28511a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f28511a.iterator();
    }

    @Override // com.google.gson.h
    public long k() {
        return B().k();
    }

    public void v(h hVar) {
        if (hVar == null) {
            hVar = j.f28655a;
        }
        this.f28511a.add(hVar);
    }

    public void w(Number number) {
        this.f28511a.add(number == null ? j.f28655a : new n(number));
    }

    public g(int i10) {
        this.f28511a = new ArrayList(i10);
    }
}
