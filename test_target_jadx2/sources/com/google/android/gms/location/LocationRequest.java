package com.google.android.gms.location;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.s;
import p7.AbstractC3827m0;
import p7.C3807c0;
import x7.G;
import x7.y;
import x7.z;

/* loaded from: classes2.dex */
public final class LocationRequest extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private int f25241a;

    /* renamed from: b, reason: collision with root package name */
    private long f25242b;

    /* renamed from: c, reason: collision with root package name */
    private long f25243c;

    /* renamed from: d, reason: collision with root package name */
    private long f25244d;

    /* renamed from: e, reason: collision with root package name */
    private long f25245e;

    /* renamed from: f, reason: collision with root package name */
    private int f25246f;

    /* renamed from: g, reason: collision with root package name */
    private float f25247g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25248h;

    /* renamed from: i, reason: collision with root package name */
    private long f25249i;

    /* renamed from: j, reason: collision with root package name */
    private final int f25250j;

    /* renamed from: k, reason: collision with root package name */
    private final int f25251k;

    /* renamed from: l, reason: collision with root package name */
    private final String f25252l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25253m;

    /* renamed from: n, reason: collision with root package name */
    private final WorkSource f25254n;

    /* renamed from: o, reason: collision with root package name */
    private final C3807c0 f25255o;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static LocationRequest j() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String p2(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : AbstractC3827m0.a(j10);
    }

    public int F() {
        return this.f25250j;
    }

    public long I() {
        return this.f25242b;
    }

    public long Z0() {
        return this.f25244d;
    }

    public int a1() {
        return this.f25246f;
    }

    public LocationRequest e2(long j10) {
        AbstractC1287s.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f25243c = j10;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f25241a == locationRequest.f25241a && ((t1() || this.f25242b == locationRequest.f25242b) && this.f25243c == locationRequest.f25243c && o1() == locationRequest.o1() && ((!o1() || this.f25244d == locationRequest.f25244d) && this.f25245e == locationRequest.f25245e && this.f25246f == locationRequest.f25246f && this.f25247g == locationRequest.f25247g && this.f25248h == locationRequest.f25248h && this.f25250j == locationRequest.f25250j && this.f25251k == locationRequest.f25251k && this.f25253m == locationRequest.f25253m && this.f25254n.equals(locationRequest.f25254n) && AbstractC1286q.a(this.f25252l, locationRequest.f25252l) && AbstractC1286q.a(this.f25255o, locationRequest.f25255o)))) {
                return true;
            }
        }
        return false;
    }

    public LocationRequest f2(long j10) {
        AbstractC1287s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f25243c;
        long j12 = this.f25242b;
        if (j11 == j12 / 6) {
            this.f25243c = j10 / 6;
        }
        if (this.f25249i == j12) {
            this.f25249i = j10;
        }
        this.f25242b = j10;
        return this;
    }

    public float g1() {
        return this.f25247g;
    }

    public LocationRequest g2(long j10) {
        AbstractC1287s.c(j10 >= 0, "illegal max wait time: %d", Long.valueOf(j10));
        this.f25244d = j10;
        return this;
    }

    public LocationRequest h2(int i10) {
        if (i10 > 0) {
            this.f25246f = i10;
            return this;
        }
        throw new IllegalArgumentException("invalid numUpdates: " + i10);
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f25241a), Long.valueOf(this.f25242b), Long.valueOf(this.f25243c), this.f25254n);
    }

    public long i1() {
        return this.f25243c;
    }

    public LocationRequest i2(int i10) {
        y.a(i10);
        this.f25241a = i10;
        return this;
    }

    public LocationRequest j2(float f10) {
        if (f10 >= 0.0f) {
            this.f25247g = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    public final int k2() {
        return this.f25251k;
    }

    public final WorkSource l2() {
        return this.f25254n;
    }

    public int m1() {
        return this.f25241a;
    }

    public final C3807c0 m2() {
        return this.f25255o;
    }

    public final String n2() {
        return this.f25252l;
    }

    public boolean o1() {
        long j10 = this.f25244d;
        return j10 > 0 && (j10 >> 1) >= this.f25242b;
    }

    public final boolean o2() {
        return this.f25253m;
    }

    public boolean t1() {
        return this.f25241a == 105;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (t1()) {
            sb2.append(y.b(this.f25241a));
        } else {
            sb2.append("@");
            if (o1()) {
                AbstractC3827m0.b(this.f25242b, sb2);
                sb2.append("/");
                AbstractC3827m0.b(this.f25244d, sb2);
            } else {
                AbstractC3827m0.b(this.f25242b, sb2);
            }
            sb2.append(" ");
            sb2.append(y.b(this.f25241a));
        }
        if (t1() || this.f25243c != this.f25242b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(p2(this.f25243c));
        }
        if (this.f25247g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f25247g);
        }
        if (!t1() ? this.f25249i != this.f25242b : this.f25249i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(p2(this.f25249i));
        }
        if (this.f25245e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            AbstractC3827m0.b(this.f25245e, sb2);
        }
        if (this.f25246f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f25246f);
        }
        if (this.f25251k != 0) {
            sb2.append(", ");
            sb2.append(z.a(this.f25251k));
        }
        if (this.f25250j != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f25250j));
        }
        if (this.f25248h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f25253m) {
            sb2.append(", bypass");
        }
        if (this.f25252l != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f25252l);
        }
        if (!s.d(this.f25254n)) {
            sb2.append(", ");
            sb2.append(this.f25254n);
        }
        if (this.f25255o != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f25255o);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long u() {
        return this.f25245e;
    }

    public boolean v1() {
        return this.f25248h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, m1());
        W6.c.q(parcel, 2, I());
        W6.c.q(parcel, 3, i1());
        W6.c.m(parcel, 6, a1());
        W6.c.j(parcel, 7, g1());
        W6.c.q(parcel, 8, Z0());
        W6.c.c(parcel, 9, v1());
        W6.c.q(parcel, 10, u());
        W6.c.q(parcel, 11, y0());
        W6.c.m(parcel, 12, F());
        W6.c.m(parcel, 13, this.f25251k);
        W6.c.u(parcel, 14, this.f25252l, false);
        W6.c.c(parcel, 15, this.f25253m);
        W6.c.s(parcel, 16, this.f25254n, i10, false);
        W6.c.s(parcel, 17, this.f25255o, i10, false);
        W6.c.b(parcel, a10);
    }

    public long y0() {
        return this.f25249i;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f25256a;

        /* renamed from: b, reason: collision with root package name */
        private long f25257b;

        /* renamed from: c, reason: collision with root package name */
        private long f25258c;

        /* renamed from: d, reason: collision with root package name */
        private long f25259d;

        /* renamed from: e, reason: collision with root package name */
        private long f25260e;

        /* renamed from: f, reason: collision with root package name */
        private int f25261f;

        /* renamed from: g, reason: collision with root package name */
        private float f25262g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f25263h;

        /* renamed from: i, reason: collision with root package name */
        private long f25264i;

        /* renamed from: j, reason: collision with root package name */
        private int f25265j;

        /* renamed from: k, reason: collision with root package name */
        private int f25266k;

        /* renamed from: l, reason: collision with root package name */
        private String f25267l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f25268m;

        /* renamed from: n, reason: collision with root package name */
        private WorkSource f25269n;

        /* renamed from: o, reason: collision with root package name */
        private C3807c0 f25270o;

        public a(int i10, long j10) {
            AbstractC1287s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            y.a(i10);
            this.f25256a = i10;
            this.f25257b = j10;
            this.f25258c = -1L;
            this.f25259d = 0L;
            this.f25260e = Long.MAX_VALUE;
            this.f25261f = Integer.MAX_VALUE;
            this.f25262g = 0.0f;
            this.f25263h = true;
            this.f25264i = -1L;
            this.f25265j = 0;
            this.f25266k = 0;
            this.f25267l = null;
            this.f25268m = false;
            this.f25269n = null;
            this.f25270o = null;
        }

        public LocationRequest a() {
            int i10 = this.f25256a;
            long j10 = this.f25257b;
            long j11 = this.f25258c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f25259d, this.f25257b);
            long j12 = this.f25260e;
            int i11 = this.f25261f;
            float f10 = this.f25262g;
            boolean z10 = this.f25263h;
            long j13 = this.f25264i;
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j13 == -1 ? this.f25257b : j13, this.f25265j, this.f25266k, this.f25267l, this.f25268m, new WorkSource(this.f25269n), this.f25270o);
        }

        public a b(long j10) {
            AbstractC1287s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f25260e = j10;
            return this;
        }

        public a c(int i10) {
            G.a(i10);
            this.f25265j = i10;
            return this;
        }

        public a d(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC1287s.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f25264i = j10;
            return this;
        }

        public a e(long j10) {
            AbstractC1287s.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f25259d = j10;
            return this;
        }

        public a f(float f10) {
            AbstractC1287s.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f25262g = f10;
            return this;
        }

        public a g(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC1287s.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f25258c = j10;
            return this;
        }

        public a h(int i10) {
            y.a(i10);
            this.f25256a = i10;
            return this;
        }

        public a i(boolean z10) {
            this.f25263h = z10;
            return this;
        }

        public final a j(boolean z10) {
            this.f25268m = z10;
            return this;
        }

        public final a k(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f25267l = str;
            }
            return this;
        }

        public final a l(int i10) {
            int i11;
            boolean z10 = true;
            if (i10 != 0 && i10 != 1) {
                i11 = 2;
                if (i10 == 2) {
                    i10 = 2;
                    AbstractC1287s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                    this.f25266k = i11;
                    return this;
                }
                z10 = false;
            }
            i11 = i10;
            AbstractC1287s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f25266k = i11;
            return this;
        }

        public final a m(WorkSource workSource) {
            this.f25269n = workSource;
            return this;
        }

        public a(long j10) {
            AbstractC1287s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f25257b = j10;
            this.f25256a = 102;
            this.f25258c = -1L;
            this.f25259d = 0L;
            this.f25260e = Long.MAX_VALUE;
            this.f25261f = Integer.MAX_VALUE;
            this.f25262g = 0.0f;
            this.f25263h = true;
            this.f25264i = -1L;
            this.f25265j = 0;
            this.f25266k = 0;
            this.f25267l = null;
            this.f25268m = false;
            this.f25269n = null;
            this.f25270o = null;
        }

        public a(LocationRequest locationRequest) {
            this.f25256a = locationRequest.m1();
            this.f25257b = locationRequest.I();
            this.f25258c = locationRequest.i1();
            this.f25259d = locationRequest.Z0();
            this.f25260e = locationRequest.u();
            this.f25261f = locationRequest.a1();
            this.f25262g = locationRequest.g1();
            this.f25263h = locationRequest.v1();
            this.f25264i = locationRequest.y0();
            this.f25265j = locationRequest.F();
            this.f25266k = locationRequest.k2();
            this.f25267l = locationRequest.n2();
            this.f25268m = locationRequest.o2();
            this.f25269n = locationRequest.l2();
            this.f25270o = locationRequest.m2();
        }
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, C3807c0 c3807c0) {
        this.f25241a = i10;
        long j16 = j10;
        this.f25242b = j16;
        this.f25243c = j11;
        this.f25244d = j12;
        this.f25245e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f25246f = i11;
        this.f25247g = f10;
        this.f25248h = z10;
        this.f25249i = j15 != -1 ? j15 : j16;
        this.f25250j = i12;
        this.f25251k = i13;
        this.f25252l = str;
        this.f25253m = z11;
        this.f25254n = workSource;
        this.f25255o = c3807c0;
    }
}
