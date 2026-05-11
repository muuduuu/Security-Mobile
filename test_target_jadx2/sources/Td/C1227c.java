package Td;

import Td.F;
import Td.v;
import Yd.e;
import ge.n;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.AbstractC3884l;
import pe.AbstractC3886n;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.M;
import pe.S;
import pe.Z;
import pe.b0;
import xc.C5146G;

/* renamed from: Td.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1227c implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f9942g = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Yd.e f9943a;

    /* renamed from: b, reason: collision with root package name */
    private int f9944b;

    /* renamed from: c, reason: collision with root package name */
    private int f9945c;

    /* renamed from: d, reason: collision with root package name */
    private int f9946d;

    /* renamed from: e, reason: collision with root package name */
    private int f9947e;

    /* renamed from: f, reason: collision with root package name */
    private int f9948f;

    /* renamed from: Td.c$a */
    private static final class a extends G {

        /* renamed from: c, reason: collision with root package name */
        private final e.d f9949c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9950d;

        /* renamed from: e, reason: collision with root package name */
        private final String f9951e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3879g f9952f;

        /* renamed from: Td.c$a$a, reason: collision with other inner class name */
        public static final class C0190a extends AbstractC3887o {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f9953b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0190a(b0 b0Var, a aVar) {
                super(b0Var);
                this.f9953b = aVar;
            }

            @Override // pe.AbstractC3887o, pe.b0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f9953b.n().close();
                super.close();
            }
        }

        public a(e.d snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f9949c = snapshot;
            this.f9950d = str;
            this.f9951e = str2;
            this.f9952f = M.c(new C0190a(snapshot.b(1), this));
        }

        @Override // Td.G
        public long e() {
            String str = this.f9951e;
            if (str != null) {
                return Wd.m.G(str, -1L);
            }
            return -1L;
        }

        @Override // Td.G
        public z f() {
            String str = this.f9950d;
            if (str != null) {
                return z.f10239e.b(str);
            }
            return null;
        }

        @Override // Td.G
        public InterfaceC3879g j() {
            return this.f9952f;
        }

        public final e.d n() {
            return this.f9949c;
        }
    }

    /* renamed from: Td.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(v vVar) {
            int size = vVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.r("Vary", vVar.h(i10), true)) {
                    String v10 = vVar.v(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.s(C5146G.f44966a));
                    }
                    Iterator it = StringsKt.x0(v10, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.S0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? O.d() : treeSet;
        }

        private final v e(v vVar, v vVar2) {
            Set d10 = d(vVar2);
            if (d10.isEmpty()) {
                return Wd.p.f11597a;
            }
            v.a aVar = new v.a();
            int size = vVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String h10 = vVar.h(i10);
                if (d10.contains(h10)) {
                    aVar.a(h10, vVar.v(i10));
                }
            }
            return aVar.f();
        }

        public final boolean a(F f10) {
            Intrinsics.checkNotNullParameter(f10, "<this>");
            return d(f10.p()).contains("*");
        }

        public final String b(w url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return C3880h.f38683d.d(url.toString()).D().u();
        }

        public final int c(InterfaceC3879g source) {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long C02 = source.C0();
                String u12 = source.u1();
                if (C02 >= 0 && C02 <= 2147483647L && u12.length() <= 0) {
                    return (int) C02;
                }
                throw new IOException("expected an int but was \"" + C02 + u12 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final v f(F f10) {
            Intrinsics.checkNotNullParameter(f10, "<this>");
            F s10 = f10.s();
            Intrinsics.d(s10);
            return e(s10.z().f(), f10.p());
        }

        public final boolean g(F cachedResponse, v cachedRequest, D newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> d10 = d(cachedResponse.p());
            if (d10 != null && d10.isEmpty()) {
                return true;
            }
            for (String str : d10) {
                if (!Intrinsics.b(cachedRequest.w(str), newRequest.g(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    /* renamed from: Td.c$d */
    private final class d implements Yd.c {

        /* renamed from: a, reason: collision with root package name */
        private final e.b f9967a;

        /* renamed from: b, reason: collision with root package name */
        private final Z f9968b;

        /* renamed from: c, reason: collision with root package name */
        private final Z f9969c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9970d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1227c f9971e;

        /* renamed from: Td.c$d$a */
        public static final class a extends AbstractC3886n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1227c f9972b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f9973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1227c c1227c, d dVar, Z z10) {
                super(z10);
                this.f9972b = c1227c;
                this.f9973c = dVar;
            }

            @Override // pe.AbstractC3886n, pe.Z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C1227c c1227c = this.f9972b;
                d dVar = this.f9973c;
                synchronized (c1227c) {
                    if (dVar.d()) {
                        return;
                    }
                    dVar.e(true);
                    c1227c.i(c1227c.d() + 1);
                    super.close();
                    this.f9973c.f9967a.b();
                }
            }
        }

        public d(C1227c c1227c, e.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f9971e = c1227c;
            this.f9967a = editor;
            Z f10 = editor.f(1);
            this.f9968b = f10;
            this.f9969c = new a(c1227c, this, f10);
        }

        @Override // Yd.c
        public void a() {
            C1227c c1227c = this.f9971e;
            synchronized (c1227c) {
                if (this.f9970d) {
                    return;
                }
                this.f9970d = true;
                c1227c.g(c1227c.c() + 1);
                Wd.m.f(this.f9968b);
                try {
                    this.f9967a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // Yd.c
        public Z b() {
            return this.f9969c;
        }

        public final boolean d() {
            return this.f9970d;
        }

        public final void e(boolean z10) {
            this.f9970d = z10;
        }
    }

    public C1227c(S directory, long j10, AbstractC3884l fileSystem, Zd.d taskRunner) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f9943a = new Yd.e(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    private final void a(e.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final F b(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            e.d r10 = this.f9943a.r(f9942g.b(request.n()));
            if (r10 == null) {
                return null;
            }
            try {
                C0191c c0191c = new C0191c(r10.b(0));
                F c10 = c0191c.c(r10);
                if (c0191c.a(request, c10)) {
                    return c10;
                }
                Wd.m.f(c10.b());
                return null;
            } catch (IOException unused) {
                Wd.m.f(r10);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final int c() {
        return this.f9945c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9943a.close();
    }

    public final int d() {
        return this.f9944b;
    }

    public final Yd.c e(F response) {
        e.b bVar;
        Intrinsics.checkNotNullParameter(response, "response");
        String i10 = response.z().i();
        if (be.f.a(response.z().i())) {
            try {
                f(response.z());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.b(i10, "GET")) {
            return null;
        }
        b bVar2 = f9942g;
        if (bVar2.a(response)) {
            return null;
        }
        C0191c c0191c = new C0191c(response);
        try {
            bVar = Yd.e.q(this.f9943a, bVar2.b(response.z().n()), 0L, 2, null);
            if (bVar == null) {
                return null;
            }
            try {
                c0191c.e(bVar);
                return new d(this, bVar);
            } catch (IOException unused2) {
                a(bVar);
                return null;
            }
        } catch (IOException unused3) {
            bVar = null;
        }
    }

    public final void f(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f9943a.N(f9942g.b(request.n()));
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f9943a.flush();
    }

    public final void g(int i10) {
        this.f9945c = i10;
    }

    public final void i(int i10) {
        this.f9944b = i10;
    }

    public final synchronized void j() {
        this.f9947e++;
    }

    public final synchronized void l(Yd.d cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f9948f++;
            if (cacheStrategy.b() != null) {
                this.f9946d++;
            } else if (cacheStrategy.a() != null) {
                this.f9947e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n(F cached, F network) {
        e.b bVar;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C0191c c0191c = new C0191c(network);
        G b10 = cached.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVar = ((a) b10).n().a();
            if (bVar == null) {
                return;
            }
            try {
                c0191c.e(bVar);
                bVar.b();
            } catch (IOException unused) {
                a(bVar);
            }
        } catch (IOException unused2) {
            bVar = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1227c(AbstractC3884l fileSystem, S directory, long j10) {
        this(directory, j10, fileSystem, Zd.d.f12525m);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1227c(File directory, long j10) {
        this(AbstractC3884l.f38707b, S.a.d(S.f38611b, directory, false, 1, null), j10);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* renamed from: Td.c$c, reason: collision with other inner class name */
    private static final class C0191c {

        /* renamed from: k, reason: collision with root package name */
        public static final a f9954k = new a(null);

        /* renamed from: l, reason: collision with root package name */
        private static final String f9955l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f9956m;

        /* renamed from: a, reason: collision with root package name */
        private final w f9957a;

        /* renamed from: b, reason: collision with root package name */
        private final v f9958b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9959c;

        /* renamed from: d, reason: collision with root package name */
        private final C f9960d;

        /* renamed from: e, reason: collision with root package name */
        private final int f9961e;

        /* renamed from: f, reason: collision with root package name */
        private final String f9962f;

        /* renamed from: g, reason: collision with root package name */
        private final v f9963g;

        /* renamed from: h, reason: collision with root package name */
        private final u f9964h;

        /* renamed from: i, reason: collision with root package name */
        private final long f9965i;

        /* renamed from: j, reason: collision with root package name */
        private final long f9966j;

        /* renamed from: Td.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            n.a aVar = ge.n.f33789a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f9955l = sb2.toString();
            f9956m = aVar.g().g() + "-Received-Millis";
        }

        public C0191c(b0 rawSource) {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                InterfaceC3879g c10 = M.c(rawSource);
                String u12 = c10.u1();
                w d10 = w.f10220j.d(u12);
                if (d10 == null) {
                    IOException iOException = new IOException("Cache corruption for " + u12);
                    ge.n.f33789a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f9957a = d10;
                this.f9959c = c10.u1();
                v.a aVar = new v.a();
                int c11 = C1227c.f9942g.c(c10);
                for (int i10 = 0; i10 < c11; i10++) {
                    aVar.c(c10.u1());
                }
                this.f9958b = aVar.f();
                be.k a10 = be.k.f19074d.a(c10.u1());
                this.f9960d = a10.f19075a;
                this.f9961e = a10.f19076b;
                this.f9962f = a10.f19077c;
                v.a aVar2 = new v.a();
                int c12 = C1227c.f9942g.c(c10);
                for (int i11 = 0; i11 < c12; i11++) {
                    aVar2.c(c10.u1());
                }
                String str = f9955l;
                String g10 = aVar2.g(str);
                String str2 = f9956m;
                String g11 = aVar2.g(str2);
                aVar2.i(str);
                aVar2.i(str2);
                this.f9965i = g10 != null ? Long.parseLong(g10) : 0L;
                this.f9966j = g11 != null ? Long.parseLong(g11) : 0L;
                this.f9963g = aVar2.f();
                if (this.f9957a.i()) {
                    String u13 = c10.u1();
                    if (u13.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + u13 + '\"');
                    }
                    this.f9964h = u.f10209e.a(!c10.p0() ? I.Companion.a(c10.u1()) : I.SSL_3_0, C1233i.f10065b.b(c10.u1()), b(c10), b(c10));
                } else {
                    this.f9964h = null;
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(rawSource, th);
                    throw th2;
                }
            }
        }

        private final List b(InterfaceC3879g interfaceC3879g) {
            int c10 = C1227c.f9942g.c(interfaceC3879g);
            if (c10 == -1) {
                return CollectionsKt.j();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                for (int i10 = 0; i10 < c10; i10++) {
                    String u12 = interfaceC3879g.u1();
                    C3877e c3877e = new C3877e();
                    C3880h a10 = C3880h.f38683d.a(u12);
                    if (a10 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c3877e.Q1(a10);
                    arrayList.add(certificateFactory.generateCertificate(c3877e.a2()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void d(InterfaceC3878f interfaceC3878f, List list) {
            try {
                interfaceC3878f.V1(list.size()).q0(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    C3880h.a aVar = C3880h.f38683d;
                    Intrinsics.d(encoded);
                    interfaceC3878f.T0(C3880h.a.g(aVar, encoded, 0, 0, 3, null).b()).q0(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean a(D request, F response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.b(this.f9957a, request.n()) && Intrinsics.b(this.f9959c, request.i()) && C1227c.f9942g.g(response, this.f9958b, request);
        }

        public final F c(e.d snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String c10 = this.f9963g.c("Content-Type");
            String c11 = this.f9963g.c("Content-Length");
            return new F.a().r(new D(this.f9957a, this.f9958b, this.f9959c, null, 8, null)).o(this.f9960d).e(this.f9961e).l(this.f9962f).j(this.f9963g).b(new a(snapshot, c10, c11)).h(this.f9964h).s(this.f9965i).p(this.f9966j).c();
        }

        public final void e(e.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            InterfaceC3878f b10 = M.b(editor.f(0));
            try {
                b10.T0(this.f9957a.toString()).q0(10);
                b10.T0(this.f9959c).q0(10);
                b10.V1(this.f9958b.size()).q0(10);
                int size = this.f9958b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b10.T0(this.f9958b.h(i10)).T0(": ").T0(this.f9958b.v(i10)).q0(10);
                }
                b10.T0(new be.k(this.f9960d, this.f9961e, this.f9962f).toString()).q0(10);
                b10.V1(this.f9963g.size() + 2).q0(10);
                int size2 = this.f9963g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b10.T0(this.f9963g.h(i11)).T0(": ").T0(this.f9963g.v(i11)).q0(10);
                }
                b10.T0(f9955l).T0(": ").V1(this.f9965i).q0(10);
                b10.T0(f9956m).T0(": ").V1(this.f9966j).q0(10);
                if (this.f9957a.i()) {
                    b10.q0(10);
                    u uVar = this.f9964h;
                    Intrinsics.d(uVar);
                    b10.T0(uVar.a().c()).q0(10);
                    d(b10, this.f9964h.d());
                    d(b10, this.f9964h.c());
                    b10.T0(this.f9964h.e().javaName()).q0(10);
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(b10, null);
            } finally {
            }
        }

        public C0191c(F response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f9957a = response.z().n();
            this.f9958b = C1227c.f9942g.f(response);
            this.f9959c = response.z().i();
            this.f9960d = response.x();
            this.f9961e = response.f();
            this.f9962f = response.r();
            this.f9963g = response.p();
            this.f9964h = response.j();
            this.f9965i = response.C();
            this.f9966j = response.y();
        }
    }
}
