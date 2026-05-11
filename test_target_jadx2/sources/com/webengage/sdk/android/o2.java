package com.webengage.sdk.android;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
class o2 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    Context f30739c;

    o2(Context context) {
        super(context);
        this.f30739c = null;
        this.f30739c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        p0 p0Var;
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("action_data");
        if (obj2 instanceof p0) {
            p0Var = (p0) obj2;
            p0Var.f(WebEngage.get().getWebEngageConfig().getWebEngageKey());
            p0Var.d(g());
        } else {
            p0Var = null;
        }
        ((d3) map.get("strategy")).a(p0Var);
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        return map;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }
}
