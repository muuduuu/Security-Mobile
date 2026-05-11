package com.facebook.yoga;

/* loaded from: classes2.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() {
        try {
            x0();
        } finally {
            super.finalize();
        }
    }

    public void x0() {
        long j10 = this.f23097e;
        if (j10 != 0) {
            this.f23097e = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
