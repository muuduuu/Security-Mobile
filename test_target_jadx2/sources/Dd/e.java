package Dd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private c f1502a;

    protected e(c arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f1502a = arrayMap;
    }

    @Override // Dd.a
    protected final c c() {
        return this.f1502a;
    }

    @Override // Dd.a
    protected final void h(String keyQualifiedName, Object value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int d10 = e().d(keyQualifiedName);
        int c10 = this.f1502a.c();
        if (c10 == 0) {
            this.f1502a = new o(value, d10);
            return;
        }
        if (c10 == 1) {
            c cVar = this.f1502a;
            Intrinsics.e(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.h() == d10) {
                this.f1502a = new o(value, d10);
                return;
            } else {
                d dVar = new d();
                this.f1502a = dVar;
                dVar.e(oVar.h(), oVar.j());
            }
        }
        this.f1502a.e(d10, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e() {
        this(r0);
        i iVar = i.f1515a;
        Intrinsics.e(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
    }
}
