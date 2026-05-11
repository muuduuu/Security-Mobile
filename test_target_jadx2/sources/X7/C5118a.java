package x7;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import p7.AbstractC3827m0;
import p7.C3807c0;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5118a extends W6.a {
    public static final Parcelable.Creator<C5118a> CREATOR = new C5117B();

    /* renamed from: a, reason: collision with root package name */
    private final long f44822a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44823b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44824c;

    /* renamed from: d, reason: collision with root package name */
    private final long f44825d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f44826e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44827f;

    /* renamed from: g, reason: collision with root package name */
    private final String f44828g;

    /* renamed from: h, reason: collision with root package name */
    private final WorkSource f44829h;

    /* renamed from: i, reason: collision with root package name */
    private final C3807c0 f44830i;

    /* renamed from: x7.a$a, reason: collision with other inner class name */
    public static final class C0654a {

        /* renamed from: a, reason: collision with root package name */
        private long f44831a = 60000;

        /* renamed from: b, reason: collision with root package name */
        private int f44832b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f44833c = 102;

        /* renamed from: d, reason: collision with root package name */
        private long f44834d = Long.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44835e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f44836f = 0;

        /* renamed from: g, reason: collision with root package name */
        private String f44837g = null;

        /* renamed from: h, reason: collision with root package name */
        private WorkSource f44838h = null;

        /* renamed from: i, reason: collision with root package name */
        private C3807c0 f44839i = null;

        public C5118a a() {
            return new C5118a(this.f44831a, this.f44832b, this.f44833c, this.f44834d, this.f44835e, this.f44836f, this.f44837g, new WorkSource(this.f44838h), this.f44839i);
        }

        public C0654a b(int i10) {
            G.a(i10);
            this.f44832b = i10;
            return this;
        }

        public C0654a c(long j10) {
            AbstractC1287s.b(j10 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f44831a = j10;
            return this;
        }

        public C0654a d(int i10) {
            y.a(i10);
            this.f44833c = i10;
            return this;
        }
    }

    C5118a(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, C3807c0 c3807c0) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        AbstractC1287s.a(z11);
        this.f44822a = j10;
        this.f44823b = i10;
        this.f44824c = i11;
        this.f44825d = j11;
        this.f44826e = z10;
        this.f44827f = i12;
        this.f44828g = str;
        this.f44829h = workSource;
        this.f44830i = c3807c0;
    }

    public long F() {
        return this.f44822a;
    }

    public int I() {
        return this.f44824c;
    }

    public final WorkSource Z0() {
        return this.f44829h;
    }

    public final String a1() {
        return this.f44828g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5118a)) {
            return false;
        }
        C5118a c5118a = (C5118a) obj;
        return this.f44822a == c5118a.f44822a && this.f44823b == c5118a.f44823b && this.f44824c == c5118a.f44824c && this.f44825d == c5118a.f44825d && this.f44826e == c5118a.f44826e && this.f44827f == c5118a.f44827f && AbstractC1286q.a(this.f44828g, c5118a.f44828g) && AbstractC1286q.a(this.f44829h, c5118a.f44829h) && AbstractC1286q.a(this.f44830i, c5118a.f44830i);
    }

    public final boolean g1() {
        return this.f44826e;
    }

    public int hashCode() {
        return AbstractC1286q.b(Long.valueOf(this.f44822a), Integer.valueOf(this.f44823b), Integer.valueOf(this.f44824c), Long.valueOf(this.f44825d));
    }

    public long j() {
        return this.f44825d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(y.b(this.f44824c));
        if (this.f44822a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            AbstractC3827m0.b(this.f44822a, sb2);
        }
        if (this.f44825d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f44825d);
            sb2.append("ms");
        }
        if (this.f44823b != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f44823b));
        }
        if (this.f44826e) {
            sb2.append(", bypass");
        }
        if (this.f44827f != 0) {
            sb2.append(", ");
            sb2.append(z.a(this.f44827f));
        }
        if (this.f44828g != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f44828g);
        }
        if (!com.google.android.gms.common.util.s.d(this.f44829h)) {
            sb2.append(", workSource=");
            sb2.append(this.f44829h);
        }
        if (this.f44830i != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f44830i);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public int u() {
        return this.f44823b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.q(parcel, 1, F());
        W6.c.m(parcel, 2, u());
        W6.c.m(parcel, 3, I());
        W6.c.q(parcel, 4, j());
        W6.c.c(parcel, 5, this.f44826e);
        W6.c.s(parcel, 6, this.f44829h, i10, false);
        W6.c.m(parcel, 7, this.f44827f);
        W6.c.u(parcel, 8, this.f44828g, false);
        W6.c.s(parcel, 9, this.f44830i, i10, false);
        W6.c.b(parcel, a10);
    }

    public final int y0() {
        return this.f44827f;
    }
}
