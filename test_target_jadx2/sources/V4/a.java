package V4;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import c3.AbstractC1721a;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f10817e = V4.b.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    private int f10818a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f10819b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Map f10820c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f10821d;

    /* renamed from: V4.a$a, reason: collision with other inner class name */
    class C0201a extends g {
        C0201a() {
        }

        @Override // V4.f
        public void a(Object obj, h hVar) {
            JSONObject jSONObject;
            synchronized (a.this.f10820c) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e10) {
                        hVar.b(e10.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                    String optString = jSONObject.optString("mode");
                    if (optString == null) {
                        throw new Exception("missing params.mode");
                    }
                    String optString2 = jSONObject.optString("filename");
                    if (optString2 == null) {
                        throw new Exception("missing params.filename");
                    }
                    if (!optString.equals("r")) {
                        throw new IllegalArgumentException("unsupported mode: " + optString);
                    }
                    hVar.a(Integer.valueOf(a.this.c(optString2)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b extends g {
        b() {
        }

        @Override // V4.f
        public void a(Object obj, h hVar) {
            synchronized (a.this.f10820c) {
                try {
                    try {
                    } catch (Exception e10) {
                        hVar.b(e10.toString());
                    }
                    if (!(obj instanceof Number)) {
                        throw new Exception("params must be a file handle");
                    }
                    d dVar = (d) a.this.f10820c.get(obj);
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    a.this.f10820c.remove(obj);
                    dVar.a();
                    hVar.a(BuildConfig.FLAVOR);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class c extends g {
        c() {
        }

        @Override // V4.f
        public void a(Object obj, h hVar) {
            JSONObject jSONObject;
            synchronized (a.this.f10820c) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e10) {
                        hVar.b(e10.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                    int optInt = jSONObject.optInt("file");
                    if (optInt == 0) {
                        throw new Exception("invalid or missing file handle");
                    }
                    int optInt2 = jSONObject.optInt("size");
                    if (optInt2 == 0) {
                        throw new Exception("invalid or missing read size");
                    }
                    d dVar = (d) a.this.f10820c.get(Integer.valueOf(optInt));
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    hVar.a(dVar.d(optInt2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final FileInputStream f10825a;

        /* renamed from: b, reason: collision with root package name */
        private long f10826b = System.currentTimeMillis() + 30000;

        public d(String str) {
            this.f10825a = new FileInputStream(str);
        }

        private void c() {
            this.f10826b = System.currentTimeMillis() + 30000;
        }

        public void a() {
            this.f10825a.close();
        }

        public boolean b() {
            return System.currentTimeMillis() >= this.f10826b;
        }

        public String d(int i10) {
            c();
            byte[] bArr = new byte[i10];
            return Base64.encodeToString(bArr, 0, this.f10825a.read(bArr), 0);
        }
    }

    public a() {
        HashMap hashMap = new HashMap();
        this.f10821d = hashMap;
        hashMap.put("fopen", new C0201a());
        hashMap.put("fclose", new b());
        hashMap.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(String str) {
        int i10 = this.f10818a;
        this.f10818a = i10 + 1;
        this.f10820c.put(Integer.valueOf(i10), new d(str));
        if (this.f10820c.size() == 1) {
            this.f10819b.postDelayed(this, 30000L);
        }
        return i10;
    }

    public Map d() {
        return this.f10821d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f10820c) {
            Iterator it = this.f10820c.values().iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.b()) {
                    it.remove();
                    try {
                        dVar.a();
                    } catch (IOException e10) {
                        AbstractC1721a.m(f10817e, "closing expired file failed: " + e10.toString());
                    }
                }
            }
            if (!this.f10820c.isEmpty()) {
                this.f10819b.postDelayed(this, 30000L);
            }
        }
    }
}
