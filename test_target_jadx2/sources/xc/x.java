package xc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class x extends AbstractC5150c implements kotlin.reflect.k {

    /* renamed from: h, reason: collision with root package name */
    private final boolean f44998h;

    public x() {
        this.f44998h = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xc.AbstractC5150c
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.k F() {
        if (this.f44998h) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kotlin.reflect.k) super.F();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return E().equals(xVar.E()) && getName().equals(xVar.getName()) && G().equals(xVar.G()) && Intrinsics.b(D(), xVar.D());
        }
        if (obj instanceof kotlin.reflect.k) {
            return obj.equals(u());
        }
        return false;
    }

    public int hashCode() {
        return (((E().hashCode() * 31) + getName().hashCode()) * 31) + G().hashCode();
    }

    public String toString() {
        kotlin.reflect.c u10 = u();
        if (u10 != this) {
            return u10.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // xc.AbstractC5150c
    public kotlin.reflect.c u() {
        return this.f44998h ? this : super.u();
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f44998h = (i10 & 2) == 2;
    }
}
