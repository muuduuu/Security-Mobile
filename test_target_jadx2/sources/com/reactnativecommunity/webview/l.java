package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class l implements ActivityEventListener {

    /* renamed from: g, reason: collision with root package name */
    protected static final d f29364g = new d();

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f29365a;

    /* renamed from: b, reason: collision with root package name */
    private DownloadManager.Request f29366b;

    /* renamed from: c, reason: collision with root package name */
    private ValueCallback f29367c;

    /* renamed from: d, reason: collision with root package name */
    private ValueCallback f29368d;

    /* renamed from: e, reason: collision with root package name */
    private File f29369e;

    /* renamed from: f, reason: collision with root package name */
    private File f29370f;

    class a implements O4.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29372b;

        a(String str, String str2) {
            this.f29371a = str;
            this.f29372b = str2;
        }

        @Override // O4.h
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(l.this.f29365a, this.f29372b, 1).show();
            } else if (l.this.f29366b != null) {
                l.this.h(this.f29371a);
            }
            return true;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29374a;

        static {
            int[] iArr = new int[c.values().length];
            f29374a = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29374a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");

        private final String value;

        c(String str) {
            this.value = str;
        }
    }

    protected static class d {

        /* renamed from: a, reason: collision with root package name */
        private double f29375a = 1.0d;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f29376b = new HashMap();

        protected enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference a(Double d10) {
            return (AtomicReference) this.f29376b.get(d10);
        }

        public synchronized y0.c b() {
            double d10;
            AtomicReference atomicReference;
            d10 = this.f29375a;
            this.f29375a = 1.0d + d10;
            atomicReference = new AtomicReference(a.UNDECIDED);
            this.f29376b.put(Double.valueOf(d10), atomicReference);
            return new y0.c(Double.valueOf(d10), atomicReference);
        }

        public synchronized void c(Double d10) {
            this.f29376b.remove(d10);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f29365a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean c(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", BuildConfig.FLAVOR));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.value));
    }

    private Boolean d(String[] strArr) {
        String[] i10 = i(strArr);
        return Boolean.valueOf(g(i10, c.DEFAULT.value).booleanValue() || g(i10, c.IMAGE.value).booleanValue());
    }

    private Boolean e(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", BuildConfig.FLAVOR));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.value));
    }

    private Boolean f(String[] strArr) {
        String[] i10 = i(strArr);
        return Boolean.valueOf(g(i10, c.DEFAULT.value).booleanValue() || g(i10, c.VIDEO.value).booleanValue());
    }

    private Boolean g(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.value};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                String m10 = m(str.replace(".", BuildConfig.FLAVOR));
                if (m10 != null) {
                    strArr2[i10] = m10;
                } else {
                    strArr2[i10] = str;
                }
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    private Intent k(String str) {
        String str2 = str.isEmpty() ? c.DEFAULT.value : str;
        if (str.matches("\\.\\w+")) {
            str2 = m(str.replace(".", BuildConfig.FLAVOR));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent l(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.value);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    private String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private O4.g o() {
        ComponentCallbacks2 currentActivity = this.f29365a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof O4.g) {
            return (O4.g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private O4.h s(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean w(String[] strArr) {
        String str;
        boolean z10 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public boolean A(String[] strArr, boolean z10, ValueCallback valueCallback, boolean z11) {
        Intent r10;
        this.f29368d = valueCallback;
        Activity currentActivity = this.f29365a.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intent = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intent = p()) != null) {
                arrayList.add(intent);
            }
            if (f(strArr).booleanValue() && (r10 = r()) != null) {
                arrayList.add(r10);
            }
        }
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        if (!z11) {
            intent2.putExtra("android.intent.extra.INTENT", l(strArr, z10));
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intent = intent2;
        }
        if (intent == null) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Camera permission");
        } else if (intent.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intent, 1);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
        return true;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f29365a.getSystemService("download")).enqueue(this.f29366b);
            Toast.makeText(this.f29365a, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e10) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "Unsupported URI, aborting download", e10);
        }
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i10 = b.f29374a[cVar.ordinal()];
        if (i10 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i10 != 2) {
            str = BuildConfig.FLAVOR;
            str2 = BuildConfig.FLAVOR;
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, this.f29365a.getExternalFilesDir(null));
    }

    public Uri n(File file) {
        String packageName = this.f29365a.getPackageName();
        return androidx.core.content.b.h(this.f29365a, packageName + ".fileprovider", file);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (this.f29368d == null && this.f29367c == null) {
            return;
        }
        File file = this.f29369e;
        boolean z10 = false;
        boolean z11 = file != null && file.length() > 0;
        File file2 = this.f29370f;
        if (file2 != null && file2.length() > 0) {
            z10 = true;
        }
        if (i10 != 1) {
            if (i10 == 3) {
                if (i11 != -1) {
                    this.f29367c.onReceiveValue(null);
                } else if (z11) {
                    this.f29367c.onReceiveValue(n(this.f29369e));
                } else if (z10) {
                    this.f29367c.onReceiveValue(n(this.f29370f));
                } else {
                    this.f29367c.onReceiveValue(intent.getData());
                }
            }
        } else if (i11 != -1) {
            ValueCallback valueCallback = this.f29368d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z11) {
            this.f29368d.onReceiveValue(new Uri[]{n(this.f29369e)});
        } else if (z10) {
            this.f29368d.onReceiveValue(new Uri[]{n(this.f29370f)});
        } else {
            this.f29368d.onReceiveValue(q(intent, i11));
        }
        File file3 = this.f29369e;
        if (file3 != null && !z11) {
            file3.delete();
        }
        File file4 = this.f29370f;
        if (file4 != null && !z10) {
            file4.delete();
        }
        this.f29368d = null;
        this.f29367c = null;
        this.f29369e = null;
        this.f29370f = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e10;
        Uri n10;
        try {
            File j10 = j(c.IMAGE);
            this.f29369e = j10;
            n10 = n(j10);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e11) {
            intent = null;
            e10 = e11;
        }
        try {
            intent.putExtra("output", n10);
        } catch (IOException e12) {
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
        return intent;
    }

    public Uri[] q(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i10 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i11 = 0; i11 < itemCount; i11++) {
            uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
        }
        return uriArr;
    }

    public Intent r() {
        Intent intent;
        Throwable e10;
        Uri n10;
        try {
            File j10 = j(c.VIDEO);
            this.f29370f = j10;
            n10 = n(j10);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e11) {
            intent = null;
            e10 = e11;
        }
        try {
            intent.putExtra("output", n10);
        } catch (IOException e12) {
            e10 = e12;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            Log.e("CREATE FILE", "Error occurred while creating the File", e10);
            e10.printStackTrace();
            return intent;
        }
        return intent;
    }

    public boolean t(String str, String str2) {
        Activity currentActivity = this.f29365a.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z10 = androidx.core.content.a.a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z10) {
            o().c(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z10;
    }

    public boolean u() {
        return true;
    }

    protected boolean v() {
        Activity currentActivity = this.f29365a.getCurrentActivity();
        try {
            if (Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (androidx.core.content.a.a(currentActivity, "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public void x(DownloadManager.Request request) {
        this.f29366b = request;
    }

    public void y(boolean z10, double d10) {
        AtomicReference a10 = f29364g.a(Double.valueOf(d10));
        if (a10 != null) {
            synchronized (a10) {
                try {
                    a10.set(z10 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                    a10.notify();
                } finally {
                }
            }
        }
    }

    public void z(String str, ValueCallback valueCallback) {
        Intent r10;
        Intent p10;
        this.f29367c = valueCallback;
        Activity currentActivity = this.f29365a.getCurrentActivity();
        Intent createChooser = Intent.createChooser(k(str), BuildConfig.FLAVOR);
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (p10 = p()) != null) {
            arrayList.add(p10);
        }
        if (e(str).booleanValue() && (r10 = r()) != null) {
            arrayList.add(r10);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(createChooser, 3);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
    }
}
