package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4162n2 extends W6.a {
    public static final Parcelable.Creator<C4162n2> CREATOR = new M1();

    /* renamed from: a, reason: collision with root package name */
    public int f40151a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f40152b;

    public C4162n2(int i10, String[] strArr) {
        this.f40151a = i10;
        this.f40152b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f40151a);
        W6.c.v(parcel, 3, this.f40152b, false);
        W6.c.b(parcel, a10);
    }
}
