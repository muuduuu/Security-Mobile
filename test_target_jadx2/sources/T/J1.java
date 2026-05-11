package t;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1424a;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;
import u.C4832C;
import u.C4844h;
import x.C5091f;

/* loaded from: classes.dex */
final class J1 {

    /* renamed from: i, reason: collision with root package name */
    private final String f41765i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4540f f41766j;

    /* renamed from: k, reason: collision with root package name */
    private final C4832C f41767k;

    /* renamed from: l, reason: collision with root package name */
    private final C5091f f41768l;

    /* renamed from: m, reason: collision with root package name */
    private final int f41769m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41770n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41771o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f41772p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f41773q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f41774r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f41775s;

    /* renamed from: t, reason: collision with root package name */
    androidx.camera.core.impl.c1 f41776t;

    /* renamed from: v, reason: collision with root package name */
    private final C4545g1 f41778v;

    /* renamed from: y, reason: collision with root package name */
    private final C4548h1 f41781y;

    /* renamed from: a, reason: collision with root package name */
    private final List f41757a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f41758b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f41759c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f41760d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Map f41761e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final List f41762f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f41763g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f41764h = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    List f41777u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private final x.y f41779w = new x.y();

    /* renamed from: x, reason: collision with root package name */
    private final x.u f41780x = new x.u();

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    static abstract class b {
        b() {
        }

        static b e(int i10, int i11, boolean z10, boolean z11) {
            return new C4537e(i10, i11, z10, z11);
        }

        abstract int a();

        abstract int b();

        abstract boolean c();

        abstract boolean d();
    }

