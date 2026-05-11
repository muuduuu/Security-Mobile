package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class l1 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30714a;

        static {
            int[] iArr = new int[y3.values().length];
            f30714a = iArr;
            try {
                iArr[y3.f31157b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30714a[y3.f31158c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30714a[y3.f31159d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30714a[y3.f31162g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30714a[y3.f31161f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30714a[y3.f31163h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30714a[y3.f31164i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30714a[y3.f31166k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30714a[y3.f31160e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30714a[y3.f31167l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30714a[y3.f31165j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30714a[y3.f31168m.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30714a[y3.f31170o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30714a[y3.f31169n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent a(y3 y3Var, Object obj, Context context) {
        Serializable serializable;
        Serializable serializable2;
        Intent intent = new Intent();
        intent.putExtra("topic", y3Var);
        switch (a.f30714a[y3Var.ordinal()]) {
            case 1:
            case 9:
            case 13:
                intent.setClass(context, ExecutorService.class);
                break;
            case 2:
            case 7:
                serializable = (p0) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 3:
                intent.putExtra("data", (Bundle) obj);
                intent.setClass(context, ExecutorService.class);
                break;
            case 4:
                intent.putExtra("data", (Intent) obj);
                intent.setClass(context, ExecutorService.class);
                break;
            case 5:
                intent.setClass(context, EventLogService.class);
                serializable2 = (ArrayList) obj;
                intent.putExtra("data", serializable2);
                break;
            case 6:
                intent.setClass(context, ExecutorService.class);
                serializable2 = (Exception) obj;
                intent.putExtra("data", serializable2);
                break;
            case 8:
                serializable = (n3) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                serializable = (ArrayList) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 11:
                serializable = (HashMap) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
            case 12:
                serializable = (HashSet) obj;
                intent.putExtra("data", serializable);
                intent.setClass(context, ExecutorService.class);
                break;
        }
    }
}
