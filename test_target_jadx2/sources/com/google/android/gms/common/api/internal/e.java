package com.google.android.gms.common.api.internal;

import S6.a;
import T6.F;
import V6.AbstractC1287s;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements F {

    /* renamed from: a, reason: collision with root package name */
    private final x f23386a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23387b = false;

    public e(x xVar) {
        this.f23386a = xVar;
    }

    @Override // T6.F
    public final void a(Bundle bundle) {
    }

    @Override // T6.F
    public final void b() {
        if (this.f23387b) {
            this.f23387b = false;
            this.f23386a.n(new C2009d(this, this));
        }
    }

    @Override // T6.F
    public final void c(int i10) {
        this.f23386a.m(null);
        this.f23386a.f23469t.b(i10, this.f23387b);
    }

    @Override // T6.F
    public final void d() {
    }

    @Override // T6.F
    public final AbstractC2006a f(AbstractC2006a abstractC2006a) {
        h(abstractC2006a);
        return abstractC2006a;
    }

    @Override // T6.F
    public final boolean g() {
        if (this.f23387b) {
            return false;
        }
        Set set = this.f23386a.f23468s.f23450w;
        if (set == null || set.isEmpty()) {
            this.f23386a.m(null);
            return true;
        }
        this.f23387b = true;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    @Override // T6.F
    public final AbstractC2006a h(AbstractC2006a abstractC2006a) {
        try {
            this.f23386a.f23468s.f23451x.a(abstractC2006a);
            u uVar = this.f23386a.f23468s;
            a.f fVar = (a.f) uVar.f23442o.get(abstractC2006a.t());
            AbstractC1287s.n(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.f23386a.f23461l.containsKey(abstractC2006a.t())) {
                abstractC2006a.v(fVar);
            } else {
                abstractC2006a.a(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f23386a.n(new C2008c(this, this));
        }
        return abstractC2006a;
    }

    @Override // T6.F
    public final void e(C2010b c2010b, S6.a aVar, boolean z10) {
    }
}