    J1(Context context, String str, u.P p10, InterfaceC4540f interfaceC4540f) {
        this.f41770n = false;
        this.f41771o = false;
        this.f41772p = false;
        this.f41773q = false;
        this.f41774r = false;
        this.f41775s = false;
        String str2 = (String) y0.f.g(str);
        this.f41765i = str2;
        this.f41766j = (InterfaceC4540f) y0.f.g(interfaceC4540f);
        this.f41768l = new C5091f();
        this.f41778v = C4545g1.c(context);
        try {
            C4832C c10 = p10.c(str2);
            this.f41767k = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f41769m = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f41770n = true;
                    } else if (i10 == 6) {
                        this.f41771o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f41774r = true;
                    }
                }
            }
            C4548h1 c4548h1 = new C4548h1(this.f41767k);
            this.f41781y = c4548h1;
            k();
            if (this.f41774r) {
                n();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f41772p = hasSystemFeature;
            if (hasSystemFeature) {
                h();
            }
            if (c4548h1.d()) {
                g();
            }
            if (J()) {
                m();
            }
            boolean h10 = H1.h(this.f41767k);
            this.f41773q = h10;
            if (h10) {
                j();
            }
            boolean a10 = b2.a(this.f41767k);
            this.f41775s = a10;
            if (a10) {
                i();
            }
            l();
            b();
        } catch (C4844h e10) {
            throw P0.a(e10);
        }
    }

    private List B(b bVar) {
        if (this.f41761e.containsKey(bVar)) {
            return (List) this.f41761e.get(bVar);
        }
        List arrayList = new ArrayList();
        if (bVar.d()) {
            if (bVar.a() == 0) {
                arrayList.addAll(this.f41763g);
            }
        } else if (bVar.b() == 8) {
            int a10 = bVar.a();
            if (a10 == 1) {
                arrayList = this.f41759c;
            } else if (a10 != 2) {
                arrayList.addAll(bVar.c() ? this.f41760d : this.f41757a);
            } else {
                arrayList.addAll(this.f41758b);
                arrayList.addAll(this.f41757a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f41762f);
        }
        this.f41761e.put(bVar, arrayList);
        return arrayList;
    }

    private Pair C(int i10, List list, List list2, List list3, List list4, int i11, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1424a abstractC1424a = (AbstractC1424a) it.next();
            arrayList.add(abstractC1424a.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC1424a);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = (Size) list2.get(i12);
            androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) list3.get(((Integer) list4.get(i12)).intValue());
            int p10 = l1Var.p();
            arrayList.add(androidx.camera.core.impl.b1.h(i10, p10, size, F(p10)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), l1Var);
            }
            i11 = E(i11, l1Var.p(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i11));
    }

    private Range D(List list, List list2, List list3) {
        Iterator it = list.iterator();
        Range range = null;
        while (it.hasNext()) {
            range = G(((AbstractC1424a) it.next()).h(), range);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            range = G(((androidx.camera.core.impl.l1) list2.get(((Integer) it2.next()).intValue())).I(null), range);
        }
        return range;
    }

    private int E(int i10, int i11, Size size) {
        return Math.min(i10, q(this.f41767k, i11, size));
    }

    private Range G(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List H(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int M10 = ((androidx.camera.core.impl.l1) it.next()).M(0);
            if (!arrayList2.contains(Integer.valueOf(M10))) {
                arrayList2.add(Integer.valueOf(M10));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) it3.next();
                if (intValue == l1Var.M(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(l1Var)));
                }
            }
        }
        return arrayList;
    }

    private static boolean I(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC1424a) it.next()).d() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((androidx.camera.core.impl.l1) it2.next()).p() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean J() {
        int[] b10 = this.f41767k.b().b();
        if (b10 == null) {
            return false;
        }
        for (int i10 : b10) {
            if (i10 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean K(b bVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1424a) it.next()).g());
        }
        E.e eVar = new E.e();
        for (androidx.camera.core.impl.l1 l1Var : map.keySet()) {
            List list2 = (List) map.get(l1Var);
            y0.f.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + l1Var + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int p10 = l1Var.p();
            arrayList.add(androidx.camera.core.impl.b1.h(bVar.a(), p10, size, F(p10)));
        }
        return c(bVar, arrayList);
    }

    private void L() {
        this.f41778v.g();
        if (this.f41776t == null) {
            l();
        } else {
            this.f41776t = androidx.camera.core.impl.c1.a(this.f41776t.b(), this.f41776t.j(), this.f41778v.f(), this.f41776t.h(), this.f41776t.f(), this.f41776t.d(), this.f41776t.l());
        }
    }

    private void N(Map map, int i10) {
        Size r10 = r(this.f41767k.b().d(), i10, true);
        if (r10 != null) {
            map.put(Integer.valueOf(i10), r10);
        }
    }

    private void O(Map map, Size size, int i10) {
        if (this.f41772p) {
            Size r10 = r(this.f41767k.b().d(), i10, false);
            Integer valueOf = Integer.valueOf(i10);
            if (r10 != null) {
                size = (Size) Collections.min(Arrays.asList(size, r10), new E.e());
            }
            map.put(valueOf, size);
        }
    }

    private void P(Map map, int i10) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.f41774r) {
            return;
        }
        C4832C c4832c = this.f41767k;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c4832c.a(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i10), r(streamConfigurationMap, i10, true));
    }

    private static Range d(Range range, Range range2, Range range3) {
        double v10 = v(range2.intersect(range));
        double v11 = v(range3.intersect(range));
        double v12 = v11 / v(range3);
        double v13 = v10 / v(range2);
        if (v11 > v10) {
            if (v12 >= 0.5d || v12 >= v13) {
                return range3;
            }
        } else if (v11 == v10) {
            if (v12 > v13) {
                return range3;
            }
            if (v12 == v13 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (v13 < 0.5d && v12 > v13) {
            return range3;
        }
        return range2;
    }

    private b e(int i10, Map map, boolean z10, boolean z11) {
        int z12 = z(map);
        if (i10 != 0 && z11) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f41765i, androidx.camera.core.impl.I.a(i10)));
        }
        if (i10 == 0 || z12 != 10) {
            return b.e(i10, z12, z10, z11);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f41765i, androidx.camera.core.impl.I.a(i10)));
    }

    private Map f(Map map, b bVar, Range range) {
        HashMap hashMap = new HashMap();
        for (androidx.camera.core.impl.l1 l1Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : (List) map.get(l1Var)) {
                int p10 = l1Var.p();
                b1.a c10 = androidx.camera.core.impl.b1.h(bVar.a(), p10, size, F(p10)).c();
                int q10 = range != null ? q(this.f41767k, p10, size) : Integer.MAX_VALUE;
                Set set = (Set) hashMap2.get(c10);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(c10, set);
                }
                if (!set.contains(Integer.valueOf(q10))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(q10));
                }
            }
            hashMap.put(l1Var, arrayList);
        }
        return hashMap;
    }

    private void g() {
        this.f41762f.addAll(A1.b());
    }

    private void h() {
        this.f41759c.addAll(A1.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f41760d.addAll(A1.i());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f41764h.addAll(A1.k());
        }
    }

    private void k() {
        this.f41757a.addAll(A1.a(this.f41769m, this.f41770n, this.f41771o));
        this.f41757a.addAll(this.f41768l.a(this.f41765i));
    }

    private void l() {
        this.f41776t = androidx.camera.core.impl.c1.a(L.d.f5619c, new HashMap(), this.f41778v.f(), new HashMap(), w(), new HashMap(), new HashMap());
    }

    private void m() {
        this.f41763g.addAll(A1.l());
    }

    private void n() {
        this.f41758b.addAll(A1.m());
    }

    private List o(List list) {
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            i10 *= ((List) it.next()).size();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new ArrayList());
        }
        int size = i10 / ((List) list.get(0)).size();
        int i12 = i10;
        for (int i13 = 0; i13 < list.size(); i13++) {
            List list2 = (List) list.get(i13);
            for (int i14 = 0; i14 < i10; i14++) {
                ((List) arrayList.get(i14)).add((Size) list2.get((i14 % i12) / size));
            }
            if (i13 < list.size() - 1) {
                i12 = size;
                size /= ((List) list.get(i13 + 1)).size();
            }
        }
        return arrayList;
    }

    private Range p(Range range, int i10) {
        if (range != null) {
            Range range2 = androidx.camera.core.impl.Z0.f14526a;
            if (!range.equals(range2)) {
                Range[] rangeArr = (Range[]) this.f41767k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
                int i11 = 0;
                for (Range range4 : rangeArr) {
                    if (i10 >= ((Integer) range4.getLower()).intValue()) {
                        if (range2.equals(androidx.camera.core.impl.Z0.f14526a)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int v10 = v(range4.intersect(range3));
                            if (i11 == 0) {
                                i11 = v10;
                            } else {
                                if (v10 >= i11) {
                                    range2 = d(range3, range2, range4);
                                    i11 = v(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i11 == 0) {
                                if (u(range4, range3) >= u(range2, range3)) {
                                    if (u(range4, range3) == u(range2, range3)) {
                                        if (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && v(range4) >= v(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return androidx.camera.core.impl.Z0.f14526a;
    }

    static int q(C4832C c4832c, int i10, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) c4832c.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i10, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size r(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10) {
        Size[] a10;
        Size[] outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        E.e eVar = new E.e();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), eVar);
        Size size2 = L.d.f5617a;
        if (z10 && (a10 = a.a(streamConfigurationMap, i10)) != null && a10.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(a10), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    private int s(List list) {
        Iterator it = list.iterator();
        int i10 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC1424a abstractC1424a = (AbstractC1424a) it.next();
            i10 = E(i10, abstractC1424a.d(), abstractC1424a.f());
        }
        return i10;
    }

    private static int u(Range range, Range range2) {
        y0.f.j((range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int v(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private Size w() {
        try {
            int parseInt = Integer.parseInt(this.f41765i);
            CamcorderProfile a10 = this.f41766j.b(parseInt, 1) ? this.f41766j.a(parseInt, 1) : null;
            return a10 != null ? new Size(a10.videoFrameWidth, a10.videoFrameHeight) : x(parseInt);
        } catch (NumberFormatException unused) {
            return y();
        }
    }

    private Size x(int i10) {
        Size size = L.d.f5620d;
        CamcorderProfile a10 = this.f41766j.b(i10, 10) ? this.f41766j.a(i10, 10) : this.f41766j.b(i10, 8) ? this.f41766j.a(i10, 8) : this.f41766j.b(i10, 12) ? this.f41766j.a(i10, 12) : this.f41766j.b(i10, 6) ? this.f41766j.a(i10, 6) : this.f41766j.b(i10, 5) ? this.f41766j.a(i10, 5) : this.f41766j.b(i10, 4) ? this.f41766j.a(i10, 4) : null;
        return a10 != null ? new Size(a10.videoFrameWidth, a10.videoFrameHeight) : size;
    }

    private Size y() {
        Size[] outputSizes = this.f41767k.b().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return L.d.f5620d;
        }
        Arrays.sort(outputSizes, new E.e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = L.d.f5622f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return L.d.f5620d;
    }

    private static int z(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((A.B) it.next()).a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    Pair A(int i10, List list, Map map, boolean z10, boolean z11) {
        Map map2;
        HashMap hashMap;
        HashMap hashMap2;
        Range range;
        List list2;
        Map map3;
        int i11;
        String str;
        String str2;
        Map map4;
        List list3;
        String str3;
        String str4;
        Map map5;
        Map map6;
        List list4;
        List list5;
        HashMap hashMap3;
        int i12;
        int i13;
        int i14;
        String str5;
        L();
        List arrayList = new ArrayList(map.keySet());
        List H10 = H(arrayList);
        Map g10 = this.f41781y.g(list, arrayList, H10);
        b e10 = e(i10, g10, z10, I(list, map));
        boolean K10 = K(e10, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!K10) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f41765i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range D10 = D(list, arrayList, H10);
        Map f10 = f(map, e10, D10);
        List arrayList2 = new ArrayList();
        Iterator it = H10.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) arrayList.get(((Integer) it.next()).intValue());
            arrayList2.add(a((List) f10.get(l1Var), l1Var.p()));
        }
        List o10 = o(arrayList2);
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        Map hashMap6 = new HashMap();
        Map hashMap7 = new HashMap();
        boolean d10 = H1.d(list, arrayList);
        int s10 = s(list);
        Map map7 = hashMap7;
        if (!this.f41773q || d10) {
            map2 = hashMap6;
            hashMap = hashMap5;
            hashMap2 = hashMap4;
            range = D10;
            list2 = H10;
            map3 = g10;
            i11 = s10;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            map4 = map7;
            list3 = null;
        } else {
            Iterator it2 = o10.iterator();
            List list6 = null;
            while (true) {
                if (!it2.hasNext()) {
                    hashMap = hashMap5;
                    hashMap2 = hashMap4;
                    range = D10;
                    list2 = H10;
                    map3 = g10;
                    i11 = s10;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    map4 = map7;
                    map2 = hashMap6;
                    break;
                }
                Map map8 = map7;
                Map map9 = hashMap6;
                hashMap = hashMap5;
                hashMap2 = hashMap4;
                map3 = g10;
                Range range2 = D10;
                List list7 = H10;
                range = range2;
                str = str8;
                int i15 = s10;
                i11 = s10;
                str2 = str7;
                list2 = H10;
                str5 = str6;
                list6 = t(e10, (List) C(i10, list, (List) it2.next(), arrayList, list7, i15, map9, map8).first);
                map2 = map9;
                map4 = map8;
                if (list6 != null && !H1.a(map2, map4, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (H1.c(this.f41767k, list6)) {
                        break;
                    }
                    list6 = null;
                }
                map2.clear();
                map4.clear();
                map7 = map4;
                hashMap6 = map2;
                str6 = str5;
                str8 = str;
                str7 = str2;
                g10 = map3;
                hashMap5 = hashMap;
                hashMap4 = hashMap2;
                D10 = range;
                s10 = i11;
                H10 = list2;
            }
            if (list6 == null && !K10) {
                throw new IllegalArgumentException(str + this.f41765i + str5 + list + str2 + arrayList);
            }
            list3 = list6;
        }
        Iterator it3 = o10.iterator();
        int i16 = Integer.MAX_VALUE;
        int i17 = Integer.MAX_VALUE;
        boolean z12 = false;
        boolean z13 = false;
        List list8 = null;
        List list9 = null;
        while (true) {
            if (!it3.hasNext()) {
                str3 = str;
                str4 = str2;
                map5 = map4;
                map6 = map2;
                list4 = list8;
                list5 = list9;
                break;
            }
            List list10 = (List) it3.next();
            int i18 = i16;
            int i19 = i17;
            str4 = str2;
            map5 = map4;
            str3 = str;
            map6 = map2;
            Pair C10 = C(i10, list, list10, arrayList, list2, i11, null, null);
            List list11 = (List) C10.first;
            i17 = ((Integer) C10.second).intValue();
            int i20 = i11;
            boolean z14 = range == null || i20 <= i17 || i17 >= ((Integer) range.getLower()).intValue();
            if (z12 || !c(e10, list11)) {
                i12 = i19;
                i13 = Integer.MAX_VALUE;
            } else {
                i12 = i19;
                i13 = Integer.MAX_VALUE;
                if (i12 == Integer.MAX_VALUE || i12 < i17) {
                    i12 = i17;
                    list8 = list10;
                }
                if (z14) {
                    if (z13) {
                        list5 = list9;
                        list4 = list10;
                        i16 = i18;
                        break;
                    }
                    z12 = true;
                    i12 = i17;
                    list8 = list10;
                }
            }
            if (list3 == null || z13 || t(e10, list11) == null) {
                i14 = i18;
            } else {
                i14 = i18;
                if (i14 == i13 || i14 < i17) {
                    i14 = i17;
                    list9 = list10;
                }
                if (!z14) {
                    continue;
                } else {
                    if (z12) {
                        i16 = i17;
                        i17 = i12;
                        list4 = list8;
                        list5 = list10;
                        break;
                    }
                    z13 = true;
                    i14 = i17;
                    list9 = list10;
                }
            }
            i11 = i20;
            i17 = i12;
            map2 = map6;
            map4 = map5;
            str = str3;
            str2 = str4;
            i16 = i14;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str3 + this.f41765i + " and Hardware level: " + this.f41769m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range p10 = range != null ? p(range, i17) : null;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            androidx.camera.core.impl.l1 l1Var2 = (androidx.camera.core.impl.l1) it4.next();
            List list12 = list2;
            Map map10 = map3;
            Iterator it5 = it4;
            Z0.a f11 = androidx.camera.core.impl.Z0.a((Size) list4.get(list12.indexOf(Integer.valueOf(arrayList.indexOf(l1Var2))))).b((A.B) y0.f.g((A.B) map10.get(l1Var2))).d(H1.e(l1Var2)).f(z11);
            if (p10 != null) {
                f11.c(p10);
            }
            hashMap.put(l1Var2, f11.a());
            it4 = it5;
            list2 = list12;
            map3 = map10;
            p10 = p10;
        }
        HashMap hashMap8 = hashMap;
        if (list3 != null && i17 == i16 && list4.size() == list5.size()) {
            for (int i21 = 0; i21 < list4.size(); i21++) {
                if (((Size) list4.get(i21)).equals(list5.get(i21))) {
                }
            }
            hashMap3 = hashMap2;
            if (!H1.k(this.f41767k, list, hashMap8, hashMap3)) {
                H1.l(hashMap8, hashMap3, map6, map5, list3);
            }
            return new Pair(hashMap8, hashMap3);
        }
        hashMap3 = hashMap2;
        return new Pair(hashMap8, hashMap3);
    }

    androidx.camera.core.impl.c1 F(int i10) {
        if (!this.f41777u.contains(Integer.valueOf(i10))) {
            O(this.f41776t.j(), L.d.f5621e, i10);
            O(this.f41776t.h(), L.d.f5623g, i10);
            N(this.f41776t.d(), i10);
            P(this.f41776t.l(), i10);
            this.f41777u.add(Integer.valueOf(i10));
        }
        return this.f41776t;
    }

    androidx.camera.core.impl.b1 M(int i10, int i11, Size size) {
        return androidx.camera.core.impl.b1.h(i10, i11, size, F(i11));
    }

    List a(List list, int i10) {
        Rational rational;
        int a10 = this.f41779w.a(this.f41765i, this.f41767k);
        if (a10 == 0) {
            rational = E.a.f1800a;
        } else if (a10 == 1) {
            rational = E.a.f1802c;
        } else if (a10 != 2) {
            rational = null;
        } else {
            Size c10 = F(PSKKeyManager.MAX_KEY_LENGTH_BYTES).c(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            rational = new Rational(c10.getWidth(), c10.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (E.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f41780x.a(androidx.camera.core.impl.b1.e(i10), list);
    }

    boolean c(b bVar, List list) {
        Iterator it = B(bVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((androidx.camera.core.impl.a1) it.next()).d(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    List t(b bVar, List list) {
        if (!H1.n(bVar)) {
            return null;
        }
        Iterator it = this.f41764h.iterator();
        while (it.hasNext()) {
            List d10 = ((androidx.camera.core.impl.a1) it.next()).d(list);
            if (d10 != null) {
                return d10;
            }
        }
        return null;
    }

    private void b() {
    }
}
