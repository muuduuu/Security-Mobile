package Pc;

import Zc.InterfaceC1328a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w extends p implements Zc.u {

    /* renamed from: a, reason: collision with root package name */
    private final id.c f7770a;

    public w(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f7770a = fqName;
    }

    @Override // Zc.u
    public Collection F() {
        return CollectionsKt.j();
    }

    @Override // Zc.u
    public id.c e() {
        return this.f7770a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && Intrinsics.b(e(), ((w) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // Zc.InterfaceC1331d
    public InterfaceC1328a p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return false;
    }

    public String toString() {
        return w.class.getName() + ": " + e();
    }

    @Override // Zc.u
    public Collection w(Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.j();
    }

    @Override // Zc.InterfaceC1331d
    public List i() {
        return CollectionsKt.j();
    }
}
