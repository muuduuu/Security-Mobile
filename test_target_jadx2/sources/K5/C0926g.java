package K5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* renamed from: K5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0926g extends AbstractC0928i implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    protected final transient Field f5388c;

    public C0926g(G g10, Field field, p pVar) {
        super(g10, pVar);
        this.f5388c = field;
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return this.f5388c.getName();
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5388c.getType();
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5395a.a(this.f5388c.getGenericType());
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, C0926g.class)) {
            return false;
        }
        Field field = ((C0926g) obj).f5388c;
        return field == null ? this.f5388c == null : field.equals(this.f5388c);
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5388c.getName().hashCode();
    }

    @Override // K5.AbstractC0928i
    public Class j() {
        return this.f5388c.getDeclaringClass();
    }

    @Override // K5.AbstractC0928i
    public Member l() {
        return this.f5388c;
    }

    @Override // K5.AbstractC0928i
    public Object m(Object obj) {
        try {
            return this.f5388c.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to getValue() for field " + k() + ": " + e10.getMessage(), e10);
        }
    }

    public Field o() {
        return this.f5388c;
    }

    public int p() {
        return this.f5388c.getModifiers();
    }

    public boolean q() {
        return Modifier.isTransient(p());
    }

    @Override // K5.AbstractC0928i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0926g n(p pVar) {
        return new C0926g(this.f5395a, this.f5388c, pVar);
    }

    public String toString() {
        return "[field " + k() + "]";
    }
}
