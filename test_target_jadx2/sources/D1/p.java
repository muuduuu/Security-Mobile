package D1;

import android.content.ComponentName;
import android.content.Context;
import co.hyperverge.hypersnapsdk.utils.AppConstants;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1151a = x1.n.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                x1.n.e().a(f1151a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            x1.n e10 = x1.n.e();
            String str = f1151a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? AppConstants.VIDEO_RECORDING_ENABLED : "disabled");
            e10.a(str, sb2.toString());
        } catch (Exception e11) {
            x1.n e12 = x1.n.e();
            String str2 = f1151a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? AppConstants.VIDEO_RECORDING_ENABLED : "disabled");
            e12.b(str2, sb3.toString(), e11);
        }
    }
}
