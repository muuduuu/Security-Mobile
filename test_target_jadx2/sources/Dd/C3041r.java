package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import dd.C3040q;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3041r extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: p, reason: collision with root package name */
    private static final C3041r f31795p;

    /* renamed from: q, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31796q = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31797c;

    /* renamed from: d, reason: collision with root package name */
    private int f31798d;

    /* renamed from: e, reason: collision with root package name */
    private int f31799e;

    /* renamed from: f, reason: collision with root package name */
    private int f31800f;

    /* renamed from: g, reason: collision with root package name */
    private List f31801g;

    /* renamed from: h, reason: collision with root package name */
    private C3040q f31802h;

    /* renamed from: i, reason: collision with root package name */
    private int f31803i;

    /* renamed from: j, reason: collision with root package name */
    private C3040q f31804j;

    /* renamed from: k, reason: collision with root package name */
    private int f31805k;

    /* renamed from: l, reason: collision with root package name */
    private List f31806l;

    /* renamed from: m, reason: collision with root package name */
    private List f31807m;

    /* renamed from: n, reason: collision with root package name */
    private byte f31808n;

    /* renamed from: o, reason: collision with root package name */
    private int f31809o;

    /* renamed from: dd.r$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3041r b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3041r(eVar, gVar);
        }
    }

    static {
        C3041r c3041r = new C3041r(true);
        f31795p = c3041r;
        c3041r.g0();
    }

    public static C3041r O() {
        return f31795p;
    }

    private void g0() {
        this.f31799e = 6;
        this.f31800f = 0;
        this.f31801g = Collections.emptyList();
        this.f31802h = C3040q.U();
        this.f31803i = 0;
        this.f31804j = C3040q.U();
        this.f31805k = 0;
        this.f31806l = Collections.emptyList();
        this.f31807m = Collections.emptyList();
    }

    public static b h0() {
        return b.x();
    }

    public static b i0(C3041r c3041r) {
        return h0().k(c3041r);
    }

    public static C3041r k0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        return (C3041r) f31796q.c(inputStream, gVar);
    }

    public C3025b L(int i10) {
        return (C3025b) this.f31806l.get(i10);
    }

    public int M() {
        return this.f31806l.size();
    }

    public List N() {
        return this.f31806l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public C3041r getDefaultInstanceForType() {
        return f31795p;
    }

    public C3040q Q() {
        return this.f31804j;
    }

    public int R() {
        return this.f31805k;
    }

    public int S() {
        return this.f31799e;
    }

    public int T() {
        return this.f31800f;
    }

    public C3042s U(int i10) {
        return (C3042s) this.f31801g.get(i10);
    }

    public int V() {
        return this.f31801g.size();
    }

    public List W() {
        return this.f31801g;
    }

    public C3040q X() {
        return this.f31802h;
    }

    public int Y() {
        return this.f31803i;
    }

    public List Z() {
        return this.f31807m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31808n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!d0()) {
            this.f31808n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < V(); i10++) {
            if (!U(i10).a()) {
                this.f31808n = (byte) 0;
                return false;
            }
        }
        if (e0() && !X().a()) {
            this.f31808n = (byte) 0;
            return false;
        }
        if (a0() && !Q().a()) {
            this.f31808n = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < M(); i11++) {
            if (!L(i11).a()) {
                this.f31808n = (byte) 0;
                return false;
            }
        }
        if (p()) {
            this.f31808n = (byte) 1;
            return true;
        }
        this.f31808n = (byte) 0;
        return false;
    }

    public boolean a0() {
        return (this.f31798d & 16) == 16;
    }

    public boolean b0() {
        return (this.f31798d & 32) == 32;
    }

    public boolean c0() {
        return (this.f31798d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31798d & 1) == 1) {
            fVar.Z(1, this.f31799e);
        }
        if ((this.f31798d & 2) == 2) {
            fVar.Z(2, this.f31800f);
        }
        for (int i10 = 0; i10 < this.f31801g.size(); i10++) {
            fVar.c0(3, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31801g.get(i10));
        }
        if ((this.f31798d & 4) == 4) {
            fVar.c0(4, this.f31802h);
        }
        if ((this.f31798d & 8) == 8) {
            fVar.Z(5, this.f31803i);
        }
        if ((this.f31798d & 16) == 16) {
            fVar.c0(6, this.f31804j);
        }
        if ((this.f31798d & 32) == 32) {
            fVar.Z(7, this.f31805k);
        }
        for (int i11 = 0; i11 < this.f31806l.size(); i11++) {
            fVar.c0(8, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31806l.get(i11));
        }
        for (int i12 = 0; i12 < this.f31807m.size(); i12++) {
            fVar.Z(31, ((Integer) this.f31807m.get(i12)).intValue());
        }
        v10.a(200, fVar);
        fVar.h0(this.f31797c);
    }

    public boolean d0() {
        return (this.f31798d & 2) == 2;
    }

    public boolean e0() {
        return (this.f31798d & 4) == 4;
    }

    public boolean f0() {
        return (this.f31798d & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31809o;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31798d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31799e) : 0;
        if ((this.f31798d & 2) == 2) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31800f);
        }
        for (int i11 = 0; i11 < this.f31801g.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31801g.get(i11));
        }
        if ((this.f31798d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, this.f31802h);
        }
        if ((this.f31798d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(5, this.f31803i);
        }
        if ((this.f31798d & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(6, this.f31804j);
        }
        if ((this.f31798d & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(7, this.f31805k);
        }
        for (int i12 = 0; i12 < this.f31806l.size(); i12++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(8, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31806l.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f31807m.size(); i14++) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31807m.get(i14)).intValue());
        }
        int size = o10 + i13 + (Z().size() * 2) + q() + this.f31797c.size();
        this.f31809o = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return i0(this);
    }

    private C3041r(i.c cVar) {
        super(cVar);
        this.f31808n = (byte) -1;
        this.f31809o = -1;
        this.f31797c = cVar.i();
    }

    private C3041r(boolean z10) {
        this.f31808n = (byte) -1;
        this.f31809o = -1;
        this.f31797c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3041r(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        C3040q.c b10;
        this.f31808n = (byte) -1;
        this.f31809o = -1;
        g0();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? r52 = 128;
            if (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        switch (J10) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f31798d |= 1;
                                this.f31799e = eVar.r();
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                this.f31798d |= 2;
                                this.f31800f = eVar.r();
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f31801g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f31801g.add(eVar.t(C3042s.f31821o, gVar));
                            case 34:
                                b10 = (this.f31798d & 4) == 4 ? this.f31802h.b() : null;
                                C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31802h = c3040q;
                                if (b10 != null) {
                                    b10.k(c3040q);
                                    this.f31802h = b10.v();
                                }
                                this.f31798d |= 4;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                this.f31798d |= 8;
                                this.f31803i = eVar.r();
                            case 50:
                                b10 = (this.f31798d & 16) == 16 ? this.f31804j.b() : null;
                                C3040q c3040q2 = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31804j = c3040q2;
                                if (b10 != null) {
                                    b10.k(c3040q2);
                                    this.f31804j = b10.v();
                                }
                                this.f31798d |= 16;
                            case 56:
                                this.f31798d |= 32;
                                this.f31805k = eVar.r();
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f31806l = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f31806l.add(eVar.t(C3025b.f31437i, gVar));
                            case 248:
                                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                    this.f31807m = new ArrayList();
                                    i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                this.f31807m.add(Integer.valueOf(eVar.r()));
                            case 250:
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && eVar.e() > 0) {
                                    this.f31807m = new ArrayList();
                                    i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                while (eVar.e() > 0) {
                                    this.f31807m.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                                break;
                            default:
                                r52 = m(eVar, I10, gVar, J10);
                                if (r52 == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (Throwable th) {
                        if ((i10 & 4) == 4) {
                            this.f31801g = Collections.unmodifiableList(this.f31801g);
                        }
                        if ((i10 & 128) == r52) {
                            this.f31806l = Collections.unmodifiableList(this.f31806l);
                        }
                        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                            this.f31807m = Collections.unmodifiableList(this.f31807m);
                        }
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f31797c = A10.d();
                            throw th2;
                        }
                        this.f31797c = A10.d();
                        j();
                        throw th;
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f31801g = Collections.unmodifiableList(this.f31801g);
                }
                if ((i10 & 128) == 128) {
                    this.f31806l = Collections.unmodifiableList(this.f31806l);
                }
                if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31807m = Collections.unmodifiableList(this.f31807m);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f31797c = A10.d();
                    throw th3;
                }
                this.f31797c = A10.d();
                j();
                return;
            }
        }
    }

    /* renamed from: dd.r$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31810d;

        /* renamed from: f, reason: collision with root package name */
        private int f31812f;

        /* renamed from: i, reason: collision with root package name */
        private int f31815i;

        /* renamed from: k, reason: collision with root package name */
        private int f31817k;

        /* renamed from: e, reason: collision with root package name */
        private int f31811e = 6;

        /* renamed from: g, reason: collision with root package name */
        private List f31813g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private C3040q f31814h = C3040q.U();

        /* renamed from: j, reason: collision with root package name */
        private C3040q f31816j = C3040q.U();

        /* renamed from: l, reason: collision with root package name */
        private List f31818l = Collections.emptyList();

        /* renamed from: m, reason: collision with root package name */
        private List f31819m = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f31810d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f31819m = new ArrayList(this.f31819m);
                this.f31810d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31810d & 128) != 128) {
                this.f31818l = new ArrayList(this.f31818l);
                this.f31810d |= 128;
            }
        }

        private void z() {
            if ((this.f31810d & 4) != 4) {
                this.f31813g = new ArrayList(this.f31813g);
                this.f31810d |= 4;
            }
        }

        public b C(C3040q c3040q) {
            if ((this.f31810d & 32) != 32 || this.f31816j == C3040q.U()) {
                this.f31816j = c3040q;
            } else {
                this.f31816j = C3040q.v0(this.f31816j).k(c3040q).v();
            }
            this.f31810d |= 32;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b k(C3041r c3041r) {
            if (c3041r == C3041r.O()) {
                return this;
            }
            if (c3041r.c0()) {
                J(c3041r.S());
            }
            if (c3041r.d0()) {
                K(c3041r.T());
            }
            if (!c3041r.f31801g.isEmpty()) {
                if (this.f31813g.isEmpty()) {
                    this.f31813g = c3041r.f31801g;
                    this.f31810d &= -5;
                } else {
                    z();
                    this.f31813g.addAll(c3041r.f31801g);
                }
            }
            if (c3041r.e0()) {
                G(c3041r.X());
            }
            if (c3041r.f0()) {
                L(c3041r.Y());
            }
            if (c3041r.a0()) {
                C(c3041r.Q());
            }
            if (c3041r.b0()) {
                H(c3041r.R());
            }
            if (!c3041r.f31806l.isEmpty()) {
                if (this.f31818l.isEmpty()) {
                    this.f31818l = c3041r.f31806l;
                    this.f31810d &= -129;
                } else {
                    y();
                    this.f31818l.addAll(c3041r.f31806l);
                }
            }
            if (!c3041r.f31807m.isEmpty()) {
                if (this.f31819m.isEmpty()) {
                    this.f31819m = c3041r.f31807m;
                    this.f31810d &= -257;
                } else {
                    A();
                    this.f31819m.addAll(c3041r.f31807m);
                }
            }
            p(c3041r);
            l(i().e(c3041r.f31797c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3041r c3041r = null;
            try {
                try {
                    C3041r c3041r2 = (C3041r) C3041r.f31796q.b(eVar, gVar);
                    if (c3041r2 != null) {
                        k(c3041r2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3041r c3041r3 = (C3041r) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3041r = c3041r3;
                        if (c3041r != null) {
                            k(c3041r);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3041r != null) {
                }
                throw th;
            }
        }

        public b G(C3040q c3040q) {
            if ((this.f31810d & 8) != 8 || this.f31814h == C3040q.U()) {
                this.f31814h = c3040q;
            } else {
                this.f31814h = C3040q.v0(this.f31814h).k(c3040q).v();
            }
            this.f31810d |= 8;
            return this;
        }

        public b H(int i10) {
            this.f31810d |= 64;
            this.f31817k = i10;
            return this;
        }

        public b J(int i10) {
            this.f31810d |= 1;
            this.f31811e = i10;
            return this;
        }

        public b K(int i10) {
            this.f31810d |= 2;
            this.f31812f = i10;
            return this;
        }

        public b L(int i10) {
            this.f31810d |= 16;
            this.f31815i = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3041r c() {
            C3041r v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3041r v() {
            C3041r c3041r = new C3041r(this);
            int i10 = this.f31810d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3041r.f31799e = this.f31811e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3041r.f31800f = this.f31812f;
            if ((this.f31810d & 4) == 4) {
                this.f31813g = Collections.unmodifiableList(this.f31813g);
                this.f31810d &= -5;
            }
            c3041r.f31801g = this.f31813g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            c3041r.f31802h = this.f31814h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            c3041r.f31803i = this.f31815i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            c3041r.f31804j = this.f31816j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3041r.f31805k = this.f31817k;
            if ((this.f31810d & 128) == 128) {
                this.f31818l = Collections.unmodifiableList(this.f31818l);
                this.f31810d &= -129;
            }
            c3041r.f31806l = this.f31818l;
            if ((this.f31810d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f31819m = Collections.unmodifiableList(this.f31819m);
                this.f31810d &= -257;
            }
            c3041r.f31807m = this.f31819m;
            c3041r.f31798d = i11;
            return c3041r;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void B() {
        }
    }
}
