package kotlin.reflect;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* loaded from: classes3.dex */
public interface j extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE = new a("INSTANCE", 0);
        public static final a EXTENSION_RECEIVER = new a("EXTENSION_RECEIVER", 1);
        public static final a VALUE = new a("VALUE", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    boolean A();

    boolean b();

    int getIndex();

    String getName();

    o getType();

    a o();
}
