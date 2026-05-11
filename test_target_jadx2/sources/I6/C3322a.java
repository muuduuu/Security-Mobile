package i6;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3322a {

    /* renamed from: c, reason: collision with root package name */
    private static int f34141c = 4;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f34142a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f34143b;

    /* renamed from: i6.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        static final C3322a f34144a = new C3322a();
    }

    public static C3322a b() {
        return b.f34144a;
    }

    public int a() {
        return this.f34143b.getAndIncrement();
    }

    public Looper c(int i10) {
        int i11 = i10 % f34141c;
        if (i11 < this.f34142a.size()) {
            if (this.f34142a.get(i11) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = ((HandlerThread) this.f34142a.get(i11)).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
        handlerThread.start();
        this.f34142a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    private C3322a() {
        this.f34142a = new ArrayList();
        this.f34143b = new AtomicInteger(0);
    }
}
