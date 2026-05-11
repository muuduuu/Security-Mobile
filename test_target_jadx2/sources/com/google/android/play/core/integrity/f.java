package com.google.android.play.core.integrity;

import D7.C0787k;
import android.os.Parcelable;
import android.os.RemoteException;
import e8.AbstractRunnableC3093A;
import e8.C3101g;

/* loaded from: classes2.dex */
final class f extends AbstractRunnableC3093A {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f27831b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f27832c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0787k f27833d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f27834e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f27835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, C0787k c0787k, byte[] bArr, Long l10, Parcelable parcelable, C0787k c0787k2, IntegrityTokenRequest integrityTokenRequest) {
        super(c0787k);
        this.f27835f = iVar;
        this.f27831b = bArr;
        this.f27832c = l10;
        this.f27833d = c0787k2;
        this.f27834e = integrityTokenRequest;
    }

    @Override // e8.AbstractRunnableC3093A
    public final void a(Exception exc) {
        if (exc instanceof C3101g) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // e8.AbstractRunnableC3093A
    protected final void b() {
        e8.z zVar;
        try {
            ((e8.w) this.f27835f.f27844e.e()).g1(i.a(this.f27835f, this.f27831b, this.f27832c, null), new h(this.f27835f, this.f27833d));
        } catch (RemoteException e10) {
            i iVar = this.f27835f;
            IntegrityTokenRequest integrityTokenRequest = this.f27834e;
            zVar = iVar.f27840a;
            zVar.b(e10, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f27833d.d(new a(-100, e10));
        }
    }
}
