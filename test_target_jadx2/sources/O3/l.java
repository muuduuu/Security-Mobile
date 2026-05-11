package O3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public enum l {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);

    private final int value;
    public static final a Companion = new a(null);
    private static final l[] VALUES = values();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int i10) {
            for (l lVar : l.VALUES) {
                if (lVar.getValue() == i10) {
                    return lVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    l(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
