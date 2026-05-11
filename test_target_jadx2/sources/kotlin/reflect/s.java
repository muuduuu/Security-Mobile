package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class s implements TypeVariable, Type {

    /* renamed from: a, reason: collision with root package name */
    private final p f36737a;

    public s(p typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f36737a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.b(getName(), typeVariable.getName()) && Intrinsics.b(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        Type c10;
        List upperBounds = this.f36737a.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            c10 = t.c((o) it.next(), true);
            arrayList.add(c10);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new lc.n("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f36737a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f36737a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
