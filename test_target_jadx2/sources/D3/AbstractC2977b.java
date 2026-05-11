package d3;

import android.webkit.MimeTypeMap;
import b3.g;
import java.util.Map;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2977b {

    /* renamed from: a, reason: collision with root package name */
    private static final MimeTypeMap f31201a = MimeTypeMap.getSingleton();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f31202b = g.of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c, reason: collision with root package name */
    private static final Map f31203c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = (String) f31203c.get(str);
        return str2 != null ? str2 : f31201a.getMimeTypeFromExtension(str);
    }
}
