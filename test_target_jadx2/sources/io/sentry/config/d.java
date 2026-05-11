package io.sentry.config;

import io.sentry.util.r;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class d implements f {
    d() {
    }

    private String g(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.f
    public String a(String str) {
        return r.e(System.getenv(g(str)), "\"");
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        String e10;
        String str2 = g(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (e10 = r.e(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), e10);
            }
        }
        return concurrentHashMap;
    }
}
