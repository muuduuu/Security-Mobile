package De;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Method f1666a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1667b;

    l(Method method, List list) {
        this.f1666a = method;
        this.f1667b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f1666a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f1666a.getDeclaringClass().getName(), this.f1666a.getName(), this.f1667b);
    }
}
