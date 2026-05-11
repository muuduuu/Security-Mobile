package xc;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5156i extends AbstractC5150c implements InterfaceC5155h, kotlin.reflect.g {

    /* renamed from: h, reason: collision with root package name */
    private final int f44994h;

    /* renamed from: i, reason: collision with root package name */
    private final int f44995i;

    public AbstractC5156i(int i10) {
        this(i10, AbstractC5150c.f44978g, null, null, null, 0);
    }

    @Override // xc.AbstractC5150c
    protected kotlin.reflect.c C() {
        return C5142C.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xc.AbstractC5150c
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.g F() {
        return (kotlin.reflect.g) super.F();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5156i) {
            AbstractC5156i abstractC5156i = (AbstractC5156i) obj;
            return getName().equals(abstractC5156i.getName()) && G().equals(abstractC5156i.G()) && this.f44995i == abstractC5156i.f44995i && this.f44994h == abstractC5156i.f44994h && Intrinsics.b(D(), abstractC5156i.D()) && Intrinsics.b(E(), abstractC5156i.E());
        }
        if (obj instanceof kotlin.reflect.g) {
            return obj.equals(u());
        }
        return false;
    }

    @Override // xc.InterfaceC5155h
    public int getArity() {
        return this.f44994h;
    }

    public int hashCode() {
        return (((E() == null ? 0 : E().hashCode() * 31) + getName().hashCode()) * 31) + G().hashCode();
    }

    public String toString() {
        kotlin.reflect.c u10 = u();
        if (u10 != this) {
            return u10.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC5156i(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public AbstractC5156i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f44994h = i10;
        this.f44995i = i11 >> 1;
    }
}
