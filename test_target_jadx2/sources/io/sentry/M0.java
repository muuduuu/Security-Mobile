package io.sentry;

import java.net.URI;
import java.util.HashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f34519a;

    public M0(P1 p12) {
        this.f34519a = (P1) io.sentry.util.n.c(p12, "options is required");
    }

    L0 a() {
        String str;
        C3445q c3445q = new C3445q(this.f34519a.getDsn());
        URI c10 = c3445q.c();
        String uri = c10.resolve(c10.getPath() + "/envelope/").toString();
        String a10 = c3445q.a();
        String b10 = c3445q.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f34519a.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append(a10);
        if (b10 == null || b10.length() <= 0) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ",sentry_secret=" + b10;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String sentryClientName = this.f34519a.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        return new L0(uri, hashMap);
    }
}
