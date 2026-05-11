package dd;

import dd.C3031h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3029f extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: j, reason: collision with root package name */
    private static final C3029f f31569j;

    /* renamed from: k, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31570k = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31571b;

    /* renamed from: c, reason: collision with root package name */
    private int f31572c;

    /* renamed from: d, reason: collision with root package name */
    private c f31573d;

    /* renamed from: e, reason: collision with root package name */
    private List f31574e;

    /* renamed from: f, reason: collision with root package name */
    private C3031h f31575f;

    /* renamed from: g, reason: collision with root package name */
    private d f31576g;

    /* renamed from: h, reason: collision with root package name */
    private byte f31577h;

    /* renamed from: i, reason: collision with root package name */
    private int f31578i;

    /* renamed from: dd.f$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3029f b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3029f(eVar, gVar);
        }
    }

    /* renamed from: dd.f$c */
    public enum c implements j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* renamed from: dd.f$c$a */
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
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    /* renamed from: dd.f$d */
    public enum d implements j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* renamed from: dd.f$d$a */
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
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    static {
        C3029f c3029f = new C3029f(true);
        f31569j = c3029f;
        c3029f.E();
    }

    private void E() {
        this.f31573d = c.RETURNS_CONSTANT;
        this.f31574e = Collections.emptyList();
        this.f31575f = C3031h.C();
        this.f31576g = d.AT_MOST_ONCE;
    }

    public static b F() {
        return b.q();
    }

    public static b G(C3029f c3029f) {
        return F().k(c3029f);
    }

    public static C3029f w() {
        return f31569j;
    }

    public d A() {
        return this.f31576g;
    }

    public boolean B() {
        return (this.f31572c & 2) == 2;
    }

    public boolean C() {
        return (this.f31572c & 1) == 1;
    }

    public boolean D() {
        return (this.f31572c & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b b() {
        return G(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31577h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < y(); i10++) {
            if (!x(i10).a()) {
                this.f31577h = (byte) 0;
                return false;
            }
        }
        if (!B() || v().a()) {
            this.f31577h = (byte) 1;
            return true;
        }
        this.f31577h = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        if ((this.f31572c & 1) == 1) {
            fVar.R(1, this.f31573d.getNumber());
        }
        for (int i10 = 0; i10 < this.f31574e.size(); i10++) {
            fVar.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31574e.get(i10));
        }
        if ((this.f31572c & 2) == 2) {
            fVar.c0(3, this.f31575f);
        }
        if ((this.f31572c & 4) == 4) {
            fVar.R(4, this.f31576g.getNumber());
        }
        fVar.h0(this.f31571b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31578i;
        if (i10 != -1) {
            return i10;
        }
        int h10 = (this.f31572c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.h(1, this.f31573d.getNumber()) : 0;
        for (int i11 = 0; i11 < this.f31574e.size(); i11++) {
            h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31574e.get(i11));
        }
        if ((this.f31572c & 2) == 2) {
            h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, this.f31575f);
        }
        if ((this.f31572c & 4) == 4) {
            h10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(4, this.f31576g.getNumber());
        }
        int size = h10 + this.f31571b.size();
        this.f31578i = size;
        return size;
    }

    public C3031h v() {
        return this.f31575f;
    }

    public C3031h x(int i10) {
        return (C3031h) this.f31574e.get(i10);
    }

    public int y() {
        return this.f31574e.size();
    }

    public c z() {
        return this.f31573d;
    }

    private C3029f(i.b bVar) {
        super(bVar);
        this.f31577h = (byte) -1;
        this.f31578i = -1;
        this.f31571b = bVar.i();
    }

    private C3029f(boolean z10) {
        this.f31577h = (byte) -1;
        this.f31578i = -1;
        this.f31571b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3029f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31577h = (byte) -1;
        this.f31578i = -1;
        E();
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
                            int m10 = eVar.m();
                            c valueOf = c.valueOf(m10);
                            if (valueOf == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f31572c |= 1;
                                this.f31573d = valueOf;
                            }
                        } else if (J10 == 18) {
                            if ((c10 & 2) != 2) {
                                this.f31574e = new ArrayList();
                                c10 = 2;
                            }
                            this.f31574e.add(eVar.t(C3031h.f31594n, gVar));
                        } else if (J10 == 26) {
                            C3031h.b b10 = (this.f31572c & 2) == 2 ? this.f31575f.b() : null;
                            C3031h c3031h = (C3031h) eVar.t(C3031h.f31594n, gVar);
                            this.f31575f = c3031h;
                            if (b10 != null) {
                                b10.k(c3031h);
                                this.f31575f = b10.o();
                            }
                            this.f31572c |= 2;
                        } else if (J10 != 32) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            int m11 = eVar.m();
                            d valueOf2 = d.valueOf(m11);
                            if (valueOf2 == null) {
                                I10.n0(J10);
                                I10.n0(m11);
                            } else {
                                this.f31572c |= 4;
                                this.f31576g = valueOf2;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f31574e = Collections.unmodifiableList(this.f31574e);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31571b = A10.d();
                        throw th2;
                    }
                    this.f31571b = A10.d();
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
            this.f31574e = Collections.unmodifiableList(this.f31574e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31571b = A10.d();
            throw th3;
        }
        this.f31571b = A10.d();
        j();
    }

    /* renamed from: dd.f$b */
    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31579b;

        /* renamed from: c, reason: collision with root package name */
        private c f31580c = c.RETURNS_CONSTANT;

        /* renamed from: d, reason: collision with root package name */
        private List f31581d = Collections.emptyList();

        /* renamed from: e, reason: collision with root package name */
        private C3031h f31582e = C3031h.C();

        /* renamed from: f, reason: collision with root package name */
        private d f31583f = d.AT_MOST_ONCE;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31579b & 2) != 2) {
                this.f31581d = new ArrayList(this.f31581d);
                this.f31579b |= 2;
            }
        }

        public b A(d dVar) {
            dVar.getClass();
            this.f31579b |= 8;
            this.f31583f = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3029f c() {
            C3029f o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3029f o() {
            C3029f c3029f = new C3029f(this);
            int i10 = this.f31579b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3029f.f31573d = this.f31580c;
            if ((this.f31579b & 2) == 2) {
                this.f31581d = Collections.unmodifiableList(this.f31581d);
                this.f31579b &= -3;
            }
            c3029f.f31574e = this.f31581d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            c3029f.f31575f = this.f31582e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3029f.f31576g = this.f31583f;
            c3029f.f31572c = i11;
            return c3029f;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        public b w(C3031h c3031h) {
            if ((this.f31579b & 4) != 4 || this.f31582e == C3031h.C()) {
                this.f31582e = c3031h;
            } else {
                this.f31582e = C3031h.Q(this.f31582e).k(c3031h).o();
            }
            this.f31579b |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b k(C3029f c3029f) {
            if (c3029f == C3029f.w()) {
                return this;
            }
            if (c3029f.C()) {
                z(c3029f.z());
            }
            if (!c3029f.f31574e.isEmpty()) {
                if (this.f31581d.isEmpty()) {
                    this.f31581d = c3029f.f31574e;
                    this.f31579b &= -3;
                } else {
                    s();
                    this.f31581d.addAll(c3029f.f31574e);
                }
            }
            if (c3029f.B()) {
                w(c3029f.v());
            }
            if (c3029f.D()) {
                A(c3029f.A());
            }
            l(i().e(c3029f.f31571b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3029f c3029f = null;
            try {
                try {
                    C3029f c3029f2 = (C3029f) C3029f.f31570k.b(eVar, gVar);
                    if (c3029f2 != null) {
                        k(c3029f2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3029f c3029f3 = (C3029f) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3029f = c3029f3;
                        if (c3029f != null) {
                            k(c3029f);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3029f != null) {
                }
                throw th;
            }
        }

        public b z(c cVar) {
            cVar.getClass();
            this.f31579b |= 1;
            this.f31580c = cVar;
            return this;
        }

        private void v() {
        }
    }
}
