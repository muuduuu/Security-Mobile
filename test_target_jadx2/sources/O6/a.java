package O6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class a extends W6.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f7081a;

    /* renamed from: b, reason: collision with root package name */
    private int f7082b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f7083c;

    a(int i10, int i11, Bundle bundle) {
        this.f7081a = i10;
        this.f7082b = i11;
        this.f7083c = bundle;
    }

    public int j() {
        return this.f7082b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f7081a);
        W6.c.m(parcel, 2, j());
        W6.c.e(parcel, 3, this.f7083c, false);
        W6.c.b(parcel, a10);
    }
}
