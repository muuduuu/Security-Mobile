package dd;

import dd.C3040q;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes3.dex */
public final class u extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: m, reason: collision with root package name */
    private static final u f31851m;

    /* renamed from: n, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31852n = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31853c;

    /* renamed from: d, reason: collision with root package name */
    private int f31854d;

    /* renamed from: e, reason: collision with root package name */
    private int f31855e;

    /* renamed from: f, reason: collision with root package name */
    private int f31856f;

    /* renamed from: g, reason: collision with root package name */
    private C3040q f31857g;

    /* renamed from: h, reason: collision with root package name */
    private int f31858h;

    /* renamed from: i, reason: collision with root package name */
    private C3040q f31859i;

    /* renamed from: j, reason: collision with root package name */
    private int f31860j;

    /* renamed from: k, reason: collision with root package name */
    private byte f31861k;

    /* renamed from: l, reason: collision with root package name */
    private int f31862l;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public u b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new u(eVar, gVar);
        }
    }

    static {
        u uVar = new u(true);
        f31851m = uVar;
        uVar.T();
    }

    public static u F() {
        return f31851m;
    }

    private void T() {
        this.f31855e = 0;
        this.f31856f = 0;
        this.f31857g = C3040q.U();
        this.f31858h = 0;
        this.f31859i = C3040q.U();
        this.f31860j = 0;
    }

    public static b U() {
        return b.x();
    }

    public static b V(u uVar) {
        return U().k(uVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public u getDefaultInstanceForType() {
        return f31851m;
    }

    public int H() {
        return this.f31855e;
    }

    public int I() {
        return this.f31856f;
    }

    public C3040q J() {
        return this.f31857g;
    }

    public int K() {
        return this.f31858h;
    }

    public C3040q L() {
        return this.f31859i;
    }

    public int M() {
        return this.f31860j;
    }

    public boolean N() {
        return (this.f31854d & 1) == 1;
    }

    public boolean O() {
        return (this.f31854d & 2) == 2;
    }

    public boolean P() {
        return (this.f31854d & 4) == 4;
    }

    public boolean Q() {
        return (this.f31854d & 8) == 8;
    }

    public boolean R() {
        return (this.f31854d & 16) == 16;
    }

    public boolean S() {
        return (this.f31854d & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public b b() {
        return V(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31861k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!O()) {
            this.f31861k = (byte) 0;
            return false;
        }
        if (P() && !J().a()) {
            this.f31861k = (byte) 0;
            return false;
        }
        if (R() && !L().a()) {
            this.f31861k = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31861k = (byte) 1;
            return true;
        }
        this.f31861k = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31854d & 1) == 1) {
            fVar.Z(1, this.f31855e);
        }
        if ((this.f31854d & 2) == 2) {
            fVar.Z(2, this.f31856f);
        }
        if ((this.f31854d & 4) == 4) {
            fVar.c0(3, this.f31857g);
        }
        if ((this.f31854d & 16) == 16) {
            fVar.c0(4, this.f31859i);
        }
        if ((this.f31854d & 8) == 8) {
            fVar.Z(5, this.f31858h);
        }
        if ((this.f31854d & 32) == 32) {
            fVar.Z(6, this.f31860j);
        }
        v10.a(200, fVar);
        fVar.h0(this.f31853c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31862l;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31854d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31855e) : 0;
        if ((this.f31854d & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31856f);
        }
        if ((this.f31854d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, this.f31857g);
        }
        if ((this.f31854d & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, this.f31859i);
        }
        if ((this.f31854d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(5, this.f31858h);
        }
        if ((this.f31854d & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(6, this.f31860j);
        }
        int q10 = o10 + q() + this.f31853c.size();
        this.f31862l = q10;
        return q10;
    }

    private u(i.c cVar) {
        super(cVar);
        this.f31861k = (byte) -1;
        this.f31862l = -1;
        this.f31853c = cVar.i();
    }

    private u(boolean z10) {
        this.f31861k = (byte) -1;
        this.f31862l = -1;
        this.f31853c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private u(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        C3040q.c b10;
        this.f31861k = (byte) -1;
        this.f31862l = -1;
        T();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f31854d |= 1;
                            this.f31855e = eVar.r();
                        } else if (J10 != 16) {
                            if (J10 == 26) {
                                b10 = (this.f31854d & 4) == 4 ? this.f31857g.b() : null;
                                C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31857g = c3040q;
                                if (b10 != null) {
                                    b10.k(c3040q);
                                    this.f31857g = b10.v();
                                }
                                this.f31854d |= 4;
                            } else if (J10 == 34) {
                                b10 = (this.f31854d & 16) == 16 ? this.f31859i.b() : null;
                                C3040q c3040q2 = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31859i = c3040q2;
                                if (b10 != null) {
                                    b10.k(c3040q2);
                                    this.f31859i = b10.v();
                                }
                                this.f31854d |= 16;
                            } else if (J10 == 40) {
                                this.f31854d |= 8;
                                this.f31858h = eVar.r();
                            } else if (J10 != 48) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                this.f31854d |= 32;
                                this.f31860j = eVar.r();
                            }
                        } else {
                            this.f31854d |= 2;
                            this.f31856f = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31853c = A10.d();
                        throw th2;
                    }
                    this.f31853c = A10.d();
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
            this.f31853c = A10.d();
            throw th3;
        }
        this.f31853c = A10.d();
        j();
    }

    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31863d;

        /* renamed from: e, reason: collision with root package name */
        private int f31864e;

        /* renamed from: f, reason: collision with root package name */
        private int f31865f;

        /* renamed from: h, reason: collision with root package name */
        private int f31867h;

        /* renamed from: j, reason: collision with root package name */
        private int f31869j;

        /* renamed from: g, reason: collision with root package name */
        private C3040q f31866g = C3040q.U();

        /* renamed from: i, reason: collision with root package name */
        private C3040q f31868i = C3040q.U();

        private b() {
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            u uVar = null;
            try {
                try {
                    u uVar2 = (u) u.f31852n.b(eVar, gVar);
                    if (uVar2 != null) {
                        k(uVar2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    u uVar3 = (u) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        uVar = uVar3;
                        if (uVar != null) {
                            k(uVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (uVar != null) {
                }
                throw th;
            }
        }

        public b B(C3040q c3040q) {
            if ((this.f31863d & 4) != 4 || this.f31866g == C3040q.U()) {
                this.f31866g = c3040q;
            } else {
                this.f31866g = C3040q.v0(this.f31866g).k(c3040q).v();
            }
            this.f31863d |= 4;
            return this;
        }

        public b C(C3040q c3040q) {
            if ((this.f31863d & 16) != 16 || this.f31868i == C3040q.U()) {
                this.f31868i = c3040q;
            } else {
                this.f31868i = C3040q.v0(this.f31868i).k(c3040q).v();
            }
            this.f31863d |= 16;
            return this;
        }

        public b D(int i10) {
            this.f31863d |= 1;
            this.f31864e = i10;
            return this;
        }

        public b E(int i10) {
            this.f31863d |= 2;
            this.f31865f = i10;
            return this;
        }

        public b G(int i10) {
            this.f31863d |= 8;
            this.f31867h = i10;
            return this;
        }

        public b H(int i10) {
            this.f31863d |= 32;
            this.f31869j = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public u c() {
            u v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public u v() {
            u uVar = new u(this);
            int i10 = this.f31863d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            uVar.f31855e = this.f31864e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.f31856f = this.f31865f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.f31857g = this.f31866g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.f31858h = this.f31867h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.f31859i = this.f31868i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.f31860j = this.f31869j;
            uVar.f31854d = i11;
            return uVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public b k(u uVar) {
            if (uVar == u.F()) {
                return this;
            }
            if (uVar.N()) {
                D(uVar.H());
            }
            if (uVar.O()) {
                E(uVar.I());
            }
            if (uVar.P()) {
                B(uVar.J());
            }
            if (uVar.Q()) {
                G(uVar.K());
            }
            if (uVar.R()) {
                C(uVar.L());
            }
            if (uVar.S()) {
                H(uVar.M());
            }
            p(uVar);
            l(i().e(uVar.f31853c));
            return this;
        }

        private void y() {
        }
    }
}
