package dd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* renamed from: dd.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3043t extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: h, reason: collision with root package name */
    private static final C3043t f31840h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31841i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31842b;

    /* renamed from: c, reason: collision with root package name */
    private int f31843c;

    /* renamed from: d, reason: collision with root package name */
    private List f31844d;

    /* renamed from: e, reason: collision with root package name */
    private int f31845e;

    /* renamed from: f, reason: collision with root package name */
    private byte f31846f;

    /* renamed from: g, reason: collision with root package name */
    private int f31847g;

    /* renamed from: dd.t$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3043t b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3043t(eVar, gVar);
        }
    }

    static {
        C3043t c3043t = new C3043t(true);
        f31840h = c3043t;
        c3043t.z();
    }

    public static b A() {
        return b.q();
    }

    public static b B(C3043t c3043t) {
        return A().k(c3043t);
    }

    public static C3043t t() {
        return f31840h;
    }

    private void z() {
        this.f31844d = Collections.emptyList();
        this.f31845e = -1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b b() {
        return B(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31846f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < w(); i10++) {
            if (!v(i10).a()) {
                this.f31846f = (byte) 0;
                return false;
            }
        }
        this.f31846f = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f31844d.size(); i10++) {
            fVar.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31844d.get(i10));
        }
        if ((this.f31843c & 1) == 1) {
            fVar.Z(2, this.f31845e);
        }
        fVar.h0(this.f31842b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31847g;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31844d.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31844d.get(i12));
        }
        if ((this.f31843c & 1) == 1) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31845e);
        }
        int size = i11 + this.f31842b.size();
        this.f31847g = size;
        return size;
    }

    public int u() {
        return this.f31845e;
    }

    public C3040q v(int i10) {
        return (C3040q) this.f31844d.get(i10);
    }

    public int w() {
        return this.f31844d.size();
    }

    public List x() {
        return this.f31844d;
    }

    public boolean y() {
        return (this.f31843c & 1) == 1;
    }

    private C3043t(i.b bVar) {
        super(bVar);
        this.f31846f = (byte) -1;
        this.f31847g = -1;
        this.f31842b = bVar.i();
    }

    private C3043t(boolean z10) {
        this.f31846f = (byte) -1;
        this.f31847g = -1;
        this.f31842b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3043t(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31846f = (byte) -1;
        this.f31847g = -1;
        z();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 10) {
                            if (!z11) {
                                this.f31844d = new ArrayList();
                                z11 = true;
                            }
                            this.f31844d.add(eVar.t(C3040q.f31748v, gVar));
                        } else if (J10 != 16) {
                            if (!m(eVar, I10, gVar, J10)) {
                            }
                        } else {
                            this.f31843c |= 1;
                            this.f31845e = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f31844d = Collections.unmodifiableList(this.f31844d);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31842b = A10.d();
                        throw th2;
                    }
                    this.f31842b = A10.d();
                    j();
                    throw th;
                }
            } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
            }
        }
        if (z11) {
            this.f31844d = Collections.unmodifiableList(this.f31844d);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31842b = A10.d();
            throw th3;
        }
        this.f31842b = A10.d();
        j();
    }

    /* renamed from: dd.t$b */
    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31848b;

        /* renamed from: c, reason: collision with root package name */
        private List f31849c = Collections.emptyList();

        /* renamed from: d, reason: collision with root package name */
        private int f31850d = -1;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31848b & 1) != 1) {
                this.f31849c = new ArrayList(this.f31849c);
                this.f31848b |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3043t c() {
            C3043t o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3043t o() {
            C3043t c3043t = new C3043t(this);
            int i10 = this.f31848b;
            if ((i10 & 1) == 1) {
                this.f31849c = Collections.unmodifiableList(this.f31849c);
                this.f31848b &= -2;
            }
            c3043t.f31844d = this.f31849c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            c3043t.f31845e = this.f31850d;
            c3043t.f31843c = i11;
            return c3043t;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b k(C3043t c3043t) {
            if (c3043t == C3043t.t()) {
                return this;
            }
            if (!c3043t.f31844d.isEmpty()) {
                if (this.f31849c.isEmpty()) {
                    this.f31849c = c3043t.f31844d;
                    this.f31848b &= -2;
                } else {
                    s();
                    this.f31849c.addAll(c3043t.f31844d);
                }
            }
            if (c3043t.y()) {
                y(c3043t.u());
            }
            l(i().e(c3043t.f31842b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3043t c3043t = null;
            try {
                try {
                    C3043t c3043t2 = (C3043t) C3043t.f31841i.b(eVar, gVar);
                    if (c3043t2 != null) {
                        k(c3043t2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3043t c3043t3 = (C3043t) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3043t = c3043t3;
                        if (c3043t != null) {
                            k(c3043t);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3043t != null) {
                }
                throw th;
            }
        }

        public b y(int i10) {
            this.f31848b |= 2;
            this.f31850d = i10;
            return this;
        }

        private void v() {
        }
    }
}
