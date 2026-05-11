package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class c6 extends W6.a {
    public static final Parcelable.Creator<c6> CREATOR = new d6();

    /* renamed from: a, reason: collision with root package name */
    private final int f42864a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42865b;

    public c6(int i10, List list) {
        this.f42864a = i10;
        this.f42865b = list;
    }

    public final int j() {
        return this.f42864a;
    }

    public final List u() {
        return this.f42865b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42864a);
        W6.c.y(parcel, 2, this.f42865b, false);
        W6.c.b(parcel, a10);
    }
}
