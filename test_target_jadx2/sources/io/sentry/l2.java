package io.sentry;

import io.sentry.protocol.r;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l2 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.r f35190a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35191b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35192c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35193d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35194e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35195f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35196g;

    /* renamed from: h, reason: collision with root package name */
    private final String f35197h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35198i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35199j;

    public static final class b implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l2 a(C3409f0 c3409f0, ILogger iLogger) {
            String str;
            String str2;
            char c10;
            c3409f0.b();
            c cVar = null;
            String str3 = null;
            io.sentry.protocol.r rVar = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str10 = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                switch (r10.hashCode()) {
                    case -795593025:
                        if (r10.equals("user_segment")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -147132913:
                        if (r10.equals("user_id")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -85904877:
                        if (r10.equals("environment")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3599307:
                        if (r10.equals("user")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 153193045:
                        if (r10.equals("sample_rate")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1090594823:
                        if (r10.equals("release")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1270300245:
                        if (r10.equals("trace_id")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1864843258:
                        if (r10.equals("sampled")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1904812937:
                        if (r10.equals("public_key")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2141246174:
                        if (r10.equals("transaction")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        str4 = c3409f0.x1();
                        break;
                    case 1:
                        str3 = c3409f0.x1();
                        break;
                    case 2:
                        str7 = c3409f0.x1();
                        break;
                    case 3:
                        cVar = (c) c3409f0.v1(iLogger, new c.a());
                        break;
                    case 4:
                        str9 = c3409f0.x1();
                        break;
                    case 5:
                        str6 = c3409f0.x1();
                        break;
                    case 6:
                        rVar = new r.a().a(c3409f0, iLogger);
                        break;
                    case 7:
                        str10 = c3409f0.x1();
                        break;
                    case '\b':
                        str5 = c3409f0.x();
                        break;
                    case '\t':
                        str8 = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            if (rVar == null) {
                throw c("trace_id", iLogger);
            }
            if (str5 == null) {
                throw c("public_key", iLogger);
            }
            if (cVar != null) {
                if (str3 == null) {
                    str3 = cVar.a();
                }
                if (str4 == null) {
                    str2 = cVar.b();
                    str = str3;
                    l2 l2Var = new l2(rVar, str5, str6, str7, str, str2, str8, str9, str10);
                    l2Var.b(concurrentHashMap);
                    c3409f0.g();
                    return l2Var;
                }
            }
            str = str3;
            str2 = str4;
            l2 l2Var2 = new l2(rVar, str5, str6, str7, str, str2, str8, str9, str10);
            l2Var2.b(concurrentHashMap);
            c3409f0.g();
            return l2Var2;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f35200a;

        /* renamed from: b, reason: collision with root package name */
        private String f35201b;

        /* renamed from: c, reason: collision with root package name */
        private Map f35202c;

        public static final class a implements Z {
            @Override // io.sentry.Z
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(C3409f0 c3409f0, ILogger iLogger) {
                c3409f0.b();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                    String r10 = c3409f0.r();
                    r10.hashCode();
                    if (r10.equals("id")) {
                        str = c3409f0.x1();
                    } else if (r10.equals("segment")) {
                        str2 = c3409f0.x1();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                    }
                }
                c cVar = new c(str, str2);
                cVar.c(concurrentHashMap);
                c3409f0.g();
                return cVar;
            }
        }

        public String a() {
            return this.f35200a;
        }

        public String b() {
            return this.f35201b;
        }

        public void c(Map map) {
            this.f35202c = map;
        }

        private c(String str, String str2) {
            this.f35200a = str;
            this.f35201b = str2;
        }
    }

    l2(io.sentry.protocol.r rVar, String str) {
        this(rVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f35197h;
    }

    public void b(Map map) {
        this.f35199j = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("trace_id").g(iLogger, this.f35190a);
        a02.k("public_key").b(this.f35191b);
        if (this.f35192c != null) {
            a02.k("release").b(this.f35192c);
        }
        if (this.f35193d != null) {
            a02.k("environment").b(this.f35193d);
        }
        if (this.f35194e != null) {
            a02.k("user_id").b(this.f35194e);
        }
        if (this.f35195f != null) {
            a02.k("user_segment").b(this.f35195f);
        }
        if (this.f35196g != null) {
            a02.k("transaction").b(this.f35196g);
        }
        if (this.f35197h != null) {
            a02.k("sample_rate").b(this.f35197h);
        }
        if (this.f35198i != null) {
            a02.k("sampled").b(this.f35198i);
        }
        Map map = this.f35199j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35199j.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    l2(io.sentry.protocol.r rVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f35190a = rVar;
        this.f35191b = str;
        this.f35192c = str2;
        this.f35193d = str3;
        this.f35194e = str4;
        this.f35195f = str5;
        this.f35196g = str6;
        this.f35197h = str7;
        this.f35198i = str8;
    }
}
