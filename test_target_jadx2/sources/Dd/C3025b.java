package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3025b extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: h, reason: collision with root package name */
    private static final C3025b f31436h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31437i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31438b;

    /* renamed from: c, reason: collision with root package name */
    private int f31439c;

    /* renamed from: d, reason: collision with root package name */
    private int f31440d;

    /* renamed from: e, reason: collision with root package name */
    private List f31441e;

    /* renamed from: f, reason: collision with root package name */
    private byte f31442f;

    /* renamed from: g, reason: collision with root package name */
    private int f31443g;

    /* renamed from: dd.b$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3025b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3025b(eVar, gVar);
        }
    }

    /* renamed from: dd.b$b, reason: collision with other inner class name */
    public static final class C0455b extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: h, reason: collision with root package name */
        private static final C0455b f31444h;

        /* renamed from: i, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.r f31445i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f31446b;

        /* renamed from: c, reason: collision with root package name */
        private int f31447c;

        /* renamed from: d, reason: collision with root package name */
        private int f31448d;

        /* renamed from: e, reason: collision with root package name */
        private c f31449e;

        /* renamed from: f, reason: collision with root package name */
        private byte f31450f;

        /* renamed from: g, reason: collision with root package name */
        private int f31451g;

        /* renamed from: dd.b$b$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C0455b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                return new C0455b(eVar, gVar);
            }
        }

        static {
            C0455b c0455b = new C0455b(true);
            f31444h = c0455b;
            c0455b.x();
        }

        public static C0455b s() {
            return f31444h;
        }

        private void x() {
            this.f31448d = 0;
            this.f31449e = c.I();
        }

        public static C0456b y() {
            return C0456b.q();
        }

        public static C0456b z(C0455b c0455b) {
            return y().k(c0455b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0456b newBuilderForType() {
            return y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C0456b b() {
            return z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f31450f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!v()) {
                this.f31450f = (byte) 0;
                return false;
            }
            if (!w()) {
                this.f31450f = (byte) 0;
                return false;
            }
            if (u().a()) {
                this.f31450f = (byte) 1;
                return true;
            }
            this.f31450f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            getSerializedSize();
            if ((this.f31447c & 1) == 1) {
                fVar.Z(1, this.f31448d);
            }
            if ((this.f31447c & 2) == 2) {
                fVar.c0(2, this.f31449e);
            }
            fVar.h0(this.f31446b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f31451g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f31447c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31448d) : 0;
            if ((this.f31447c & 2) == 2) {
                o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, this.f31449e);
            }
            int size = o10 + this.f31446b.size();
            this.f31451g = size;
            return size;
        }

        public int t() {
            return this.f31448d;
        }

        public c u() {
            return this.f31449e;
        }

        public boolean v() {
            return (this.f31447c & 1) == 1;
        }

        public boolean w() {
            return (this.f31447c & 2) == 2;
        }

        /* renamed from: dd.b$b$c */
        public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

            /* renamed from: q, reason: collision with root package name */
            private static final c f31455q;

            /* renamed from: r, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.r f31456r = new a();

            /* renamed from: b, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f31457b;

            /* renamed from: c, reason: collision with root package name */
            private int f31458c;

            /* renamed from: d, reason: collision with root package name */
            private EnumC0458c f31459d;

            /* renamed from: e, reason: collision with root package name */
            private long f31460e;

            /* renamed from: f, reason: collision with root package name */
            private float f31461f;

            /* renamed from: g, reason: collision with root package name */
            private double f31462g;

            /* renamed from: h, reason: collision with root package name */
            private int f31463h;

            /* renamed from: i, reason: collision with root package name */
            private int f31464i;

            /* renamed from: j, reason: collision with root package name */
            private int f31465j;

            /* renamed from: k, reason: collision with root package name */
            private C3025b f31466k;

            /* renamed from: l, reason: collision with root package name */
            private List f31467l;

            /* renamed from: m, reason: collision with root package name */
            private int f31468m;

            /* renamed from: n, reason: collision with root package name */
            private int f31469n;

            /* renamed from: o, reason: collision with root package name */
            private byte f31470o;

            /* renamed from: p, reason: collision with root package name */
            private int f31471p;

            /* renamed from: dd.b$b$c$a */
            static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: dd.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC0458c implements j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static j.b internalValueMap = new a();
                private final int value;

                /* renamed from: dd.b$b$c$c$a */
                static class a implements j.b {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0458c a(int i10) {
                        return EnumC0458c.valueOf(i10);
                    }
                }

                EnumC0458c(int i10, int i11) {
                    this.value = i11;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0458c valueOf(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            static {
                c cVar = new c(true);
                f31455q = cVar;
                cVar.a0();
            }

            public static c I() {
                return f31455q;
            }

            private void a0() {
                this.f31459d = EnumC0458c.BYTE;
                this.f31460e = 0L;
                this.f31461f = 0.0f;
                this.f31462g = 0.0d;
                this.f31463h = 0;
                this.f31464i = 0;
                this.f31465j = 0;
                this.f31466k = C3025b.w();
                this.f31467l = Collections.emptyList();
                this.f31468m = 0;
                this.f31469n = 0;
            }

            public static C0457b b0() {
                return C0457b.q();
            }

            public static C0457b c0(c cVar) {
                return b0().k(cVar);
            }

            public C3025b C() {
                return this.f31466k;
            }

            public int D() {
                return this.f31468m;
            }

            public c E(int i10) {
                return (c) this.f31467l.get(i10);
            }

            public int F() {
                return this.f31467l.size();
            }

            public List G() {
                return this.f31467l;
            }

            public int H() {
                return this.f31464i;
            }

            public double J() {
                return this.f31462g;
            }

            public int K() {
                return this.f31465j;
            }

            public int L() {
                return this.f31469n;
            }

            public float M() {
                return this.f31461f;
            }

            public long N() {
                return this.f31460e;
            }

            public int O() {
                return this.f31463h;
            }

            public EnumC0458c P() {
                return this.f31459d;
            }

            public boolean Q() {
                return (this.f31458c & 128) == 128;
            }

            public boolean R() {
                return (this.f31458c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
            }

            public boolean S() {
                return (this.f31458c & 32) == 32;
            }

            public boolean T() {
                return (this.f31458c & 8) == 8;
            }

            public boolean U() {
                return (this.f31458c & 64) == 64;
            }

            public boolean V() {
                return (this.f31458c & 512) == 512;
            }

            public boolean W() {
                return (this.f31458c & 4) == 4;
            }

            public boolean X() {
                return (this.f31458c & 2) == 2;
            }

            public boolean Y() {
                return (this.f31458c & 16) == 16;
            }

            public boolean Z() {
                return (this.f31458c & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final boolean a() {
                byte b10 = this.f31470o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (Q() && !C().a()) {
                    this.f31470o = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).a()) {
                        this.f31470o = (byte) 0;
                        return false;
                    }
                }
                this.f31470o = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                getSerializedSize();
                if ((this.f31458c & 1) == 1) {
                    fVar.R(1, this.f31459d.getNumber());
                }
                if ((this.f31458c & 2) == 2) {
                    fVar.s0(2, this.f31460e);
                }
                if ((this.f31458c & 4) == 4) {
                    fVar.V(3, this.f31461f);
                }
                if ((this.f31458c & 8) == 8) {
                    fVar.P(4, this.f31462g);
                }
                if ((this.f31458c & 16) == 16) {
                    fVar.Z(5, this.f31463h);
                }
                if ((this.f31458c & 32) == 32) {
                    fVar.Z(6, this.f31464i);
                }
                if ((this.f31458c & 64) == 64) {
                    fVar.Z(7, this.f31465j);
                }
                if ((this.f31458c & 128) == 128) {
                    fVar.c0(8, this.f31466k);
                }
                for (int i10 = 0; i10 < this.f31467l.size(); i10++) {
                    fVar.c0(9, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31467l.get(i10));
                }
                if ((this.f31458c & 512) == 512) {
                    fVar.Z(10, this.f31469n);
                }
                if ((this.f31458c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    fVar.Z(11, this.f31468m);
                }
                fVar.h0(this.f31457b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: d0, reason: merged with bridge method [inline-methods] */
            public C0457b newBuilderForType() {
                return b0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public C0457b b() {
                return c0(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public int getSerializedSize() {
                int i10 = this.f31471p;
                if (i10 != -1) {
                    return i10;
                }
                int h10 = (this.f31458c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.h(1, this.f31459d.getNumber()) : 0;
                if ((this.f31458c & 2) == 2) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.z(2, this.f31460e);
                }
                if ((this.f31458c & 4) == 4) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.l(3, this.f31461f);
                }
                if ((this.f31458c & 8) == 8) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.f(4, this.f31462g);
                }
                if ((this.f31458c & 16) == 16) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(5, this.f31463h);
                }
                if ((this.f31458c & 32) == 32) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(6, this.f31464i);
                }
                if ((this.f31458c & 64) == 64) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(7, this.f31465j);
                }
                if ((this.f31458c & 128) == 128) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(8, this.f31466k);
                }
                for (int i11 = 0; i11 < this.f31467l.size(); i11++) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(9, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31467l.get(i11));
                }
                if ((this.f31458c & 512) == 512) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(10, this.f31469n);
                }
                if ((this.f31458c & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(11, this.f31468m);
                }
                int size = h10 + this.f31457b.size();
                this.f31471p = size;
                return size;
            }

            private c(i.b bVar) {
                super(bVar);
                this.f31470o = (byte) -1;
                this.f31471p = -1;
                this.f31457b = bVar.i();
            }

            private c(boolean z10) {
                this.f31470o = (byte) -1;
                this.f31471p = -1;
                this.f31457b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                this.f31470o = (byte) -1;
                this.f31471p = -1;
                a0();
                d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
                kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? r52 = 256;
                    if (!z10) {
                        try {
                            try {
                                try {
                                    int J10 = eVar.J();
                                    switch (J10) {
                                        case 0:
                                            z10 = true;
                                        case 8:
                                            int m10 = eVar.m();
                                            EnumC0458c valueOf = EnumC0458c.valueOf(m10);
                                            if (valueOf == null) {
                                                I10.n0(J10);
                                                I10.n0(m10);
                                            } else {
                                                this.f31458c |= 1;
                                                this.f31459d = valueOf;
                                            }
                                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                            this.f31458c |= 2;
                                            this.f31460e = eVar.G();
                                        case 29:
                                            this.f31458c |= 4;
                                            this.f31461f = eVar.p();
                                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                                            this.f31458c |= 8;
                                            this.f31462g = eVar.l();
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                            this.f31458c |= 16;
                                            this.f31463h = eVar.r();
                                        case 48:
                                            this.f31458c |= 32;
                                            this.f31464i = eVar.r();
                                        case 56:
                                            this.f31458c |= 64;
                                            this.f31465j = eVar.r();
                                        case 66:
                                            c b10 = (this.f31458c & 128) == 128 ? this.f31466k.b() : null;
                                            C3025b c3025b = (C3025b) eVar.t(C3025b.f31437i, gVar);
                                            this.f31466k = c3025b;
                                            if (b10 != null) {
                                                b10.k(c3025b);
                                                this.f31466k = b10.o();
                                            }
                                            this.f31458c |= 128;
                                        case 74:
                                            if ((c10 & 256) != 256) {
                                                this.f31467l = new ArrayList();
                                                c10 = 256;
                                            }
                                            this.f31467l.add(eVar.t(f31456r, gVar));
                                        case 80:
                                            this.f31458c |= 512;
                                            this.f31469n = eVar.r();
                                        case 88:
                                            this.f31458c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                            this.f31468m = eVar.r();
                                        default:
                                            r52 = m(eVar, I10, gVar, J10);
                                            if (r52 == 0) {
                                                z10 = true;
                                            }
                                    }
                                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                                    throw e10.i(this);
                                }
                            } catch (IOException e11) {
                                throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                            }
                        } catch (Throwable th) {
                            if ((c10 & 256) == r52) {
                                this.f31467l = Collections.unmodifiableList(this.f31467l);
                            }
                            try {
                                I10.H();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f31457b = A10.d();
                                throw th2;
                            }
                            this.f31457b = A10.d();
                            j();
                            throw th;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f31467l = Collections.unmodifiableList(this.f31467l);
                        }
                        try {
                            I10.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f31457b = A10.d();
                            throw th3;
                        }
                        this.f31457b = A10.d();
                        j();
                        return;
                    }
                }
            }

            /* renamed from: dd.b$b$c$b, reason: collision with other inner class name */
            public static final class C0457b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

                /* renamed from: b, reason: collision with root package name */
                private int f31472b;

                /* renamed from: d, reason: collision with root package name */
                private long f31474d;

                /* renamed from: e, reason: collision with root package name */
                private float f31475e;

                /* renamed from: f, reason: collision with root package name */
                private double f31476f;

                /* renamed from: g, reason: collision with root package name */
                private int f31477g;

                /* renamed from: h, reason: collision with root package name */
                private int f31478h;

                /* renamed from: i, reason: collision with root package name */
                private int f31479i;

                /* renamed from: l, reason: collision with root package name */
                private int f31482l;

                /* renamed from: m, reason: collision with root package name */
                private int f31483m;

                /* renamed from: c, reason: collision with root package name */
                private EnumC0458c f31473c = EnumC0458c.BYTE;

                /* renamed from: j, reason: collision with root package name */
                private C3025b f31480j = C3025b.w();

                /* renamed from: k, reason: collision with root package name */
                private List f31481k = Collections.emptyList();

                private C0457b() {
                    v();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0457b q() {
                    return new C0457b();
                }

                private void s() {
                    if ((this.f31472b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                        this.f31481k = new ArrayList(this.f31481k);
                        this.f31472b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }

                public C0457b A(int i10) {
                    this.f31472b |= 32;
                    this.f31478h = i10;
                    return this;
                }

                public C0457b B(double d10) {
                    this.f31472b |= 8;
                    this.f31476f = d10;
                    return this;
                }

                public C0457b C(int i10) {
                    this.f31472b |= 64;
                    this.f31479i = i10;
                    return this;
                }

                public C0457b D(int i10) {
                    this.f31472b |= 1024;
                    this.f31483m = i10;
                    return this;
                }

                public C0457b E(float f10) {
                    this.f31472b |= 4;
                    this.f31475e = f10;
                    return this;
                }

                public C0457b G(long j10) {
                    this.f31472b |= 2;
                    this.f31474d = j10;
                    return this;
                }

                public C0457b H(int i10) {
                    this.f31472b |= 16;
                    this.f31477g = i10;
                    return this;
                }

                public C0457b J(EnumC0458c enumC0458c) {
                    enumC0458c.getClass();
                    this.f31472b |= 1;
                    this.f31473c = enumC0458c;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public c c() {
                    c o10 = o();
                    if (o10.a()) {
                        return o10;
                    }
                    throw a.AbstractC0531a.h(o10);
                }

                public c o() {
                    c cVar = new c(this);
                    int i10 = this.f31472b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f31459d = this.f31473c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f31460e = this.f31474d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f31461f = this.f31475e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f31462g = this.f31476f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f31463h = this.f31477g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f31464i = this.f31478h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f31465j = this.f31479i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f31466k = this.f31480j;
                    if ((this.f31472b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.f31481k = Collections.unmodifiableList(this.f31481k);
                        this.f31472b &= -257;
                    }
                    cVar.f31467l = this.f31481k;
                    if ((i10 & 512) == 512) {
                        i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    cVar.f31468m = this.f31482l;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f31469n = this.f31483m;
                    cVar.f31458c = i11;
                    return cVar;
                }

                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C0457b clone() {
                    return q().k(o());
                }

                public C0457b w(C3025b c3025b) {
                    if ((this.f31472b & 128) != 128 || this.f31480j == C3025b.w()) {
                        this.f31480j = c3025b;
                    } else {
                        this.f31480j = C3025b.B(this.f31480j).k(c3025b).o();
                    }
                    this.f31472b |= 128;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C0457b k(c cVar) {
                    if (cVar == c.I()) {
                        return this;
                    }
                    if (cVar.Z()) {
                        J(cVar.P());
                    }
                    if (cVar.X()) {
                        G(cVar.N());
                    }
                    if (cVar.W()) {
                        E(cVar.M());
                    }
                    if (cVar.T()) {
                        B(cVar.J());
                    }
                    if (cVar.Y()) {
                        H(cVar.O());
                    }
                    if (cVar.S()) {
                        A(cVar.H());
                    }
                    if (cVar.U()) {
                        C(cVar.K());
                    }
                    if (cVar.Q()) {
                        w(cVar.C());
                    }
                    if (!cVar.f31467l.isEmpty()) {
                        if (this.f31481k.isEmpty()) {
                            this.f31481k = cVar.f31467l;
                            this.f31472b &= -257;
                        } else {
                            s();
                            this.f31481k.addAll(cVar.f31467l);
                        }
                    }
                    if (cVar.R()) {
                        z(cVar.D());
                    }
                    if (cVar.V()) {
                        D(cVar.L());
                    }
                    l(i().e(cVar.f31457b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public C0457b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                    c cVar = null;
                    try {
                        try {
                            c cVar2 = (c) c.f31456r.b(eVar, gVar);
                            if (cVar2 != null) {
                                k(cVar2);
                            }
                            return this;
                        } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                            c cVar3 = (c) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th) {
                                th = th;
                                cVar = cVar3;
                                if (cVar != null) {
                                    k(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cVar != null) {
                        }
                        throw th;
                    }
                }

                public C0457b z(int i10) {
                    this.f31472b |= 512;
                    this.f31482l = i10;
                    return this;
                }

                private void v() {
                }
            }
        }

        private C0455b(i.b bVar) {
            super(bVar);
            this.f31450f = (byte) -1;
            this.f31451g = -1;
            this.f31446b = bVar.i();
        }

        private C0455b(boolean z10) {
            this.f31450f = (byte) -1;
            this.f31451g = -1;
            this.f31446b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private C0455b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            this.f31450f = (byte) -1;
            this.f31451g = -1;
            x();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 8) {
                                this.f31447c |= 1;
                                this.f31448d = eVar.r();
                            } else if (J10 != 18) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                c.C0457b b10 = (this.f31447c & 2) == 2 ? this.f31449e.b() : null;
                                c cVar = (c) eVar.t(c.f31456r, gVar);
                                this.f31449e = cVar;
                                if (b10 != null) {
                                    b10.k(cVar);
                                    this.f31449e = b10.o();
                                }
                                this.f31447c |= 2;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f31446b = A10.d();
                            throw th2;
                        }
                        this.f31446b = A10.d();
                        j();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f31446b = A10.d();
                throw th3;
            }
            this.f31446b = A10.d();
            j();
        }

        /* renamed from: dd.b$b$b, reason: collision with other inner class name */
        public static final class C0456b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

            /* renamed from: b, reason: collision with root package name */
            private int f31452b;

            /* renamed from: c, reason: collision with root package name */
            private int f31453c;

            /* renamed from: d, reason: collision with root package name */
            private c f31454d = c.I();

            private C0456b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0456b q() {
                return new C0456b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0455b c() {
                C0455b o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public C0455b o() {
                C0455b c0455b = new C0455b(this);
                int i10 = this.f31452b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0455b.f31448d = this.f31453c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0455b.f31449e = this.f31454d;
                c0455b.f31447c = i11;
                return c0455b;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0456b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C0456b k(C0455b c0455b) {
                if (c0455b == C0455b.s()) {
                    return this;
                }
                if (c0455b.v()) {
                    y(c0455b.t());
                }
                if (c0455b.w()) {
                    x(c0455b.u());
                }
                l(i().e(c0455b.f31446b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0456b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                C0455b c0455b = null;
                try {
                    try {
                        C0455b c0455b2 = (C0455b) C0455b.f31445i.b(eVar, gVar);
                        if (c0455b2 != null) {
                            k(c0455b2);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                        C0455b c0455b3 = (C0455b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            c0455b = c0455b3;
                            if (c0455b != null) {
                                k(c0455b);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c0455b != null) {
                    }
                    throw th;
                }
            }

            public C0456b x(c cVar) {
                if ((this.f31452b & 2) != 2 || this.f31454d == c.I()) {
                    this.f31454d = cVar;
                } else {
                    this.f31454d = c.c0(this.f31454d).k(cVar).o();
                }
                this.f31452b |= 2;
                return this;
            }

            public C0456b y(int i10) {
                this.f31452b |= 1;
                this.f31453c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    static {
        C3025b c3025b = new C3025b(true);
        f31436h = c3025b;
        c3025b.z();
    }

    public static c A() {
        return c.q();
    }

    public static c B(C3025b c3025b) {
        return A().k(c3025b);
    }

    public static C3025b w() {
        return f31436h;
    }

    private void z() {
        this.f31440d = 0;
        this.f31441e = Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c b() {
        return B(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31442f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!y()) {
            this.f31442f = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < u(); i10++) {
            if (!t(i10).a()) {
                this.f31442f = (byte) 0;
                return false;
            }
        }
        this.f31442f = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        if ((this.f31439c & 1) == 1) {
            fVar.Z(1, this.f31440d);
        }
        for (int i10 = 0; i10 < this.f31441e.size(); i10++) {
            fVar.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31441e.get(i10));
        }
        fVar.h0(this.f31438b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31443g;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31439c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31440d) : 0;
        for (int i11 = 0; i11 < this.f31441e.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31441e.get(i11));
        }
        int size = o10 + this.f31438b.size();
        this.f31443g = size;
        return size;
    }

    public C0455b t(int i10) {
        return (C0455b) this.f31441e.get(i10);
    }

    public int u() {
        return this.f31441e.size();
    }

    public List v() {
        return this.f31441e;
    }

    public int x() {
        return this.f31440d;
    }

    public boolean y() {
        return (this.f31439c & 1) == 1;
    }

    private C3025b(i.b bVar) {
        super(bVar);
        this.f31442f = (byte) -1;
        this.f31443g = -1;
        this.f31438b = bVar.i();
    }

    private C3025b(boolean z10) {
        this.f31442f = (byte) -1;
        this.f31443g = -1;
        this.f31438b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3025b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31442f = (byte) -1;
        this.f31443g = -1;
        z();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f31439c |= 1;
                            this.f31440d = eVar.r();
                        } else if (J10 != 18) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f31441e = new ArrayList();
                                c10 = 2;
                            }
                            this.f31441e.add(eVar.t(C0455b.f31445i, gVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f31441e = Collections.unmodifiableList(this.f31441e);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31438b = A10.d();
                        throw th2;
                    }
                    this.f31438b = A10.d();
                    j();
                    throw th;
                }
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
            }
        }
        if ((c10 & 2) == 2) {
            this.f31441e = Collections.unmodifiableList(this.f31441e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31438b = A10.d();
            throw th3;
        }
        this.f31438b = A10.d();
        j();
    }

    /* renamed from: dd.b$c */
    public static final class c extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31484b;

        /* renamed from: c, reason: collision with root package name */
        private int f31485c;

        /* renamed from: d, reason: collision with root package name */
        private List f31486d = Collections.emptyList();

        private c() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c q() {
            return new c();
        }

        private void s() {
            if ((this.f31484b & 2) != 2) {
                this.f31486d = new ArrayList(this.f31486d);
                this.f31484b |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3025b c() {
            C3025b o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3025b o() {
            C3025b c3025b = new C3025b(this);
            int i10 = (this.f31484b & 1) != 1 ? 0 : 1;
            c3025b.f31440d = this.f31485c;
            if ((this.f31484b & 2) == 2) {
                this.f31486d = Collections.unmodifiableList(this.f31486d);
                this.f31484b &= -3;
            }
            c3025b.f31441e = this.f31486d;
            c3025b.f31439c = i10;
            return c3025b;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public c k(C3025b c3025b) {
            if (c3025b == C3025b.w()) {
                return this;
            }
            if (c3025b.y()) {
                y(c3025b.x());
            }
            if (!c3025b.f31441e.isEmpty()) {
                if (this.f31486d.isEmpty()) {
                    this.f31486d = c3025b.f31441e;
                    this.f31484b &= -3;
                } else {
                    s();
                    this.f31486d.addAll(c3025b.f31441e);
                }
            }
            l(i().e(c3025b.f31438b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3025b c3025b = null;
            try {
                try {
                    C3025b c3025b2 = (C3025b) C3025b.f31437i.b(eVar, gVar);
                    if (c3025b2 != null) {
                        k(c3025b2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3025b c3025b3 = (C3025b) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3025b = c3025b3;
                        if (c3025b != null) {
                            k(c3025b);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3025b != null) {
                }
                throw th;
            }
        }

        public c y(int i10) {
            this.f31484b |= 1;
            this.f31485c = i10;
            return this;
        }

        private void v() {
        }
    }
}
