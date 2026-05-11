package Yd;

import Td.C1228d;
import Td.D;
import Td.F;
import Td.v;
import Wd.m;
import be.AbstractC1681c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12200c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final D f12201a;

    /* renamed from: b, reason: collision with root package name */
    private final F f12202b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(F response, D request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int f10 = response.f();
            if (f10 != 200 && f10 != 410 && f10 != 414 && f10 != 501 && f10 != 203 && f10 != 204) {
                if (f10 != 307) {
                    if (f10 != 308 && f10 != 404 && f10 != 405) {
                        switch (f10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (F.o(response, "Expires", null, 2, null) == null && response.c().e() == -1 && !response.c().d() && !response.c().c()) {
                    return false;
                }
            }
            return (response.c().j() || request.b().j()) ? false : true;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f12203a;

        /* renamed from: b, reason: collision with root package name */
        private final D f12204b;

        /* renamed from: c, reason: collision with root package name */
        private final F f12205c;

        /* renamed from: d, reason: collision with root package name */
        private Date f12206d;

        /* renamed from: e, reason: collision with root package name */
        private String f12207e;

        /* renamed from: f, reason: collision with root package name */
        private Date f12208f;

        /* renamed from: g, reason: collision with root package name */
        private String f12209g;

        /* renamed from: h, reason: collision with root package name */
        private Date f12210h;

        /* renamed from: i, reason: collision with root package name */
        private long f12211i;

        /* renamed from: j, reason: collision with root package name */
        private long f12212j;

        /* renamed from: k, reason: collision with root package name */
        private String f12213k;

        /* renamed from: l, reason: collision with root package name */
        private int f12214l;

        public b(long j10, D request, F f10) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f12203a = j10;
            this.f12204b = request;
            this.f12205c = f10;
            this.f12214l = -1;
            if (f10 != null) {
                this.f12211i = f10.C();
                this.f12212j = f10.y();
                v p10 = f10.p();
                int size = p10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String h10 = p10.h(i10);
                    String v10 = p10.v(i10);
                    if (StringsKt.r(h10, "Date", true)) {
                        this.f12206d = AbstractC1681c.a(v10);
                        this.f12207e = v10;
                    } else if (StringsKt.r(h10, "Expires", true)) {
                        this.f12210h = AbstractC1681c.a(v10);
                    } else if (StringsKt.r(h10, "Last-Modified", true)) {
                        this.f12208f = AbstractC1681c.a(v10);
                        this.f12209g = v10;
                    } else if (StringsKt.r(h10, "ETag", true)) {
                        this.f12213k = v10;
                    } else if (StringsKt.r(h10, "Age", true)) {
                        this.f12214l = m.H(v10, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f12206d;
            long max = date != null ? Math.max(0L, this.f12212j - date.getTime()) : 0L;
            int i10 = this.f12214l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            return max + Math.max(0L, this.f12212j - this.f12211i) + Math.max(0L, this.f12203a - this.f12212j);
        }

        private final d c() {
            String str;
            if (this.f12205c == null) {
                return new d(this.f12204b, null);
            }
            if (this.f12204b.h() && this.f12205c.j() == null) {
                return new d(this.f12204b, null);
            }
            if (!d.f12200c.a(this.f12205c, this.f12204b)) {
                return new d(this.f12204b, null);
            }
            C1228d b10 = this.f12204b.b();
            if (b10.i() || e(this.f12204b)) {
                return new d(this.f12204b, null);
            }
            C1228d c10 = this.f12205c.c();
            long a10 = a();
            long d10 = d();
            if (b10.e() != -1) {
                d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.e()));
            }
            long j10 = 0;
            long millis = b10.g() != -1 ? TimeUnit.SECONDS.toMillis(b10.g()) : 0L;
            if (!c10.h() && b10.f() != -1) {
                j10 = TimeUnit.SECONDS.toMillis(b10.f());
            }
            if (!c10.i()) {
                long j11 = millis + a10;
                if (j11 < j10 + d10) {
                    F.a t10 = this.f12205c.t();
                    if (j11 >= d10) {
                        t10.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        t10.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d(null, t10.c());
                }
            }
            String str2 = this.f12213k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f12208f != null) {
                    str2 = this.f12209g;
                } else {
                    if (this.f12206d == null) {
                        return new d(this.f12204b, null);
                    }
                    str2 = this.f12207e;
                }
                str = "If-Modified-Since";
            }
            v.a m10 = this.f12204b.f().m();
            Intrinsics.d(str2);
            m10.d(str, str2);
            return new d(this.f12204b.j().m(m10.f()).b(), this.f12205c);
        }

        private final long d() {
            F f10 = this.f12205c;
            Intrinsics.d(f10);
            if (f10.c().e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.e());
            }
            Date date = this.f12210h;
            if (date != null) {
                Date date2 = this.f12206d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f12212j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f12208f == null || this.f12205c.z().n().o() != null) {
                return 0L;
            }
            Date date3 = this.f12206d;
            long time2 = date3 != null ? date3.getTime() : this.f12211i;
            Date date4 = this.f12208f;
            Intrinsics.d(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean e(D d10) {
            return (d10.e("If-Modified-Since") == null && d10.e("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            F f10 = this.f12205c;
            Intrinsics.d(f10);
            return f10.c().e() == -1 && this.f12210h == null;
        }

        public final d b() {
            d c10 = c();
            return (c10.b() == null || !this.f12204b.b().l()) ? c10 : new d(null, null);
        }
    }

    public d(D d10, F f10) {
        this.f12201a = d10;
        this.f12202b = f10;
    }

    public final F a() {
        return this.f12202b;
    }

    public final D b() {
        return this.f12201a;
    }
}
