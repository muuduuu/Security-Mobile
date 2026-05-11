package Jd;

import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* renamed from: Jd.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0881f {
    public static final Object a(Collection collection, kotlin.coroutines.d dVar) {
        return collection.isEmpty() ? CollectionsKt.j() : new C0879e((V[]) collection.toArray(new V[0])).c(dVar);
    }
}
