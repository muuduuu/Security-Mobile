package j5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3501b extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f35842a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f35843b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f35844c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f35845d;

    /* renamed from: e, reason: collision with root package name */
    private List f35846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3501b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f35842a = paint;
        this.f35843b = new HashMap();
        this.f35844c = new HashMap();
        Paint paint2 = new Paint();
        this.f35845d = paint2;
        this.f35846e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3501b this$0, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f35843b.remove(Integer.valueOf(i10));
        this$0.f35844c.remove(Integer.valueOf(i10));
        this$0.invalidate();
    }

    public final void b() {
        this.f35846e.clear();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (C3502c c3502c : this.f35843b.values()) {
            this.f35842a.setColor(c3502c.a());
            canvas.drawRect(c3502c.c(), this.f35842a);
            final int b10 = c3502c.b();
            Runnable runnable = new Runnable() { // from class: j5.a
                @Override // java.lang.Runnable
                public final void run() {
                    C3501b.c(C3501b.this, b10);
                }
            };
            if (!this.f35844c.containsKey(Integer.valueOf(b10))) {
                this.f35844c.put(Integer.valueOf(b10), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator it = this.f35846e.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f35845d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> elementsRectangles) {
        Intrinsics.checkNotNullParameter(elementsRectangles, "elementsRectangles");
        this.f35846e = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(List<C3502c> traceUpdates) {
        Intrinsics.checkNotNullParameter(traceUpdates, "traceUpdates");
        for (C3502c c3502c : traceUpdates) {
            int b10 = c3502c.b();
            if (this.f35844c.containsKey(Integer.valueOf(b10))) {
                UiThreadUtil.removeOnUiThread((Runnable) this.f35844c.get(Integer.valueOf(b10)));
                this.f35844c.remove(Integer.valueOf(b10));
            }
            this.f35843b.put(Integer.valueOf(b10), c3502c);
        }
        invalidate();
    }
}
