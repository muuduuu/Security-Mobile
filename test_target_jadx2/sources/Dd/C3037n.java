package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import dd.C3040q;
import dd.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3037n extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: v, reason: collision with root package name */
    private static final C3037n f31682v;

    /* renamed from: w, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31683w = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31684c;

    /* renamed from: d, reason: collision with root package name */
    private int f31685d;

    /* renamed from: e, reason: collision with root package name */
    private int f31686e;

    /* renamed from: f, reason: collision with root package name */
    private int f31687f;

    /* renamed from: g, reason: collision with root package name */
    private int f31688g;

    /* renamed from: h, reason: collision with root package name */
    private C3040q f31689h;

    /* renamed from: i, reason: collision with root package name */
    private int f31690i;

    /* renamed from: j, reason: collision with root package name */
    private List f31691j;

    /* renamed from: k, reason: collision with root package name */
    private C3040q f31692k;

    /* renamed from: l, reason: collision with root package name */
    private int f31693l;

    /* renamed from: m, reason: collision with root package name */
    private List f31694m;

    /* renamed from: n, reason: collision with root package name */
    private List f31695n;

    /* renamed from: o, reason: collision with root package name */
    private int f31696o;

    /* renamed from: p, reason: collision with root package name */
    private u f31697p;

    /* renamed from: q, reason: collision with root package name */
    private int f31698q;

    /* renamed from: r, reason: collision with root package name */
    private int f31699r;

    /* renamed from: s, reason: collision with root package name */
    private List f31700s;

    /* renamed from: t, reason: collision with root package name */
    private byte f31701t;

    /* renamed from: u, reason: collision with root package name */
    private int f31702u;

    /* renamed from: dd.n$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3037n b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3037n(eVar, gVar);
        }
    }

    static {
        C3037n c3037n = new C3037n(true);
        f31682v = c3037n;
        c3037n.v0();
    }

    public static C3037n V() {
        return f31682v;
    }

    private void v0() {
        this.f31686e = 518;
        this.f31687f = 2054;
        this.f31688g = 0;
        this.f31689h = C3040q.U();
        this.f31690i = 0;
        this.f31691j = Collections.emptyList();
        this.f31692k = C3040q.U();
        this.f31693l = 0;
        this.f31694m = Collections.emptyList();
        this.f31695n = Collections.emptyList();
        this.f31697p = u.F();
        this.f31698q = 0;
        this.f31699r = 0;
        this.f31700s = Collections.emptyList();
    }

    public static b w0() {
        return b.x();
    }

    public static b x0(C3037n c3037n) {
        return w0().k(c3037n);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return x0(this);
    }

    public C3040q R(int i10) {
        return (C3040q) this.f31694m.get(i10);
    }

    public int S() {
        return this.f31694m.size();
    }

    public List T() {
        return this.f31695n;
    }

    public List U() {
        return this.f31694m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C3037n getDefaultInstanceForType() {
        return f31682v;
    }

    public int X() {
        return this.f31686e;
    }

    public int Y() {
        return this.f31698q;
    }

    public int Z() {
        return this.f31688g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31701t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!n0()) {
            this.f31701t = (byte) 0;
            return false;
        }
        if (r0() && !d0().a()) {
            this.f31701t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < i0(); i10++) {
            if (!h0(i10).a()) {
                this.f31701t = (byte) 0;
                return false;
            }
        }
        if (p0() && !b0().a()) {
            this.f31701t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < S(); i11++) {
            if (!R(i11).a()) {
                this.f31701t = (byte) 0;
                return false;
            }
        }
        if (u0() && !g0().a()) {
            this.f31701t = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31701t = (byte) 1;
            return true;
        }
        this.f31701t = (byte) 0;
        return false;
    }

    public int a0() {
        return this.f31687f;
    }

    public C3040q b0() {
        return this.f31692k;
    }

    public int c0() {
        return this.f31693l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31685d & 2) == 2) {
            fVar.Z(1, this.f31687f);
        }
        if ((this.f31685d & 4) == 4) {
            fVar.Z(2, this.f31688g);
        }
        if ((this.f31685d & 8) == 8) {
            fVar.c0(3, this.f31689h);
        }
        for (int i10 = 0; i10 < this.f31691j.size(); i10++) {
            fVar.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31691j.get(i10));
        }
        if ((this.f31685d & 32) == 32) {
            fVar.c0(5, this.f31692k);
        }
        if ((this.f31685d & 128) == 128) {
            fVar.c0(6, this.f31697p);
        }
        if ((this.f31685d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.Z(7, this.f31698q);
        }
        if ((this.f31685d & 512) == 512) {
            fVar.Z(8, this.f31699r);
        }
        if ((this.f31685d & 16) == 16) {
            fVar.Z(9, this.f31690i);
        }
        if ((this.f31685d & 64) == 64) {
            fVar.Z(10, this.f31693l);
        }
        if ((this.f31685d & 1) == 1) {
            fVar.Z(11, this.f31686e);
        }
        for (int i11 = 0; i11 < this.f31694m.size(); i11++) {
            fVar.c0(12, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31694m.get(i11));
        }
        if (T().size() > 0) {
            fVar.n0(106);
            fVar.n0(this.f31696o);
        }
        for (int i12 = 0; i12 < this.f31695n.size(); i12++) {
            fVar.a0(((Integer) this.f31695n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f31700s.size(); i13++) {
            fVar.Z(31, ((Integer) this.f31700s.get(i13)).intValue());
        }
        v10.a(19000, fVar);
        fVar.h0(this.f31684c);
    }

    public C3040q d0() {
        return this.f31689h;
    }

    public int e0() {
        return this.f31690i;
    }

    public int f0() {
        return this.f31699r;
    }

    public u g0() {
        return this.f31697p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31702u;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31685d & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31687f) : 0;
        if ((this.f31685d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31688g);
        }
        if ((this.f31685d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, this.f31689h);
        }
        for (int i11 = 0; i11 < this.f31691j.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31691j.get(i11));
        }
        if ((this.f31685d & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, this.f31692k);
        }
        if ((this.f31685d & 128) == 128) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(6, this.f31697p);
        }
        if ((this.f31685d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(7, this.f31698q);
        }
        if ((this.f31685d & 512) == 512) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(8, this.f31699r);
        }
        if ((this.f31685d & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(9, this.f31690i);
        }
        if ((this.f31685d & 64) == 64) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(10, this.f31693l);
        }
        if ((this.f31685d & 1) == 1) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(11, this.f31686e);
        }
        for (int i12 = 0; i12 < this.f31694m.size(); i12++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(12, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31694m.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f31695n.size(); i14++) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31695n.get(i14)).intValue());
        }
        int i15 = o10 + i13;
        if (!T().isEmpty()) {
            i15 = i15 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i13);
        }
        this.f31696o = i13;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f31700s.size(); i17++) {
            i16 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31700s.get(i17)).intValue());
        }
        int size = i15 + i16 + (k0().size() * 2) + q() + this.f31684c.size();
        this.f31702u = size;
        return size;
    }

    public C3042s h0(int i10) {
        return (C3042s) this.f31691j.get(i10);
    }

    public int i0() {
        return this.f31691j.size();
    }

    public List j0() {
        return this.f31691j;
    }

    public List k0() {
        return this.f31700s;
    }

    public boolean l0() {
        return (this.f31685d & 1) == 1;
    }

    public boolean m0() {
        return (this.f31685d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean n0() {
        return (this.f31685d & 4) == 4;
    }

    public boolean o0() {
        return (this.f31685d & 2) == 2;
    }

    public boolean p0() {
        return (this.f31685d & 32) == 32;
    }

    public boolean q0() {
        return (this.f31685d & 64) == 64;
    }

    public boolean r0() {
        return (this.f31685d & 8) == 8;
    }

    public boolean s0() {
        return (this.f31685d & 16) == 16;
    }

    public boolean t0() {
        return (this.f31685d & 512) == 512;
    }

    public boolean u0() {
        return (this.f31685d & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return w0();
    }

    private C3037n(i.c cVar) {
        super(cVar);
        this.f31696o = -1;
        this.f31701t = (byte) -1;
        this.f31702u = -1;
        this.f31684c = cVar.i();
    }

    private C3037n(boolean z10) {
        this.f31696o = -1;
        this.f31701t = (byte) -1;
        this.f31702u = -1;
        this.f31684c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3037n(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31696o = -1;
        this.f31701t = (byte) -1;
        this.f31702u = -1;
        v0();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? r52 = 256;
            if (!z10) {
                try {
                    try {
                        try {
                            int J10 = eVar.J();
                            switch (J10) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f31685d |= 2;
                                    this.f31687f = eVar.r();
                                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                    this.f31685d |= 4;
                                    this.f31688g = eVar.r();
                                case 26:
                                    C3040q.c b10 = (this.f31685d & 8) == 8 ? this.f31689h.b() : null;
                                    C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                    this.f31689h = c3040q;
                                    if (b10 != null) {
                                        b10.k(c3040q);
                                        this.f31689h = b10.v();
                                    }
                                    this.f31685d |= 8;
                                case 34:
                                    int i10 = (c10 == true ? 1 : 0) & 32;
                                    c10 = c10;
                                    if (i10 != 32) {
                                        this.f31691j = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                    this.f31691j.add(eVar.t(C3042s.f31821o, gVar));
                                case HVError.CONSENT_DENIED /* 42 */:
                                    C3040q.c b11 = (this.f31685d & 32) == 32 ? this.f31692k.b() : null;
                                    C3040q c3040q2 = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                    this.f31692k = c3040q2;
                                    if (b11 != null) {
                                        b11.k(c3040q2);
                                        this.f31692k = b11.v();
                                    }
                                    this.f31685d |= 32;
                                case 50:
                                    u.b b12 = (this.f31685d & 128) == 128 ? this.f31697p.b() : null;
                                    u uVar = (u) eVar.t(u.f31852n, gVar);
                                    this.f31697p = uVar;
                                    if (b12 != null) {
                                        b12.k(uVar);
                                        this.f31697p = b12.v();
                                    }
                                    this.f31685d |= 128;
                                case 56:
                                    this.f31685d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    this.f31698q = eVar.r();
                                case 64:
                                    this.f31685d |= 512;
                                    this.f31699r = eVar.r();
                                case 72:
                                    this.f31685d |= 16;
                                    this.f31690i = eVar.r();
                                case 80:
                                    this.f31685d |= 64;
                                    this.f31693l = eVar.r();
                                case 88:
                                    this.f31685d |= 1;
                                    this.f31686e = eVar.r();
                                case 98:
                                    int i11 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    c10 = c10;
                                    if (i11 != 256) {
                                        this.f31694m = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 256;
                                    }
                                    this.f31694m.add(eVar.t(C3040q.f31748v, gVar));
                                case 104:
                                    int i12 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i12 != 512) {
                                        this.f31695n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                    this.f31695n.add(Integer.valueOf(eVar.r()));
                                case 106:
                                    int i13 = eVar.i(eVar.z());
                                    int i14 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i14 != 512) {
                                        c10 = c10;
                                        if (eVar.e() > 0) {
                                            this.f31695n = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f31695n.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i13);
                                case 248:
                                    int i15 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i15 != 8192) {
                                        this.f31700s = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f31700s.add(Integer.valueOf(eVar.r()));
                                case 250:
                                    int i16 = eVar.i(eVar.z());
                                    int i17 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i17 != 8192) {
                                        c10 = c10;
                                        if (eVar.e() > 0) {
                                            this.f31700s = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.f31700s.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i16);
                                default:
                                    r52 = m(eVar, I10, gVar, J10);
                                    if (r52 == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (IOException e10) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e10.getMessage()).i(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f31691j = Collections.unmodifiableList(this.f31691j);
                    }
                    if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == r52) {
                        this.f31694m = Collections.unmodifiableList(this.f31694m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f31695n = Collections.unmodifiableList(this.f31695n);
                    }
                    if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f31700s = Collections.unmodifiableList(this.f31700s);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31684c = A10.d();
                        throw th2;
                    }
                    this.f31684c = A10.d();
                    j();
                    throw th;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f31691j = Collections.unmodifiableList(this.f31691j);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31694m = Collections.unmodifiableList(this.f31694m);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f31695n = Collections.unmodifiableList(this.f31695n);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f31700s = Collections.unmodifiableList(this.f31700s);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f31684c = A10.d();
                    throw th3;
                }
                this.f31684c = A10.d();
                j();
                return;
            }
        }
    }

    /* renamed from: dd.n$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31703d;

        /* renamed from: g, reason: collision with root package name */
        private int f31706g;

        /* renamed from: i, reason: collision with root package name */
        private int f31708i;

        /* renamed from: l, reason: collision with root package name */
        private int f31711l;

        /* renamed from: p, reason: collision with root package name */
        private int f31715p;

        /* renamed from: q, reason: collision with root package name */
        private int f31716q;

        /* renamed from: e, reason: collision with root package name */
        private int f31704e = 518;

        /* renamed from: f, reason: collision with root package name */
        private int f31705f = 2054;

        /* renamed from: h, reason: collision with root package name */
        private C3040q f31707h = C3040q.U();

        /* renamed from: j, reason: collision with root package name */
        private List f31709j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private C3040q f31710k = C3040q.U();

        /* renamed from: m, reason: collision with root package name */
        private List f31712m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f31713n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private u f31714o = u.F();

        /* renamed from: r, reason: collision with root package name */
        private List f31717r = Collections.emptyList();

        private b() {
            C();
        }

        private void A() {
            if ((this.f31703d & 32) != 32) {
                this.f31709j = new ArrayList(this.f31709j);
                this.f31703d |= 32;
            }
        }

        private void B() {
            if ((this.f31703d & 8192) != 8192) {
                this.f31717r = new ArrayList(this.f31717r);
                this.f31703d |= 8192;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31703d & 512) != 512) {
                this.f31713n = new ArrayList(this.f31713n);
                this.f31703d |= 512;
            }
        }

        private void z() {
            if ((this.f31703d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f31712m = new ArrayList(this.f31712m);
                this.f31703d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b k(C3037n c3037n) {
            if (c3037n == C3037n.V()) {
                return this;
            }
            if (c3037n.l0()) {
                K(c3037n.X());
            }
            if (c3037n.o0()) {
                N(c3037n.a0());
            }
            if (c3037n.n0()) {
                M(c3037n.Z());
            }
            if (c3037n.r0()) {
                H(c3037n.d0());
            }
            if (c3037n.s0()) {
                P(c3037n.e0());
            }
            if (!c3037n.f31691j.isEmpty()) {
                if (this.f31709j.isEmpty()) {
                    this.f31709j = c3037n.f31691j;
                    this.f31703d &= -33;
                } else {
                    A();
                    this.f31709j.addAll(c3037n.f31691j);
                }
            }
            if (c3037n.p0()) {
                G(c3037n.b0());
            }
            if (c3037n.q0()) {
                O(c3037n.c0());
            }
            if (!c3037n.f31694m.isEmpty()) {
                if (this.f31712m.isEmpty()) {
                    this.f31712m = c3037n.f31694m;
                    this.f31703d &= -257;
                } else {
                    z();
                    this.f31712m.addAll(c3037n.f31694m);
                }
            }
            if (!c3037n.f31695n.isEmpty()) {
                if (this.f31713n.isEmpty()) {
                    this.f31713n = c3037n.f31695n;
                    this.f31703d &= -513;
                } else {
                    y();
                    this.f31713n.addAll(c3037n.f31695n);
                }
            }
            if (c3037n.u0()) {
                J(c3037n.g0());
            }
            if (c3037n.m0()) {
                L(c3037n.Y());
            }
            if (c3037n.t0()) {
                Q(c3037n.f0());
            }
            if (!c3037n.f31700s.isEmpty()) {
                if (this.f31717r.isEmpty()) {
                    this.f31717r = c3037n.f31700s;
                    this.f31703d &= -8193;
                } else {
                    B();
                    this.f31717r.addAll(c3037n.f31700s);
                }
            }
            p(c3037n);
            l(i().e(c3037n.f31684c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3037n c3037n = null;
            try {
                try {
                    C3037n c3037n2 = (C3037n) C3037n.f31683w.b(eVar, gVar);
                    if (c3037n2 != null) {
                        k(c3037n2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3037n c3037n3 = (C3037n) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3037n = c3037n3;
                        if (c3037n != null) {
                            k(c3037n);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3037n != null) {
                }
                throw th;
            }
        }

        public b G(C3040q c3040q) {
            if ((this.f31703d & 64) != 64 || this.f31710k == C3040q.U()) {
                this.f31710k = c3040q;
            } else {
                this.f31710k = C3040q.v0(this.f31710k).k(c3040q).v();
            }
            this.f31703d |= 64;
            return this;
        }

        public b H(C3040q c3040q) {
            if ((this.f31703d & 8) != 8 || this.f31707h == C3040q.U()) {
                this.f31707h = c3040q;
            } else {
                this.f31707h = C3040q.v0(this.f31707h).k(c3040q).v();
            }
            this.f31703d |= 8;
            return this;
        }

        public b J(u uVar) {
            if ((this.f31703d & 1024) != 1024 || this.f31714o == u.F()) {
                this.f31714o = uVar;
            } else {
                this.f31714o = u.V(this.f31714o).k(uVar).v();
            }
            this.f31703d |= 1024;
            return this;
        }

        public b K(int i10) {
            this.f31703d |= 1;
            this.f31704e = i10;
            return this;
        }

        public b L(int i10) {
            this.f31703d |= 2048;
            this.f31715p = i10;
            return this;
        }

        public b M(int i10) {
            this.f31703d |= 4;
            this.f31706g = i10;
            return this;
        }

        public b N(int i10) {
            this.f31703d |= 2;
            this.f31705f = i10;
            return this;
        }

        public b O(int i10) {
            this.f31703d |= 128;
            this.f31711l = i10;
            return this;
        }

        public b P(int i10) {
            this.f31703d |= 16;
            this.f31708i = i10;
            return this;
        }

        public b Q(int i10) {
            this.f31703d |= 4096;
            this.f31716q = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3037n c() {
            C3037n v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3037n v() {
            C3037n c3037n = new C3037n(this);
            int i10 = this.f31703d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3037n.f31686e = this.f31704e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3037n.f31687f = this.f31705f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3037n.f31688g = this.f31706g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3037n.f31689h = this.f31707h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3037n.f31690i = this.f31708i;
            if ((this.f31703d & 32) == 32) {
                this.f31709j = Collections.unmodifiableList(this.f31709j);
                this.f31703d &= -33;
            }
            c3037n.f31691j = this.f31709j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3037n.f31692k = this.f31710k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3037n.f31693l = this.f31711l;
            if ((this.f31703d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f31712m = Collections.unmodifiableList(this.f31712m);
                this.f31703d &= -257;
            }
            c3037n.f31694m = this.f31712m;
            if ((this.f31703d & 512) == 512) {
                this.f31713n = Collections.unmodifiableList(this.f31713n);
                this.f31703d &= -513;
            }
            c3037n.f31695n = this.f31713n;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            c3037n.f31697p = this.f31714o;
            if ((i10 & 2048) == 2048) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            c3037n.f31698q = this.f31715p;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            c3037n.f31699r = this.f31716q;
            if ((this.f31703d & 8192) == 8192) {
                this.f31717r = Collections.unmodifiableList(this.f31717r);
                this.f31703d &= -8193;
            }
            c3037n.f31700s = this.f31717r;
            c3037n.f31685d = i11;
            return c3037n;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void C() {
        }
    }
}
