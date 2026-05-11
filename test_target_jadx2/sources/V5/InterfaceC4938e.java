package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4938e {

    /* renamed from: v5.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43943a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f43944b;

        static {
            int[] iArr = new int[N.values().length];
            f43944b = iArr;
            try {
                iArr[N.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43944b[N.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43944b[N.GETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43944b[N.IS_GETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43944b[N.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43944b[N.SETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43944b[N.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f43943a = iArr2;
            try {
                iArr2[c.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43943a[c.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43943a[c.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43943a[c.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43943a[c.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: v5.e$b */
    public static class b implements Serializable {
    }

    /* renamed from: v5.e$c */
    public enum c {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i10 = a.f43943a[ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    c creatorVisibility() default c.DEFAULT;

    c fieldVisibility() default c.DEFAULT;

    c getterVisibility() default c.DEFAULT;

    c isGetterVisibility() default c.DEFAULT;

    c setterVisibility() default c.DEFAULT;
}
