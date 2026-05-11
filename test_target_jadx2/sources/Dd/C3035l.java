package dd;

import dd.C3043t;
import dd.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3035l extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: l, reason: collision with root package name */
    private static final C3035l f31650l;

    /* renamed from: m, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31651m = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31652c;

    /* renamed from: d, reason: collision with root package name */
    private int f31653d;

    /* renamed from: e, reason: collision with root package name */
    private List f31654e;

    /* renamed from: f, reason: collision with root package name */
    private List f31655f;

    /* renamed from: g, reason: collision with root package name */
    private List f31656g;

    /* renamed from: h, reason: collision with root package name */
    private C3043t f31657h;

    /* renamed from: i, reason: collision with root package name */
    private w f31658i;

    /* renamed from: j, reason: collision with root package name */
    private byte f31659j;

    /* renamed from: k, reason: collision with root package name */
    private int f31660k;

    /* renamed from: dd.l$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3035l b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3035l(eVar, gVar);
        }
    }

    static {
        C3035l c3035l = new C3035l(true);
        f31650l = c3035l;
        c3035l.W();
    }

    public static C3035l H() {
        return f31650l;
    }

    private void W() {
        this.f31654e = Collections.emptyList();
        this.f31655f = Collections.emptyList();
        this.f31656g = Collections.emptyList();
        this.f31657h = C3043t.t();
        this.f31658i = w.r();
    }

    public static b X() {
        return b.x();
    }

    public static b Y(C3035l c3035l) {
        return X().k(c3035l);
    }

    public static C3035l a0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        return (C3035l) f31651m.a(inputStream, gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C3035l getDefaultInstanceForType() {
        return f31650l;
    }

    public C3032i J(int i10) {
        return (C3032i) this.f31654e.get(i10);
    }

    public int K() {
        return this.f31654e.size();
    }

    public List L() {
        return this.f31654e;
    }

    public C3037n M(int i10) {
        return (C3037n) this.f31655f.get(i10);
    }

    public int N() {
        return this.f31655f.size();
    }

    public List O() {
        return this.f31655f;
    }

    public C3041r P(int i10) {
        return (C3041r) this.f31656g.get(i10);
    }

    public int Q() {
        return this.f31656g.size();
    }

    public List R() {
        return this.f31656g;
    }

    public C3043t S() {
        return this.f31657h;
    }

    public w T() {
        return this.f31658i;
    }

    public boolean U() {
        return (this.f31653d & 1) == 1;
    }

    public boolean V() {
        return (this.f31653d & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31659j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < K(); i10++) {
            if (!J(i10).a()) {
                this.f31659j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < N(); i11++) {
            if (!M(i11).a()) {
                this.f31659j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < Q(); i12++) {
            if (!P(i12).a()) {
                this.f31659j = (byte) 0;
                return false;
            }
        }
        if (U() && !S().a()) {
            this.f31659j = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31659j = (byte) 1;
            return true;
        }
        this.f31659j = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return Y(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        for (int i10 = 0; i10 < this.f31654e.size(); i10++) {
            fVar.c0(3, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31654e.get(i10));
        }
        for (int i11 = 0; i11 < this.f31655f.size(); i11++) {
            fVar.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31655f.get(i11));
        }
        for (int i12 = 0; i12 < this.f31656g.size(); i12++) {
            fVar.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31656g.get(i12));
        }
        if ((this.f31653d & 1) == 1) {
            fVar.c0(30, this.f31657h);
        }
        if ((this.f31653d & 2) == 2) {
            fVar.c0(32, this.f31658i);
        }
        v10.a(200, fVar);
        fVar.h0(this.f31652c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31660k;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31654e.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31654e.get(i12));
        }
        for (int i13 = 0; i13 < this.f31655f.size(); i13++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31655f.get(i13));
        }
        for (int i14 = 0; i14 < this.f31656g.size(); i14++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31656g.get(i14));
        }
        if ((this.f31653d & 1) == 1) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(30, this.f31657h);
        }
        if ((this.f31653d & 2) == 2) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(32, this.f31658i);
        }
        int q10 = i11 + q() + this.f31652c.size();
        this.f31660k = q10;
        return q10;
    }

    private C3035l(i.c cVar) {
        super(cVar);
        this.f31659j = (byte) -1;
        this.f31660k = -1;
        this.f31652c = cVar.i();
    }

    private C3035l(boolean z10) {
        this.f31659j = (byte) -1;
        this.f31660k = -1;
        this.f31652c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private C3035l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31659j = (byte) -1;
        this.f31660k = -1;
        W();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 26) {
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 != 1) {
                                this.f31654e = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.f31654e.add(eVar.t(C3032i.f31615w, gVar));
                        } else if (J10 == 34) {
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 != 2) {
                                this.f31655f = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.f31655f.add(eVar.t(C3037n.f31683w, gVar));
                        } else if (J10 != 42) {
                            if (J10 == 242) {
                                C3043t.b b10 = (this.f31653d & 1) == 1 ? this.f31657h.b() : null;
                                C3043t c3043t = (C3043t) eVar.t(C3043t.f31841i, gVar);
                                this.f31657h = c3043t;
                                if (b10 != null) {
                                    b10.k(c3043t);
                                    this.f31657h = b10.o();
                                }
                                this.f31653d |= 1;
                            } else if (J10 != 258) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                w.b b11 = (this.f31653d & 2) == 2 ? this.f31658i.b() : null;
                                w wVar = (w) eVar.t(w.f31890g, gVar);
                                this.f31658i = wVar;
                                if (b11 != null) {
                                    b11.k(wVar);
                                    this.f31658i = b11.o();
                                }
                                this.f31653d |= 2;
                            }
                        } else {
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 != 4) {
                                this.f31656g = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            this.f31656g.add(eVar.t(C3041r.f31796q, gVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (((c10 == true ? 1 : 0) & 1) == 1) {
                        this.f31654e = Collections.unmodifiableList(this.f31654e);
                    }
                    if (((c10 == true ? 1 : 0) & 2) == 2) {
                        this.f31655f = Collections.unmodifiableList(this.f31655f);
                    }
                    if (((c10 == true ? 1 : 0) & 4) == 4) {
                        this.f31656g = Collections.unmodifiableList(this.f31656g);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31652c = A10.d();
                        throw th2;
                    }
                    this.f31652c = A10.d();
                    j();
                    throw th;
                }
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
            }
        }
        if (((c10 == true ? 1 : 0) & 1) == 1) {
            this.f31654e = Collections.unmodifiableList(this.f31654e);
        }
        if (((c10 == true ? 1 : 0) & 2) == 2) {
            this.f31655f = Collections.unmodifiableList(this.f31655f);
        }
        if (((c10 == true ? 1 : 0) & 4) == 4) {
            this.f31656g = Collections.unmodifiableList(this.f31656g);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31652c = A10.d();
            throw th3;
        }
        this.f31652c = A10.d();
        j();
    }

    /* renamed from: dd.l$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31661d;

        /* renamed from: e, reason: collision with root package name */
        private List f31662e = Collections.emptyList();

        /* renamed from: f, reason: collision with root package name */
        private List f31663f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f31664g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private C3043t f31665h = C3043t.t();

        /* renamed from: i, reason: collision with root package name */
        private w f31666i = w.r();

        private b() {
            B();
        }

        private void A() {
            if ((this.f31661d & 4) != 4) {
                this.f31664g = new ArrayList(this.f31664g);
                this.f31661d |= 4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31661d & 1) != 1) {
                this.f31662e = new ArrayList(this.f31662e);
                this.f31661d |= 1;
            }
        }

        private void z() {
            if ((this.f31661d & 2) != 2) {
                this.f31663f = new ArrayList(this.f31663f);
                this.f31661d |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b k(C3035l c3035l) {
            if (c3035l == C3035l.H()) {
                return this;
            }
            if (!c3035l.f31654e.isEmpty()) {
                if (this.f31662e.isEmpty()) {
                    this.f31662e = c3035l.f31654e;
                    this.f31661d &= -2;
                } else {
                    y();
                    this.f31662e.addAll(c3035l.f31654e);
                }
            }
            if (!c3035l.f31655f.isEmpty()) {
                if (this.f31663f.isEmpty()) {
                    this.f31663f = c3035l.f31655f;
                    this.f31661d &= -3;
                } else {
                    z();
                    this.f31663f.addAll(c3035l.f31655f);
                }
            }
            if (!c3035l.f31656g.isEmpty()) {
                if (this.f31664g.isEmpty()) {
                    this.f31664g = c3035l.f31656g;
                    this.f31661d &= -5;
                } else {
                    A();
                    this.f31664g.addAll(c3035l.f31656g);
                }
            }
            if (c3035l.U()) {
                E(c3035l.S());
            }
            if (c3035l.V()) {
                G(c3035l.T());
            }
            p(c3035l);
            l(i().e(c3035l.f31652c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3035l c3035l = null;
            try {
                try {
                    C3035l c3035l2 = (C3035l) C3035l.f31651m.b(eVar, gVar);
                    if (c3035l2 != null) {
                        k(c3035l2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3035l c3035l3 = (C3035l) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3035l = c3035l3;
                        if (c3035l != null) {
                            k(c3035l);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3035l != null) {
                }
                throw th;
            }
        }

        public b E(C3043t c3043t) {
            if ((this.f31661d & 8) != 8 || this.f31665h == C3043t.t()) {
                this.f31665h = c3043t;
            } else {
                this.f31665h = C3043t.B(this.f31665h).k(c3043t).o();
            }
            this.f31661d |= 8;
            return this;
        }

        public b G(w wVar) {
            if ((this.f31661d & 16) != 16 || this.f31666i == w.r()) {
                this.f31666i = wVar;
            } else {
                this.f31666i = w.w(this.f31666i).k(wVar).o();
            }
            this.f31661d |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3035l c() {
            C3035l v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3035l v() {
            C3035l c3035l = new C3035l(this);
            int i10 = this.f31661d;
            if ((i10 & 1) == 1) {
                this.f31662e = Collections.unmodifiableList(this.f31662e);
                this.f31661d &= -2;
            }
            c3035l.f31654e = this.f31662e;
            if ((this.f31661d & 2) == 2) {
                this.f31663f = Collections.unmodifiableList(this.f31663f);
                this.f31661d &= -3;
            }
            c3035l.f31655f = this.f31663f;
            if ((this.f31661d & 4) == 4) {
                this.f31664g = Collections.unmodifiableList(this.f31664g);
                this.f31661d &= -5;
            }
            c3035l.f31656g = this.f31664g;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            c3035l.f31657h = this.f31665h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            c3035l.f31658i = this.f31666i;
            c3035l.f31653d = i11;
            return c3035l;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void B() {
        }
    }
}
