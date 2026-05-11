package dd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes3.dex */
public final class w extends kotlin.reflect.jvm.internal.impl.protobuf.i implements kotlin.reflect.jvm.internal.impl.protobuf.q {

    /* renamed from: f, reason: collision with root package name */
    private static final w f31889f;

    /* renamed from: g, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.r f31890g = new a();

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f31891b;

    /* renamed from: c, reason: collision with root package name */
    private List f31892c;

    /* renamed from: d, reason: collision with root package name */
    private byte f31893d;

    /* renamed from: e, reason: collision with root package name */
    private int f31894e;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public w b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            return new w(eVar, gVar);
        }
    }

    static {
        w wVar = new w(true);
        f31889f = wVar;
        wVar.u();
    }

    public static w r() {
        return f31889f;
    }

    private void u() {
        this.f31892c = Collections.emptyList();
    }

    public static b v() {
        return b.q();
    }

    public static b w(w wVar) {
        return v().k(wVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    public final boolean a() {
        byte b10 = this.f31893d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f31893d = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public void d(kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f31892c.size(); i10++) {
            fVar.c0(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31892c.get(i10));
        }
        fVar.h0(this.f31891b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public int getSerializedSize() {
        int i10 = this.f31894e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31892c.size(); i12++) {
            i11 += kotlin.reflect.jvm.internal.impl.protobuf.f.r(1, (kotlin.reflect.jvm.internal.impl.protobuf.p) this.f31892c.get(i12));
        }
        int size = i11 + this.f31891b.size();
        this.f31894e = size;
        return size;
    }

    public int s() {
        return this.f31892c.size();
    }

    public List t() {
        return this.f31892c;
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

    private w(i.b bVar) {
        super(bVar);
        this.f31893d = (byte) -1;
        this.f31894e = -1;
        this.f31891b = bVar.i();
    }

    private w(boolean z10) {
        this.f31893d = (byte) -1;
        this.f31894e = -1;
        this.f31891b = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;
    }

    private w(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
        this.f31893d = (byte) -1;
        this.f31894e = -1;
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
                                    this.f31892c = new ArrayList();
                                    z11 = true;
                                }
                                this.f31892c.add(eVar.t(v.f31871m, gVar));
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
                    this.f31892c = Collections.unmodifiableList(this.f31892c);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f31891b = A10.d();
                    throw th2;
                }
                this.f31891b = A10.d();
                j();
                throw th;
            }
        }
        if (z11) {
            this.f31892c = Collections.unmodifiableList(this.f31892c);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f31891b = A10.d();
            throw th3;
        }
        this.f31891b = A10.d();
        j();
    }

    public static final class b extends i.b implements kotlin.reflect.jvm.internal.impl.protobuf.q {

        /* renamed from: b, reason: collision with root package name */
        private int f31895b;

        /* renamed from: c, reason: collision with root package name */
        private List f31896c = Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void s() {
            if ((this.f31895b & 1) != 1) {
                this.f31896c = new ArrayList(this.f31896c);
                this.f31895b |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public w c() {
            w o10 = o();
            if (o10.a()) {
                return o10;
            }
            throw a.AbstractC0531a.h(o10);
        }

        public w o() {
            w wVar = new w(this);
            if ((this.f31895b & 1) == 1) {
                this.f31896c = Collections.unmodifiableList(this.f31896c);
                this.f31895b &= -2;
            }
            wVar.f31892c = this.f31896c;
            return wVar;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().k(o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b k(w wVar) {
            if (wVar == w.r()) {
                return this;
            }
            if (!wVar.f31892c.isEmpty()) {
                if (this.f31896c.isEmpty()) {
                    this.f31896c = wVar.f31892c;
                    this.f31895b &= -2;
                } else {
                    s();
                    this.f31896c.addAll(wVar.f31892c);
                }
            }
            l(i().e(wVar.f31891b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b y0(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.g gVar) {
            w wVar = null;
            try {
                try {
                    w wVar2 = (w) w.f31890g.b(eVar, gVar);
                    if (wVar2 != null) {
                        k(wVar2);
                    }
                    return this;
                } catch (kotlin.reflect.jvm.internal.impl.protobuf.k e10) {
                    w wVar3 = (w) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        wVar = wVar3;
                        if (wVar != null) {
                            k(wVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (wVar != null) {
                }
                throw th;
            }
        }

        private void v() {
        }
    }
}
