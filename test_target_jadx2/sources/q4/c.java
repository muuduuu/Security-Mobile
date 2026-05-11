package q4;

import c3.AbstractC1721a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38754a = new c();

    private c() {
    }

    public static final int a(InputStream inputStream) {
        if (inputStream == null) {
            AbstractC1721a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new androidx.exifinterface.media.a(inputStream).i("Orientation", 1);
        } catch (IOException e10) {
            AbstractC1721a.g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            return 0;
        }
    }
}
