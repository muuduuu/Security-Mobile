package v;

import A.B;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4893d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f43783a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f43784b;

    static {
        HashMap hashMap = new HashMap();
        f43783a = hashMap;
        HashMap hashMap2 = new HashMap();
        f43784b = hashMap2;
        B b10 = B.f7d;
        hashMap.put(1L, b10);
        hashMap2.put(b10, Collections.singletonList(1L));
        hashMap.put(2L, B.f9f);
        hashMap2.put((B) hashMap.get(2L), Collections.singletonList(2L));
        B b11 = B.f10g;
        hashMap.put(4L, b11);
        hashMap2.put(b11, Collections.singletonList(4L));
        B b12 = B.f11h;
        hashMap.put(8L, b12);
        hashMap2.put(b12, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            f43783a.put((Long) it.next(), B.f12i);
        }
        f43784b.put(B.f12i, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (it2.hasNext()) {
            f43783a.put((Long) it2.next(), B.f13j);
        }
        f43784b.put(B.f13j, asList2);
    }

    public static Long a(B b10, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f43784b.get(b10);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static B b(long j10) {
        return (B) f43783a.get(Long.valueOf(j10));
    }
}
