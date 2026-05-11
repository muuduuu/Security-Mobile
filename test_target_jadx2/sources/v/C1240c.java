package V;

import V.AbstractC1236a;
import android.util.Range;
import org.conscrypt.BuildConfig;

/* renamed from: V.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1240c extends AbstractC1236a {

    /* renamed from: d, reason: collision with root package name */
    private final Range f10598d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10599e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10600f;

    /* renamed from: g, reason: collision with root package name */
    private final Range f10601g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10602h;

    /* renamed from: V.c$b */
    static final class b extends AbstractC1236a.AbstractC0198a {

        /* renamed from: a, reason: collision with root package name */
        private Range f10603a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f10604b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f10605c;

        /* renamed from: d, reason: collision with root package name */
        private Range f10606d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f10607e;

        b() {
        }

        @Override // V.AbstractC1236a.AbstractC0198a
        public AbstractC1236a a() {
            Range range = this.f10603a;
            String str = BuildConfig.FLAVOR;
            if (range == null) {
                str = BuildConfig.FLAVOR + " bitrate";
            }
            if (this.f10604b == null) {
                str = str + " sourceFormat";
            }
            if (this.f10605c == null) {
                str = str + " source";
            }
            if (this.f10606d == null) {
                str = str + " sampleRate";
            }
            if (this.f10607e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1240c(this.f10603a, this.f10604b.intValue(), this.f10605c.intValue(), this.f10606d, this.f10607e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V.AbstractC1236a.AbstractC0198a
        public AbstractC1236a.AbstractC0198a b(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f10603a = range;
            return this;
        }

        @Override // V.AbstractC1236a.AbstractC0198a
        public AbstractC1236a.AbstractC0198a c(int i10) {
            this.f10607e = Integer.valueOf(i10);
            return this;
        }

        @Override // V.AbstractC1236a.AbstractC0198a
        public AbstractC1236a.AbstractC0198a d(Range range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f10606d = range;
            return this;
        }

        @Override // V.AbstractC1236a.AbstractC0198a
        public AbstractC1236a.AbstractC0198a e(int i10) {
            this.f10605c = Integer.valueOf(i10);
            return this;
        }

        public AbstractC1236a.AbstractC0198a f(int i10) {
            this.f10604b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // V.AbstractC1236a
    public Range b() {
        return this.f10598d;
    }

    @Override // V.AbstractC1236a
    public int c() {
        return this.f10602h;
    }

    @Override // V.AbstractC1236a
    public Range d() {
        return this.f10601g;
    }

    @Override // V.AbstractC1236a
    public int e() {
        return this.f10600f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1236a)) {
            return false;
        }
        AbstractC1236a abstractC1236a = (AbstractC1236a) obj;
        return this.f10598d.equals(abstractC1236a.b()) && this.f10599e == abstractC1236a.f() && this.f10600f == abstractC1236a.e() && this.f10601g.equals(abstractC1236a.d()) && this.f10602h == abstractC1236a.c();
    }

    @Override // V.AbstractC1236a
    public int f() {
        return this.f10599e;
    }

    public int hashCode() {
        return ((((((((this.f10598d.hashCode() ^ 1000003) * 1000003) ^ this.f10599e) * 1000003) ^ this.f10600f) * 1000003) ^ this.f10601g.hashCode()) * 1000003) ^ this.f10602h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f10598d + ", sourceFormat=" + this.f10599e + ", source=" + this.f10600f + ", sampleRate=" + this.f10601g + ", channelCount=" + this.f10602h + "}";
    }

    private C1240c(Range range, int i10, int i11, Range range2, int i12) {
        this.f10598d = range;
        this.f10599e = i10;
        this.f10600f = i11;
        this.f10601g = range2;
        this.f10602h = i12;
    }
}
