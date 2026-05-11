package wd;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import xc.C5142C;
import xc.u;

/* renamed from: wd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5069a implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f44447b = {C5142C.k(new u(C5142C.b(C5069a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final xd.i f44448a;

    public C5069a(xd.n storageManager, Function0 compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f44448a = storageManager.d(compute);
    }

    private final List c() {
        return (List) xd.m.a(this.f44448a, this, f44447b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return c().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p(id.c cVar) {
        return g.b.a(this, cVar);
    }
}
