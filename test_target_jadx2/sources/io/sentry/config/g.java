package io.sentry.config;

import io.sentry.k2;
import java.util.ArrayList;
import java.util.Properties;

/* loaded from: classes2.dex */
public abstract class g {
    public static f a() {
        Properties a10;
        Properties a11;
        k2 k2Var = new k2();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (a11 = new e(property, k2Var).a()) != null) {
            arrayList.add(new h(a11));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (a10 = new e(str, k2Var).a()) != null) {
            arrayList.add(new h(a10));
        }
        Properties a12 = new b(k2Var).a();
        if (a12 != null) {
            arrayList.add(new h(a12));
        }
        Properties a13 = new e("sentry.properties", k2Var).a();
        if (a13 != null) {
            arrayList.add(new h(a13));
        }
        return new c(arrayList);
    }
}
