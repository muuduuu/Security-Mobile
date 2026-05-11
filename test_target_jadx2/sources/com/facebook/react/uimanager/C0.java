package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import v4.C4932h;

/* loaded from: classes.dex */
class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f22144a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f22145b = new SparseBooleanArray();

    /* renamed from: c, reason: collision with root package name */
    private final C4932h f22146c = new C4932h();

    public void a(InterfaceC1969t0 interfaceC1969t0) {
        this.f22146c.a();
        this.f22144a.put(interfaceC1969t0.r(), interfaceC1969t0);
    }

    public void b(InterfaceC1969t0 interfaceC1969t0) {
        this.f22146c.a();
        int r10 = interfaceC1969t0.r();
        this.f22144a.put(r10, interfaceC1969t0);
        this.f22145b.put(r10, true);
    }

    public InterfaceC1969t0 c(int i10) {
        this.f22146c.a();
        return (InterfaceC1969t0) this.f22144a.get(i10);
    }

    public int d() {
        this.f22146c.a();
        return this.f22145b.size();
    }

    public int e(int i10) {
        this.f22146c.a();
        return this.f22145b.keyAt(i10);
    }

    public boolean f(int i10) {
        this.f22146c.a();
        return this.f22145b.get(i10);
    }

    public void g(int i10) {
        this.f22146c.a();
        if (!this.f22145b.get(i10)) {
            this.f22144a.remove(i10);
            return;
        }
        throw new Q("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public void h(int i10) {
        this.f22146c.a();
        if (i10 == -1) {
            return;
        }
        if (this.f22145b.get(i10)) {
            this.f22144a.remove(i10);
            this.f22145b.delete(i10);
        } else {
            throw new Q("View with tag " + i10 + " is not registered as a root view");
        }
    }
}
