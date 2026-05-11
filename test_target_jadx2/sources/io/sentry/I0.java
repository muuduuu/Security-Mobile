package io.sentry;

import io.sentry.J0;
import io.sentry.profilemeasurements.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class I0 implements InterfaceC3421j0 {

    /* renamed from: A, reason: collision with root package name */
    private String f34467A;

    /* renamed from: B, reason: collision with root package name */
    private Map f34468B;

    /* renamed from: a, reason: collision with root package name */
    private final File f34469a;

    /* renamed from: b, reason: collision with root package name */
    private final Callable f34470b;

    /* renamed from: c, reason: collision with root package name */
    private int f34471c;

    /* renamed from: d, reason: collision with root package name */
    private String f34472d;

    /* renamed from: e, reason: collision with root package name */
    private String f34473e;

    /* renamed from: f, reason: collision with root package name */
    private String f34474f;

    /* renamed from: g, reason: collision with root package name */
    private String f34475g;

    /* renamed from: h, reason: collision with root package name */
    private String f34476h;

    /* renamed from: i, reason: collision with root package name */
    private String f34477i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34478j;

    /* renamed from: k, reason: collision with root package name */
    private String f34479k;

    /* renamed from: l, reason: collision with root package name */
    private List f34480l;

    /* renamed from: m, reason: collision with root package name */
    private String f34481m;

    /* renamed from: n, reason: collision with root package name */
    private String f34482n;

    /* renamed from: o, reason: collision with root package name */
    private String f34483o;

    /* renamed from: p, reason: collision with root package name */
    private List f34484p;

    /* renamed from: q, reason: collision with root package name */
    private String f34485q;

    /* renamed from: r, reason: collision with root package name */
    private String f34486r;

    /* renamed from: s, reason: collision with root package name */
    private String f34487s;

    /* renamed from: t, reason: collision with root package name */
    private String f34488t;

    /* renamed from: u, reason: collision with root package name */
    private String f34489u;

    /* renamed from: v, reason: collision with root package name */
    private String f34490v;

    /* renamed from: w, reason: collision with root package name */
    private String f34491w;

    /* renamed from: x, reason: collision with root package name */
    private String f34492x;

    /* renamed from: y, reason: collision with root package name */
    private String f34493y;

    /* renamed from: z, reason: collision with root package name */
    private final Map f34494z;

    public static final class b implements Z {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I0 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            I0 i02 = new I0();
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "device_manufacturer":
                        String x12 = c3409f0.x1();
                        if (x12 == null) {
                            break;
                        } else {
                            i02.f34473e = x12;
                            break;
                        }
                    case "android_api_level":
                        Integer i12 = c3409f0.i1();
                        if (i12 == null) {
                            break;
                        } else {
                            i02.f34471c = i12.intValue();
                            break;
                        }
                    case "build_id":
                        String x13 = c3409f0.x1();
                        if (x13 == null) {
                            break;
                        } else {
                            i02.f34483o = x13;
                            break;
                        }
                    case "device_locale":
                        String x14 = c3409f0.x1();
                        if (x14 == null) {
                            break;
                        } else {
                            i02.f34472d = x14;
                            break;
                        }
                    case "profile_id":
                        String x15 = c3409f0.x1();
                        if (x15 == null) {
                            break;
                        } else {
                            i02.f34491w = x15;
                            break;
                        }
                    case "device_os_build_number":
                        String x16 = c3409f0.x1();
                        if (x16 == null) {
                            break;
                        } else {
                            i02.f34475g = x16;
                            break;
                        }
                    case "device_model":
                        String x17 = c3409f0.x1();
                        if (x17 == null) {
                            break;
                        } else {
                            i02.f34474f = x17;
                            break;
                        }
                    case "device_is_emulator":
                        Boolean A02 = c3409f0.A0();
                        if (A02 == null) {
                            break;
                        } else {
                            i02.f34478j = A02.booleanValue();
                            break;
                        }
                    case "duration_ns":
                        String x18 = c3409f0.x1();
                        if (x18 == null) {
                            break;
                        } else {
                            i02.f34486r = x18;
                            break;
                        }
                    case "measurements":
                        Map o12 = c3409f0.o1(iLogger, new a.C0510a());
                        if (o12 == null) {
                            break;
                        } else {
                            i02.f34494z.putAll(o12);
                            break;
                        }
                    case "device_physical_memory_bytes":
                        String x19 = c3409f0.x1();
                        if (x19 == null) {
                            break;
                        } else {
                            i02.f34481m = x19;
                            break;
                        }
                    case "device_cpu_frequencies":
                        List list = (List) c3409f0.t1();
                        if (list == null) {
                            break;
                        } else {
                            i02.f34480l = list;
                            break;
                        }
                    case "version_code":
                        String x110 = c3409f0.x1();
                        if (x110 == null) {
                            break;
                        } else {
                            i02.f34487s = x110;
                            break;
                        }
                    case "version_name":
                        String x111 = c3409f0.x1();
                        if (x111 == null) {
                            break;
                        } else {
                            i02.f34488t = x111;
                            break;
                        }
                    case "environment":
                        String x112 = c3409f0.x1();
                        if (x112 == null) {
                            break;
                        } else {
                            i02.f34492x = x112;
                            break;
                        }
                    case "transaction_name":
                        String x113 = c3409f0.x1();
                        if (x113 == null) {
                            break;
                        } else {
                            i02.f34485q = x113;
                            break;
                        }
                    case "device_os_name":
                        String x114 = c3409f0.x1();
                        if (x114 == null) {
                            break;
                        } else {
                            i02.f34476h = x114;
                            break;
                        }
                    case "architecture":
                        String x115 = c3409f0.x1();
                        if (x115 == null) {
                            break;
                        } else {
                            i02.f34479k = x115;
                            break;
                        }
                    case "transaction_id":
                        String x116 = c3409f0.x1();
                        if (x116 == null) {
                            break;
                        } else {
                            i02.f34489u = x116;
                            break;
                        }
                    case "device_os_version":
                        String x117 = c3409f0.x1();
                        if (x117 == null) {
                            break;
                        } else {
                            i02.f34477i = x117;
                            break;
                        }
                    case "truncation_reason":
                        String x118 = c3409f0.x1();
                        if (x118 == null) {
                            break;
                        } else {
                            i02.f34493y = x118;
                            break;
                        }
                    case "trace_id":
                        String x119 = c3409f0.x1();
                        if (x119 == null) {
                            break;
                        } else {
                            i02.f34490v = x119;
                            break;
                        }
                    case "platform":
                        String x120 = c3409f0.x1();
                        if (x120 == null) {
                            break;
                        } else {
                            i02.f34482n = x120;
                            break;
                        }
                    case "sampled_profile":
                        String x121 = c3409f0.x1();
                        if (x121 == null) {
                            break;
                        } else {
                            i02.f34467A = x121;
                            break;
                        }
                    case "transactions":
                        List l12 = c3409f0.l1(iLogger, new J0.a());
                        if (l12 == null) {
                            break;
                        } else {
                            i02.f34484p.addAll(l12);
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            i02.H(concurrentHashMap);
            c3409f0.g();
            return i02;
        }
    }

    private boolean D() {
        return this.f34493y.equals("normal") || this.f34493y.equals("timeout") || this.f34493y.equals("backgrounded");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List E() {
        return new ArrayList();
    }

    public String A() {
        return this.f34491w;
    }

    public File B() {
        return this.f34469a;
    }

    public String C() {
        return this.f34489u;
    }

    public void F() {
        try {
            this.f34480l = (List) this.f34470b.call();
        } catch (Throwable unused) {
        }
    }

    public void G(String str) {
        this.f34467A = str;
    }

    public void H(Map map) {
        this.f34468B = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("android_api_level").g(iLogger, Integer.valueOf(this.f34471c));
        a02.k("device_locale").g(iLogger, this.f34472d);
        a02.k("device_manufacturer").b(this.f34473e);
        a02.k("device_model").b(this.f34474f);
        a02.k("device_os_build_number").b(this.f34475g);
        a02.k("device_os_name").b(this.f34476h);
        a02.k("device_os_version").b(this.f34477i);
        a02.k("device_is_emulator").c(this.f34478j);
        a02.k("architecture").g(iLogger, this.f34479k);
        a02.k("device_cpu_frequencies").g(iLogger, this.f34480l);
        a02.k("device_physical_memory_bytes").b(this.f34481m);
        a02.k("platform").b(this.f34482n);
        a02.k("build_id").b(this.f34483o);
        a02.k("transaction_name").b(this.f34485q);
        a02.k("duration_ns").b(this.f34486r);
        a02.k("version_name").b(this.f34488t);
        a02.k("version_code").b(this.f34487s);
        if (!this.f34484p.isEmpty()) {
            a02.k("transactions").g(iLogger, this.f34484p);
        }
        a02.k("transaction_id").b(this.f34489u);
        a02.k("trace_id").b(this.f34490v);
        a02.k("profile_id").b(this.f34491w);
        a02.k("environment").b(this.f34492x);
        a02.k("truncation_reason").b(this.f34493y);
        if (this.f34467A != null) {
            a02.k("sampled_profile").b(this.f34467A);
        }
        a02.k("measurements").g(iLogger, this.f34494z);
        Map map = this.f34468B;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34468B.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    private I0() {
        this(new File("dummy"), C3464w0.s());
    }

    public I0(File file, T t10) {
        this(file, new ArrayList(), t10, "0", 0, BuildConfig.FLAVOR, new Callable() { // from class: io.sentry.H0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List E10;
                E10 = I0.E();
                return E10;
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public I0(File file, List list, T t10, String str, int i10, String str2, Callable callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, Map map) {
        this.f34480l = new ArrayList();
        this.f34467A = null;
        this.f34469a = file;
        this.f34479k = str2;
        this.f34470b = callable;
        this.f34471c = i10;
        this.f34472d = Locale.getDefault().toString();
        String str11 = BuildConfig.FLAVOR;
        this.f34473e = str3 != null ? str3 : BuildConfig.FLAVOR;
        this.f34474f = str4 != null ? str4 : BuildConfig.FLAVOR;
        this.f34477i = str5 != null ? str5 : BuildConfig.FLAVOR;
        this.f34478j = bool != null ? bool.booleanValue() : false;
        this.f34481m = str6 != null ? str6 : "0";
        this.f34475g = BuildConfig.FLAVOR;
        this.f34476h = "android";
        this.f34482n = "android";
        this.f34483o = str7 != null ? str7 : BuildConfig.FLAVOR;
        this.f34484p = list;
        this.f34485q = t10.getName();
        this.f34486r = str;
        this.f34487s = BuildConfig.FLAVOR;
        this.f34488t = str8 != null ? str8 : str11;
        this.f34489u = t10.l().toString();
        this.f34490v = t10.n().k().toString();
        this.f34491w = UUID.randomUUID().toString();
        this.f34492x = str9 != null ? str9 : "production";
        this.f34493y = str10;
        if (!D()) {
            this.f34493y = "normal";
        }
        this.f34494z = map;
    }
}
