package v5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4940g {

    /* renamed from: v5.g$a */
    public enum a {
        DEFAULT,
        DELEGATING,
        PROPERTIES,
        DISABLED
    }

    a mode() default a.DEFAULT;
}
