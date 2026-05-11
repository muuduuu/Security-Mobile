package L2;

import L2.d;
import Q2.C;
import Q2.InterfaceC1124c;
import Q2.h;
import Q2.i;
import Q2.l;
import Q2.y;
import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.u;
import Td.v;
import Td.w;
import Td.x;
import Td.z;
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;
import pe.r;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: h, reason: collision with root package name */
    private static final c f5654h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Charset f5655i = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f5656a;

    /* renamed from: b, reason: collision with root package name */
    private final L2.b f5657b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5658c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1124c f5659d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5660e;

    /* renamed from: f, reason: collision with root package name */
    private final l f5661f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f5662g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f5663a;

        /* renamed from: b, reason: collision with root package name */
        private L2.b f5664b;

        /* renamed from: c, reason: collision with root package name */
        private long f5665c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC1124c f5666d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5667e;

        /* renamed from: f, reason: collision with root package name */
        private Set f5668f;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f5663a = context;
            this.f5665c = 250000L;
            this.f5668f = O.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File d(a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f5663a.getFilesDir();
        }

        public final a b(boolean z10) {
            this.f5667e = z10;
            return this;
        }

        public final d c() {
            Context context = this.f5663a;
            L2.b bVar = this.f5664b;
            L2.b bVar2 = bVar == null ? new L2.b(context, false, null, 6, null) : bVar;
            long j10 = this.f5665c;
            InterfaceC1124c interfaceC1124c = this.f5666d;
            if (interfaceC1124c == null) {
                interfaceC1124c = new InterfaceC1124c() { // from class: L2.c
                    @Override // Q2.InterfaceC1124c
                    public final File a() {
                        File d10;
                        d10 = d.a.d(d.a.this);
                        return d10;
                    }
                };
            }
            return new d(context, bVar2, j10, interfaceC1124c, this.f5667e, this.f5668f);
        }

        public final a e(L2.b collector) {
            Intrinsics.checkNotNullParameter(collector, "collector");
            this.f5664b = collector;
            return this;
        }
    }

    private final class b implements y.a {

        /* renamed from: a, reason: collision with root package name */
        private final F f5669a;

        /* renamed from: b, reason: collision with root package name */
        private final HttpTransaction f5670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f5671c;

        public b(d this$0, F response, HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f5671c = this$0;
            this.f5669a = response;
            this.f5670b = transaction;
        }

        private final C3877e c(File file, boolean z10) {
            try {
                b0 c10 = M.c(M.j(file));
                if (z10) {
                    c10 = new r(c10);
                }
                C3877e c3877e = new C3877e();
                try {
                    c3877e.s0(c10);
                    Unit unit = Unit.f36324a;
                    kotlin.io.c.a(c10, null);
                    return c3877e;
                } finally {
                }
            } catch (IOException e10) {
                new IOException("Response payload couldn't be processed by Chucker", e10).printStackTrace();
                return null;
            }
        }

        @Override // Q2.y.a
        public void a(File file, IOException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            exception.printStackTrace();
        }

        @Override // Q2.y.a
        public void b(File file, long j10) {
            C3877e c10;
            if (file != null && (c10 = c(file, Q2.x.g(this.f5669a))) != null) {
                this.f5671c.g(this.f5669a, c10, this.f5670b);
            }
            this.f5670b.setResponsePayloadSize(Long.valueOf(j10));
            this.f5671c.f5657b.b(this.f5670b);
            if (file == null) {
                return;
            }
            file.delete();
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public d(Context context, L2.b collector, long j10, InterfaceC1124c cacheDirectoryProvider, boolean z10, Set headersToRedact) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(cacheDirectoryProvider, "cacheDirectoryProvider");
        Intrinsics.checkNotNullParameter(headersToRedact, "headersToRedact");
        this.f5656a = context;
        this.f5657b = collector;
        this.f5658c = j10;
        this.f5659d = cacheDirectoryProvider;
        this.f5660e = z10;
        this.f5661f = new l(context);
        this.f5662g = CollectionsKt.R0(headersToRedact);
    }

    private final File c() {
        File a10 = this.f5659d.a();
        if (a10 != null) {
            return i.f8090a.a(a10);
        }
        new IOException("Failed to obtain a valid cache directory for Chucker transaction file").printStackTrace();
        return null;
    }

    private final v d(v vVar) {
        v.a m10 = vVar.m();
        for (String str : vVar.j()) {
            Set set = this.f5662g;
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt.r((String) it.next(), str, true)) {
                        m10.j(str, "**");
                        break;
                    }
                }
            }
        }
        v f10 = m10.f();
        Intrinsics.checkNotNullExpressionValue(f10, "builder.build()");
        return f10;
    }

    private final F e(F f10, HttpTransaction httpTransaction) {
        G b10 = f10.b();
        if (!Q2.x.d(f10) || b10 == null) {
            this.f5657b.b(httpTransaction);
            return f10;
        }
        z f11 = b10.f();
        long e10 = b10.e();
        y yVar = new y(c(), new b(this, f10, httpTransaction), this.f5658c);
        InterfaceC3879g j10 = b10.j();
        Intrinsics.checkNotNullExpressionValue(j10, "responseBody.source()");
        b0 c10 = new C(j10, yVar);
        if (this.f5660e) {
            c10 = new h(c10);
        }
        F c11 = f10.t().b(G.g(f11, e10, M.c(c10))).c();
        Intrinsics.checkNotNullExpressionValue(c11, "response.newBuilder()\n            .body(ResponseBody.create(contentType, contentLength, Okio.buffer(upstream)))\n            .build()");
        return c11;
    }

    private final void f(D d10, HttpTransaction httpTransaction) {
        z contentType;
        E a10 = d10.a();
        boolean a11 = this.f5661f.a(d10.f().c("Content-Encoding"));
        v f10 = d10.f();
        Intrinsics.checkNotNullExpressionValue(f10, "request.headers()");
        httpTransaction.setRequestHeaders(f10);
        w n10 = d10.n();
        Intrinsics.checkNotNullExpressionValue(n10, "request.url()");
        httpTransaction.populateUrl(n10);
        httpTransaction.setRequestBodyPlainText(a11);
        httpTransaction.setRequestDate(Long.valueOf(System.currentTimeMillis()));
        httpTransaction.setMethod(d10.i());
        String str = null;
        if (a10 != null && (contentType = a10.getContentType()) != null) {
            str = contentType.toString();
        }
        httpTransaction.setRequestContentType(str);
        httpTransaction.setRequestPayloadSize(Long.valueOf(a10 == null ? 0L : a10.contentLength()));
        if (a10 == null || !a11) {
            return;
        }
        C3877e buffer = this.f5661f.b(new C3877e(), Q2.x.f(d10)).X();
        a10.writeTo(buffer);
        Charset UTF8 = f5655i;
        Intrinsics.checkNotNullExpressionValue(UTF8, "UTF8");
        z contentType2 = a10.getContentType();
        if (contentType2 != null) {
            Charset a12 = contentType2.a(UTF8);
            if (a12 == null) {
                Intrinsics.checkNotNullExpressionValue(UTF8, "UTF8");
            } else {
                UTF8 = a12;
            }
        }
        l lVar = this.f5661f;
        Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
        if (lVar.c(buffer)) {
            httpTransaction.setRequestBody(this.f5661f.d(buffer, UTF8, this.f5658c));
        } else {
            httpTransaction.setRequestBodyPlainText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(F f10, C3877e c3877e, HttpTransaction httpTransaction) {
        String zVar;
        G b10 = f10.b();
        if (b10 == null) {
            return;
        }
        z f11 = b10.f();
        Charset a10 = f11 == null ? null : f11.a(f5655i);
        if (a10 == null) {
            a10 = f5655i;
        }
        if (this.f5661f.c(c3877e)) {
            httpTransaction.setResponseBodyPlainText(true);
            if (c3877e.size() != 0) {
                httpTransaction.setResponseBody(c3877e.Y0(a10));
                return;
            }
            return;
        }
        httpTransaction.setResponseBodyPlainText(false);
        if (f11 != null && (zVar = f11.toString()) != null && StringsKt.I(zVar, "image", true) && c3877e.size() < 1000000) {
            httpTransaction.setResponseImageData(c3877e.n0());
        }
    }

    private final void h(F f10, HttpTransaction httpTransaction) {
        boolean a10 = this.f5661f.a(f10.p().c("Content-Encoding"));
        v f11 = f10.z().f();
        Intrinsics.checkNotNullExpressionValue(f11, "response.request().headers()");
        httpTransaction.setRequestHeaders(d(f11));
        v p10 = f10.p();
        Intrinsics.checkNotNullExpressionValue(p10, "response.headers()");
        httpTransaction.setResponseHeaders(d(p10));
        httpTransaction.setResponseBodyPlainText(a10);
        httpTransaction.setRequestDate(Long.valueOf(f10.C()));
        httpTransaction.setResponseDate(Long.valueOf(f10.y()));
        httpTransaction.setProtocol(f10.x().toString());
        httpTransaction.setResponseCode(Integer.valueOf(f10.f()));
        httpTransaction.setResponseMessage(f10.r());
        u j10 = f10.j();
        if (j10 != null) {
            httpTransaction.setResponseTlsVersion(j10.e().javaName());
            httpTransaction.setResponseCipherSuite(j10.a().c());
        }
        httpTransaction.setResponseContentType(Q2.x.c(f10));
        httpTransaction.setTookMs(Long.valueOf(f10.y() - f10.C()));
    }

    @Override // Td.x
    public F intercept(x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        D request = chain.t();
        HttpTransaction httpTransaction = new HttpTransaction();
        Intrinsics.checkNotNullExpressionValue(request, "request");
        f(request, httpTransaction);
        this.f5657b.a(httpTransaction);
        try {
            F a10 = chain.a(request);
            Intrinsics.checkNotNullExpressionValue(a10, "chain.proceed(request)");
            h(a10, httpTransaction);
            return e(a10, httpTransaction);
        } catch (IOException e10) {
            httpTransaction.setError(e10.toString());
            this.f5657b.b(httpTransaction);
            throw e10;
        }
    }
}
