package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    private final g f36458a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36459b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f36460c;

    public l(g delegate, boolean z10, Function1 fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f36458a = delegate;
        this.f36459b = z10;
        this.f36460c = fqNameFilter;
    }

    private final boolean c(c cVar) {
        id.c e10 = cVar.e();
        return e10 != null && ((Boolean) this.f36460c.invoke(e10)).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f36460c.invoke(fqName)).booleanValue()) {
            return this.f36458a.A1(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        boolean z10;
        g gVar = this.f36458a;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                if (c((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return this.f36459b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        g gVar = this.f36458a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : gVar) {
            if (c((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f36460c.invoke(fqName)).booleanValue()) {
            return this.f36458a.p(fqName);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g delegate, Function1 fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }
}
