package b0;

import androidx.camera.core.impl.InterfaceC1441i0;
import b0.e;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f18454a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18455b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1441i0.a f18456c;

    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18457a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f18458b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1441i0.a f18459c;

        b() {
        }

        @Override // b0.e.a
        public e b() {
            String str = this.f18457a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f18458b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new h(this.f18457a, this.f18458b.intValue(), this.f18459c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // b0.e.a
        public e.a c(InterfaceC1441i0.a aVar) {
            this.f18459c = aVar;
            return this;
        }

        protected e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f18457a = str;
            return this;
        }

        @Override // b0.j.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.a a(int i10) {
            this.f18458b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // b0.j
    public String a() {
        return this.f18454a;
    }

    @Override // b0.j
    public int b() {
        return this.f18455b;
    }

    @Override // b0.e
    public InterfaceC1441i0.a d() {
        return this.f18456c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f18454a.equals(eVar.a()) && this.f18455b == eVar.b()) {
            InterfaceC1441i0.a aVar = this.f18456c;
            if (aVar == null) {
                if (eVar.d() == null) {
                    return true;
                }
            } else if (aVar.equals(eVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f18454a.hashCode() ^ 1000003) * 1000003) ^ this.f18455b) * 1000003;
        InterfaceC1441i0.a aVar = this.f18456c;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f18454a + ", profile=" + this.f18455b + ", compatibleAudioProfile=" + this.f18456c + "}";
    }

    private h(String str, int i10, InterfaceC1441i0.a aVar) {
        this.f18454a = str;
        this.f18455b = i10;
        this.f18456c = aVar;
    }
}
