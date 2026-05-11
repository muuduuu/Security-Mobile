package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e6 extends W6.a {
    public static final Parcelable.Creator<e6> CREATOR = new f6();

    /* renamed from: a, reason: collision with root package name */
    private final int f42908a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42909b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42910c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42911d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f42912e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42913f;

    public e6(int i10, int i11, int i12, int i13, boolean z10, float f10) {
        this.f42908a = i10;
        this.f42909b = i11;
        this.f42910c = i12;
        this.f42911d = i13;
        this.f42912e = z10;
        this.f42913f = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42908a);
        W6.c.m(parcel, 2, this.f42909b);
        W6.c.m(parcel, 3, this.f42910c);
        W6.c.m(parcel, 4, this.f42911d);
        W6.c.c(parcel, 5, this.f42912e);
        W6.c.j(parcel, 6, this.f42913f);
        W6.c.b(parcel, a10);
    }
}
