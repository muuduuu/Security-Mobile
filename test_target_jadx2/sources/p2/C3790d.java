package p2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import i2.h;
import j2.AbstractC3481b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o2.n;
import o2.o;
import o2.r;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3790d implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38304a;

    /* renamed from: b, reason: collision with root package name */
    private final n f38305b;

    /* renamed from: c, reason: collision with root package name */
    private final n f38306c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f38307d;

    /* renamed from: p2.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: p2.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: p2.d$d, reason: collision with other inner class name */
    private static final class C0590d implements com.bumptech.glide.load.data.d {

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f38310k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f38311a;

        /* renamed from: b, reason: collision with root package name */
        private final n f38312b;

        /* renamed from: c, reason: collision with root package name */
        private final n f38313c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f38314d;

        /* renamed from: e, reason: collision with root package name */
        private final int f38315e;

        /* renamed from: f, reason: collision with root package name */
        private final int f38316f;

        /* renamed from: g, reason: collision with root package name */
        private final h f38317g;

        /* renamed from: h, reason: collision with root package name */
        private final Class f38318h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f38319i;

        /* renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f38320j;

        C0590d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f38311a = context.getApplicationContext();
            this.f38312b = nVar;
            this.f38313c = nVar2;
            this.f38314d = uri;
            this.f38315e = i10;
            this.f38316f = i11;
            this.f38317g = hVar;
            this.f38318h = cls;
        }

        private n.a c() {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f38312b.b(h(this.f38314d), this.f38315e, this.f38316f, this.f38317g);
            }
            if (AbstractC3481b.a(this.f38314d)) {
                return this.f38313c.b(this.f38314d, this.f38315e, this.f38316f, this.f38317g);
            }
            return this.f38313c.b(g() ? MediaStore.setRequireOriginal(this.f38314d) : this.f38314d, this.f38315e, this.f38316f, this.f38317g);
        }

        private com.bumptech.glide.load.data.d d() {
            n.a c10 = c();
            if (c10 != null) {
                return c10.f37868c;
            }
            return null;
        }

        private boolean g() {
            return this.f38311a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f38311a.getContentResolver().query(uri, f38310k, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f38318h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f38320j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f38319i = true;
            com.bumptech.glide.load.data.d dVar = this.f38320j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d d10 = d();
                if (d10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f38314d));
                    return;
                }
                this.f38320j = d10;
                if (this.f38319i) {
                    cancel();
                } else {
                    d10.f(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    C3790d(Context context, n nVar, n nVar2, Class cls) {
        this.f38304a = context.getApplicationContext();
        this.f38305b = nVar;
        this.f38306c = nVar2;
        this.f38307d = cls;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new C2.c(uri), new C0590d(this.f38304a, this.f38305b, this.f38306c, uri, i10, i11, hVar, this.f38307d));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC3481b.c(uri);
    }

    /* renamed from: p2.d$a */
    private static abstract class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38308a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f38309b;

        a(Context context, Class cls) {
            this.f38308a = context;
            this.f38309b = cls;
        }

        @Override // o2.o
        public final n e(r rVar) {
            return new C3790d(this.f38308a, rVar.d(File.class, this.f38309b), rVar.d(Uri.class, this.f38309b), this.f38309b);
        }

        @Override // o2.o
        public final void d() {
        }
    }
}
