package C1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface z {

    public static final class a {
        public static void a(z zVar, String id2, Set tags) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            z.super.c(id2, tags);
        }
    }

    void a(y yVar);

    List b(String str);

    default void c(String id2, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            a(new y((String) it.next(), id2));
        }
    }

    void d(String str);
}
