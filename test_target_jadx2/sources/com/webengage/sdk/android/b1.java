package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class b1 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    static AtomicBoolean f30468b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static b1 f30469c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final m3.a f30470d = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30471a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (b1.f30469c == null) {
                b1 unused = b1.f30469c = new b1(context, null);
            }
            return b1.f30469c;
        }
    }

    private b1(Context context) {
        this.f30471a = null;
        this.f30471a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        return hashMap;
    }

    /* synthetic */ b1(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        if (WebEngage.get().getWebEngageConfig().getAutoGCMRegistrationFlag()) {
            p0 p0Var = (p0) obj;
            a1 a1Var = new a1(this.f30471a);
            if (y3Var != null) {
                if (!y3.f31157b.equals(y3Var)) {
                    if (!y3.f31158c.equals(y3Var) || p0Var == null) {
                        return;
                    }
                    if (!"app_upgraded".equals(p0Var.d()) && !"visitor_new_session".equals(p0Var.d())) {
                        return;
                    }
                }
                if (f30468b.compareAndSet(false, true)) {
                    a1Var.c(b(y3Var, obj));
                }
            }
        }
    }
}
