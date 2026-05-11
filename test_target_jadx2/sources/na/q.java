package na;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes2.dex */
public class q implements InterfaceC3718a {

    /* renamed from: b, reason: collision with root package name */
    private final RenderScript f37616b;

    /* renamed from: c, reason: collision with root package name */
    private final ScriptIntrinsicBlur f37617c;

    /* renamed from: d, reason: collision with root package name */
    private Allocation f37618d;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f37615a = new Paint(2);

    /* renamed from: e, reason: collision with root package name */
    private int f37619e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f37620f = -1;

    public q(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f37616b = create;
        this.f37617c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    private boolean f(Bitmap bitmap) {
        return bitmap.getHeight() == this.f37620f && bitmap.getWidth() == this.f37619e;
    }

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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f37615a);
    }

    @Override // na.InterfaceC3718a
    public final void destroy() {
        this.f37617c.destroy();
        this.f37616b.destroy();
        Allocation allocation = this.f37618d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // na.InterfaceC3718a
    public Bitmap e(Bitmap bitmap, float f10) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f37616b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f37618d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f37618d = Allocation.createTyped(this.f37616b, createFromBitmap.getType());
            this.f37619e = bitmap.getWidth();
            this.f37620f = bitmap.getHeight();
        }
        this.f37617c.setRadius(f10);
        this.f37617c.setInput(createFromBitmap);
        this.f37617c.forEach(this.f37618d);
        this.f37618d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }
}
