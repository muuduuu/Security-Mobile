package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import w0.g;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f16552k = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return w0.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, w0.e eVar) {
            return w0.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16553a;

        /* renamed from: b, reason: collision with root package name */
        private final w0.e f16554b;

        /* renamed from: c, reason: collision with root package name */
        private final a f16555c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f16556d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f16557e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f16558f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f16559g;

        /* renamed from: h, reason: collision with root package name */
        f.i f16560h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f16561i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f16562j;

        b(Context context, w0.e eVar, a aVar) {
            y0.f.h(context, "Context cannot be null");
            y0.f.h(eVar, "FontRequest cannot be null");
            this.f16553a = context.getApplicationContext();
            this.f16554b = eVar;
            this.f16555c = aVar;
        }

        private void b() {
            synchronized (this.f16556d) {
                try {
                    this.f16560h = null;
                    ContentObserver contentObserver = this.f16561i;
                    if (contentObserver != null) {
                        this.f16555c.c(this.f16553a, contentObserver);
                        this.f16561i = null;
                    }
                    Handler handler = this.f16557e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f16562j);
                    }
                    this.f16557e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f16559g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f16558f = null;
                    this.f16559g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f16555c.b(this.f16553a, this.f16554b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 == null || b11.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b11[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            y0.f.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f16556d) {
                this.f16560h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f16556d) {
                try {
                    if (this.f16560h == null) {
                        return;
                    }
                    try {
                        g.b e10 = e();
                        int b10 = e10.b();
                        if (b10 == 2) {
                            synchronized (this.f16556d) {
                            }
                        }
                        if (b10 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                        }
                        try {
                            androidx.core.os.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a10 = this.f16555c.a(this.f16553a, e10);
                            ByteBuffer f10 = androidx.core.graphics.o.f(this.f16553a, null, e10.d());
                            if (f10 == null || a10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n b11 = n.b(a10, f10);
                            androidx.core.os.o.b();
                            synchronized (this.f16556d) {
                                try {
                                    f.i iVar = this.f16560h;
                                    if (iVar != null) {
                                        iVar.b(b11);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            androidx.core.os.o.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f16556d) {
                            try {
                                f.i iVar2 = this.f16560h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f16556d) {
                try {
                    if (this.f16560h == null) {
                        return;
                    }
                    if (this.f16558f == null) {
                        ThreadPoolExecutor b10 = c.b("emojiCompat");
                        this.f16559g = b10;
                        this.f16558f = b10;
                    }
                    this.f16558f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f16556d) {
                this.f16558f = executor;
            }
        }
    }

    public k(Context context, w0.e eVar) {
        super(new b(context, eVar, f16552k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
