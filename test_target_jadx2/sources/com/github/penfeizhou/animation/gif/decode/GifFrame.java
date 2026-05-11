package com.github.penfeizhou.animation.gif.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.gif.io.GifReader;
import k6.C3548c;
import k6.i;
import k6.j;
import l6.C3610a;

/* loaded from: classes2.dex */
public class GifFrame extends a {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final C3548c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary("animation-decoder-gif");
        sDataBlock = new ThreadLocal<>();
    }

    public GifFrame(GifReader gifReader, C3548c c3548c, i iVar, j jVar) {
        super(gifReader);
        if (iVar != null) {
            this.disposalMethod = iVar.c();
            int i10 = iVar.f36244c;
            this.frameDuration = (i10 <= 0 ? 10 : i10) * 10;
            if (iVar.d()) {
                this.transparentColorIndex = iVar.f36245d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f36246a;
        this.frameY = jVar.f36247b;
        this.frameWidth = jVar.f36248c;
        this.frameHeight = jVar.f36249d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f36251f;
        } else {
            this.colorTable = c3548c;
        }
        this.lzwMinCodeSize = jVar.f36252g;
        this.imageDataOffset = jVar.f36253h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, boolean z10, byte[] bArr);

    public void encode(int[] iArr, int i10) {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr, this.frameWidth / i10, this.frameHeight / i10, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C3610a c3610a) {
        try {
            c3610a.c((this.frameWidth * this.frameHeight) / (i10 * i10));
            encode(c3610a.b(), i10);
            bitmap.copyPixelsFromBuffer(c3610a.a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bitmap;
    }
}
