package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b extends ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f15850e = {"_display_name", "_size"};

    /* renamed from: f, reason: collision with root package name */
    private static final File f15851f = new File("/");

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f15852g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Object f15853a;

    /* renamed from: b, reason: collision with root package name */
    private String f15854b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0262b f15855c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15856d;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.b$b, reason: collision with other inner class name */
    interface InterfaceC0262b {
        File a(Uri uri);

        Uri b(File file);
    }

    static class c implements InterfaceC0262b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15857a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f15858b = new HashMap();

        c(String str) {
            this.f15857a = str;
        }

        private boolean d(String str, String str2) {
            String k10 = b.k(str);
            String k11 = b.k(str2);
            if (!k10.equals(k11)) {
                if (!k10.startsWith(k11 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.content.b.InterfaceC0262b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f15858b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.b.InterfaceC0262b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f15858b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f15857a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f15858b.put(str, file.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
            }
        }
    }

    public b() {
        this(0);
    }

    private static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] c(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] d(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i10) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i10 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i10);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private InterfaceC0262b f() {
        InterfaceC0262b interfaceC0262b;
        synchronized (this.f15853a) {
            try {
                y0.b.d(this.f15854b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f15855c == null) {
                    this.f15855c = g(getContext(), this.f15854b, this.f15856d);
                }
                interfaceC0262b = this.f15855c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0262b;
    }

    private static InterfaceC0262b g(Context context, String str, int i10) {
        InterfaceC0262b interfaceC0262b;
        HashMap hashMap = f15852g;
        synchronized (hashMap) {
            try {
                interfaceC0262b = (InterfaceC0262b) hashMap.get(str);
                if (interfaceC0262b == null) {
                    try {
                        try {
                            interfaceC0262b = j(context, str, i10);
                            hashMap.put(str, interfaceC0262b);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0262b;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).b(file);
    }

    private static int i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static InterfaceC0262b j(Context context, String str, int i10) {
        c cVar = new c(str);
        XmlResourceParser e10 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = e10.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = e10.getName();
                File file = null;
                String attributeValue = e10.getAttributeValue(null, "name");
                String attributeValue2 = e10.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f15851f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g10 = androidx.core.content.a.g(context, null);
                    if (g10.length > 0) {
                        file = g10[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f10 = androidx.core.content.a.f(context);
                    if (f10.length > 0) {
                        file = f10[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a10 = a.a(context);
                    if (a10.length > 0) {
                        file = a10[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f15853a) {
            this.f15854b = str;
        }
        HashMap hashMap = f15852g;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return f().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a10 = f().a(uri);
        int lastIndexOf = a10.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a10.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().a(uri), i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File a10 = f().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f15850e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? a10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] d10 = d(strArr3, i11);
        Object[] c10 = c(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(d10, 1);
        matrixCursor.addRow(c10);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected b(int i10) {
        this.f15853a = new Object();
        this.f15856d = i10;
    }
}
