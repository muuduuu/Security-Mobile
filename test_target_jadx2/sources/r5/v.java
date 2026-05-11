package R5;

import com.fasterxml.jackson.core.f;
import java.math.BigDecimal;
import java.math.BigInteger;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public class v extends G implements P5.i {

    /* renamed from: d, reason: collision with root package name */
    public static final v f8535d = new v(Number.class);

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f8536c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8537a;

        static {
            int[] iArr = new int[InterfaceC4942i.c.values().length];
            f8537a = iArr;
            try {
                iArr[InterfaceC4942i.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static final class b extends M {

        /* renamed from: c, reason: collision with root package name */
        static final b f8538c = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // R5.M, D5.o
        public boolean d(D5.B b10, Object obj) {
            return false;
        }

        @Override // R5.M, R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            String obj2;
            if (fVar.n(f.b.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!w(fVar, bigDecimal)) {
                    b10.e0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            fVar.h2(obj2);
        }

        @Override // R5.M
        public String v(Object obj) {
            throw new IllegalStateException();
        }

        protected boolean w(com.fasterxml.jackson.core.f fVar, BigDecimal bigDecimal) {
            int scale = bigDecimal.scale();
            return scale >= -9999 && scale <= 9999;
        }
    }

    public v(Class cls) {
        super(cls, false);
        this.f8536c = cls == BigInteger.class;
    }

    public static D5.o v() {
        return b.f8538c;
    }

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        return (p10 == null || a.f8537a[p10.h().ordinal()] != 1) ? this : c() == BigDecimal.class ? v() : L.f8474c;
    }

    @Override // R5.H, D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(Number number, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (number instanceof BigDecimal) {
            fVar.g1((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            fVar.i1((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            fVar.Z0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            fVar.z0(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            fVar.A0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            fVar.O0(number.intValue());
        } else {
            fVar.a1(number.toString());
        }
    }
}
