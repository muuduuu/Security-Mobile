package S3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8721a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f8722b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f8723c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f8724d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f8725e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f8726f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f8727g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f8728h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f8729i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f8730j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f8731k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f8732l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f8733m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f8734n;

    static {
        c cVar = new c("JPEG", "jpeg");
        f8722b = cVar;
        c cVar2 = new c("PNG", "png");
        f8723c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f8724d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f8725e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f8726f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f8727g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f8728h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f8729i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f8730j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f8731k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f8732l = cVar11;
        f8733m = new c("DNG", "dng");
        f8734n = CollectionsKt.m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == f8727g || imageFormat == f8728h || imageFormat == f8729i || imageFormat == f8730j;
    }

    public static final boolean b(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f8731k;
    }
}
