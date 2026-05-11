package dd;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3030g extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: h, reason: collision with root package name */
    private static final C3030g f31584h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31585i = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31586c;

    /* renamed from: d, reason: collision with root package name */
    private int f31587d;

    /* renamed from: e, reason: collision with root package name */
    private int f31588e;

    /* renamed from: f, reason: collision with root package name */
    private byte f31589f;

    /* renamed from: g, reason: collision with root package name */
    private int f31590g;

    /* renamed from: dd.g$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3030g b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3030g(eVar, gVar);
        }
    }

    static {
        C3030g c3030g = new C3030g(true);
        f31584h = c3030g;
        c3030g.E();
    }

    public static C3030g A() {
        return f31584h;
    }

    private void E() {
        this.f31588e = 0;
    }

    public static b F() {
        return b.x();
    }

    public static b G(C3030g c3030g) {
        return F().k(c3030g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C3030g getDefaultInstanceForType() {
        return f31584h;
    }

    public int C() {
        return this.f31588e;
    }

    public boolean D() {
        return (this.f31587d & 1) == 1;
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
        byte b10 = this.f31589f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (p()) {
            this.f31589f = (byte) 1;
            return true;
        }
        this.f31589f = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31587d & 1) == 1) {
            fVar.Z(1, this.f31588e);
        }
        v10.a(200, fVar);
        fVar.h0(this.f31586c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31590g;
        if (i10 != -1) {
            return i10;
        }
        int o10 = ((this.f31587d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31588e) : 0) + q() + this.f31586c.size();
        this.f31590g = o10;
        return o10;
    }

    private C3030g(i.c cVar) {
        super(cVar);
        this.f31589f = (byte) -1;
        this.f31590g = -1;
        this.f31586c = cVar.i();
    }

    private C3030g(boolean z10) {
        this.f31589f = (byte) -1;
        this.f31590g = -1;
        this.f31586c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3030g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31589f = (byte) -1;
        this.f31590g = -1;
        E();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 != 8) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            this.f31587d |= 1;
                            this.f31588e = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31586c = A10.d();
                        throw th2;
                    }
                    this.f31586c = A10.d();
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
            this.f31586c = A10.d();
            throw th3;
        }
        this.f31586c = A10.d();
        j();
    }

    /* renamed from: dd.g$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31591d;

        /* renamed from: e, reason: collision with root package name */
        private int f31592e;

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
            C3030g c3030g = null;
            try {
                try {
                    C3030g c3030g2 = (C3030g) C3030g.f31585i.b(eVar, gVar);
                    if (c3030g2 != null) {
                        k(c3030g2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3030g c3030g3 = (C3030g) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3030g = c3030g3;
                        if (c3030g != null) {
                            k(c3030g);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3030g != null) {
                }
                throw th;
            }
        }

        public b B(int i10) {
            this.f31591d |= 1;
            this.f31592e = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3030g c() {
            C3030g v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3030g v() {
            C3030g c3030g = new C3030g(this);
            int i10 = (this.f31591d & 1) != 1 ? 0 : 1;
            c3030g.f31588e = this.f31592e;
            c3030g.f31587d = i10;
            return c3030g;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public b k(C3030g c3030g) {
            if (c3030g == C3030g.A()) {
                return this;
            }
            if (c3030g.D()) {
                B(c3030g.C());
            }
            p(c3030g);
            l(i().e(c3030g.f31586c));
            return this;
        }

        private void y() {
        }
    }
}
