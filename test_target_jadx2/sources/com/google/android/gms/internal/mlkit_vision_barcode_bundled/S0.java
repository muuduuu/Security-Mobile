package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Map;

/* loaded from: classes2.dex */
final class S0 extends R0 {
    S0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final int a(Map.Entry entry) {
        return ((C2434d1) entry.getKey()).f24854a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final V0 b(Object obj) {
        return ((AbstractC2424b1) obj).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final V0 c(Object obj) {
        return ((AbstractC2424b1) obj).G();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final Object d(Q0 q02, P1 p12, int i10) {
        return q02.b(p12, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final void e(Object obj) {
        ((AbstractC2424b1) obj).zza.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final void f(R2 r22, Map.Entry entry) {
        C2434d1 c2434d1 = (C2434d1) entry.getKey();
        P2 p22 = P2.zza;
        switch (c2434d1.f24855b.ordinal()) {
            case 0:
                r22.s(c2434d1.f24854a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                r22.z(c2434d1.f24854a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                r22.j(c2434d1.f24854a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                r22.I(c2434d1.f24854a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                r22.x(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                r22.F(c2434d1.f24854a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                r22.m(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                r22.n(c2434d1.f24854a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                r22.b(c2434d1.f24854a, (String) entry.getValue());
                break;
            case 9:
                r22.w(c2434d1.f24854a, entry.getValue(), X1.a().b(entry.getValue().getClass()));
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                r22.G(c2434d1.f24854a, entry.getValue(), X1.a().b(entry.getValue().getClass()));
                break;
            case 11:
                r22.h(c2434d1.f24854a, (E0) entry.getValue());
                break;
            case 12:
                r22.i(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                r22.x(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                r22.C(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                r22.v(c2434d1.f24854a, ((Long) entry.getValue()).longValue());
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                r22.E(c2434d1.f24854a, ((Integer) entry.getValue()).intValue());
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                r22.y(c2434d1.f24854a, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    final boolean g(P1 p12) {
        return p12 instanceof AbstractC2424b1;
    }
}
