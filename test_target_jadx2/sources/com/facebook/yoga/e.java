package com.facebook.yoga;

/* loaded from: classes2.dex */
public abstract class e extends c {

    /* renamed from: a, reason: collision with root package name */
    long f23107a;

    private e(long j10) {
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f23107a = j10;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f23107a, kVar.intValue());
    }

    @Override // com.facebook.yoga.c
    public void b(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f23107a, f10);
    }

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
