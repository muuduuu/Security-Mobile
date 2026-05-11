package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l2.InterfaceC3600b;
import r2.C;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0361a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f20299a;

        C0361a(InputStream inputStream) {
            this.f20299a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f20299a);
            } finally {
                this.f20299a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f20300a;

        b(ByteBuffer byteBuffer) {
            this.f20300a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f20300a);
            } finally {
                D2.a.d(this.f20300a);
            }
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f20301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3600b f20302b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC3600b interfaceC3600b) {
            this.f20301a = parcelFileDescriptorRewinder;
            this.f20302b = interfaceC3600b;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f20301a.a().getFileDescriptor()), this.f20302b);
                try {
                    ImageHeaderParser.ImageType c12 = imageHeaderParser.c(c11);
                    c11.c();
                    this.f20301a.a();
                    return c12;
                } catch (Throwable th) {
                    th = th;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f20301a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f20303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3600b f20304b;

        d(ByteBuffer byteBuffer, InterfaceC3600b interfaceC3600b) {
            this.f20303a = byteBuffer;
            this.f20304b = interfaceC3600b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f20303a, this.f20304b);
            } finally {
                D2.a.d(this.f20303a);
            }
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f20305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3600b f20306b;

        e(InputStream inputStream, InterfaceC3600b interfaceC3600b) {
            this.f20305a = inputStream;
            this.f20306b = interfaceC3600b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f20305a, this.f20306b);
            } finally {
                this.f20305a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f20307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3600b f20308b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC3600b interfaceC3600b) {
            this.f20307a = parcelFileDescriptorRewinder;
            this.f20308b = interfaceC3600b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f20307a.a().getFileDescriptor()), this.f20308b);
                try {
                    int d10 = imageHeaderParser.d(c11, this.f20308b);
                    c11.c();
                    this.f20307a.a();
                    return d10;
                } catch (Throwable th) {
                    th = th;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f20307a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC3600b interfaceC3600b) {
        return d(list, new f(parcelFileDescriptorRewinder, interfaceC3600b));
    }

    public static int b(List list, InputStream inputStream, InterfaceC3600b interfaceC3600b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, interfaceC3600b);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, interfaceC3600b));
    }

    public static int c(List list, ByteBuffer byteBuffer, InterfaceC3600b interfaceC3600b) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, interfaceC3600b));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = gVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC3600b interfaceC3600b) {
        return h(list, new c(parcelFileDescriptorRewinder, interfaceC3600b));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, InterfaceC3600b interfaceC3600b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, interfaceC3600b);
        }
        inputStream.mark(5242880);
        return h(list, new C0361a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = hVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
