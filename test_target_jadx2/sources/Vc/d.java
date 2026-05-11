package Vc;

import Hc.j;
import Zc.InterfaceC1328a;
import Zc.InterfaceC1331d;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import xc.m;

/* loaded from: classes3.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: a, reason: collision with root package name */
    private final g f11136a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1331d f11137b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11138c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.h f11139d;

    static final class a extends m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke(InterfaceC1328a annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            return Tc.c.f9748a.e(annotation, d.this.f11136a, d.this.f11138c);
        }
    }

    public d(g c10, InterfaceC1331d annotationOwner, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f11136a = c10;
        this.f11137b = annotationOwner;
        this.f11138c = z10;
        this.f11139d = c10.a().u().i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean A1(id.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f11137b.i().isEmpty() && !this.f11137b.s();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return kotlin.sequences.j.p(kotlin.sequences.j.z(kotlin.sequences.j.w(CollectionsKt.T(this.f11137b.i()), this.f11139d), Tc.c.f9748a.a(j.a.f3979y, this.f11137b, this.f11136a))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p(id.c fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InterfaceC1328a p10 = this.f11137b.p(fqName);
        return (p10 == null || (cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) this.f11139d.invoke(p10)) == null) ? Tc.c.f9748a.a(fqName, this.f11137b, this.f11136a) : cVar;
    }

    public /* synthetic */ d(g gVar, InterfaceC1331d interfaceC1331d, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, interfaceC1331d, (i10 & 4) != 0 ? false : z10);
    }
}
