package com.ReactNativeBlobUtil;

import Td.E;
import Td.z;
import android.net.Uri;
import android.util.Base64;
import com.ReactNativeBlobUtil.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import pe.InterfaceC3878f;

/* loaded from: classes.dex */
class a extends E {

    /* renamed from: b, reason: collision with root package name */
    private ReadableArray f19821b;

    /* renamed from: c, reason: collision with root package name */
    private String f19822c;

    /* renamed from: d, reason: collision with root package name */
    private String f19823d;

    /* renamed from: e, reason: collision with root package name */
    private l.f f19824e;

    /* renamed from: f, reason: collision with root package name */
    private z f19825f;

    /* renamed from: g, reason: collision with root package name */
    private File f19826g;

    /* renamed from: a, reason: collision with root package name */
    private long f19820a = 0;

    /* renamed from: h, reason: collision with root package name */
    int f19827h = 0;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f19828i = Boolean.FALSE;

    /* renamed from: com.ReactNativeBlobUtil.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0358a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19829a;

        static {
            int[] iArr = new int[l.f.values().length];
            f19829a = iArr;
            try {
                iArr[l.f.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19829a[l.f.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19829a[l.f.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        public String f19830a;

        /* renamed from: b, reason: collision with root package name */
        String f19831b;

        /* renamed from: c, reason: collision with root package name */
        String f19832c;

        /* renamed from: d, reason: collision with root package name */
        public String f19833d;

