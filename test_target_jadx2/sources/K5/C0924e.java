package K5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import org.conscrypt.BuildConfig;

/* renamed from: K5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0924e extends n {

    /* renamed from: d, reason: collision with root package name */
    protected final Constructor f5384d;

    public C0924e(G g10, Constructor constructor, p pVar, p[] pVarArr) {
        super(g10, pVar, pVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f5384d = constructor;
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return this.f5384d.getName();
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5384d.getDeclaringClass();
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5395a.a(d());
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, C0924e.class)) {
            return false;
        }
        Constructor constructor = ((C0924e) obj).f5384d;
        return constructor == null ? this.f5384d == null : constructor.equals(this.f5384d);
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5384d.getName().hashCode();
    }

    @Override // K5.AbstractC0928i
    public Class j() {
        return this.f5384d.getDeclaringClass();
    }

    @Override // K5.AbstractC0928i
    public Member l() {
        return this.f5384d;
    }

    @Override // K5.AbstractC0928i
    public Object m(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + j().getName());
    }

    @Override // K5.n
    public D5.j q(int i10) {
        Type[] genericParameterTypes = this.f5384d.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.f5395a.a(genericParameterTypes[i10]);
    }

    public final Object s() {
        return this.f5384d.newInstance(null);
    }

    public int t() {
        return this.f5384d.getParameterTypes().length;
    }

    public String toString() {
        int length = this.f5384d.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", T5.f.Q(this.f5384d.getDeclaringClass()), Integer.valueOf(length), length == 1 ? BuildConfig.FLAVOR : "s", this.f5396b);
    }

    @Override // K5.AbstractC0928i
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C0924e n(p pVar) {
        return new C0924e(this.f5395a, this.f5384d, pVar, this.f5408c);
    }
}
