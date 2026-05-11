package Z5;

import Z5.c;
import a6.C1360i;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Set f12445a;

    /* renamed from: b, reason: collision with root package name */
    protected final c.b f12446b;

    /* renamed from: c, reason: collision with root package name */
    protected final c.a f12447c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f12448d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f12449e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12450a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12452c;

        a(Context context, String str, String str2, c.InterfaceC0230c interfaceC0230c) {
            this.f12450a = context;
            this.f12451b = str;
            this.f12452c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                d.this.g(this.f12450a, this.f12451b, this.f12452c);
                throw null;
            } catch (Z5.b unused) {
                throw null;
            } catch (UnsatisfiedLinkError unused2) {
                throw null;
            }
        }
    }

    class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12454a;

        b(String str) {
            this.f12454a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f12454a);
        }
    }

    protected d() {
        this(new e(), new Z5.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) {
        C1360i c1360i;
        if (this.f12445a.contains(str) && !this.f12448d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f12446b.b(str);
            this.f12445a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d10 = d(context, str, str2);
            if (!d10.exists() || this.f12448d) {
                if (this.f12448d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f12447c.a(context, this.f12446b.d(), this.f12446b.a(str), d10, this);
            }
            try {
                if (this.f12449e) {
                    C1360i c1360i2 = null;
                    try {
                        c1360i = new C1360i(d10);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        List c10 = c1360i.c();
                        c1360i.close();
                        Iterator it = c10.iterator();
                        while (it.hasNext()) {
                            e(context, this.f12446b.c((String) it.next()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c1360i2 = c1360i;
                        c1360i2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.f12446b.e(d10.getAbsolutePath());
            this.f12445a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File c10 = c(context);
        File d10 = d(context, str, str2);
        File[] listFiles = c10.listFiles(new b(this.f12446b.a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f12448d || !file.getAbsolutePath().equals(d10.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String a10 = this.f12446b.a(str);
        if (f.a(str2)) {
            return new File(c(context), a10);
        }
        return new File(c(context), a10 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0230c interfaceC0230c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0230c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0230c)).start();
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected d(c.b bVar, c.a aVar) {
        this.f12445a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f12446b = bVar;
        this.f12447c = aVar;
    }

    public void h(String str) {
    }
}
