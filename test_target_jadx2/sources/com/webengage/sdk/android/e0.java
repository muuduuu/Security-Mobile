package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e0 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static e0 f30504b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30505c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30506a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (e0.f30504b == null) {
                e0 unused = e0.f30504b = new e0(context, null);
            }
            return e0.f30504b;
        }
    }

    private e0(Context context) {
        this.f30506a = null;
        this.f30506a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("config_url", WebEngageConstant.e.a(WebEngage.get().getWebEngageConfig().getWebEngageKey()));
        hashMap.put("topic", y3Var);
        return hashMap;
    }

    /* synthetic */ e0(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        new d0(this.f30506a).d(b(y3Var, obj));
    }
}
