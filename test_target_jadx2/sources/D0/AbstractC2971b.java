package d0;

import A.B;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.PSKKeyManager;
import y0.f;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2971b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f31190a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f31191b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f31192c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f31193d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f31194e;

    static {
        HashMap hashMap = new HashMap();
        f31190a = hashMap;
        HashMap hashMap2 = new HashMap();
        f31191b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f31192c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f31193d = hashMap4;
        HashMap hashMap5 = new HashMap();
        f31194e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        B b10 = B.f7d;
        hashMap6.put(b10, 1);
        B b11 = B.f9f;
        hashMap6.put(b11, 2);
        B b12 = B.f10g;
        hashMap6.put(b12, 4096);
        B b13 = B.f11h;
        hashMap6.put(b13, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b10, 1);
        hashMap7.put(b11, 2);
        hashMap7.put(b12, 4096);
        hashMap7.put(b13, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(b10, 1);
        hashMap8.put(b11, 4);
        hashMap8.put(b12, 4096);
        hashMap8.put(b13, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(B.f12i, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        hashMap9.put(B.f13j, 512);
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static int a(String str, B b10) {
        Integer num;
        Map map = (Map) f31194e.get(str);
        if (map == null || (num = (Integer) map.get(b10)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set b(B b10) {
        Set set = (Set) f31190a.get(Integer.valueOf(b10.a()));
        return set == null ? Collections.emptySet() : set;
    }

    public static Set c(B b10) {
        Set set = (Set) f31191b.get(Integer.valueOf(b10.b()));
        return set == null ? Collections.emptySet() : set;
    }

    private static boolean d(int i10, B b10) {
        Set set = (Set) f31190a.get(Integer.valueOf(b10.a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    private static boolean e(int i10, B b10) {
        Set set = (Set) f31191b.get(Integer.valueOf(b10.b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean f(InterfaceC1441i0.c cVar, B b10) {
        return d(cVar.b(), b10) && e(cVar.g(), b10);
    }

    public static int g(int i10) {
        Map map = f31192c;
        f.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = (Integer) map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i10) {
        Map map = f31193d;
        f.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = (Integer) map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
