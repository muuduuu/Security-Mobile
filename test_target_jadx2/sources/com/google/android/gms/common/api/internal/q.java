package com.google.android.gms.common.api.internal;

import S6.a;
import T6.F;
import android.os.Bundle;
import com.google.android.gms.common.C2010b;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q implements F {

    /* renamed from: a, reason: collision with root package name */
    private final x f23425a;

    public q(x xVar) {
        this.f23425a = xVar;
    }

    @Override // T6.F
    public final void a(Bundle bundle) {
    }

    @Override // T6.F
    public final void b() {
        this.f23425a.l();
    }

    @Override // T6.F
    public final void c(int i10) {
    }

    @Override // T6.F
    public final void d() {
        Iterator it = this.f23425a.f23460k.values().iterator();
        while (it.hasNext()) {
            ((a.f) it.next()).h();
        }
        this.f23425a.f23468s.f23443p = Collections.emptySet();
    }

    @Override // T6.F
    public final AbstractC2006a f(AbstractC2006a abstractC2006a) {
        this.f23425a.f23468s.f23435h.add(abstractC2006a);
        return abstractC2006a;
    }

    @Override // T6.F
    public final boolean g() {
        return true;
    }

    @Override // T6.F
    public final AbstractC2006a h(AbstractC2006a abstractC2006a) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // T6.F
    public final void e(C2010b c2010b, S6.a aVar, boolean z10) {
    }
}
