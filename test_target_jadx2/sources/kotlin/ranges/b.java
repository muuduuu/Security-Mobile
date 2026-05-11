package kotlin.ranges;

import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rc.AbstractC4299c;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public class b implements Iterable, InterfaceC5191a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f36423d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f36424a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36425b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36426c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(long j10, long j11, long j12) {
            return new b(j10, j11, j12);
        }

        private a() {
        }
    }

    public b(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36424a = j10;
        this.f36425b = AbstractC4299c.d(j10, j11, j12);
        this.f36426c = j12;
    }

    public final long c() {
        return this.f36424a;
    }

    public final long e() {
        return this.f36425b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.f36424a != bVar.f36424a || this.f36425b != bVar.f36425b || this.f36426c != bVar.f36426c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long h() {
        return this.f36426c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f36424a;
        long j12 = this.f36425b;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f36426c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f36426c;
        long j11 = this.f36424a;
        long j12 = this.f36425b;
        if (j10 > 0) {
            if (j11 <= j12) {
                return false;
            }
        } else if (j11 >= j12) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public E iterator() {
        return new Bc.b(this.f36424a, this.f36425b, this.f36426c);
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f36426c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f36424a);
            sb2.append("..");
            sb2.append(this.f36425b);
            sb2.append(" step ");
            j10 = this.f36426c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f36424a);
            sb2.append(" downTo ");
            sb2.append(this.f36425b);
            sb2.append(" step ");
            j10 = -this.f36426c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