        b(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f19830a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f19831b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.f19832c = readableMap.getString("type");
            } else {
                this.f19832c = this.f19831b == null ? "text/plain" : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.f19833d = readableMap.getString("data");
            }
        }
    }

    a(String str) {
        this.f19822c = str;
    }

    private ArrayList c() {
        int length;
        long j10;
        ArrayList arrayList = new ArrayList();
        ReactApplicationContext reactApplicationContext = e.f19857b;
        long j11 = 0;
        for (int i10 = 0; i10 < this.f19821b.size(); i10++) {
            b bVar = new b(this.f19821b.getMap(i10));
            arrayList.add(bVar);
            String str = bVar.f19833d;
            if (str == null) {
                n.a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + bVar.f19830a + "` will be removed implicitly.");
            } else {
                if (bVar.f19831b == null) {
                    length = str.getBytes().length;
                } else if (str.startsWith("ReactNativeBlobUtil-file://")) {
                    String f10 = n.f(str.substring(27));
                    if (n.d(f10)) {
                        try {
                            length = reactApplicationContext.getAssets().open(f10.replace("bundle-assets://", BuildConfig.FLAVOR)).available();
                        } catch (IOException e10) {
                            n.a(e10.getLocalizedMessage());
                        }
                    } else {
                        j10 = new File(n.f(f10)).length();
                        j11 += j10;
                    }
                } else if (str.startsWith("ReactNativeBlobUtil-content://")) {
                    String substring = str.substring(30);
                    InputStream inputStream = null;
                    try {
                        try {
                            inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                            j11 += inputStream.available();
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        n.a("Failed to estimate form data length from content URI:" + substring + ", " + e11.getLocalizedMessage());
                        if (inputStream == null) {
                        }
                    }
                    inputStream.close();
                } else {
                    length = Base64.decode(str, 0).length;
                }
                j10 = length;
                j11 += j10;
            }
        }
        this.f19820a = j11;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
    
        if (r10 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private File d() {
        String str = "ReactNativeBlobUtil-" + this.f19822c;
        File createTempFile = File.createTempFile("rnfb-form-tmp", BuildConfig.FLAVOR, e.f19857b.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        ArrayList c10 = c();
        ReactApplicationContext reactApplicationContext = e.f19857b;
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            String str2 = bVar.f19833d;
            String str3 = bVar.f19830a;
            if (str3 != null && str2 != null) {
                String str4 = "--" + str + "\r\n";
                Iterator it2 = it;
                if (bVar.f19831b != null) {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"" + bVar.f19831b + "\"\r\n") + "Content-Type: " + bVar.f19832c + "\r\n\r\n").getBytes());
                    if (str2.startsWith("ReactNativeBlobUtil-file://")) {
                        String f10 = n.f(str2.substring(27));
                        if (n.d(f10)) {
                            try {
                                h(reactApplicationContext.getAssets().open(f10.replace("bundle-assets://", BuildConfig.FLAVOR)), fileOutputStream);
                            } catch (IOException e10) {
                                n.a("Failed to create form data asset :" + f10 + ", " + e10.getLocalizedMessage());
                            }
                        } else {
                            File file = new File(n.f(f10));
                            if (file.exists()) {
                                h(new FileInputStream(file), fileOutputStream);
                            } else {
                                n.a("Failed to create form data from path :" + f10 + ", file not exists.");
                            }
                        }
                    } else if (str2.startsWith("ReactNativeBlobUtil-content://")) {
                        String substring = str2.substring(30);
                        InputStream inputStream = null;
                        try {
                            try {
                                inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                                h(inputStream, fileOutputStream);
                            } catch (Exception e11) {
                                n.a("Failed to create form data from content URI:" + substring + ", " + e11.getLocalizedMessage());
                            }
                        } finally {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    } else {
                        fileOutputStream.write(Base64.decode(str2, 0));
                    }
                } else {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"\r\n") + "Content-Type: " + bVar.f19832c + "\r\n\r\n").getBytes());
                    fileOutputStream.write(bVar.f19833d.getBytes());
                }
                fileOutputStream.write("\r\n".getBytes());
                it = it2;
            }
        }
        fileOutputStream.write(("--" + str + "--\r\n").getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
        return createTempFile;
    }

    private void e(long j10) {
        j m10 = l.m(this.f19822c);
        if (m10 != null) {
            long j11 = this.f19820a;
            if (j11 == 0 || !m10.a(j10 / j11)) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", this.f19822c);
            createMap.putString("written", String.valueOf(j10));
            createMap.putString("total", String.valueOf(this.f19820a));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f19857b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", createMap);
        }
    }

    private InputStream g() {
        if (!this.f19823d.startsWith("ReactNativeBlobUtil-file://")) {
            if (!this.f19823d.startsWith("ReactNativeBlobUtil-content://")) {
                try {
                    return new ByteArrayInputStream(Base64.decode(this.f19823d, 0));
                } catch (Exception e10) {
                    throw new Exception("error when getting request stream: " + e10.getLocalizedMessage());
                }
            }
            String substring = this.f19823d.substring(30);
            try {
                return e.f19857b.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e11) {
                throw new Exception("error when getting request stream for content URI: " + substring, e11);
            }
        }
        String f10 = n.f(this.f19823d.substring(27));
        if (n.d(f10)) {
            try {
                return e.f19857b.getAssets().open(f10.replace("bundle-assets://", BuildConfig.FLAVOR));
            } catch (Exception e12) {
                throw new Exception("error when getting request stream from asset : " + e12.getLocalizedMessage());
            }
        }
        File file = new File(n.f(f10));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return new FileInputStream(file);
        } catch (Exception e13) {
            throw new Exception("error when getting request stream: " + e13.getLocalizedMessage());
        }
    }

    private void h(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private void i(InputStream inputStream, InterfaceC3878f interfaceC3878f) {
        byte[] bArr = new byte[10240];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read <= 0) {
                inputStream.close();
                return;
            } else {
                interfaceC3878f.write(bArr, 0, read);
                j10 += read;
                e(j10);
            }
        }
    }

    a a(boolean z10) {
        this.f19828i = Boolean.valueOf(z10);
        return this;
    }

    boolean b() {
        try {
            File file = this.f19826g;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f19826g.delete();
            return true;
        } catch (Exception e10) {
            n.a(e10.getLocalizedMessage());
            return false;
        }
    }

    @Override // Td.E
    public long contentLength() {
        if (this.f19828i.booleanValue()) {
            return -1L;
        }
        return this.f19820a;
    }

    @Override // Td.E
    /* renamed from: contentType */
    public z getContentType() {
        return this.f19825f;
    }

    InputStream f() {
        try {
            if (this.f19821b != null) {
                return new FileInputStream(this.f19826g);
            }
            int i10 = C0358a.f19829a[this.f19824e.ordinal()];
            if (i10 == 1) {
                return g();
            }
            if (i10 == 2) {
                return new ByteArrayInputStream(this.f19823d.getBytes());
            }
            if (i10 != 3) {
                return null;
            }
            n.a("ReactNativeBlobUtil could not create input stream for request type others");
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            n.a("ReactNativeBlobUtil failed to create input stream for request:" + e10.getLocalizedMessage());
            return null;
        }
    }

    a j(ReadableArray readableArray) {
        this.f19821b = readableArray;
        try {
            File d10 = d();
            this.f19826g = d10;
            this.f19820a = d10.length();
        } catch (Exception e10) {
            e10.printStackTrace();
            n.a("ReactNativeBlobUtil failed to create request multipart body :" + e10.getLocalizedMessage());
        }
        return this;
    }

    a k(String str) {
        this.f19823d = str;
        if (str == null) {
            this.f19823d = BuildConfig.FLAVOR;
            this.f19824e = l.f.AsIs;
        }
        try {
            int i10 = C0358a.f19829a[this.f19824e.ordinal()];
            if (i10 == 1) {
                this.f19820a = g().available();
            } else if (i10 == 2) {
                this.f19820a = this.f19823d.getBytes().length;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            n.a("ReactNativeBlobUtil failed to create single content request body :" + e10.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    a l(z zVar) {
        this.f19825f = zVar;
        return this;
    }

    a m(l.f fVar) {
        this.f19824e = fVar;
        return this;
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f interfaceC3878f) {
        try {
            i(f(), interfaceC3878f);
        } catch (Exception e10) {
            n.a(e10.getLocalizedMessage());
            e10.printStackTrace();
        }
    }
}
