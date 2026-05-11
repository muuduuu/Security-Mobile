package Db;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class A implements kotlin.reflect.o {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.d f1403a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1404b;

    public A(kotlin.reflect.d classifier, boolean z10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f1403a = classifier;
        this.f1404b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Intrinsics.b(j(), a10.j()) && p() == a10.p();
    }

    @Override // kotlin.reflect.o
    public List f() {
        return CollectionsKt.j();
    }

    public int hashCode() {
        return (j().hashCode() * 31) + Boolean.hashCode(p());
    }

    @Override // kotlin.reflect.b
    public List i() {
        return CollectionsKt.j();
    }

    @Override // kotlin.reflect.o
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.d j() {
        return this.f1403a;
    }

    @Override // kotlin.reflect.o
    public boolean p() {
        return this.f1404b;
    }
}
