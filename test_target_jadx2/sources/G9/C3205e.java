package g9;

import V6.AbstractC1286q;
import java.util.concurrent.Executor;
import t7.v6;
import t7.w6;

/* renamed from: g9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3205e {

    /* renamed from: a, reason: collision with root package name */
    private final int f33602a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33603b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33604c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33605d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33606e;

    /* renamed from: f, reason: collision with root package name */
    private final float f33607f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f33608g;

    /* renamed from: g9.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f33609a = 1;

        /* renamed from: b, reason: collision with root package name */
        private int f33610b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f33611c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f33612d = 1;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33613e = false;

        /* renamed from: f, reason: collision with root package name */
        private float f33614f = 0.1f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f33615g;

        public C3205e a() {
            return new C3205e(this.f33609a, this.f33610b, this.f33611c, this.f33612d, this.f33613e, this.f33614f, this.f33615g, null);
        }

        public a b(int i10) {
            this.f33611c = i10;
            return this;
        }

        public a c(int i10) {
            this.f33609a = i10;
            return this;
        }

        public a d(float f10) {
            this.f33614f = f10;
            return this;
        }

        public a e(int i10) {
            this.f33612d = i10;
            return this;
        }
    }

    /* synthetic */ C3205e(int i10, int i11, int i12, int i13, boolean z10, float f10, Executor executor, AbstractC3207g abstractC3207g) {
        this.f33602a = i10;
        this.f33603b = i11;
        this.f33604c = i12;
        this.f33605d = i13;
        this.f33606e = z10;
        this.f33607f = f10;
        this.f33608g = executor;
    }

    public final float a() {
        return this.f33607f;
    }

    public final int b() {
        return this.f33604c;
    }

    public final int c() {
        return this.f33603b;
    }

    public final int d() {
        return this.f33602a;
    }

    public final int e() {
        return this.f33605d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3205e)) {
            return false;
        }
        C3205e c3205e = (C3205e) obj;
        return Float.floatToIntBits(this.f33607f) == Float.floatToIntBits(c3205e.f33607f) && AbstractC1286q.a(Integer.valueOf(this.f33602a), Integer.valueOf(c3205e.f33602a)) && AbstractC1286q.a(Integer.valueOf(this.f33603b), Integer.valueOf(c3205e.f33603b)) && AbstractC1286q.a(Integer.valueOf(this.f33605d), Integer.valueOf(c3205e.f33605d)) && AbstractC1286q.a(Boolean.valueOf(this.f33606e), Boolean.valueOf(c3205e.f33606e)) && AbstractC1286q.a(Integer.valueOf(this.f33604c), Integer.valueOf(c3205e.f33604c)) && AbstractC1286q.a(this.f33608g, c3205e.f33608g);
    }

    public final Executor f() {
        return this.f33608g;
    }

    public final boolean g() {
        return this.f33606e;
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(Float.floatToIntBits(this.f33607f)), Integer.valueOf(this.f33602a), Integer.valueOf(this.f33603b), Integer.valueOf(this.f33605d), Boolean.valueOf(this.f33606e), Integer.valueOf(this.f33604c), this.f33608g);
    }

    public String toString() {
        v6 a10 = w6.a("FaceDetectorOptions");
        a10.b("landmarkMode", this.f33602a);
        a10.b("contourMode", this.f33603b);
        a10.b("classificationMode", this.f33604c);
        a10.b("performanceMode", this.f33605d);
        a10.d("trackingEnabled", this.f33606e);
        a10.a("minFaceSize", this.f33607f);
        return a10.toString();
    }
}
