package Z6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class g extends W6.a {
    public static final Parcelable.Creator<g> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private final int f12463a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12464b;

    public g(int i10) {
        this(i10, false);
    }

    public int j() {
        return this.f12463a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, j());
        W6.c.c(parcel, 2, this.f12464b);
        W6.c.b(parcel, a10);
    }

    public g(int i10, boolean z10) {
        this.f12463a = i10;
        this.f12464b = z10;
    }
}
