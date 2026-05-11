package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.K1;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    private final Pattern f35165d;

    /* renamed from: e, reason: collision with root package name */
    private final Pattern f35166e;

    /* renamed from: f, reason: collision with root package name */
    private final ClassLoader f35167f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f35168a;

        /* renamed from: b, reason: collision with root package name */
        private final String f35169b;

        public a(String str, String str2) {
            this.f35168a = str;
            this.f35169b = str2;
        }
    }

    public c(ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    private a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f35166e.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private List e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f35167f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a d10 = d(f(resources.nextElement()));
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
        } catch (Throwable th) {
            this.f35171a.b(K1.ERROR, "Unable to detect modules via manifest files.", th);
        }
        return arrayList;
    }

    private String f(URL url) {
        Matcher matcher = this.f35165d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        HashMap hashMap = new HashMap();
        for (a aVar : e()) {
            hashMap.put(aVar.f35168a, aVar.f35169b);
        }
        return hashMap;
    }

    c(ClassLoader classLoader, ILogger iLogger) {
        super(iLogger);
        this.f35165d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f35166e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f35167f = io.sentry.util.a.a(classLoader);
    }
}
