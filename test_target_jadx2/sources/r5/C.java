package R5;

import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    protected static final HashMap f8460a;

    public static class a extends AbstractC1128a {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8461e = S5.o.D().G(Boolean.class);

        public a() {
            super(boolean[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, boolean[] zArr) {
            return zArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(boolean[] zArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            int length = zArr.length;
            if (length == 1 && x(b10)) {
                z(zArr, fVar, b10);
                return;
            }
            fVar.O1(zArr, length);
            z(zArr, fVar, b10);
            fVar.K();
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(boolean[] zArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (boolean z10 : zArr) {
                fVar.I(z10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new a(this, dVar, bool);
        }

        protected a(a aVar, D5.d dVar, Boolean bool) {
            super(aVar, dVar, bool);
        }

        @Override // P5.h
        public P5.h v(M5.g gVar) {
            return this;
        }
    }

    public static class b extends H {
        public b() {
            super(char[].class);
        }

        private final void v(com.fasterxml.jackson.core.f fVar, char[] cArr) {
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fVar.i2(cArr, i10, 1);
            }
        }

        @Override // D5.o
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, char[] cArr) {
            return cArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void f(char[] cArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            if (!b10.Z(D5.A.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                fVar.i2(cArr, 0, cArr.length);
                return;
            }
            fVar.O1(cArr, cArr.length);
            v(fVar, cArr);
            fVar.K();
        }

        @Override // D5.o
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void g(char[] cArr, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
            B5.b g10;
            if (b10.Z(D5.A.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                g10 = gVar.g(fVar, gVar.d(cArr, com.fasterxml.jackson.core.k.START_ARRAY));
                v(fVar, cArr);
            } else {
                g10 = gVar.g(fVar, gVar.d(cArr, com.fasterxml.jackson.core.k.VALUE_STRING));
                fVar.i2(cArr, 0, cArr.length);
            }
            gVar.h(fVar, g10);
        }
    }

    public static class c extends AbstractC1128a {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8462e = S5.o.D().G(Double.TYPE);

        public c() {
            super(double[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, double[] dArr) {
            return dArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(double[] dArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            if (dArr.length == 1 && x(b10)) {
                z(dArr, fVar, b10);
            } else {
                fVar.t(dArr, 0, dArr.length);
            }
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(double[] dArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (double d10 : dArr) {
                fVar.z0(d10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new c(this, dVar, bool);
        }

        protected c(c cVar, D5.d dVar, Boolean bool) {
            super(cVar, dVar, bool);
        }

        @Override // P5.h
        public P5.h v(M5.g gVar) {
            return this;
        }
    }

    public static class d extends h {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8463e = S5.o.D().G(Float.TYPE);

        public d() {
            super(float[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, float[] fArr) {
            return fArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(float[] fArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            int length = fArr.length;
            if (length == 1 && x(b10)) {
                z(fArr, fVar, b10);
                return;
            }
            fVar.O1(fArr, length);
            z(fArr, fVar, b10);
            fVar.K();
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(float[] fArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (float f10 : fArr) {
                fVar.A0(f10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new d(this, dVar, bool);
        }

        public d(d dVar, D5.d dVar2, Boolean bool) {
            super(dVar, dVar2, bool);
        }
    }

    public static class e extends AbstractC1128a {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8464e = S5.o.D().G(Integer.TYPE);

        public e() {
            super(int[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, int[] iArr) {
            return iArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(int[] iArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            if (iArr.length == 1 && x(b10)) {
                z(iArr, fVar, b10);
            } else {
                fVar.u(iArr, 0, iArr.length);
            }
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(int[] iArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (int i10 : iArr) {
                fVar.O0(i10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new e(this, dVar, bool);
        }

        protected e(e eVar, D5.d dVar, Boolean bool) {
            super(eVar, dVar, bool);
        }

        @Override // P5.h
        public P5.h v(M5.g gVar) {
            return this;
        }
    }

    public static class f extends h {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8465e = S5.o.D().G(Long.TYPE);

        public f() {
            super(long[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, long[] jArr) {
            return jArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(long[] jArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            if (jArr.length == 1 && x(b10)) {
                z(jArr, fVar, b10);
            } else {
                fVar.x(jArr, 0, jArr.length);
            }
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(long[] jArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (long j10 : jArr) {
                fVar.Z0(j10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new f(this, dVar, bool);
        }

        public f(f fVar, D5.d dVar, Boolean bool) {
            super(fVar, dVar, bool);
        }
    }

    public static class g extends h {

        /* renamed from: e, reason: collision with root package name */
        private static final D5.j f8466e = S5.o.D().G(Short.TYPE);

        public g() {
            super(short[].class);
        }

        @Override // D5.o
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public boolean d(D5.B b10, short[] sArr) {
            return sArr.length == 0;
        }

        @Override // R5.H, D5.o
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final void f(short[] sArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            int length = sArr.length;
            if (length == 1 && x(b10)) {
                z(sArr, fVar, b10);
                return;
            }
            fVar.O1(sArr, length);
            z(sArr, fVar, b10);
            fVar.K();
        }

        @Override // R5.AbstractC1128a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void z(short[] sArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            for (short s10 : sArr) {
                fVar.O0(s10);
            }
        }

        @Override // R5.AbstractC1128a
        public D5.o y(D5.d dVar, Boolean bool) {
            return new g(this, dVar, bool);
        }

        public g(g gVar, D5.d dVar, Boolean bool) {
            super(gVar, dVar, bool);
        }
    }

    protected static abstract class h extends AbstractC1128a {
        protected h(Class cls) {
            super(cls);
        }

        protected h(h hVar, D5.d dVar, Boolean bool) {
            super(hVar, dVar, bool);
        }

        @Override // P5.h
        public final P5.h v(M5.g gVar) {
            return this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f8460a = hashMap;
        hashMap.put(boolean[].class.getName(), new a());
        hashMap.put(byte[].class.getName(), new C1133f());
        hashMap.put(char[].class.getName(), new b());
        hashMap.put(short[].class.getName(), new g());
        hashMap.put(int[].class.getName(), new e());
        hashMap.put(long[].class.getName(), new f());
        hashMap.put(float[].class.getName(), new d());
        hashMap.put(double[].class.getName(), new c());
    }

    public static D5.o a(Class cls) {
        return (D5.o) f8460a.get(cls.getName());
    }
}
