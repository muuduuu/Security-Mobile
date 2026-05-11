package com.facebook.yoga;

/* loaded from: classes2.dex */
public class f extends e {
    public void c() {
        long j10 = this.f23107a;
        if (j10 != 0) {
            this.f23107a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    protected void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
