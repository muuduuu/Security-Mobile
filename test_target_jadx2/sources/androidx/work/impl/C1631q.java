package androidx.work.impl;

import androidx.lifecycle.C1607y;
import x1.r;

/* renamed from: androidx.work.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1631q implements x1.r {

    /* renamed from: c, reason: collision with root package name */
    private final C1607y f18364c = new C1607y();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f18365d = androidx.work.impl.utils.futures.c.t();

    public C1631q() {
        a(x1.r.f44712b);
    }

    public void a(r.b bVar) {
        this.f18364c.m(bVar);
        if (bVar instanceof r.b.c) {
            this.f18365d.p((r.b.c) bVar);
        } else if (bVar instanceof r.b.a) {
            this.f18365d.q(((r.b.a) bVar).a());
        }
    }
}
