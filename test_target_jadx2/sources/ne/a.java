package ne;

import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.InterfaceC1234j;
import Td.v;
import Td.w;
import Td.x;
import Td.z;
import be.e;
import ge.n;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.O;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.r;
import qc.AbstractC3958a;

/* loaded from: classes3.dex */
public final class a implements x {

    /* renamed from: e, reason: collision with root package name */
    public static final C0574a f37628e = new C0574a(null);

    /* renamed from: a, reason: collision with root package name */
    private final c f37629a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f37630b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Set f37631c;

    /* renamed from: d, reason: collision with root package name */
    private volatile b f37632d;

    /* renamed from: ne.a$a, reason: collision with other inner class name */
    public static final class C0574a {
        public /* synthetic */ C0574a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0574a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b BASIC = new b("BASIC", 1);
        public static final b HEADERS = new b("HEADERS", 2);
        public static final b BODY = new b("BODY", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, BASIC, HEADERS, BODY};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0575a f37633a = C0575a.f37635a;

        /* renamed from: b, reason: collision with root package name */
        public static final c f37634b = new C0575a.C0576a();

        /* renamed from: ne.a$c$a, reason: collision with other inner class name */
        public static final class C0575a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ C0575a f37635a = new C0575a();

            /* renamed from: ne.a$c$a$a, reason: collision with other inner class name */
            private static final class C0576a implements c {
                @Override // ne.a.c
                public void a(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    n.l(n.f33789a.g(), message, 0, null, 6, null);
                }
            }

            private C0575a() {
            }
        }

