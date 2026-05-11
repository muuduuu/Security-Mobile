package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f17212a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17213b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f17214c;

    /* renamed from: e, reason: collision with root package name */
    private final File f17216e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17217f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17218g;

    /* renamed from: h, reason: collision with root package name */
    private final String f17219h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f17221j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f17222k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17220i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f17215d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f17212a = assetManager;
        this.f17213b = executor;
        this.f17214c = cVar;
        this.f17217f = str;
        this.f17218g = str2;
        this.f17219h = str3;
        this.f17216e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f17212a, this.f17219h);
        } catch (FileNotFoundException e10) {
            this.f17214c.b(9, e10);
        } catch (IOException e11) {
            this.f17214c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f17221j = null;
            this.f17214c.b(8, e12);
        }
        if (h10 == null) {
            if (h10 != null) {
                h10.close();
            }
            return null;
        }
        try {
            this.f17221j = m.q(h10, m.o(h10, m.f17243b), bArr, dVarArr);
            h10.close();
            return this;
        } catch (Throwable th) {
            try {
                h10.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f17220i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 34) {
            return null;
        }
        switch (i10) {
        }
        return null;
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f17218g);
        } catch (FileNotFoundException e10) {
            this.f17214c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f17214c.b(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f17214c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f17214c.a(5, null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        d[] w10 = m.w(inputStream, m.o(inputStream, m.f17242a), this.f17217f);
                        try {
                            inputStream.close();
                            return w10;
                        } catch (IOException e10) {
                            this.f17214c.b(7, e10);
                            return w10;
                        }
                    } catch (IOException e11) {
                        this.f17214c.b(7, e11);
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    this.f17214c.b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e13) {
                this.f17214c.b(7, e13);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f17214c.b(7, e14);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
            }
            return false;
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f17213b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f17215d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f17216e.exists()) {
            try {
                this.f17216e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f17216e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f17220i = true;
        return true;
    }

    public c i() {
        c b10;
        c();
        if (this.f17215d == null) {
            return this;
        }
        InputStream f10 = f(this.f17212a);
        if (f10 != null) {
            this.f17221j = j(f10);
        }
        d[] dVarArr = this.f17221j;
        return (dVarArr == null || !k() || (b10 = b(dVarArr, this.f17215d)) == null) ? this : b10;
    }

    public c m() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f17221j;
        byte[] bArr = this.f17215d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f17214c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f17214c.b(8, e11);
            }
            if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f17214c.b(5, null);
                this.f17221j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f17222k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f17221j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n() {
        byte[] bArr = this.f17222k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f17216e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f17222k = null;
                this.f17221j = null;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            return false;
        } catch (IOException e11) {
            l(7, e11);
            return false;
        }
    }
}
