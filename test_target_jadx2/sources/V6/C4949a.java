package v6;

import java.util.Arrays;
import org.conscrypt.BuildConfig;
import v6.AbstractC4954f;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4949a extends AbstractC4954f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f43972a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f43973b;

    /* renamed from: v6.a$b */
    static final class b extends AbstractC4954f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f43974a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f43975b;

        b() {
        }

        @Override // v6.AbstractC4954f.a
        public AbstractC4954f a() {
            Iterable iterable = this.f43974a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = BuildConfig.FLAVOR + " events";
            }
            if (str.isEmpty()) {
                return new C4949a(this.f43974a, this.f43975b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v6.AbstractC4954f.a
        public AbstractC4954f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f43974a = iterable;
            return this;
        }

        @Override // v6.AbstractC4954f.a
        public AbstractC4954f.a c(byte[] bArr) {
            this.f43975b = bArr;
            return this;
        }
    }

    @Override // v6.AbstractC4954f
    public Iterable b() {
        return this.f43972a;
    }

    @Override // v6.AbstractC4954f
    public byte[] c() {
        return this.f43973b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4954f)) {
            return false;
        }
        AbstractC4954f abstractC4954f = (AbstractC4954f) obj;
        if (this.f43972a.equals(abstractC4954f.b())) {
            if (Arrays.equals(this.f43973b, abstractC4954f instanceof C4949a ? ((C4949a) abstractC4954f).f43973b : abstractC4954f.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f43972a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43973b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f43972a + ", extras=" + Arrays.toString(this.f43973b) + "}";
    }

    private C4949a(Iterable iterable, byte[] bArr) {
        this.f43972a = iterable;
        this.f43973b = bArr;
    }
}
