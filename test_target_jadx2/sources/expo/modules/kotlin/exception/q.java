package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q extends CodedException {
    public /* synthetic */ q(kotlin.reflect.o oVar, kotlin.reflect.o oVar2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, oVar2, (i10 & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.reflect.o argumentType, kotlin.reflect.o desiredType, Throwable th) {
        super("Argument type '" + argumentType + "' is not compatible with expected type '" + desiredType + "'.", th);
        Intrinsics.checkNotNullParameter(argumentType, "argumentType");
        Intrinsics.checkNotNullParameter(desiredType, "desiredType");
    }
}
