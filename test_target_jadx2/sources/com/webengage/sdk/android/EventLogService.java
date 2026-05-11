package com.webengage.sdk.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class EventLogService extends v4 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30123a;

        static {
            int[] iArr = new int[y3.values().length];
            f30123a = iArr;
            try {
                iArr[y3.f31161f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.webengage.sdk.android.v4
    protected void a(Intent intent) {
        y3 y3Var;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (y3Var = (y3) extras.get("topic")) != null && a.f30123a[y3Var.ordinal()] == 1) {
                    o3.a(getApplicationContext()).a(y3Var, extras.get("data"));
                }
            } catch (Exception e10) {
                try {
                    o3.a(getApplicationContext()).a(y3.f31163h, e10);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public void onDestroy() {
        q2.c(true);
        super.onDestroy();
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public /* bridge */ /* synthetic */ void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // com.webengage.sdk.android.v4, android.app.Service
    public /* bridge */ /* synthetic */ boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
