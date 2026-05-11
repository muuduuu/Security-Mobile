package com.google.android.gms.common;

import V6.E0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e7.BinderC3090b;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class Q extends W6.a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private final String f23317a;

    /* renamed from: b, reason: collision with root package name */
    private final G f23318b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23319c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23320d;

    Q(String str, G g10, boolean z10, boolean z11) {
        this.f23317a = str;
        this.f23318b = g10;
        this.f23319c = z10;
        this.f23320d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23317a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, str, false);
        G g10 = this.f23318b;
        if (g10 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            g10 = null;
        }
        W6.c.l(parcel, 2, g10, false);
        W6.c.c(parcel, 3, this.f23319c);
        W6.c.c(parcel, 4, this.f23320d);
        W6.c.b(parcel, a10);
    }

    Q(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f23317a = str;
        H h10 = null;
        if (iBinder != null) {
            try {
                InterfaceC3089a f10 = E0.k1(iBinder).f();
                byte[] bArr = f10 == null ? null : (byte[]) BinderC3090b.l1(f10);
                if (bArr != null) {
                    h10 = new H(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f23318b = h10;
        this.f23319c = z10;
        this.f23320d = z11;
    }
}
