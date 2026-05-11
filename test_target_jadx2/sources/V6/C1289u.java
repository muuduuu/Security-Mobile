package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: V6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1289u extends W6.a {
    public static final Parcelable.Creator<C1289u> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final int f11014a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11015b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11016c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11017d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11018e;

    public C1289u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f11014a = i10;
        this.f11015b = z10;
        this.f11016c = z11;
        this.f11017d = i11;
        this.f11018e = i12;
    }

    public boolean F() {
        return this.f11015b;
    }

    public boolean I() {
        return this.f11016c;
    }

    public int j() {
        return this.f11017d;
    }

    public int u() {
        return this.f11018e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, y0());
        W6.c.c(parcel, 2, F());
        W6.c.c(parcel, 3, I());
        W6.c.m(parcel, 4, j());
        W6.c.m(parcel, 5, u());
        W6.c.b(parcel, a10);
    }

    public int y0() {
        return this.f11014a;
    }
}
