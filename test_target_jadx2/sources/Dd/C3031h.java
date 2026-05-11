package dd;

import dd.C3040q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3031h extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: m, reason: collision with root package name */
    private static final C3031h f31593m;

    /* renamed from: n, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31594n = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31595b;

    /* renamed from: c, reason: collision with root package name */
    private int f31596c;

    /* renamed from: d, reason: collision with root package name */
    private int f31597d;

    /* renamed from: e, reason: collision with root package name */
    private int f31598e;

    /* renamed from: f, reason: collision with root package name */
    private c f31599f;

    /* renamed from: g, reason: collision with root package name */
    private C3040q f31600g;

    /* renamed from: h, reason: collision with root package name */
    private int f31601h;

    /* renamed from: i, reason: collision with root package name */
    private List f31602i;

    /* renamed from: j, reason: collision with root package name */
    private List f31603j;

    /* renamed from: k, reason: collision with root package name */
    private byte f31604k;

    /* renamed from: l, reason: collision with root package name */
    private int f31605l;

    /* renamed from: dd.h$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3031h b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3031h(eVar, gVar);
        }
    }

    /* renamed from: dd.h$c */
    public enum c implements j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* renamed from: dd.h$c$a */
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
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }
    }

    static {
        C3031h c3031h = new C3031h(true);
        f31593m = c3031h;
        c3031h.O();
    }

    public static C3031h C() {
        return f31593m;
    }

    private void O() {
        this.f31597d = 0;
        this.f31598e = 0;
        this.f31599f = c.TRUE;
        this.f31600g = C3040q.U();
        this.f31601h = 0;
        this.f31602i = Collections.emptyList();
        this.f31603j = Collections.emptyList();
    }

    public static b P() {
        return b.q();
    }

    public static b Q(C3031h c3031h) {
        return P().k(c3031h);
    }

    public int A() {
        return this.f31602i.size();
    }

    public c B() {
        return this.f31599f;
    }

    public int D() {
        return this.f31597d;
    }

    public C3040q E() {
        return this.f31600g;
    }

    public int F() {
        return this.f31601h;
    }

    public C3031h G(int i10) {
        return (C3031h) this.f31603j.get(i10);
    }

    public int H() {
        return this.f31603j.size();
    }

    public int I() {
        return this.f31598e;
    }

    public boolean J() {
        return (this.f31596c & 4) == 4;
    }

    public boolean K() {
        return (this.f31596c & 1) == 1;
    }

    public boolean L() {
        return (this.f31596c & 8) == 8;
    }

    public boolean M() {
        return (this.f31596c & 16) == 16;
    }

    public boolean N() {
        return (this.f31596c & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b b() {
        return Q(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31604k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (L() && !E().a()) {
            this.f31604k = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < A(); i10++) {
            if (!z(i10).a()) {
                this.f31604k = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < H(); i11++) {
            if (!G(i11).a()) {
                this.f31604k = (byte) 0;
                return false;
            }
        }
        this.f31604k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        if ((this.f31596c & 1) == 1) {
            fVar.Z(1, this.f31597d);
        }
        if ((this.f31596c & 2) == 2) {
            fVar.Z(2, this.f31598e);
        }
        if ((this.f31596c & 4) == 4) {
            fVar.R(3, this.f31599f.getNumber());
        }
        if ((this.f31596c & 8) == 8) {
            fVar.c0(4, this.f31600g);
        }
        if ((this.f31596c & 16) == 16) {
            fVar.Z(5, this.f31601h);
        }
        for (int i10 = 0; i10 < this.f31602i.size(); i10++) {
            fVar.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31602i.get(i10));
        }
        for (int i11 = 0; i11 < this.f31603j.size(); i11++) {
            fVar.c0(7, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31603j.get(i11));
        }
        fVar.h0(this.f31595b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31605l;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31596c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31597d) : 0;
        if ((this.f31596c & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31598e);
        }
        if ((this.f31596c & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(3, this.f31599f.getNumber());
        }
        if ((this.f31596c & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, this.f31600g);
        }
        if ((this.f31596c & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(5, this.f31601h);
        }
        for (int i11 = 0; i11 < this.f31602i.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31602i.get(i11));
        }
        for (int i12 = 0; i12 < this.f31603j.size(); i12++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(7, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31603j.get(i12));
        }
        int size = o10 + this.f31595b.size();
        this.f31605l = size;
        return size;
    }

    public C3031h z(int i10) {
        return (C3031h) this.f31602i.get(i10);
    }

    private C3031h(i.b bVar) {
        super(bVar);
        this.f31604k = (byte) -1;
        this.f31605l = -1;
        this.f31595b = bVar.i();
    }

    private C3031h(boolean z10) {
        this.f31604k = (byte) -1;
        this.f31605l = -1;
        this.f31595b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3031h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31604k = (byte) -1;
        this.f31605l = -1;
        O();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f31596c |= 1;
                            this.f31597d = eVar.r();
                        } else if (J10 == 16) {
                            this.f31596c |= 2;
                            this.f31598e = eVar.r();
                        } else if (J10 == 24) {
                            int m10 = eVar.m();
                            c valueOf = c.valueOf(m10);
                            if (valueOf == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f31596c |= 4;
                                this.f31599f = valueOf;
                            }
                        } else if (J10 == 34) {
                            C3040q.c b10 = (this.f31596c & 8) == 8 ? this.f31600g.b() : null;
                            C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                            this.f31600g = c3040q;
                            if (b10 != null) {
                                b10.k(c3040q);
                                this.f31600g = b10.v();
                            }
                            this.f31596c |= 8;
                        } else if (J10 == 40) {
                            this.f31596c |= 16;
                            this.f31601h = eVar.r();
                        } else if (J10 == 50) {
                            if ((i10 & 32) != 32) {
                                this.f31602i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f31602i.add(eVar.t(f31594n, gVar));
                        } else if (J10 != 58) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f31603j = new ArrayList();
                                i10 |= 64;
                            }
                            this.f31603j.add(eVar.t(f31594n, gVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((i10 & 32) == 32) {
                        this.f31602i = Collections.unmodifiableList(this.f31602i);
                    }
                    if ((i10 & 64) == 64) {
                        this.f31603j = Collections.unmodifiableList(this.f31603j);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31595b = A10.d();
                        throw th2;
                    }
                    this.f31595b = A10.d();
                    j();
                    throw th;
                }
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
            }
        }
        if ((i10 & 32) == 32) {
            this.f31602i = Collections.unmodifiableList(this.f31602i);
        }
        if ((i10 & 64) == 64) {
            this.f31603j = Collections.unmodifiableList(this.f31603j);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31595b = A10.d();
            throw th3;
        }
        this.f31595b = A10.d();
        j();
    }

    /* renamed from: dd.h$b */
    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31606b;

        /* renamed from: c, reason: collision with root package name */
        private int f31607c;

        /* renamed from: d, reason: collision with root package name */
        private int f31608d;

        /* renamed from: g, reason: collision with root package name */
        private int f31611g;

        /* renamed from: e, reason: collision with root package name */
        private c f31609e = c.TRUE;

        /* renamed from: f, reason: collision with root package name */
        private C3040q f31610f = C3040q.U();

        /* renamed from: h, reason: collision with root package name */
        private List f31612h = Collections.emptyList();

        /* renamed from: i, reason: collision with root package name */
        private List f31613i = Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31606b & 32) != 32) {
                this.f31612h = new ArrayList(this.f31612h);
                this.f31606b |= 32;
            }
        }

        private void v() {
            if ((this.f31606b & 64) != 64) {
                this.f31613i = new ArrayList(this.f31613i);
                this.f31606b |= 64;
            }
        }

        public b A(c cVar) {
            cVar.getClass();
            this.f31606b |= 4;
            this.f31609e = cVar;
            return this;
        }

        public b B(int i10) {
            this.f31606b |= 1;
            this.f31607c = i10;
            return this;
        }

        public b C(int i10) {
            this.f31606b |= 16;
            this.f31611g = i10;
            return this;
        }

        public b D(int i10) {
            this.f31606b |= 2;
            this.f31608d = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3031h c() {
            C3031h o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3031h o() {
            C3031h c3031h = new C3031h(this);
            int i10 = this.f31606b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3031h.f31597d = this.f31607c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3031h.f31598e = this.f31608d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3031h.f31599f = this.f31609e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3031h.f31600g = this.f31610f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3031h.f31601h = this.f31611g;
            if ((this.f31606b & 32) == 32) {
                this.f31612h = Collections.unmodifiableList(this.f31612h);
                this.f31606b &= -33;
            }
            c3031h.f31602i = this.f31612h;
            if ((this.f31606b & 64) == 64) {
                this.f31613i = Collections.unmodifiableList(this.f31613i);
                this.f31606b &= -65;
            }
            c3031h.f31603j = this.f31613i;
            c3031h.f31596c = i11;
            return c3031h;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b k(C3031h c3031h) {
            if (c3031h == C3031h.C()) {
                return this;
            }
            if (c3031h.K()) {
                B(c3031h.D());
            }
            if (c3031h.N()) {
                D(c3031h.I());
            }
            if (c3031h.J()) {
                A(c3031h.B());
            }
            if (c3031h.L()) {
                z(c3031h.E());
            }
            if (c3031h.M()) {
                C(c3031h.F());
            }
            if (!c3031h.f31602i.isEmpty()) {
                if (this.f31612h.isEmpty()) {
                    this.f31612h = c3031h.f31602i;
                    this.f31606b &= -33;
                } else {
                    s();
                    this.f31612h.addAll(c3031h.f31602i);
                }
            }
            if (!c3031h.f31603j.isEmpty()) {
                if (this.f31613i.isEmpty()) {
                    this.f31613i = c3031h.f31603j;
                    this.f31606b &= -65;
                } else {
                    v();
                    this.f31613i.addAll(c3031h.f31603j);
                }
            }
            l(i().e(c3031h.f31595b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3031h c3031h = null;
            try {
                try {
                    C3031h c3031h2 = (C3031h) C3031h.f31594n.b(eVar, gVar);
                    if (c3031h2 != null) {
                        k(c3031h2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3031h c3031h3 = (C3031h) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3031h = c3031h3;
                        if (c3031h != null) {
                            k(c3031h);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3031h != null) {
                }
                throw th;
            }
        }

        public b z(C3040q c3040q) {
            if ((this.f31606b & 8) != 8 || this.f31610f == C3040q.U()) {
                this.f31610f = c3040q;
            } else {
                this.f31610f = C3040q.v0(this.f31610f).k(c3040q).v();
            }
            this.f31606b |= 8;
            return this;
        }

        private void w() {
        }
    }
}
