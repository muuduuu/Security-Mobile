package K5;

import java.io.Serializable;
import java.lang.reflect.Member;

/* loaded from: classes2.dex */
public class H extends AbstractC0928i implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    protected final Class f5343c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.j f5344d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f5345e;

    public H(G g10, Class cls, String str, D5.j jVar) {
        super(g10, null);
        this.f5343c = cls;
        this.f5344d = jVar;
        this.f5345e = str;
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return this.f5345e;
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5344d.q();
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5344d;
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, getClass())) {
            return false;
        }
        H h10 = (H) obj;
        return h10.f5343c == this.f5343c && h10.f5345e.equals(this.f5345e);
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5345e.hashCode();
    }

    @Override // K5.AbstractC0928i
    public Class j() {
        return this.f5343c;
    }

    @Override // K5.AbstractC0928i
    public Member l() {
        return null;
    }

    @Override // K5.AbstractC0928i
    public Object m(Object obj) {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.f5345e + "'");
    }

    public String toString() {
        return "[virtual " + k() + "]";
    }

    @Override // K5.AbstractC0928i
    public AbstractC0921b n(p pVar) {
        return this;
    }
}
