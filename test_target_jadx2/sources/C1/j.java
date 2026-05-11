package C1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface j {

    public static final class a {
        public static i a(j jVar, m id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return j.super.e(id2);
        }

        public static void b(j jVar, m id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            j.super.g(id2);
        }
    }

    List a();

    void b(i iVar);

    default i e(m id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return i(id2.b(), id2.a());
    }

    void f(String str, int i10);

    default void g(m id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        f(id2.b(), id2.a());
    }

    void h(String str);

    i i(String str, int i10);
}
