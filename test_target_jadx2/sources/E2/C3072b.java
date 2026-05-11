package e2;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3072b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f32141a;

    /* renamed from: b, reason: collision with root package name */
    private final File f32142b;

    /* renamed from: c, reason: collision with root package name */
    private final File f32143c;

    /* renamed from: d, reason: collision with root package name */
    private final File f32144d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32145e;

    /* renamed from: f, reason: collision with root package name */
    private long f32146f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32147g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f32149i;

    /* renamed from: k, reason: collision with root package name */
    private int f32151k;

    /* renamed from: h, reason: collision with root package name */
    private long f32148h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f32150j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f32152l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f32153m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0467b(null));

    /* renamed from: n, reason: collision with root package name */
    private final Callable f32154n = new a();

    /* renamed from: e2.b$a */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C3072b.this) {
                try {
                    if (C3072b.this.f32149i == null) {
                        return null;
                    }
                    C3072b.this.K();
                    if (C3072b.this.u()) {
                        C3072b.this.F();
                        C3072b.this.f32151k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e2.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0467b implements ThreadFactory {
        private ThreadFactoryC0467b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0467b(a aVar) {
            this();
        }
    }

    /* renamed from: e2.b$c */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f32156a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f32157b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f32158c;

        /* synthetic */ c(C3072b c3072b, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            C3072b.this.n(this, false);
        }

        public void b() {
            if (this.f32158c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            C3072b.this.n(this, true);
            this.f32158c = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (C3072b.this) {
                try {
                    if (this.f32156a.f32165f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f32156a.f32164e) {
                        this.f32157b[i10] = true;
                    }
                    k10 = this.f32156a.k(i10);
                    C3072b.this.f32141a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k10;
        }

        private c(d dVar) {
            this.f32156a = dVar;
            this.f32157b = dVar.f32164e ? null : new boolean[C3072b.this.f32147g];
        }
    }

    /* renamed from: e2.b$d */
    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f32160a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f32161b;

        /* renamed from: c, reason: collision with root package name */
        File[] f32162c;

        /* renamed from: d, reason: collision with root package name */
        File[] f32163d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32164e;

        /* renamed from: f, reason: collision with root package name */
        private c f32165f;

        /* renamed from: g, reason: collision with root package name */
        private long f32166g;

        /* synthetic */ d(C3072b c3072b, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length != C3072b.this.f32147g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f32161b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f32162c[i10];
        }

        public File k(int i10) {
            return this.f32163d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f32161b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f32160a = str;
            this.f32161b = new long[C3072b.this.f32147g];
            this.f32162c = new File[C3072b.this.f32147g];
            this.f32163d = new File[C3072b.this.f32147g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C3072b.this.f32147g; i10++) {
                sb2.append(i10);
                this.f32162c[i10] = new File(C3072b.this.f32141a, sb2.toString());
                sb2.append(".tmp");
                this.f32163d[i10] = new File(C3072b.this.f32141a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* renamed from: e2.b$e */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f32168a;

        /* renamed from: b, reason: collision with root package name */
        private final long f32169b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f32170c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f32171d;

        /* synthetic */ e(C3072b c3072b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f32171d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f32168a = str;
            this.f32169b = j10;
            this.f32171d = fileArr;
            this.f32170c = jArr;
        }
    }

    private C3072b(File file, int i10, int i11, long j10) {
        this.f32141a = file;
        this.f32145e = i10;
        this.f32142b = new File(file, "journal");
        this.f32143c = new File(file, "journal.tmp");
        this.f32144d = new File(file, "journal.bkp");
        this.f32147g = i11;
        this.f32146f = j10;
    }

    private void C(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i10);
        if (indexOf2 == -1) {
            substring = str.substring(i10);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f32150j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = (d) this.f32150j.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f32150j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f32164e = true;
            dVar.f32165f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f32165f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void F() {
        try {
            Writer writer = this.f32149i;
            if (writer != null) {
                l(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32143c), e2.d.f32179a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f32145e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f32147g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f32150j.values()) {
                    if (dVar.f32165f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f32160a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f32160a + dVar.l() + '\n');
                    }
                }
                l(bufferedWriter);
                if (this.f32142b.exists()) {
                    I(this.f32142b, this.f32144d, true);
                }
                I(this.f32143c, this.f32142b, false);
                this.f32144d.delete();
                this.f32149i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32142b, true), e2.d.f32179a));
            } catch (Throwable th) {
                l(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void I(File file, File file2, boolean z10) {
        if (z10) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        while (this.f32148h > this.f32146f) {
            H((String) ((Map.Entry) this.f32150j.entrySet().iterator().next()).getKey());
        }
    }

    private void j() {
        if (this.f32149i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void l(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void n(c cVar, boolean z10) {
        d dVar = cVar.f32156a;
        if (dVar.f32165f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f32164e) {
            for (int i10 = 0; i10 < this.f32147g; i10++) {
                if (!cVar.f32157b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f32147g; i11++) {
            File k10 = dVar.k(i11);
            if (!z10) {
                p(k10);
            } else if (k10.exists()) {
                File j10 = dVar.j(i11);
                k10.renameTo(j10);
                long j11 = dVar.f32161b[i11];
                long length = j10.length();
                dVar.f32161b[i11] = length;
                this.f32148h = (this.f32148h - j11) + length;
            }
        }
        this.f32151k++;
        dVar.f32165f = null;
        if (dVar.f32164e || z10) {
            dVar.f32164e = true;
            this.f32149i.append((CharSequence) "CLEAN");
            this.f32149i.append(' ');
            this.f32149i.append((CharSequence) dVar.f32160a);
            this.f32149i.append((CharSequence) dVar.l());
            this.f32149i.append('\n');
            if (z10) {
                long j12 = this.f32152l;
                this.f32152l = 1 + j12;
                dVar.f32166g = j12;
            }
        } else {
            this.f32150j.remove(dVar.f32160a);
            this.f32149i.append((CharSequence) "REMOVE");
            this.f32149i.append(' ');
            this.f32149i.append((CharSequence) dVar.f32160a);
            this.f32149i.append('\n');
        }
        s(this.f32149i);
        if (this.f32148h > this.f32146f || u()) {
            this.f32153m.submit(this.f32154n);
        }
    }

    private static void p(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c r(String str, long j10) {
        j();
        d dVar = (d) this.f32150j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f32166g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f32150j.put(str, dVar);
        } else if (dVar.f32165f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f32165f = cVar;
        this.f32149i.append((CharSequence) "DIRTY");
        this.f32149i.append(' ');
        this.f32149i.append((CharSequence) str);
        this.f32149i.append('\n');
        s(this.f32149i);
        return cVar;
    }

    private static void s(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        int i10 = this.f32151k;
        return i10 >= 2000 && i10 >= this.f32150j.size();
    }

    public static C3072b x(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                I(file2, file3, false);
            }
        }
        C3072b c3072b = new C3072b(file, i10, i11, j10);
        if (c3072b.f32142b.exists()) {
            try {
                c3072b.z();
                c3072b.y();
                return c3072b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c3072b.o();
            }
        }
        file.mkdirs();
        C3072b c3072b2 = new C3072b(file, i10, i11, j10);
        c3072b2.F();
        return c3072b2;
    }

    private void y() {
        p(this.f32143c);
        Iterator it = this.f32150j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f32165f == null) {
                while (i10 < this.f32147g) {
                    this.f32148h += dVar.f32161b[i10];
                    i10++;
                }
            } else {
                dVar.f32165f = null;
                while (i10 < this.f32147g) {
                    p(dVar.j(i10));
                    p(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void z() {
        C3073c c3073c = new C3073c(new FileInputStream(this.f32142b), e2.d.f32179a);
        try {
            String d10 = c3073c.d();
            String d11 = c3073c.d();
            String d12 = c3073c.d();
            String d13 = c3073c.d();
            String d14 = c3073c.d();
            if (!"libcore.io.DiskLruCache".equals(d10) || !"1".equals(d11) || !Integer.toString(this.f32145e).equals(d12) || !Integer.toString(this.f32147g).equals(d13) || !BuildConfig.FLAVOR.equals(d14)) {
                throw new IOException("unexpected journal header: [" + d10 + ", " + d11 + ", " + d13 + ", " + d14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    C(c3073c.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f32151k = i10 - this.f32150j.size();
                    if (c3073c.c()) {
                        F();
                    } else {
                        this.f32149i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32142b, true), e2.d.f32179a));
                    }
                    e2.d.a(c3073c);
                    return;
                }
            }
        } catch (Throwable th) {
            e2.d.a(c3073c);
            throw th;
        }
    }

    public synchronized boolean H(String str) {
        try {
            j();
            d dVar = (d) this.f32150j.get(str);
            if (dVar != null && dVar.f32165f == null) {
                for (int i10 = 0; i10 < this.f32147g; i10++) {
                    File j10 = dVar.j(i10);
                    if (j10.exists() && !j10.delete()) {
                        throw new IOException("failed to delete " + j10);
                    }
                    this.f32148h -= dVar.f32161b[i10];
                    dVar.f32161b[i10] = 0;
                }
                this.f32151k++;
                this.f32149i.append((CharSequence) "REMOVE");
                this.f32149i.append(' ');
                this.f32149i.append((CharSequence) str);
                this.f32149i.append('\n');
                this.f32150j.remove(str);
                if (u()) {
                    this.f32153m.submit(this.f32154n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f32149i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f32150j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f32165f != null) {
                    dVar.f32165f.a();
                }
            }
            K();
            l(this.f32149i);
            this.f32149i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void o() {
        close();
        e2.d.b(this.f32141a);
    }

    public c q(String str) {
        return r(str, -1L);
    }

    public synchronized e t(String str) {
        j();
        d dVar = (d) this.f32150j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f32164e) {
            return null;
        }
        for (File file : dVar.f32162c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f32151k++;
        this.f32149i.append((CharSequence) "READ");
        this.f32149i.append(' ');
        this.f32149i.append((CharSequence) str);
        this.f32149i.append('\n');
        if (u()) {
            this.f32153m.submit(this.f32154n);
        }
        return new e(this, str, dVar.f32166g, dVar.f32162c, dVar.f32161b, null);
    }
}
