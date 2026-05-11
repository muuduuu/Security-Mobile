package B7;

import V6.X;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class l extends W6.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f528a;

    /* renamed from: b, reason: collision with root package name */
    private final C2010b f529b;

    /* renamed from: c, reason: collision with root package name */
    private final X f530c;

    l(int i10, C2010b c2010b, X x10) {
        this.f528a = i10;
        this.f529b = c2010b;
        this.f530c = x10;
    }

    public final C2010b j() {
        return this.f529b;
    }

    public final X u() {
        return this.f530c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f528a);
        W6.c.s(parcel, 2, this.f529b, i10, false);
        W6.c.s(parcel, 3, this.f530c, i10, false);
        W6.c.b(parcel, a10);
    }
}
