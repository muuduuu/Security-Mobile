package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import j0.C3477b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f16494o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f16495p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f16496q;

    /* renamed from: b, reason: collision with root package name */
    private final Set f16498b;

    /* renamed from: e, reason: collision with root package name */
    private final b f16501e;

    /* renamed from: f, reason: collision with root package name */
    final h f16502f;

    /* renamed from: g, reason: collision with root package name */
    private final j f16503g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f16504h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f16505i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f16506j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16507k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16508l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16509m;

    /* renamed from: n, reason: collision with root package name */
    private final e f16510n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f16497a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f16499c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f16500d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f16511b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f16512c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0283a extends i {
            C0283a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f16514a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f16514a.f16502f.a(new C0283a());
            } catch (Throwable th) {
                this.f16514a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f16511b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f16512c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f16514a.f16504h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f16514a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f16512c = nVar;
            n nVar2 = this.f16512c;
            j jVar = this.f16514a.f16503g;
            e eVar = this.f16514a.f16510n;
            f fVar = this.f16514a;
            this.f16511b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f16505i, fVar.f16506j, androidx.emoji2.text.h.a());
            this.f16514a.o();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f16514a;

        b(f fVar) {
            this.f16514a = fVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f16515a;

        /* renamed from: b, reason: collision with root package name */
        j f16516b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16517c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16518d;

        /* renamed from: e, reason: collision with root package name */
        int[] f16519e;

        /* renamed from: f, reason: collision with root package name */
        Set f16520f;

        /* renamed from: g, reason: collision with root package name */
        boolean f16521g;

        /* renamed from: h, reason: collision with root package name */
        int f16522h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f16523i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f16524j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            y0.f.h(hVar, "metadataLoader cannot be null.");
            this.f16515a = hVar;
        }

        protected final h a() {
            return this.f16515a;
        }

        public c b(int i10) {
            this.f16523i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0284f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List f16525a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f16526b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16527c;

        g(AbstractC0284f abstractC0284f, int i10) {
            this(Arrays.asList((AbstractC0284f) y0.f.h(abstractC0284f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f16525a.size();
            int i10 = 0;
            if (this.f16527c != 1) {
                while (i10 < size) {
                    ((AbstractC0284f) this.f16525a.get(i10)).a(this.f16526b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC0284f) this.f16525a.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th) {
            y0.f.h(collection, "initCallbacks cannot be null");
            this.f16525a = new ArrayList(collection);
            this.f16527c = i10;
            this.f16526b = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f16504h = cVar.f16517c;
        this.f16505i = cVar.f16518d;
        this.f16506j = cVar.f16519e;
        this.f16507k = cVar.f16521g;
        this.f16508l = cVar.f16522h;
        this.f16502f = cVar.f16515a;
        this.f16509m = cVar.f16523i;
        this.f16510n = cVar.f16524j;
        C3477b c3477b = new C3477b();
        this.f16498b = c3477b;
        j jVar = cVar.f16516b;
        this.f16503g = jVar == null ? new d() : jVar;
        Set set = cVar.f16520f;
        if (set != null && !set.isEmpty()) {
            c3477b.addAll(cVar.f16520f);
        }
        this.f16501e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f16494o) {
            fVar = f16496q;
            y0.f.j(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i10, keyEvent);
    }

    public static f h(c cVar) {
        f fVar = f16496q;
        if (fVar == null) {
            synchronized (f16494o) {
                try {
                    fVar = f16496q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f16496q = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f16496q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f16497a.writeLock().lock();
        try {
            if (this.f16509m == 0) {
                this.f16499c = 0;
            }
            this.f16497a.writeLock().unlock();
            if (e() == 0) {
                this.f16501e.a();
            }
        } catch (Throwable th) {
            this.f16497a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f16508l;
    }

    public int e() {
        this.f16497a.readLock().lock();
        try {
            return this.f16499c;
        } finally {
            this.f16497a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f16507k;
    }

    public void l() {
        y0.f.j(this.f16509m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f16497a.writeLock().lock();
        try {
            if (this.f16499c == 0) {
                return;
            }
            this.f16499c = 0;
            this.f16497a.writeLock().unlock();
            this.f16501e.a();
        } finally {
            this.f16497a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f16497a.writeLock().lock();
        try {
            this.f16499c = 2;
            arrayList.addAll(this.f16498b);
            this.f16498b.clear();
            this.f16497a.writeLock().unlock();
            this.f16500d.post(new g(arrayList, this.f16499c, th));
        } catch (Throwable th2) {
            this.f16497a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f16497a.writeLock().lock();
        try {
            this.f16499c = 1;
            arrayList.addAll(this.f16498b);
            this.f16498b.clear();
            this.f16497a.writeLock().unlock();
            this.f16500d.post(new g(arrayList, this.f16499c));
        } catch (Throwable th) {
            this.f16497a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        y0.f.j(k(), "Not initialized yet");
        y0.f.e(i10, "start cannot be negative");
        y0.f.e(i11, "end cannot be negative");
        y0.f.e(i12, "maxEmojiCount cannot be negative");
        y0.f.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        y0.f.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        y0.f.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f16504h : false;
        } else {
            z10 = true;
        }
        return this.f16501e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(AbstractC0284f abstractC0284f) {
        y0.f.h(abstractC0284f, "initCallback cannot be null");
        this.f16497a.writeLock().lock();
        try {
            if (this.f16499c != 1 && this.f16499c != 2) {
                this.f16498b.add(abstractC0284f);
                this.f16497a.writeLock().unlock();
            }
            this.f16500d.post(new g(abstractC0284f, this.f16499c));
            this.f16497a.writeLock().unlock();
        } catch (Throwable th) {
            this.f16497a.writeLock().unlock();
            throw th;
        }
    }

    public void u(AbstractC0284f abstractC0284f) {
        y0.f.h(abstractC0284f, "initCallback cannot be null");
        this.f16497a.writeLock().lock();
        try {
            this.f16498b.remove(abstractC0284f);
        } finally {
            this.f16497a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f16501e.c(editorInfo);
    }
}
