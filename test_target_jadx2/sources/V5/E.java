package v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface E {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}
