package dd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3042s extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: n, reason: collision with root package name */
    private static final C3042s f31820n;

    /* renamed from: o, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31821o = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31822c;

    /* renamed from: d, reason: collision with root package name */
    private int f31823d;

    /* renamed from: e, reason: collision with root package name */
    private int f31824e;

    /* renamed from: f, reason: collision with root package name */
    private int f31825f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31826g;

    /* renamed from: h, reason: collision with root package name */
    private c f31827h;

    /* renamed from: i, reason: collision with root package name */
    private List f31828i;

    /* renamed from: j, reason: collision with root package name */
    private List f31829j;

    /* renamed from: k, reason: collision with root package name */
    private int f31830k;

    /* renamed from: l, reason: collision with root package name */
    private byte f31831l;

    /* renamed from: m, reason: collision with root package name */
    private int f31832m;

    /* renamed from: dd.s$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3042s b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3042s(eVar, gVar);
        }
    }

    /* renamed from: dd.s$c */
    public enum c implements j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static j.b internalValueMap = new a();
        private final int value;

        /* renamed from: dd.s$c$a */
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
            if (i10 != 2) {
                return null;
            }
            return INV;
        }
    }

    static {
        C3042s c3042s = new C3042s(true);
        f31820n = c3042s;
        c3042s.V();
    }

    public static C3042s H() {
        return f31820n;
    }

    private void V() {
        this.f31824e = 0;
        this.f31825f = 0;
        this.f31826g = false;
        this.f31827h = c.INV;
        this.f31828i = Collections.emptyList();
        this.f31829j = Collections.emptyList();
    }

    public static b W() {
        return b.x();
    }

    public static b X(C3042s c3042s) {
        return W().k(c3042s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C3042s getDefaultInstanceForType() {
        return f31820n;
    }

    public int J() {
        return this.f31824e;
    }

    public int K() {
        return this.f31825f;
    }

    public boolean L() {
        return this.f31826g;
    }

    public C3040q M(int i10) {
        return (C3040q) this.f31828i.get(i10);
    }

    public int N() {
        return this.f31828i.size();
    }

    public List O() {
        return this.f31829j;
    }

    public List P() {
        return this.f31828i;
    }

    public c Q() {
        return this.f31827h;
    }

    public boolean R() {
        return (this.f31823d & 1) == 1;
    }

    public boolean S() {
        return (this.f31823d & 2) == 2;
    }

    public boolean T() {
        return (this.f31823d & 4) == 4;
    }

    public boolean U() {
        return (this.f31823d & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b b() {
        return X(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31831l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!R()) {
            this.f31831l = (byte) 0;
            return false;
        }
        if (!S()) {
            this.f31831l = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < N(); i10++) {
            if (!M(i10).a()) {
                this.f31831l = (byte) 0;
                return false;
            }
        }
        if (p()) {
            this.f31831l = (byte) 1;
            return true;
        }
        this.f31831l = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31823d & 1) == 1) {
            fVar.Z(1, this.f31824e);
        }
        if ((this.f31823d & 2) == 2) {
            fVar.Z(2, this.f31825f);
        }
        if ((this.f31823d & 4) == 4) {
            fVar.K(3, this.f31826g);
        }
        if ((this.f31823d & 8) == 8) {
            fVar.R(4, this.f31827h.getNumber());
        }
        for (int i10 = 0; i10 < this.f31828i.size(); i10++) {
            fVar.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31828i.get(i10));
        }
        if (O().size() > 0) {
            fVar.n0(50);
            fVar.n0(this.f31830k);
        }
        for (int i11 = 0; i11 < this.f31829j.size(); i11++) {
            fVar.a0(((Integer) this.f31829j.get(i11)).intValue());
        }
        v10.a(1000, fVar);
        fVar.h0(this.f31822c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31832m;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31823d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31824e) : 0;
        if ((this.f31823d & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31825f);
        }
        if ((this.f31823d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.a(3, this.f31826g);
        }
        if ((this.f31823d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(4, this.f31827h.getNumber());
        }
        for (int i11 = 0; i11 < this.f31828i.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31828i.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f31829j.size(); i13++) {
            i12 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31829j.get(i13)).intValue());
        }
        int i14 = o10 + i12;
        if (!O().isEmpty()) {
            i14 = i14 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i12);
        }
        this.f31830k = i12;
        int q10 = i14 + q() + this.f31822c.size();
        this.f31832m = q10;
        return q10;
    }

    private C3042s(i.c cVar) {
        super(cVar);
        this.f31830k = -1;
        this.f31831l = (byte) -1;
        this.f31832m = -1;
        this.f31822c = cVar.i();
    }

    private C3042s(boolean z10) {
        this.f31830k = -1;
        this.f31831l = (byte) -1;
        this.f31832m = -1;
        this.f31822c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3042s(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31830k = -1;
        this.f31831l = (byte) -1;
        this.f31832m = -1;
        V();
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
                            this.f31823d |= 1;
                            this.f31824e = eVar.r();
                        } else if (J10 == 16) {
                            this.f31823d |= 2;
                            this.f31825f = eVar.r();
                        } else if (J10 == 24) {
                            this.f31823d |= 4;
                            this.f31826g = eVar.j();
                        } else if (J10 == 32) {
                            int m10 = eVar.m();
                            c valueOf = c.valueOf(m10);
                            if (valueOf == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f31823d |= 8;
                                this.f31827h = valueOf;
                            }
                        } else if (J10 == 42) {
                            if ((i10 & 16) != 16) {
                                this.f31828i = new ArrayList();
                                i10 |= 16;
                            }
                            this.f31828i.add(eVar.t(C3040q.f31748v, gVar));
                        } else if (J10 == 48) {
                            if ((i10 & 32) != 32) {
                                this.f31829j = new ArrayList();
                                i10 |= 32;
                            }
                            this.f31829j.add(Integer.valueOf(eVar.r()));
                        } else if (J10 != 50) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            int i11 = eVar.i(eVar.z());
                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                this.f31829j = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f31829j.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                        }
                    }
                    z10 = true;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 16) == 16) {
                    this.f31828i = Collections.unmodifiableList(this.f31828i);
                }
                if ((i10 & 32) == 32) {
                    this.f31829j = Collections.unmodifiableList(this.f31829j);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31822c = A10.d();
                    throw th2;
                }
                this.f31822c = A10.d();
                j();
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f31828i = Collections.unmodifiableList(this.f31828i);
        }
        if ((i10 & 32) == 32) {
            this.f31829j = Collections.unmodifiableList(this.f31829j);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31822c = A10.d();
            throw th3;
        }
        this.f31822c = A10.d();
        j();
    }

    /* renamed from: dd.s$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31833d;

        /* renamed from: e, reason: collision with root package name */
        private int f31834e;

        /* renamed from: f, reason: collision with root package name */
        private int f31835f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f31836g;

        /* renamed from: h, reason: collision with root package name */
        private c f31837h = c.INV;

        /* renamed from: i, reason: collision with root package name */
        private List f31838i = Collections.emptyList();

        /* renamed from: j, reason: collision with root package name */
        private List f31839j = Collections.emptyList();

        private b() {
            A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31833d & 32) != 32) {
                this.f31839j = new ArrayList(this.f31839j);
                this.f31833d |= 32;
            }
        }

        private void z() {
            if ((this.f31833d & 16) != 16) {
                this.f31838i = new ArrayList(this.f31838i);
                this.f31833d |= 16;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b k(C3042s c3042s) {
            if (c3042s == C3042s.H()) {
                return this;
            }
            if (c3042s.R()) {
                D(c3042s.J());
            }
            if (c3042s.S()) {
                E(c3042s.K());
            }
            if (c3042s.T()) {
                G(c3042s.L());
            }
            if (c3042s.U()) {
                H(c3042s.Q());
            }
            if (!c3042s.f31828i.isEmpty()) {
                if (this.f31838i.isEmpty()) {
                    this.f31838i = c3042s.f31828i;
                    this.f31833d &= -17;
                } else {
                    z();
                    this.f31838i.addAll(c3042s.f31828i);
                }
            }
            if (!c3042s.f31829j.isEmpty()) {
                if (this.f31839j.isEmpty()) {
                    this.f31839j = c3042s.f31829j;
                    this.f31833d &= -33;
                } else {
                    y();
                    this.f31839j.addAll(c3042s.f31829j);
                }
            }
            p(c3042s);
            l(i().e(c3042s.f31822c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3042s c3042s = null;
            try {
                try {
                    C3042s c3042s2 = (C3042s) C3042s.f31821o.b(eVar, gVar);
                    if (c3042s2 != null) {
                        k(c3042s2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3042s c3042s3 = (C3042s) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3042s = c3042s3;
                        if (c3042s != null) {
                            k(c3042s);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3042s != null) {
                }
                throw th;
            }
        }

        public b D(int i10) {
            this.f31833d |= 1;
            this.f31834e = i10;
            return this;
        }

        public b E(int i10) {
            this.f31833d |= 2;
            this.f31835f = i10;
            return this;
        }

        public b G(boolean z10) {
            this.f31833d |= 4;
            this.f31836g = z10;
            return this;
        }

        public b H(c cVar) {
            cVar.getClass();
            this.f31833d |= 8;
            this.f31837h = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3042s c() {
            C3042s v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3042s v() {
            C3042s c3042s = new C3042s(this);
            int i10 = this.f31833d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3042s.f31824e = this.f31834e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3042s.f31825f = this.f31835f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3042s.f31826g = this.f31836g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3042s.f31827h = this.f31837h;
            if ((this.f31833d & 16) == 16) {
                this.f31838i = Collections.unmodifiableList(this.f31838i);
                this.f31833d &= -17;
            }
            c3042s.f31828i = this.f31838i;
            if ((this.f31833d & 32) == 32) {
                this.f31839j = Collections.unmodifiableList(this.f31839j);
                this.f31833d &= -33;
            }
            c3042s.f31829j = this.f31839j;
            c3042s.f31823d = i11;
            return c3042s;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void A() {
        }
    }
}
