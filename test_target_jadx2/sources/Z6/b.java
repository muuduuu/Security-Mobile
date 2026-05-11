package Z6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class b extends W6.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12456a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12457b;

    public b(boolean z10, int i10) {
        this.f12456a = z10;
        this.f12457b = i10;
    }

    public boolean j() {
        return this.f12456a;
    }

    public int u() {
        return this.f12457b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.c(parcel, 1, j());
        W6.c.m(parcel, 2, u());
        W6.c.b(parcel, a10);
    }
}
