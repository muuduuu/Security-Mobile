package de;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: de.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3045b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC3045b[] $VALUES;
    public static final a Companion;
    private final int httpCode;
    public static final EnumC3045b NO_ERROR = new EnumC3045b("NO_ERROR", 0, 0);
    public static final EnumC3045b PROTOCOL_ERROR = new EnumC3045b("PROTOCOL_ERROR", 1, 1);
    public static final EnumC3045b INTERNAL_ERROR = new EnumC3045b("INTERNAL_ERROR", 2, 2);
    public static final EnumC3045b FLOW_CONTROL_ERROR = new EnumC3045b("FLOW_CONTROL_ERROR", 3, 3);
    public static final EnumC3045b SETTINGS_TIMEOUT = new EnumC3045b("SETTINGS_TIMEOUT", 4, 4);
    public static final EnumC3045b STREAM_CLOSED = new EnumC3045b("STREAM_CLOSED", 5, 5);
    public static final EnumC3045b FRAME_SIZE_ERROR = new EnumC3045b("FRAME_SIZE_ERROR", 6, 6);
    public static final EnumC3045b REFUSED_STREAM = new EnumC3045b("REFUSED_STREAM", 7, 7);
    public static final EnumC3045b CANCEL = new EnumC3045b("CANCEL", 8, 8);
    public static final EnumC3045b COMPRESSION_ERROR = new EnumC3045b("COMPRESSION_ERROR", 9, 9);
    public static final EnumC3045b CONNECT_ERROR = new EnumC3045b("CONNECT_ERROR", 10, 10);
    public static final EnumC3045b ENHANCE_YOUR_CALM = new EnumC3045b("ENHANCE_YOUR_CALM", 11, 11);
    public static final EnumC3045b INADEQUATE_SECURITY = new EnumC3045b("INADEQUATE_SECURITY", 12, 12);
    public static final EnumC3045b HTTP_1_1_REQUIRED = new EnumC3045b("HTTP_1_1_REQUIRED", 13, 13);

    /* renamed from: de.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC3045b a(int i10) {
            for (EnumC3045b enumC3045b : EnumC3045b.values()) {
                if (enumC3045b.getHttpCode() == i10) {
                    return enumC3045b;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC3045b[] $values() {
        return new EnumC3045b[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    static {
        EnumC3045b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC3045b(String str, int i10, int i11) {
        this.httpCode = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC3045b valueOf(String str) {
        return (EnumC3045b) Enum.valueOf(EnumC3045b.class, str);
    }

    public static EnumC3045b[] values() {
        return (EnumC3045b[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
