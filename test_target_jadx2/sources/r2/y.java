package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
interface y {

    public static final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f39200a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3600b f39201b;

        /* renamed from: c, reason: collision with root package name */
        private final List f39202c;

        b(InputStream inputStream, List list, InterfaceC3600b interfaceC3600b) {
            this.f39201b = (InterfaceC3600b) D2.k.d(interfaceC3600b);
            this.f39202c = (List) D2.k.d(list);
            this.f39200a = new com.bumptech.glide.load.data.k(inputStream, interfaceC3600b);
        }

        @Override // r2.y
        public int a() {
            return com.bumptech.glide.load.a.b(this.f39202c, this.f39200a.a(), this.f39201b);
        }

        @Override // r2.y
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f39200a.a(), null, options);
        }

        @Override // r2.y
        public void c() {
            this.f39200a.c();
        }

        @Override // r2.y
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f39202c, this.f39200a.a(), this.f39201b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();

    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f39197a;

        /* renamed from: b, reason: collision with root package name */
        private final List f39198b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3600b f39199c;

        a(ByteBuffer byteBuffer, List list, InterfaceC3600b interfaceC3600b) {
            this.f39197a = byteBuffer;
            this.f39198b = list;
            this.f39199c = interfaceC3600b;
        }

        private InputStream e() {
            return D2.a.g(D2.a.d(this.f39197a));
        }

        @Override // r2.y
        public int a() {
            return com.bumptech.glide.load.a.c(this.f39198b, D2.a.d(this.f39197a), this.f39199c);
        }

        @Override // r2.y
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // r2.y
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f39198b, D2.a.d(this.f39197a));
        }

        @Override // r2.y
        public void c() {
        }
    }

    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3600b f39203a;

        /* renamed from: b, reason: collision with root package name */
        private final List f39204b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f39205c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC3600b interfaceC3600b) {
            this.f39203a = (InterfaceC3600b) D2.k.d(interfaceC3600b);
            this.f39204b = (List) D2.k.d(list);
            this.f39205c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // r2.y
        public int a() {
            return com.bumptech.glide.load.a.a(this.f39204b, this.f39205c, this.f39203a);
        }

        @Override // r2.y
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f39205c.a().getFileDescriptor(), null, options);
        }

        @Override // r2.y
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f39204b, this.f39205c, this.f39203a);
        }

        @Override // r2.y
        public void c() {
        }
    }
}
