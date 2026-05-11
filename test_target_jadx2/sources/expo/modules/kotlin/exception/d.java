package expo.modules.kotlin.exception;

import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends CodedException {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32686a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Enum it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "'" + it.name() + "'";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.reflect.d enumType, Enum[] enumConstants, Object obj) {
        super("'" + obj + "' is not present in " + enumType.q() + " enum, it must be one of: " + AbstractC3574i.S(enumConstants, ", ", null, null, 0, null, a.f32686a, 30, null), null, 2, null);
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        Intrinsics.checkNotNullParameter(enumConstants, "enumConstants");
    }
}
