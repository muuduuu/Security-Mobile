package na;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public class p implements InterfaceC3718a {

    /* renamed from: b, reason: collision with root package name */
    private int f37610b;

    /* renamed from: c, reason: collision with root package name */
    private int f37611c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3718a f37613e;

    /* renamed from: f, reason: collision with root package name */
    private Context f37614f;

    /* renamed from: a, reason: collision with root package name */
    private final RenderNode f37609a = i.a("BlurViewNode");

    /* renamed from: d, reason: collision with root package name */
    private float f37612d = 1.0f;

    @Override // na.InterfaceC3718a
    public float a() {
        return 6.0f;
    }

    @Override // na.InterfaceC3718a
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // na.InterfaceC3718a
    public boolean c() {
        return true;
    }

    @Override // na.InterfaceC3718a
    public void d(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f37609a);
            return;
        }
        if (this.f37613e == null) {
            this.f37613e = new q(this.f37614f);
        }
        this.f37613e.e(bitmap, this.f37612d);
        this.f37613e.d(canvas, bitmap);
    }

    @Override // na.InterfaceC3718a
    public void destroy() {
        this.f37609a.discardDisplayList();
        InterfaceC3718a interfaceC3718a = this.f37613e;
        if (interfaceC3718a != null) {
            interfaceC3718a.destroy();
        }
    }

    @Override // na.InterfaceC3718a
    public Bitmap e(Bitmap bitmap, float f10) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f37612d = f10;
        if (bitmap.getHeight() != this.f37610b || bitmap.getWidth() != this.f37611c) {
            this.f37610b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f37611c = width;
            this.f37609a.setPosition(0, 0, width, this.f37610b);
        }
        beginRecording = this.f37609a.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f37609a.endRecording();
        RenderNode renderNode = this.f37609a;
        createBlurEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    void f(Context context) {
        this.f37614f = context;
    }
}
