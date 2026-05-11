package Td;

import java.io.IOException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class C {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ C[] $VALUES;
    public static final a Companion;
    private final String protocol;
    public static final C HTTP_1_0 = new C("HTTP_1_0", 0, "http/1.0");
    public static final C HTTP_1_1 = new C("HTTP_1_1", 1, "http/1.1");
    public static final C SPDY_3 = new C("SPDY_3", 2, "spdy/3.1");
    public static final C HTTP_2 = new C("HTTP_2", 3, "h2");
    public static final C H2_PRIOR_KNOWLEDGE = new C("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final C QUIC = new C("QUIC", 5, "quic");
    public static final C HTTP_3 = new C("HTTP_3", 6, "h3");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(String protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            C c10 = C.HTTP_1_0;
            if (!Intrinsics.b(protocol, c10.protocol)) {
                c10 = C.HTTP_1_1;
                if (!Intrinsics.b(protocol, c10.protocol)) {
                    c10 = C.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.b(protocol, c10.protocol)) {
                        c10 = C.HTTP_2;
                        if (!Intrinsics.b(protocol, c10.protocol)) {
                            c10 = C.SPDY_3;
                            if (!Intrinsics.b(protocol, c10.protocol)) {
                                c10 = C.QUIC;
                                if (!Intrinsics.b(protocol, c10.protocol)) {
                                    c10 = C.HTTP_3;
                                    if (!StringsKt.F(protocol, c10.protocol, false, 2, null)) {
                                        throw new IOException("Unexpected protocol: " + protocol);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return c10;
        }

        private a() {
        }
    }

    private static final /* synthetic */ C[] $values() {
        return new C[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    static {
        C[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private C(String str, int i10, String str2) {
        this.protocol = str2;
    }

    public static final C get(String str) {
        return Companion.a(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
