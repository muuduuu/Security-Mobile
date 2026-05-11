package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.InputStream;

/* renamed from: com.webengage.sdk.android.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2964l {

    /* renamed from: com.webengage.sdk.android.l$b */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Object f30692a;

        /* renamed from: b, reason: collision with root package name */
        private Context f30693b;

        private b(Object obj, Context context) {
            this.f30692a = obj;
            this.f30693b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = this.f30692a;
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                } else if (obj instanceof RequestObject) {
                    InputStream inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30693b, (RequestObject) obj, true, true).get("data");
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(Object obj, Context context) {
        x3.a().a(new b(obj, context));
    }
}
