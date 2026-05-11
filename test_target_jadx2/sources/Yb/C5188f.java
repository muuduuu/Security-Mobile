package yb;

import Db.J;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import wb.q;

/* renamed from: yb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5188f {

    /* renamed from: a, reason: collision with root package name */
    private final String f45414a;

    /* renamed from: b, reason: collision with root package name */
    private final q f45415b;

    /* renamed from: c, reason: collision with root package name */
    private final q f45416c;

    public C5188f(String name, q qVar, q qVar2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f45414a = name;
        this.f45415b = qVar;
        this.f45416c = qVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(C5188f this$0, C3862a appContext, Object[] args) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(args, "args");
        return J.b(J.f1409a, this$0.f45415b.m(args, appContext), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(C5188f this$0, C3862a appContext, Object[] args) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(args, "args");
        this$0.f45416c.m(args, appContext);
        return null;
    }

    public final void c(final C3862a appContext, JSDecoratorsBridgingObject jsObject) {
        ExpectedType[] expectedTypeArr;
        ExpectedType[] expectedTypeArr2;
        List d10;
        List d11;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(jsObject, "jsObject");
        JNIFunctionBody jNIFunctionBody = this.f45415b != null ? new JNIFunctionBody() { // from class: yb.d
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                Object d12;
                d12 = C5188f.d(C5188f.this, appContext, objArr);
                return d12;
            }
        } : null;
        JNIFunctionBody jNIFunctionBody2 = this.f45416c != null ? new JNIFunctionBody() { // from class: yb.e
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                Object e10;
                e10 = C5188f.e(C5188f.this, appContext, objArr);
                return e10;
            }
        } : null;
        String str = this.f45414a;
        q qVar = this.f45415b;
        boolean z10 = qVar != null && qVar.h();
        q qVar2 = this.f45415b;
        if (qVar2 == null || (d11 = qVar2.d()) == null || (expectedTypeArr = (ExpectedType[]) d11.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr = new ExpectedType[0];
        }
        ExpectedType[] expectedTypeArr3 = expectedTypeArr;
        q qVar3 = this.f45416c;
        boolean z11 = qVar3 != null && qVar3.h();
        q qVar4 = this.f45416c;
        if (qVar4 == null || (d10 = qVar4.d()) == null || (expectedTypeArr2 = (ExpectedType[]) d10.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr2 = new ExpectedType[0];
        }
        jsObject.registerProperty(str, z10, expectedTypeArr3, jNIFunctionBody, z11, expectedTypeArr2, jNIFunctionBody2);
    }
}
