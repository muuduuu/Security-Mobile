package v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4933A {

    /* renamed from: v5.A$a */
    public @interface a {
        String name() default "";

        String[] names() default {};

        Class value();
    }

    a[] value();
}
