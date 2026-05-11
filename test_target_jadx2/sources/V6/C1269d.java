package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: V6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1269d extends W6.a {
    public static final Parcelable.Creator<C1269d> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public final int f10924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10925b;

    public C1269d(int i10, String str) {
        this.f10924a = i10;
        this.f10925b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1269d)) {
            return false;
        }
        C1269d c1269d = (C1269d) obj;
        return c1269d.f10924a == this.f10924a && AbstractC1286q.a(c1269d.f10925b, this.f10925b);
    }

    public final int hashCode() {
        return this.f10924a;
    }

    public final String toString() {
        return this.f10924a + ":" + this.f10925b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10924a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.u(parcel, 2, this.f10925b, false);
        W6.c.b(parcel, a10);
    }
}
