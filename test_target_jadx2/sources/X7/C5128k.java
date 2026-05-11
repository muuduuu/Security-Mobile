package x7;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;
import p7.AbstractC3827m0;
import p7.C3807c0;

/* renamed from: x7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5128k extends W6.a {
    public static final Parcelable.Creator<C5128k> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    private final long f44863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44864b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44865c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44866d;

    /* renamed from: e, reason: collision with root package name */
    private final C3807c0 f44867e;

    /* renamed from: x7.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f44868a = Long.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        private int f44869b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f44870c = false;

        /* renamed from: d, reason: collision with root package name */
        private String f44871d = null;

        /* renamed from: e, reason: collision with root package name */
        private C3807c0 f44872e = null;

        public C5128k a() {
            return new C5128k(this.f44868a, this.f44869b, this.f44870c, this.f44871d, this.f44872e);
        }
    }

    C5128k(long j10, int i10, boolean z10, String str, C3807c0 c3807c0) {
        this.f44863a = j10;
        this.f44864b = i10;
        this.f44865c = z10;
        this.f44866d = str;
        this.f44867e = c3807c0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5128k)) {
            return false;
        }
        C5128k c5128k = (C5128k) obj;
        return this.f44863a == c5128k.f44863a && this.f44864b == c5128k.f44864b && this.f44865c == c5128k.f44865c && AbstractC1286q.a(this.f44866d, c5128k.f44866d) && AbstractC1286q.a(this.f44867e, c5128k.f44867e);
    }

    public int hashCode() {
        return AbstractC1286q.b(Long.valueOf(this.f44863a), Integer.valueOf(this.f44864b), Boolean.valueOf(this.f44865c));
    }

    public int j() {
        return this.f44864b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f44863a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            AbstractC3827m0.b(this.f44863a, sb2);
        }
        if (this.f44864b != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f44864b));
        }
        if (this.f44865c) {
            sb2.append(", bypass");
        }
        if (this.f44866d != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f44866d);
        }
        if (this.f44867e != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f44867e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long u() {
        return this.f44863a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.q(parcel, 1, u());
        W6.c.m(parcel, 2, j());
        W6.c.c(parcel, 3, this.f44865c);
        W6.c.u(parcel, 4, this.f44866d, false);
        W6.c.s(parcel, 5, this.f44867e, i10, false);
        W6.c.b(parcel, a10);
    }
}
