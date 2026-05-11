package gd;

import dd.C3025b;
import dd.C3026c;
import dd.C3027d;
import dd.C3032i;
import dd.C3035l;
import dd.C3037n;
import dd.C3040q;
import dd.C3042s;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.k;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.protobuf.r;
import kotlin.reflect.jvm.internal.impl.protobuf.y;
import org.conscrypt.BuildConfig;

/* renamed from: gd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3218a {

    /* renamed from: a, reason: collision with root package name */
    public static final i.f f33674a;

    /* renamed from: b, reason: collision with root package name */
    public static final i.f f33675b;

    /* renamed from: c, reason: collision with root package name */
    public static final i.f f33676c;

    /* renamed from: d, reason: collision with root package name */
    public static final i.f f33677d;

    /* renamed from: e, reason: collision with root package name */
    public static final i.f f33678e;

    /* renamed from: f, reason: collision with root package name */
    public static final i.f f33679f;

    /* renamed from: g, reason: collision with root package name */
    public static final i.f f33680g;

    /* renamed from: h, reason: collision with root package name */
    public static final i.f f33681h;

    /* renamed from: i, reason: collision with root package name */
    public static final i.f f33682i;

    /* renamed from: j, reason: collision with root package name */
    public static final i.f f33683j;

    /* renamed from: k, reason: collision with root package name */
    public static final i.f f33684k;

    /* renamed from: l, reason: collision with root package name */
    public static final i.f f33685l;

    /* renamed from: m, reason: collision with root package name */
    public static final i.f f33686m;

    /* renamed from: n, reason: collision with root package name */
    public static final i.f f33687n;

    /* renamed from: gd.a$e */
    public static final class e extends i implements q {

        /* renamed from: h, reason: collision with root package name */
        private static final e f33727h;

        /* renamed from: i, reason: collision with root package name */
        public static r f33728i = new C0495a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f33729b;

        /* renamed from: c, reason: collision with root package name */
        private List f33730c;

        /* renamed from: d, reason: collision with root package name */
        private List f33731d;

        /* renamed from: e, reason: collision with root package name */
        private int f33732e;

        /* renamed from: f, reason: collision with root package name */
        private byte f33733f;

        /* renamed from: g, reason: collision with root package name */
        private int f33734g;

        /* renamed from: gd.a$e$a, reason: collision with other inner class name */
        static class C0495a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0495a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                return new e(eVar, gVar);
            }
        }

        static {
            e eVar = new e(true);
            f33727h = eVar;
            eVar.w();
        }

        public static e A(InputStream inputStream, g gVar) {
            return (e) f33728i.c(inputStream, gVar);
        }

        public static e t() {
            return f33727h;
        }

        private void w() {
            this.f33730c = Collections.emptyList();
            this.f33731d = Collections.emptyList();
        }

        public static b x() {
            return b.q();
        }

        public static b y(e eVar) {
            return x().k(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b b() {
            return y(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f33733f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f33733f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(f fVar) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f33730c.size(); i10++) {
                fVar.c0(1, (p) this.f33730c.get(i10));
            }
            if (u().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f33732e);
            }
            for (int i11 = 0; i11 < this.f33731d.size(); i11++) {
                fVar.a0(((Integer) this.f33731d.get(i11)).intValue());
            }
            fVar.h0(this.f33729b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f33734g;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f33730c.size(); i12++) {
                i11 += f.r(1, (p) this.f33730c.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f33731d.size(); i14++) {
                i13 += f.p(((Integer) this.f33731d.get(i14)).intValue());
            }
            int i15 = i11 + i13;
            if (!u().isEmpty()) {
                i15 = i15 + 1 + f.p(i13);
            }
            this.f33732e = i13;
            int size = i15 + this.f33729b.size();
            this.f33734g = size;
            return size;
        }

        public List u() {
            return this.f33731d;
        }

        public List v() {
            return this.f33730c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return x();
        }

        /* renamed from: gd.a$e$c */
        public static final class c extends i implements q {

            /* renamed from: n, reason: collision with root package name */
            private static final c f33738n;

            /* renamed from: o, reason: collision with root package name */
            public static r f33739o = new C0496a();

            /* renamed from: b, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f33740b;

            /* renamed from: c, reason: collision with root package name */
            private int f33741c;

            /* renamed from: d, reason: collision with root package name */
            private int f33742d;

            /* renamed from: e, reason: collision with root package name */
            private int f33743e;

            /* renamed from: f, reason: collision with root package name */
            private Object f33744f;

            /* renamed from: g, reason: collision with root package name */
            private EnumC0497c f33745g;

            /* renamed from: h, reason: collision with root package name */
            private List f33746h;

            /* renamed from: i, reason: collision with root package name */
            private int f33747i;

            /* renamed from: j, reason: collision with root package name */
            private List f33748j;

            /* renamed from: k, reason: collision with root package name */
            private int f33749k;

            /* renamed from: l, reason: collision with root package name */
            private byte f33750l;

            /* renamed from: m, reason: collision with root package name */
            private int f33751m;

            /* renamed from: gd.a$e$c$a, reason: collision with other inner class name */
            static class C0496a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
                C0496a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: gd.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0497c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static j.b internalValueMap = new C0498a();
                private final int value;

                /* renamed from: gd.a$e$c$c$a, reason: collision with other inner class name */
                static class C0498a implements j.b {
                    C0498a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0497c a(int i10) {
                        return EnumC0497c.valueOf(i10);
                    }
                }

                EnumC0497c(int i10, int i11) {
                    this.value = i11;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0497c valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                c cVar = new c(true);
                f33738n = cVar;
                cVar.N();
            }

            private void N() {
                this.f33742d = 1;
                this.f33743e = 0;
                this.f33744f = BuildConfig.FLAVOR;
                this.f33745g = EnumC0497c.NONE;
                this.f33746h = Collections.emptyList();
                this.f33748j = Collections.emptyList();
            }

            public static b O() {
                return b.q();
            }

            public static b P(c cVar) {
                return O().k(cVar);
            }

            public static c z() {
                return f33738n;
            }

            public EnumC0497c A() {
                return this.f33745g;
            }

            public int B() {
                return this.f33743e;
            }

            public int C() {
                return this.f33742d;
            }

            public int D() {
                return this.f33748j.size();
            }

            public List E() {
                return this.f33748j;
            }

            public String F() {
                Object obj = this.f33744f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String I10 = dVar.I();
                if (dVar.w()) {
                    this.f33744f = I10;
                }
                return I10;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d G() {
                Object obj = this.f33744f;
                if (!(obj instanceof String)) {
                    return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d m10 = kotlin.reflect.jvm.internal.impl.protobuf.d.m((String) obj);
                this.f33744f = m10;
                return m10;
            }

            public int H() {
                return this.f33746h.size();
            }

            public List I() {
                return this.f33746h;
            }

            public boolean J() {
                return (this.f33741c & 8) == 8;
            }

            public boolean K() {
                return (this.f33741c & 2) == 2;
            }

            public boolean L() {
                return (this.f33741c & 1) == 1;
            }

            public boolean M() {
                return (this.f33741c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return O();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public b b() {
                return P(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final boolean a() {
                byte b10 = this.f33750l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f33750l = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public void d(f fVar) {
                getSerializedSize();
                if ((this.f33741c & 1) == 1) {
                    fVar.Z(1, this.f33742d);
                }
                if ((this.f33741c & 2) == 2) {
                    fVar.Z(2, this.f33743e);
                }
                if ((this.f33741c & 8) == 8) {
                    fVar.R(3, this.f33745g.getNumber());
                }
                if (I().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f33747i);
                }
                for (int i10 = 0; i10 < this.f33746h.size(); i10++) {
                    fVar.a0(((Integer) this.f33746h.get(i10)).intValue());
                }
                if (E().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f33749k);
                }
                for (int i11 = 0; i11 < this.f33748j.size(); i11++) {
                    fVar.a0(((Integer) this.f33748j.get(i11)).intValue());
                }
                if ((this.f33741c & 4) == 4) {
                    fVar.N(6, G());
                }
                fVar.h0(this.f33740b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public int getSerializedSize() {
                int i10 = this.f33751m;
                if (i10 != -1) {
                    return i10;
                }
                int o10 = (this.f33741c & 1) == 1 ? f.o(1, this.f33742d) : 0;
                if ((this.f33741c & 2) == 2) {
                    o10 += f.o(2, this.f33743e);
                }
                if ((this.f33741c & 8) == 8) {
                    o10 += f.h(3, this.f33745g.getNumber());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.f33746h.size(); i12++) {
                    i11 += f.p(((Integer) this.f33746h.get(i12)).intValue());
                }
                int i13 = o10 + i11;
                if (!I().isEmpty()) {
                    i13 = i13 + 1 + f.p(i11);
                }
                this.f33747i = i11;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f33748j.size(); i15++) {
                    i14 += f.p(((Integer) this.f33748j.get(i15)).intValue());
                }
                int i16 = i13 + i14;
                if (!E().isEmpty()) {
                    i16 = i16 + 1 + f.p(i14);
                }
                this.f33749k = i14;
                if ((this.f33741c & 4) == 4) {
                    i16 += f.d(6, G());
                }
                int size = i16 + this.f33740b.size();
                this.f33751m = size;
                return size;
            }

            private c(i.b bVar) {
                super(bVar);
                this.f33747i = -1;
                this.f33749k = -1;
                this.f33750l = (byte) -1;
                this.f33751m = -1;
                this.f33740b = bVar.i();
            }

            private c(boolean z10) {
                this.f33747i = -1;
                this.f33749k = -1;
                this.f33750l = (byte) -1;
                this.f33751m = -1;
                this.f33740b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                this.f33747i = -1;
                this.f33749k = -1;
                this.f33750l = (byte) -1;
                this.f33751m = -1;
                N();
                d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
                f I10 = f.I(A10, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            try {
                                int J10 = eVar.J();
                                if (J10 != 0) {
                                    if (J10 == 8) {
                                        this.f33741c |= 1;
                                        this.f33742d = eVar.r();
                                    } else if (J10 == 16) {
                                        this.f33741c |= 2;
                                        this.f33743e = eVar.r();
                                    } else if (J10 == 24) {
                                        int m10 = eVar.m();
                                        EnumC0497c valueOf = EnumC0497c.valueOf(m10);
                                        if (valueOf == null) {
                                            I10.n0(J10);
                                            I10.n0(m10);
                                        } else {
                                            this.f33741c |= 8;
                                            this.f33745g = valueOf;
                                        }
                                    } else if (J10 == 32) {
                                        if ((i10 & 16) != 16) {
                                            this.f33746h = new ArrayList();
                                            i10 |= 16;
                                        }
                                        this.f33746h.add(Integer.valueOf(eVar.r()));
                                    } else if (J10 == 34) {
                                        int i11 = eVar.i(eVar.z());
                                        if ((i10 & 16) != 16 && eVar.e() > 0) {
                                            this.f33746h = new ArrayList();
                                            i10 |= 16;
                                        }
                                        while (eVar.e() > 0) {
                                            this.f33746h.add(Integer.valueOf(eVar.r()));
                                        }
                                        eVar.h(i11);
                                    } else if (J10 == 40) {
                                        if ((i10 & 32) != 32) {
                                            this.f33748j = new ArrayList();
                                            i10 |= 32;
                                        }
                                        this.f33748j.add(Integer.valueOf(eVar.r()));
                                    } else if (J10 == 42) {
                                        int i12 = eVar.i(eVar.z());
                                        if ((i10 & 32) != 32 && eVar.e() > 0) {
                                            this.f33748j = new ArrayList();
                                            i10 |= 32;
                                        }
                                        while (eVar.e() > 0) {
                                            this.f33748j.add(Integer.valueOf(eVar.r()));
                                        }
                                        eVar.h(i12);
                                    } else if (J10 != 50) {
                                        if (!m(eVar, I10, gVar, J10)) {
                                        }
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.protobuf.d k10 = eVar.k();
                                        this.f33741c |= 4;
                                        this.f33744f = k10;
                                    }
                                }
                                z10 = true;
                            } catch (IOException e10) {
                                throw new k(e10.getMessage()).i(this);
                            }
                        } catch (k e11) {
                            throw e11.i(this);
                        }
                    } catch (Throwable th) {
                        if ((i10 & 16) == 16) {
                            this.f33746h = Collections.unmodifiableList(this.f33746h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f33748j = Collections.unmodifiableList(this.f33748j);
                        }
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f33740b = A10.d();
                            throw th2;
                        }
                        this.f33740b = A10.d();
                        j();
                        throw th;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f33746h = Collections.unmodifiableList(this.f33746h);
                }
                if ((i10 & 32) == 32) {
                    this.f33748j = Collections.unmodifiableList(this.f33748j);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f33740b = A10.d();
                    throw th3;
                }
                this.f33740b = A10.d();
                j();
            }

            /* renamed from: gd.a$e$c$b */
            public static final class b extends i.b implements q {

                /* renamed from: b, reason: collision with root package name */
                private int f33752b;

                /* renamed from: d, reason: collision with root package name */
                private int f33754d;

                /* renamed from: c, reason: collision with root package name */
                private int f33753c = 1;

                /* renamed from: e, reason: collision with root package name */
                private Object f33755e = BuildConfig.FLAVOR;

                /* renamed from: f, reason: collision with root package name */
                private EnumC0497c f33756f = EnumC0497c.NONE;

                /* renamed from: g, reason: collision with root package name */
                private List f33757g = Collections.emptyList();

                /* renamed from: h, reason: collision with root package name */
                private List f33758h = Collections.emptyList();

                private b() {
                    w();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b q() {
                    return new b();
                }

                private void s() {
                    if ((this.f33752b & 32) != 32) {
                        this.f33758h = new ArrayList(this.f33758h);
                        this.f33752b |= 32;
                    }
                }

                private void v() {
                    if ((this.f33752b & 16) != 16) {
                        this.f33757g = new ArrayList(this.f33757g);
                        this.f33752b |= 16;
                    }
                }

                public b A(int i10) {
                    this.f33752b |= 2;
                    this.f33754d = i10;
                    return this;
                }

                public b B(int i10) {
                    this.f33752b |= 1;
                    this.f33753c = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public c c() {
                    c o10 = o();
                    if (o10.a()) {
                        return o10;
                    }
                    throw a.AbstractC0531a.h(o10);
                }

                public c o() {
                    c cVar = new c(this);
                    int i10 = this.f33752b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f33742d = this.f33753c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f33743e = this.f33754d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f33744f = this.f33755e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f33745g = this.f33756f;
                    if ((this.f33752b & 16) == 16) {
                        this.f33757g = Collections.unmodifiableList(this.f33757g);
                        this.f33752b &= -17;
                    }
                    cVar.f33746h = this.f33757g;
                    if ((this.f33752b & 32) == 32) {
                        this.f33758h = Collections.unmodifiableList(this.f33758h);
                        this.f33752b &= -33;
                    }
                    cVar.f33748j = this.f33758h;
                    cVar.f33741c = i11;
                    return cVar;
                }

                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return q().k(o());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public b k(c cVar) {
                    if (cVar == c.z()) {
                        return this;
                    }
                    if (cVar.L()) {
                        B(cVar.C());
                    }
                    if (cVar.K()) {
                        A(cVar.B());
                    }
                    if (cVar.M()) {
                        this.f33752b |= 4;
                        this.f33755e = cVar.f33744f;
                    }
                    if (cVar.J()) {
                        z(cVar.A());
                    }
                    if (!cVar.f33746h.isEmpty()) {
                        if (this.f33757g.isEmpty()) {
                            this.f33757g = cVar.f33746h;
                            this.f33752b &= -17;
                        } else {
                            v();
                            this.f33757g.addAll(cVar.f33746h);
                        }
                    }
                    if (!cVar.f33748j.isEmpty()) {
                        if (this.f33758h.isEmpty()) {
                            this.f33758h = cVar.f33748j;
                            this.f33752b &= -33;
                        } else {
                            s();
                            this.f33758h.addAll(cVar.f33748j);
                        }
                    }
                    l(i().e(cVar.f33740b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                    c cVar = null;
                    try {
                        try {
                            c cVar2 = (c) c.f33739o.b(eVar, gVar);
                            if (cVar2 != null) {
                                k(cVar2);
                            }
                            return this;
                        } catch (k e10) {
                            c cVar3 = (c) e10.a();
                            try {
                                throw e10;
                            } catch (Throwable th) {
                                th = th;
                                cVar = cVar3;
                                if (cVar != null) {
                                    k(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cVar != null) {
                        }
                        throw th;
                    }
                }

                public b z(EnumC0497c enumC0497c) {
                    enumC0497c.getClass();
                    this.f33752b |= 8;
                    this.f33756f = enumC0497c;
                    return this;
                }

                private void w() {
                }
            }
        }

        private e(i.b bVar) {
            super(bVar);
            this.f33732e = -1;
            this.f33733f = (byte) -1;
            this.f33734g = -1;
            this.f33729b = bVar.i();
        }

        private e(boolean z10) {
            this.f33732e = -1;
            this.f33733f = (byte) -1;
            this.f33734g = -1;
            this.f33729b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
            this.f33732e = -1;
            this.f33733f = (byte) -1;
            this.f33734g = -1;
            w();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            f I10 = f.I(A10, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f33730c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f33730c.add(eVar.t(c.f33739o, gVar));
                            } else if (J10 == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f33731d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f33731d.add(Integer.valueOf(eVar.r()));
                            } else if (J10 != 42) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f33731d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f33731d.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 1) == 1) {
                        this.f33730c = Collections.unmodifiableList(this.f33730c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f33731d = Collections.unmodifiableList(this.f33731d);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f33729b = A10.d();
                        throw th2;
                    }
                    this.f33729b = A10.d();
                    j();
                    throw th;
                }
            }
            if ((i10 & 1) == 1) {
                this.f33730c = Collections.unmodifiableList(this.f33730c);
            }
            if ((i10 & 2) == 2) {
                this.f33731d = Collections.unmodifiableList(this.f33731d);
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f33729b = A10.d();
                throw th3;
            }
            this.f33729b = A10.d();
            j();
        }

        /* renamed from: gd.a$e$b */
        public static final class b extends i.b implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f33735b;

            /* renamed from: c, reason: collision with root package name */
            private List f33736c = Collections.emptyList();

            /* renamed from: d, reason: collision with root package name */
            private List f33737d = Collections.emptyList();

            private b() {
                w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b q() {
                return new b();
            }

            private void s() {
                if ((this.f33735b & 2) != 2) {
                    this.f33737d = new ArrayList(this.f33737d);
                    this.f33735b |= 2;
                }
            }

            private void v() {
                if ((this.f33735b & 1) != 1) {
                    this.f33736c = new ArrayList(this.f33736c);
                    this.f33735b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public e c() {
                e o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public e o() {
                e eVar = new e(this);
                if ((this.f33735b & 1) == 1) {
                    this.f33736c = Collections.unmodifiableList(this.f33736c);
                    this.f33735b &= -2;
                }
                eVar.f33730c = this.f33736c;
                if ((this.f33735b & 2) == 2) {
                    this.f33737d = Collections.unmodifiableList(this.f33737d);
                    this.f33735b &= -3;
                }
                eVar.f33731d = this.f33737d;
                return eVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b k(e eVar) {
                if (eVar == e.t()) {
                    return this;
                }
                if (!eVar.f33730c.isEmpty()) {
                    if (this.f33736c.isEmpty()) {
                        this.f33736c = eVar.f33730c;
                        this.f33735b &= -2;
                    } else {
                        v();
                        this.f33736c.addAll(eVar.f33730c);
                    }
                }
                if (!eVar.f33731d.isEmpty()) {
                    if (this.f33737d.isEmpty()) {
                        this.f33737d = eVar.f33731d;
                        this.f33735b &= -3;
                    } else {
                        s();
                        this.f33737d.addAll(eVar.f33731d);
                    }
                }
                l(i().e(eVar.f33729b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                e eVar2 = null;
                try {
                    try {
                        e eVar3 = (e) e.f33728i.b(eVar, gVar);
                        if (eVar3 != null) {
                            k(eVar3);
                        }
                        return this;
                    } catch (k e10) {
                        e eVar4 = (e) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            eVar2 = eVar4;
                            if (eVar2 != null) {
                                k(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (eVar2 != null) {
                    }
                    throw th;
                }
            }

            private void w() {
            }
        }
    }

    static {
        C3027d E10 = C3027d.E();
        c s10 = c.s();
        c s11 = c.s();
        y.b bVar = y.b.MESSAGE;
        f33674a = i.l(E10, s10, s11, null, 100, bVar, c.class);
        f33675b = i.l(C3032i.X(), c.s(), c.s(), null, 100, bVar, c.class);
        C3032i X10 = C3032i.X();
        y.b bVar2 = y.b.INT32;
        f33676c = i.l(X10, 0, null, null, 101, bVar2, Integer.class);
        f33677d = i.l(C3037n.V(), d.v(), d.v(), null, 100, bVar, d.class);
        f33678e = i.l(C3037n.V(), 0, null, null, 101, bVar2, Integer.class);
        f33679f = i.k(C3040q.U(), C3025b.w(), null, 100, bVar, false, C3025b.class);
        f33680g = i.l(C3040q.U(), Boolean.FALSE, null, null, 101, y.b.BOOL, Boolean.class);
        f33681h = i.k(C3042s.H(), C3025b.w(), null, 100, bVar, false, C3025b.class);
        f33682i = i.l(C3026c.v0(), 0, null, null, 101, bVar2, Integer.class);
        f33683j = i.k(C3026c.v0(), C3037n.V(), null, 102, bVar, false, C3037n.class);
        f33684k = i.l(C3026c.v0(), 0, null, null, 103, bVar2, Integer.class);
        f33685l = i.l(C3026c.v0(), 0, null, null, 104, bVar2, Integer.class);
        f33686m = i.l(C3035l.H(), 0, null, null, 101, bVar2, Integer.class);
        f33687n = i.k(C3035l.H(), C3037n.V(), null, 102, bVar, false, C3037n.class);
    }

    public static void a(g gVar) {
        gVar.a(f33674a);
        gVar.a(f33675b);
        gVar.a(f33676c);
        gVar.a(f33677d);
        gVar.a(f33678e);
        gVar.a(f33679f);
        gVar.a(f33680g);
        gVar.a(f33681h);
        gVar.a(f33682i);
        gVar.a(f33683j);
        gVar.a(f33684k);
        gVar.a(f33685l);
        gVar.a(f33686m);
        gVar.a(f33687n);
    }

    /* renamed from: gd.a$b */
    public static final class b extends i implements q {

        /* renamed from: h, reason: collision with root package name */
        private static final b f33688h;

        /* renamed from: i, reason: collision with root package name */
        public static r f33689i = new C0491a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f33690b;

        /* renamed from: c, reason: collision with root package name */
        private int f33691c;

        /* renamed from: d, reason: collision with root package name */
        private int f33692d;

        /* renamed from: e, reason: collision with root package name */
        private int f33693e;

        /* renamed from: f, reason: collision with root package name */
        private byte f33694f;

        /* renamed from: g, reason: collision with root package name */
        private int f33695g;

        /* renamed from: gd.a$b$a, reason: collision with other inner class name */
        static class C0491a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0491a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                return new b(eVar, gVar);
            }
        }

        static {
            b bVar = new b(true);
            f33688h = bVar;
            bVar.x();
        }

        public static b s() {
            return f33688h;
        }

        private void x() {
            this.f33692d = 0;
            this.f33693e = 0;
        }

        public static C0492b y() {
            return C0492b.q();
        }

        public static C0492b z(b bVar) {
            return y().k(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0492b newBuilderForType() {
            return y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public C0492b b() {
            return z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f33694f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f33694f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(f fVar) {
            getSerializedSize();
            if ((this.f33691c & 1) == 1) {
                fVar.Z(1, this.f33692d);
            }
            if ((this.f33691c & 2) == 2) {
                fVar.Z(2, this.f33693e);
            }
            fVar.h0(this.f33690b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f33695g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f33691c & 1) == 1 ? f.o(1, this.f33692d) : 0;
            if ((this.f33691c & 2) == 2) {
                o10 += f.o(2, this.f33693e);
            }
            int size = o10 + this.f33690b.size();
            this.f33695g = size;
            return size;
        }

        public int t() {
            return this.f33693e;
        }

        public int u() {
            return this.f33692d;
        }

        public boolean v() {
            return (this.f33691c & 2) == 2;
        }

        public boolean w() {
            return (this.f33691c & 1) == 1;
        }

        private b(i.b bVar) {
            super(bVar);
            this.f33694f = (byte) -1;
            this.f33695g = -1;
            this.f33690b = bVar.i();
        }

        private b(boolean z10) {
            this.f33694f = (byte) -1;
            this.f33695g = -1;
            this.f33690b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
            this.f33694f = (byte) -1;
            this.f33695g = -1;
            x();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            f I10 = f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 8) {
                                this.f33691c |= 1;
                                this.f33692d = eVar.r();
                            } else if (J10 != 16) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                this.f33691c |= 2;
                                this.f33693e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f33690b = A10.d();
                            throw th2;
                        }
                        this.f33690b = A10.d();
                        j();
                        throw th;
                    }
                } catch (k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).i(this);
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f33690b = A10.d();
                throw th3;
            }
            this.f33690b = A10.d();
            j();
        }

        /* renamed from: gd.a$b$b, reason: collision with other inner class name */
        public static final class C0492b extends i.b implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f33696b;

            /* renamed from: c, reason: collision with root package name */
            private int f33697c;

            /* renamed from: d, reason: collision with root package name */
            private int f33698d;

            private C0492b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0492b q() {
                return new C0492b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public b c() {
                b o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public b o() {
                b bVar = new b(this);
                int i10 = this.f33696b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f33692d = this.f33697c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f33693e = this.f33698d;
                bVar.f33691c = i11;
                return bVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0492b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C0492b k(b bVar) {
                if (bVar == b.s()) {
                    return this;
                }
                if (bVar.w()) {
                    y(bVar.u());
                }
                if (bVar.v()) {
                    x(bVar.t());
                }
                l(i().e(bVar.f33690b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0492b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f33689i.b(eVar, gVar);
                        if (bVar2 != null) {
                            k(bVar2);
                        }
                        return this;
                    } catch (k e10) {
                        b bVar3 = (b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                k(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                    }
                    throw th;
                }
            }

            public C0492b x(int i10) {
                this.f33696b |= 2;
                this.f33698d = i10;
                return this;
            }

            public C0492b y(int i10) {
                this.f33696b |= 1;
                this.f33697c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* renamed from: gd.a$c */
    public static final class c extends i implements q {

        /* renamed from: h, reason: collision with root package name */
        private static final c f33699h;

        /* renamed from: i, reason: collision with root package name */
        public static r f33700i = new C0493a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f33701b;

        /* renamed from: c, reason: collision with root package name */
        private int f33702c;

        /* renamed from: d, reason: collision with root package name */
        private int f33703d;

        /* renamed from: e, reason: collision with root package name */
        private int f33704e;

        /* renamed from: f, reason: collision with root package name */
        private byte f33705f;

        /* renamed from: g, reason: collision with root package name */
        private int f33706g;

        /* renamed from: gd.a$c$a, reason: collision with other inner class name */
        static class C0493a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0493a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                return new c(eVar, gVar);
            }
        }

        static {
            c cVar = new c(true);
            f33699h = cVar;
            cVar.x();
        }

        public static c s() {
            return f33699h;
        }

        private void x() {
            this.f33703d = 0;
            this.f33704e = 0;
        }

        public static b y() {
            return b.q();
        }

        public static b z(c cVar) {
            return y().k(cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b b() {
            return z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f33705f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f33705f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(f fVar) {
            getSerializedSize();
            if ((this.f33702c & 1) == 1) {
                fVar.Z(1, this.f33703d);
            }
            if ((this.f33702c & 2) == 2) {
                fVar.Z(2, this.f33704e);
            }
            fVar.h0(this.f33701b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f33706g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f33702c & 1) == 1 ? f.o(1, this.f33703d) : 0;
            if ((this.f33702c & 2) == 2) {
                o10 += f.o(2, this.f33704e);
            }
            int size = o10 + this.f33701b.size();
            this.f33706g = size;
            return size;
        }

        public int t() {
            return this.f33704e;
        }

        public int u() {
            return this.f33703d;
        }

        public boolean v() {
            return (this.f33702c & 2) == 2;
        }

        public boolean w() {
            return (this.f33702c & 1) == 1;
        }

        private c(i.b bVar) {
            super(bVar);
            this.f33705f = (byte) -1;
            this.f33706g = -1;
            this.f33701b = bVar.i();
        }

        private c(boolean z10) {
            this.f33705f = (byte) -1;
            this.f33706g = -1;
            this.f33701b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
            this.f33705f = (byte) -1;
            this.f33706g = -1;
            x();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            f I10 = f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 8) {
                                this.f33702c |= 1;
                                this.f33703d = eVar.r();
                            } else if (J10 != 16) {
                                if (!m(eVar, I10, gVar, J10)) {
                                }
                            } else {
                                this.f33702c |= 2;
                                this.f33704e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th) {
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f33701b = A10.d();
                            throw th2;
                        }
                        this.f33701b = A10.d();
                        j();
                        throw th;
                    }
                } catch (k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new k(e11.getMessage()).i(this);
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f33701b = A10.d();
                throw th3;
            }
            this.f33701b = A10.d();
            j();
        }

        /* renamed from: gd.a$c$b */
        public static final class b extends i.b implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f33707b;

            /* renamed from: c, reason: collision with root package name */
            private int f33708c;

            /* renamed from: d, reason: collision with root package name */
            private int f33709d;

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b q() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public c c() {
                c o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public c o() {
                c cVar = new c(this);
                int i10 = this.f33707b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f33703d = this.f33708c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f33704e = this.f33709d;
                cVar.f33702c = i11;
                return cVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public b k(c cVar) {
                if (cVar == c.s()) {
                    return this;
                }
                if (cVar.w()) {
                    y(cVar.u());
                }
                if (cVar.v()) {
                    x(cVar.t());
                }
                l(i().e(cVar.f33701b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                c cVar = null;
                try {
                    try {
                        c cVar2 = (c) c.f33700i.b(eVar, gVar);
                        if (cVar2 != null) {
                            k(cVar2);
                        }
                        return this;
                    } catch (k e10) {
                        c cVar3 = (c) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            cVar = cVar3;
                            if (cVar != null) {
                                k(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cVar != null) {
                    }
                    throw th;
                }
            }

            public b x(int i10) {
                this.f33707b |= 2;
                this.f33709d = i10;
                return this;
            }

            public b y(int i10) {
                this.f33707b |= 1;
                this.f33708c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* renamed from: gd.a$d */
    public static final class d extends i implements q {

        /* renamed from: k, reason: collision with root package name */
        private static final d f33710k;

        /* renamed from: l, reason: collision with root package name */
        public static r f33711l = new C0494a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f33712b;

        /* renamed from: c, reason: collision with root package name */
        private int f33713c;

        /* renamed from: d, reason: collision with root package name */
        private b f33714d;

        /* renamed from: e, reason: collision with root package name */
        private c f33715e;

        /* renamed from: f, reason: collision with root package name */
        private c f33716f;

        /* renamed from: g, reason: collision with root package name */
        private c f33717g;

        /* renamed from: h, reason: collision with root package name */
        private c f33718h;

        /* renamed from: i, reason: collision with root package name */
        private byte f33719i;

        /* renamed from: j, reason: collision with root package name */
        private int f33720j;

        /* renamed from: gd.a$d$a, reason: collision with other inner class name */
        static class C0494a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            C0494a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                return new d(eVar, gVar);
            }
        }

        static {
            d dVar = new d(true);
            f33710k = dVar;
            dVar.G();
        }

        private void G() {
            this.f33714d = b.s();
            this.f33715e = c.s();
            this.f33716f = c.s();
            this.f33717g = c.s();
            this.f33718h = c.s();
        }

        public static b H() {
            return b.q();
        }

        public static b I(d dVar) {
            return H().k(dVar);
        }

        public static d v() {
            return f33710k;
        }

        public c A() {
            return this.f33715e;
        }

        public boolean B() {
            return (this.f33713c & 16) == 16;
        }

        public boolean C() {
            return (this.f33713c & 1) == 1;
        }

        public boolean D() {
            return (this.f33713c & 4) == 4;
        }

        public boolean E() {
            return (this.f33713c & 8) == 8;
        }

        public boolean F() {
            return (this.f33713c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return H();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public b b() {
            return I(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f33719i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f33719i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(f fVar) {
            getSerializedSize();
            if ((this.f33713c & 1) == 1) {
                fVar.c0(1, this.f33714d);
            }
            if ((this.f33713c & 2) == 2) {
                fVar.c0(2, this.f33715e);
            }
            if ((this.f33713c & 4) == 4) {
                fVar.c0(3, this.f33716f);
            }
            if ((this.f33713c & 8) == 8) {
                fVar.c0(4, this.f33717g);
            }
            if ((this.f33713c & 16) == 16) {
                fVar.c0(5, this.f33718h);
            }
            fVar.h0(this.f33712b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f33720j;
            if (i10 != -1) {
                return i10;
            }
            int r10 = (this.f33713c & 1) == 1 ? f.r(1, this.f33714d) : 0;
            if ((this.f33713c & 2) == 2) {
                r10 += f.r(2, this.f33715e);
            }
            if ((this.f33713c & 4) == 4) {
                r10 += f.r(3, this.f33716f);
            }
            if ((this.f33713c & 8) == 8) {
                r10 += f.r(4, this.f33717g);
            }
            if ((this.f33713c & 16) == 16) {
                r10 += f.r(5, this.f33718h);
            }
            int size = r10 + this.f33712b.size();
            this.f33720j = size;
            return size;
        }

        public c w() {
            return this.f33718h;
        }

        public b x() {
            return this.f33714d;
        }

        public c y() {
            return this.f33716f;
        }

        public c z() {
            return this.f33717g;
        }

        private d(i.b bVar) {
            super(bVar);
            this.f33719i = (byte) -1;
            this.f33720j = -1;
            this.f33712b = bVar.i();
        }

        private d(boolean z10) {
            this.f33719i = (byte) -1;
            this.f33720j = -1;
            this.f33712b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
            this.f33719i = (byte) -1;
            this.f33720j = -1;
            G();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            f I10 = f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int J10 = eVar.J();
                            if (J10 != 0) {
                                if (J10 == 10) {
                                    b.C0492b b10 = (this.f33713c & 1) == 1 ? this.f33714d.b() : null;
                                    b bVar = (b) eVar.t(b.f33689i, gVar);
                                    this.f33714d = bVar;
                                    if (b10 != null) {
                                        b10.k(bVar);
                                        this.f33714d = b10.o();
                                    }
                                    this.f33713c |= 1;
                                } else if (J10 == 18) {
                                    c.b b11 = (this.f33713c & 2) == 2 ? this.f33715e.b() : null;
                                    c cVar = (c) eVar.t(c.f33700i, gVar);
                                    this.f33715e = cVar;
                                    if (b11 != null) {
                                        b11.k(cVar);
                                        this.f33715e = b11.o();
                                    }
                                    this.f33713c |= 2;
                                } else if (J10 == 26) {
                                    c.b b12 = (this.f33713c & 4) == 4 ? this.f33716f.b() : null;
                                    c cVar2 = (c) eVar.t(c.f33700i, gVar);
                                    this.f33716f = cVar2;
                                    if (b12 != null) {
                                        b12.k(cVar2);
                                        this.f33716f = b12.o();
                                    }
                                    this.f33713c |= 4;
                                } else if (J10 == 34) {
                                    c.b b13 = (this.f33713c & 8) == 8 ? this.f33717g.b() : null;
                                    c cVar3 = (c) eVar.t(c.f33700i, gVar);
                                    this.f33717g = cVar3;
                                    if (b13 != null) {
                                        b13.k(cVar3);
                                        this.f33717g = b13.o();
                                    }
                                    this.f33713c |= 8;
                                } else if (J10 != 42) {
                                    if (!m(eVar, I10, gVar, J10)) {
                                    }
                                } else {
                                    c.b b14 = (this.f33713c & 16) == 16 ? this.f33718h.b() : null;
                                    c cVar4 = (c) eVar.t(c.f33700i, gVar);
                                    this.f33718h = cVar4;
                                    if (b14 != null) {
                                        b14.k(cVar4);
                                        this.f33718h = b14.o();
                                    }
                                    this.f33713c |= 16;
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new k(e10.getMessage()).i(this);
                        }
                    } catch (k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f33712b = A10.d();
                        throw th2;
                    }
                    this.f33712b = A10.d();
                    j();
                    throw th;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f33712b = A10.d();
                throw th3;
            }
            this.f33712b = A10.d();
            j();
        }

        /* renamed from: gd.a$d$b */
        public static final class b extends i.b implements q {

            /* renamed from: b, reason: collision with root package name */
            private int f33721b;

            /* renamed from: c, reason: collision with root package name */
            private b f33722c = b.s();

            /* renamed from: d, reason: collision with root package name */
            private c f33723d = c.s();

            /* renamed from: e, reason: collision with root package name */
            private c f33724e = c.s();

            /* renamed from: f, reason: collision with root package name */
            private c f33725f = c.s();

            /* renamed from: g, reason: collision with root package name */
            private c f33726g = c.s();

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b q() {
                return new b();
            }

            public b A(c cVar) {
                if ((this.f33721b & 8) != 8 || this.f33725f == c.s()) {
                    this.f33725f = cVar;
                } else {
                    this.f33725f = c.z(this.f33725f).k(cVar).o();
                }
                this.f33721b |= 8;
                return this;
            }

            public b B(c cVar) {
                if ((this.f33721b & 2) != 2 || this.f33723d == c.s()) {
                    this.f33723d = cVar;
                } else {
                    this.f33723d = c.z(this.f33723d).k(cVar).o();
                }
                this.f33721b |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public d c() {
                d o10 = o();
                if (o10.a()) {
                    return o10;
                }
                throw a.AbstractC0531a.h(o10);
            }

            public d o() {
                d dVar = new d(this);
                int i10 = this.f33721b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f33714d = this.f33722c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f33715e = this.f33723d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f33716f = this.f33724e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f33717g = this.f33725f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f33718h = this.f33726g;
                dVar.f33713c = i11;
                return dVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return q().k(o());
            }

            public b v(c cVar) {
                if ((this.f33721b & 16) != 16 || this.f33726g == c.s()) {
                    this.f33726g = cVar;
                } else {
                    this.f33726g = c.z(this.f33726g).k(cVar).o();
                }
                this.f33721b |= 16;
                return this;
            }

            public b w(b bVar) {
                if ((this.f33721b & 1) != 1 || this.f33722c == b.s()) {
                    this.f33722c = bVar;
                } else {
                    this.f33722c = b.z(this.f33722c).k(bVar).o();
                }
                this.f33721b |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b k(d dVar) {
                if (dVar == d.v()) {
                    return this;
                }
                if (dVar.C()) {
                    w(dVar.x());
                }
                if (dVar.F()) {
                    B(dVar.A());
                }
                if (dVar.D()) {
                    z(dVar.y());
                }
                if (dVar.E()) {
                    A(dVar.z());
                }
                if (dVar.B()) {
                    v(dVar.w());
                }
                l(i().e(dVar.f33712b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, g gVar) {
                d dVar = null;
                try {
                    try {
                        d dVar2 = (d) d.f33711l.b(eVar, gVar);
                        if (dVar2 != null) {
                            k(dVar2);
                        }
                        return this;
                    } catch (k e10) {
                        d dVar3 = (d) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            dVar = dVar3;
                            if (dVar != null) {
                                k(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dVar != null) {
                    }
                    throw th;
                }
            }

            public b z(c cVar) {
                if ((this.f33721b & 4) != 4 || this.f33724e == c.s()) {
                    this.f33724e = cVar;
                } else {
                    this.f33724e = c.z(this.f33724e).k(cVar).o();
                }
                this.f33721b |= 4;
                return this;
            }

            private void s() {
            }
        }
    }
}
