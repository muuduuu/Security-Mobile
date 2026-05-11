package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: V6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1273f extends W6.a {
    public static final Parcelable.Creator<C1273f> CREATOR = new t0();

    /* renamed from: a, reason: collision with root package name */
    private final C1289u f10942a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10943b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10944c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f10945d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10946e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f10947f;

    public C1273f(C1289u c1289u, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f10942a = c1289u;
        this.f10943b = z10;
        this.f10944c = z11;
        this.f10945d = iArr;
        this.f10946e = i10;
        this.f10947f = iArr2;
    }

    public int[] F() {
        return this.f10947f;
    }

    public boolean I() {
        return this.f10943b;
    }

    public final C1289u Z0() {
        return this.f10942a;
    }

    public int j() {
        return this.f10946e;
    }

    public int[] u() {
        return this.f10945d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f10942a, i10, false);
        W6.c.c(parcel, 2, I());
        W6.c.c(parcel, 3, y0());
        W6.c.n(parcel, 4, u(), false);
        W6.c.m(parcel, 5, j());
        W6.c.n(parcel, 6, F(), false);
        W6.c.b(parcel, a10);
    }

    public boolean y0() {
        return this.f10944c;
    }
}
