package kotlin.ranges;

import kotlin.collections.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rc.AbstractC4299c;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public class a implements Iterable, InterfaceC5191a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0529a f36419d = new C0529a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f36420a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36422c;

    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0529a {
        public /* synthetic */ C0529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        private C0529a() {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f36420a = i10;
        this.f36421b = AbstractC4299c.c(i10, i11, i12);
        this.f36422c = i12;
    }

    public final int c() {
        return this.f36420a;
    }

    public final int e() {
        return this.f36421b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f36420a != aVar.f36420a || this.f36421b != aVar.f36421b || this.f36422c != aVar.f36422c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f36422c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36420a * 31) + this.f36421b) * 31) + this.f36422c;
    }

    public boolean isEmpty() {
        if (this.f36422c > 0) {
            if (this.f36420a <= this.f36421b) {
                return false;
            }
        } else if (this.f36420a >= this.f36421b) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public D iterator() {
        return new Bc.a(this.f36420a, this.f36421b, this.f36422c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f36422c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f36420a);
            sb2.append("..");
            sb2.append(this.f36421b);
            sb2.append(" step ");
            i10 = this.f36422c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f36420a);
            sb2.append(" downTo ");
            sb2.append(this.f36421b);
            sb2.append(" step ");
            i10 = -this.f36422c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
