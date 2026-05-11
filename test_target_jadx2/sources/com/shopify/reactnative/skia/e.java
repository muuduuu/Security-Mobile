package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Point;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f29475a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29476b;

    /* renamed from: c, reason: collision with root package name */
    private MediaExtractor f29477c;

    /* renamed from: d, reason: collision with root package name */
    private MediaCodec f29478d;

    /* renamed from: e, reason: collision with root package name */
    private ImageReader f29479e;

    /* renamed from: f, reason: collision with root package name */
    private Surface f29480f;

    /* renamed from: g, reason: collision with root package name */
    private MediaPlayer f29481g;

    /* renamed from: h, reason: collision with root package name */
    private double f29482h;

    /* renamed from: i, reason: collision with root package name */
    private double f29483i;

    /* renamed from: j, reason: collision with root package name */
    private int f29484j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f29485k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f29486l = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29487m = false;

    e(Context context, String str) {
        this.f29475a = Uri.parse(str);
        this.f29476b = context;
        d();
    }

    private void b() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueInputBuffer = this.f29478d.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            int readSampleData = this.f29477c.readSampleData(this.f29478d.getInputBuffer(dequeueInputBuffer), 0);
            if (readSampleData < 0) {
                this.f29478d.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.f29478d.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.f29477c.getSampleTime(), 0);
                this.f29477c.advance();
            }
        }
        int dequeueOutputBuffer = this.f29478d.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer >= 0) {
            this.f29478d.releaseOutputBuffer(dequeueOutputBuffer, true);
        }
    }

    private boolean c() {
        int dequeueOutputBuffer = this.f29478d.dequeueOutputBuffer(new MediaCodec.BufferInfo(), 0L);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        this.f29478d.releaseOutputBuffer(dequeueOutputBuffer, true);
        return true;
    }

    private void d() {
        ImageReader newInstance;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f29477c = mediaExtractor;
        try {
            mediaExtractor.setDataSource(this.f29476b, this.f29475a, (Map<String, String>) null);
            int f10 = f(this.f29477c);
            if (f10 < 0) {
                throw new RuntimeException("No video track found in " + this.f29475a);
            }
            this.f29477c.selectTrack(f10);
            MediaFormat trackFormat = this.f29477c.getTrackFormat(f10);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f29481g = mediaPlayer;
            mediaPlayer.setDataSource(this.f29476b, this.f29475a);
            this.f29481g.setAudioStreamType(3);
            this.f29481g.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.shopify.reactnative.skia.d
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    e.this.e(mediaPlayer2);
                }
            });
            this.f29481g.prepareAsync();
            if (trackFormat.containsKey("durationUs")) {
                this.f29482h = trackFormat.getLong("durationUs") / 1000;
            }
            if (trackFormat.containsKey("frame-rate")) {
                this.f29483i = trackFormat.getInteger("frame-rate");
            }
            if (trackFormat.containsKey("rotation-degrees")) {
                this.f29484j = trackFormat.getInteger("rotation-degrees");
            }
            this.f29485k = trackFormat.getInteger("width");
            int integer = trackFormat.getInteger("height");
            this.f29486l = integer;
            if (Build.VERSION.SDK_INT >= 29) {
                newInstance = ImageReader.newInstance(this.f29485k, integer, 34, 2, 256L);
                this.f29479e = newInstance;
            } else {
                this.f29479e = ImageReader.newInstance(this.f29485k, integer, 34, 2);
            }
            this.f29480f = this.f29479e.getSurface();
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            this.f29478d = createDecoderByType;
            createDecoderByType.configure(trackFormat, this.f29480f, (MediaCrypto) null, 0);
            this.f29478d.start();
        } catch (IOException e10) {
            throw new RuntimeException("Failed to initialize extractor or decoder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(MediaPlayer mediaPlayer) {
        this.f29482h = mediaPlayer.getDuration();
        mediaPlayer.start();
        this.f29487m = true;
    }

    private int f(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }

    public double getDuration() {
        return this.f29482h;
    }

    public double getFrameRate() {
        return this.f29483i;
    }

    public int getRotationDegrees() {
        return this.f29484j;
    }

    public Point getSize() {
        return new Point(this.f29485k, this.f29486l);
    }

    public HardwareBuffer nextImage() {
        HardwareBuffer hardwareBuffer;
        if (!c()) {
            b();
        }
        Image acquireLatestImage = this.f29479e.acquireLatestImage();
        if (acquireLatestImage == null) {
            return null;
        }
        hardwareBuffer = acquireLatestImage.getHardwareBuffer();
        acquireLatestImage.close();
        return hardwareBuffer;
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f29481g;
        if (mediaPlayer == null || !this.f29487m) {
            return;
        }
        mediaPlayer.pause();
        this.f29487m = false;
    }

    public void play() {
        MediaPlayer mediaPlayer = this.f29481g;
        if (mediaPlayer == null || this.f29487m) {
            return;
        }
        mediaPlayer.start();
        this.f29487m = true;
    }

    public void seek(double d10) {
        long j10 = (long) (1000.0d * d10);
        this.f29477c.seekTo(j10, 2);
        MediaPlayer mediaPlayer = this.f29481g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d10, 3);
        }
        MediaCodec mediaCodec = this.f29478d;
        if (mediaCodec != null) {
            mediaCodec.flush();
            boolean z10 = true;
            while (z10) {
                b();
                if (this.f29477c.getSampleTime() >= j10) {
                    z10 = false;
                }
            }
        }
    }

    public void setVolume(float f10) {
        MediaPlayer mediaPlayer = this.f29481g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
    }
}
