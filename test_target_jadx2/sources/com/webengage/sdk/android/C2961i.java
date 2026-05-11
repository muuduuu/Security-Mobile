package com.webengage.sdk.android;

import android.content.Context;
import java.util.List;

/* renamed from: com.webengage.sdk.android.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2961i extends C2965m implements b2 {
    public C2961i(Context context) {
        super(context);
    }

    public void a(int i10) {
        a("com.webengage.static.version_code", Integer.valueOf(i10));
    }

    void b(boolean z10) {
        a("install_referrer_set", Boolean.valueOf(z10));
    }

    public void l(String str) {
        a("com.webengage.static.cuid", (Object) str);
    }

    public void m(String str) {
        a("com.webengage.static.interfaceID", (Object) str);
    }

    public void n(String str) {
        a("com.webengage.static.luid", (Object) str);
    }

    public void o(String str) {
        a("com.webengage.session.suid", (Object) str);
    }

    public void p(String str) {
        a("com.webengage.static.we_instance_id", (Object) str);
    }

    @Override // com.webengage.sdk.android.b2
    public void a(List<Object> list, Object obj, String str, c2 c2Var) {
    }

    public void a(boolean z10) {
        a("webengage_volatile_prefs.txt", "com.webengage.static.app_crashed", (Object) Boolean.valueOf(z10), true);
    }
}
