package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.G;
import com.facebook.soloader.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2000c extends G implements w {

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f23041f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f23042g;

    /* renamed from: com.facebook.soloader.c$a */
    protected class a extends G.e {
        protected a() {
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = C2000c.this.f23041f.iterator();
            while (it.hasNext()) {
                G.e q10 = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(q10.b()));
                    q10.close();
                } catch (Throwable th) {
                    if (q10 != null) {
                        try {
                            q10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public void c(File file) {
            Iterator it = C2000c.this.f23041f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.c(file);
                    bVar.close();
                } catch (Throwable th) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public C2000c(Context context, String str, boolean z10) {
        super(context, str, z10);
        ArrayList arrayList = new ArrayList();
        this.f23041f = arrayList;
        this.f23042g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f23041f.add(mVar);
                }
            }
        } catch (IOException e10) {
            p.h("BackupSoSource", "failed to read split apks", e10);
        }
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C2000c c2000c = new C2000c(context, this.f23050a.getName());
        try {
            c2000c.e(0);
            return c2000c;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f23042g) {
            return super.d(str, i10, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.G, com.facebook.soloader.E
    public void e(int i10) {
        if ((i10 & 8) != 0) {
            return;
        }
        super.e(i10);
        this.f23042g = true;
    }

    @Override // com.facebook.soloader.G
    protected byte[] n() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 3);
            obtain.writeInt(SysUtil.g(this.f23013d));
            obtain.writeInt(this.f23041f.size());
            Iterator it = this.f23041f.iterator();
            while (it.hasNext()) {
                obtain.writeByteArray(((m) it.next()).n());
            }
            String str = this.f23013d.getApplicationInfo().sourceDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    public G.c[] o() {
        G.e q10 = ((m) this.f23041f.get(0)).q();
        try {
            G.c[] b10 = q10.b();
            q10.close();
            return b10;
        } catch (Throwable th) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f23050a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f23050a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f23051b + " apks = " + this.f23041f.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        com.facebook.soloader.p.b("SoLoader", "Found " + r9 + " in " + c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x(String str, int i10) {
        boolean z10;
        G.e q10 = q();
        try {
            G.c[] b10 = q10.b();
            int length = b10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (b10[i11].f23020a.equals(str)) {
                    break;
                }
                i11++;
            }
            q10.close();
            if (!z10) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i10);
            return true;
        } catch (Throwable th) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C2000c(Context context, String str) {
        this(context, str, true);
    }
}
