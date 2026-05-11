package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class H2 extends W6.a {
    public static final Parcelable.Creator<H2> CREATOR = new C4699i3();

    /* renamed from: a, reason: collision with root package name */
    public int f42534a;

    /* renamed from: b, reason: collision with root package name */
    public int f42535b;

    /* renamed from: c, reason: collision with root package name */
    public int f42536c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42538e;

    /* renamed from: f, reason: collision with root package name */
    public float f42539f;

    public H2(int i10, int i11, int i12, boolean z10, boolean z11, float f10) {
        this.f42534a = i10;
        this.f42535b = i11;
        this.f42536c = i12;
        this.f42537d = z10;
        this.f42538e = z11;
        this.f42539f = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f42534a);
        W6.c.m(parcel, 3, this.f42535b);
        W6.c.m(parcel, 4, this.f42536c);
        W6.c.c(parcel, 5, this.f42537d);
        W6.c.c(parcel, 6, this.f42538e);
        W6.c.j(parcel, 7, this.f42539f);
        W6.c.b(parcel, a10);
    }
}
