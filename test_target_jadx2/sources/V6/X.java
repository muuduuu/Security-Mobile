package V6;

import V6.InterfaceC1280k;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class X extends W6.a {
    public static final Parcelable.Creator<X> CREATOR = new Y();

    /* renamed from: a, reason: collision with root package name */
    final int f10879a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f10880b;

    /* renamed from: c, reason: collision with root package name */
    private final C2010b f10881c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10882d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10883e;

    X(int i10, IBinder iBinder, C2010b c2010b, boolean z10, boolean z11) {
        this.f10879a = i10;
        this.f10880b = iBinder;
        this.f10881c = c2010b;
        this.f10882d = z10;
        this.f10883e = z11;
    }

    public final boolean F() {
        return this.f10882d;
    }

    public final boolean I() {
        return this.f10883e;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return this.f10881c.equals(x10.f10881c) && AbstractC1286q.a(u(), x10.u());
    }

    public final C2010b j() {
        return this.f10881c;
    }

    public final InterfaceC1280k u() {
        IBinder iBinder = this.f10880b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1280k.a.k1(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f10879a);
        W6.c.l(parcel, 2, this.f10880b, false);
        W6.c.s(parcel, 3, this.f10881c, i10, false);
        W6.c.c(parcel, 4, this.f10882d);
        W6.c.c(parcel, 5, this.f10883e);
        W6.c.b(parcel, a10);
    }
}
