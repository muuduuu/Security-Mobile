package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class W6 extends W6.a {
    public static final Parcelable.Creator<W6> CREATOR = new C4079f();

    /* renamed from: a, reason: collision with root package name */
    public String f39808a;

    /* renamed from: b, reason: collision with root package name */
    public String f39809b;

    public W6(String str, String str2) {
        this.f39808a = str;
        this.f39809b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f39808a, false);
        W6.c.u(parcel, 3, this.f39809b, false);
        W6.c.b(parcel, a10);
    }
}
