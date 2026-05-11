package l2;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class n implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f37040d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f37041e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f37042f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f37043g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f37044h;

    /* renamed from: a, reason: collision with root package name */
    private final c f37045a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g f37046b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final Map f37047c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37048a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f37048a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37048a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37048a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37048a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final c f37049a;

        /* renamed from: b, reason: collision with root package name */
        int f37050b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f37051c;

        public b(c cVar) {
            this.f37049a = cVar;
        }

        @Override // l2.m
        public void a() {
            this.f37049a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f37050b = i10;
            this.f37051c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f37050b == bVar.f37050b && D2.l.e(this.f37051c, bVar.f37051c);
        }

        public int hashCode() {
            int i10 = this.f37050b * 31;
            Bitmap.Config config = this.f37051c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f37050b, this.f37051c);
        }
    }

    static class c extends AbstractC3601c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l2.AbstractC3601c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f37040d = configArr;
        f37041e = configArr;
        f37042f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f37043g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f37044h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num2 = (Integer) j10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j10.remove(num);
                return;
            } else {
                j10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b e10 = this.f37045a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f37045a.c(e10);
                return this.f37045a.e(num.intValue(), config2);
            }
        }
        return e10;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f37041e;
            }
        }
        int i10 = a.f37048a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f37044h : f37043g : f37042f : f37040d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f37047c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f37047c.put(config, treeMap);
        return treeMap;
    }

    @Override // l2.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(D2.l.h(i10, i11, config), config);
    }

    @Override // l2.l
    public int b(Bitmap bitmap) {
        return D2.l.i(bitmap);
    }

    @Override // l2.l
    public void c(Bitmap bitmap) {
        b e10 = this.f37045a.e(D2.l.i(bitmap), bitmap.getConfig());
        this.f37046b.d(e10, bitmap);
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num = (Integer) j10.get(Integer.valueOf(e10.f37050b));
        j10.put(Integer.valueOf(e10.f37050b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // l2.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b g10 = g(D2.l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f37046b.a(g10);
        if (bitmap != null) {
            f(Integer.valueOf(g10.f37050b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // l2.l
    public String e(Bitmap bitmap) {
        return h(D2.l.i(bitmap), bitmap.getConfig());
    }

    @Override // l2.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f37046b.f();
        if (bitmap != null) {
            f(Integer.valueOf(D2.l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f37046b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f37047c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f37047c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), BuildConfig.FLAVOR);
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
