package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class q extends W6.a implements S6.o {
    public static final Parcelable.Creator<q> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    private final Status f44883a;

    /* renamed from: b, reason: collision with root package name */
    private final r f44884b;

    public q(Status status, r rVar) {
        this.f44883a = status;
        this.f44884b = rVar;
    }

    @Override // S6.o
    public Status c() {
        return this.f44883a;
    }

    public r j() {
        return this.f44884b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, c(), i10, false);
        W6.c.s(parcel, 2, j(), i10, false);
        W6.c.b(parcel, a10);
    }
}
