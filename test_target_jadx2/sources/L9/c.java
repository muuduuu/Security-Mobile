package L9;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static final Point a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            point.x = bounds.width();
            point.y = bounds.height();
        } else {
            Object systemService = context.getSystemService("window");
            Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
        }
        return point;
    }
}
