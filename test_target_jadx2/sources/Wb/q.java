package wb;

import Db.C0792a;
import Db.T;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class q extends AbstractC5052a {

    /* renamed from: g, reason: collision with root package name */
    private final T f44445g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f44446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String name, C0792a[] argTypes, T returnType, Function1 body) {
        super(name, argTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44445g = returnType;
        this.f44446h = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(q this$0, String moduleName, C3862a c3862a, Object[] args) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(moduleName, "$moduleName");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return this$0.f44445g.b(this$0.m(args, c3862a));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else if (th instanceof Da.a) {
                String a10 = ((Da.a) th).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                codedException = new CodedException(a10, th.getMessage(), th.getCause());
            } else {
                codedException = new UnexpectedException(th);
            }
            throw new expo.modules.kotlin.exception.p(this$0.f(), moduleName, codedException);
        }
    }

    @Override // wb.AbstractC5052a
    public void a(C3862a appContext, JSDecoratorsBridgingObject jsObject, String moduleName) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(jsObject, "jsObject");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        jsObject.registerSyncFunction(f(), h(), i(), (ExpectedType[]) d().toArray(new ExpectedType[0]), n(moduleName, appContext));
    }

    public final Object m(Object[] args, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f44446h.invoke(b(args, c3862a));
    }

    public final JNIFunctionBody n(final String moduleName, final C3862a c3862a) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return new JNIFunctionBody() { // from class: wb.p
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                Object o10;
                o10 = q.o(q.this, moduleName, c3862a, objArr);
                return o10;
            }
        };
    }
}
