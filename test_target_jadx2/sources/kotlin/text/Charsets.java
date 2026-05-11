package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlin/text/Charsets;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "b", "UTF_16", "c", "UTF_16BE", "d", "UTF_16LE", "e", "US_ASCII", "f", "ISO_8859_1", "g", "utf_32le", "h", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", C4870a.f43493a, "UTF_32BE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public static final Charsets f36792a = new Charsets();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Charset UTF_16;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Charset UTF_16BE;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Charset UTF_16LE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Charset US_ASCII;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Charset ISO_8859_1;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static volatile Charset utf_32le;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static volatile Charset utf_32be;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        UTF_16 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(...)");
        US_ASCII = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(...)");
        ISO_8859_1 = forName6;
    }

    private Charsets() {
    }

    public final Charset a() {
        Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        utf_32be = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        utf_32le = forName;
        return forName;
    }
}
