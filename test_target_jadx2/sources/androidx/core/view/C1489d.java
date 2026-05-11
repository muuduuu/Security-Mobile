package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489d {

    /* renamed from: a, reason: collision with root package name */
    private final f f16111a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f16112a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f16112a = new b(clipData, i10);
            } else {
                this.f16112a = new C0275d(clipData, i10);
            }
        }

        public C1489d a() {
            return this.f16112a.c();
        }

        public a b(Bundle bundle) {
            this.f16112a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f16112a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f16112a.a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f16113a;

        b(ClipData clipData, int i10) {
            this.f16113a = AbstractC1495g.a(clipData, i10);
        }

        @Override // androidx.core.view.C1489d.c
        public void a(Uri uri) {
            this.f16113a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1489d.c
        public void b(int i10) {
            this.f16113a.setFlags(i10);
        }

        @Override // androidx.core.view.C1489d.c
        public C1489d c() {
            ContentInfo build;
            build = this.f16113a.build();
            return new C1489d(new e(build));
        }

        @Override // androidx.core.view.C1489d.c
        public void setExtras(Bundle bundle) {
            this.f16113a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C1489d c();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0275d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f16114a;

        /* renamed from: b, reason: collision with root package name */
        int f16115b;

        /* renamed from: c, reason: collision with root package name */
        int f16116c;

        /* renamed from: d, reason: collision with root package name */
        Uri f16117d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f16118e;

        C0275d(ClipData clipData, int i10) {
            this.f16114a = clipData;
            this.f16115b = i10;
        }

        @Override // androidx.core.view.C1489d.c
        public void a(Uri uri) {
            this.f16117d = uri;
        }

        @Override // androidx.core.view.C1489d.c
        public void b(int i10) {
            this.f16116c = i10;
        }

        @Override // androidx.core.view.C1489d.c
        public C1489d c() {
            return new C1489d(new g(this));
        }

        @Override // androidx.core.view.C1489d.c
        public void setExtras(Bundle bundle) {
            this.f16118e = bundle;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f16119a;

        e(ContentInfo contentInfo) {
            this.f16119a = AbstractC1487c.a(y0.f.g(contentInfo));
        }

        @Override // androidx.core.view.C1489d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f16119a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C1489d.f
        public int b() {
            int flags;
            flags = this.f16119a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.C1489d.f
        public ContentInfo c() {
            return this.f16119a;
        }

        @Override // androidx.core.view.C1489d.f
        public int j() {
            int source;
            source = this.f16119a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f16119a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int j();
    }

    /* renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f16120a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16121b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16122c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f16123d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f16124e;

        g(C0275d c0275d) {
            this.f16120a = (ClipData) y0.f.g(c0275d.f16114a);
            this.f16121b = y0.f.c(c0275d.f16115b, 0, 5, "source");
            this.f16122c = y0.f.f(c0275d.f16116c, 1);
            this.f16123d = c0275d.f16117d;
            this.f16124e = c0275d.f16118e;
        }

        @Override // androidx.core.view.C1489d.f
        public ClipData a() {
            return this.f16120a;
        }

        @Override // androidx.core.view.C1489d.f
        public int b() {
            return this.f16122c;
        }

        @Override // androidx.core.view.C1489d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C1489d.f
        public int j() {
            return this.f16121b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f16120a.getDescription());
            sb2.append(", source=");
            sb2.append(C1489d.e(this.f16121b));
            sb2.append(", flags=");
            sb2.append(C1489d.a(this.f16122c));
            Uri uri = this.f16123d;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + this.f16123d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f16124e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1489d(f fVar) {
        this.f16111a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C1489d g(ContentInfo contentInfo) {
        return new C1489d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f16111a.a();
    }

    public int c() {
        return this.f16111a.b();
    }

    public int d() {
        return this.f16111a.j();
    }

    public ContentInfo f() {
        ContentInfo c10 = this.f16111a.c();
        Objects.requireNonNull(c10);
        return AbstractC1487c.a(c10);
    }

    public String toString() {
        return this.f16111a.toString();
    }
}
