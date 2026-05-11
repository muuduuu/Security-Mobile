package ud;

import Kc.a0;
import dd.C3035l;
import dd.C3036m;
import dd.C3038o;
import dd.C3039p;
import fd.AbstractC3165a;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wd.C5077i;
import wd.InterfaceC5074f;

/* loaded from: classes3.dex */
public abstract class p extends o {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3165a f43713h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC5074f f43714i;

    /* renamed from: j, reason: collision with root package name */
    private final fd.d f43715j;

    /* renamed from: k, reason: collision with root package name */
    private final z f43716k;

    /* renamed from: l, reason: collision with root package name */
    private C3036m f43717l;

    /* renamed from: m, reason: collision with root package name */
    private rd.h f43718m;

    static final class a extends xc.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke(C3367b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC5074f interfaceC5074f = p.this.f43714i;
            if (interfaceC5074f != null) {
                return interfaceC5074f;
            }
            a0 NO_SOURCE = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return NO_SOURCE;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            Collection b10 = p.this.N0().b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b10) {
                C3367b c3367b = (C3367b) obj;
                if (!c3367b.l() && !i.f43670c.a().contains(c3367b)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3367b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(id.c fqName, xd.n storageManager, Kc.G module, C3036m proto, AbstractC3165a metadataVersion, InterfaceC5074f interfaceC5074f) {
        super(fqName, storageManager, module);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f43713h = metadataVersion;
        this.f43714i = interfaceC5074f;
        C3039p L10 = proto.L();
        Intrinsics.checkNotNullExpressionValue(L10, "getStrings(...)");
        C3038o K10 = proto.K();
        Intrinsics.checkNotNullExpressionValue(K10, "getQualifiedNames(...)");
        fd.d dVar = new fd.d(L10, K10);
        this.f43715j = dVar;
        this.f43716k = new z(proto, dVar, metadataVersion, new a());
        this.f43717l = proto;
    }

    @Override // ud.o
    public void U0(k components) {
        Intrinsics.checkNotNullParameter(components, "components");
        C3036m c3036m = this.f43717l;
        if (c3036m == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f43717l = null;
        C3035l J10 = c3036m.J();
        Intrinsics.checkNotNullExpressionValue(J10, "getPackage(...)");
        this.f43718m = new C5077i(this, J10, this.f43715j, this.f43713h, this.f43714i, components, "scope of " + this, new b());
    }

    @Override // ud.o
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public z N0() {
        return this.f43716k;
    }

    @Override // Kc.K
    public rd.h w() {
        rd.h hVar = this.f43718m;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.v("_memberScope");
        return null;
    }
}
