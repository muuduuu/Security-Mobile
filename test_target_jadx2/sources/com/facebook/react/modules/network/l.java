package com.facebook.react.modules.network;

import Td.G;
import Td.z;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* loaded from: classes.dex */
public class l extends G {

    /* renamed from: c, reason: collision with root package name */
    private final G f21849c;

    /* renamed from: d, reason: collision with root package name */
    private final j f21850d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3879g f21851e;

    /* renamed from: f, reason: collision with root package name */
    private long f21852f = 0;

    class a extends AbstractC3887o {
        a(b0 b0Var) {
            super(b0Var);
        }

        @Override // pe.AbstractC3887o, pe.b0
        public long b2(C3877e c3877e, long j10) {
            long b22 = super.b2(c3877e, j10);
            l.this.f21852f += b22 != -1 ? b22 : 0L;
            l.this.f21850d.a(l.this.f21852f, l.this.f21849c.e(), b22 == -1);
            return b22;
        }
    }

    public l(G g10, j jVar) {
        this.f21849c = g10;
        this.f21850d = jVar;
    }

    private b0 r(b0 b0Var) {
        return new a(b0Var);
    }

    @Override // Td.G
    public long e() {
        return this.f21849c.e();
    }

    @Override // Td.G
    public z f() {
        return this.f21849c.f();
    }

    @Override // Td.G
    public InterfaceC3879g j() {
        if (this.f21851e == null) {
            this.f21851e = M.c(r(this.f21849c.j()));
        }
        return this.f21851e;
    }

    public long s() {
        return this.f21852f;
    }
}
