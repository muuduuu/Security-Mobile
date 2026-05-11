package com.webengage.sdk.android;

import android.content.Context;
import java.util.Map;

/* renamed from: com.webengage.sdk.android.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2951a extends C2965m {

    /* renamed from: com.webengage.sdk.android.a$a, reason: collision with other inner class name */
    private class RunnableC0441a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Map<String, Object> f30267a;

        RunnableC0441a(Map<String, Object> map) {
            this.f30267a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC2951a abstractC2951a = AbstractC2951a.this;
                abstractC2951a.e(abstractC2951a.d(abstractC2951a.e(this.f30267a)));
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.getMessage());
            }
        }
    }

    protected AbstractC2951a(Context context) {
        super(context);
    }

    public x a(Context context) {
        return x.a(context.getApplicationContext());
    }

    protected void b(Object obj) {
        WebEngage.startService(l1.a(y3.f31163h, obj, this.f30721a), this.f30721a);
    }

    protected void c(Object obj) {
        WebEngage.startService(l1.a(y3.f31166k, new n3(h(), obj), this.f30721a), this.f30721a);
    }

    protected abstract Object d(Object obj);

    public void d(Map<String, Object> map) {
        e(d(e(map)));
    }

    protected abstract Object e(Map<String, Object> map);

    protected abstract void e(Object obj);

    protected void a(Object obj) {
        WebEngage.startService(l1.a(y3.f31158c, obj, this.f30721a), this.f30721a);
    }

    public void c(Map<String, Object> map) {
        C2964l.a(new RunnableC0441a(map), this.f30721a);
    }
}
