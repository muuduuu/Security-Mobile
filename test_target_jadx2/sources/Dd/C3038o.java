package dd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3038o extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: f, reason: collision with root package name */
    private static final C3038o f31718f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31719g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31720b;

    /* renamed from: c, reason: collision with root package name */
    private List f31721c;

    /* renamed from: d, reason: collision with root package name */
    private byte f31722d;

    /* renamed from: e, reason: collision with root package name */
    private int f31723e;

    /* renamed from: dd.o$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3038o b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new C3038o(eVar, gVar);
        }
    }

    static {
        C3038o c3038o = new C3038o(true);
        f31718f = c3038o;
        c3038o.u();
    }

    public static C3038o r() {
        return f31718f;
    }

    private void u() {
        this.f31721c = Collections.emptyList();
    }

    public static b v() {
        return b.q();
    }

    public static b w(C3038o c3038o) {
        return v().k(c3038o);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31722d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < t(); i10++) {
            if (!s(i10).a()) {
                this.f31722d = (byte) 0;
                return false;
            }
        }
        this.f31722d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f31721c.size(); i10++) {
            fVar.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31721c.get(i10));
        }
        fVar.h0(this.f31720b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31723e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31721c.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31721c.get(i12));
        }
        int size = i11 + this.f31720b.size();
        this.f31723e = size;
        return size;
    }

    public c s(int i10) {
        return (c) this.f31721c.get(i10);
    }

    public int t() {
        return this.f31721c.size();
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

    /* renamed from: dd.o$c */
    public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: i, reason: collision with root package name */
        private static final c f31726i;

        /* renamed from: j, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.r f31727j = new a();

        /* renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f31728b;

        /* renamed from: c, reason: collision with root package name */
        private int f31729c;

        /* renamed from: d, reason: collision with root package name */
        private int f31730d;

        /* renamed from: e, reason: collision with root package name */
        private int f31731e;

        /* renamed from: f, reason: collision with root package name */
        private EnumC0460c f31732f;

        /* renamed from: g, reason: collision with root package name */
        private byte f31733g;

        /* renamed from: h, reason: collision with root package name */
        private int f31734h;

        /* renamed from: dd.o$c$a */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* renamed from: dd.o$c$c, reason: collision with other inner class name */
        public enum EnumC0460c implements j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static j.b internalValueMap = new a();
            private final int value;

            /* renamed from: dd.o$c$c$a */
            static class a implements j.b {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0460c a(int i10) {
                    return EnumC0460c.valueOf(i10);
                }
            }

            EnumC0460c(int i10, int i11) {
                this.value = i11;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC0460c valueOf(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        static {
            c cVar = new c(true);
            f31726i = cVar;
            cVar.A();
        }

        private void A() {
            this.f31730d = -1;
            this.f31731e = 0;
            this.f31732f = EnumC0460c.PACKAGE;
        }

        public static b B() {
            return b.q();
        }

        public static b C(c cVar) {
            return B().k(cVar);
        }

        public static c t() {
            return f31726i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b b() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        public final boolean a() {
            byte b10 = this.f31733g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (z()) {
                this.f31733g = (byte) 1;
                return true;
            }
            this.f31733g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            getSerializedSize();
            if ((this.f31729c & 1) == 1) {
                fVar.Z(1, this.f31730d);
            }
            if ((this.f31729c & 2) == 2) {
                fVar.Z(2, this.f31731e);
            }
            if ((this.f31729c & 4) == 4) {
                fVar.R(3, this.f31732f.getNumber());
            }
            fVar.h0(this.f31728b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public int getSerializedSize() {
            int i10 = this.f31734h;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f31729c & 1) == 1 ? kotlin.reflect.jvm.internal.impl.protobuf.f.o(1, this.f31730d) : 0;
            if ((this.f31729c & 2) == 2) {
                o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.o(2, this.f31731e);
            }
            if ((this.f31729c & 4) == 4) {
                o10 += kotlin.reflect.jvm.internal.impl.protobuf.f.h(3, this.f31732f.getNumber());
            }
            int size = o10 + this.f31728b.size();
            this.f31734h = size;
            return size;
        }

        public EnumC0460c u() {
            return this.f31732f;
        }

        public int v() {
            return this.f31730d;
        }

        public int w() {
            return this.f31731e;
        }

        public boolean x() {
            return (this.f31729c & 4) == 4;
        }

        public boolean y() {
            return (this.f31729c & 1) == 1;
        }

        public boolean z() {
            return (this.f31729c & 2) == 2;
        }

        private c(i.b bVar) {
            super(bVar);
            this.f31733g = (byte) -1;
            this.f31734h = -1;
            this.f31728b = bVar.i();
        }

        private c(boolean z10) {
            this.f31733g = (byte) -1;
            this.f31734h = -1;
            this.f31728b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            this.f31733g = (byte) -1;
            this.f31734h = -1;
            A();
            d.b A10 = kotlin.reflect.jvm.internal.impl.protobuf.d.A();
            kotlin.reflect.jvm.internal.impl.protobuf.f I10 = kotlin.reflect.jvm.internal.impl.protobuf.f.I(A10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int J10 = eVar.J();
                            if (J10 != 0) {
                                if (J10 == 8) {
                                    this.f31729c |= 1;
                                    this.f31730d = eVar.r();
                                } else if (J10 == 16) {
                                    this.f31729c |= 2;
                                    this.f31731e = eVar.r();
                                } else if (J10 != 24) {
                                    if (!m(eVar, I10, gVar, J10)) {
                                    }
                                } else {
                                    int m10 = eVar.m();
                                    EnumC0460c valueOf = EnumC0460c.valueOf(m10);
                                    if (valueOf == null) {
                                        I10.n0(J10);
                                        I10.n0(m10);
                                    } else {
                                        this.f31729c |= 4;
                                        this.f31732f = valueOf;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new kotlin.reflect.jvm.internal.impl.protobuf.k(e10.getMessage()).i(this);
                        }
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f31728b = A10.d();
                        throw th2;
                    }
                    this.f31728b = A10.d();
                    j();
                    throw th;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f31728b = A10.d();
                throw th3;
            }
            this.f31728b = A10.d();
            j();
        }

        /* renamed from: dd.o$c$b */
        public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

            /* renamed from: b, reason: collision with root package name */
            private int f31735b;

            /* renamed from: d, reason: collision with root package name */
            private int f31737d;

            /* renamed from: c, reason: collision with root package name */
            private int f31736c = -1;

            /* renamed from: e, reason: collision with root package name */
            private EnumC0460c f31738e = EnumC0460c.PACKAGE;

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
                int i10 = this.f31735b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f31730d = this.f31736c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f31731e = this.f31737d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f31732f = this.f31738e;
                cVar.f31729c = i11;
                return cVar;
            }

            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return q().k(o());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public b k(c cVar) {
                if (cVar == c.t()) {
                    return this;
                }
                if (cVar.y()) {
                    y(cVar.v());
                }
                if (cVar.z()) {
                    z(cVar.w());
                }
                if (cVar.x()) {
                    x(cVar.u());
                }
                l(i().e(cVar.f31728b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
                c cVar = null;
                try {
                    try {
                        c cVar2 = (c) c.f31727j.b(eVar, gVar);
                        if (cVar2 != null) {
                            k(cVar2);
                        }
                        return this;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
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

            public b x(EnumC0460c enumC0460c) {
                enumC0460c.getClass();
                this.f31735b |= 4;
                this.f31738e = enumC0460c;
                return this;
            }

            public b y(int i10) {
                this.f31735b |= 1;
                this.f31736c = i10;
                return this;
            }

            public b z(int i10) {
                this.f31735b |= 2;
                this.f31737d = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    private C3038o(i.b bVar) {
        super(bVar);
        this.f31722d = (byte) -1;
        this.f31723e = -1;
        this.f31720b = bVar.i();
    }

    private C3038o(boolean z10) {
        this.f31722d = (byte) -1;
        this.f31723e = -1;
        this.f31720b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private C3038o(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31722d = (byte) -1;
        this.f31723e = -1;
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
                                if (!z11) {
                                    this.f31721c = new ArrayList();
                                    z11 = true;
                                }
                                this.f31721c.add(eVar.t(c.f31727j, gVar));
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
                    this.f31721c = Collections.unmodifiableList(this.f31721c);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31720b = A10.d();
                    throw th2;
                }
                this.f31720b = A10.d();
                j();
                throw th;
            }
        }
        if (z11) {
            this.f31721c = Collections.unmodifiableList(this.f31721c);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31720b = A10.d();
            throw th3;
        }
        this.f31720b = A10.d();
        j();
    }

    /* renamed from: dd.o$b */
    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31724b;

        /* renamed from: c, reason: collision with root package name */
        private List f31725c = Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31724b & 1) != 1) {
                this.f31725c = new ArrayList(this.f31725c);
                this.f31724b |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3038o c() {
            C3038o o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public C3038o o() {
            C3038o c3038o = new C3038o(this);
            if ((this.f31724b & 1) == 1) {
                this.f31725c = Collections.unmodifiableList(this.f31725c);
                this.f31724b &= -2;
            }
            c3038o.f31721c = this.f31725c;
            return c3038o;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b k(C3038o c3038o) {
            if (c3038o == C3038o.r()) {
                return this;
            }
            if (!c3038o.f31721c.isEmpty()) {
                if (this.f31725c.isEmpty()) {
                    this.f31725c = c3038o.f31721c;
                    this.f31724b &= -2;
                } else {
                    s();
                    this.f31725c.addAll(c3038o.f31721c);
                }
            }
            l(i().e(c3038o.f31720b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            C3038o c3038o = null;
            try {
                try {
                    C3038o c3038o2 = (C3038o) C3038o.f31719g.b(eVar, gVar);
                    if (c3038o2 != null) {
                        k(c3038o2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    C3038o c3038o3 = (C3038o) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        c3038o = c3038o3;
                        if (c3038o != null) {
                            k(c3038o);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (c3038o != null) {
                }
                throw th;
            }
        }

        private void v() {
        }
    }
}
