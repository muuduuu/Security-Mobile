package kotlin.reflect.jvm.internal.impl.types.checker;

import com.appsflyer.attribution.RequestError;
import u5.C4870a;
import yd.e0;

/* loaded from: classes3.dex */
class r implements t {
    r() {
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = C4870a.f43493a;
                break;
            case 5:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.t
    public boolean a(e0 e0Var, e0 e0Var2) {
        if (e0Var == null) {
            b(3);
        }
        if (e0Var2 == null) {
            b(4);
        }
        return e0Var.equals(e0Var2);
    }
}
