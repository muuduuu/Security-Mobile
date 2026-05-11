package Mc;

import Kc.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Mc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0983i implements O {

    /* renamed from: a, reason: collision with root package name */
    private final List f6259a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6260b;

    public C0983i(List providers, String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f6259a = providers;
        this.f6260b = debugName;
        providers.size();
        CollectionsKt.S0(providers).size();
    }

    @Override // Kc.O
    public boolean a(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List list = this.f6259a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!Kc.N.b((Kc.L) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Kc.O
    public void b(id.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator it = this.f6259a.iterator();
        while (it.hasNext()) {
            Kc.N.a((Kc.L) it.next(), fqName, packageFragments);
        }
    }

    @Override // Kc.L
    public List c(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6259a.iterator();
        while (it.hasNext()) {
            Kc.N.a((Kc.L) it.next(), fqName, arrayList);
        }
        return CollectionsKt.O0(arrayList);
    }

    @Override // Kc.L
    public Collection t(id.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f6259a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((Kc.L) it.next()).t(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f6260b;
    }
}
