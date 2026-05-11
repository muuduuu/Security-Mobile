package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2426b3 implements InterfaceC2464j1 {

    /* renamed from: a, reason: collision with root package name */
    static final InterfaceC2464j1 f24850a = new C2426b3();

    private C2426b3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2464j1
    public final boolean b(int i10) {
        switch (i10) {
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
                return true;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            default:
                return false;
        }
    }
}
