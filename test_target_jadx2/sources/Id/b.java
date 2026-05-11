package Id;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final TimeUnit timeUnit;
    public static final b NANOSECONDS = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final b MICROSECONDS = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final b MILLISECONDS = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final b SECONDS = new b("SECONDS", 3, TimeUnit.SECONDS);
    public static final b MINUTES = new b("MINUTES", 4, TimeUnit.MINUTES);
    public static final b HOURS = new b("HOURS", 5, TimeUnit.HOURS);
    public static final b DAYS = new b("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private b(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
