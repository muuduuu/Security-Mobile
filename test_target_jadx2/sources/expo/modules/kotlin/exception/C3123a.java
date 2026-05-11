package expo.modules.kotlin.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: expo.modules.kotlin.exception.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123a extends AbstractC3125c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0475a f32685d = new C0475a(null);

    /* renamed from: expo.modules.kotlin.exception.a$a, reason: collision with other inner class name */
    public static final class C0475a {
        public /* synthetic */ C0475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            int i11 = i10 % 100;
            String str = "th";
            if (11 > i11 || i11 >= 14) {
                int i12 = i10 % 10;
                if (i12 == 1) {
                    str = "st";
                } else if (i12 == 2) {
                    str = "nd";
                } else if (i12 == 3) {
                    str = "rd";
                }
            }
            return i10 + str;
        }

        private C0475a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3123a(kotlin.reflect.o argDesiredType, int i10, String providedType, CodedException cause) {
        super("The " + f32685d.a(i10 + 1) + " argument cannot be cast to type " + argDesiredType + " (received " + providedType + ")", cause);
        Intrinsics.checkNotNullParameter(argDesiredType, "argDesiredType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
