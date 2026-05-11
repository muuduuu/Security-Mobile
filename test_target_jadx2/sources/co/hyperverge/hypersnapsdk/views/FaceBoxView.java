package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FaceBoxView extends FrameLayout {
    boolean isShowing;
    private TextView messageTV;
    Paint paint;
    boolean showMessage;

    /* renamed from: x1, reason: collision with root package name */
    int f19816x1;

    /* renamed from: x2, reason: collision with root package name */
    int f19817x2;

    /* renamed from: y1, reason: collision with root package name */
    int f19818y1;

    /* renamed from: y2, reason: collision with root package name */
    int f19819y2;

    public FaceBoxView(Context context) {
        super(context);
        this.paint = new Paint();
        this.isShowing = false;
        this.showMessage = false;
        initialize();
    }

    private void initialize() {
        View.inflate(getContext(), R.layout.frame_layout_facebox, this);
        setWillNotDraw(false);
        this.messageTV = (TextView) findViewById(R.id.tv_message);
    }

    public ArrayList<Integer> getPoints() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(this.f19816x1));
        arrayList.add(Integer.valueOf(this.f19818y1));
        arrayList.add(Integer.valueOf(this.f19817x2));
        arrayList.add(Integer.valueOf(this.f19819y2));
        return arrayList;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.isShowing) {
            this.messageTV.setVisibility(8);
            return;
        }
        this.paint.setColor(Color.parseColor("#99ca3e"));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(10.0f);
        canvas.drawRect(this.f19816x1, this.f19818y1, this.f19817x2, this.f19819y2, this.paint);
    }

    public void setPoints(int i10, int i11, int i12, int i13) {
        this.f19816x1 = i10;
        this.f19817x2 = i12;
        this.f19818y1 = i11;
        this.f19819y2 = i13;
        invalidate();
    }

    public void showHideBox(boolean z10) {
        if (getParent() == null) {
            return;
        }
        this.isShowing = z10;
        invalidate();
    }

    public void showMessage(boolean z10) {
        this.messageTV.setVisibility(z10 ? 0 : 8);
        invalidate();
    }

    public FaceBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
        this.isShowing = false;
        this.showMessage = false;
        initialize();
    }

    public FaceBoxView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.paint = new Paint();
        this.isShowing = false;
        this.showMessage = false;
        initialize();
    }
}
