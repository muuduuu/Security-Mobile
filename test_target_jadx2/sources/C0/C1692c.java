package c0;

import androidx.camera.core.impl.e1;
import c0.AbstractC1690a;
import org.conscrypt.BuildConfig;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1692c extends AbstractC1690a {

    /* renamed from: a, reason: collision with root package name */
    private final String f19199a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19200b;

    /* renamed from: c, reason: collision with root package name */
    private final e1 f19201c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19202d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19203e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19204f;

    /* renamed from: c0.c$b */
    static final class b extends AbstractC1690a.AbstractC0342a {

        /* renamed from: a, reason: collision with root package name */
        private String f19205a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f19206b;

        /* renamed from: c, reason: collision with root package name */
        private e1 f19207c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f19208d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f19209e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f19210f;

        b() {
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        AbstractC1690a a() {
            String str = this.f19205a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f19206b == null) {
                str2 = str2 + " profile";
            }
            if (this.f19207c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f19208d == null) {
                str2 = str2 + " bitrate";
            }
            if (this.f19209e == null) {
                str2 = str2 + " sampleRate";
            }
            if (this.f19210f == null) {
                str2 = str2 + " channelCount";
            }
            if (str2.isEmpty()) {
                return new C1692c(this.f19205a, this.f19206b.intValue(), this.f19207c, this.f19208d.intValue(), this.f19209e.intValue(), this.f19210f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a c(int i10) {
            this.f19208d = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a d(int i10) {
            this.f19210f = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a e(e1 e1Var) {
            if (e1Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f19207c = e1Var;
            return this;
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f19205a = str;
            return this;
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a g(int i10) {
            this.f19206b = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1690a.AbstractC0342a
        public AbstractC1690a.AbstractC0342a h(int i10) {
            this.f19209e = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // c0.AbstractC1690a, c0.InterfaceC1703n
    public e1 b() {
        return this.f19201c;
    }

    @Override // c0.AbstractC1690a, c0.InterfaceC1703n
    public String c() {
        return this.f19199a;
    }

    @Override // c0.AbstractC1690a
    public int e() {
        return this.f19202d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1690a)) {
            return false;
        }
        AbstractC1690a abstractC1690a = (AbstractC1690a) obj;
        return this.f19199a.equals(abstractC1690a.c()) && this.f19200b == abstractC1690a.g() && this.f19201c.equals(abstractC1690a.b()) && this.f19202d == abstractC1690a.e() && this.f19203e == abstractC1690a.h() && this.f19204f == abstractC1690a.f();
    }

    @Override // c0.AbstractC1690a
    public int f() {
        return this.f19204f;
    }

    @Override // c0.AbstractC1690a
    public int g() {
        return this.f19200b;
    }

    @Override // c0.AbstractC1690a
    public int h() {
        return this.f19203e;
    }

    public int hashCode() {
        return ((((((((((this.f19199a.hashCode() ^ 1000003) * 1000003) ^ this.f19200b) * 1000003) ^ this.f19201c.hashCode()) * 1000003) ^ this.f19202d) * 1000003) ^ this.f19203e) * 1000003) ^ this.f19204f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f19199a + ", profile=" + this.f19200b + ", inputTimebase=" + this.f19201c + ", bitrate=" + this.f19202d + ", sampleRate=" + this.f19203e + ", channelCount=" + this.f19204f + "}";
    }

    private C1692c(String str, int i10, e1 e1Var, int i11, int i12, int i13) {
        this.f19199a = str;
        this.f19200b = i10;
        this.f19201c = e1Var;
        this.f19202d = i11;
        this.f19203e = i12;
        this.f19204f = i13;
    }
}
