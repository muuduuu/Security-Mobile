package expo.modules.clipboard;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.xmlpull.v1.XmlPullParserException;
import u5.C4870a;
import xc.C5141B;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0003(,/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", BuildConfig.FLAVOR, "onCreate", "()Z", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", "info", BuildConfig.FLAVOR, "attachInfo", "(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V", "Landroid/net/Uri;", "uri", BuildConfig.FLAVOR, "getType", "(Landroid/net/Uri;)Ljava/lang/String;", BuildConfig.FLAVOR, "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", BuildConfig.FLAVOR, "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "mode", "Landroid/os/ParcelFileDescriptor;", "openFile", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;", C4870a.f43493a, "[Ljava/lang/String;", "defaultProjectionColumns", "Lexpo/modules/clipboard/ClipboardFileProvider$b;", "b", "Lexpo/modules/clipboard/ClipboardFileProvider$b;", "strategy", "c", "expo-clipboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClipboardFileProvider extends ContentProvider {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final File f32590d = new File("/");

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f32591e = new HashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] defaultProjectionColumns = {"_display_name", "_size"};

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b strategy;

    /* renamed from: expo.modules.clipboard.ClipboardFileProvider$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File a(File file, String... strArr) {
            for (String str : strArr) {
                if (str != null) {
                    file = new File(file, str);
                }
            }
            return file;
        }

        private final b d(Context context, String str) {
            c cVar = new c(str);
            PackageManager packageManager = context.getPackageManager();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 128);
            if (resolveContentProvider == null) {
                throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
            }
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(packageManager, "expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next == 1) {
                    return cVar;
                }
                if (next == 2) {
                    String name = loadXmlMetaData.getName();
                    Intrinsics.d(name);
                    File e10 = e(name, context);
                    if (e10 != null) {
                        cVar.c(loadXmlMetaData.getAttributeValue(null, "name"), ClipboardFileProvider.INSTANCE.a(e10, loadXmlMetaData.getAttributeValue(null, "path")));
                    }
                }
            }
        }

        private final File e(String str, Context context) {
            switch (str.hashCode()) {
                case -1642807877:
                    if (str.equals("files-path")) {
                        return context.getFilesDir();
                    }
                    return null;
                case -1360690478:
                    if (!str.equals("external-cache-path")) {
                        return null;
                    }
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    Intrinsics.checkNotNullExpressionValue(externalCacheDirs, "getExternalCacheDirs(...)");
                    if (externalCacheDirs.length == 0) {
                        externalCacheDirs = null;
                    }
                    if (externalCacheDirs != null) {
                        return externalCacheDirs[0];
                    }
                    return null;
                case -913292752:
                    if (str.equals("root-path")) {
                        return ClipboardFileProvider.f32590d;
                    }
                    return null;
                case -50149145:
                    if (str.equals("external-path")) {
                        return Environment.getExternalStorageDirectory();
                    }
                    return null;
                case -17221744:
                    if (str.equals("cache-path")) {
                        return context.getCacheDir();
                    }
                    return null;
                case 1308690685:
                    if (!str.equals("external-files-path")) {
                        return null;
                    }
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    Intrinsics.checkNotNullExpressionValue(externalFilesDirs, "getExternalFilesDirs(...)");
                    if (externalFilesDirs.length == 0) {
                        externalFilesDirs = null;
                    }
                    if (externalFilesDirs != null) {
                        return externalFilesDirs[0];
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final b b(Context context, String authority) {
            b bVar;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(authority, "authority");
            C5141B c5141b = new C5141B();
            synchronized (ClipboardFileProvider.f32591e) {
                try {
                    bVar = (b) ClipboardFileProvider.f32591e.get(authority);
                    if (bVar == null) {
                        try {
                            c5141b.f44962a = ClipboardFileProvider.INSTANCE.d(context, authority);
                            ClipboardFileProvider.f32591e.put(authority, c5141b.f44962a);
                            bVar = (b) c5141b.f44962a;
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e10);
                        } catch (XmlPullParserException e11) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    }
                    c5141b.f44962a = bVar;
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }

        public final Uri c(Context context, String authority, File file) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(authority, "authority");
            Intrinsics.checkNotNullParameter(file, "file");
            return b(context, authority).b(file);
        }

        private Companion() {
        }
    }

    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f32594a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f32595b;

        public c(String authority) {
            Intrinsics.checkNotNullParameter(authority, "authority");
            this.f32594a = authority;
            this.f32595b = new HashMap();
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.b
        public File a(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String encodedPath = uri.getEncodedPath();
            Intrinsics.d(encodedPath);
            int W10 = StringsKt.W(encodedPath, '/', 1, false, 4, null);
            String substring = encodedPath.substring(1, W10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String decode = Uri.decode(substring);
            String substring2 = encodedPath.substring(W10 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String decode2 = Uri.decode(substring2);
            Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
            File file = (File) this.f32595b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                Intrinsics.d(canonicalFile);
                if (j.x(canonicalFile, file)) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.b
        public Uri b(File file) {
            String substring;
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                String canonicalPath = file.getCanonicalPath();
                Intrinsics.d(canonicalPath);
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f32595b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    Intrinsics.d(path);
                    if (StringsKt.F(canonicalPath, path, false, 2, null) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(("Failed to find configured root that contains " + ((Object) canonicalPath)).toString());
                }
                String path2 = ((File) entry.getValue()).getPath();
                Intrinsics.d(path2);
                if (StringsKt.q(path2, "/", false, 2, null)) {
                    substring = canonicalPath.substring(path2.length());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                }
                return new Uri.Builder().scheme("content").authority(this.f32594a).encodedPath(Uri.encode((String) entry.getKey()) + "/" + Uri.encode(substring, "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public final void c(String str, File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            if (str == null || TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                File canonicalFile = root.getCanonicalFile();
                HashMap hashMap = this.f32595b;
                Intrinsics.d(canonicalFile);
                hashMap.put(str, canonicalFile);
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e10);
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        super.attachInfo(context, info);
        if (!info.exported) {
            throw new AssertionError("ClipboardFileProvider must be exported");
        }
        Companion companion = INSTANCE;
        String authority = info.authority;
        Intrinsics.checkNotNullExpressionValue(authority, "authority");
        this.strategy = companion.b(context, authority);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        b bVar = this.strategy;
        if (bVar == null) {
            Intrinsics.v("strategy");
            bVar = null;
        }
        File a10 = bVar.a(uri);
        String name = a10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        int c02 = StringsKt.c0(name, '.', 0, false, 6, null);
        if (c02 < 0) {
            return "application/octet-stream";
        }
        String name2 = a10.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String substring = name2.substring(c02 + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (!Intrinsics.b("r", mode)) {
            throw new IllegalArgumentException("mode must be \"r\"");
        }
        b bVar = this.strategy;
        if (bVar == null) {
            Intrinsics.v("strategy");
            bVar = null;
        }
        return ParcelFileDescriptor.open(bVar.a(uri), 268435456);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int i10;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (projection == null) {
            projection = this.defaultProjectionColumns;
        }
        b bVar = this.strategy;
        if (bVar == null) {
            Intrinsics.v("strategy");
            bVar = null;
        }
        File a10 = bVar.a(uri);
        String[] strArr = new String[projection.length];
        Object[] objArr = new Object[projection.length];
        int i11 = 0;
        for (String str : projection) {
            if (Intrinsics.b(str, "_display_name")) {
                strArr[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = a10.getName();
            } else if (Intrinsics.b(str, "_size")) {
                strArr[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        Object[] copyOf = Arrays.copyOf(strArr, i11);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        Object[] copyOf2 = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        MatrixCursor matrixCursor = new MatrixCursor((String[]) copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }
}
