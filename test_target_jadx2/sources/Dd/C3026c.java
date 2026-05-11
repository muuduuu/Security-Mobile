package dd;

import co.hyperverge.hypersnapsdk.objects.HVError;
import dd.C3040q;
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
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import org.conscrypt.PSKKeyManager;

/* renamed from: dd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3026c extends i.d implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: K, reason: collision with root package name */
    private static final C3026c f31487K;

    /* renamed from: X, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31488X = new a();

    /* renamed from: A, reason: collision with root package name */
    private List f31489A;

    /* renamed from: B, reason: collision with root package name */
    private int f31490B;

    /* renamed from: C, reason: collision with root package name */
    private List f31491C;

    /* renamed from: D, reason: collision with root package name */
    private List f31492D;

    /* renamed from: E, reason: collision with root package name */
    private int f31493E;

    /* renamed from: F, reason: collision with root package name */
    private C3043t f31494F;

    /* renamed from: G, reason: collision with root package name */
    private List f31495G;

    /* renamed from: H, reason: collision with root package name */
    private w f31496H;

    /* renamed from: I, reason: collision with root package name */
    private byte f31497I;

    /* renamed from: J, reason: collision with root package name */
    private int f31498J;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31499c;

    /* renamed from: d, reason: collision with root package name */
    private int f31500d;

    /* renamed from: e, reason: collision with root package name */
    private int f31501e;

    /* renamed from: f, reason: collision with root package name */
    private int f31502f;

    /* renamed from: g, reason: collision with root package name */
    private int f31503g;

    /* renamed from: h, reason: collision with root package name */
    private List f31504h;

    /* renamed from: i, reason: collision with root package name */
    private List f31505i;

    /* renamed from: j, reason: collision with root package name */
    private List f31506j;

    /* renamed from: k, reason: collision with root package name */
    private int f31507k;

    /* renamed from: l, reason: collision with root package name */
    private List f31508l;

    /* renamed from: m, reason: collision with root package name */
    private int f31509m;

    /* renamed from: n, reason: collision with root package name */
    private List f31510n;

    /* renamed from: o, reason: collision with root package name */
    private List f31511o;

    /* renamed from: p, reason: collision with root package name */
    private int f31512p;

    /* renamed from: q, reason: collision with root package name */
    private List f31513q;

    /* renamed from: r, reason: collision with root package name */
    private List f31514r;

    /* renamed from: s, reason: collision with root package name */
    private List f31515s;

    /* renamed from: t, reason: collision with root package name */
    private List f31516t;

    /* renamed from: u, reason: collision with root package name */
    private List f31517u;

    /* renamed from: v, reason: collision with root package name */
    private List f31518v;

    /* renamed from: w, reason: collision with root package name */
    private int f31519w;

    /* renamed from: x, reason: collision with root package name */
    private int f31520x;

    /* renamed from: y, reason: collision with root package name */
    private C3040q f31521y;

    /* renamed from: z, reason: collision with root package name */
    private int f31522z;

    /* renamed from: dd.c$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3026c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3026c(eVar, gVar);
        }
    }

    /* renamed from: dd.c$c, reason: collision with other inner class name */
    public enum EnumC0459c implements j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static j.b internalValueMap = new a();
        private final int value;

        /* renamed from: dd.c$c$a */
        static class a implements j.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC0459c a(int i10) {
                return EnumC0459c.valueOf(i10);
            }
        }

        EnumC0459c(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
        public final int getNumber() {
            return this.value;
        }

        public static EnumC0459c valueOf(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    static {
        C3026c c3026c = new C3026c(true);
        f31487K = c3026c;
        c3026c.q1();
    }

    private void q1() {
        this.f31501e = 6;
        this.f31502f = 0;
        this.f31503g = 0;
        this.f31504h = Collections.emptyList();
        this.f31505i = Collections.emptyList();
        this.f31506j = Collections.emptyList();
        this.f31508l = Collections.emptyList();
        this.f31510n = Collections.emptyList();
        this.f31511o = Collections.emptyList();
        this.f31513q = Collections.emptyList();
        this.f31514r = Collections.emptyList();
        this.f31515s = Collections.emptyList();
        this.f31516t = Collections.emptyList();
        this.f31517u = Collections.emptyList();
        this.f31518v = Collections.emptyList();
        this.f31520x = 0;
        this.f31521y = C3040q.U();
        this.f31522z = 0;
        this.f31489A = Collections.emptyList();
        this.f31491C = Collections.emptyList();
        this.f31492D = Collections.emptyList();
        this.f31494F = C3043t.t();
        this.f31495G = Collections.emptyList();
        this.f31496H = w.r();
    }

    public static b r1() {
        return b.x();
    }

    public static b s1(C3026c c3026c) {
        return r1().k(c3026c);
    }

    public static C3026c u1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        return (C3026c) f31488X.a(inputStream, gVar);
    }

    public static C3026c v0() {
        return f31487K;
    }

    public List A0() {
        return this.f31517u;
    }

    public int B0() {
        return this.f31501e;
    }

    public int C0() {
        return this.f31502f;
    }

    public C3032i D0(int i10) {
        return (C3032i) this.f31514r.get(i10);
    }

    public int E0() {
        return this.f31514r.size();
    }

    public List F0() {
        return this.f31514r;
    }

    public int G0() {
        return this.f31520x;
    }

    public C3040q H0() {
        return this.f31521y;
    }

    public int I0() {
        return this.f31522z;
    }

    public int J0() {
        return this.f31489A.size();
    }

    public List K0() {
        return this.f31489A;
    }

    public C3040q L0(int i10) {
        return (C3040q) this.f31491C.get(i10);
    }

    public int M0() {
        return this.f31491C.size();
    }

    public int N0() {
        return this.f31492D.size();
    }

    public List O0() {
        return this.f31492D;
    }

    public List P0() {
        return this.f31491C;
    }

    public List Q0() {
        return this.f31508l;
    }

    public C3037n R0(int i10) {
        return (C3037n) this.f31515s.get(i10);
    }

    public int S0() {
        return this.f31515s.size();
    }

    public List T0() {
        return this.f31515s;
    }

    public List U0() {
        return this.f31518v;
    }

    public C3040q V0(int i10) {
        return (C3040q) this.f31505i.get(i10);
    }

    public int W0() {
        return this.f31505i.size();
    }

    public List X0() {
        return this.f31506j;
    }

    public List Y0() {
        return this.f31505i;
    }

    public C3041r Z0(int i10) {
        return (C3041r) this.f31516t.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31497I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!k1()) {
            this.f31497I = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < d1(); i10++) {
            if (!c1(i10).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < W0(); i11++) {
            if (!V0(i11).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < s0(); i12++) {
            if (!r0(i12).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < p0(); i13++) {
            if (!o0(i13).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < E0(); i14++) {
            if (!D0(i14).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < S0(); i15++) {
            if (!R0(i15).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < a1(); i16++) {
            if (!Z0(i16).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < z0(); i17++) {
            if (!x0(i17).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        if (m1() && !H0().a()) {
            this.f31497I = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < M0(); i18++) {
            if (!L0(i18).a()) {
                this.f31497I = (byte) 0;
                return false;
            }
        }
        if (o1() && !f1().a()) {
            this.f31497I = (byte) 0;
            return false;
        }
        if (p()) {
            this.f31497I = (byte) 1;
            return true;
        }
        this.f31497I = (byte) 0;
        return false;
    }

    public int a1() {
        return this.f31516t.size();
    }

    public List b1() {
        return this.f31516t;
    }

    public C3042s c1(int i10) {
        return (C3042s) this.f31504h.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        i.d.a v10 = v();
        if ((this.f31500d & 1) == 1) {
            fVar.Z(1, this.f31501e);
        }
        if (X0().size() > 0) {
            fVar.n0(18);
            fVar.n0(this.f31507k);
        }
        for (int i10 = 0; i10 < this.f31506j.size(); i10++) {
            fVar.a0(((Integer) this.f31506j.get(i10)).intValue());
        }
        if ((this.f31500d & 2) == 2) {
            fVar.Z(3, this.f31502f);
        }
        if ((this.f31500d & 4) == 4) {
            fVar.Z(4, this.f31503g);
        }
        for (int i11 = 0; i11 < this.f31504h.size(); i11++) {
            fVar.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31504h.get(i11));
        }
        for (int i12 = 0; i12 < this.f31505i.size(); i12++) {
            fVar.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31505i.get(i12));
        }
        if (Q0().size() > 0) {
            fVar.n0(58);
            fVar.n0(this.f31509m);
        }
        for (int i13 = 0; i13 < this.f31508l.size(); i13++) {
            fVar.a0(((Integer) this.f31508l.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f31513q.size(); i14++) {
            fVar.c0(8, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31513q.get(i14));
        }
        for (int i15 = 0; i15 < this.f31514r.size(); i15++) {
            fVar.c0(9, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31514r.get(i15));
        }
        for (int i16 = 0; i16 < this.f31515s.size(); i16++) {
            fVar.c0(10, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31515s.get(i16));
        }
        for (int i17 = 0; i17 < this.f31516t.size(); i17++) {
            fVar.c0(11, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31516t.get(i17));
        }
        for (int i18 = 0; i18 < this.f31517u.size(); i18++) {
            fVar.c0(13, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31517u.get(i18));
        }
        if (U0().size() > 0) {
            fVar.n0(130);
            fVar.n0(this.f31519w);
        }
        for (int i19 = 0; i19 < this.f31518v.size(); i19++) {
            fVar.a0(((Integer) this.f31518v.get(i19)).intValue());
        }
        if ((this.f31500d & 8) == 8) {
            fVar.Z(17, this.f31520x);
        }
        if ((this.f31500d & 16) == 16) {
            fVar.c0(18, this.f31521y);
        }
        if ((this.f31500d & 32) == 32) {
            fVar.Z(19, this.f31522z);
        }
        for (int i20 = 0; i20 < this.f31510n.size(); i20++) {
            fVar.c0(20, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31510n.get(i20));
        }
        if (t0().size() > 0) {
            fVar.n0(170);
            fVar.n0(this.f31512p);
        }
        for (int i21 = 0; i21 < this.f31511o.size(); i21++) {
            fVar.a0(((Integer) this.f31511o.get(i21)).intValue());
        }
        if (K0().size() > 0) {
            fVar.n0(178);
            fVar.n0(this.f31490B);
        }
        for (int i22 = 0; i22 < this.f31489A.size(); i22++) {
            fVar.a0(((Integer) this.f31489A.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f31491C.size(); i23++) {
            fVar.c0(23, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31491C.get(i23));
        }
        if (O0().size() > 0) {
            fVar.n0(194);
            fVar.n0(this.f31493E);
        }
        for (int i24 = 0; i24 < this.f31492D.size(); i24++) {
            fVar.a0(((Integer) this.f31492D.get(i24)).intValue());
        }
        if ((this.f31500d & 64) == 64) {
            fVar.c0(30, this.f31494F);
        }
        for (int i25 = 0; i25 < this.f31495G.size(); i25++) {
            fVar.Z(31, ((Integer) this.f31495G.get(i25)).intValue());
        }
        if ((this.f31500d & 128) == 128) {
            fVar.c0(32, this.f31496H);
        }
        v10.a(19000, fVar);
        fVar.h0(this.f31499c);
    }

    public int d1() {
        return this.f31504h.size();
    }

    public List e1() {
        return this.f31504h;
    }

    public C3043t f1() {
        return this.f31494F;
    }

    public List g1() {
        return this.f31495G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31498J;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f31500d & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31501e) : 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31506j.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31506j.get(i12)).intValue());
        }
        int i13 = o10 + i11;
        if (!X0().isEmpty()) {
            i13 = i13 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i11);
        }
        this.f31507k = i11;
        if ((this.f31500d & 2) == 2) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(3, this.f31502f);
        }
        if ((this.f31500d & 4) == 4) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(4, this.f31503g);
        }
        for (int i14 = 0; i14 < this.f31504h.size(); i14++) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31504h.get(i14));
        }
        for (int i15 = 0; i15 < this.f31505i.size(); i15++) {
            i13 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31505i.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f31508l.size(); i17++) {
            i16 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31508l.get(i17)).intValue());
        }
        int i18 = i13 + i16;
        if (!Q0().isEmpty()) {
            i18 = i18 + 1 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i16);
        }
        this.f31509m = i16;
        for (int i19 = 0; i19 < this.f31513q.size(); i19++) {
            i18 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(8, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31513q.get(i19));
        }
        for (int i20 = 0; i20 < this.f31514r.size(); i20++) {
            i18 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(9, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31514r.get(i20));
        }
        for (int i21 = 0; i21 < this.f31515s.size(); i21++) {
            i18 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(10, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31515s.get(i21));
        }
        for (int i22 = 0; i22 < this.f31516t.size(); i22++) {
            i18 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(11, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31516t.get(i22));
        }
        for (int i23 = 0; i23 < this.f31517u.size(); i23++) {
            i18 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(13, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31517u.get(i23));
        }
        int i24 = 0;
        for (int i25 = 0; i25 < this.f31518v.size(); i25++) {
            i24 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31518v.get(i25)).intValue());
        }
        int i26 = i18 + i24;
        if (!U0().isEmpty()) {
            i26 = i26 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i24);
        }
        this.f31519w = i24;
        if ((this.f31500d & 8) == 8) {
            i26 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(17, this.f31520x);
        }
        if ((this.f31500d & 16) == 16) {
            i26 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(18, this.f31521y);
        }
        if ((this.f31500d & 32) == 32) {
            i26 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(19, this.f31522z);
        }
        for (int i27 = 0; i27 < this.f31510n.size(); i27++) {
            i26 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(20, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31510n.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.f31511o.size(); i29++) {
            i28 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31511o.get(i29)).intValue());
        }
        int i30 = i26 + i28;
        if (!t0().isEmpty()) {
            i30 = i30 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i28);
        }
        this.f31512p = i28;
        int i31 = 0;
        for (int i32 = 0; i32 < this.f31489A.size(); i32++) {
            i31 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31489A.get(i32)).intValue());
        }
        int i33 = i30 + i31;
        if (!K0().isEmpty()) {
            i33 = i33 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i31);
        }
        this.f31490B = i31;
        for (int i34 = 0; i34 < this.f31491C.size(); i34++) {
            i33 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(23, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31491C.get(i34));
        }
        int i35 = 0;
        for (int i36 = 0; i36 < this.f31492D.size(); i36++) {
            i35 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31492D.get(i36)).intValue());
        }
        int i37 = i33 + i35;
        if (!O0().isEmpty()) {
            i37 = i37 + 2 + kotlin.reflect.jvm.internal.impl.protobuf.f.p(i35);
        }
        this.f31493E = i35;
        if ((this.f31500d & 64) == 64) {
            i37 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(30, this.f31494F);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f31495G.size(); i39++) {
            i38 += kotlin.reflect.jvm.internal.impl.protobuf.f.p(((Integer) this.f31495G.get(i39)).intValue());
        }
        int size = i37 + i38 + (g1().size() * 2);
        if ((this.f31500d & 128) == 128) {
            size += kotlin.reflect.jvm.internal.impl.protobuf.f.r(32, this.f31496H);
        }
        int q10 = size + q() + this.f31499c.size();
        this.f31498J = q10;
        return q10;
    }

    public w h1() {
        return this.f31496H;
    }

    public boolean i1() {
        return (this.f31500d & 4) == 4;
    }

    public boolean j1() {
        return (this.f31500d & 1) == 1;
    }

    public boolean k1() {
        return (this.f31500d & 2) == 2;
    }

    public boolean l1() {
        return (this.f31500d & 8) == 8;
    }

    public boolean m1() {
        return (this.f31500d & 16) == 16;
    }

    public int n0() {
        return this.f31503g;
    }

    public boolean n1() {
        return (this.f31500d & 32) == 32;
    }

    public C3027d o0(int i10) {
        return (C3027d) this.f31513q.get(i10);
    }

    public boolean o1() {
        return (this.f31500d & 64) == 64;
    }

    public int p0() {
        return this.f31513q.size();
    }

    public boolean p1() {
        return (this.f31500d & 128) == 128;
    }

    public List q0() {
        return this.f31513q;
    }

    public C3040q r0(int i10) {
        return (C3040q) this.f31510n.get(i10);
    }

    public int s0() {
        return this.f31510n.size();
    }

    public List t0() {
        return this.f31511o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return r1();
    }

    public List u0() {
        return this.f31510n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b b() {
        return s1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C3026c getDefaultInstanceForType() {
        return f31487K;
    }

    public C3030g x0(int i10) {
        return (C3030g) this.f31517u.get(i10);
    }

    public int z0() {
        return this.f31517u.size();
    }

    private C3026c(i.c cVar) {
        super(cVar);
        this.f31507k = -1;
        this.f31509m = -1;
        this.f31512p = -1;
        this.f31519w = -1;
        this.f31490B = -1;
        this.f31493E = -1;
        this.f31497I = (byte) -1;
        this.f31498J = -1;
        this.f31499c = cVar.i();
    }

    private C3026c(boolean z10) {
        this.f31507k = -1;
        this.f31509m = -1;
        this.f31512p = -1;
        this.f31519w = -1;
        this.f31490B = -1;
        this.f31493E = -1;
        this.f31497I = (byte) -1;
        this.f31498J = -1;
        this.f31499c = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private C3026c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        boolean z10;
        this.f31507k = -1;
        this.f31509m = -1;
        this.f31512p = -1;
        this.f31519w = -1;
        this.f31490B = -1;
        this.f31493E = -1;
        this.f31497I = (byte) -1;
        this.f31498J = -1;
        q1();
        d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
        kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
        boolean z11 = false;
        char c10 = 0;
        while (!z11) {
            try {
                try {
                    try {
                        int J10 = eVar.J();
                        switch (J10) {
                            case 0:
                                z10 = true;
                                z11 = true;
                                c10 = c10;
                            case 8:
                                z10 = true;
                                this.f31500d |= 1;
                                this.f31501e = eVar.r();
                                c10 = c10;
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                int i10 = (c10 == true ? 1 : 0) & 32;
                                char c11 = c10;
                                if (i10 != 32) {
                                    this.f31506j = new ArrayList();
                                    c11 = (c10 == true ? 1 : 0) | ' ';
                                }
                                this.f31506j.add(Integer.valueOf(eVar.r()));
                                c10 = c11;
                                z10 = true;
                                c10 = c10;
                            case 18:
                                int i11 = eVar.i(eVar.z());
                                int i12 = (c10 == true ? 1 : 0) & 32;
                                char c12 = c10;
                                if (i12 != 32) {
                                    c12 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31506j = new ArrayList();
                                        c12 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31506j.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                                c10 = c12;
                                z10 = true;
                                c10 = c10;
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                this.f31500d |= 2;
                                this.f31502f = eVar.r();
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case 32:
                                this.f31500d |= 4;
                                this.f31503g = eVar.r();
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case HVError.CONSENT_DENIED /* 42 */:
                                int i13 = (c10 == true ? 1 : 0) & 8;
                                char c13 = c10;
                                if (i13 != 8) {
                                    this.f31504h = new ArrayList();
                                    c13 = (c10 == true ? 1 : 0) | '\b';
                                }
                                this.f31504h.add(eVar.t(C3042s.f31821o, gVar));
                                c10 = c13;
                                z10 = true;
                                c10 = c10;
                            case 50:
                                int i14 = (c10 == true ? 1 : 0) & 16;
                                char c14 = c10;
                                if (i14 != 16) {
                                    this.f31505i = new ArrayList();
                                    c14 = (c10 == true ? 1 : 0) | 16;
                                }
                                this.f31505i.add(eVar.t(C3040q.f31748v, gVar));
                                c10 = c14;
                                z10 = true;
                                c10 = c10;
                            case 56:
                                int i15 = (c10 == true ? 1 : 0) & 64;
                                char c15 = c10;
                                if (i15 != 64) {
                                    this.f31508l = new ArrayList();
                                    c15 = (c10 == true ? 1 : 0) | '@';
                                }
                                this.f31508l.add(Integer.valueOf(eVar.r()));
                                c10 = c15;
                                z10 = true;
                                c10 = c10;
                            case 58:
                                int i16 = eVar.i(eVar.z());
                                int i17 = (c10 == true ? 1 : 0) & 64;
                                char c16 = c10;
                                if (i17 != 64) {
                                    c16 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31508l = new ArrayList();
                                        c16 = (c10 == true ? 1 : 0) | '@';
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31508l.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i16);
                                c10 = c16;
                                z10 = true;
                                c10 = c10;
                            case 66:
                                int i18 = (c10 == true ? 1 : 0) & 512;
                                char c17 = c10;
                                if (i18 != 512) {
                                    this.f31513q = new ArrayList();
                                    c17 = (c10 == true ? 1 : 0) | 512;
                                }
                                this.f31513q.add(eVar.t(C3027d.f31549k, gVar));
                                c10 = c17;
                                z10 = true;
                                c10 = c10;
                            case 74:
                                int i19 = (c10 == true ? 1 : 0) & 1024;
                                char c18 = c10;
                                if (i19 != 1024) {
                                    this.f31514r = new ArrayList();
                                    c18 = (c10 == true ? 1 : 0) | 1024;
                                }
                                this.f31514r.add(eVar.t(C3032i.f31615w, gVar));
                                c10 = c18;
                                z10 = true;
                                c10 = c10;
                            case 82:
                                int i20 = (c10 == true ? 1 : 0) & 2048;
                                char c19 = c10;
                                if (i20 != 2048) {
                                    this.f31515s = new ArrayList();
                                    c19 = (c10 == true ? 1 : 0) | 2048;
                                }
                                this.f31515s.add(eVar.t(C3037n.f31683w, gVar));
                                c10 = c19;
                                z10 = true;
                                c10 = c10;
                            case 90:
                                int i21 = (c10 == true ? 1 : 0) & 4096;
                                char c20 = c10;
                                if (i21 != 4096) {
                                    this.f31516t = new ArrayList();
                                    c20 = (c10 == true ? 1 : 0) | 4096;
                                }
                                this.f31516t.add(eVar.t(C3041r.f31796q, gVar));
                                c10 = c20;
                                z10 = true;
                                c10 = c10;
                            case 106:
                                int i22 = (c10 == true ? 1 : 0) & 8192;
                                char c21 = c10;
                                if (i22 != 8192) {
                                    this.f31517u = new ArrayList();
                                    c21 = (c10 == true ? 1 : 0) | 8192;
                                }
                                this.f31517u.add(eVar.t(C3030g.f31585i, gVar));
                                c10 = c21;
                                z10 = true;
                                c10 = c10;
                            case 128:
                                int i23 = (c10 == true ? 1 : 0) & 16384;
                                char c22 = c10;
                                if (i23 != 16384) {
                                    this.f31518v = new ArrayList();
                                    c22 = (c10 == true ? 1 : 0) | 16384;
                                }
                                this.f31518v.add(Integer.valueOf(eVar.r()));
                                c10 = c22;
                                z10 = true;
                                c10 = c10;
                            case 130:
                                int i24 = eVar.i(eVar.z());
                                int i25 = (c10 == true ? 1 : 0) & 16384;
                                char c23 = c10;
                                if (i25 != 16384) {
                                    c23 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31518v = new ArrayList();
                                        c23 = (c10 == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31518v.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i24);
                                c10 = c23;
                                z10 = true;
                                c10 = c10;
                            case 136:
                                this.f31500d |= 8;
                                this.f31520x = eVar.r();
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case 146:
                                C3040q.c b10 = (this.f31500d & 16) == 16 ? this.f31521y.b() : null;
                                C3040q c3040q = (C3040q) eVar.t(C3040q.f31748v, gVar);
                                this.f31521y = c3040q;
                                if (b10 != null) {
                                    b10.k(c3040q);
                                    this.f31521y = b10.v();
                                }
                                this.f31500d |= 16;
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case 152:
                                this.f31500d |= 32;
                                this.f31522z = eVar.r();
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case 162:
                                int i26 = (c10 == true ? 1 : 0) & 128;
                                char c24 = c10;
                                if (i26 != 128) {
                                    this.f31510n = new ArrayList();
                                    c24 = (c10 == true ? 1 : 0) | 128;
                                }
                                this.f31510n.add(eVar.t(C3040q.f31748v, gVar));
                                c10 = c24;
                                z10 = true;
                                c10 = c10;
                            case 168:
                                int i27 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                char c25 = c10;
                                if (i27 != 256) {
                                    this.f31511o = new ArrayList();
                                    c25 = (c10 == true ? 1 : 0) | 256;
                                }
                                this.f31511o.add(Integer.valueOf(eVar.r()));
                                c10 = c25;
                                z10 = true;
                                c10 = c10;
                            case 170:
                                int i28 = eVar.i(eVar.z());
                                int i29 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                char c26 = c10;
                                if (i29 != 256) {
                                    c26 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31511o = new ArrayList();
                                        c26 = (c10 == true ? 1 : 0) | 256;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31511o.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i28);
                                c10 = c26;
                                z10 = true;
                                c10 = c10;
                            case 176:
                                int i30 = (c10 == true ? 1 : 0) & 262144;
                                char c27 = c10;
                                if (i30 != 262144) {
                                    this.f31489A = new ArrayList();
                                    c27 = (c10 == true ? 1 : 0) | 0;
                                }
                                this.f31489A.add(Integer.valueOf(eVar.r()));
                                c10 = c27;
                                z10 = true;
                                c10 = c10;
                            case 178:
                                int i31 = eVar.i(eVar.z());
                                int i32 = (c10 == true ? 1 : 0) & 262144;
                                char c28 = c10;
                                if (i32 != 262144) {
                                    c28 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31489A = new ArrayList();
                                        c28 = (c10 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31489A.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i31);
                                c10 = c28;
                                z10 = true;
                                c10 = c10;
                            case 186:
                                int i33 = (c10 == true ? 1 : 0) & 524288;
                                char c29 = c10;
                                if (i33 != 524288) {
                                    this.f31491C = new ArrayList();
                                    c29 = (c10 == true ? 1 : 0) | 0;
                                }
                                this.f31491C.add(eVar.t(C3040q.f31748v, gVar));
                                c10 = c29;
                                z10 = true;
                                c10 = c10;
                            case 192:
                                int i34 = (c10 == true ? 1 : 0) & 1048576;
                                char c30 = c10;
                                if (i34 != 1048576) {
                                    this.f31492D = new ArrayList();
                                    c30 = (c10 == true ? 1 : 0) | 0;
                                }
                                this.f31492D.add(Integer.valueOf(eVar.r()));
                                c10 = c30;
                                z10 = true;
                                c10 = c10;
                            case 194:
                                int i35 = eVar.i(eVar.z());
                                int i36 = (c10 == true ? 1 : 0) & 1048576;
                                char c31 = c10;
                                if (i36 != 1048576) {
                                    c31 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31492D = new ArrayList();
                                        c31 = (c10 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31492D.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i35);
                                c10 = c31;
                                z10 = true;
                                c10 = c10;
                            case 242:
                                C3043t.b b11 = (this.f31500d & 64) == 64 ? this.f31494F.b() : null;
                                C3043t c3043t = (C3043t) eVar.t(C3043t.f31841i, gVar);
                                this.f31494F = c3043t;
                                if (b11 != null) {
                                    b11.k(c3043t);
                                    this.f31494F = b11.o();
                                }
                                this.f31500d |= 64;
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            case 248:
                                int i37 = (c10 == true ? 1 : 0) & 4194304;
                                char c32 = c10;
                                if (i37 != 4194304) {
                                    this.f31495G = new ArrayList();
                                    c32 = (c10 == true ? 1 : 0) | 0;
                                }
                                this.f31495G.add(Integer.valueOf(eVar.r()));
                                c10 = c32;
                                z10 = true;
                                c10 = c10;
                            case 250:
                                int i38 = eVar.i(eVar.z());
                                int i39 = (c10 == true ? 1 : 0) & 4194304;
                                char c33 = c10;
                                if (i39 != 4194304) {
                                    c33 = c10;
                                    if (eVar.e() > 0) {
                                        this.f31495G = new ArrayList();
                                        c33 = (c10 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f31495G.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i38);
                                c10 = c33;
                                z10 = true;
                                c10 = c10;
                            case 258:
                                w.b b12 = (this.f31500d & 128) == 128 ? this.f31496H.b() : null;
                                w wVar = (w) eVar.t(w.f31890g, gVar);
                                this.f31496H = wVar;
                                if (b12 != null) {
                                    b12.k(wVar);
                                    this.f31496H = b12.o();
                                }
                                this.f31500d |= 128;
                                c10 = c10;
                                z10 = true;
                                c10 = c10;
                            default:
                                c10 = c10;
                                if (!m(eVar, I10, gVar, J10)) {
                                    z11 = true;
                                    c10 = c10;
                                }
                                z10 = true;
                                c10 = c10;
                        }
                    } catch (IOException e10) {
                        throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e10.getMessage()).i(this);
                    }
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e11) {
                    throw e11.i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f31506j = Collections.unmodifiableList(this.f31506j);
                }
                if (((c10 == true ? 1 : 0) & 8) == 8) {
                    this.f31504h = Collections.unmodifiableList(this.f31504h);
                }
                if (((c10 == true ? 1 : 0) & 16) == 16) {
                    this.f31505i = Collections.unmodifiableList(this.f31505i);
                }
                if (((c10 == true ? 1 : 0) & 64) == 64) {
                    this.f31508l = Collections.unmodifiableList(this.f31508l);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f31513q = Collections.unmodifiableList(this.f31513q);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f31514r = Collections.unmodifiableList(this.f31514r);
                }
                if (((c10 == true ? 1 : 0) & 2048) == 2048) {
                    this.f31515s = Collections.unmodifiableList(this.f31515s);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f31516t = Collections.unmodifiableList(this.f31516t);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f31517u = Collections.unmodifiableList(this.f31517u);
                }
                if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                    this.f31518v = Collections.unmodifiableList(this.f31518v);
                }
                if (((c10 == true ? 1 : 0) & 128) == 128) {
                    this.f31510n = Collections.unmodifiableList(this.f31510n);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f31511o = Collections.unmodifiableList(this.f31511o);
                }
                if (((c10 == true ? 1 : 0) & 262144) == 262144) {
                    this.f31489A = Collections.unmodifiableList(this.f31489A);
                }
                if (((c10 == true ? 1 : 0) & 524288) == 524288) {
                    this.f31491C = Collections.unmodifiableList(this.f31491C);
                }
                if (((c10 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f31492D = Collections.unmodifiableList(this.f31492D);
                }
                if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f31495G = Collections.unmodifiableList(this.f31495G);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31499c = A10.d();
                    throw th2;
                }
                this.f31499c = A10.d();
                j();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & 32) == 32) {
            this.f31506j = Collections.unmodifiableList(this.f31506j);
        }
        if (((c10 == true ? 1 : 0) & 8) == 8) {
            this.f31504h = Collections.unmodifiableList(this.f31504h);
        }
        if (((c10 == true ? 1 : 0) & 16) == 16) {
            this.f31505i = Collections.unmodifiableList(this.f31505i);
        }
        if (((c10 == true ? 1 : 0) & 64) == 64) {
            this.f31508l = Collections.unmodifiableList(this.f31508l);
        }
        if (((c10 == true ? 1 : 0) & 512) == 512) {
            this.f31513q = Collections.unmodifiableList(this.f31513q);
        }
        if (((c10 == true ? 1 : 0) & 1024) == 1024) {
            this.f31514r = Collections.unmodifiableList(this.f31514r);
        }
        if (((c10 == true ? 1 : 0) & 2048) == 2048) {
            this.f31515s = Collections.unmodifiableList(this.f31515s);
        }
        if (((c10 == true ? 1 : 0) & 4096) == 4096) {
            this.f31516t = Collections.unmodifiableList(this.f31516t);
        }
        if (((c10 == true ? 1 : 0) & 8192) == 8192) {
            this.f31517u = Collections.unmodifiableList(this.f31517u);
        }
        if (((c10 == true ? 1 : 0) & 16384) == 16384) {
            this.f31518v = Collections.unmodifiableList(this.f31518v);
        }
        if (((c10 == true ? 1 : 0) & 128) == 128) {
            this.f31510n = Collections.unmodifiableList(this.f31510n);
        }
        if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f31511o = Collections.unmodifiableList(this.f31511o);
        }
        if (((c10 == true ? 1 : 0) & 262144) == 262144) {
            this.f31489A = Collections.unmodifiableList(this.f31489A);
        }
        if (((c10 == true ? 1 : 0) & 524288) == 524288) {
            this.f31491C = Collections.unmodifiableList(this.f31491C);
        }
        if (((c10 == true ? 1 : 0) & 1048576) == 1048576) {
            this.f31492D = Collections.unmodifiableList(this.f31492D);
        }
        if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
            this.f31495G = Collections.unmodifiableList(this.f31495G);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31499c = A10.d();
            throw th3;
        }
        this.f31499c = A10.d();
        j();
    }

    /* renamed from: dd.c$b */
    public static final class b extends i.c implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: d, reason: collision with root package name */
        private int f31525d;

        /* renamed from: f, reason: collision with root package name */
        private int f31527f;

        /* renamed from: g, reason: collision with root package name */
        private int f31528g;

        /* renamed from: t, reason: collision with root package name */
        private int f31541t;

        /* renamed from: v, reason: collision with root package name */
        private int f31543v;

        /* renamed from: e, reason: collision with root package name */
        private int f31526e = 6;

        /* renamed from: h, reason: collision with root package name */
        private List f31529h = Collections.emptyList();

        /* renamed from: i, reason: collision with root package name */
        private List f31530i = Collections.emptyList();

        /* renamed from: j, reason: collision with root package name */
        private List f31531j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private List f31532k = Collections.emptyList();

        /* renamed from: l, reason: collision with root package name */
        private List f31533l = Collections.emptyList();

        /* renamed from: m, reason: collision with root package name */
        private List f31534m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f31535n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private List f31536o = Collections.emptyList();

        /* renamed from: p, reason: collision with root package name */
        private List f31537p = Collections.emptyList();

        /* renamed from: q, reason: collision with root package name */
        private List f31538q = Collections.emptyList();

        /* renamed from: r, reason: collision with root package name */
        private List f31539r = Collections.emptyList();

        /* renamed from: s, reason: collision with root package name */
        private List f31540s = Collections.emptyList();

        /* renamed from: u, reason: collision with root package name */
        private C3040q f31542u = C3040q.U();

        /* renamed from: w, reason: collision with root package name */
        private List f31544w = Collections.emptyList();

        /* renamed from: x, reason: collision with root package name */
        private List f31545x = Collections.emptyList();

        /* renamed from: y, reason: collision with root package name */
        private List f31546y = Collections.emptyList();

        /* renamed from: z, reason: collision with root package name */
        private C3043t f31547z = C3043t.t();

        /* renamed from: A, reason: collision with root package name */
        private List f31523A = Collections.emptyList();

        /* renamed from: B, reason: collision with root package name */
        private w f31524B = w.r();

        private b() {
            Q();
        }

        private void A() {
            if ((this.f31525d & 128) != 128) {
                this.f31533l = new ArrayList(this.f31533l);
                this.f31525d |= 128;
            }
        }

        private void B() {
            if ((this.f31525d & 8192) != 8192) {
                this.f31539r = new ArrayList(this.f31539r);
                this.f31525d |= 8192;
            }
        }

        private void C() {
            if ((this.f31525d & 1024) != 1024) {
                this.f31536o = new ArrayList(this.f31536o);
                this.f31525d |= 1024;
            }
        }

        private void D() {
            if ((this.f31525d & 262144) != 262144) {
                this.f31544w = new ArrayList(this.f31544w);
                this.f31525d |= 262144;
            }
        }

        private void E() {
            if ((this.f31525d & 1048576) != 1048576) {
                this.f31546y = new ArrayList(this.f31546y);
                this.f31525d |= 1048576;
            }
        }

        private void G() {
            if ((this.f31525d & 524288) != 524288) {
                this.f31545x = new ArrayList(this.f31545x);
                this.f31525d |= 524288;
            }
        }

        private void H() {
            if ((this.f31525d & 64) != 64) {
                this.f31532k = new ArrayList(this.f31532k);
                this.f31525d |= 64;
            }
        }

        private void J() {
            if ((this.f31525d & 2048) != 2048) {
                this.f31537p = new ArrayList(this.f31537p);
                this.f31525d |= 2048;
            }
        }

        private void K() {
            if ((this.f31525d & 16384) != 16384) {
                this.f31540s = new ArrayList(this.f31540s);
                this.f31525d |= 16384;
            }
        }

        private void L() {
            if ((this.f31525d & 32) != 32) {
                this.f31531j = new ArrayList(this.f31531j);
                this.f31525d |= 32;
            }
        }

        private void M() {
            if ((this.f31525d & 16) != 16) {
                this.f31530i = new ArrayList(this.f31530i);
                this.f31525d |= 16;
            }
        }

        private void N() {
            if ((this.f31525d & 4096) != 4096) {
                this.f31538q = new ArrayList(this.f31538q);
                this.f31525d |= 4096;
            }
        }

        private void O() {
            if ((this.f31525d & 8) != 8) {
                this.f31529h = new ArrayList(this.f31529h);
                this.f31525d |= 8;
            }
        }

        private void P() {
            if ((this.f31525d & 4194304) != 4194304) {
                this.f31523A = new ArrayList(this.f31523A);
                this.f31525d |= 4194304;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void y() {
            if ((this.f31525d & 512) != 512) {
                this.f31535n = new ArrayList(this.f31535n);
                this.f31525d |= 512;
            }
        }

        private void z() {
            if ((this.f31525d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f31534m = new ArrayList(this.f31534m);
                this.f31525d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public b k(C3026c c3026c) {
            if (c3026c == C3026c.v0()) {
                return this;
            }
            if (c3026c.j1()) {
                X(c3026c.B0());
            }
            if (c3026c.k1()) {
                Y(c3026c.C0());
            }
            if (c3026c.i1()) {
                W(c3026c.n0());
            }
            if (!c3026c.f31504h.isEmpty()) {
                if (this.f31529h.isEmpty()) {
                    this.f31529h = c3026c.f31504h;
                    this.f31525d &= -9;
                } else {
                    O();
                    this.f31529h.addAll(c3026c.f31504h);
                }
            }
            if (!c3026c.f31505i.isEmpty()) {
                if (this.f31530i.isEmpty()) {
                    this.f31530i = c3026c.f31505i;
                    this.f31525d &= -17;
                } else {
                    M();
                    this.f31530i.addAll(c3026c.f31505i);
                }
            }
            if (!c3026c.f31506j.isEmpty()) {
                if (this.f31531j.isEmpty()) {
                    this.f31531j = c3026c.f31506j;
                    this.f31525d &= -33;
                } else {
                    L();
                    this.f31531j.addAll(c3026c.f31506j);
                }
            }
            if (!c3026c.f31508l.isEmpty()) {
                if (this.f31532k.isEmpty()) {
                    this.f31532k = c3026c.f31508l;
                    this.f31525d &= -65;
                } else {
                    H();
                    this.f31532k.addAll(c3026c.f31508l);
                }
            }
            if (!c3026c.f31510n.isEmpty()) {
                if (this.f31533l.isEmpty()) {
                    this.f31533l = c3026c.f31510n;
                    this.f31525d &= -129;
                } else {
                    A();
                    this.f31533l.addAll(c3026c.f31510n);
                }
            }
            if (!c3026c.f31511o.isEmpty()) {
                if (this.f31534m.isEmpty()) {
                    this.f31534m = c3026c.f31511o;
                    this.f31525d &= -257;
                } else {
                    z();
                    this.f31534m.addAll(c3026c.f31511o);
                }
            }
            if (!c3026c.f31513q.isEmpty()) {
                if (this.f31535n.isEmpty()) {
                    this.f31535n = c3026c.f31513q;
                    this.f31525d &= -513;
                } else {
                    y();
                    this.f31535n.addAll(c3026c.f31513q);
                }
            }
            if (!c3026c.f31514r.isEmpty()) {
                if (this.f31536o.isEmpty()) {
                    this.f31536o = c3026c.f31514r;
                    this.f31525d &= -1025;
                } else {
                    C();
                    this.f31536o.addAll(c3026c.f31514r);
                }
            }
            if (!c3026c.f31515s.isEmpty()) {
                if (this.f31537p.isEmpty()) {
                    this.f31537p = c3026c.f31515s;
                    this.f31525d &= -2049;
                } else {
                    J();
                    this.f31537p.addAll(c3026c.f31515s);
                }
            }
            if (!c3026c.f31516t.isEmpty()) {
                if (this.f31538q.isEmpty()) {
                    this.f31538q = c3026c.f31516t;
                    this.f31525d &= -4097;
                } else {
                    N();
                    this.f31538q.addAll(c3026c.f31516t);
                }
            }
            if (!c3026c.f31517u.isEmpty()) {
                if (this.f31539r.isEmpty()) {
                    this.f31539r = c3026c.f31517u;
                    this.f31525d &= -8193;
                } else {
                    B();
                    this.f31539r.addAll(c3026c.f31517u);
                }
            }
            if (!c3026c.f31518v.isEmpty()) {
                if (this.f31540s.isEmpty()) {
                    this.f31540s = c3026c.f31518v;
                    this.f31525d &= -16385;
                } else {
                    K();
                    this.f31540s.addAll(c3026c.f31518v);
                }
            }
            if (c3026c.l1()) {
                Z(c3026c.G0());
            }
            if (c3026c.m1()) {
                T(c3026c.H0());
            }
            if (c3026c.n1()) {
                a0(c3026c.I0());
            }
            if (!c3026c.f31489A.isEmpty()) {
                if (this.f31544w.isEmpty()) {
                    this.f31544w = c3026c.f31489A;
                    this.f31525d &= -262145;
                } else {
                    D();
                    this.f31544w.addAll(c3026c.f31489A);
                }
            }
            if (!c3026c.f31491C.isEmpty()) {
                if (this.f31545x.isEmpty()) {
                    this.f31545x = c3026c.f31491C;
                    this.f31525d &= -524289;
                } else {
                    G();
                    this.f31545x.addAll(c3026c.f31491C);
                }
            }
            if (!c3026c.f31492D.isEmpty()) {
                if (this.f31546y.isEmpty()) {
                    this.f31546y = c3026c.f31492D;
                    this.f31525d &= -1048577;
                } else {
                    E();
                    this.f31546y.addAll(c3026c.f31492D);
                }
            }
            if (c3026c.o1()) {
                U(c3026c.f1());
            }
            if (!c3026c.f31495G.isEmpty()) {
                if (this.f31523A.isEmpty()) {
                    this.f31523A = c3026c.f31495G;
                    this.f31525d &= -4194305;
                } else {
                    P();
                    this.f31523A.addAll(c3026c.f31495G);
                }
            }
            if (c3026c.p1()) {
                V(c3026c.h1());
            }
            p(c3026c);
            l(i().e(c3026c.f31499c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3026c c3026c = null;
            try {
                try {
                    C3026c c3026c2 = (C3026c) C3026c.f31488X.b(eVar, gVar);
                    if (c3026c2 != null) {
                        k(c3026c2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3026c c3026c3 = (C3026c) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3026c = c3026c3;
                        if (c3026c != null) {
                            k(c3026c);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3026c != null) {
                }
                throw th;
            }
        }

        public b T(C3040q c3040q) {
            if ((this.f31525d & 65536) != 65536 || this.f31542u == C3040q.U()) {
                this.f31542u = c3040q;
            } else {
                this.f31542u = C3040q.v0(this.f31542u).k(c3040q).v();
            }
            this.f31525d |= 65536;
            return this;
        }

        public b U(C3043t c3043t) {
            if ((this.f31525d & 2097152) != 2097152 || this.f31547z == C3043t.t()) {
                this.f31547z = c3043t;
            } else {
                this.f31547z = C3043t.B(this.f31547z).k(c3043t).o();
            }
            this.f31525d |= 2097152;
            return this;
        }

        public b V(w wVar) {
            if ((this.f31525d & 8388608) != 8388608 || this.f31524B == w.r()) {
                this.f31524B = wVar;
            } else {
                this.f31524B = w.w(this.f31524B).k(wVar).o();
            }
            this.f31525d |= 8388608;
            return this;
        }

        public b W(int i10) {
            this.f31525d |= 4;
            this.f31528g = i10;
            return this;
        }

        public b X(int i10) {
            this.f31525d |= 1;
            this.f31526e = i10;
            return this;
        }

        public b Y(int i10) {
            this.f31525d |= 2;
            this.f31527f = i10;
            return this;
        }

        public b Z(int i10) {
            this.f31525d |= 32768;
            this.f31541t = i10;
            return this;
        }

        public b a0(int i10) {
            this.f31525d |= 131072;
            this.f31543v = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C3026c c() {
            C3026c v10 = v();
            if (v10.a()) {
                return v10;
            }
            throw a.AbstractC0531a.h(v10);
        }

        public C3026c v() {
            C3026c c3026c = new C3026c(this);
            int i10 = this.f31525d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3026c.f31501e = this.f31526e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3026c.f31502f = this.f31527f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3026c.f31503g = this.f31528g;
            if ((this.f31525d & 8) == 8) {
                this.f31529h = Collections.unmodifiableList(this.f31529h);
                this.f31525d &= -9;
            }
            c3026c.f31504h = this.f31529h;
            if ((this.f31525d & 16) == 16) {
                this.f31530i = Collections.unmodifiableList(this.f31530i);
                this.f31525d &= -17;
            }
            c3026c.f31505i = this.f31530i;
            if ((this.f31525d & 32) == 32) {
                this.f31531j = Collections.unmodifiableList(this.f31531j);
                this.f31525d &= -33;
            }
            c3026c.f31506j = this.f31531j;
            if ((this.f31525d & 64) == 64) {
                this.f31532k = Collections.unmodifiableList(this.f31532k);
                this.f31525d &= -65;
            }
            c3026c.f31508l = this.f31532k;
            if ((this.f31525d & 128) == 128) {
                this.f31533l = Collections.unmodifiableList(this.f31533l);
                this.f31525d &= -129;
            }
            c3026c.f31510n = this.f31533l;
            if ((this.f31525d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f31534m = Collections.unmodifiableList(this.f31534m);
                this.f31525d &= -257;
            }
            c3026c.f31511o = this.f31534m;
            if ((this.f31525d & 512) == 512) {
                this.f31535n = Collections.unmodifiableList(this.f31535n);
                this.f31525d &= -513;
            }
            c3026c.f31513q = this.f31535n;
            if ((this.f31525d & 1024) == 1024) {
                this.f31536o = Collections.unmodifiableList(this.f31536o);
                this.f31525d &= -1025;
            }
            c3026c.f31514r = this.f31536o;
            if ((this.f31525d & 2048) == 2048) {
                this.f31537p = Collections.unmodifiableList(this.f31537p);
                this.f31525d &= -2049;
            }
            c3026c.f31515s = this.f31537p;
            if ((this.f31525d & 4096) == 4096) {
                this.f31538q = Collections.unmodifiableList(this.f31538q);
                this.f31525d &= -4097;
            }
            c3026c.f31516t = this.f31538q;
            if ((this.f31525d & 8192) == 8192) {
                this.f31539r = Collections.unmodifiableList(this.f31539r);
                this.f31525d &= -8193;
            }
            c3026c.f31517u = this.f31539r;
            if ((this.f31525d & 16384) == 16384) {
                this.f31540s = Collections.unmodifiableList(this.f31540s);
                this.f31525d &= -16385;
            }
            c3026c.f31518v = this.f31540s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            c3026c.f31520x = this.f31541t;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            c3026c.f31521y = this.f31542u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            c3026c.f31522z = this.f31543v;
            if ((this.f31525d & 262144) == 262144) {
                this.f31544w = Collections.unmodifiableList(this.f31544w);
                this.f31525d &= -262145;
            }
            c3026c.f31489A = this.f31544w;
            if ((this.f31525d & 524288) == 524288) {
                this.f31545x = Collections.unmodifiableList(this.f31545x);
                this.f31525d &= -524289;
            }
            c3026c.f31491C = this.f31545x;
            if ((this.f31525d & 1048576) == 1048576) {
                this.f31546y = Collections.unmodifiableList(this.f31546y);
                this.f31525d &= -1048577;
            }
            c3026c.f31492D = this.f31546y;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            c3026c.f31494F = this.f31547z;
            if ((this.f31525d & 4194304) == 4194304) {
                this.f31523A = Collections.unmodifiableList(this.f31523A);
                this.f31525d &= -4194305;
            }
            c3026c.f31495G = this.f31523A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            c3026c.f31496H = this.f31524B;
            c3026c.f31500d = i11;
            return c3026c;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().k(v());
        }

        private void Q() {
        }
    }
}
