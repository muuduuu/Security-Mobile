package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class U7 extends W6.a {
    public static final Parcelable.Creator<U7> CREATOR = new C4099h();

    /* renamed from: a, reason: collision with root package name */
    public String f39759a;

    /* renamed from: b, reason: collision with root package name */
    public String f39760b;

    /* renamed from: c, reason: collision with root package name */
    public int f39761c;

    public U7(String str, String str2, int i10) {
        this.f39759a = str;
        this.f39760b = str2;
        this.f39761c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f39759a, false);
        W6.c.u(parcel, 3, this.f39760b, false);
        W6.c.m(parcel, 4, this.f39761c);
        W6.c.b(parcel, a10);
    }
}
