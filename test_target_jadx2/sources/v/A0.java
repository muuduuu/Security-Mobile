package V;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1255s f10430a;

    /* renamed from: b, reason: collision with root package name */
    private final Z f10431b;

    public static final class a extends A0 {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC1256t f10432c;

        /* renamed from: d, reason: collision with root package name */
        private final int f10433d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f10434e;

        a(AbstractC1255s abstractC1255s, Z z10, AbstractC1256t abstractC1256t, int i10, Throwable th) {
            super(abstractC1255s, z10);
            this.f10432c = abstractC1256t;
            this.f10433d = i10;
            this.f10434e = th;
        }

        static String h(int i10) {
            switch (i10) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i10 + ")";
            }
        }

        public Throwable i() {
            return this.f10434e;
        }

        public int j() {
            return this.f10433d;
        }

        public AbstractC1256t k() {
            return this.f10432c;
        }

        public boolean l() {
            return this.f10433d != 0;
        }
    }

    public static final class b extends A0 {
        b(AbstractC1255s abstractC1255s, Z z10) {
            super(abstractC1255s, z10);
        }
    }

    public static final class c extends A0 {
        c(AbstractC1255s abstractC1255s, Z z10) {
            super(abstractC1255s, z10);
        }
    }

    public static final class d extends A0 {
        d(AbstractC1255s abstractC1255s, Z z10) {
            super(abstractC1255s, z10);
        }
    }

    public static final class e extends A0 {
        e(AbstractC1255s abstractC1255s, Z z10) {
            super(abstractC1255s, z10);
        }
    }

    A0(AbstractC1255s abstractC1255s, Z z10) {
        this.f10430a = (AbstractC1255s) y0.f.g(abstractC1255s);
        this.f10431b = (Z) y0.f.g(z10);
    }

    static a a(AbstractC1255s abstractC1255s, Z z10, AbstractC1256t abstractC1256t) {
        return new a(abstractC1255s, z10, abstractC1256t, 0, null);
    }

    static a b(AbstractC1255s abstractC1255s, Z z10, AbstractC1256t abstractC1256t, int i10, Throwable th) {
        y0.f.b(i10 != 0, "An error type is required.");
        return new a(abstractC1255s, z10, abstractC1256t, i10, th);
    }

    static b d(AbstractC1255s abstractC1255s, Z z10) {
        return new b(abstractC1255s, z10);
    }

    static c e(AbstractC1255s abstractC1255s, Z z10) {
        return new c(abstractC1255s, z10);
    }

    static d f(AbstractC1255s abstractC1255s, Z z10) {
        return new d(abstractC1255s, z10);
    }

    static e g(AbstractC1255s abstractC1255s, Z z10) {
        return new e(abstractC1255s, z10);
    }

    public AbstractC1255s c() {
        return this.f10430a;
    }
}
