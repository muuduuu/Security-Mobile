package io.sentry.util;

import io.sentry.K1;
import io.sentry.P1;
import java.util.Properties;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f35553a = "sentry-debug-meta.properties";

    private static void a(P1 p12, Properties properties) {
        if (p12.getBundleIds().isEmpty()) {
            String property = properties.getProperty("io.sentry.bundle-ids");
            p12.getLogger().c(K1.DEBUG, "Bundle IDs found: %s", property);
            if (property != null) {
                for (String str : property.split(",", -1)) {
                    p12.addBundleId(str);
                }
            }
        }
    }

    private static void b(P1 p12, Properties properties) {
        if (p12.getProguardUuid() == null) {
            String property = properties.getProperty("io.sentry.ProguardUuids");
            p12.getLogger().c(K1.DEBUG, "Proguard UUID found: %s", property);
            p12.setProguardUuid(property);
        }
    }

    public static void c(P1 p12, Properties properties) {
        if (properties != null) {
            b(p12, properties);
            a(p12, properties);
        }
    }
}
