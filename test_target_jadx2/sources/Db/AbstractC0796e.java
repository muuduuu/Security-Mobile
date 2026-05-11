package Db;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0796e extends P {
    public AbstractC0796e(boolean z10) {
        super(z10);
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.TYPED_ARRAY);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Cb.j d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return f((JavaScriptTypedArray) value);
    }

    public abstract Cb.j f(JavaScriptTypedArray javaScriptTypedArray);
}
