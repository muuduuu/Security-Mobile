package Db;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 extends AbstractC0796e {
    public c0(boolean z10) {
        super(z10);
    }

    @Override // Db.AbstractC0796e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Cb.l f(JavaScriptTypedArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Cb.l(value);
    }
}
