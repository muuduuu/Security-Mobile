package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final List f36448a;

    public h(List annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f36448a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f36448a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f36448a.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c p(id.c cVar) {
        return g.b.a(this, cVar);
    }

    public String toString() {
        return this.f36448a.toString();
    }
}
