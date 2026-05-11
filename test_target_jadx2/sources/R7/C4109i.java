package r7;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4109i extends W6.a {
    public static final Parcelable.Creator<C4109i> CREATOR = new C4119j();

    /* renamed from: a, reason: collision with root package name */
    public int f40060a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40061b;

    public C4109i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4109i)) {
            return false;
        }
        C4109i c4109i = (C4109i) obj;
        return this.f40060a == c4109i.f40060a && AbstractC1286q.a(Boolean.valueOf(this.f40061b), Boolean.valueOf(c4109i.f40061b));
    }

    public final int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f40060a), Boolean.valueOf(this.f40061b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f40060a);
        W6.c.c(parcel, 3, this.f40061b);
        W6.c.b(parcel, a10);
    }

    public C4109i(int i10, boolean z10) {
        this.f40060a = i10;
        this.f40061b = z10;
    }
}
