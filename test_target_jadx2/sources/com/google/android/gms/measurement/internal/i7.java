package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class i7 implements Parcelable.Creator {
    static void a(h7 h7Var, Parcel parcel, int i10) {
        int i11 = h7Var.f26095a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.u(parcel, 2, h7Var.f26096b, false);
        W6.c.q(parcel, 3, h7Var.f26097c);
        W6.c.r(parcel, 4, h7Var.f26098d, false);
        W6.c.k(parcel, 5, null, false);
        W6.c.u(parcel, 6, h7Var.f26099e, false);
        W6.c.u(parcel, 7, h7Var.f26100f, false);
        W6.c.i(parcel, 8, h7Var.f26101g, false);
        W6.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 4:
                    l10 = W6.b.y(parcel, t10);
                    break;
                case 5:
                    f10 = W6.b.s(parcel, t10);
                    break;
                case 6:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 7:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 8:
                    d10 = W6.b.q(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new h7(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h7[i10];
    }
}
