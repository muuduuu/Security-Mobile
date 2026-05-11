package L0;

import L0.g;
import androidx.datastore.preferences.protobuf.AbstractC1540g;
import androidx.datastore.preferences.protobuf.AbstractC1555w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class h extends AbstractC1555w implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC1555w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(String str) {
            m();
            ((h) this.f16474b).l0(str);
            return this;
        }

        public a B(g.a aVar) {
            m();
            ((h) this.f16474b).m0((g) aVar.i());
            return this;
        }

        public a s(boolean z10) {
            m();
            ((h) this.f16474b).f0(z10);
            return this;
        }

        public a v(AbstractC1540g abstractC1540g) {
            m();
            ((h) this.f16474b).g0(abstractC1540g);
            return this;
        }

        public a w(double d10) {
            m();
            ((h) this.f16474b).h0(d10);
            return this;
        }

        public a x(float f10) {
            m();
            ((h) this.f16474b).i0(f10);
            return this;
        }

        public a y(int i10) {
            m();
            ((h) this.f16474b).j0(i10);
            return this;
        }

        public a z(long j10) {
            m();
            ((h) this.f16474b).k0(j10);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i10) {
            this.value = i10;
        }

        public static b forNumber(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1555w.H(h.class, hVar);
    }

    private h() {
    }

    public static h W() {
        return DEFAULT_INSTANCE;
    }

    public static a e0() {
        return (a) DEFAULT_INSTANCE.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(AbstractC1540g abstractC1540g) {
        abstractC1540g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC1540g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean U() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC1540g V() {
        return this.valueCase_ == 8 ? (AbstractC1540g) this.value_ : AbstractC1540g.f16347b;
    }

    public double X() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float Y() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long a0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String b0() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    public g c0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b d0() {
        return b.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1555w
    protected final Object o(AbstractC1555w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f5634a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1555w.D(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y10 = PARSER;
                if (y10 == null) {
                    synchronized (h.class) {
                        try {
                            y10 = PARSER;
                            if (y10 == null) {
                                y10 = new AbstractC1555w.b(DEFAULT_INSTANCE);
                                PARSER = y10;
                            }
                        } finally {
                        }
                    }
                }
                return y10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
