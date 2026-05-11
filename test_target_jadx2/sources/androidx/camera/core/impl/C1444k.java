package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Z0;
import org.conscrypt.BuildConfig;

/* renamed from: androidx.camera.core.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1444k extends Z0 {

    /* renamed from: b, reason: collision with root package name */
    private final Size f14608b;

    /* renamed from: c, reason: collision with root package name */
    private final A.B f14609c;

    /* renamed from: d, reason: collision with root package name */
    private final Range f14610d;

    /* renamed from: e, reason: collision with root package name */
    private final V f14611e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14612f;

    /* renamed from: androidx.camera.core.impl.k$b */
    static final class b extends Z0.a {

        /* renamed from: a, reason: collision with root package name */
        private Size f14613a;

        /* renamed from: b, reason: collision with root package name */
        private A.B f14614b;

        /* renamed from: c, reason: collision with root package name */
        private Range f14615c;

        /* renamed from: d, reason: collision with root package name */
        private V f14616d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f14617e;

        @Override // androidx.camera.core.impl.Z0.a
        public Z0 a() {
            Size size = this.f14613a;
            String str = BuildConfig.FLAVOR;
            if (size == null) {
                str = BuildConfig.FLAVOR + " resolution";
            }
            if (this.f14614b == null) {
                str = str + " dynamicRange";
            }
            if (this.f14615c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f14617e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C1444k(this.f14613a, this.f14614b, this.f14615c, this.f14616d, this.f14617e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.Z0.a
        public Z0.a b(A.B b10) {
            if (b10 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f14614b = b10;
            return this;
        }

        @Override // androidx.camera.core.impl.Z0.a
        public Z0.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f14615c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.Z0.a
        public Z0.a d(V v10) {
            this.f14616d = v10;
            return this;
        }

        @Override // androidx.camera.core.impl.Z0.a
        public Z0.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f14613a = size;
            return this;
        }

        @Override // androidx.camera.core.impl.Z0.a
        public Z0.a f(boolean z10) {
            this.f14617e = Boolean.valueOf(z10);
            return this;
        }

        b() {
        }

        private b(Z0 z02) {
            this.f14613a = z02.e();
            this.f14614b = z02.b();
            this.f14615c = z02.c();
            this.f14616d = z02.d();
            this.f14617e = Boolean.valueOf(z02.f());
        }
    }

    @Override // androidx.camera.core.impl.Z0
    public A.B b() {
        return this.f14609c;
    }

    @Override // androidx.camera.core.impl.Z0
    public Range c() {
        return this.f14610d;
    }

    @Override // androidx.camera.core.impl.Z0
    public V d() {
        return this.f14611e;
    }

    @Override // androidx.camera.core.impl.Z0
    public Size e() {
        return this.f14608b;
    }

    public boolean equals(Object obj) {
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        return this.f14608b.equals(z02.e()) && this.f14609c.equals(z02.b()) && this.f14610d.equals(z02.c()) && ((v10 = this.f14611e) != null ? v10.equals(z02.d()) : z02.d() == null) && this.f14612f == z02.f();
    }

    @Override // androidx.camera.core.impl.Z0
    public boolean f() {
        return this.f14612f;
    }

    @Override // androidx.camera.core.impl.Z0
    public Z0.a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (((((this.f14608b.hashCode() ^ 1000003) * 1000003) ^ this.f14609c.hashCode()) * 1000003) ^ this.f14610d.hashCode()) * 1000003;
        V v10 = this.f14611e;
        return ((hashCode ^ (v10 == null ? 0 : v10.hashCode())) * 1000003) ^ (this.f14612f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f14608b + ", dynamicRange=" + this.f14609c + ", expectedFrameRateRange=" + this.f14610d + ", implementationOptions=" + this.f14611e + ", zslDisabled=" + this.f14612f + "}";
    }

    private C1444k(Size size, A.B b10, Range range, V v10, boolean z10) {
        this.f14608b = size;
        this.f14609c = b10;
        this.f14610d = range;
        this.f14611e = v10;
        this.f14612f = z10;
    }
}
