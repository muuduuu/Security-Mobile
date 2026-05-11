package R5;

import com.fasterxml.jackson.core.h;
import java.math.BigDecimal;
import java.util.Map;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public abstract class w {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8539a;

        static {
            int[] iArr = new int[InterfaceC4942i.c.values().length];
            f8539a = iArr;
            try {
                iArr[InterfaceC4942i.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static abstract class b extends G implements P5.i {

        /* renamed from: c, reason: collision with root package name */
        protected final h.b f8540c;

        /* renamed from: d, reason: collision with root package name */
        protected final String f8541d;

        /* renamed from: e, reason: collision with root package name */
        protected final boolean f8542e;

        protected b(Class cls, h.b bVar, String str) {
            super(cls, false);
            this.f8540c = bVar;
            this.f8541d = str;
            this.f8542e = bVar == h.b.INT || bVar == h.b.LONG || bVar == h.b.BIG_INTEGER;
        }

        @Override // P5.i
        public D5.o a(D5.B b10, D5.d dVar) {
            InterfaceC4942i.d p10 = p(b10, dVar, c());
            return (p10 == null || a.f8539a[p10.h().ordinal()] != 1) ? this : c() == BigDecimal.class ? v.v() : L.f8474c;
        }
    }

    public static class c extends b {
        public c(Class cls) {
            super(cls, h.b.DOUBLE, "number");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.z0(((Double) obj).doubleValue());
        }

        @Override // R5.G, D5.o
        public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
            Double d10 = (Double) obj;
            if (!y5.f.h(d10.doubleValue())) {
                fVar.z0(d10.doubleValue());
                return;
            }
            B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.VALUE_NUMBER_FLOAT));
            fVar.z0(d10.doubleValue());
            gVar.h(fVar, g10);
        }
    }

    public static class d extends b {

        /* renamed from: f, reason: collision with root package name */
        static final d f8543f = new d();

        public d() {
            super(Float.class, h.b.FLOAT, "number");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.A0(((Float) obj).floatValue());
        }
    }

    public static class e extends b {

        /* renamed from: f, reason: collision with root package name */
        static final e f8544f = new e();

        public e() {
            super(Number.class, h.b.INT, "integer");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.O0(((Number) obj).intValue());
        }
    }

    public static class f extends b {
        public f(Class cls) {
            super(cls, h.b.INT, "integer");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.O0(((Integer) obj).intValue());
        }

        @Override // R5.G, D5.o
        public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
            f(obj, fVar, b10);
        }
    }

    public static class g extends b {
        public g(Class cls) {
            super(cls, h.b.LONG, "number");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.Z0(((Long) obj).longValue());
        }
    }

    public static class h extends b {

        /* renamed from: f, reason: collision with root package name */
        static final h f8545f = new h();

        public h() {
            super(Short.class, h.b.INT, "number");
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.l1(((Short) obj).shortValue());
        }
    }

    public static void a(Map map) {
        map.put(Integer.class.getName(), new f(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new f(cls));
        map.put(Long.class.getName(), new g(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new g(cls2));
        String name = Byte.class.getName();
        e eVar = e.f8544f;
        map.put(name, eVar);
        map.put(Byte.TYPE.getName(), eVar);
        String name2 = Short.class.getName();
        h hVar = h.f8545f;
        map.put(name2, hVar);
        map.put(Short.TYPE.getName(), hVar);
        map.put(Double.class.getName(), new c(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new c(cls3));
        String name3 = Float.class.getName();
        d dVar = d.f8543f;
        map.put(name3, dVar);
        map.put(Float.TYPE.getName(), dVar);
    }
}
