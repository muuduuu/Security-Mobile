package co.hyperverge.hvcamera.magicfilter.utils;

import co.hyperverge.hvcamera.HVLog;

/* loaded from: classes.dex */
public class Quaternion {
    private static final String TAG = "Quaternion";

    /* renamed from: i, reason: collision with root package name */
    private float f19507i;

    /* renamed from: j, reason: collision with root package name */
    private float f19508j;

    /* renamed from: k, reason: collision with root package name */
    private float f19509k;

    /* renamed from: q, reason: collision with root package name */
    private float f19510q;

    public Quaternion() {
        setDefaultQuaternion();
    }

    private boolean checkQuaternion() {
        HVLog.d(TAG, "checkQuaternion() called");
        if (sqn() < 1.0f) {
            this.f19510q = (float) Math.sqrt(1.0f - sqn());
            return true;
        }
        HVLog.d(TAG, "Invalid Quaternion");
        setDefaultQuaternion();
        return false;
    }

    private void setDefaultQuaternion() {
        this.f19510q = 1.0f;
        this.f19507i = 0.0f;
        this.f19508j = 0.0f;
        this.f19509k = 0.0f;
    }

    private float sqn() {
        HVLog.d(TAG, "sqn() called");
        float f10 = this.f19507i;
        float f11 = this.f19508j;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f19509k;
        return f12 + (f13 * f13);
    }

    public float dot(Quaternion quaternion) {
        HVLog.d(TAG, "dot() called with: b = [" + quaternion + "]");
        return (this.f19510q * quaternion.f19510q) + (this.f19507i * quaternion.f19507i) + (this.f19508j * quaternion.f19508j) + (this.f19509k * quaternion.f19509k);
    }

    public float getTheta(Quaternion quaternion) {
        HVLog.d(TAG, "getTheta() called with: b = [" + quaternion + "]");
        float dot = dot(quaternion);
        return (float) Math.acos(((2.0f * dot) * dot) - 1.0f);
    }

    public Quaternion(float f10, float f11, float f12) {
        this.f19507i = f10;
        this.f19508j = f11;
        this.f19509k = f12;
        checkQuaternion();
    }
}
