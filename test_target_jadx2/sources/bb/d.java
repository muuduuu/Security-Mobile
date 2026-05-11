package Bb;

import Db.P;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class d extends P {

    /* renamed from: b, reason: collision with root package name */
    private final o f563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o type) {
        super(type.p());
        Intrinsics.checkNotNullParameter(type, "type");
        this.f563b = type;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.SHARED_OBJECT_ID, expo.modules.kotlin.jni.a.INT);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedObject d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        int b10 = b.b(value instanceof Dynamic ? ((Dynamic) value).asInt() : ((Integer) value).intValue());
        if (c3862a == null) {
            throw new expo.modules.kotlin.exception.e();
        }
        SharedObject f10 = b.f(b10, c3862a.p());
        Intrinsics.e(f10, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter");
        return f10;
    }
}
