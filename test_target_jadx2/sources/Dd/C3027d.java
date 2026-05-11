package dd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3027d extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: j, reason: collision with root package name */
    private static final C3027d f31548j;

    /* renamed from: k, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31549k = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31550c;

    /* renamed from: d, reason: collision with root package name */
    private int f31551d;

    /* renamed from: e, reason: collision with root package name */
    private int f31552e;

    /* renamed from: f, reason: collision with root package name */
    private List f31553f;

    /* renamed from: g, reason: collision with root package name */
    private List f31554g;

    /* renamed from: h, reason: collision with root package name */
    private byte f31555h;

    /* renamed from: i, reason: collision with root package name */
    private int f31556i;

    /* renamed from: dd.d$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3027d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3027d(eVar, gVar);
        }
    }

    static {
        C3027d c3027d = new C3027d(true);
        f31548j = c3027d;
        c3027d.M();
    }

    public static C3027d E() {
        return f31548j;
    }

    private void M() {
        this.f31552e = 6;
        this.f31553f = Collections.emptyList();
        this.f31554g = Collections.emptyList();
    }

    public static b N() {
        return b.x();
    }

    public static b O(C3027d c3027d) {
        return N().k(c3027d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3027d getDefaultInstanceForType() {
        return f31548j;
    }

    public int G() {
        return this.f31552e;
    }

    public u H(int i10) {
        return (u) this.f31553f.get(i10);
    }

    public int I() {
        return this.f31553f.size();
    }

    public List J() {
        return this.f31553f;
    }

    public List K() {
        return this.f31554g;
    }

    public boolean L() {
        return (this.f31551d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b b() {
        return O(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31555h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < I(); i10++) {
            if (!H(i10).a()) {
                this.f31555h = (byte) 0;
                return false;
            }
        }
        if (p()) {
            this.f31555h = (byte) 1;
            return true;
        }
        this.f31555h = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31551d & 1) == 1) {
            fVar.Z(1, this.f31552e);
        }
        for (int i10 = 0; i10 < this.f31553f.size(); i10++) {
            fVar.c0(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31553f.get(i10));
        }
        for (int i11 = 0; i11 < this.f31554g.size(); i11++) {
            fVar.Z(31, ((Integer) this.f31554g.get(i11)).intValue());
        }
        v10.a(19000, fVar);
        fVar.h0(this.f31550c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31556i;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31551d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31552e) : 0;
        for (int i11 = 0; i11 < this.f31553f.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(2, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31553f.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f31554g.size(); i13++) {
            i12 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31554g.get(i13)).intValue());
        }
        int size = o10 + i12 + (K().size() * 2) + q() + this.f31550c.size();
        this.f31556i = size;
        return size;
    }

    private C3027d(i.c cVar) {
        super(cVar);
        this.f31555h = (byte) -1;
        this.f31556i = -1;
        this.f31550c = cVar.i();
    }

    private C3027d(boolean z10) {
        this.f31555h = (byte) -1;
        this.f31556i = -1;
        this.f31550c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3027d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31555h = (byte) -1;
        this.f31556i = -1;
        M();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 8) {
                                this.f31551d |= 1;
                                this.f31552e = eVar.r();
                            } else if (J10 == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f31553f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f31553f.add(eVar.t(u.f31852n, gVar));
                            } else if (J10 == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f31554g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f31554g.add(Integer.valueOf(eVar.r()));
                            } else if (J10 != 250) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 4) != 4 && eVar.e() > 0) {
                                    this.f31554g = new ArrayList();
                                    i10 |= 4;
                                }
                                while (eVar.e() > 0) {
                                    this.f31554g.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
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
                if ((i10 & 2) == 2) {
                    this.f31553f = Collections.unmodifiableList(this.f31553f);
                }
                if ((i10 & 4) == 4) {
                    this.f31554g = Collections.unmodifiableList(this.f31554g);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31550c = A10.d();
                    throw th2;
                }
                this.f31550c = A10.d();
                j();
                throw th;
            }
        }
        if ((i10 & 2) == 2) {
            this.f31553f = Collections.unmodifiableList(this.f31553f);
        }
        if ((i10 & 4) == 4) {
            this.f31554g = Collections.unmodifiableList(this.f31554g);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31550c = A10.d();
            throw th3;
        }
        this.f31550c = A10.d();
        j();
    }

    /* renamed from: dd.d$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31557d;

        /* renamed from: e, reason: collision with root package name */
        private int f31558e = 6;

        /* renamed from: f, reason: collision with root package name */
        private List f31559f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f31560g = Collections.emptyList();

        private b() {
            A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31557d & 2) != 2) {
                this.f31559f = new ArrayList(this.f31559f);
                this.f31557d |= 2;
            }
        }

        private void z() {
            if ((this.f31557d & 4) != 4) {
                this.f31560g = new ArrayList(this.f31560g);
                this.f31557d |= 4;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b k(C3027d c3027d) {
            if (c3027d == C3027d.E()) {
                return this;
            }
            if (c3027d.L()) {
                D(c3027d.G());
            }
            if (!c3027d.f31553f.isEmpty()) {
                if (this.f31559f.isEmpty()) {
                    this.f31559f = c3027d.f31553f;
                    this.f31557d &= -3;
                } else {
                    y();
                    this.f31559f.addAll(c3027d.f31553f);
                }
            }
            if (!c3027d.f31554g.isEmpty()) {
                if (this.f31560g.isEmpty()) {
                    this.f31560g = c3027d.f31554g;
                    this.f31557d &= -5;
                } else {
                    z();
                    this.f31560g.addAll(c3027d.f31554g);
                }
            }
            p(c3027d);
            l(i().e(c3027d.f31550c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3027d c3027d = null;
            try {
                try {
                    C3027d c3027d2 = (C3027d) C3027d.f31549k.b(eVar, gVar);
                    if (c3027d2 != null) {
                        k(c3027d2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3027d c3027d3 = (C3027d) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3027d = c3027d3;
                        if (c3027d != null) {
                            k(c3027d);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3027d != null) {
                }
                throw th;
            }
        }

        public b D(int i10) {
            this.f31557d |= 1;
            this.f31558e = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3027d c() {
            C3027d v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3027d v() {
            C3027d c3027d = new C3027d(this);
            int i10 = (this.f31557d & 1) != 1 ? 0 : 1;
            c3027d.f31552e = this.f31558e;
            if ((this.f31557d & 2) == 2) {
                this.f31559f = Collections.unmodifiableList(this.f31559f);
                this.f31557d &= -3;
            }
            c3027d.f31553f = this.f31559f;
            if ((this.f31557d & 4) == 4) {
                this.f31560g = Collections.unmodifiableList(this.f31560g);
                this.f31557d &= -5;
            }
            c3027d.f31554g = this.f31560g;
            c3027d.f31551d = i10;
            return c3027d;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void A() {
        }
    }
}
