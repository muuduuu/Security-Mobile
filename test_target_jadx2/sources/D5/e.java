package D5;

import K5.AbstractC0921b;
import T5.h;
import java.lang.reflect.Type;
import org.conscrypt.BuildConfig;
import v5.I;

/* loaded from: classes2.dex */
public abstract class e {
    protected final String a(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    protected String b(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", c(str));
    }

    protected final String c(String str) {
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public j d(Type type) {
        if (type == null) {
            return null;
        }
        return g().C(type);
    }

    public T5.h e(AbstractC0921b abstractC0921b, Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == h.a.class || T5.f.F(cls)) {
            return null;
        }
        if (T5.h.class.isAssignableFrom(cls)) {
            F5.l f10 = f();
            f10.u();
            android.support.v4.media.session.b.a(T5.f.k(cls, f10.b()));
            return null;
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract F5.l f();

    public abstract S5.o g();

    public I h(AbstractC0921b abstractC0921b, K5.B b10) {
        Class c10 = b10.c();
        F5.l f10 = f();
        f10.u();
        return ((I) T5.f.k(c10, f10.b())).b(b10.e());
    }

    public abstract Object i(j jVar, String str);

    public Object j(Class cls, String str) {
        return i(d(cls), str);
    }
}
