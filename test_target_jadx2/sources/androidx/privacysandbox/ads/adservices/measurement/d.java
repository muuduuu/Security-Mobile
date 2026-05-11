package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Context context) {
        super(r2);
        MeasurementManager measurementManager;
        Intrinsics.checkNotNullParameter(context, "context");
        measurementManager = MeasurementManager.get(context);
        Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
    }
}
