package w4;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5036a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f44315c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f44316d = {BuildConfig.FLAVOR, "_bold", "_italic", "_bold_italic"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f44317e = {".ttf", ".otf"};

    /* renamed from: f, reason: collision with root package name */
    private static final C5036a f44318f = new C5036a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f44319a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f44320b = new LinkedHashMap();

    /* renamed from: w4.a$a, reason: collision with other inner class name */
    private static final class C0636a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f44321a = new SparseArray(4);

        public final Typeface a(int i10) {
            return (Typeface) this.f44321a.get(i10);
        }

        public final void b(int i10, Typeface typeface) {
            this.f44321a.put(i10, typeface);
        }
    }

    /* renamed from: w4.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String str, int i10, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = C5036a.f44316d[i10];
                for (String str3 : C5036a.f44317e) {
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        Intrinsics.checkNotNullExpressionValue(createFromAsset, "createFromAsset(...)");
                        return createFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface create = Typeface.create(str, i10);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        public final C5036a c() {
            return C5036a.f44318f;
        }

        private b() {
        }
    }

    public static final C5036a d() {
        return f44315c.c();
    }

    public final Typeface e(String fontFamilyName, int i10, int i11, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(i10, i11), assetManager);
    }

    public final Typeface f(String fontFamilyName, int i10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(i10, 0, 2, null), assetManager);
    }

    public final Typeface g(String fontFamilyName, c typefaceStyle, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(typefaceStyle, "typefaceStyle");
        if (this.f44320b.containsKey(fontFamilyName)) {
            return typefaceStyle.a((Typeface) this.f44320b.get(fontFamilyName));
        }
        Map map = this.f44319a;
        Object obj = map.get(fontFamilyName);
        if (obj == null) {
            obj = new C0636a();
            map.put(fontFamilyName, obj);
        }
        C0636a c0636a = (C0636a) obj;
        int b10 = typefaceStyle.b();
        Typeface a10 = c0636a.a(b10);
        if (a10 != null) {
            return a10;
        }
        Typeface b11 = f44315c.b(fontFamilyName, b10, assetManager);
        c0636a.b(b10, b11);
        return b11;
    }

    public final void h(String fontFamilyName, int i10, Typeface typeface) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map map = this.f44319a;
            Object obj = map.get(fontFamilyName);
            if (obj == null) {
                obj = new C0636a();
                map.put(fontFamilyName, obj);
            }
            ((C0636a) obj).b(i10, typeface);
        }
    }

    /* renamed from: w4.a$c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final C0637a f44322c = new C0637a(null);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44323a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44324b;

        /* renamed from: w4.a$c$a, reason: collision with other inner class name */
        public static final class C0637a {
            public /* synthetic */ C0637a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0637a() {
            }
        }

        public c(int i10, int i11) {
            i10 = i10 == -1 ? 0 : i10;
            this.f44323a = (i10 & 2) != 0;
            this.f44324b = i11 == -1 ? (i10 & 1) != 0 ? 700 : 400 : i11;
        }

        public final Typeface a(Typeface typeface) {
            Typeface create;
            if (Build.VERSION.SDK_INT < 28) {
                Typeface create2 = Typeface.create(typeface, b());
                Intrinsics.d(create2);
                return create2;
            }
            create = Typeface.create(typeface, this.f44324b, this.f44323a);
            Intrinsics.d(create);
            return create;
        }

        public final int b() {
            return this.f44324b < 700 ? this.f44323a ? 2 : 0 : this.f44323a ? 3 : 1;
        }

        public /* synthetic */ c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }
    }
}
