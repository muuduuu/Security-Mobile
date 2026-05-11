package expo.modules.image.records;

import Ab.c;
import Ta.C;
import Ta.C1196a;
import Ta.D;
import Ta.m;
import Ta.v;
import Ta.w;
import Ta.z;
import android.content.Context;
import android.net.Uri;
import expo.modules.image.records.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.h;
import o2.i;
import o2.k;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u00100J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010.J^\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b9\u0010.J\u0010\u0010:\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b:\u00100J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010.R \u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010C\u0012\u0004\bE\u0010B\u001a\u0004\bD\u00100R \u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bG\u0010B\u001a\u0004\bF\u00100R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u00103R.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\bM\u0010B\u001a\u0004\bL\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bO\u0010B\u001a\u0004\bN\u0010.R\u0018\u0010P\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lexpo/modules/image/records/SourceMap;", "Lexpo/modules/image/records/b;", "LAb/c;", BuildConfig.FLAVOR, "uri", BuildConfig.FLAVOR, "width", "height", BuildConfig.FLAVOR, "scale", BuildConfig.FLAVOR, "headers", "cacheKey", "<init>", "(Ljava/lang/String;IIDLjava/util/Map;Ljava/lang/String;)V", BuildConfig.FLAVOR, "isDataUrl", "()Z", "isContentUrl", "isResourceUri", "isLocalResourceUri", "isLocalFileUri", "isBlurhash", "isThumbhash", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "parseUri", "(Landroid/content/Context;)V", "Lo2/i;", "getCustomHeaders", "()Lo2/i;", "Landroid/net/Uri;", "computeUri", "(Landroid/content/Context;)Landroid/net/Uri;", "stringUri", "computeLocalUri", "(Ljava/lang/String;Landroid/content/Context;)Landroid/net/Uri;", "usesPlaceholderContentFit", "LTa/m;", "createGlideModelProvider", "(Landroid/content/Context;)LTa/m;", "Lcom/bumptech/glide/request/h;", "createGlideOptions", "(Landroid/content/Context;)Lcom/bumptech/glide/request/h;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()D", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;IIDLjava/util/Map;Ljava/lang/String;)Lexpo/modules/image/records/SourceMap;", "toString", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getUri$annotations", "()V", "I", "getWidth", "getWidth$annotations", "getHeight", "getHeight$annotations", "D", "getScale", "getScale$annotations", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "getCacheKey", "getCacheKey$annotations", "parsedUri", "Landroid/net/Uri;", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SourceMap implements b, c {
    private final String cacheKey;
    private final Map<String, String> headers;
    private final int height;
    private Uri parsedUri;
    private final double scale;
    private final String uri;
    private final int width;

    public SourceMap() {
        this(null, 0, 0, 0.0d, null, null, 63, null);
    }

    private final Uri computeLocalUri(String stringUri, Context context) {
        return w.f9655a.b(context, stringUri);
    }

    private final Uri computeUri(Context context) {
        String str = this.uri;
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse.getScheme() == null ? computeLocalUri(str, context) : parse;
        } catch (Exception unused) {
            return computeLocalUri(str, context);
        }
    }

    public static /* synthetic */ SourceMap copy$default(SourceMap sourceMap, String str, int i10, int i11, double d10, Map map, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sourceMap.uri;
        }
        if ((i12 & 2) != 0) {
            i10 = sourceMap.width;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = sourceMap.height;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            d10 = sourceMap.scale;
        }
        double d11 = d10;
        if ((i12 & 16) != 0) {
            map = sourceMap.headers;
        }
        Map map2 = map;
        if ((i12 & 32) != 0) {
            str2 = sourceMap.cacheKey;
        }
        return sourceMap.copy(str, i13, i14, d11, map2, str2);
    }

    @Ab.b
    public static /* synthetic */ void getCacheKey$annotations() {
    }

    private final i getCustomHeaders() {
        if (this.headers == null) {
            i DEFAULT = i.f37846b;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        k.a aVar = new k.a();
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        k c10 = aVar.c();
        Intrinsics.checkNotNullExpressionValue(c10, "build(...)");
        return c10;
    }

    @Ab.b
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getScale$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getUri$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getWidth$annotations() {
    }

    private final boolean isBlurhash() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "blurhash", false, 2, null);
    }

    private final boolean isContentUrl() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "content", false, 2, null);
    }

    private final boolean isDataUrl() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "data", false, 2, null);
    }

    private final boolean isLocalFileUri() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "file", false, 2, null);
    }

    private final boolean isLocalResourceUri() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "res", false, 2, null);
    }

    private final boolean isResourceUri() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "android.resource", false, 2, null);
    }

    private final boolean isThumbhash() {
        String scheme;
        Uri uri = this.parsedUri;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.F(scheme, "thumbhash", false, 2, null);
    }

    private final void parseUri(Context context) {
        if (this.parsedUri == null) {
            this.parsedUri = computeUri(context);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    public final Map<String, String> component5() {
        return this.headers;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final SourceMap copy(String uri, int width, int height, double scale, Map<String, String> headers, String cacheKey) {
        return new SourceMap(uri, width, height, scale, headers, cacheKey);
    }

    @Override // expo.modules.image.records.b
    public m createGlideModelProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.uri;
        if (str == null || StringsKt.Z(str)) {
            return null;
        }
        parseUri(context);
        if (isContentUrl() || isDataUrl()) {
            return new v(this.uri);
        }
        if (isBlurhash()) {
            Uri uri = this.parsedUri;
            Intrinsics.d(uri);
            return new C1196a(uri, getWidth(), getHeight());
        }
        if (isThumbhash()) {
            Uri uri2 = this.parsedUri;
            Intrinsics.d(uri2);
            return new z(uri2);
        }
        if (isResourceUri()) {
            Uri uri3 = this.parsedUri;
            Intrinsics.d(uri3);
            return new C(uri3);
        }
        if (!isLocalResourceUri()) {
            if (!isLocalFileUri()) {
                return new D(this.cacheKey == null ? new h(this.uri, getCustomHeaders()) : new Za.a(this.uri, getCustomHeaders(), this.cacheKey));
            }
            Uri uri4 = this.parsedUri;
            Intrinsics.d(uri4);
            String uri5 = uri4.toString();
            Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
            return new v(uri5);
        }
        Uri uri6 = this.parsedUri;
        Intrinsics.d(uri6);
        String uri7 = uri6.toString();
        Intrinsics.checkNotNullExpressionValue(uri7, "toString(...)");
        Uri parse = Uri.parse(StringsKt.z(uri7, "res:/", "android.resource://" + context.getPackageName() + "/", false, 4, null));
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return new C(parse);
    }

    @Override // expo.modules.image.records.b
    public com.bumptech.glide.request.h createGlideOptions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        parseUri(context);
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if ((getWidth() == 0 || getHeight() == 0) ? false : true) {
            com.bumptech.glide.request.a Y10 = hVar.Y((int) (getWidth() * getScale()), (int) (getHeight() * getScale()));
            Intrinsics.checkNotNullExpressionValue(Y10, "override(...)");
            hVar = (com.bumptech.glide.request.h) Y10;
        }
        if (!isResourceUri()) {
            return hVar;
        }
        com.bumptech.glide.request.a a10 = hVar.a(com.bumptech.glide.request.h.p0(C2.a.c(context)));
        Intrinsics.checkNotNullExpressionValue(a10, "apply(...)");
        return (com.bumptech.glide.request.h) a10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceMap)) {
            return false;
        }
        SourceMap sourceMap = (SourceMap) other;
        return Intrinsics.b(this.uri, sourceMap.uri) && this.width == sourceMap.width && this.height == sourceMap.height && Double.compare(this.scale, sourceMap.scale) == 0 && Intrinsics.b(this.headers, sourceMap.headers) && Intrinsics.b(this.cacheKey, sourceMap.cacheKey);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // expo.modules.image.records.b
    public int getHeight() {
        return this.height;
    }

    @Override // expo.modules.image.records.b
    public double getPixelCount() {
        return b.a.a(this);
    }

    @Override // expo.modules.image.records.b
    public double getScale() {
        return this.scale;
    }

    public final String getUri() {
        return this.uri;
    }

    @Override // expo.modules.image.records.b
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Double.hashCode(this.scale)) * 31;
        Map<String, String> map = this.headers;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.cacheKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SourceMap(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", scale=" + this.scale + ", headers=" + this.headers + ", cacheKey=" + this.cacheKey + ")";
    }

    @Override // expo.modules.image.records.b
    public boolean usesPlaceholderContentFit() {
        return (isBlurhash() || isThumbhash()) ? false : true;
    }

    public SourceMap(String str, int i10, int i11, double d10, Map<String, String> map, String str2) {
        this.uri = str;
        this.width = i10;
        this.height = i11;
        this.scale = d10;
        this.headers = map;
        this.cacheKey = str2;
    }

    public /* synthetic */ SourceMap(String str, int i10, int i11, double d10, Map map, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) == 0 ? i11 : 0, (i12 & 8) != 0 ? 1.0d : d10, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? null : str2);
    }
}
