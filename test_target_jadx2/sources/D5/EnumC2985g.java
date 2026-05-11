package d5;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2985g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC2985g[] $VALUES;
    public static final a Companion;
    public static final EnumC2985g CREATE = new EnumC2985g("CREATE", 0);
    public static final EnumC2985g UPDATE = new EnumC2985g("UPDATE", 1);
    public static final EnumC2985g DELETE = new EnumC2985g("DELETE", 2);

    /* renamed from: d5.g$a */
    public static final class a {

        /* renamed from: d5.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0450a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f31216a;

            static {
                int[] iArr = new int[EnumC2985g.values().length];
                try {
                    iArr[EnumC2985g.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2985g.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2985g.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f31216a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(EnumC2985g type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0450a.f31216a[type.ordinal()];
            if (i10 == 1) {
                return "create";
            }
            if (i10 == 2) {
                return "update";
            }
            if (i10 == 3) {
                return "delete";
            }
            throw new lc.m();
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC2985g[] $values() {
        return new EnumC2985g[]{CREATE, UPDATE, DELETE};
    }

    static {
        EnumC2985g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC2985g(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final String toString(EnumC2985g enumC2985g) {
        return Companion.a(enumC2985g);
    }

    public static EnumC2985g valueOf(String str) {
        return (EnumC2985g) Enum.valueOf(EnumC2985g.class, str);
    }

    public static EnumC2985g[] values() {
        return (EnumC2985g[]) $VALUES.clone();
    }
}
