package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class r3 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static r3 f30792b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30793c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30794a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (r3.f30792b == null) {
                r3 unused = r3.f30792b = new r3(context, null);
            }
            return r3.f30792b;
        }
    }

    private r3(Context context) {
        this.f30794a = null;
        this.f30794a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("server_url", WebEngageConstant.e.UPLOAD_EVENTS_URL.toString());
        hashMap.put("action_data", obj);
        return hashMap;
    }

    /* synthetic */ r3(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        new q3(this.f30794a).d(b(y3Var, obj));
    }
}
