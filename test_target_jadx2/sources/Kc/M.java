package Kc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M implements O {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f5545a;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5546a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id.c invoke(K it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.e();
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.c f5547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.c cVar) {
            super(1);
            this.f5547a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(id.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.d() && Intrinsics.b(it.e(), this.f5547a));
        }
    }

    public M(Collection packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f5545a = packageFragments;
    }

    @Override // Kc.O
    public boolean a(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f5545a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(((K) it.next()).e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Kc.O
    public void b(id.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f5545a) {
            if (Intrinsics.b(((K) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // Kc.L
    public List c(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection collection = this.f5545a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.b(((K) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Kc.L
    public Collection t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return kotlin.sequences.j.C(kotlin.sequences.j.n(kotlin.sequences.j.w(CollectionsKt.T(this.f5545a), a.f5546a), new b(fqName)));
    }
}
