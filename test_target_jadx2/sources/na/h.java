package Na;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final int intValue;
    public static final h INITIALIZED = new h("INITIALIZED", 0, 0);
    public static final h STARTED = new h("STARTED", 1, 1);
    public static final h RESPONSE_RECEIVED = new h("RESPONSE_RECEIVED", 2, 2);
    public static final h BODY_COMPLETED = new h("BODY_COMPLETED", 3, 3);
    public static final h BODY_STREAMING_STARTED = new h("BODY_STREAMING_STARTED", 4, 4);
    public static final h BODY_STREAMING_CANCELLED = new h("BODY_STREAMING_CANCELLED", 5, 5);
    public static final h ERROR_RECEIVED = new h("ERROR_RECEIVED", 6, 6);

    private static final /* synthetic */ h[] $values() {
        return new h[]{INITIALIZED, STARTED, RESPONSE_RECEIVED, BODY_COMPLETED, BODY_STREAMING_STARTED, BODY_STREAMING_CANCELLED, ERROR_RECEIVED};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private h(String str, int i10, int i11) {
        this.intValue = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
