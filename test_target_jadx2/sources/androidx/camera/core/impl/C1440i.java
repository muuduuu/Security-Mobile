package androidx.camera.core.impl;

import androidx.camera.core.impl.V0;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1440i extends V0.f {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1429c0 f14593a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14594b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14595c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14596d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14597e;

    /* renamed from: f, reason: collision with root package name */
    private final A.B f14598f;

    /* renamed from: androidx.camera.core.impl.i$b */
    static final class b extends V0.f.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC1429c0 f14599a;

        /* renamed from: b, reason: collision with root package name */
        private List f14600b;

        /* renamed from: c, reason: collision with root package name */
        private String f14601c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f14602d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f14603e;

        /* renamed from: f, reason: collision with root package name */
        private A.B f14604f;

        b() {
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f a() {
            AbstractC1429c0 abstractC1429c0 = this.f14599a;
            String str = BuildConfig.FLAVOR;
            if (abstractC1429c0 == null) {
                str = BuildConfig.FLAVOR + " surface";
            }
            if (this.f14600b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f14602d == null) {
                str = str + " mirrorMode";
            }
            if (this.f14603e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f14604f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C1440i(this.f14599a, this.f14600b, this.f14601c, this.f14602d.intValue(), this.f14603e.intValue(), this.f14604f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f.a b(A.B b10) {
            if (b10 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f14604f = b10;
            return this;
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f.a c(int i10) {
            this.f14602d = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f.a d(String str) {
            this.f14601c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f.a e(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f14600b = list;
            return this;
        }

        @Override // androidx.camera.core.impl.V0.f.a
        public V0.f.a f(int i10) {
            this.f14603e = Integer.valueOf(i10);
            return this;
        }

        public V0.f.a g(AbstractC1429c0 abstractC1429c0) {
            if (abstractC1429c0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f14599a = abstractC1429c0;
            return this;
        }
    }

    @Override // androidx.camera.core.impl.V0.f
    public A.B b() {
        return this.f14598f;
    }

    @Override // androidx.camera.core.impl.V0.f
    public int c() {
        return this.f14596d;
    }

    @Override // androidx.camera.core.impl.V0.f
    public String d() {
        return this.f14595c;
    }

    @Override // androidx.camera.core.impl.V0.f
    public List e() {
        return this.f14594b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V0.f)) {
            return false;
        }
        V0.f fVar = (V0.f) obj;
        return this.f14593a.equals(fVar.f()) && this.f14594b.equals(fVar.e()) && ((str = this.f14595c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f14596d == fVar.c() && this.f14597e == fVar.g() && this.f14598f.equals(fVar.b());
    }

    @Override // androidx.camera.core.impl.V0.f
    public AbstractC1429c0 f() {
        return this.f14593a;
    }

    @Override // androidx.camera.core.impl.V0.f
    public int g() {
        return this.f14597e;
    }

    public int hashCode() {
        int hashCode = (((this.f14593a.hashCode() ^ 1000003) * 1000003) ^ this.f14594b.hashCode()) * 1000003;
        String str = this.f14595c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14596d) * 1000003) ^ this.f14597e) * 1000003) ^ this.f14598f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f14593a + ", sharedSurfaces=" + this.f14594b + ", physicalCameraId=" + this.f14595c + ", mirrorMode=" + this.f14596d + ", surfaceGroupId=" + this.f14597e + ", dynamicRange=" + this.f14598f + "}";
    }

    private C1440i(AbstractC1429c0 abstractC1429c0, List list, String str, int i10, int i11, A.B b10) {
        this.f14593a = abstractC1429c0;
        this.f14594b = list;
        this.f14595c = str;
        this.f14596d = i10;
        this.f14597e = i11;
        this.f14598f = b10;
    }
}
