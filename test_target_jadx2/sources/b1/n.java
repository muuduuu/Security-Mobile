package B1;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final h f433a;

    /* renamed from: b, reason: collision with root package name */
    private final c f434b;

    /* renamed from: c, reason: collision with root package name */
    private final h f435c;

    /* renamed from: d, reason: collision with root package name */
    private final h f436d;

    public n(Context context, E1.b taskExecutor, h batteryChargingTracker, c batteryNotLowTracker, h networkStateTracker, h storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f433a = batteryChargingTracker;
        this.f434b = batteryNotLowTracker;
        this.f435c = networkStateTracker;
        this.f436d = storageNotLowTracker;
    }

    public final h a() {
        return this.f433a;
    }

    public final c b() {
        return this.f434b;
    }

    public final h c() {
        return this.f435c;
    }

    public final h d() {
        return this.f436d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n(Context context, E1.b bVar, h hVar, c cVar, h hVar2, h hVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, r3, r4, r5, r6);
        h hVar4;
        c cVar2;
        h hVar5;
        h hVar6;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            hVar4 = new a(applicationContext, bVar);
        } else {
            hVar4 = hVar;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            cVar2 = new c(applicationContext2, bVar);
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            hVar5 = k.a(applicationContext3, bVar);
        } else {
            hVar5 = hVar2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            hVar6 = new l(applicationContext4, bVar);
        } else {
            hVar6 = hVar3;
        }
    }
}
