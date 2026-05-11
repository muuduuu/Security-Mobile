package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.t1;
import com.webengage.sdk.android.utils.Provider;
import java.util.HashSet;

/* loaded from: classes2.dex */
class q4 implements v3<AbstractWebEngage> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f30784a;

    /* renamed from: b, reason: collision with root package name */
    private int f30785b;

    q4(int i10, Object... objArr) {
        this.f30784a = objArr;
        this.f30785b = i10;
    }

    public void a(AbstractWebEngage abstractWebEngage) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        try {
            switch (this.f30785b) {
                case 0:
                    Object[] objArr = this.f30784a;
                    if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                        abstractWebEngage.setLocationTracking(((Boolean) obj).booleanValue());
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr2 = this.f30784a;
                    if (objArr2 != null && objArr2.length > 0 && (obj2 = objArr2[0]) != null) {
                        abstractWebEngage.setLogLevel(((Integer) obj2).intValue());
                        break;
                    }
                    break;
                case 2:
                    Object[] objArr3 = this.f30784a;
                    if (objArr3 != null && objArr3.length > 0 && (obj3 = objArr3[0]) != null) {
                        abstractWebEngage.setEventReportingStrategy((ReportingStrategy) obj3);
                        break;
                    }
                    break;
                case 3:
                    Object[] objArr4 = this.f30784a;
                    if (objArr4 != null && objArr4.length > 0 && (obj4 = objArr4[0]) != null) {
                        abstractWebEngage.filterCustomEvents(((Boolean) obj4).booleanValue());
                        break;
                    }
                    break;
                case 4:
                    Object[] objArr5 = this.f30784a;
                    if (objArr5 != null && objArr5.length > 0 && (obj5 = objArr5[0]) != null) {
                        abstractWebEngage.setEveryActivityIsScreen(((Boolean) obj5).booleanValue());
                        break;
                    }
                    break;
                case 5:
                    Object[] objArr6 = this.f30784a;
                    String str = objArr6.length > 0 ? (String) objArr6[0] : null;
                    if (objArr6.length > 1) {
                    }
                    String str2 = objArr6.length > 2 ? (String) objArr6[2] : null;
                    String str3 = objArr6.length > 3 ? (String) objArr6[3] : null;
                    Logger.d("WebEngage", "Inside SET_REGISTRATION_ID with provider: " + str2 + " token: " + str);
                    if (!Provider.FCM.name().equalsIgnoreCase(str2)) {
                        if (!Provider.MI.name().equalsIgnoreCase(str2)) {
                            if (Provider.HW.name().equalsIgnoreCase(str2)) {
                                abstractWebEngage.setHuaweiRegistrationID(str);
                                break;
                            }
                        } else if (!TextUtils.isEmpty(str3)) {
                            abstractWebEngage.setXiaomiRegistrationID(str, str3);
                            break;
                        } else {
                            abstractWebEngage.setXiaomiRegistrationID(str);
                            break;
                        }
                    } else {
                        abstractWebEngage.setRegistrationID(str);
                        break;
                    }
                    break;
                case 6:
                    Object[] objArr7 = this.f30784a;
                    if (objArr7 != null && objArr7.length > 0 && (obj6 = objArr7[0]) != null) {
                        abstractWebEngage.a((Intent) obj6);
                        break;
                    }
                    break;
                case 7:
                    Object[] objArr8 = this.f30784a;
                    if (objArr8 != null && objArr8.length > 0 && (obj7 = objArr8[0]) != null) {
                        abstractWebEngage.a((Intent) obj7, (BroadcastReceiver) null);
                        break;
                    }
                    break;
                case 8:
                    Object[] objArr9 = this.f30784a;
                    if (objArr9 != null && objArr9.length > 0 && (obj8 = objArr9[0]) != null) {
                        abstractWebEngage.a((Location) obj8, (BroadcastReceiver) null);
                        break;
                    }
                    break;
                case 9:
                    abstractWebEngage.d((BroadcastReceiver) null);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    abstractWebEngage.c((BroadcastReceiver) null);
                    break;
                case 11:
                    abstractWebEngage.b((BroadcastReceiver) null);
                    break;
                case 12:
                    Object[] objArr10 = this.f30784a;
                    if (objArr10 != null && objArr10.length > 0 && (obj9 = objArr10[0]) != null) {
                        abstractWebEngage.c((Intent) obj9, null);
                        break;
                    }
                    break;
                case 13:
                    Object[] objArr11 = this.f30784a;
                    if (objArr11 != null && objArr11.length > 0 && (obj10 = objArr11[0]) != null) {
                        abstractWebEngage.b((Intent) obj10, null);
                        break;
                    }
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    Object[] objArr12 = this.f30784a;
                    if (objArr12 != null && objArr12.length > 0 && (obj11 = objArr12[0]) != null) {
                        abstractWebEngage.b((Intent) obj11);
                        break;
                    }
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    Object[] objArr13 = this.f30784a;
                    if (objArr13 != null && objArr13.length > 0 && (obj12 = objArr13[0]) != null) {
                        abstractWebEngage.a((t1.a) obj12, (BroadcastReceiver) null);
                        break;
                    }
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    Object[] objArr14 = this.f30784a;
                    if (objArr14 != null && objArr14.length > 0 && (obj13 = objArr14[0]) != null) {
                        abstractWebEngage.a((BroadcastReceiver) null, (HashSet<String>) obj13);
                        break;
                    }
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object[] objArr15 = this.f30784a;
                    if (objArr15 != null && objArr15.length > 0 && (obj14 = objArr15[0]) != null) {
                        abstractWebEngage.d((Intent) obj14);
                        break;
                    }
                    break;
                case 19:
                    Object[] objArr16 = this.f30784a;
                    if (objArr16 != null && objArr16.length > 0 && (obj15 = objArr16[0]) != null && (obj15 instanceof LocationTrackingStrategy)) {
                        abstractWebEngage.setLocationTrackingStrategy((LocationTrackingStrategy) obj15);
                        break;
                    }
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    Object[] objArr17 = this.f30784a;
                    if (objArr17 != null && objArr17.length > 0 && (obj16 = objArr17[0]) != null && (obj17 = objArr17[1]) != null) {
                        abstractWebEngage.setSecurityToken((String) obj16, (String) obj17);
                        break;
                    }
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    abstractWebEngage.startGAIDTracking();
                    break;
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while executing queued task of WebEngage: " + e10.toString());
        }
    }
}
