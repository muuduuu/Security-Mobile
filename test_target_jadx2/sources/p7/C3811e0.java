package p7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p7.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3811e0 extends W6.a {
    public static final Parcelable.Creator<C3811e0> CREATOR = new C3813f0();

    /* renamed from: a, reason: collision with root package name */
    private final int f38419a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f38420b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f38421c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f38422d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38423e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38424f;

    C3811e0(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f38419a = i10;
        this.f38420b = iBinder;
        this.f38421c = iBinder2;
        this.f38422d = pendingIntent;
        this.f38423e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f38424f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, x7.M] */
    public static C3811e0 F(IInterface iInterface, x7.M m10, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new C3811e0(1, iInterface, m10, null, null, str2);
    }

    public static C3811e0 j(PendingIntent pendingIntent, String str, String str2) {
        return new C3811e0(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, x7.J] */
    public static C3811e0 u(IInterface iInterface, x7.J j10, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new C3811e0(2, iInterface, j10, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f38419a);
        W6.c.l(parcel, 2, this.f38420b, false);
        W6.c.l(parcel, 3, this.f38421c, false);
        W6.c.s(parcel, 4, this.f38422d, i10, false);
        W6.c.u(parcel, 5, this.f38423e, false);
        W6.c.u(parcel, 6, this.f38424f, false);
        W6.c.b(parcel, a10);
    }
}
