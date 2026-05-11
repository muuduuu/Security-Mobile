package ga;

import com.swmansion.rnscreens.r;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {
    public static final boolean a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.getStackPresentation() == r.e.FORM_SHEET && rVar.getSheetDetents().size() == 1 && ((Number) CollectionsKt.d0(rVar.getSheetDetents())).doubleValue() == -1.0d;
    }

    public static final boolean b(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.getStackPresentation() == r.e.FORM_SHEET;
    }
}