        void a(String str);
    }

    public a(c logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f37629a = logger;
        this.f37630b = O.d();
        this.f37631c = O.d();
        this.f37632d = b.NONE;
    }

    private final boolean a(v vVar) {
        String c10 = vVar.c("Content-Encoding");
        return (c10 == null || StringsKt.r(c10, "identity", true) || StringsKt.r(c10, "gzip", true)) ? false : true;
    }

    private final boolean b(F f10) {
        z f11 = f10.b().f();
        return f11 != null && Intrinsics.b(f11.i(), "text") && Intrinsics.b(f11.h(), "event-stream");
    }

    private final void d(v vVar, int i10) {
        String v10 = this.f37630b.contains(vVar.h(i10)) ? "██" : vVar.v(i10);
        this.f37629a.a(vVar.h(i10) + ": " + v10);
    }

    public final void c(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f37632d = bVar;
    }

    public final String e(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f37631c.isEmpty() || url.r() == 0) {
            return url.toString();
        }
        w.a q10 = url.j().q(null);
        int r10 = url.r();
        for (int i10 = 0; i10 < r10; i10++) {
            String p10 = url.p(i10);
            q10.a(p10, this.f37631c.contains(p10) ? "██" : url.q(i10));
        }
        return q10.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[LOOP:0: B:35:0x0109->B:36:0x010b, LOOP_END] */
    @Override // Td.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F intercept(x.a chain) {
        String str;
        boolean z10;
        String str2;
        Long l10;
        r rVar;
        String str3;
        int size;
        int i10;
        Long l11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        b bVar = this.f37632d;
        D t10 = chain.t();
        if (bVar == b.NONE) {
            return chain.a(t10);
        }
        boolean z11 = bVar == b.BODY;
        boolean z12 = z11 || bVar == b.HEADERS;
        E a10 = t10.a();
        InterfaceC1234j b10 = chain.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(t10.i());
        sb2.append(' ');
        sb2.append(e(t10.n()));
        if (b10 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(b10.a());
            str = sb3.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        String sb4 = sb2.toString();
        if (!z12 && a10 != null) {
            sb4 = sb4 + " (" + a10.contentLength() + "-byte body)";
        }
        this.f37629a.a(sb4);
        if (z12) {
            v f10 = t10.f();
            if (a10 != null) {
                z contentType = a10.getContentType();
                if (contentType == null || f10.c("Content-Type") != null) {
                    z10 = z12;
                } else {
                    c cVar = this.f37629a;
                    StringBuilder sb5 = new StringBuilder();
                    z10 = z12;
                    sb5.append("Content-Type: ");
                    sb5.append(contentType);
                    cVar.a(sb5.toString());
                }
                if (a10.contentLength() != -1 && f10.c("Content-Length") == null) {
                    c cVar2 = this.f37629a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Content-Length: ");
                    str2 = "-byte body omitted)";
                    str3 = "-byte body)";
                    sb6.append(a10.contentLength());
                    cVar2.a(sb6.toString());
                    size = f10.size();
                    for (i10 = 0; i10 < size; i10++) {
                        d(f10, i10);
                    }
                    if (z11 || a10 == null) {
                        this.f37629a.a("--> END " + t10.i());
                    } else if (a(t10.f())) {
                        this.f37629a.a("--> END " + t10.i() + " (encoded body omitted)");
                    } else if (a10.isDuplex()) {
                        this.f37629a.a("--> END " + t10.i() + " (duplex request body omitted)");
                    } else if (a10.isOneShot()) {
                        this.f37629a.a("--> END " + t10.i() + " (one-shot body omitted)");
                    } else {
                        C3877e c3877e = new C3877e();
                        a10.writeTo(c3877e);
                        if (StringsKt.r("gzip", f10.c("Content-Encoding"), true)) {
                            l11 = Long.valueOf(c3877e.size());
                            rVar = new r(c3877e);
                            try {
                                c3877e = new C3877e();
                                c3877e.s0(rVar);
                                kotlin.io.c.a(rVar, null);
                            } finally {
                            }
                        } else {
                            l11 = null;
                        }
                        Charset a11 = Wd.a.a(a10.getContentType());
                        this.f37629a.a(BuildConfig.FLAVOR);
                        if (oe.a.a(c3877e)) {
                            String str4 = str2;
                            if (l11 != null) {
                                c cVar3 = this.f37629a;
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("--> END ");
                                sb7.append(t10.i());
                                sb7.append(" (");
                                str2 = str4;
                                sb7.append(c3877e.size());
                                sb7.append("-byte, ");
                                sb7.append(l11);
                                sb7.append("-gzipped-byte body)");
                                cVar3.a(sb7.toString());
                            } else {
                                str2 = str4;
                                this.f37629a.a(c3877e.Y0(a11));
                                this.f37629a.a("--> END " + t10.i() + " (" + a10.contentLength() + str3);
                            }
                        } else {
                            this.f37629a.a("--> END " + t10.i() + " (binary " + a10.contentLength() + str2);
                        }
                    }
                }
            } else {
                z10 = z12;
            }
            str2 = "-byte body omitted)";
            str3 = "-byte body)";
            size = f10.size();
            while (i10 < size) {
            }
            if (z11) {
            }
            this.f37629a.a("--> END " + t10.i());
        } else {
            z10 = z12;
            str2 = "-byte body omitted)";
        }
        long nanoTime = System.nanoTime();
        try {
            F a12 = chain.a(t10);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            G b11 = a12.b();
            Intrinsics.d(b11);
            long e10 = b11.e();
            String str5 = str2;
            String str6 = e10 != -1 ? e10 + "-byte" : "unknown-length";
            c cVar4 = this.f37629a;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("<-- " + a12.f());
            if (a12.r().length() > 0) {
                sb8.append(' ' + a12.r());
            }
            sb8.append(' ' + e(a12.z().n()) + " (" + millis + "ms");
            if (!z10) {
                sb8.append(", " + str6 + " body");
            }
            sb8.append(")");
            String sb9 = sb8.toString();
            Intrinsics.checkNotNullExpressionValue(sb9, "toString(...)");
            cVar4.a(sb9);
            if (z10) {
                v p10 = a12.p();
                int size2 = p10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    d(p10, i11);
                }
                if (!z11 || !e.b(a12)) {
                    this.f37629a.a("<-- END HTTP");
                } else if (a(a12.p())) {
                    this.f37629a.a("<-- END HTTP (encoded body omitted)");
                } else if (b(a12)) {
                    this.f37629a.a("<-- END HTTP (streaming)");
                } else {
                    InterfaceC3879g j10 = b11.j();
                    j10.n1(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                    C3877e m10 = j10.m();
                    if (StringsKt.r("gzip", p10.c("Content-Encoding"), true)) {
                        l10 = Long.valueOf(m10.size());
                        rVar = new r(m10.clone());
                        try {
                            m10 = new C3877e();
                            m10.s0(rVar);
                            kotlin.io.c.a(rVar, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        l10 = null;
                    }
                    Charset a13 = Wd.a.a(b11.f());
                    if (!oe.a.a(m10)) {
                        this.f37629a.a(BuildConfig.FLAVOR);
                        this.f37629a.a("<-- END HTTP (" + millis2 + "ms, binary " + m10.size() + str5);
                        return a12;
                    }
                    if (e10 != 0) {
                        this.f37629a.a(BuildConfig.FLAVOR);
                        this.f37629a.a(m10.clone().Y0(a13));
                    }
                    c cVar5 = this.f37629a;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("<-- END HTTP (" + millis2 + "ms, " + m10.size() + "-byte");
                    if (l10 != null) {
                        sb10.append(", " + l10 + "-gzipped-byte");
                    }
                    sb10.append(" body)");
                    String sb11 = sb10.toString();
                    Intrinsics.checkNotNullExpressionValue(sb11, "toString(...)");
                    cVar5.a(sb11);
                }
            }
            return a12;
        } catch (Exception e11) {
            this.f37629a.a("<-- HTTP FAILED: " + e11);
            throw e11;
        }
    }

    public /* synthetic */ a(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f37634b : cVar);
    }
}
