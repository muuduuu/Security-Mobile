package co.hyperverge.hvcamera.magicfilter.filter.helper;

import android.content.Context;
import co.hyperverge.hvcamera.HVLog;
import co.hyperverge.hvcamera.R;

/* loaded from: classes.dex */
public class MagicFilterType {
    public static final int FILTER_COUNT = 1;
    public static final int NONE = 0;
    private static final String TAG = "MagicFilterType";

    public static int filterTypeToName(int i10) {
        HVLog.d(TAG, "filterTypeToName() called with: filterType = [" + i10 + "]");
        return i10 == 0 ? R.string.filter_none : R.string.filter_none;
    }

    public static String filterTypeToNameString(Context context, int i10) {
        HVLog.d(TAG, "filterTypeToNameString() called with: context = [" + context + "], filter = [" + i10 + "]");
        return context.getResources().getString(filterTypeToName(i10));
    }
}
