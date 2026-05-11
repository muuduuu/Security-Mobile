package A1;

import C1.u;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import x1.o;
import z1.C5239c;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name */
    private final int f301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(B1.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f301b = 7;
    }

    @Override // A1.c
    public int b() {
        return this.f301b;
    }

    @Override // A1.c
    public boolean c(u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f799j.d() == o.CONNECTED;
    }

    @Override // A1.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean e(C5239c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!value.a() || !value.d()) {
                return true;
            }
        } else if (!value.a()) {
            return true;
        }
        return false;
    }
}
