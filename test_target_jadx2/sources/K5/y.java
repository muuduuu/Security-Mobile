package K5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    static final Class[] f5460c = new Class[0];

    /* renamed from: a, reason: collision with root package name */
    final String f5461a;

    /* renamed from: b, reason: collision with root package name */
    final Class[] f5462b;

    public y(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.f5462b.length;
    }

    public String b() {
        return this.f5461a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != y.class) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.f5461a.equals(yVar.f5461a)) {
            return false;
        }
        Class[] clsArr = yVar.f5462b;
        int length = this.f5462b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (clsArr[i10] != this.f5462b[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f5461a.hashCode() + this.f5462b.length;
    }

    public String toString() {
        return this.f5461a + "(" + this.f5462b.length + "-args)";
    }

    public y(Constructor constructor) {
        this(BuildConfig.FLAVOR, constructor.getParameterTypes());
    }

    public y(String str, Class[] clsArr) {
        this.f5461a = str;
        this.f5462b = clsArr == null ? f5460c : clsArr;
    }
}
