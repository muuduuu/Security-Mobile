package io.sentry.clientreport;

import io.sentry.AbstractC3420j;
import io.sentry.C3416h1;
import io.sentry.C3471y1;
import io.sentry.EnumC3417i;
import io.sentry.J1;
import io.sentry.K1;
import io.sentry.P1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f35071a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final P1 f35072b;

    public d(P1 p12) {
        this.f35072b = p12;
    }

    private EnumC3417i e(J1 j12) {
        return J1.Event.equals(j12) ? EnumC3417i.Error : J1.Session.equals(j12) ? EnumC3417i.Session : J1.Transaction.equals(j12) ? EnumC3417i.Transaction : J1.UserFeedback.equals(j12) ? EnumC3417i.UserReport : J1.Profile.equals(j12) ? EnumC3417i.Profile : J1.Attachment.equals(j12) ? EnumC3417i.Attachment : EnumC3417i.Default;
    }

    private void f(String str, String str2, Long l10) {
        this.f35071a.b(new c(str, str2), l10);
    }

    private void h(b bVar) {
        if (bVar == null) {
            return;
        }
        for (f fVar : bVar.a()) {
            f(fVar.c(), fVar.a(), fVar.b());
        }
    }

    @Override // io.sentry.clientreport.g
    public void a(e eVar, EnumC3417i enumC3417i) {
        try {
            f(eVar.getReason(), enumC3417i.getCategory(), 1L);
        } catch (Throwable th) {
            this.f35072b.getLogger().a(K1.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public void b(e eVar, C3416h1 c3416h1) {
        if (c3416h1 == null) {
            return;
        }
        try {
            Iterator it = c3416h1.c().iterator();
            while (it.hasNext()) {
                d(eVar, (C3471y1) it.next());
            }
        } catch (Throwable th) {
            this.f35072b.getLogger().a(K1.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public C3416h1 c(C3416h1 c3416h1) {
        b g10 = g();
        if (g10 == null) {
            return c3416h1;
        }
        try {
            this.f35072b.getLogger().c(K1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = c3416h1.c().iterator();
            while (it.hasNext()) {
                arrayList.add((C3471y1) it.next());
            }
            arrayList.add(C3471y1.r(this.f35072b.getSerializer(), g10));
            return new C3416h1(c3416h1.b(), arrayList);
        } catch (Throwable th) {
            this.f35072b.getLogger().a(K1.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c3416h1;
        }
    }

    @Override // io.sentry.clientreport.g
    public void d(e eVar, C3471y1 c3471y1) {
        if (c3471y1 == null) {
            return;
        }
        try {
            J1 b10 = c3471y1.x().b();
            if (J1.ClientReport.equals(b10)) {
                try {
                    h(c3471y1.v(this.f35072b.getSerializer()));
                } catch (Exception unused) {
                    this.f35072b.getLogger().c(K1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                f(eVar.getReason(), e(b10).getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f35072b.getLogger().a(K1.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    b g() {
        Date c10 = AbstractC3420j.c();
        List a10 = this.f35071a.a();
        if (a10.isEmpty()) {
            return null;
        }
        return new b(c10, a10);
    }
}
