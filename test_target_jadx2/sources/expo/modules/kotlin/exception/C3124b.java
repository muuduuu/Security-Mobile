package expo.modules.kotlin.exception;

import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: expo.modules.kotlin.exception.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3124b extends AbstractC3125c {
    private C3124b(kotlin.reflect.o oVar, kotlin.reflect.o oVar2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + oVar2 + "' required by the collection of type: '" + oVar + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3124b(kotlin.reflect.o collectionType, kotlin.reflect.o elementType, ReadableType providedType, CodedException cause) {
        this(collectionType, elementType, providedType.name(), cause);
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3124b(kotlin.reflect.o collectionType, kotlin.reflect.o elementType, kotlin.reflect.d providedType, CodedException cause) {
        this(collectionType, elementType, providedType.toString(), cause);
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
