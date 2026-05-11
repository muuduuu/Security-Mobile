package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.a1;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a1 f14316a = f();

    /* renamed from: b, reason: collision with root package name */
    private static final a1 f14317b = g();

    /* renamed from: c, reason: collision with root package name */
    private static final Set f14318c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* renamed from: d, reason: collision with root package name */
    private static final Set f14319d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    private static a1 f() {
        a1 a1Var = new a1();
        b1.b bVar = b1.b.YUV;
        a1Var.a(b1.a(bVar, b1.a.VGA));
        a1Var.a(b1.a(b1.b.PRIV, b1.a.PREVIEW));
        a1Var.a(b1.a(bVar, b1.a.MAXIMUM));
        return a1Var;
    }

    private static a1 g() {
        a1 a1Var = new a1();
        b1.b bVar = b1.b.PRIV;
        a1Var.a(b1.a(bVar, b1.a.PREVIEW));
        a1Var.a(b1.a(bVar, b1.a.VGA));
        a1Var.a(b1.a(b1.b.YUV, b1.a.MAXIMUM));
        return a1Var;
    }

    private List i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f14316a);
        }
        return arrayList;
    }

    private static boolean j() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean k() {
        return j() || l() || m();
    }

    private static boolean l() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f14318c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean m() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f14319d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public List h(String str) {
        return j() ? i(str) : (l() || m()) ? Collections.singletonList(f14317b) : Collections.emptyList();
    }
}
