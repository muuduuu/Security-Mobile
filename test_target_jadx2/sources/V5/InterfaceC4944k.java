package v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4944k {
    Class generator();

    String property() default "@id";

    Class resolver() default O.class;

    Class scope() default Object.class;
}
