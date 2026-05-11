package Db;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 extends AbstractC0796e {
    public f0(boolean z10) {
        super(z10);
    }

    @Override // Db.AbstractC0796e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Cb.o f(JavaScriptTypedArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Cb.o(value);
    }
}
