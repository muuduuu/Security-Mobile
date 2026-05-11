package Fc;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface e {

    public static final class a {
        public static void a(e eVar, Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            if (g.a(eVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + g.a(eVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    Member a();

    Type g();

    Object h(Object[] objArr);

    List i();
}
