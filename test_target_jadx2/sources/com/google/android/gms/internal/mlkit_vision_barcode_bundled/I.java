package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        C2526w c2526w = null;
        String str = null;
        String str2 = null;
        C2531x[] c2531xArr = null;
        C2516u[] c2516uArr = null;
        String[] strArr = null;
        C2492p[] c2492pArr = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    c2526w = (C2526w) W6.b.f(parcel, t10, C2526w.CREATOR);
                    break;
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    c2531xArr = (C2531x[]) W6.b.j(parcel, t10, C2531x.CREATOR);
                    break;
                case 5:
                    c2516uArr = (C2516u[]) W6.b.j(parcel, t10, C2516u.CREATOR);
                    break;
                case 6:
                    strArr = W6.b.h(parcel, t10);
                    break;
                case 7:
                    c2492pArr = (C2492p[]) W6.b.j(parcel, t10, C2492p.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C2506s(c2526w, str, str2, c2531xArr, c2516uArr, strArr, c2492pArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2506s[i10];
    }
}
