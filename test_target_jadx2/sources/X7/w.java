package x7;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w extends W6.a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    public final int f44891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44892b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44893c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44894d;

    w(int i10, int i11, long j10, long j11) {
        this.f44891a = i10;
        this.f44892b = i11;
        this.f44893c = j10;
        this.f44894d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f44891a == wVar.f44891a && this.f44892b == wVar.f44892b && this.f44893c == wVar.f44893c && this.f44894d == wVar.f44894d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f44892b), Integer.valueOf(this.f44891a), Long.valueOf(this.f44894d), Long.valueOf(this.f44893c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f44891a + " Cell status: " + this.f44892b + " elapsed time NS: " + this.f44894d + " system time ms: " + this.f44893c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f44891a);
        W6.c.m(parcel, 2, this.f44892b);
        W6.c.q(parcel, 3, this.f44893c);
        W6.c.q(parcel, 4, this.f44894d);
        W6.c.b(parcel, a10);
    }
}
