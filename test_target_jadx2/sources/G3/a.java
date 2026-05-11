package G3;

import f3.AbstractC3142a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface a {
    void a();

    void b(int i10, int i11, Function0 function0);

    AbstractC3142a c(int i10, int i11, int i12);

    void d(b bVar, E3.b bVar2, D3.a aVar, int i10, Function0 function0);

    void e();

    /* renamed from: G3.a$a, reason: collision with other inner class name */
    public static final class C0066a {
        public static AbstractC3142a b(a aVar, int i10, int i11, int i12) {
            return null;
        }

        public static void e(a aVar, b bitmapFramePreparer, E3.b bitmapFrameCache, D3.a animationBackend, int i10, Function0 function0) {
            Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        }

        public static /* synthetic */ void f(a aVar, b bVar, E3.b bVar2, D3.a aVar2, int i10, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i11 & 16) != 0) {
                function0 = null;
            }
            aVar.d(bVar, bVar2, aVar2, i10, function0);
        }

        public static void a(a aVar) {
        }

        public static void c(a aVar) {
        }

        public static void d(a aVar, int i10, int i11, Function0 function0) {
        }
    }
}
