package B7;

import S6.o;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class b extends W6.a implements o {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f521a;

    /* renamed from: b, reason: collision with root package name */
    private int f522b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f523c;

    b(int i10, int i11, Intent intent) {
        this.f521a = i10;
        this.f522b = i11;
        this.f523c = intent;
    }

    @Override // S6.o
    public final Status c() {
        return this.f522b == 0 ? Status.f23339f : Status.f23343j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f521a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.m(parcel, 2, this.f522b);
        W6.c.s(parcel, 3, this.f523c, i10, false);
        W6.c.b(parcel, a10);
    }
}
