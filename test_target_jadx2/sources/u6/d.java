package u6;

import java.util.Arrays;
import org.conscrypt.BuildConfig;
import s6.EnumC4319e;
import u6.o;

/* loaded from: classes2.dex */
final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f43540a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f43541b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4319e f43542c;

    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f43543a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f43544b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC4319e f43545c;

        b() {
        }

        @Override // u6.o.a
        public o a() {
            String str = this.f43543a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " backendName";
            }
            if (this.f43545c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.f43543a, this.f43544b, this.f43545c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // u6.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f43543a = str;
            return this;
        }

        @Override // u6.o.a
        public o.a c(byte[] bArr) {
            this.f43544b = bArr;
            return this;
        }

        @Override // u6.o.a
        public o.a d(EnumC4319e enumC4319e) {
            if (enumC4319e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f43545c = enumC4319e;
            return this;
        }
    }

    @Override // u6.o
    public String b() {
        return this.f43540a;
    }

    @Override // u6.o
    public byte[] c() {
        return this.f43541b;
    }

    @Override // u6.o
    public EnumC4319e d() {
        return this.f43542c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f43540a.equals(oVar.b())) {
            if (Arrays.equals(this.f43541b, oVar instanceof d ? ((d) oVar).f43541b : oVar.c()) && this.f43542c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f43540a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43541b)) * 1000003) ^ this.f43542c.hashCode();
    }

    private d(String str, byte[] bArr, EnumC4319e enumC4319e) {
        this.f43540a = str;
        this.f43541b = bArr;
        this.f43542c = enumC4319e;
    }
}
