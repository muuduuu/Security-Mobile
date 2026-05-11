package M5;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final Class f6071a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f6072b;

    /* renamed from: c, reason: collision with root package name */
    protected String f6073c;

    public b(Class cls) {
        this(cls, null);
    }

    public String a() {
        return this.f6073c;
    }

    public Class b() {
        return this.f6071a;
    }

    public boolean c() {
        return this.f6073c != null;
    }

    public void d(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this.f6073c = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b.class) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6071a == bVar.f6071a && Objects.equals(this.f6073c, bVar.f6073c);
    }

    public int hashCode() {
        return this.f6072b;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[NamedType, class ");
        sb2.append(this.f6071a.getName());
        sb2.append(", name: ");
        if (this.f6073c == null) {
            str = "null";
        } else {
            str = "'" + this.f6073c + "'";
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    public b(Class cls, String str) {
        this.f6071a = cls;
        this.f6072b = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        d(str);
    }
}
