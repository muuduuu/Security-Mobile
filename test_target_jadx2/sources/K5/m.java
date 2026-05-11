package K5;

import java.lang.reflect.Member;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class m extends AbstractC0928i {

    /* renamed from: c, reason: collision with root package name */
    protected final n f5405c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.j f5406d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f5407e;

    public m(n nVar, D5.j jVar, G g10, p pVar, int i10) {
        super(g10, pVar);
        this.f5405c = nVar;
        this.f5406d = jVar;
        this.f5407e = i10;
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return BuildConfig.FLAVOR;
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5406d.q();
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5406d;
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, m.class)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f5405c.equals(this.f5405c) && mVar.f5407e == this.f5407e;
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5405c.hashCode() + this.f5407e;
    }

    @Override // K5.AbstractC0928i
    public Class j() {
        return this.f5405c.j();
    }

    @Override // K5.AbstractC0928i
    public Member l() {
        return this.f5405c.l();
    }

    @Override // K5.AbstractC0928i
    public Object m(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + j().getName());
    }

    public int o() {
        return this.f5407e;
    }

    public n p() {
        return this.f5405c;
    }

    @Override // K5.AbstractC0928i
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public m n(p pVar) {
        return pVar == this.f5396b ? this : this.f5405c.r(this.f5407e, pVar);
    }

    public String toString() {
        return "[parameter #" + o() + ", annotations: " + this.f5396b + "]";
    }
}
