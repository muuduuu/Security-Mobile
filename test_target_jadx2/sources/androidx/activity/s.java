package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s {
    public static final void a(View view, m fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(r.f12999a, fullyDrawnReporterOwner);
    }
}
