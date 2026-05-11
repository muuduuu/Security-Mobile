package ad;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* renamed from: ad.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1376c implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: a, reason: collision with root package name */
    private final id.c f12661a;

    public C1376c(id.c fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f12661a = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1375b p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.b(fqName, this.f12661a)) {
            return C1375b.f12660a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return CollectionsKt.j().iterator();
    }
}
