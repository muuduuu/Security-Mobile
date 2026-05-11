package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    private final List f36455a;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.c f36456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.c cVar) {
            super(1);
            this.f36456a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.p(this.f36456a);
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36457a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.T(it);
        }
    }

    public k(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f36455a = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt.T(this.f36455a).iterator();
        while (it.hasNext()) {
            if (((g) it.next()).A1(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        List list = this.f36455a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.j.r(CollectionsKt.T(this.f36455a), b.f36457a).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (c) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(this.f36455a), new a(fqName)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(g... delegates) {
        this(AbstractC3574i.m0(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
