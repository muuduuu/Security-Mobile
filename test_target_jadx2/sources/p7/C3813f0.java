package p7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p7.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3813f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    iBinder = W6.b.u(parcel, t10);
                    break;
                case 3:
                    iBinder2 = W6.b.u(parcel, t10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) W6.b.f(parcel, t10, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = W6.b.g(parcel, t10);
                    break;
                case 6:
                    str2 = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C3811e0(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3811e0[i10];
    }
}
