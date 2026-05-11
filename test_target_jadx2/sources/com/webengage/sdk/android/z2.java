package com.webengage.sdk.android;

import android.content.Context;
import com.facebook.react.modules.appstate.AppStateModule;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    Context f31185a;

    /* renamed from: b, reason: collision with root package name */
    C2961i f31186b;

    z2(C2961i c2961i, Context context) {
        this.f31186b = c2961i;
        this.f31185a = context.getApplicationContext();
    }

    public void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", AppStateModule.APP_STATE_BACKGROUND);
        try {
            o3.a(this.f31185a).a(y3.f31158c, n0.b("visitor_new_session", hashMap, null, null, this.f31185a));
        } catch (Exception e10) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", "online");
        String e10 = DataHolder.get().e();
        HashMap hashMap2 = new HashMap();
        if (!e10.isEmpty()) {
            hashMap2.put("sdk_meta", DataHolder.get().e());
        }
        try {
            o3.a(this.f31185a).a(y3.f31158c, n0.b("visitor_new_session", hashMap, hashMap2, null, this.f31185a));
            x.a(this.f31185a).onNewSessionStarted();
        } catch (Exception e11) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e11);
            } catch (Exception unused) {
            }
        }
    }

    public void c() {
        this.f31186b.c(-1L);
        d();
        i();
    }

    public void d() {
        try {
            o3.a(this.f31185a).a(y3.f31158c, n0.b("visitor_session_close", null, null, null, this.f31185a));
        } catch (Exception e10) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WebEngageConstant.d.PAGE_RULE);
        try {
            o3.a(this.f31185a).a(y3.f31167l, arrayList);
        } catch (Exception e10) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WebEngageConstant.d.SESSION_RULE);
        arrayList.add(WebEngageConstant.d.PAGE_RULE);
        try {
            o3.a(this.f31185a).a(y3.f31167l, arrayList);
        } catch (Exception e10) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e10);
            } catch (Exception unused) {
            }
        }
    }

    void g() {
        this.f31186b.o(new UUID(System.currentTimeMillis(), UUID.randomUUID().getLeastSignificantBits()).toString());
    }

    protected long h() {
        long sessionDestroyTime = WebEngage.get().getWebEngageConfig().getSessionDestroyTime();
        if (sessionDestroyTime == -1) {
            sessionDestroyTime = this.f31186b.l();
        }
        if (sessionDestroyTime != -1) {
            if (sessionDestroyTime > 3600000) {
                return 3600000L;
            }
            if (sessionDestroyTime >= 15) {
                return 1000 * sessionDestroyTime;
            }
        }
        return 1800000L;
    }

    public void i() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", AppStateModule.APP_STATE_BACKGROUND);
        WebEngage.startService(l1.a(y3.f31158c, n0.b("visitor_new_session", hashMap, null, null, this.f31185a), this.f31185a), this.f31185a);
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("time_spent", Long.valueOf(j10));
        try {
            o3.a(this.f31185a).a(y3.f31158c, n0.b("user_increment", hashMap, null, null, this.f31185a));
        } catch (Exception e10) {
            try {
                o3.a(this.f31185a).a(y3.f31163h, e10);
            } catch (Exception unused) {
            }
        }
    }
}
