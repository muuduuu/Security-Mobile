package fd;

import dd.w;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f33043b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f33044c = new h(CollectionsKt.j());

    /* renamed from: a, reason: collision with root package name */
    private final List f33045a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.s() == 0) {
                return b();
            }
            List t10 = table.t();
            Intrinsics.checkNotNullExpressionValue(t10, "getRequirementList(...)");
            return new h(t10, null);
        }

        public final h b() {
            return h.f33044c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private h(List list) {
        this.f33045a = list;
    }
}
