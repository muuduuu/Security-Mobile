package de;

import Td.B;
import Td.C;
import Td.D;
import Td.F;
import Td.v;
import Wd.p;
import be.d;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.Z;
import pe.b0;
import pe.c0;

/* renamed from: de.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3051h implements be.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f32012g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List f32013h = p.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List f32014i = p.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final d.a f32015a;

    /* renamed from: b, reason: collision with root package name */
    private final be.g f32016b;

    /* renamed from: c, reason: collision with root package name */
    private final C3050g f32017c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C3053j f32018d;

    /* renamed from: e, reason: collision with root package name */
    private final C f32019e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f32020f;

    /* renamed from: de.h$a */
    public static final class a {

        /* renamed from: de.h$a$a, reason: collision with other inner class name */
        static final class C0463a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0463a f32021a = new C0463a();

            C0463a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v invoke() {
                throw new IllegalStateException("trailers not available");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(D request) {
            Intrinsics.checkNotNullParameter(request, "request");
            v f10 = request.f();
            ArrayList arrayList = new ArrayList(f10.size() + 4);
            arrayList.add(new C3047d(C3047d.f31901g, request.i()));
            arrayList.add(new C3047d(C3047d.f31902h, be.i.f19071a.c(request.n())));
            String e10 = request.e("Host");
            if (e10 != null) {
                arrayList.add(new C3047d(C3047d.f31904j, e10));
            }
            arrayList.add(new C3047d(C3047d.f31903i, request.n().u()));
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String h10 = f10.h(i10);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = h10.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!C3051h.f32013h.contains(lowerCase) || (Intrinsics.b(lowerCase, "te") && Intrinsics.b(f10.v(i10), "trailers"))) {
                    arrayList.add(new C3047d(lowerCase, f10.v(i10)));
                }
            }
            return arrayList;
        }

        public final F.a b(v headerBlock, C protocol) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            v.a aVar = new v.a();
            int size = headerBlock.size();
            be.k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String h10 = headerBlock.h(i10);
                String v10 = headerBlock.v(i10);
                if (Intrinsics.b(h10, ":status")) {
                    kVar = be.k.f19074d.a("HTTP/1.1 " + v10);
                } else if (!C3051h.f32014i.contains(h10)) {
                    aVar.d(h10, v10);
                }
            }
            if (kVar != null) {
                return new F.a().o(protocol).e(kVar.f19076b).l(kVar.f19077c).j(aVar.f()).D(C0463a.f32021a);
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public C3051h(B client, d.a carrier, be.g chain, C3050g http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f32015a = carrier;
        this.f32016b = chain;
        this.f32017c = http2Connection;
        List D10 = client.D();
        C c10 = C.H2_PRIOR_KNOWLEDGE;
        this.f32019e = D10.contains(c10) ? c10 : C.HTTP_2;
    }

    @Override // be.d
    public d.a a() {
        return this.f32015a;
    }

    @Override // be.d
    public void b(D request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f32018d != null) {
            return;
        }
        this.f32018d = this.f32017c.Z0(f32012g.a(request), request.a() != null);
        if (this.f32020f) {
            C3053j c3053j = this.f32018d;
            Intrinsics.d(c3053j);
            c3053j.g(EnumC3045b.CANCEL);
            throw new IOException("Canceled");
        }
        C3053j c3053j2 = this.f32018d;
        Intrinsics.d(c3053j2);
        c0 w10 = c3053j2.w();
        long h10 = this.f32016b.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w10.g(h10, timeUnit);
        C3053j c3053j3 = this.f32018d;
        Intrinsics.d(c3053j3);
        c3053j3.E().g(this.f32016b.j(), timeUnit);
    }

    @Override // be.d
    public void c() {
        C3053j c3053j = this.f32018d;
        Intrinsics.d(c3053j);
        c3053j.o().close();
    }

    @Override // be.d
    public void cancel() {
        this.f32020f = true;
        C3053j c3053j = this.f32018d;
        if (c3053j != null) {
            c3053j.g(EnumC3045b.CANCEL);
        }
    }

    @Override // be.d
    public long d(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (be.e.b(response)) {
            return p.j(response);
        }
        return 0L;
    }

    @Override // be.d
    public b0 e(F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        C3053j c3053j = this.f32018d;
        Intrinsics.d(c3053j);
        return c3053j.q();
    }

    @Override // be.d
    public Z f(D request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        C3053j c3053j = this.f32018d;
        Intrinsics.d(c3053j);
        return c3053j.o();
    }

    @Override // be.d
    public F.a g(boolean z10) {
        C3053j c3053j = this.f32018d;
        if (c3053j == null) {
            throw new IOException("stream wasn't created");
        }
        F.a b10 = f32012g.b(c3053j.B(z10), this.f32019e);
        if (z10 && b10.f() == 100) {
            return null;
        }
        return b10;
    }

    @Override // be.d
    public void h() {
        this.f32017c.flush();
    }

    @Override // be.d
    public v i() {
        C3053j c3053j = this.f32018d;
        Intrinsics.d(c3053j);
        return c3053j.C();
    }
}
