package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class k0 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile k0 f30678b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30679c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30680a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (k0.f30678b == null) {
                k0 unused = k0.f30678b = new k0(context, null);
            }
            return k0.f30678b;
        }
    }

    private k0(Context context) {
        this.f30680a = null;
        this.f30680a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        return hashMap;
    }

    /* synthetic */ k0(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        if (obj == null) {
            return;
        }
        new j0(this.f30680a).d(b(y3Var, obj));
    }
}
