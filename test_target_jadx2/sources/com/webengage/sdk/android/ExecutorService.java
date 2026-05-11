package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public class ExecutorService extends v4 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30124a;

        static {
            int[] iArr = new int[y3.values().length];
            f30124a = iArr;
            try {
                iArr[y3.f31157b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30124a[y3.f31164i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30124a[y3.f31158c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30124a[y3.f31165j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30124a[y3.f31159d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30124a[y3.f31162g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30124a[y3.f31163h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30124a[y3.f31166k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30124a[y3.f31160e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30124a[y3.f31167l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30124a[y3.f31168m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30124a[y3.f31170o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30124a[y3.f31169n.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private void a(Context context, Intent intent) {
        if (intent.getExtras().getInt("action_name") != 1) {
            return;
        }
        C2958f.a(context).c().c();
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
    public /* bridge */ /* synthetic */ void onDestroy() {
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

    @Override // com.webengage.sdk.android.v4
    protected void a(Intent intent) {
        Bundle extras;
        Object obj;
        Object b10;
        o3 o3Var;
        Context applicationContext = getApplicationContext();
        try {
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    o3.a(applicationContext).a(y3.f31163h, e10);
                }
                if (extras != null) {
                    y3 y3Var = (y3) extras.get("topic");
                    if (y3Var == null) {
                        a(applicationContext, intent);
                        return;
                    }
                    switch (a.f30124a[y3Var.ordinal()]) {
                        case 1:
                        case 9:
                        case 12:
                            o3.a(applicationContext).a(y3Var, null);
                            break;
                        case 2:
                        case 3:
                            obj = (p0) extras.getSerializable("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 4:
                            obj = (HashMap) extras.getSerializable("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 5:
                            obj = extras.getBundle("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 6:
                            obj = (Intent) extras.getParcelable("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 7:
                            o3.a(applicationContext).a(y3Var, (Exception) extras.getSerializable("data"));
                            break;
                        case 8:
                            n3 n3Var = (n3) extras.getSerializable("data");
                            if (C2958f.a(getApplicationContext()).a().h().equals(n3Var.a())) {
                                o3 a10 = o3.a(applicationContext);
                                b10 = n3Var.b();
                                o3Var = a10;
                                o3Var.a(y3Var, b10);
                                break;
                            }
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            obj = (ArrayList) extras.getSerializable("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 11:
                            obj = (Set) extras.getSerializable("data");
                            o3.a(applicationContext).a(y3Var, obj);
                            break;
                        case 13:
                            o3Var = o3.a(applicationContext);
                            b10 = extras.get("data");
                            o3Var.a(y3Var, b10);
                            break;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
