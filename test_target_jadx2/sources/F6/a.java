package F6;

import android.util.SparseArray;
import java.util.HashMap;
import s6.EnumC4319e;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f2564a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f2565b;

    static {
        HashMap hashMap = new HashMap();
        f2565b = hashMap;
        hashMap.put(EnumC4319e.DEFAULT, 0);
        f2565b.put(EnumC4319e.VERY_LOW, 1);
        f2565b.put(EnumC4319e.HIGHEST, 2);
        for (EnumC4319e enumC4319e : f2565b.keySet()) {
            f2564a.append(((Integer) f2565b.get(enumC4319e)).intValue(), enumC4319e);
        }
    }

    public static int a(EnumC4319e enumC4319e) {
        Integer num = (Integer) f2565b.get(enumC4319e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC4319e);
    }

    public static EnumC4319e b(int i10) {
        EnumC4319e enumC4319e = (EnumC4319e) f2564a.get(i10);
        if (enumC4319e != null) {
            return enumC4319e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
