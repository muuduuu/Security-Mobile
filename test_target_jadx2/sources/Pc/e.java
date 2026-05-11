package Pc;

import Pc.f;
import Zc.InterfaceC1328a;
import id.C3367b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;

/* loaded from: classes3.dex */
public final class e extends p implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    private final Annotation f7744a;

    public e(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f7744a = annotation;
    }

    @Override // Zc.InterfaceC1328a
    public boolean B() {
        return false;
    }

    public final Annotation X() {
        return this.f7744a;
    }

    @Override // Zc.InterfaceC1328a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public l c() {
        return new l(AbstractC5011a.b(AbstractC5011a.a(this.f7744a)));
    }

    @Override // Zc.InterfaceC1328a
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f7744a == ((e) obj).f7744a;
    }

    @Override // Zc.InterfaceC1328a
    public Collection f() {
        Method[] declaredMethods = AbstractC5011a.b(AbstractC5011a.a(this.f7744a)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f7745b;
            Object invoke = method.invoke(this.f7744a, null);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
            arrayList.add(aVar.a(invoke, id.f.o(method.getName())));
        }
        return arrayList;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7744a);
    }

    @Override // Zc.InterfaceC1328a
    public C3367b l() {
        return d.a(AbstractC5011a.b(AbstractC5011a.a(this.f7744a)));
    }

    public String toString() {
        return e.class.getName() + ": " + this.f7744a;
    }
}
