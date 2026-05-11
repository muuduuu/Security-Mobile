package dd;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* loaded from: classes3.dex */
public final class v extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: l, reason: collision with root package name */
    private static final v f31870l;

    /* renamed from: m, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31871m = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31872b;

    /* renamed from: c, reason: collision with root package name */
    private int f31873c;

    /* renamed from: d, reason: collision with root package name */
    private int f31874d;

    /* renamed from: e, reason: collision with root package name */
    private int f31875e;

    /* renamed from: f, reason: collision with root package name */
    private c f31876f;

    /* renamed from: g, reason: collision with root package name */
    private int f31877g;

    /* renamed from: h, reason: collision with root package name */
    private int f31878h;

    /* renamed from: i, reason: collision with root package name */
    private d f31879i;

    /* renamed from: j, reason: collision with root package name */
    private byte f31880j;

    /* renamed from: k, reason: collision with root package name */
    private int f31881k;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public v b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new v(eVar, gVar);
        }
    }

    public enum c implements j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        static class a implements j.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.valueOf(i10);
            }
        }

        c(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
        public final int getNumber() {
            return this.value;
        }

        public static c valueOf(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum d implements j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        static class a implements j.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.valueOf(i10);
            }
        }

        d(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
        public final int getNumber() {
            return this.value;
        }

        public static d valueOf(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    static {
        v vVar = new v(true);
        f31870l = vVar;
        vVar.J();
    }

    private void J() {
        this.f31874d = 0;
        this.f31875e = 0;
        this.f31876f = c.ERROR;
        this.f31877g = 0;
        this.f31878h = 0;
        this.f31879i = d.LANGUAGE_VERSION;
    }

    public static b K() {
        return b.q();
    }

    public static b L(v vVar) {
        return K().k(vVar);
    }

    public static v w() {
        return f31870l;
    }

    public int A() {
        return this.f31874d;
    }

    public int B() {
        return this.f31875e;
    }

    public d C() {
        return this.f31879i;
    }

    public boolean D() {
        return (this.f31873c & 8) == 8;
    }

    public boolean E() {
        return (this.f31873c & 4) == 4;
    }

    public boolean F() {
        return (this.f31873c & 16) == 16;
    }

    public boolean G() {
        return (this.f31873c & 1) == 1;
    }

    public boolean H() {
        return (this.f31873c & 2) == 2;
    }

    public boolean I() {
        return (this.f31873c & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b b() {
        return L(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31880j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f31880j = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        if ((this.f31873c & 1) == 1) {
            fVar.Z(1, this.f31874d);
        }
        if ((this.f31873c & 2) == 2) {
            fVar.Z(2, this.f31875e);
        }
        if ((this.f31873c & 4) == 4) {
            fVar.R(3, this.f31876f.getNumber());
        }
        if ((this.f31873c & 8) == 8) {
            fVar.Z(4, this.f31877g);
        }
        if ((this.f31873c & 16) == 16) {
            fVar.Z(5, this.f31878h);
        }
        if ((this.f31873c & 32) == 32) {
            fVar.R(6, this.f31879i.getNumber());
        }
        fVar.h0(this.f31872b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31881k;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31873c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31874d) : 0;
        if ((this.f31873c & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31875e);
        }
        if ((this.f31873c & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(3, this.f31876f.getNumber());
        }
        if ((this.f31873c & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(4, this.f31877g);
        }
        if ((this.f31873c & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(5, this.f31878h);
        }
        if ((this.f31873c & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(6, this.f31879i.getNumber());
        }
        int size = o10 + this.f31872b.size();
        this.f31881k = size;
        return size;
    }

    public int x() {
        return this.f31877g;
    }

    public c y() {
        return this.f31876f;
    }

    public int z() {
        return this.f31878h;
    }

    private v(i.b bVar) {
        super(bVar);
        this.f31880j = (byte) -1;
        this.f31881k = -1;
        this.f31872b = bVar.i();
    }

    private v(boolean z10) {
        this.f31880j = (byte) -1;
        this.f31881k = -1;
        this.f31872b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private v(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31880j = (byte) -1;
        this.f31881k = -1;
        J();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f31873c |= 1;
                            this.f31874d = eVar.r();
                        } else if (J10 == 16) {
                            this.f31873c |= 2;
                            this.f31875e = eVar.r();
                        } else if (J10 == 24) {
                            int m10 = eVar.m();
                            c valueOf = c.valueOf(m10);
                            if (valueOf == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f31873c |= 4;
                                this.f31876f = valueOf;
                            }
                        } else if (J10 == 32) {
                            this.f31873c |= 8;
                            this.f31877g = eVar.r();
                        } else if (J10 == 40) {
                            this.f31873c |= 16;
                            this.f31878h = eVar.r();
                        } else if (J10 != 48) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            int m11 = eVar.m();
                            d valueOf2 = d.valueOf(m11);
                            if (valueOf2 == null) {
                                I10.n0(J10);
                                I10.n0(m11);
                            } else {
                                this.f31873c |= 32;
                                this.f31879i = valueOf2;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31872b = A10.d();
                        throw th2;
                    }
                    this.f31872b = A10.d();
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
            this.f31872b = A10.d();
            throw th3;
        }
        this.f31872b = A10.d();
        j();
    }

    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31882b;

        /* renamed from: c, reason: collision with root package name */
        private int f31883c;

        /* renamed from: d, reason: collision with root package name */
        private int f31884d;

        /* renamed from: f, reason: collision with root package name */
        private int f31886f;

        /* renamed from: g, reason: collision with root package name */
        private int f31887g;

        /* renamed from: e, reason: collision with root package name */
        private c f31885e = c.ERROR;

        /* renamed from: h, reason: collision with root package name */
        private d f31888h = d.LANGUAGE_VERSION;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        public b A(int i10) {
            this.f31882b |= 1;
            this.f31883c = i10;
            return this;
        }

        public b B(int i10) {
            this.f31882b |= 2;
            this.f31884d = i10;
            return this;
        }

        public b C(d dVar) {
            dVar.getClass();
            this.f31882b |= 32;
            this.f31888h = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public v c() {
            v o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public v o() {
            v vVar = new v(this);
            int i10 = this.f31882b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f31874d = this.f31883c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f31875e = this.f31884d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f31876f = this.f31885e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f31877g = this.f31886f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f31878h = this.f31887g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f31879i = this.f31888h;
            vVar.f31873c = i11;
            return vVar;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k(v vVar) {
            if (vVar == v.w()) {
                return this;
            }
            if (vVar.G()) {
                A(vVar.A());
            }
            if (vVar.H()) {
                B(vVar.B());
            }
            if (vVar.E()) {
                y(vVar.y());
            }
            if (vVar.D()) {
                x(vVar.x());
            }
            if (vVar.F()) {
                z(vVar.z());
            }
            if (vVar.I()) {
                C(vVar.C());
            }
            l(i().e(vVar.f31872b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            v vVar = null;
            try {
                try {
                    v vVar2 = (v) v.f31871m.b(eVar, gVar);
                    if (vVar2 != null) {
                        k(vVar2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    v vVar3 = (v) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        vVar = vVar3;
                        if (vVar != null) {
                            k(vVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (vVar != null) {
                }
                throw th;
            }
        }

        public b x(int i10) {
            this.f31882b |= 8;
            this.f31886f = i10;
            return this;
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f31882b |= 4;
            this.f31885e = cVar;
            return this;
        }

        public b z(int i10) {
            this.f31882b |= 16;
            this.f31887g = i10;
            return this;
        }

        private void s() {
        }
    }
}
