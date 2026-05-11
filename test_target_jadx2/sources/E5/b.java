package E5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v5.p;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface b {

    public @interface a {
        p.a include() default p.a.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* renamed from: E5.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0038b {
        p.a include() default p.a.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class type() default Object.class;

        Class value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    InterfaceC0038b[] props() default {};
}
