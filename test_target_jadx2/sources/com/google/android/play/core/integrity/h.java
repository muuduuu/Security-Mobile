package com.google.android.play.core.integrity;

import D7.C0787k;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class h extends e8.x {

    /* renamed from: f, reason: collision with root package name */
    private final e8.z f27837f = new e8.z("OnRequestIntegrityTokenCallback");

    /* renamed from: g, reason: collision with root package name */
    private final C0787k f27838g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f27839h;

    h(i iVar, C0787k c0787k) {
        this.f27839h = iVar;
        this.f27838g = c0787k;
    }

    @Override // e8.y
    public final void Q(Bundle bundle) {
        s sVar;
        String str;
        this.f27839h.f27844e.v(this.f27838g);
        this.f27837f.c("onRequestIntegrityToken", new Object[0]);
        sVar = this.f27839h.f27843d;
        S6.b a10 = sVar.a(bundle);
        if (a10 != null) {
            this.f27838g.d(a10);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f27838g.d(new a(-100, null));
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f27839h.f27841b;
        g gVar = new g(this, str, j10);
        C0787k c0787k = this.f27838g;
        b bVar = new b();
        bVar.b(string);
        bVar.a(gVar);
        c0787k.e(bVar.c());
    }
}
