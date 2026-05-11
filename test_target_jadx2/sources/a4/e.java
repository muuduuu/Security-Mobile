package a4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum e {
    LOW,
    MEDIUM,
    HIGH;

    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(e priority1, e priority2) {
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        private a() {
        }
    }

    public static final e getHigherPriority(e eVar, e eVar2) {
        return Companion.a(eVar, eVar2);
    }
}
