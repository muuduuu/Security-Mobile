package com.facebook.imagepipeline.memory;

import b3.l;
import c3.AbstractC1721a;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f20705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20706b;

    /* renamed from: c, reason: collision with root package name */
    final Queue f20707c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20708d;

    /* renamed from: e, reason: collision with root package name */
    private int f20709e;

    public b(int i10, int i11, int i12, boolean z10) {
        l.i(i10 > 0);
        l.i(i11 >= 0);
        l.i(i12 >= 0);
        this.f20705a = i10;
        this.f20706b = i11;
        this.f20707c = new LinkedList();
        this.f20709e = i12;
        this.f20708d = z10;
    }

    void a(Object obj) {
        this.f20707c.add(obj);
    }

    public void b() {
        l.i(this.f20709e > 0);
        this.f20709e--;
    }

    public Object c() {
        Object g10 = g();
        if (g10 != null) {
            this.f20709e++;
        }
        return g10;
    }

    int d() {
        return this.f20707c.size();
    }

    public void e() {
        this.f20709e++;
    }

    public boolean f() {
        return this.f20709e + d() > this.f20706b;
    }

    public Object g() {
        return this.f20707c.poll();
    }

    public void h(Object obj) {
        l.g(obj);
        if (this.f20708d) {
            l.i(this.f20709e > 0);
            this.f20709e--;
            a(obj);
        } else {
            int i10 = this.f20709e;
            if (i10 <= 0) {
                AbstractC1721a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f20709e = i10 - 1;
                a(obj);
            }
        }
    }
}
