package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;
import com.webengage.sdk.android.Analytics;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.webengage.sdk.android.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2962j implements v3<Analytics> {

    /* renamed from: a, reason: collision with root package name */
    private int f30651a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f30652b;

    C2962j(int i10, Object... objArr) {
        this.f30651a = i10;
        this.f30652b = objArr;
    }

    public void a(Analytics analytics) {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            r4 = null;
            Map<String, ? extends Object> map = null;
            switch (this.f30651a) {
                case 0:
                    Object[] objArr = this.f30652b;
                    if (objArr != null) {
                        analytics.track(objArr.length > 0 ? (String) objArr[0] : null, objArr.length > 1 ? (Map) objArr[1] : null, objArr.length > 2 ? (Analytics.Options) objArr[2] : null);
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr2 = this.f30652b;
                    if (objArr2 != null && objArr2.length > 0 && (obj = objArr2[0]) != null) {
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference.get() != null) {
                            analytics.start((Activity) weakReference.get());
                            break;
                        }
                    }
                    break;
                case 2:
                    Object[] objArr3 = this.f30652b;
                    if (objArr3 != null && objArr3.length > 0 && (obj2 = objArr3[0]) != null) {
                        WeakReference weakReference2 = (WeakReference) obj2;
                        if (weakReference2.get() != null) {
                            analytics.stop((Activity) weakReference2.get());
                            break;
                        }
                    }
                    break;
                case 3:
                    Object[] objArr4 = this.f30652b;
                    if (objArr4 != null) {
                        analytics.screenNavigated(objArr4.length > 0 ? (String) objArr4[0] : null, objArr4.length > 1 ? (Map) objArr4[1] : null);
                        break;
                    }
                    break;
                case 4:
                    Object[] objArr5 = this.f30652b;
                    if (objArr5 != null && objArr5.length > 0) {
                        analytics.setScreenData((Map) objArr5[0]);
                        break;
                    }
                    break;
                case 5:
                    Object[] objArr6 = this.f30652b;
                    if (objArr6 != null && objArr6.length > 0) {
                        analytics.installed((Intent) objArr6[0]);
                        break;
                    }
                    break;
                case 6:
                    Object[] objArr7 = this.f30652b;
                    if (objArr7 != null) {
                        String str = objArr7.length > 0 ? (String) objArr7[0] : null;
                        Map<String, ? extends Object> map2 = objArr7.length > 1 ? (Map) objArr7[1] : null;
                        if (objArr7.length > 2 && (obj3 = objArr7[2]) != null) {
                            map = (Map) obj3;
                        }
                        analytics.trackSystem(str, map2, map);
                        break;
                    }
                    break;
            }
        } catch (Exception e10) {
            Logger.d("WebEngage", "Some error occurred while executing queued task of Analytics: " + e10.toString());
        }
    }
}
