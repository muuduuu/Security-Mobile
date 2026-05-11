package kotlin.sequences;

import java.util.Iterator;
import kotlin.Unit;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class i {
    public abstract Object a(Object obj, kotlin.coroutines.d dVar);

    public abstract Object d(Iterator it, kotlin.coroutines.d dVar);

    public final Object f(Sequence sequence, kotlin.coroutines.d dVar) {
        Object d10 = d(sequence.iterator(), dVar);
        return d10 == AbstractC3868b.e() ? d10 : Unit.f36324a;
    }
}
