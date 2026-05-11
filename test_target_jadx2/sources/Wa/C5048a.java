package wa;

import android.os.Bundle;
import android.util.Pair;
import ib.C3362a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rc.AbstractC4299c;

/* renamed from: wa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5048a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5048a f44378a = new C5048a();

    private C5048a() {
    }

    private final Pair a(List list, C3362a.C0506a c0506a, float f10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int c10 = AbstractC4299c.c(0, list.size() - 1, 2);
        if (c10 >= 0) {
            while (true) {
                arrayList.add(b(((Number) list.get(i10)).intValue() / f10, ((Number) list.get(i10 + 1)).intValue() / f10));
                if (i10 == c10) {
                    break;
                }
                i10 += 2;
            }
        }
        Bundle bundle = new Bundle();
        C5048a c5048a = f44378a;
        bundle.putParcelable("origin", c5048a.b(c0506a.c() / f10, c0506a.d() / f10));
        bundle.putParcelable("size", c5048a.c(c0506a.b() / f10, c0506a.a() / f10));
        return new Pair(arrayList, bundle);
    }

    private final Bundle b(float f10, float f11) {
        Bundle bundle = new Bundle();
        bundle.putFloat("x", f10);
        bundle.putFloat("y", f11);
        return bundle;
    }

    private final Bundle c(float f10, float f11) {
        Bundle bundle = new Bundle();
        bundle.putFloat("width", f10);
        bundle.putFloat("height", f11);
        return bundle;
    }

    public final Bundle d(C3362a result, float f10) {
        Intrinsics.checkNotNullParameter(result, "result");
        Bundle bundle = new Bundle();
        bundle.putString("data", result.g());
        bundle.putString("raw", result.c());
        bundle.putInt("type", result.f());
        C5048a c5048a = f44378a;
        List b10 = result.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getCornerPoints(...)");
        C3362a.C0506a a10 = result.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getBoundingBox(...)");
        Pair a11 = c5048a.a(b10, a10, f10);
        bundle.putParcelableArrayList("cornerPoints", (ArrayList) a11.first);
        bundle.putBundle("bounds", (Bundle) a11.second);
        return bundle;
    }
}
