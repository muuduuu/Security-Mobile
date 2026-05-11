package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class V8 extends W6.a {
    public static final Parcelable.Creator<V8> CREATOR = new p9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39780a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39781b;

    public V8(String str, String str2) {
        this.f39780a = str;
        this.f39781b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39780a, false);
        W6.c.u(parcel, 2, this.f39781b, false);
        W6.c.b(parcel, a10);
    }
}
