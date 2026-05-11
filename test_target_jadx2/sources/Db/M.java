package Db;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class M implements kotlin.reflect.o {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.d f1412a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1413b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f1414c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.reflect.o f1415d;

    public M(kotlin.reflect.d classifier, boolean z10, Function0 kTypeProvider) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(kTypeProvider, "kTypeProvider");
        this.f1412a = classifier;
        this.f1413b = z10;
        this.f1414c = kTypeProvider;
    }

    private final kotlin.reflect.o n() {
        if (this.f1415d == null) {
            this.f1415d = (kotlin.reflect.o) this.f1414c.invoke();
        }
        kotlin.reflect.o oVar = this.f1415d;
        Intrinsics.d(oVar);
        return oVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return Intrinsics.b(n(), obj);
        }
        M m10 = (M) obj;
        return Intrinsics.b(j(), m10.j()) && p() == m10.p();
    }

    @Override // kotlin.reflect.o
    public List f() {
        return n().f();
    }

    public int hashCode() {
        return (j().hashCode() * 31) + Boolean.hashCode(p());
    }

    @Override // kotlin.reflect.b
    public List i() {
        return n().i();
    }

    @Override // kotlin.reflect.o
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.d j() {
        return this.f1412a;
    }

    @Override // kotlin.reflect.o
    public boolean p() {
        return this.f1413b;
    }

    public String toString() {
        return n().toString();
    }

    public /* synthetic */ M(kotlin.reflect.d dVar, boolean z10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? false : z10, function0);
    }
}
