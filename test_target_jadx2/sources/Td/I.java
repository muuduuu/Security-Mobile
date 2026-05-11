package Td;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class I {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ I[] $VALUES;
    public static final a Companion;
    private final String javaName;
    public static final I TLS_1_3 = new I("TLS_1_3", 0, "TLSv1.3");
    public static final I TLS_1_2 = new I("TLS_1_2", 1, "TLSv1.2");
    public static final I TLS_1_1 = new I("TLS_1_1", 2, "TLSv1.1");
    public static final I TLS_1_0 = new I("TLS_1_0", 3, "TLSv1");
    public static final I SSL_3_0 = new I("SSL_3_0", 4, "SSLv3");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final I a(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return I.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return I.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return I.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return I.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return I.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        private a() {
        }
    }

    private static final /* synthetic */ I[] $values() {
        return new I[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    static {
        I[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private I(String str, int i10, String str2) {
        this.javaName = str2;
    }

    public static final I forJavaName(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m0deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
