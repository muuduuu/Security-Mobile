package x7;

import V6.AbstractC1287s;
import p7.C3823k0;

/* renamed from: x7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5122e {

    /* renamed from: x7.e$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private double f44847e;

        /* renamed from: f, reason: collision with root package name */
        private double f44848f;

        /* renamed from: g, reason: collision with root package name */
        private float f44849g;

        /* renamed from: a, reason: collision with root package name */
        private String f44843a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f44844b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f44845c = Long.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        private short f44846d = -1;

        /* renamed from: h, reason: collision with root package name */
        private int f44850h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f44851i = -1;

        public InterfaceC5122e a() {
            if (this.f44843a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.f44844b;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.f44851i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f44845c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f44846d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f44850h >= 0) {
                return new C3823k0(this.f44843a, this.f44844b, (short) 1, this.f44847e, this.f44848f, this.f44849g, this.f44845c, this.f44850h, this.f44851i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public a b(double d10, double d11, float f10) {
            AbstractC1287s.b(d10 >= -90.0d && d10 <= 90.0d, "Invalid latitude: " + d10);
            AbstractC1287s.b(d11 >= -180.0d && d11 <= 180.0d, "Invalid longitude: " + d11);
            AbstractC1287s.b(f10 > 0.0f, "Invalid radius: " + f10);
            this.f44846d = (short) 1;
            this.f44847e = d10;
            this.f44848f = d11;
            this.f44849g = f10;
            return this;
        }

        public a c(long j10) {
            if (j10 < 0) {
                this.f44845c = -1L;
            } else {
                this.f44845c = com.google.android.gms.common.util.i.d().c() + j10;
            }
            return this;
        }

        public a d(String str) {
            this.f44843a = (String) AbstractC1287s.n(str, "Request ID can't be set to null");
            return this;
        }

        public a e(int i10) {
            this.f44844b = i10;
            return this;
        }
    }

    String e();
}
