package Ac;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;

/* loaded from: classes3.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private Object f413a;

    public b(Object obj) {
        this.f413a = obj;
    }

    @Override // Ac.d, Ac.c
    public Object a(Object obj, k property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f413a;
    }

    @Override // Ac.d
    public void b(Object obj, k property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f413a;
        if (d(property, obj3, obj2)) {
            this.f413a = obj2;
            c(property, obj3, obj2);
        }
    }

    protected void c(k property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean d(k property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f413a + ')';
    }
}
