package Db;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class L extends P {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(kotlin.reflect.o type) {
        super(type.p());
        Intrinsics.checkNotNullParameter(type, "type");
        this.f1411b = type;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.JS_FUNCTION);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JavaScriptFunction d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        JavaScriptFunction javaScriptFunction = (JavaScriptFunction) value;
        kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(this.f1411b.f())).c();
        if (c10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        javaScriptFunction.b(c10);
        return javaScriptFunction;
    }
}
