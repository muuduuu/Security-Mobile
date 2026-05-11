package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z10) {
            this.hasAlpha = z10;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i10 = a.f20298a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20298a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f20298a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20298a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20298a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, InterfaceC3600b interfaceC3600b);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, InterfaceC3600b interfaceC3600b);
}
