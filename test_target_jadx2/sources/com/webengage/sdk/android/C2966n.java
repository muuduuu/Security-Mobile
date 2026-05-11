package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.actions.database.DataHolder;
import java.util.Map;

/* renamed from: com.webengage.sdk.android.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2966n extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30727c;

    protected C2966n(Context context) {
        super(context);
        this.f30727c = null;
        this.f30727c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        String d10 = d();
        com.webengage.sdk.android.actions.database.e b10 = com.webengage.sdk.android.actions.database.e.b(this.f30727c);
        if (d10.isEmpty()) {
            d10 = h();
        }
        Map<String, Object> a10 = b10.a(d10);
        if (a10 == null || a10.size() <= 0) {
            return null;
        }
        DataHolder.get().c(a10);
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }
}
