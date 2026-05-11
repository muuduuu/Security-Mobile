package b0;

import androidx.camera.core.impl.InterfaceC1441i0;
import b0.n;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
final class i extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f18460a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18461b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1441i0.c f18462c;

    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18463a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f18464b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1441i0.c f18465c;

        b() {
        }

        @Override // b0.n.a
        public n b() {
            String str = this.f18463a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f18464b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new i(this.f18463a, this.f18464b.intValue(), this.f18465c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // b0.n.a
        public n.a c(InterfaceC1441i0.c cVar) {
            this.f18465c = cVar;
            return this;
        }

        protected n.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f18463a = str;
            return this;
        }

        @Override // b0.j.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public n.a a(int i10) {
            this.f18464b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // b0.j
    public String a() {
        return this.f18460a;
    }

    @Override // b0.j
    public int b() {
        return this.f18461b;
    }

    @Override // b0.n
    public InterfaceC1441i0.c d() {
        return this.f18462c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f18460a.equals(nVar.a()) && this.f18461b == nVar.b()) {
            InterfaceC1441i0.c cVar = this.f18462c;
            if (cVar == null) {
                if (nVar.d() == null) {
                    return true;
                }
            } else if (cVar.equals(nVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f18460a.hashCode() ^ 1000003) * 1000003) ^ this.f18461b) * 1000003;
        InterfaceC1441i0.c cVar = this.f18462c;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f18460a + ", profile=" + this.f18461b + ", compatibleVideoProfile=" + this.f18462c + "}";
    }

    private i(String str, int i10, InterfaceC1441i0.c cVar) {
        this.f18460a = str;
        this.f18461b = i10;
        this.f18462c = cVar;
    }
}
