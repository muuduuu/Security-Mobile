package e5;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3081c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC3081c[] $VALUES;
    public static final EnumC3081c BORDER_RADIUS = new EnumC3081c("BORDER_RADIUS", 0);
    public static final EnumC3081c BORDER_TOP_LEFT_RADIUS = new EnumC3081c("BORDER_TOP_LEFT_RADIUS", 1);
    public static final EnumC3081c BORDER_TOP_RIGHT_RADIUS = new EnumC3081c("BORDER_TOP_RIGHT_RADIUS", 2);
    public static final EnumC3081c BORDER_BOTTOM_RIGHT_RADIUS = new EnumC3081c("BORDER_BOTTOM_RIGHT_RADIUS", 3);
    public static final EnumC3081c BORDER_BOTTOM_LEFT_RADIUS = new EnumC3081c("BORDER_BOTTOM_LEFT_RADIUS", 4);
    public static final EnumC3081c BORDER_TOP_START_RADIUS = new EnumC3081c("BORDER_TOP_START_RADIUS", 5);
    public static final EnumC3081c BORDER_TOP_END_RADIUS = new EnumC3081c("BORDER_TOP_END_RADIUS", 6);
    public static final EnumC3081c BORDER_BOTTOM_START_RADIUS = new EnumC3081c("BORDER_BOTTOM_START_RADIUS", 7);
    public static final EnumC3081c BORDER_BOTTOM_END_RADIUS = new EnumC3081c("BORDER_BOTTOM_END_RADIUS", 8);
    public static final EnumC3081c BORDER_END_END_RADIUS = new EnumC3081c("BORDER_END_END_RADIUS", 9);
    public static final EnumC3081c BORDER_END_START_RADIUS = new EnumC3081c("BORDER_END_START_RADIUS", 10);
    public static final EnumC3081c BORDER_START_END_RADIUS = new EnumC3081c("BORDER_START_END_RADIUS", 11);
    public static final EnumC3081c BORDER_START_START_RADIUS = new EnumC3081c("BORDER_START_START_RADIUS", 12);

    private static final /* synthetic */ EnumC3081c[] $values() {
        return new EnumC3081c[]{BORDER_RADIUS, BORDER_TOP_LEFT_RADIUS, BORDER_TOP_RIGHT_RADIUS, BORDER_BOTTOM_RIGHT_RADIUS, BORDER_BOTTOM_LEFT_RADIUS, BORDER_TOP_START_RADIUS, BORDER_TOP_END_RADIUS, BORDER_BOTTOM_START_RADIUS, BORDER_BOTTOM_END_RADIUS, BORDER_END_END_RADIUS, BORDER_END_START_RADIUS, BORDER_START_END_RADIUS, BORDER_START_START_RADIUS};
    }

    static {
        EnumC3081c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC3081c(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC3081c valueOf(String str) {
        return (EnumC3081c) Enum.valueOf(EnumC3081c.class, str);
    }

    public static EnumC3081c[] values() {
        return (EnumC3081c[]) $VALUES.clone();
    }
}
