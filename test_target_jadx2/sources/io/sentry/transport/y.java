package io.sentry.transport;

import io.sentry.C3416h1;
import io.sentry.C3471y1;
import io.sentry.EnumC3417i;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.util.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final o f35542a;

    /* renamed from: b, reason: collision with root package name */
    private final P1 f35543b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f35544c;

    public y(o oVar, P1 p12) {
        this.f35544c = new ConcurrentHashMap();
        this.f35542a = oVar;
        this.f35543b = p12;
    }

    private void c(EnumC3417i enumC3417i, Date date) {
        Date date2 = (Date) this.f35544c.get(enumC3417i);
        if (date2 == null || date.after(date2)) {
            this.f35544c.put(enumC3417i, date);
        }
    }

    private EnumC3417i e(String str) {
        str.hashCode();
        switch (str) {
            case "attachment":
                return EnumC3417i.Attachment;
            case "profile":
                return EnumC3417i.Profile;
            case "event":
                return EnumC3417i.Error;
            case "session":
                return EnumC3417i.Session;
            case "transaction":
                return EnumC3417i.Transaction;
            default:
                return EnumC3417i.Unknown;
        }
    }

    private boolean f(String str) {
        Date date;
        EnumC3417i e10 = e(str);
        Date date2 = new Date(this.f35542a.a());
        Date date3 = (Date) this.f35544c.get(EnumC3417i.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC3417i.Unknown.equals(e10) || (date = (Date) this.f35544c.get(e10)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    private static void i(io.sentry.A a10, final boolean z10) {
        io.sentry.util.j.o(a10, io.sentry.hints.o.class, new j.a() { // from class: io.sentry.transport.w
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.o) obj).b(false);
            }
        });
        io.sentry.util.j.o(a10, io.sentry.hints.j.class, new j.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.j) obj).c(z10);
            }
        });
    }

    private long j(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    public C3416h1 d(C3416h1 c3416h1, io.sentry.A a10) {
        ArrayList arrayList = null;
        for (C3471y1 c3471y1 : c3416h1.c()) {
            if (f(c3471y1.x().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3471y1);
                this.f35543b.getClientReportRecorder().d(io.sentry.clientreport.e.RATELIMIT_BACKOFF, c3471y1);
            }
        }
        if (arrayList == null) {
            return c3416h1;
        }
        this.f35543b.getLogger().c(K1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C3471y1 c3471y12 : c3416h1.c()) {
            if (!arrayList.contains(c3471y12)) {
                arrayList2.add(c3471y12);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C3416h1(c3416h1.b(), arrayList2);
        }
        this.f35543b.getLogger().c(K1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        i(a10, false);
        return null;
    }

    public void k(String str, String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                c(EnumC3417i.All, new Date(this.f35542a.a() + j(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] split = str3.replace(" ", BuildConfig.FLAVOR).split(":", -1);
            if (split.length > 0) {
                long j10 = j(split[0]);
                if (split.length > 1) {
                    String str4 = split[1];
                    Date date = new Date(this.f35542a.a() + j10);
                    if (str4 == null || str4.isEmpty()) {
                        c(EnumC3417i.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            EnumC3417i enumC3417i = EnumC3417i.Unknown;
                            try {
                                String b10 = io.sentry.util.r.b(str5);
                                if (b10 != null) {
                                    enumC3417i = EnumC3417i.valueOf(b10);
                                } else {
                                    this.f35543b.getLogger().c(K1.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.f35543b.getLogger().a(K1.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!EnumC3417i.Unknown.equals(enumC3417i)) {
                                c(enumC3417i, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public y(P1 p12) {
        this(m.b(), p12);
    }
}
