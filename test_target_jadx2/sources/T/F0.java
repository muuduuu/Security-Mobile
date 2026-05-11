package t;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class F0 implements androidx.camera.core.impl.E {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41721a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4540f f41722b;

    class a implements InterfaceC4540f {
        a() {
        }

        @Override // t.InterfaceC4540f
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // t.InterfaceC4540f
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public F0(Context context, Object obj, Set set) {
        this(context, new a(), obj, set);
    }

    private void c(Context context, u.P p10, Set set) {
        y0.f.g(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f41721a.put(str, new J1(context, str, p10, this.f41722b));
        }
    }

    @Override // androidx.camera.core.impl.E
    public androidx.camera.core.impl.b1 a(int i10, String str, int i11, Size size) {
        J1 j12 = (J1) this.f41721a.get(str);
        if (j12 != null) {
            return j12.M(i10, i11, size);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.E
    public Pair b(int i10, String str, List list, Map map, boolean z10, boolean z11) {
        y0.f.b(!map.isEmpty(), "No new use cases to be bound.");
        J1 j12 = (J1) this.f41721a.get(str);
        if (j12 != null) {
            return j12.A(i10, list, map, z10, z11);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    F0(Context context, InterfaceC4540f interfaceC4540f, Object obj, Set set) {
        this.f41721a = new HashMap();
        y0.f.g(interfaceC4540f);
        this.f41722b = interfaceC4540f;
        c(context, obj instanceof u.P ? (u.P) obj : u.P.a(context), set);
    }
}
