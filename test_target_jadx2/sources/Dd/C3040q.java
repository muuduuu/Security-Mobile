package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3040q extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: u, reason: collision with root package name */
    private static final C3040q f31747u;

    /* renamed from: v, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31748v = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31749c;

    /* renamed from: d, reason: collision with root package name */
    private int f31750d;

    /* renamed from: e, reason: collision with root package name */
    private List f31751e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31752f;

    /* renamed from: g, reason: collision with root package name */
    private int f31753g;

    /* renamed from: h, reason: collision with root package name */
    private C3040q f31754h;

    /* renamed from: i, reason: collision with root package name */
    private int f31755i;

    /* renamed from: j, reason: collision with root package name */
    private int f31756j;

    /* renamed from: k, reason: collision with root package name */
    private int f31757k;

    /* renamed from: l, reason: collision with root package name */
    private int f31758l;

    /* renamed from: m, reason: collision with root package name */
    private int f31759m;

    /* renamed from: n, reason: collision with root package name */
    private C3040q f31760n;

    /* renamed from: o, reason: collision with root package name */
    private int f31761o;

    /* renamed from: p, reason: collision with root package name */
    private C3040q f31762p;

    /* renamed from: q, reason: collision with root package name */
    private int f31763q;

    /* renamed from: r, reason: collision with root package name */
    private int f31764r;

    /* renamed from: s, reason: collision with root package name */
    private byte f31765s;

    /* renamed from: t, reason: collision with root package name */
    private int f31766t;

    /* renamed from: dd.q$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3040q b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3040q(eVar, gVar);
        }
    }

    static {
        C3040q c3040q = new C3040q(true);
        f31747u = c3040q;
        c3040q.t0();
    }

    public static C3040q U() {
        return f31747u;
    }

    private void t0() {
        this.f31751e = Collections.emptyList();
        this.f31752f = false;
        this.f31753g = 0;
        this.f31754h = U();
        this.f31755i = 0;
        this.f31756j = 0;
        this.f31757k = 0;
        this.f31758l = 0;
        this.f31759m = 0;
        this.f31760n = U();
        this.f31761o = 0;
        this.f31762p = U();
        this.f31763q = 0;
        this.f31764r = 0;
    }

    public static c u0() {
        return c.x();
    }

    public static c v0(C3040q c3040q) {
        return u0().k(c3040q);
    }

    public C3040q O() {
        return this.f31762p;
    }

    public int P() {
        return this.f31763q;
    }

    public b Q(int i10) {
        return (b) this.f31751e.get(i10);
    }

    public int R() {
        return this.f31751e.size();
    }

    public List S() {
        return this.f31751e;
    }

    public int T() {
        return this.f31756j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public C3040q getDefaultInstanceForType() {
        return f31747u;
    }

    public int W() {
        return this.f31764r;
    }

    public int X() {
        return this.f31753g;
    }

    public C3040q Y() {
        return this.f31754h;
    }

    public int Z() {
        return this.f31755i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31765s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < R(); i10++) {
            if (!Q(i10).a()) {
                this.f31765s = (byte) 0;
                return false;
            }
        }
        if (l0() && !Y().a()) {
            this.f31765s = (byte) 0;
            return false;
        }
        if (o0() && !b0().a()) {
            this.f31765s = (byte) 0;
            return false;
        }
        if (g0() && !O().a()) {
            this.f31765s = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31765s = (byte) 1;
            return true;
        }
        this.f31765s = (byte) 0;
        return false;
    }

    public boolean a0() {
        return this.f31752f;
    }

    public C3040q b0() {
        return this.f31760n;
    }

    public int c0() {
        return this.f31761o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31750d & 4096) == 4096) {
            fVar.Z(1, this.f31764r);
        }
        for (int i10 = 0; i10 < this.f31751e.size(); i10++) {
            fVar.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31751e.get(i10));
        }
        if ((this.f31750d & 1) == 1) {
            fVar.K(3, this.f31752f);
        }
        if ((this.f31750d & 2) == 2) {
            fVar.Z(4, this.f31753g);
        }
        if ((this.f31750d & 4) == 4) {
            fVar.c0(5, this.f31754h);
        }
        if ((this.f31750d & 16) == 16) {
            fVar.Z(6, this.f31756j);
        }
        if ((this.f31750d & 32) == 32) {
            fVar.Z(7, this.f31757k);
        }
        if ((this.f31750d & 8) == 8) {
            fVar.Z(8, this.f31755i);
        }
        if ((this.f31750d & 64) == 64) {
            fVar.Z(9, this.f31758l);
        }
        if ((this.f31750d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.c0(10, this.f31760n);
        }
        if ((this.f31750d & 512) == 512) {
            fVar.Z(11, this.f31761o);
        }
        if ((this.f31750d & 128) == 128) {
            fVar.Z(12, this.f31759m);
        }
        if ((this.f31750d & 1024) == 1024) {
            fVar.c0(13, this.f31762p);
        }
        if ((this.f31750d & 2048) == 2048) {
            fVar.Z(14, this.f31763q);
        }
        v10.a(200, fVar);
        fVar.h0(this.f31749c);
    }

    public int d0() {
        return this.f31759m;
    }

    public int e0() {
        return this.f31757k;
    }

    public int f0() {
        return this.f31758l;
    }

    public boolean g0() {
        return (this.f31750d & 1024) == 1024;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31766t;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31750d & 4096) == 4096 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31764r) : 0;
        for (int i11 = 0; i11 < this.f31751e.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31751e.get(i11));
        }
        if ((this.f31750d & 1) == 1) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.a(3, this.f31752f);
        }
        if ((this.f31750d & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(4, this.f31753g);
        }
        if ((this.f31750d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, this.f31754h);
        }
        if ((this.f31750d & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(6, this.f31756j);
        }
        if ((this.f31750d & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(7, this.f31757k);
        }
        if ((this.f31750d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(8, this.f31755i);
        }
        if ((this.f31750d & 64) == 64) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(9, this.f31758l);
        }
        if ((this.f31750d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(10, this.f31760n);
        }
        if ((this.f31750d & 512) == 512) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(11, this.f31761o);
        }
        if ((this.f31750d & 128) == 128) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(12, this.f31759m);
        }
        if ((this.f31750d & 1024) == 1024) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(13, this.f31762p);
        }
        if ((this.f31750d & 2048) == 2048) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(14, this.f31763q);
        }
        int q10 = o10 + q() + this.f31749c.size();
        this.f31766t = q10;
        return q10;
    }

    public boolean h0() {
        return (this.f31750d & 2048) == 2048;
    }

    public boolean i0() {
        return (this.f31750d & 16) == 16;
    }

    public boolean j0() {
        return (this.f31750d & 4096) == 4096;
    }

    public boolean k0() {
        return (this.f31750d & 2) == 2;
    }

    public boolean l0() {
        return (this.f31750d & 4) == 4;
    }

    public boolean m0() {
        return (this.f31750d & 8) == 8;
    }

    public boolean n0() {
        return (this.f31750d & 1) == 1;
    }

    public boolean o0() {
        return (this.f31750d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean p0() {
        return (this.f31750d & 512) == 512;
    }

    public boolean q0() {
        return (this.f31750d & 128) == 128;
    }

    public boolean r0() {
        return (this.f31750d & 32) == 32;
    }

    public boolean s0() {
        return (this.f31750d & 64) == 64;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return u0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public c b() {
        return v0(this);
    }

    /* renamed from: dd.q$b */
    public static final class b extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: i, reason: collision with root package name */
        private static final b f31767i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.r f31768j = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f31769b;

        /* renamed from: c, reason: collision with root package name */
        private int f31770c;

        /* renamed from: d, reason: collision with root package name */
        private c f31771d;

        /* renamed from: e, reason: collision with root package name */
        private C3040q f31772e;

        /* renamed from: f, reason: collision with root package name */
        private int f31773f;

        /* renamed from: g, reason: collision with root package name */
        private byte f31774g;

        /* renamed from: h, reason: collision with root package name */
        private int f31775h;

        /* renamed from: dd.q$b$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* renamed from: dd.q$b$c */
        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

            private static j.b internalValueMap = new a();
            private final int value;

            /* renamed from: dd.q$b$c$a */
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
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }
        }

        static {
            b bVar = new b(true);
            f31767i = bVar;
            bVar.A();
        }

        private void A() {
            this.f31771d = c.INV;
            this.f31772e = C3040q.U();
            this.f31773f = 0;
        }

        public static C0461b B() {
            return C0461b.q();
        }

        public static C0461b C(b bVar) {
            return B().k(bVar);
        }

        public static b t() {
            return f31767i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C0461b newBuilderForType() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C0461b b() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f31774g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!y() || v().a()) {
                this.f31774g = (byte) 1;
                return true;
            }
            this.f31774g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            getSerializedSize();
            if ((this.f31770c & 1) == 1) {
                fVar.R(1, this.f31771d.getNumber());
            }
            if ((this.f31770c & 2) == 2) {
                fVar.c0(2, this.f31772e);
            }
            if ((this.f31770c & 4) == 4) {
                fVar.Z(3, this.f31773f);
            }
            fVar.h0(this.f31769b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f31775h;
            if (i10 != -1) {
                return i10;
            }
            int h10 = (this.f31770c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.h(1, this.f31771d.getNumber()) : 0;
            if ((this.f31770c & 2) == 2) {
                h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, this.f31772e);
            }
            if ((this.f31770c & 4) == 4) {
                h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(3, this.f31773f);
            }
            int size = h10 + this.f31769b.size();
            this.f31775h = size;
            return size;
        }

        public c u() {
            return this.f31771d;
        }

        public C3040q v() {
            return this.f31772e;
        }

        public int w() {
            return this.f31773f;
        }

        public boolean x() {
            return (this.f31770c & 1) == 1;
        }

        public boolean y() {
            return (this.f31770c & 2) == 2;
        }

        public boolean z() {
            return (this.f31770c & 4) == 4;
        }

        private b(i.b bVar) {
            super(bVar);
            this.f31774g = (byte) -1;
            this.f31775h = -1;
            this.f31769b = bVar.i();
        }

        private b(boolean z10) {
            this.f31774g = (byte) -1;
            this.f31775h = -1;
            this.f31769b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            this.f31774g = (byte) -1;
            this.f31775h = -1;
            A();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int J10 = eVar.J();
                            if (J10 != 0) {
                                if (J10 == 8) {
                                    int m10 = eVar.m();
                                    c valueOf = c.valueOf(m10);
                                    if (valueOf == null) {
                                        I10.n0(J10);
                                        I10.n0(m10);
                                    } else {
                                        this.f31770c |= 1;
                                        this.f31771d = valueOf;
                                    }
                                } else if (J10 == 18) {
                                    c b10 = (this.f31770c & 2) == 2 ? this.f31772e.b() : null;
                                    C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                    this.f31772e = c3040q;
                                    if (b10 != null) {
                                        b10.k(c3040q);
                                        this.f31772e = b10.v();
                                    }
                                    this.f31770c |= 2;
                                } else if (J10 != 24) {
                                    if (!m(eVar, I10, gVar, J10)) {
                                    }
                                } else {
                                    this.f31770c |= 4;
                                    this.f31773f = eVar.r();
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e10.getMessage()).i(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31769b = A10.d();
                        throw th2;
                    }
                    this.f31769b = A10.d();
                    j();
                    throw th;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f31769b = A10.d();
                throw th3;
            }
            this.f31769b = A10.d();
            j();
        }

        /* renamed from: dd.q$b$b, reason: collision with other inner class name */
        public static final class C0461b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

            /* renamed from: b, reason: collision with root package name */
            private int f31776b;

            /* renamed from: c, reason: collision with root package name */
            private c f31777c = c.INV;

            /* renamed from: d, reason: collision with root package name */
            private C3040q f31778d = C3040q.U();

            /* renamed from: e, reason: collision with root package name */
            private int f31779e;

            private C0461b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0461b q() {
                return new C0461b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public b c() {
                b o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public b o() {
                b bVar = new b(this);
                int i10 = this.f31776b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f31771d = this.f31777c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f31772e = this.f31778d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f31773f = this.f31779e;
                bVar.f31770c = i11;
                return bVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0461b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C0461b k(b bVar) {
                if (bVar == b.t()) {
                    return this;
                }
                if (bVar.x()) {
                    y(bVar.u());
                }
                if (bVar.y()) {
                    x(bVar.v());
                }
                if (bVar.z()) {
                    z(bVar.w());
                }
                l(i().e(bVar.f31769b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0461b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f31768j.b(eVar, gVar);
                        if (bVar2 != null) {
                            k(bVar2);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                        b bVar3 = (b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                k(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                    }
                    throw th;
                }
            }

            public C0461b x(C3040q c3040q) {
                if ((this.f31776b & 2) != 2 || this.f31778d == C3040q.U()) {
                    this.f31778d = c3040q;
                } else {
                    this.f31778d = C3040q.v0(this.f31778d).k(c3040q).v();
                }
                this.f31776b |= 2;
                return this;
            }

            public C0461b y(c cVar) {
                cVar.getClass();
                this.f31776b |= 1;
                this.f31777c = cVar;
                return this;
            }

            public C0461b z(int i10) {
                this.f31776b |= 4;
                this.f31779e = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    private C3040q(i.c cVar) {
        super(cVar);
        this.f31765s = (byte) -1;
        this.f31766t = -1;
        this.f31749c = cVar.i();
    }

    private C3040q(boolean z10) {
        this.f31765s = (byte) -1;
        this.f31766t = -1;
        this.f31749c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3040q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        c b10;
        this.f31765s = (byte) -1;
        this.f31766t = -1;
        t0();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int J10 = eVar.J();
                        switch (J10) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f31750d |= 4096;
                                this.f31764r = eVar.r();
                            case 18:
                                if (!z11) {
                                    this.f31751e = new ArrayList();
                                    z11 = true;
                                }
                                this.f31751e.add(eVar.t(b.f31768j, gVar));
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                this.f31750d |= 1;
                                this.f31752f = eVar.j();
                            case 32:
                                this.f31750d |= 2;
                                this.f31753g = eVar.r();
                            case HVError.CONSENT_DENIED /* 42 */:
                                b10 = (this.f31750d & 4) == 4 ? this.f31754h.b() : null;
                                C3040q c3040q = (C3040q) eVar.t(f31748v, gVar);
                                this.f31754h = c3040q;
                                if (b10 != null) {
                                    b10.k(c3040q);
                                    this.f31754h = b10.v();
                                }
                                this.f31750d |= 4;
                            case 48:
                                this.f31750d |= 16;
                                this.f31756j = eVar.r();
                            case 56:
                                this.f31750d |= 32;
                                this.f31757k = eVar.r();
                            case 64:
                                this.f31750d |= 8;
                                this.f31755i = eVar.r();
                            case 72:
                                this.f31750d |= 64;
                                this.f31758l = eVar.r();
                            case 82:
                                b10 = (this.f31750d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f31760n.b() : null;
                                C3040q c3040q2 = (C3040q) eVar.t(f31748v, gVar);
                                this.f31760n = c3040q2;
                                if (b10 != null) {
                                    b10.k(c3040q2);
                                    this.f31760n = b10.v();
                                }
                                this.f31750d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            case 88:
                                this.f31750d |= 512;
                                this.f31761o = eVar.r();
                            case 96:
                                this.f31750d |= 128;
                                this.f31759m = eVar.r();
                            case 106:
                                b10 = (this.f31750d & 1024) == 1024 ? this.f31762p.b() : null;
                                C3040q c3040q3 = (C3040q) eVar.t(f31748v, gVar);
                                this.f31762p = c3040q3;
                                if (b10 != null) {
                                    b10.k(c3040q3);
                                    this.f31762p = b10.v();
                                }
                                this.f31750d |= 1024;
                            case 112:
                                this.f31750d |= 2048;
                                this.f31763q = eVar.r();
                            default:
                                if (!m(eVar, I10, gVar, J10)) {
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
                if (z11) {
                    this.f31751e = Collections.unmodifiableList(this.f31751e);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31749c = A10.d();
                    throw th2;
                }
                this.f31749c = A10.d();
                j();
                throw th;
            }
        }
        if (z11) {
            this.f31751e = Collections.unmodifiableList(this.f31751e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31749c = A10.d();
            throw th3;
        }
        this.f31749c = A10.d();
        j();
    }

    /* renamed from: dd.q$c */
    public static final class c extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31780d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31782f;

        /* renamed from: g, reason: collision with root package name */
        private int f31783g;

        /* renamed from: i, reason: collision with root package name */
        private int f31785i;

        /* renamed from: j, reason: collision with root package name */
        private int f31786j;

        /* renamed from: k, reason: collision with root package name */
        private int f31787k;

        /* renamed from: l, reason: collision with root package name */
        private int f31788l;

        /* renamed from: m, reason: collision with root package name */
        private int f31789m;

        /* renamed from: o, reason: collision with root package name */
        private int f31791o;

        /* renamed from: q, reason: collision with root package name */
        private int f31793q;

        /* renamed from: r, reason: collision with root package name */
        private int f31794r;

        /* renamed from: e, reason: collision with root package name */
        private List f31781e = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private C3040q f31784h = C3040q.U();

        /* renamed from: n, reason: collision with root package name */
        private C3040q f31790n = C3040q.U();

        /* renamed from: p, reason: collision with root package name */
        private C3040q f31792p = C3040q.U();

        private c() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c x() {
            return new c();
        }

        private void y() {
            if ((this.f31780d & 1) != 1) {
                this.f31781e = new ArrayList(this.f31781e);
                this.f31780d |= 1;
            }
        }

        public c A(C3040q c3040q) {
            if ((this.f31780d & 2048) != 2048 || this.f31792p == C3040q.U()) {
                this.f31792p = c3040q;
            } else {
                this.f31792p = C3040q.v0(this.f31792p).k(c3040q).v();
            }
            this.f31780d |= 2048;
            return this;
        }

        public c B(C3040q c3040q) {
            if ((this.f31780d & 8) != 8 || this.f31784h == C3040q.U()) {
                this.f31784h = c3040q;
            } else {
                this.f31784h = C3040q.v0(this.f31784h).k(c3040q).v();
            }
            this.f31780d |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c k(C3040q c3040q) {
            if (c3040q == C3040q.U()) {
                return this;
            }
            if (!c3040q.f31751e.isEmpty()) {
                if (this.f31781e.isEmpty()) {
                    this.f31781e = c3040q.f31751e;
                    this.f31780d &= -2;
                } else {
                    y();
                    this.f31781e.addAll(c3040q.f31751e);
                }
            }
            if (c3040q.n0()) {
                M(c3040q.a0());
            }
            if (c3040q.k0()) {
                K(c3040q.X());
            }
            if (c3040q.l0()) {
                B(c3040q.Y());
            }
            if (c3040q.m0()) {
                L(c3040q.Z());
            }
            if (c3040q.i0()) {
                H(c3040q.T());
            }
            if (c3040q.r0()) {
                P(c3040q.e0());
            }
            if (c3040q.s0()) {
                Q(c3040q.f0());
            }
            if (c3040q.q0()) {
                O(c3040q.d0());
            }
            if (c3040q.o0()) {
                E(c3040q.b0());
            }
            if (c3040q.p0()) {
                N(c3040q.c0());
            }
            if (c3040q.g0()) {
                A(c3040q.O());
            }
            if (c3040q.h0()) {
                G(c3040q.P());
            }
            if (c3040q.j0()) {
                J(c3040q.W());
            }
            p(c3040q);
            l(i().e(c3040q.f31749c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3040q c3040q = null;
            try {
                try {
                    C3040q c3040q2 = (C3040q) C3040q.f31748v.b(eVar, gVar);
                    if (c3040q2 != null) {
                        k(c3040q2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3040q c3040q3 = (C3040q) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3040q = c3040q3;
                        if (c3040q != null) {
                            k(c3040q);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3040q != null) {
                }
                throw th;
            }
        }

        public c E(C3040q c3040q) {
            if ((this.f31780d & 512) != 512 || this.f31790n == C3040q.U()) {
                this.f31790n = c3040q;
            } else {
                this.f31790n = C3040q.v0(this.f31790n).k(c3040q).v();
            }
            this.f31780d |= 512;
            return this;
        }

        public c G(int i10) {
            this.f31780d |= 4096;
            this.f31793q = i10;
            return this;
        }

        public c H(int i10) {
            this.f31780d |= 32;
            this.f31786j = i10;
            return this;
        }

        public c J(int i10) {
            this.f31780d |= 8192;
            this.f31794r = i10;
            return this;
        }

        public c K(int i10) {
            this.f31780d |= 4;
            this.f31783g = i10;
            return this;
        }

        public c L(int i10) {
            this.f31780d |= 16;
            this.f31785i = i10;
            return this;
        }

        public c M(boolean z10) {
            this.f31780d |= 2;
            this.f31782f = z10;
            return this;
        }

        public c N(int i10) {
            this.f31780d |= 1024;
            this.f31791o = i10;
            return this;
        }

        public c O(int i10) {
            this.f31780d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.f31789m = i10;
            return this;
        }

        public c P(int i10) {
            this.f31780d |= 64;
            this.f31787k = i10;
            return this;
        }

        public c Q(int i10) {
            this.f31780d |= 128;
            this.f31788l = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3040q c() {
            C3040q v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3040q v() {
            C3040q c3040q = new C3040q(this);
            int i10 = this.f31780d;
            if ((i10 & 1) == 1) {
                this.f31781e = Collections.unmodifiableList(this.f31781e);
                this.f31780d &= -2;
            }
            c3040q.f31751e = this.f31781e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            c3040q.f31752f = this.f31782f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3040q.f31753g = this.f31783g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3040q.f31754h = this.f31784h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3040q.f31755i = this.f31785i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3040q.f31756j = this.f31786j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3040q.f31757k = this.f31787k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3040q.f31758l = this.f31788l;
            if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                i11 |= 128;
            }
            c3040q.f31759m = this.f31789m;
            if ((i10 & 512) == 512) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            c3040q.f31760n = this.f31790n;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            c3040q.f31761o = this.f31791o;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            c3040q.f31762p = this.f31792p;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            c3040q.f31763q = this.f31793q;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            c3040q.f31764r = this.f31794r;
            c3040q.f31750d = i11;
            return c3040q;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return x().k(v());
        }

        private void z() {
        }
    }
}
