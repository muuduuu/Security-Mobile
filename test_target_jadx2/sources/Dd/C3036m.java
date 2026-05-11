package dd;

import dd.C3035l;
import dd.C3038o;
import dd.C3039p;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3036m extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: k, reason: collision with root package name */
    private static final C3036m f31667k;

    /* renamed from: l, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31668l = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31669c;

    /* renamed from: d, reason: collision with root package name */
    private int f31670d;

    /* renamed from: e, reason: collision with root package name */
    private C3039p f31671e;

    /* renamed from: f, reason: collision with root package name */
    private C3038o f31672f;

    /* renamed from: g, reason: collision with root package name */
    private C3035l f31673g;

    /* renamed from: h, reason: collision with root package name */
    private List f31674h;

    /* renamed from: i, reason: collision with root package name */
    private byte f31675i;

    /* renamed from: j, reason: collision with root package name */
    private int f31676j;

    /* renamed from: dd.m$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3036m b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3036m(eVar, gVar);
        }
    }

    static {
        C3036m c3036m = new C3036m(true);
        f31667k = c3036m;
        c3036m.P();
    }

    public static C3036m H() {
        return f31667k;
    }

    private void P() {
        this.f31671e = C3039p.r();
        this.f31672f = C3038o.r();
        this.f31673g = C3035l.H();
        this.f31674h = Collections.emptyList();
    }

    public static b Q() {
        return b.x();
    }

    public static b R(C3036m c3036m) {
        return Q().k(c3036m);
    }

    public static C3036m T(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        return (C3036m) f31668l.a(inputStream, gVar);
    }

    public C3026c E(int i10) {
        return (C3026c) this.f31674h.get(i10);
    }

    public int F() {
        return this.f31674h.size();
    }

    public List G() {
        return this.f31674h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C3036m getDefaultInstanceForType() {
        return f31667k;
    }

    public C3035l J() {
        return this.f31673g;
    }

    public C3038o K() {
        return this.f31672f;
    }

    public C3039p L() {
        return this.f31671e;
    }

    public boolean M() {
        return (this.f31670d & 4) == 4;
    }

    public boolean N() {
        return (this.f31670d & 2) == 2;
    }

    public boolean O() {
        return (this.f31670d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b b() {
        return R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31675i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (N() && !K().a()) {
            this.f31675i = (byte) 0;
            return false;
        }
        if (M() && !J().a()) {
            this.f31675i = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < F(); i10++) {
            if (!E(i10).a()) {
                this.f31675i = (byte) 0;
                return false;
            }
        }
        if (p()) {
            this.f31675i = (byte) 1;
            return true;
        }
        this.f31675i = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31670d & 1) == 1) {
            fVar.c0(1, this.f31671e);
        }
        if ((this.f31670d & 2) == 2) {
            fVar.c0(2, this.f31672f);
        }
        if ((this.f31670d & 4) == 4) {
            fVar.c0(3, this.f31673g);
        }
        for (int i10 = 0; i10 < this.f31674h.size(); i10++) {
            fVar.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31674h.get(i10));
        }
        v10.a(200, fVar);
        fVar.h0(this.f31669c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31676j;
        if (i10 != -1) {
            return i10;
        }
        int r10 = (this.f31670d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.r(1, this.f31671e) : 0;
        if ((this.f31670d & 2) == 2) {
            r10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, this.f31672f);
        }
        if ((this.f31670d & 4) == 4) {
            r10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, this.f31673g);
        }
        for (int i11 = 0; i11 < this.f31674h.size(); i11++) {
            r10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31674h.get(i11));
        }
        int q10 = r10 + q() + this.f31669c.size();
        this.f31676j = q10;
        return q10;
    }

    private C3036m(i.c cVar) {
        super(cVar);
        this.f31675i = (byte) -1;
        this.f31676j = -1;
        this.f31669c = cVar.i();
    }

    private C3036m(boolean z10) {
        this.f31675i = (byte) -1;
        this.f31676j = -1;
        this.f31669c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3036m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31675i = (byte) -1;
        this.f31676j = -1;
        P();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 10) {
                                C3039p.b b10 = (this.f31670d & 1) == 1 ? this.f31671e.b() : null;
                                C3039p c3039p = (C3039p) eVar.t(C3039p.f31740g, gVar);
                                this.f31671e = c3039p;
                                if (b10 != null) {
                                    b10.k(c3039p);
                                    this.f31671e = b10.o();
                                }
                                this.f31670d |= 1;
                            } else if (J10 == 18) {
                                C3038o.b b11 = (this.f31670d & 2) == 2 ? this.f31672f.b() : null;
                                C3038o c3038o = (C3038o) eVar.t(C3038o.f31719g, gVar);
                                this.f31672f = c3038o;
                                if (b11 != null) {
                                    b11.k(c3038o);
                                    this.f31672f = b11.o();
                                }
                                this.f31670d |= 2;
                            } else if (J10 == 26) {
                                C3035l.b b12 = (this.f31670d & 4) == 4 ? this.f31673g.b() : null;
                                C3035l c3035l = (C3035l) eVar.t(C3035l.f31651m, gVar);
                                this.f31673g = c3035l;
                                if (b12 != null) {
                                    b12.k(c3035l);
                                    this.f31673g = b12.v();
                                }
                                this.f31670d |= 4;
                            } else if (J10 != 34) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                int i10 = (c10 == true ? 1 : 0) & '\b';
                                c10 = c10;
                                if (i10 != 8) {
                                    this.f31674h = new ArrayList();
                                    c10 = '\b';
                                }
                                this.f31674h.add(eVar.t(C3026c.f31488X, gVar));
                            }
                        }
                        z10 = true;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                        throw e10.i(this);
                    }
                } catch (IOException e11) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f31674h = Collections.unmodifiableList(this.f31674h);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31669c = A10.d();
                    throw th2;
                }
                this.f31669c = A10.d();
                j();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f31674h = Collections.unmodifiableList(this.f31674h);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31669c = A10.d();
            throw th3;
        }
        this.f31669c = A10.d();
        j();
    }

    /* renamed from: dd.m$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31677d;

        /* renamed from: e, reason: collision with root package name */
        private C3039p f31678e = C3039p.r();

        /* renamed from: f, reason: collision with root package name */
        private C3038o f31679f = C3038o.r();

        /* renamed from: g, reason: collision with root package name */
        private C3035l f31680g = C3035l.H();

        /* renamed from: h, reason: collision with root package name */
        private List f31681h = Collections.emptyList();

        private b() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31677d & 8) != 8) {
                this.f31681h = new ArrayList(this.f31681h);
                this.f31677d |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b k(C3036m c3036m) {
            if (c3036m == C3036m.H()) {
                return this;
            }
            if (c3036m.O()) {
                E(c3036m.L());
            }
            if (c3036m.N()) {
                D(c3036m.K());
            }
            if (c3036m.M()) {
                C(c3036m.J());
            }
            if (!c3036m.f31674h.isEmpty()) {
                if (this.f31681h.isEmpty()) {
                    this.f31681h = c3036m.f31674h;
                    this.f31677d &= -9;
                } else {
                    y();
                    this.f31681h.addAll(c3036m.f31674h);
                }
            }
            p(c3036m);
            l(i().e(c3036m.f31669c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3036m c3036m = null;
            try {
                try {
                    C3036m c3036m2 = (C3036m) C3036m.f31668l.b(eVar, gVar);
                    if (c3036m2 != null) {
                        k(c3036m2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3036m c3036m3 = (C3036m) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3036m = c3036m3;
                        if (c3036m != null) {
                            k(c3036m);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3036m != null) {
                }
                throw th;
            }
        }

        public b C(C3035l c3035l) {
            if ((this.f31677d & 4) != 4 || this.f31680g == C3035l.H()) {
                this.f31680g = c3035l;
            } else {
                this.f31680g = C3035l.Y(this.f31680g).k(c3035l).v();
            }
            this.f31677d |= 4;
            return this;
        }

        public b D(C3038o c3038o) {
            if ((this.f31677d & 2) != 2 || this.f31679f == C3038o.r()) {
                this.f31679f = c3038o;
            } else {
                this.f31679f = C3038o.w(this.f31679f).k(c3038o).o();
            }
            this.f31677d |= 2;
            return this;
        }

        public b E(C3039p c3039p) {
            if ((this.f31677d & 1) != 1 || this.f31678e == C3039p.r()) {
                this.f31678e = c3039p;
            } else {
                this.f31678e = C3039p.w(this.f31678e).k(c3039p).o();
            }
            this.f31677d |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3036m c() {
            C3036m v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3036m v() {
            C3036m c3036m = new C3036m(this);
            int i10 = this.f31677d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3036m.f31671e = this.f31678e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3036m.f31672f = this.f31679f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3036m.f31673g = this.f31680g;
            if ((this.f31677d & 8) == 8) {
                this.f31681h = Collections.unmodifiableList(this.f31681h);
                this.f31677d &= -9;
            }
            c3036m.f31674h = this.f31681h;
            c3036m.f31670d = i11;
            return c3036m;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void z() {
        }
    }
}
