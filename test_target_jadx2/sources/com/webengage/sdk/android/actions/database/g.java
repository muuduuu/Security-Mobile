package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.y3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
public class g implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static g f30298b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30299c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30300a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (g.f30298b == null) {
                g unused = g.f30298b = new g(context, null);
            }
            return g.f30298b;
        }
    }

    private g(Context context) {
        this.f30300a = null;
        this.f30300a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("topic", y3Var);
        hashMap.put("data", obj);
        return hashMap;
    }

    /* synthetic */ g(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        if (a(obj)) {
            new f(this.f30300a).d(b(y3Var, obj));
            return;
        }
        Logger.i("WebEngage", "Failed to fetch User Profile context " + obj);
    }

    public boolean a(Object obj) {
        try {
            return !((HashSet) obj).isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }
}
