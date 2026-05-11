package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class K8 extends W6.a {
    public static final Parcelable.Creator<K8> CREATOR = new J8();

    /* renamed from: a, reason: collision with root package name */
    private final int f39487a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f39488b;

    public K8(int i10, String[] strArr) {
        this.f39487a = i10;
        this.f39488b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39487a);
        W6.c.v(parcel, 2, this.f39488b, false);
        W6.c.b(parcel, a10);
    }
}
