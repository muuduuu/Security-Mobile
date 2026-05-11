package pe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* renamed from: pe.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3885m extends AbstractC3884l {

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3884l f38710e;

    public AbstractC3885m(AbstractC3884l delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38710e = delegate;
    }

    @Override // pe.AbstractC3884l
    public Z b(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f38710e.b(r(file, "appendingSink", "file"), z10);
    }

    @Override // pe.AbstractC3884l
    public void c(S source, S target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f38710e.c(r(source, "atomicMove", "source"), r(target, "atomicMove", "target"));
    }

    @Override // pe.AbstractC3884l
    public void g(S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.f38710e.g(r(dir, "createDirectory", "dir"), z10);
    }

    @Override // pe.AbstractC3884l
    public void i(S path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f38710e.i(r(path, "delete", "path"), z10);
    }

    @Override // pe.AbstractC3884l
    public List k(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List k10 = this.f38710e.k(r(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            arrayList.add(s((S) it.next(), "list"));
        }
        CollectionsKt.x(arrayList);
        return arrayList;
    }

    @Override // pe.AbstractC3884l
    public C3883k m(S path) {
        C3883k a10;
        Intrinsics.checkNotNullParameter(path, "path");
        C3883k m10 = this.f38710e.m(r(path, "metadataOrNull", "path"));
        if (m10 == null) {
            return null;
        }
        if (m10.d() == null) {
            return m10;
        }
        a10 = m10.a((r18 & 1) != 0 ? m10.f38698a : false, (r18 & 2) != 0 ? m10.f38699b : false, (r18 & 4) != 0 ? m10.f38700c : s(m10.d(), "metadataOrNull"), (r18 & 8) != 0 ? m10.f38701d : null, (r18 & 16) != 0 ? m10.f38702e : null, (r18 & 32) != 0 ? m10.f38703f : null, (r18 & 64) != 0 ? m10.f38704g : null, (r18 & 128) != 0 ? m10.f38705h : null);
        return a10;
    }

    @Override // pe.AbstractC3884l
    public AbstractC3882j n(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f38710e.n(r(file, "openReadOnly", "file"));
    }

    @Override // pe.AbstractC3884l
    public Z p(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f38710e.p(r(file, "sink", "file"), z10);
    }

    @Override // pe.AbstractC3884l
    public b0 q(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f38710e.q(r(file, "source", "file"));
    }

    public S r(S path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public S s(S path, String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    public String toString() {
        return C5142C.b(getClass()).q() + '(' + this.f38710e + ')';
    }
}
