package V6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class Z extends W6.a {
    public static final Parcelable.Creator<Z> CREATOR = new C1264a0();

    /* renamed from: a, reason: collision with root package name */
    final int f10884a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10885b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10886c;

    /* renamed from: d, reason: collision with root package name */
    private final Scope[] f10887d;

    Z(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f10884a = i10;
        this.f10885b = i11;
        this.f10886c = i12;
        this.f10887d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10884a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.m(parcel, 2, this.f10885b);
        W6.c.m(parcel, 3, this.f10886c);
        W6.c.x(parcel, 4, this.f10887d, i10, false);
        W6.c.b(parcel, a10);
    }
}
