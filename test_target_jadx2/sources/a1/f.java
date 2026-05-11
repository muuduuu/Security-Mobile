package A1;

import C1.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.n;
import x1.o;
import z1.C5239c;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f305c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String f306d;

    /* renamed from: b, reason: collision with root package name */
    private final int f307b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i10 = n.i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f306d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(B1.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f307b = 7;
    }

    @Override // A1.c
    public int b() {
        return this.f307b;
    }

    @Override // A1.c
    public boolean c(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f799j.d() == o.NOT_ROAMING;
    }

    @Override // A1.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean e(C5239c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
