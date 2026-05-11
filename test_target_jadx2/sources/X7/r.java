package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r extends W6.a {
    public static final Parcelable.Creator<r> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44885a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44886b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44887c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44888d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f44889e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f44890f;

    public r(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f44885a = z10;
        this.f44886b = z11;
        this.f44887c = z12;
        this.f44888d = z13;
        this.f44889e = z14;
        this.f44890f = z15;
    }

    public boolean F() {
        return this.f44888d;
    }

    public boolean I() {
        return this.f44885a;
    }

    public boolean Z0() {
        return this.f44886b;
    }

    public boolean j() {
        return this.f44890f;
    }

    public boolean u() {
        return this.f44887c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.c(parcel, 1, I());
        W6.c.c(parcel, 2, Z0());
        W6.c.c(parcel, 3, u());
        W6.c.c(parcel, 4, F());
        W6.c.c(parcel, 5, y0());
        W6.c.c(parcel, 6, j());
        W6.c.b(parcel, a10);
    }

    public boolean y0() {
        return this.f44889e;
    }
}
