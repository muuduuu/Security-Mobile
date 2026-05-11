package io.sentry;

import com.appsflyer.attribution.RequestError;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class Z1 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f34600a;

    /* renamed from: b, reason: collision with root package name */
    private Date f34601b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f34602c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34603d;

    /* renamed from: e, reason: collision with root package name */
    private final UUID f34604e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f34605f;

    /* renamed from: g, reason: collision with root package name */
    private b f34606g;

    /* renamed from: h, reason: collision with root package name */
    private Long f34607h;

    /* renamed from: i, reason: collision with root package name */
    private Double f34608i;

    /* renamed from: j, reason: collision with root package name */
    private final String f34609j;

    /* renamed from: k, reason: collision with root package name */
    private String f34610k;

    /* renamed from: l, reason: collision with root package name */
    private final String f34611l;

    /* renamed from: m, reason: collision with root package name */
    private final String f34612m;

    /* renamed from: n, reason: collision with root package name */
    private String f34613n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f34614o;

    /* renamed from: p, reason: collision with root package name */
    private Map f34615p;

    public static final class a implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Z1 a(C3409f0 c3409f0, ILogger iLogger) {
            char c10;
            String str;
            char c11;
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            Integer num = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l10 = null;
            Double d10 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                switch (r10.hashCode()) {
                    case -1992012396:
                        if (r10.equals("duration")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1897185151:
                        if (r10.equals("started")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1294635157:
                        if (r10.equals("errors")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -892481550:
                        if (r10.equals("status")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 99455:
                        if (r10.equals("did")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 113759:
                        if (r10.equals("seq")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 113870:
                        if (r10.equals("sid")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3237136:
                        if (r10.equals("init")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 55126294:
                        if (r10.equals("timestamp")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 93152418:
                        if (r10.equals("attrs")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 213717026:
                        if (r10.equals("abnormal_mechanism")) {
                            c10 = '\n';
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
                        d10 = c3409f0.Z0();
                        break;
                    case 1:
                        date = c3409f0.O0(iLogger);
                        break;
                    case 2:
                        num = c3409f0.i1();
                        break;
                    case 3:
                        String b10 = io.sentry.util.r.b(c3409f0.x1());
                        if (b10 == null) {
                            break;
                        } else {
                            bVar = b.valueOf(b10);
                            break;
                        }
                    case 4:
                        str2 = c3409f0.x1();
                        break;
                    case 5:
                        l10 = c3409f0.m1();
                        break;
                    case 6:
                        try {
                            str = c3409f0.x1();
                        } catch (IllegalArgumentException unused) {
                            str = null;
                        }
                        try {
                            uuid = UUID.fromString(str);
                        } catch (IllegalArgumentException unused2) {
                            iLogger.c(K1.ERROR, "%s sid is not valid.", str);
                        }
                    case 7:
                        bool = c3409f0.A0();
                        break;
                    case '\b':
                        date2 = c3409f0.O0(iLogger);
                        break;
                    case '\t':
                        c3409f0.b();
                        while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                            String r11 = c3409f0.r();
                            r11.hashCode();
                            switch (r11.hashCode()) {
                                case -85904877:
                                    if (r11.equals("environment")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1090594823:
                                    if (r11.equals("release")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1480014044:
                                    if (r11.equals("ip_address")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1917799825:
                                    if (r11.equals("user_agent")) {
                                        c11 = 3;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            switch (c11) {
                                case 0:
                                    str5 = c3409f0.x1();
                                    break;
                                case 1:
                                    str6 = c3409f0.x1();
                                    break;
                                case 2:
                                    str3 = c3409f0.x1();
                                    break;
                                case 3:
                                    str4 = c3409f0.x1();
                                    break;
                                default:
                                    c3409f0.o0();
                                    break;
                            }
                        }
                        c3409f0.g();
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        str7 = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            if (bVar == null) {
                throw c("status", iLogger);
            }
            if (date == null) {
                throw c("started", iLogger);
            }
            if (num == null) {
                throw c("errors", iLogger);
            }
            if (str6 == null) {
                throw c("release", iLogger);
            }
            Z1 z12 = new Z1(bVar, date, date2, num.intValue(), str2, uuid, bool, l10, d10, str3, str4, str5, str6, str7);
            z12.o(concurrentHashMap);
            c3409f0.g();
            return z12;
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Z1(b bVar, Date date, Date date2, int i10, String str, UUID uuid, Boolean bool, Long l10, Double d10, String str2, String str3, String str4, String str5, String str6) {
        this.f34614o = new Object();
        this.f34606g = bVar;
        this.f34600a = date;
        this.f34601b = date2;
        this.f34602c = new AtomicInteger(i10);
        this.f34603d = str;
        this.f34604e = uuid;
        this.f34605f = bool;
        this.f34607h = l10;
        this.f34608i = d10;
        this.f34609j = str2;
        this.f34610k = str3;
        this.f34611l = str4;
        this.f34612m = str5;
        this.f34613n = str6;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f34600a.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z1 clone() {
        return new Z1(this.f34606g, this.f34600a, this.f34601b, this.f34602c.get(), this.f34603d, this.f34604e, this.f34605f, this.f34607h, this.f34608i, this.f34609j, this.f34610k, this.f34611l, this.f34612m, this.f34613n);
    }

    public void c() {
        d(AbstractC3420j.c());
    }

    public void d(Date date) {
        synchronized (this.f34614o) {
            try {
                this.f34605f = null;
                if (this.f34606g == b.Ok) {
                    this.f34606g = b.Exited;
                }
                if (date != null) {
                    this.f34601b = date;
                } else {
                    this.f34601b = AbstractC3420j.c();
                }
                Date date2 = this.f34601b;
                if (date2 != null) {
                    this.f34608i = Double.valueOf(a(date2));
                    this.f34607h = Long.valueOf(i(this.f34601b));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int e() {
        return this.f34602c.get();
    }

    public String f() {
        return this.f34613n;
    }

    public Boolean g() {
        return this.f34605f;
    }

    public String h() {
        return this.f34612m;
    }

    public UUID j() {
        return this.f34604e;
    }

    public Date k() {
        Date date = this.f34600a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f34606g;
    }

    public boolean m() {
        return this.f34606g != b.Ok;
    }

    public void n() {
        this.f34605f = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f34615p = map;
    }

    public boolean p(b bVar, String str, boolean z10) {
        return q(bVar, str, z10, null);
    }

    public boolean q(b bVar, String str, boolean z10, String str2) {
        boolean z11;
        boolean z12;
        synchronized (this.f34614o) {
            z11 = true;
            if (bVar != null) {
                try {
                    this.f34606g = bVar;
                    z12 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z12 = false;
            }
            if (str != null) {
                this.f34610k = str;
                z12 = true;
            }
            if (z10) {
                this.f34602c.addAndGet(1);
                z12 = true;
            }
            if (str2 != null) {
                this.f34613n = str2;
            } else {
                z11 = z12;
            }
            if (z11) {
                this.f34605f = null;
                Date c10 = AbstractC3420j.c();
                this.f34601b = c10;
                if (c10 != null) {
                    this.f34607h = Long.valueOf(i(c10));
                }
            }
        }
        return z11;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f34604e != null) {
            a02.k("sid").b(this.f34604e.toString());
        }
        if (this.f34603d != null) {
            a02.k("did").b(this.f34603d);
        }
        if (this.f34605f != null) {
            a02.k("init").h(this.f34605f);
        }
        a02.k("started").g(iLogger, this.f34600a);
        a02.k("status").g(iLogger, this.f34606g.name().toLowerCase(Locale.ROOT));
        if (this.f34607h != null) {
            a02.k("seq").e(this.f34607h);
        }
        a02.k("errors").a(this.f34602c.intValue());
        if (this.f34608i != null) {
            a02.k("duration").e(this.f34608i);
        }
        if (this.f34601b != null) {
            a02.k("timestamp").g(iLogger, this.f34601b);
        }
        if (this.f34613n != null) {
            a02.k("abnormal_mechanism").g(iLogger, this.f34613n);
        }
        a02.k("attrs");
        a02.f();
        a02.k("release").g(iLogger, this.f34612m);
        if (this.f34611l != null) {
            a02.k("environment").g(iLogger, this.f34611l);
        }
        if (this.f34609j != null) {
            a02.k("ip_address").g(iLogger, this.f34609j);
        }
        if (this.f34610k != null) {
            a02.k("user_agent").g(iLogger, this.f34610k);
        }
        a02.d();
        Map map = this.f34615p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34615p.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public Z1(String str, io.sentry.protocol.B b10, String str2, String str3) {
        this(b.Ok, AbstractC3420j.c(), AbstractC3420j.c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, b10 != null ? b10.l() : null, null, str2, str3, null);
    }
}
