package com.google.firebase.messaging;

import android.os.Bundle;
import j0.C3476a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2840e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f28168a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C3476a a(Bundle bundle) {
            C3476a c3476a = new C3476a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c3476a.put(str, str2);
                    }
                }
            }
            return c3476a;
        }
    }
}
