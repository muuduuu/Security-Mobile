package dd;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3039p extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: f, reason: collision with root package name */
    private static final C3039p f31739f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31740g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31741b;

    /* renamed from: c, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.protobuf.n f31742c;

    /* renamed from: d, reason: collision with root package name */
    private byte f31743d;

    /* renamed from: e, reason: collision with root package name */
    private int f31744e;

    /* renamed from: dd.p$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3039p b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3039p(eVar, gVar);
        }
    }

    static {
        C3039p c3039p = new C3039p(true);
        f31739f = c3039p;
        c3039p.u();
    }

    public static C3039p r() {
        return f31739f;
    }

    private void u() {
        this.f31742c = kotlin.reflect.jvm.internal.impl.protobuf.m.f36528b;
    }

    public static b v() {
        return b.q();
    }

    public static b w(C3039p c3039p) {
        return v().k(c3039p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31743d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f31743d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f31742c.size(); i10++) {
            fVar.N(1, this.f31742c.y1(i10));
        }
        fVar.h0(this.f31741b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31744e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31742c.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.e(this.f31742c.y1(i12));
        }
        int size = i11 + t().size() + this.f31741b.size();
        this.f31744e = size;
        return size;
    }

    public String s(int i10) {
        return (String) this.f31742c.get(i10);
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.s t() {
        return this.f31742c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b b() {
        return w(this);
    }

    private C3039p(i.b bVar) {
        super(bVar);
        this.f31743d = (byte) -1;
        this.f31744e = -1;
        this.f31741b = bVar.i();
    }

    private C3039p(boolean z10) {
        this.f31743d = (byte) -1;
        this.f31744e = -1;
        this.f31741b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3039p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31743d = (byte) -1;
        this.f31744e = -1;
        u();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 != 10) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.d k10 = eVar.k();
                                if (!z11) {
                                    this.f31742c = new kotlin.reflect.jvm.internal.impl.protobuf.m();
                                    z11 = true;
                                }
                                this.f31742c.U1(k10);
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
                if (z11) {
                    this.f31742c = this.f31742c.K();
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31741b = A10.d();
                    throw th2;
                }
                this.f31741b = A10.d();
                j();
                throw th;
            }
        }
        if (z11) {
            this.f31742c = this.f31742c.K();
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31741b = A10.d();
            throw th3;
        }
        this.f31741b = A10.d();
        j();
    }

    /* renamed from: dd.p$b */
    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31745b;

        /* renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.n f31746c = kotlin.reflect.jvm.internal.impl.protobuf.m.f36528b;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31745b & 1) != 1) {
                this.f31746c = new kotlin.reflect.jvm.internal.impl.protobuf.m(this.f31746c);
                this.f31745b |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3039p c() {
            C3039p o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3039p o() {
            C3039p c3039p = new C3039p(this);
            if ((this.f31745b & 1) == 1) {
                this.f31746c = this.f31746c.K();
                this.f31745b &= -2;
            }
            c3039p.f31742c = this.f31746c;
            return c3039p;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b k(C3039p c3039p) {
            if (c3039p == C3039p.r()) {
                return this;
            }
            if (!c3039p.f31742c.isEmpty()) {
                if (this.f31746c.isEmpty()) {
                    this.f31746c = c3039p.f31742c;
                    this.f31745b &= -2;
                } else {
                    s();
                    this.f31746c.addAll(c3039p.f31742c);
                }
            }
            l(i().e(c3039p.f31741b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3039p c3039p = null;
            try {
                try {
                    C3039p c3039p2 = (C3039p) C3039p.f31740g.b(eVar, gVar);
                    if (c3039p2 != null) {
                        k(c3039p2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3039p c3039p3 = (C3039p) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3039p = c3039p3;
                        if (c3039p != null) {
                            k(c3039p);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3039p != null) {
                }
                throw th;
            }
        }

        private void v() {
        }
    }
}
