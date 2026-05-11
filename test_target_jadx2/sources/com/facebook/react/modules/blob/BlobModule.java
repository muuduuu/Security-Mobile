package com.facebook.react.modules.blob;

import Td.E;
import Td.G;
import Td.z;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.conscrypt.BuildConfig;
import pe.C3880h;
import v4.AbstractC4929e;

@K4.a(name = NativeBlobModuleSpec.NAME)
/* loaded from: classes.dex */
public class BlobModule extends NativeBlobModuleSpec {
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.f mNetworkingRequestBodyHandler;
    private final NetworkingModule.g mNetworkingResponseHandler;
    private final NetworkingModule.h mNetworkingUriHandler;
    private final WebSocketModule.b mWebSocketContentHandler;

    class a implements WebSocketModule.b {
        a() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void a(C3880h c3880h, WritableMap writableMap) {
            byte[] Q10 = c3880h.Q();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(Q10));
            createMap.putInt("offset", 0);
            createMap.putInt("size", Q10.length);
            writableMap.putMap("data", createMap);
            writableMap.putString("type", "blob");
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void b(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }
    }

    class b implements NetworkingModule.h {
        b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public WritableMap a(Uri uri) {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytesFromUri.length);
            createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public boolean b(Uri uri, String str) {
            String scheme = uri.getScheme();
            return ("http".equals(scheme) || "https".equals(scheme) || !"blob".equals(str)) ? false : true;
        }
    }

    class c implements NetworkingModule.f {
        c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public boolean a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public E b(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return E.create(z.g(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
        }
    }

    class d implements NetworkingModule.g {
        d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public WritableMap a(G g10) {
            byte[] b10 = g10.b();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(b10));
            createMap.putInt("offset", 0);
            createMap.putInt("size", b10.length);
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public boolean b(String str) {
            return "blob".equals(str);
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new a();
        this.mNetworkingUriHandler = new b();
        this.mNetworkingRequestBodyHandler = new c();
        this.mNetworkingResponseHandler = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            throw new FileNotFoundException("File not found for " + uri);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = openInputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? BuildConfig.FLAVOR : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, this.mWebSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i10 = 0;
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            String string = map.getString("type");
            string.hashCode();
            if (string.equals("string")) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                i10 += bytes.length;
                arrayList.add(i11, bytes);
            } else {
                if (!string.equals("blob")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                ReadableMap map2 = map.getMap("data");
                i10 += map2.getInt("size");
                arrayList.add(i11, resolve(map2));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    public long getLengthOfBlob(String str) {
        long length;
        synchronized (this.mBlobs) {
            try {
                length = this.mBlobs.get(str) != null ? r4.length : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? AbstractC4929e.c() : AbstractC4929e.e("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        BlobCollector.b(getReactApplicationContext(), this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, null);
        }
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap readableMap, double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
            if (resolve != null) {
                webSocketModule.sendBinary(C3880h.E(resolve), i10);
            } else {
                webSocketModule.sendBinary((C3880h) null, i10);
            }
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    public byte[] resolve(String str, int i10, int i11) {
        synchronized (this.mBlobs) {
            try {
                byte[] bArr = this.mBlobs.get(str);
                if (bArr == null) {
                    return null;
                }
                if (i11 == -1) {
                    i11 = bArr.length - i10;
                }
                if (i10 > 0 || i11 != bArr.length) {
                    bArr = Arrays.copyOfRange(bArr, i10, i11 + i10);
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }
}
