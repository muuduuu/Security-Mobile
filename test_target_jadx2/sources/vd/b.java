package vd;

import Hc.j;
import Kc.G;
import Kc.J;
import Kc.L;
import Kc.M;
import Rc.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.f;
import qd.C3960b;
import ud.C4886d;
import ud.k;
import ud.l;
import ud.r;
import ud.s;
import ud.w;
import xc.AbstractC5156i;
import xc.C5142C;
import xd.n;

/* loaded from: classes3.dex */
public final class b implements Hc.a {

    /* renamed from: b, reason: collision with root package name */
    private final d f44221b = new d();

    /* synthetic */ class a extends AbstractC5156i implements Function1 {
        a(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final f E() {
            return C5142C.b(d.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((d) this.f44980b).a(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "loadResource";
        }
    }

    @Override // Hc.a
    public L a(n storageManager, G builtInsModule, Iterable classDescriptorFactories, Lc.c platformDependentDeclarationFilter, Lc.a additionalClassPartsProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtInsModule, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, j.f3866F, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f44221b));
    }

    public final L b(n storageManager, G module, Set packageFqNames, Iterable classDescriptorFactories, Lc.c platformDependentDeclarationFilter, Lc.a additionalClassPartsProvider, boolean z10, Function1 loadResource) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList(CollectionsKt.u(packageFqNames, 10));
        Iterator it = packageFqNames.iterator();
        while (it.hasNext()) {
            id.c cVar = (id.c) it.next();
            String r10 = C5013a.f44220r.r(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(r10);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + r10);
            }
            arrayList.add(c.f44222o.a(cVar, storageManager, module, inputStream, z10));
        }
        M m10 = new M(arrayList);
        J j10 = new J(storageManager, module);
        l.a aVar = l.a.f43701a;
        ud.n nVar = new ud.n(m10);
        C5013a c5013a = C5013a.f44220r;
        C4886d c4886d = new C4886d(module, j10, c5013a);
        w.a aVar2 = w.a.f43731a;
        r DO_NOTHING = r.f43722a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        k kVar = new k(storageManager, module, aVar, nVar, c4886d, m10, aVar2, DO_NOTHING, c.a.f8658a, s.a.f43723a, classDescriptorFactories, j10, ud.j.f43677a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c5013a.e(), null, new C3960b(storageManager, CollectionsKt.j()), null, null, 851968, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).U0(kVar);
        }
        return m10;
    }
}
