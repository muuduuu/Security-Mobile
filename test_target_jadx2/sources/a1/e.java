package A1;

import C1.u;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x1.n;
import x1.o;
import z1.C5239c;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f302c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String f303d;

    /* renamed from: b, reason: collision with root package name */
    private final int f304b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i10 = n.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f303d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(B1.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f304b = 7;
    }

    @Override // A1.c
    public int b() {
        return this.f304b;
    }

    @Override // A1.c
    public boolean c(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f799j.d() == o.METERED;
    }

    @Override // A1.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean e(C5239c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT < 26) {
            n.e().a(f303d, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (value.a()) {
                return false;
            }
        } else if (value.a() && value.b()) {
            return false;
        }
        return true;
    }
}
