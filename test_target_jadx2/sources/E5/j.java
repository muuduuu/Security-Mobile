package e5;

import com.appsflyer.attribution.RequestError;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final f Companion;
    public static final j ALL = new j("ALL", 0) { // from class: e5.j.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 8;
        }
    };
    public static final j LEFT = new j("LEFT", 1) { // from class: e5.j.i
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 0;
        }
    };
    public static final j RIGHT = new j("RIGHT", 2) { // from class: e5.j.j
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 2;
        }
    };
    public static final j TOP = new j("TOP", 3) { // from class: e5.j.l
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 1;
        }
    };
    public static final j BOTTOM = new j("BOTTOM", 4) { // from class: e5.j.e
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 3;
        }
    };
    public static final j START = new j("START", 5) { // from class: e5.j.k
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 4;
        }
    };
    public static final j END = new j("END", 6) { // from class: e5.j.g
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 5;
        }
    };
    public static final j HORIZONTAL = new j("HORIZONTAL", 7) { // from class: e5.j.h
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 6;
        }
    };
    public static final j VERTICAL = new j("VERTICAL", 8) { // from class: e5.j.m
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 7;
        }
    };
    public static final j BLOCK_START = new j("BLOCK_START", 9) { // from class: e5.j.d
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 11;
        }
    };
    public static final j BLOCK_END = new j("BLOCK_END", 10) { // from class: e5.j.c
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 10;
        }
    };
    public static final j BLOCK = new j("BLOCK", 11) { // from class: e5.j.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // e5.j
        public int toSpacingType() {
            return 9;
        }
    };

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(int i10) {
            switch (i10) {
                case 0:
                    return j.LEFT;
                case 1:
                    return j.TOP;
                case 2:
                    return j.RIGHT;
                case 3:
                    return j.BOTTOM;
                case 4:
                    return j.START;
                case 5:
                    return j.END;
                case 6:
                    return j.HORIZONTAL;
                case 7:
                    return j.VERTICAL;
                case 8:
                    return j.ALL;
                case 9:
                    return j.BLOCK;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return j.BLOCK_END;
                case 11:
                    return j.BLOCK_START;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i10);
            }
        }

        private f() {
        }
    }

    private static final /* synthetic */ j[] $values() {
        return new j[]{ALL, LEFT, RIGHT, TOP, BOTTOM, START, END, HORIZONTAL, VERTICAL, BLOCK_START, BLOCK_END, BLOCK};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new f(null);
    }

    public /* synthetic */ j(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    public static final j fromSpacingType(int i10) {
        return Companion.a(i10);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public abstract int toSpacingType();

    private j(String str, int i10) {
    }
}
