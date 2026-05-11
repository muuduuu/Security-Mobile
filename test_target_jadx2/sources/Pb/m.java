package pb;

import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface m {

    public static final class a {
        public static void a(m mVar, CodedException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            mVar.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }

        public static void b(m mVar) {
            mVar.resolve(null);
        }

        public static void c(m mVar, double d10) {
            mVar.resolve(Double.valueOf(d10));
        }

        public static void d(m mVar, float f10) {
            mVar.resolve(Float.valueOf(f10));
        }

        public static void e(m mVar, int i10) {
            mVar.resolve(Integer.valueOf(i10));
        }

        public static void f(m mVar, String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            mVar.resolve(result);
        }

        public static void g(m mVar, Collection result) {
            Intrinsics.checkNotNullParameter(result, "result");
            mVar.resolve(result);
        }

        public static void h(m mVar, boolean z10) {
            mVar.resolve(Boolean.valueOf(z10));
        }
    }

    void a(String str);

    void b(boolean z10);

    void c();

    void d(Collection collection);

    void e(int i10);

    void f(double d10);

    void g(float f10);

    void h(CodedException codedException);

    void reject(String str, String str2, Throwable th);

    void resolve(Object obj);
}
