package wd;

import Kc.InterfaceC0936h;
import Kc.K;
import dd.C3035l;
import dd.C3043t;
import dd.w;
import fd.AbstractC3165a;
import fd.h;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5077i extends AbstractC5076h {

    /* renamed from: g, reason: collision with root package name */
    private final K f44554g;

    /* renamed from: h, reason: collision with root package name */
    private final String f44555h;

    /* renamed from: i, reason: collision with root package name */
    private final id.c f44556i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5077i(K packageDescriptor, C3035l proto, fd.c nameResolver, AbstractC3165a metadataVersion, InterfaceC5074f interfaceC5074f, ud.k components, String debugName, Function0 classNames) {
        super(r2, r3, r4, r7, classNames);
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        C3043t S10 = proto.S();
        Intrinsics.checkNotNullExpressionValue(S10, "getTypeTable(...)");
        fd.g gVar = new fd.g(S10);
        h.a aVar = fd.h.f33043b;
        w T10 = proto.T();
        Intrinsics.checkNotNullExpressionValue(T10, "getVersionRequirementTable(...)");
        ud.m a10 = components.a(packageDescriptor, nameResolver, gVar, aVar.a(T10), metadataVersion, interfaceC5074f);
        List L10 = proto.L();
        Intrinsics.checkNotNullExpressionValue(L10, "getFunctionList(...)");
        List O10 = proto.O();
        Intrinsics.checkNotNullExpressionValue(O10, "getPropertyList(...)");
        List R10 = proto.R();
        Intrinsics.checkNotNullExpressionValue(R10, "getTypeAliasList(...)");
        this.f44554g = packageDescriptor;
        this.f44555h = debugName;
        this.f44556i = packageDescriptor.e();
    }

    @Override // wd.AbstractC5076h, rd.i, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        z(name, location);
        return super.f(name, location);
    }

    @Override // wd.AbstractC5076h
    protected void i(Collection result, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // wd.AbstractC5076h
    protected C3367b m(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C3367b(this.f44556i, name);
    }

    @Override // wd.AbstractC5076h
    protected Set s() {
        return O.d();
    }

    @Override // wd.AbstractC5076h
    protected Set t() {
        return O.d();
    }

    public String toString() {
        return this.f44555h;
    }

    @Override // wd.AbstractC5076h
    protected Set u() {
        return O.d();
    }

    @Override // wd.AbstractC5076h
    protected boolean w(id.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!super.w(name)) {
            Iterable l10 = p().c().l();
            if (!(l10 instanceof Collection) || !((Collection) l10).isEmpty()) {
                Iterator it = l10.iterator();
                while (it.hasNext()) {
                    if (((Lc.b) it.next()).b(this.f44556i, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // rd.i, rd.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public List g(rd.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection j10 = j(kindFilter, nameFilter, Rc.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable l10 = p().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = l10.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(arrayList, ((Lc.b) it.next()).c(this.f44556i));
        }
        return CollectionsKt.w0(j10, arrayList);
    }

    public void z(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Qc.a.b(p().c().p(), location, this.f44554g, name);
    }
}
