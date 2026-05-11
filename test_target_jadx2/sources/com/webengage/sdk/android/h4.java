package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.utils.Gender;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class h4 implements v3<User> {

    /* renamed from: a, reason: collision with root package name */
    private int f30641a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f30642b;

    h4(int i10, Object... objArr) {
        this.f30641a = i10;
        this.f30642b = objArr;
    }

    public void a(User user) {
        Object obj;
        try {
            switch (this.f30641a) {
                case 0:
                    Object[] objArr = this.f30642b;
                    if (objArr != null && objArr.length > 0) {
                        user.setUserProfile((UserProfile) objArr[0]);
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr2 = this.f30642b;
                    if (objArr2 != null && objArr2.length > 0) {
                        user.setEmail((String) objArr2[0]);
                        break;
                    }
                    break;
                case 2:
                    Object[] objArr3 = this.f30642b;
                    if (objArr3 != null && objArr3.length > 0) {
                        user.setHashedEmail((String) objArr3[0]);
                        break;
                    }
                    break;
                case 3:
                    Object[] objArr4 = this.f30642b;
                    if (objArr4 != null && objArr4.length > 2) {
                        user.setBirthDate((Integer) objArr4[0], (Integer) objArr4[1], (Integer) objArr4[2]);
                        break;
                    }
                    break;
                case 4:
                    Object[] objArr5 = this.f30642b;
                    if (objArr5 != null && objArr5.length > 0) {
                        user.setBirthDate((String) objArr5[0]);
                        break;
                    }
                    break;
                case 5:
                    Object[] objArr6 = this.f30642b;
                    if (objArr6 != null && objArr6.length > 0) {
                        user.setPhoneNumber((String) objArr6[0]);
                        break;
                    }
                    break;
                case 6:
                    Object[] objArr7 = this.f30642b;
                    if (objArr7 != null && objArr7.length > 0) {
                        user.setHashedPhoneNumber((String) objArr7[0]);
                        break;
                    }
                    break;
                case 7:
                    Object[] objArr8 = this.f30642b;
                    if (objArr8 != null && objArr8.length > 0) {
                        user.setFirstName((String) objArr8[0]);
                        break;
                    }
                    break;
                case 8:
                    Object[] objArr9 = this.f30642b;
                    if (objArr9 != null && objArr9.length > 0) {
                        user.setLastName((String) objArr9[0]);
                        break;
                    }
                    break;
                case 9:
                    Object[] objArr10 = this.f30642b;
                    if (objArr10 != null && objArr10.length > 0) {
                        user.setGender((Gender) objArr10[0]);
                        break;
                    }
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    Object[] objArr11 = this.f30642b;
                    if (objArr11 != null && objArr11.length > 0) {
                        user.setCompany((String) objArr11[0]);
                        break;
                    }
                    break;
                case 13:
                    Object[] objArr12 = this.f30642b;
                    if (objArr12 != null && objArr12.length > 1) {
                        user.setAttribute((String) objArr12[0], (Date) objArr12[1]);
                        break;
                    }
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    Object[] objArr13 = this.f30642b;
                    if (objArr13 != null && objArr13.length > 1) {
                        user.setAttribute((String) objArr13[0], (List<? extends Object>) objArr13[1]);
                        break;
                    }
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    Object[] objArr14 = this.f30642b;
                    if (objArr14 != null && objArr14.length > 0) {
                        user.setAttributes((Map) objArr14[0]);
                        break;
                    }
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    Object[] objArr15 = this.f30642b;
                    if (objArr15 != null && objArr15.length > 1) {
                        user.setAttribute((String) objArr15[0], (String) objArr15[1]);
                        break;
                    }
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object[] objArr16 = this.f30642b;
                    if (objArr16 != null && objArr16.length > 1) {
                        user.setAttribute((String) objArr16[0], (Boolean) objArr16[1]);
                        break;
                    }
                    break;
                case 19:
                    Object[] objArr17 = this.f30642b;
                    if (objArr17 != null && objArr17.length > 0) {
                        user.deleteAttribute((String) objArr17[0]);
                        break;
                    }
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    Object[] objArr18 = this.f30642b;
                    if (objArr18 != null && objArr18.length > 0) {
                        user.deleteAttributes((List) objArr18[0]);
                        break;
                    }
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    Object[] objArr19 = this.f30642b;
                    if (objArr19 != null && objArr19.length > 0) {
                        user.login((String) objArr19[0]);
                        break;
                    }
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    user.logout();
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    Object[] objArr20 = this.f30642b;
                    if (objArr20 != null && objArr20.length > 1) {
                        user.setOptIn((Channel) objArr20[0], ((Boolean) objArr20[1]).booleanValue());
                        break;
                    }
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    Object[] objArr21 = this.f30642b;
                    if (objArr21 != null && objArr21.length > 1 && (obj = objArr21[0]) != null && objArr21[1] != null) {
                        user.setLocation(((Double) obj).doubleValue(), ((Double) this.f30642b[1]).doubleValue());
                        break;
                    }
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    Object[] objArr22 = this.f30642b;
                    if (objArr22 != null && objArr22.length > 1) {
                        user.setAttribute((String) objArr22[0], (Number) objArr22[1]);
                        break;
                    }
                    break;
                case 26:
                    Object[] objArr23 = this.f30642b;
                    if (objArr23 != null && objArr23.length > 0) {
                        user.setDevicePushOptIn(((Boolean) objArr23[0]).booleanValue());
                        break;
                    }
                    break;
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while executing queued task of User: " + e10.toString());
        }
    }
}
