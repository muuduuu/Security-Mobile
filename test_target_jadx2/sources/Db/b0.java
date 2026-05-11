package Db;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends AbstractC0796e {
    public b0(boolean z10) {
        super(z10);
    }

    @Override // Db.AbstractC0796e, Db.W
    public boolean c() {
        return true;
    }

    @Override // Db.AbstractC0796e
    public Cb.j f(JavaScriptTypedArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
