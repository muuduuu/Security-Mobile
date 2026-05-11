package kotlin.reflect.jvm.internal.impl.types.checker;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class s {
    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 7 || i10 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 10) ? 2 : 3];
        switch (i10) {
            case 1:
            case 3:
            case 18:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "supertype";
                break;
            case 2:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "typeArgument";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "typeParameterVariance";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "typeArgumentVariance";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getOutType";
        } else if (i10 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i10) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 7 && i10 != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static AbstractC5197E b(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        if (abstractC5197E == null) {
            a(0);
        }
        if (abstractC5197E2 == null) {
            a(1);
        }
        return c(abstractC5197E, abstractC5197E2, new r());
    }

    public static AbstractC5197E c(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, t tVar) {
        if (abstractC5197E == null) {
            a(2);
        }
        if (abstractC5197E2 == null) {
            a(3);
        }
        if (tVar == null) {
            a(4);
        }
        return v.d(abstractC5197E, abstractC5197E2, tVar);
    }
}
