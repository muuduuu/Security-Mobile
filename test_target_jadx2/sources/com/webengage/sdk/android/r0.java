package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class r0 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static r0 f30786b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30787c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30788a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (r0.f30786b == null) {
                r0 unused = r0.f30786b = new r0(context, null);
            }
            return r0.f30786b;
        }
    }

    private r0(Context context) {
        this.f30788a = null;
        this.f30788a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        return hashMap;
    }

    /* synthetic */ r0(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        new q0(this.f30788a).d(b(y3Var, obj));
    }
}
