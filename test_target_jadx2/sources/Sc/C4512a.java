package sc;

import kotlin.jvm.internal.Intrinsics;
import rc.C4297a;

/* renamed from: sc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4512a extends C4297a {

    /* renamed from: sc.a$a, reason: collision with other inner class name */
    private static final class C0614a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0614a f41691a = new C0614a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f41692b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f41692b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f41692b = num2;
        }

        private C0614a() {
        }
    }

    private final boolean b(int i10) {
        Integer num = C0614a.f41692b;
        return num == null || num.intValue() >= i10;
    }

    @Override // rc.C4297a
    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (b(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
