package E5;

import D5.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface d {
    Class value() default x.class;
}
