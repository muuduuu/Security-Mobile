package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import dd.C3028e;
import dd.C3040q;
import dd.C3043t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3032i extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: v, reason: collision with root package name */
    private static final C3032i f31614v;

    /* renamed from: w, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31615w = new a();

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31616c;

    /* renamed from: d, reason: collision with root package name */
    private int f31617d;

    /* renamed from: e, reason: collision with root package name */
    private int f31618e;

    /* renamed from: f, reason: collision with root package name */
    private int f31619f;

    /* renamed from: g, reason: collision with root package name */
    private int f31620g;

    /* renamed from: h, reason: collision with root package name */
    private C3040q f31621h;

    /* renamed from: i, reason: collision with root package name */
    private int f31622i;

    /* renamed from: j, reason: collision with root package name */
    private List f31623j;

    /* renamed from: k, reason: collision with root package name */
    private C3040q f31624k;

    /* renamed from: l, reason: collision with root package name */
    private int f31625l;

    /* renamed from: m, reason: collision with root package name */
    private List f31626m;

    /* renamed from: n, reason: collision with root package name */
    private List f31627n;

    /* renamed from: o, reason: collision with root package name */
    private int f31628o;

    /* renamed from: p, reason: collision with root package name */
    private List f31629p;

    /* renamed from: q, reason: collision with root package name */
    private C3043t f31630q;

    /* renamed from: r, reason: collision with root package name */
    private List f31631r;

    /* renamed from: s, reason: collision with root package name */
    private C3028e f31632s;

    /* renamed from: t, reason: collision with root package name */
    private byte f31633t;

    /* renamed from: u, reason: collision with root package name */
    private int f31634u;

    /* renamed from: dd.i$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3032i b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3032i(eVar, gVar);
        }
    }

    static {
        C3032i c3032i = new C3032i(true);
        f31614v = c3032i;
        c3032i.x0();
    }

    public static b A0(C3032i c3032i) {
        return z0().k(c3032i);
    }

    public static C3032i C0(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        return (C3032i) f31615w.a(inputStream, gVar);
    }

    public static C3032i X() {
        return f31614v;
    }

    private void x0() {
        this.f31618e = 6;
        this.f31619f = 6;
        this.f31620g = 0;
        this.f31621h = C3040q.U();
        this.f31622i = 0;
        this.f31623j = Collections.emptyList();
        this.f31624k = C3040q.U();
        this.f31625l = 0;
        this.f31626m = Collections.emptyList();
        this.f31627n = Collections.emptyList();
        this.f31629p = Collections.emptyList();
        this.f31630q = C3043t.t();
        this.f31631r = Collections.emptyList();
        this.f31632s = C3028e.r();
    }

    public static b z0() {
        return b.x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return z0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return A0(this);
    }

    public C3040q S(int i10) {
        return (C3040q) this.f31626m.get(i10);
    }

    public int T() {
        return this.f31626m.size();
    }

    public List U() {
        return this.f31627n;
    }

    public List V() {
        return this.f31626m;
    }

    public C3028e W() {
        return this.f31632s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C3032i getDefaultInstanceForType() {
        return f31614v;
    }

    public int Z() {
        return this.f31618e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31633t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!q0()) {
            this.f31633t = (byte) 0;
            return false;
        }
        if (u0() && !e0().a()) {
            this.f31633t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < h0(); i10++) {
            if (!g0(i10).a()) {
                this.f31633t = (byte) 0;
                return false;
            }
        }
        if (s0() && !c0().a()) {
            this.f31633t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < T(); i11++) {
            if (!S(i11).a()) {
                this.f31633t = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < l0(); i12++) {
            if (!k0(i12).a()) {
                this.f31633t = (byte) 0;
                return false;
            }
        }
        if (w0() && !j0().a()) {
            this.f31633t = (byte) 0;
            return false;
        }
        if (o0() && !W().a()) {
            this.f31633t = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31633t = (byte) 1;
            return true;
        }
        this.f31633t = (byte) 0;
        return false;
    }

    public int a0() {
        return this.f31620g;
    }

    public int b0() {
        return this.f31619f;
    }

    public C3040q c0() {
        return this.f31624k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31617d & 2) == 2) {
            fVar.Z(1, this.f31619f);
        }
        if ((this.f31617d & 4) == 4) {
            fVar.Z(2, this.f31620g);
        }
        if ((this.f31617d & 8) == 8) {
            fVar.c0(3, this.f31621h);
        }
        for (int i10 = 0; i10 < this.f31623j.size(); i10++) {
            fVar.c0(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31623j.get(i10));
        }
        if ((this.f31617d & 32) == 32) {
            fVar.c0(5, this.f31624k);
        }
        for (int i11 = 0; i11 < this.f31629p.size(); i11++) {
            fVar.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31629p.get(i11));
        }
        if ((this.f31617d & 16) == 16) {
            fVar.Z(7, this.f31622i);
        }
        if ((this.f31617d & 64) == 64) {
            fVar.Z(8, this.f31625l);
        }
        if ((this.f31617d & 1) == 1) {
            fVar.Z(9, this.f31618e);
        }
        for (int i12 = 0; i12 < this.f31626m.size(); i12++) {
            fVar.c0(10, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31626m.get(i12));
        }
        if (U().size() > 0) {
            fVar.n0(90);
            fVar.n0(this.f31628o);
        }
        for (int i13 = 0; i13 < this.f31627n.size(); i13++) {
            fVar.a0(((Integer) this.f31627n.get(i13)).intValue());
        }
        if ((this.f31617d & 128) == 128) {
            fVar.c0(30, this.f31630q);
        }
        for (int i14 = 0; i14 < this.f31631r.size(); i14++) {
            fVar.Z(31, ((Integer) this.f31631r.get(i14)).intValue());
        }
        if ((this.f31617d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            fVar.c0(32, this.f31632s);
        }
        v10.a(19000, fVar);
        fVar.h0(this.f31616c);
    }

    public int d0() {
        return this.f31625l;
    }

    public C3040q e0() {
        return this.f31621h;
    }

    public int f0() {
        return this.f31622i;
    }

    public C3042s g0(int i10) {
        return (C3042s) this.f31623j.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31634u;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31617d & 2) == 2 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31619f) : 0;
        if ((this.f31617d & 4) == 4) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31620g);
        }
        if ((this.f31617d & 8) == 8) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(3, this.f31621h);
        }
        for (int i11 = 0; i11 < this.f31623j.size(); i11++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(4, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31623j.get(i11));
        }
        if ((this.f31617d & 32) == 32) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, this.f31624k);
        }
        for (int i12 = 0; i12 < this.f31629p.size(); i12++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31629p.get(i12));
        }
        if ((this.f31617d & 16) == 16) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(7, this.f31622i);
        }
        if ((this.f31617d & 64) == 64) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(8, this.f31625l);
        }
        if ((this.f31617d & 1) == 1) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(9, this.f31618e);
        }
        for (int i13 = 0; i13 < this.f31626m.size(); i13++) {
            o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(10, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31626m.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f31627n.size(); i15++) {
            i14 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31627n.get(i15)).intValue());
        }
        int i16 = o10 + i14;
        if (!U().isEmpty()) {
            i16 = i16 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i14);
        }
        this.f31628o = i14;
        if ((this.f31617d & 128) == 128) {
            i16 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(30, this.f31630q);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f31631r.size(); i18++) {
            i17 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31631r.get(i18)).intValue());
        }
        int size = i16 + i17 + (n0().size() * 2);
        if ((this.f31617d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size += kotlin.reflect.jvm.internal.impl.protobuf.f.r(32, this.f31632s);
        }
        int q10 = size + q() + this.f31616c.size();
        this.f31634u = q10;
        return q10;
    }

    public int h0() {
        return this.f31623j.size();
    }

    public List i0() {
        return this.f31623j;
    }

    public C3043t j0() {
        return this.f31630q;
    }

    public u k0(int i10) {
        return (u) this.f31629p.get(i10);
    }

    public int l0() {
        return this.f31629p.size();
    }

    public List m0() {
        return this.f31629p;
    }

    public List n0() {
        return this.f31631r;
    }

    public boolean o0() {
        return (this.f31617d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean p0() {
        return (this.f31617d & 1) == 1;
    }

    public boolean q0() {
        return (this.f31617d & 4) == 4;
    }

    public boolean r0() {
        return (this.f31617d & 2) == 2;
    }

    public boolean s0() {
        return (this.f31617d & 32) == 32;
    }

    public boolean t0() {
        return (this.f31617d & 64) == 64;
    }

    public boolean u0() {
        return (this.f31617d & 8) == 8;
    }

    public boolean v0() {
        return (this.f31617d & 16) == 16;
    }

    public boolean w0() {
        return (this.f31617d & 128) == 128;
    }

    private C3032i(i.c cVar) {
        super(cVar);
        this.f31628o = -1;
        this.f31633t = (byte) -1;
        this.f31634u = -1;
        this.f31616c = cVar.i();
    }

    private C3032i(boolean z10) {
        this.f31628o = -1;
        this.f31633t = (byte) -1;
        this.f31634u = -1;
        this.f31616c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C3032i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31628o = -1;
        this.f31633t = (byte) -1;
        this.f31634u = -1;
        x0();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? r52 = 1024;
            if (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        switch (J10) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.f31617d |= 2;
                                this.f31619f = eVar.r();
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                this.f31617d |= 4;
                                this.f31620g = eVar.r();
                            case 26:
                                C3040q.c b10 = (this.f31617d & 8) == 8 ? this.f31621h.b() : null;
                                C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31621h = c3040q;
                                if (b10 != null) {
                                    b10.k(c3040q);
                                    this.f31621h = b10.v();
                                }
                                this.f31617d |= 8;
                            case 34:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                c10 = c10;
                                if (i10 != 32) {
                                    this.f31623j = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f31623j.add(eVar.t(C3042s.f31821o, gVar));
                            case HVError.CONSENT_DENIED /* 42 */:
                                C3040q.c b11 = (this.f31617d & 32) == 32 ? this.f31624k.b() : null;
                                C3040q c3040q2 = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31624k = c3040q2;
                                if (b11 != null) {
                                    b11.k(c3040q2);
                                    this.f31624k = b11.v();
                                }
                                this.f31617d |= 32;
                            case 50:
                                int i11 = (c10 == true ? 1 : 0) & 1024;
                                c10 = c10;
                                if (i11 != 1024) {
                                    this.f31629p = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1024;
                                }
                                this.f31629p.add(eVar.t(u.f31852n, gVar));
                            case 56:
                                this.f31617d |= 16;
                                this.f31622i = eVar.r();
                            case 64:
                                this.f31617d |= 64;
                                this.f31625l = eVar.r();
                            case 72:
                                this.f31617d |= 1;
                                this.f31618e = eVar.r();
                            case 82:
                                int i12 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                c10 = c10;
                                if (i12 != 256) {
                                    this.f31626m = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f31626m.add(eVar.t(C3040q.f31748v, gVar));
                            case 88:
                                int i13 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i13 != 512) {
                                    this.f31627n = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f31627n.add(Integer.valueOf(eVar.r()));
                            case 90:
                                int i14 = eVar.i(eVar.z());
                                int i15 = (c10 == true ? 1 : 0) & 512;
                                c10 = c10;
                                if (i15 != 512) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31627n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31627n.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i14);
                            case 242:
                                C3043t.b b12 = (this.f31617d & 128) == 128 ? this.f31630q.b() : null;
                                C3043t c3043t = (C3043t) eVar.t(C3043t.f31841i, gVar);
                                this.f31630q = c3043t;
                                if (b12 != null) {
                                    b12.k(c3043t);
                                    this.f31630q = b12.o();
                                }
                                this.f31617d |= 128;
                            case 248:
                                int i16 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i16 != 4096) {
                                    this.f31631r = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4096;
                                }
                                this.f31631r.add(Integer.valueOf(eVar.r()));
                            case 250:
                                int i17 = eVar.i(eVar.z());
                                int i18 = (c10 == true ? 1 : 0) & 4096;
                                c10 = c10;
                                if (i18 != 4096) {
                                    c10 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31631r = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31631r.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i17);
                            case 258:
                                C3028e.b b13 = (this.f31617d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.f31632s.b() : null;
                                C3028e c3028e = (C3028e) eVar.t(C3028e.f31562g, gVar);
                                this.f31632s = c3028e;
                                if (b13 != null) {
                                    b13.k(c3028e);
                                    this.f31632s = b13.o();
                                }
                                this.f31617d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            default:
                                r52 = m(eVar, I10, gVar, J10);
                                if (r52 == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f31623j = Collections.unmodifiableList(this.f31623j);
                    }
                    if (((c10 == true ? 1 : 0) & 1024) == r52) {
                        this.f31629p = Collections.unmodifiableList(this.f31629p);
                    }
                    if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.f31626m = Collections.unmodifiableList(this.f31626m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f31627n = Collections.unmodifiableList(this.f31627n);
                    }
                    if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f31631r = Collections.unmodifiableList(this.f31631r);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31616c = A10.d();
                        throw th2;
                    }
                    this.f31616c = A10.d();
                    j();
                    throw th;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f31623j = Collections.unmodifiableList(this.f31623j);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f31629p = Collections.unmodifiableList(this.f31629p);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31626m = Collections.unmodifiableList(this.f31626m);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f31627n = Collections.unmodifiableList(this.f31627n);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f31631r = Collections.unmodifiableList(this.f31631r);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f31616c = A10.d();
                    throw th3;
                }
                this.f31616c = A10.d();
                j();
                return;
            }
        }
    }

    /* renamed from: dd.i$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31635d;

        /* renamed from: g, reason: collision with root package name */
        private int f31638g;

        /* renamed from: i, reason: collision with root package name */
        private int f31640i;

        /* renamed from: l, reason: collision with root package name */
        private int f31643l;

        /* renamed from: e, reason: collision with root package name */
        private int f31636e = 6;

        /* renamed from: f, reason: collision with root package name */
        private int f31637f = 6;

        /* renamed from: h, reason: collision with root package name */
        private C3040q f31639h = C3040q.U();

        /* renamed from: j, reason: collision with root package name */
        private List f31641j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private C3040q f31642k = C3040q.U();

        /* renamed from: m, reason: collision with root package name */
        private List f31644m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f31645n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private List f31646o = Collections.emptyList();

        /* renamed from: p, reason: collision with root package name */
        private C3043t f31647p = C3043t.t();

        /* renamed from: q, reason: collision with root package name */
        private List f31648q = Collections.emptyList();

        /* renamed from: r, reason: collision with root package name */
        private C3028e f31649r = C3028e.r();

        private b() {
            D();
        }

        private void A() {
            if ((this.f31635d & 32) != 32) {
                this.f31641j = new ArrayList(this.f31641j);
                this.f31635d |= 32;
            }
        }

        private void B() {
            if ((this.f31635d & 1024) != 1024) {
                this.f31646o = new ArrayList(this.f31646o);
                this.f31635d |= 1024;
            }
        }

        private void C() {
            if ((this.f31635d & 4096) != 4096) {
                this.f31648q = new ArrayList(this.f31648q);
                this.f31635d |= 4096;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31635d & 512) != 512) {
                this.f31645n = new ArrayList(this.f31645n);
                this.f31635d |= 512;
            }
        }

        private void z() {
            if ((this.f31635d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f31644m = new ArrayList(this.f31644m);
                this.f31635d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        public b E(C3028e c3028e) {
            if ((this.f31635d & 8192) != 8192 || this.f31649r == C3028e.r()) {
                this.f31649r = c3028e;
            } else {
                this.f31649r = C3028e.w(this.f31649r).k(c3028e).o();
            }
            this.f31635d |= 8192;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b k(C3032i c3032i) {
            if (c3032i == C3032i.X()) {
                return this;
            }
            if (c3032i.p0()) {
                M(c3032i.Z());
            }
            if (c3032i.r0()) {
                O(c3032i.b0());
            }
            if (c3032i.q0()) {
                N(c3032i.a0());
            }
            if (c3032i.u0()) {
                K(c3032i.e0());
            }
            if (c3032i.v0()) {
                Q(c3032i.f0());
            }
            if (!c3032i.f31623j.isEmpty()) {
                if (this.f31641j.isEmpty()) {
                    this.f31641j = c3032i.f31623j;
                    this.f31635d &= -33;
                } else {
                    A();
                    this.f31641j.addAll(c3032i.f31623j);
                }
            }
            if (c3032i.s0()) {
                J(c3032i.c0());
            }
            if (c3032i.t0()) {
                P(c3032i.d0());
            }
            if (!c3032i.f31626m.isEmpty()) {
                if (this.f31644m.isEmpty()) {
                    this.f31644m = c3032i.f31626m;
                    this.f31635d &= -257;
                } else {
                    z();
                    this.f31644m.addAll(c3032i.f31626m);
                }
            }
            if (!c3032i.f31627n.isEmpty()) {
                if (this.f31645n.isEmpty()) {
                    this.f31645n = c3032i.f31627n;
                    this.f31635d &= -513;
                } else {
                    y();
                    this.f31645n.addAll(c3032i.f31627n);
                }
            }
            if (!c3032i.f31629p.isEmpty()) {
                if (this.f31646o.isEmpty()) {
                    this.f31646o = c3032i.f31629p;
                    this.f31635d &= -1025;
                } else {
                    B();
                    this.f31646o.addAll(c3032i.f31629p);
                }
            }
            if (c3032i.w0()) {
                L(c3032i.j0());
            }
            if (!c3032i.f31631r.isEmpty()) {
                if (this.f31648q.isEmpty()) {
                    this.f31648q = c3032i.f31631r;
                    this.f31635d &= -4097;
                } else {
                    C();
                    this.f31648q.addAll(c3032i.f31631r);
                }
            }
            if (c3032i.o0()) {
                E(c3032i.W());
            }
            p(c3032i);
            l(i().e(c3032i.f31616c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3032i c3032i = null;
            try {
                try {
                    C3032i c3032i2 = (C3032i) C3032i.f31615w.b(eVar, gVar);
                    if (c3032i2 != null) {
                        k(c3032i2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3032i c3032i3 = (C3032i) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3032i = c3032i3;
                        if (c3032i != null) {
                            k(c3032i);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3032i != null) {
                }
                throw th;
            }
        }

        public b J(C3040q c3040q) {
            if ((this.f31635d & 64) != 64 || this.f31642k == C3040q.U()) {
                this.f31642k = c3040q;
            } else {
                this.f31642k = C3040q.v0(this.f31642k).k(c3040q).v();
            }
            this.f31635d |= 64;
            return this;
        }

        public b K(C3040q c3040q) {
            if ((this.f31635d & 8) != 8 || this.f31639h == C3040q.U()) {
                this.f31639h = c3040q;
            } else {
                this.f31639h = C3040q.v0(this.f31639h).k(c3040q).v();
            }
            this.f31635d |= 8;
            return this;
        }

        public b L(C3043t c3043t) {
            if ((this.f31635d & 2048) != 2048 || this.f31647p == C3043t.t()) {
                this.f31647p = c3043t;
            } else {
                this.f31647p = C3043t.B(this.f31647p).k(c3043t).o();
            }
            this.f31635d |= 2048;
            return this;
        }

        public b M(int i10) {
            this.f31635d |= 1;
            this.f31636e = i10;
            return this;
        }

        public b N(int i10) {
            this.f31635d |= 4;
            this.f31638g = i10;
            return this;
        }

        public b O(int i10) {
            this.f31635d |= 2;
            this.f31637f = i10;
            return this;
        }

        public b P(int i10) {
            this.f31635d |= 128;
            this.f31643l = i10;
            return this;
        }

        public b Q(int i10) {
            this.f31635d |= 16;
            this.f31640i = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3032i c() {
            C3032i v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3032i v() {
            C3032i c3032i = new C3032i(this);
            int i10 = this.f31635d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3032i.f31618e = this.f31636e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3032i.f31619f = this.f31637f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3032i.f31620g = this.f31638g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c3032i.f31621h = this.f31639h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            c3032i.f31622i = this.f31640i;
            if ((this.f31635d & 32) == 32) {
                this.f31641j = Collections.unmodifiableList(this.f31641j);
                this.f31635d &= -33;
            }
            c3032i.f31623j = this.f31641j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            c3032i.f31624k = this.f31642k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            c3032i.f31625l = this.f31643l;
            if ((this.f31635d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f31644m = Collections.unmodifiableList(this.f31644m);
                this.f31635d &= -257;
            }
            c3032i.f31626m = this.f31644m;
            if ((this.f31635d & 512) == 512) {
                this.f31645n = Collections.unmodifiableList(this.f31645n);
                this.f31635d &= -513;
            }
            c3032i.f31627n = this.f31645n;
            if ((this.f31635d & 1024) == 1024) {
                this.f31646o = Collections.unmodifiableList(this.f31646o);
                this.f31635d &= -1025;
            }
            c3032i.f31629p = this.f31646o;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            c3032i.f31630q = this.f31647p;
            if ((this.f31635d & 4096) == 4096) {
                this.f31648q = Collections.unmodifiableList(this.f31648q);
                this.f31635d &= -4097;
            }
            c3032i.f31631r = this.f31648q;
            if ((i10 & 8192) == 8192) {
                i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            c3032i.f31632s = this.f31649r;
            c3032i.f31617d = i11;
            return c3032i;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void D() {
        }
    }
}
