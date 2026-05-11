package com.squareup.picasso;

import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f29516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29518c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29519d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29520e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29521f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29522g;

    /* renamed from: h, reason: collision with root package name */
    public final long f29523h;

    /* renamed from: i, reason: collision with root package name */
    public final long f29524i;

    /* renamed from: j, reason: collision with root package name */
    public final long f29525j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29526k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29527l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29528m;

    /* renamed from: n, reason: collision with root package name */
    public final long f29529n;

    public C(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f29516a = i10;
        this.f29517b = i11;
        this.f29518c = j10;
        this.f29519d = j11;
        this.f29520e = j12;
        this.f29521f = j13;
        this.f29522g = j14;
        this.f29523h = j15;
        this.f29524i = j16;
        this.f29525j = j17;
        this.f29526k = i12;
        this.f29527l = i13;
        this.f29528m = i14;
        this.f29529n = j18;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f29516a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f29517b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f29517b / this.f29516a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f29518c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f29519d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f29526k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f29520e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f29523h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f29527l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f29521f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f29528m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f29522g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f29524i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f29525j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f29516a + ", size=" + this.f29517b + ", cacheHits=" + this.f29518c + ", cacheMisses=" + this.f29519d + ", downloadCount=" + this.f29526k + ", totalDownloadSize=" + this.f29520e + ", averageDownloadSize=" + this.f29523h + ", totalOriginalBitmapSize=" + this.f29521f + ", totalTransformedBitmapSize=" + this.f29522g + ", averageOriginalBitmapSize=" + this.f29524i + ", averageTransformedBitmapSize=" + this.f29525j + ", originalBitmapCount=" + this.f29527l + ", transformedBitmapCount=" + this.f29528m + ", timeStamp=" + this.f29529n + '}';
    }
}
