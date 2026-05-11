package o2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import j2.AbstractC3481b;
import java.io.File;
import java.io.FileNotFoundException;
import o2.n;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37855a;

    public l(Context context) {
        this.f37855a = context;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new C2.c(uri), new b(this.f37855a, uri));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC3481b.c(uri);
    }

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37856a;

        public a(Context context) {
            this.f37856a = context;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new l(this.f37856a);
        }

        @Override // o2.o
        public void d() {
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f37857c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f37858a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f37859b;

        b(Context context, Uri uri) {
            this.f37858a = context;
            this.f37859b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            Cursor query = this.f37858a.getContentResolver().query(this.f37859b, f37857c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.d(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f37859b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
