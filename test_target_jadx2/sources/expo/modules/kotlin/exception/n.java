package expo.modules.kotlin.exception;

import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends AbstractC3125c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String fieldName, kotlin.reflect.o fieldType, ReadableType providedType, CodedException cause) {
        super("Cannot cast '" + providedType.name() + "' for field '" + fieldName + "' ('" + fieldType + "').", cause);
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
