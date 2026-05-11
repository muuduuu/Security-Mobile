package Db;

import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0799h extends P {
    public C0799h(boolean z10) {
        super(z10);
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.UINT8_TYPED_ARRAY);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (byte[]) value;
    }
}
