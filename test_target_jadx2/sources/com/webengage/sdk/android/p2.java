package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class p2 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    protected static e3 f30762b;

    /* renamed from: c, reason: collision with root package name */
    private static p2 f30763c;

    /* renamed from: d, reason: collision with root package name */
    public static final m3.a f30764d = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30765a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (p2.f30763c == null) {
                p2 unused = p2.f30763c = new p2(context, null);
            }
            return p2.f30763c;
        }
    }

    private p2(Context context) {
        this.f30765a = null;
        this.f30765a = context.getApplicationContext();
        if (f30762b == null) {
            f30762b = new e3(new q2(), this.f30765a);
        }
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        d3 c10;
        HashMap hashMap = new HashMap();
        if (obj != null) {
            hashMap.put("action_data", obj);
            c10 = f30762b.b((p0) obj);
        } else {
            hashMap.put("action_data", null);
            c10 = f30762b.c();
        }
        hashMap.put("strategy", c10);
        return hashMap;
    }

    /* synthetic */ p2(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        if (obj == null || a(obj)) {
            new o2(this.f30765a).d(b(y3Var, obj));
        }
    }

    public boolean a(Object obj) {
        if (obj instanceof p0) {
            return (WebEngage.get().getWebEngageConfig().getFilterCustomEvents() && "application".equals(((p0) obj).b())) ? false : true;
        }
        return false;
    }
}
