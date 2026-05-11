package io.sentry.config;

import io.sentry.util.n;
import io.sentry.util.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f35077a;

    /* renamed from: b, reason: collision with root package name */
    private final Properties f35078b;

    protected a(String str, Properties properties) {
        this.f35077a = (String) n.c(str, "prefix is required");
        this.f35078b = (Properties) n.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public String a(String str) {
        return r.e(this.f35078b.getProperty(this.f35077a + str), "\"");
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        String str2 = this.f35077a + str + ".";
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f35078b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    hashMap.put(str3.substring(str2.length()), r.e((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    protected a(Properties properties) {
        this(BuildConfig.FLAVOR, properties);
    }
}
