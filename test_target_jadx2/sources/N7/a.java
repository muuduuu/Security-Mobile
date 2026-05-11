package N7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f6567a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6568b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6569c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6570d;

    public a(Dialog dialog, Rect rect) {
        this.f6567a = dialog;
        this.f6568b = rect.left;
        this.f6569c = rect.top;
        this.f6570d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f6568b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f6569c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f6570d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f6567a.onTouchEvent(obtain);
    }
}
