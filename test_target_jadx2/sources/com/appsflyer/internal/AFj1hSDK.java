package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object obj;
        Object obj2 = BuildConfig.FLAVOR;
        try {
            o.a aVar = lc.o.f37128b;
            Field declaredField = com.android.billingclient.BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj3 = declaredField.get(null);
            Intrinsics.e(obj3, "");
            obj = lc.o.b((String) obj3);
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            obj = lc.o.b(lc.p.a(th));
        }
        if (!lc.o.f(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }
}
