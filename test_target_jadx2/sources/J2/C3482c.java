package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import i2.EnumC3313a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3482c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f35738a;

    /* renamed from: b, reason: collision with root package name */
    private final C3484e f35739b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f35740c;

    /* renamed from: j2.c$a */
    static class a implements InterfaceC3483d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f35741b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f35742a;

        a(ContentResolver contentResolver) {
            this.f35742a = contentResolver;
        }

        @Override // j2.InterfaceC3483d
        public Cursor a(Uri uri) {
            return this.f35742a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f35741b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: j2.c$b */
    static class b implements InterfaceC3483d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f35743b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f35744a;

        b(ContentResolver contentResolver) {
            this.f35744a = contentResolver;
        }

        @Override // j2.InterfaceC3483d
        public Cursor a(Uri uri) {
            return this.f35744a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f35743b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C3482c(Uri uri, C3484e c3484e) {
        this.f35738a = uri;
        this.f35739b = c3484e;
    }

    private static C3482c c(Context context, Uri uri, InterfaceC3483d interfaceC3483d) {
        return new C3482c(uri, new C3484e(com.bumptech.glide.c.d(context).k().g(), interfaceC3483d, com.bumptech.glide.c.d(context).f(), context.getContentResolver()));
    }

    public static C3482c d(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static C3482c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d10 = this.f35739b.d(this.f35738a);
        int a10 = d10 != null ? this.f35739b.a(this.f35738a) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f35740c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h hVar, d.a aVar) {
        try {
            InputStream h10 = h();
            this.f35740c = h10;
            aVar.d(h10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
