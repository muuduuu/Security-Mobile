package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class C0 extends W6.a implements S6.o {

    /* renamed from: a, reason: collision with root package name */
    private final Status f38370a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0 f38369b = new C0(Status.f23339f);
    public static final Parcelable.Creator<C0> CREATOR = new D0();

    public C0(Status status) {
        this.f38370a = status;
    }

    @Override // S6.o
    public final Status c() {
        return this.f38370a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f38370a, i10, false);
        W6.c.b(parcel, a10);
    }
}
