package v9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;

/* renamed from: v9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4977f {

    /* renamed from: a, reason: collision with root package name */
    private final a f44048a;

    /* renamed from: b, reason: collision with root package name */
    private final double f44049b;

    /* renamed from: c, reason: collision with root package name */
    private final double f44050c;

    /* renamed from: d, reason: collision with root package name */
    private final double f44051d;

    /* renamed from: e, reason: collision with root package name */
    private final double f44052e;

    /* renamed from: f, reason: collision with root package name */
    private final double f44053f;

    /* renamed from: g, reason: collision with root package name */
    private final double f44054g;

    /* renamed from: h, reason: collision with root package name */
    private final double f44055h;

    /* renamed from: i, reason: collision with root package name */
    private final double f44056i;

    /* renamed from: v9.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f44057a;

        /* renamed from: b, reason: collision with root package name */
        private final long f44058b;

        public a(long j10, long j11) {
            this.f44057a = j10;
            this.f44058b = j11;
        }

        public final a a(long j10, long j11) {
            return new a(j10, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44057a == aVar.f44057a && this.f44058b == aVar.f44058b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f44057a) * 31) + Long.hashCode(this.f44058b);
        }

        public String toString() {
            return "TimePair(start=" + this.f44057a + ", end=" + this.f44058b + ")";
        }

        public /* synthetic */ a(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11);
        }
    }

    public C4977f(a initSpan, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        Intrinsics.checkNotNullParameter(initSpan, "initSpan");
        this.f44048a = initSpan;
        this.f44049b = d10;
        this.f44050c = d11;
        this.f44051d = d12;
        this.f44052e = d13;
        this.f44053f = d14;
        this.f44054g = d15;
        this.f44055h = d16;
        this.f44056i = d17;
    }

    public final C4977f a(a initSpan, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        Intrinsics.checkNotNullParameter(initSpan, "initSpan");
        return new C4977f(initSpan, d10, d11, d12, d13, d14, d15, d16, d17);
    }

    public final double c() {
        return this.f44056i;
    }

    public final double d() {
        return this.f44054g;
    }

    public final a e() {
        return this.f44048a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4977f)) {
            return false;
        }
        C4977f c4977f = (C4977f) obj;
        return Intrinsics.b(this.f44048a, c4977f.f44048a) && Double.compare(this.f44049b, c4977f.f44049b) == 0 && Double.compare(this.f44050c, c4977f.f44050c) == 0 && Double.compare(this.f44051d, c4977f.f44051d) == 0 && Double.compare(this.f44052e, c4977f.f44052e) == 0 && Double.compare(this.f44053f, c4977f.f44053f) == 0 && Double.compare(this.f44054g, c4977f.f44054g) == 0 && Double.compare(this.f44055h, c4977f.f44055h) == 0 && Double.compare(this.f44056i, c4977f.f44056i) == 0;
    }

    public final double f() {
        return this.f44049b;
    }

    public int hashCode() {
        return (((((((((((((((this.f44048a.hashCode() * 31) + Double.hashCode(this.f44049b)) * 31) + Double.hashCode(this.f44050c)) * 31) + Double.hashCode(this.f44051d)) * 31) + Double.hashCode(this.f44052e)) * 31) + Double.hashCode(this.f44053f)) * 31) + Double.hashCode(this.f44054g)) * 31) + Double.hashCode(this.f44055h)) * 31) + Double.hashCode(this.f44056i);
    }

    public String toString() {
        return "GobblerTrace(initSpan=" + this.f44048a + ", initTime=" + this.f44049b + ", gobblerDbTime=" + this.f44050c + ", eventDaoTime=" + this.f44051d + ", logDaoTime=" + this.f44052e + ", gobblerSharedPrefsTime=" + this.f44053f + ", gobblerConfigTime=" + this.f44054g + ", httpServiceTime=" + this.f44055h + ", eventProcessorTime=" + this.f44056i + ")";
    }

    public /* synthetic */ C4977f(a aVar, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new a(0L, 0L, 3, null) : aVar, (i10 & 2) != 0 ? -1.0d : d10, (i10 & 4) != 0 ? -1.0d : d11, (i10 & 8) != 0 ? -1.0d : d12, (i10 & 16) != 0 ? -1.0d : d13, (i10 & 32) != 0 ? -1.0d : d14, (i10 & 64) != 0 ? -1.0d : d15, (i10 & 128) != 0 ? -1.0d : d16, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? d17 : -1.0d);
    }
}
