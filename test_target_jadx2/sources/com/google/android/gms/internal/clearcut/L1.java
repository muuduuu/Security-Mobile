package com.google.android.gms.internal.clearcut;

import S6.a;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2006a;

/* loaded from: classes2.dex */
final class L1 extends AbstractC2006a {

    /* renamed from: r, reason: collision with root package name */
    private final Q6.f f23862r;

    L1(Q6.f fVar, S6.h hVar) {
        super(Q6.a.f8236p, hVar);
        this.f23862r = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2006a
    protected final /* synthetic */ void r(a.b bVar) {
        P1 p12 = (P1) bVar;
        O1 o12 = new O1(this);
        try {
            Q6.f fVar = this.f23862r;
            fVar.getClass();
            M1 m12 = fVar.f8278i;
            int d10 = m12.d();
            byte[] bArr = new byte[d10];
            AbstractC2181y1.b(m12, bArr, 0, d10);
            fVar.f8271b = bArr;
            ((T1) p12.I()).U(o12, this.f23862r);
        } catch (RuntimeException e10) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            a(new Status(10, "MessageProducer"));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ S6.o g(Status status) {
        return status;
    }
}
