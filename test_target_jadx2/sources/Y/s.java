package Y;

import A.AbstractC0700h0;
import Y.p;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class s implements p {

    /* renamed from: m, reason: collision with root package name */
    private static final long f11960m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: a, reason: collision with root package name */
    private AudioRecord f11961a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1305a f11962b;

    /* renamed from: f, reason: collision with root package name */
    private final int f11966f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11967g;

    /* renamed from: h, reason: collision with root package name */
    private p.a f11968h;

    /* renamed from: i, reason: collision with root package name */
    private Executor f11969i;

    /* renamed from: j, reason: collision with root package name */
    private long f11970j;

    /* renamed from: k, reason: collision with root package name */
    private AudioManager.AudioRecordingCallback f11971k;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f11963c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f11964d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f11965e = new AtomicReference(null);

    /* renamed from: l, reason: collision with root package name */
    private boolean f11972l = false;

    class a extends AudioManager.AudioRecordingCallback {
        a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
                if (Z.b.a(audioRecordingConfiguration) == s.this.f11961a.getAudioSessionId()) {
                    s.this.n(Z.c.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public s(AbstractC1305a abstractC1305a, Context context) {
        if (!l(abstractC1305a.f(), abstractC1305a.e(), abstractC1305a.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(abstractC1305a.f()), Integer.valueOf(abstractC1305a.e()), Integer.valueOf(abstractC1305a.b())));
        }
        this.f11962b = abstractC1305a;
        this.f11967g = abstractC1305a.d();
        int j10 = j(abstractC1305a.f(), abstractC1305a.e(), abstractC1305a.b());
        y0.f.i(j10 > 0);
        int i10 = j10 * 2;
        this.f11966f = i10;
        AudioRecord h10 = h(i10, abstractC1305a, context);
        this.f11961a = h10;
        e(h10);
    }

    private static void e(AudioRecord audioRecord) {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new p.b("Unable to initialize AudioRecord");
    }

    private void f() {
        y0.f.j(!this.f11963c.get(), "AudioStream has been released.");
    }

    private void g() {
        y0.f.j(this.f11964d.get(), "AudioStream has not been started.");
    }

    private static AudioRecord h(int i10, AbstractC1305a abstractC1305a, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(abstractC1305a.f()).setChannelMask(t.b(abstractC1305a.e())).setEncoding(abstractC1305a.b()).build();
        AudioRecord.Builder b10 = Z.a.b();
        if (i11 >= 31 && context != null) {
            Z.d.a(b10, context);
        }
        Z.a.d(b10, abstractC1305a.c());
        Z.a.c(b10, build);
        Z.a.e(b10, i10);
        return Z.a.a(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long i() {
        long j10;
        if (!this.f11972l) {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Z.b.b(this.f11961a, audioTimestamp, 0) == 0) {
                j10 = t.c(this.f11962b.f(), this.f11970j, audioTimestamp);
                if (Math.abs(j10 - System.nanoTime()) > f11960m) {
                    this.f11972l = true;
                }
                return j10 != -1 ? System.nanoTime() : j10;
            }
            AbstractC0700h0.l("AudioStreamImpl", "Unable to get audio timestamp");
        }
        j10 = -1;
        if (j10 != -1) {
        }
    }

    private static int j(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, t.a(i11), i12);
    }

    private static boolean k() {
        return androidx.camera.video.internal.compat.quirk.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean l(int i10, int i11, int i12) {
        return i10 > 0 && i11 > 0 && j(i10, i11, i12) > 0;
    }

    @Override // Y.p
    public void a() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f11963c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f11971k) != null) {
            Z.c.d(this.f11961a, audioRecordingCallback);
        }
        this.f11961a.release();
    }

    @Override // Y.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        y0.f.j(!this.f11964d.get(), "AudioStream can not be started when setCallback.");
        f();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        y0.f.b(z10, "executor can't be null with non-null callback.");
        this.f11968h = aVar;
        this.f11969i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f11971k;
            if (audioRecordingCallback != null) {
                Z.c.d(this.f11961a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f11971k == null) {
                this.f11971k = new a();
            }
            Z.c.c(this.f11961a, executor, this.f11971k);
        }
    }

    void n(final boolean z10) {
        Executor executor = this.f11969i;
        final p.a aVar = this.f11968h;
        if (executor == null || aVar == null || Objects.equals(this.f11965e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: Y.r
            @Override // java.lang.Runnable
            public final void run() {
                p.a.this.a(z10);
            }
        });
    }

    @Override // Y.p
    public p.c read(ByteBuffer byteBuffer) {
        long j10;
        f();
        g();
        int read = this.f11961a.read(byteBuffer, this.f11966f);
        if (read > 0) {
            byteBuffer.limit(read);
            j10 = i();
            this.f11970j += t.g(read, this.f11967g);
        } else {
            j10 = 0;
        }
        return p.c.c(read, j10);
    }

    @Override // Y.p
    public void start() {
        f();
        if (this.f11964d.getAndSet(true)) {
            return;
        }
        if (k()) {
            e(this.f11961a);
        }
        this.f11961a.startRecording();
        boolean z10 = false;
        if (this.f11961a.getRecordingState() != 3) {
            this.f11964d.set(false);
            throw new p.b("Unable to start AudioRecord with state: " + this.f11961a.getRecordingState());
        }
        this.f11970j = 0L;
        this.f11972l = false;
        this.f11965e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a10 = Z.c.a(this.f11961a);
            z10 = a10 != null && Z.c.b(a10);
        }
        n(z10);
    }

    @Override // Y.p
    public void stop() {
        f();
        if (this.f11964d.getAndSet(false)) {
            this.f11961a.stop();
            if (this.f11961a.getRecordingState() != 1) {
                AbstractC0700h0.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f11961a.getRecordingState());
            }
            if (k()) {
                this.f11961a.release();
                this.f11961a = h(this.f11966f, this.f11962b, null);
            }
        }
    }
}
