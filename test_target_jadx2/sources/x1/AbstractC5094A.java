package x1;

import android.content.Context;
import androidx.work.impl.P;
import java.util.Collections;
import java.util.List;

/* renamed from: x1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5094A {

    /* renamed from: x1.A$a */
    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected AbstractC5094A() {
    }

    public static AbstractC5094A f(Context context) {
        return P.n(context);
    }

    public static void h(Context context, androidx.work.a aVar) {
        P.h(context, aVar);
    }

    public abstract r a(List list);

    public final r b(AbstractC5095B abstractC5095B) {
        return a(Collections.singletonList(abstractC5095B));
    }

    public abstract r c(String str, EnumC5102f enumC5102f, t tVar);

    public abstract r d(String str, EnumC5103g enumC5103g, List list);

    public r e(String str, EnumC5103g enumC5103g, q qVar) {
        return d(str, enumC5103g, Collections.singletonList(qVar));
    }

    public abstract h8.d g(String str);
}
