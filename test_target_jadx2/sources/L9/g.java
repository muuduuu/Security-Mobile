package L9;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import wc.q;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f5710a;

    /* renamed from: b, reason: collision with root package name */
    private final q f5711b;

    /* renamed from: c, reason: collision with root package name */
    private int f5712c;

    /* renamed from: d, reason: collision with root package name */
    private int f5713d;

    /* renamed from: e, reason: collision with root package name */
    private int f5714e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f5715f;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        
            r11 = r4.getTextCursorDrawable();
         */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onPreDraw() {
            int paddingTop;
            int i10;
            Drawable textCursorDrawable;
            int selectionStart = g.this.f5710a.getSelectionStart();
            int selectionEnd = g.this.f5710a.getSelectionEnd();
            int height = g.this.f5710a.getHeight();
            EditText editText = g.this.f5710a;
            Layout layout = editText.getLayout();
            if (layout == null) {
                return true;
            }
            if (g.this.f5712c != selectionStart || g.this.f5713d != selectionEnd || g.this.f5714e != height) {
                g.this.f5712c = selectionStart;
                g.this.f5713d = selectionEnd;
                g.this.f5714e = height;
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                int lineTop = layout.getLineTop(layout.getLineForOffset(min));
                int height2 = layout.getHeight();
                int i11 = 0;
                if (Build.VERSION.SDK_INT >= 29 && textCursorDrawable != null) {
                    i11 = textCursorDrawable.getIntrinsicWidth();
                }
                int gravity = g.this.f5710a.getGravity() & 112;
                int paddingTop2 = g.this.f5710a.getPaddingTop() + g.this.f5710a.getPaddingBottom();
                int lineHeight = g.this.f5710a.getLineHeight() / 2;
                int i12 = height - paddingTop2;
                if (height2 > i12) {
                    paddingTop = g.this.f5710a.getPaddingTop();
                } else if (gravity == 16) {
                    paddingTop = ((i12 - height2) / 2) + g.this.f5710a.getPaddingTop();
                } else if (gravity != 80) {
                    paddingTop = g.this.f5710a.getPaddingTop();
                } else {
                    i10 = g.this.f5710a.getPaddingTop() + (i12 - height2) + lineHeight;
                    float primaryHorizontal = layout.getPrimaryHorizontal(min);
                    float scrollY = (lineTop + i10) - editText.getScrollY();
                    int lineForOffset = layout.getLineForOffset(max);
                    g.this.f5711b.w(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(e.a(primaryHorizontal)), Double.valueOf(e.a(scrollY)), Double.valueOf(e.a(layout.getPrimaryHorizontal(max) + i11)), Double.valueOf(e.a((layout.getLineBottom(lineForOffset) + i10) - editText.getScrollY())));
                }
                i10 = paddingTop + lineHeight;
                float primaryHorizontal2 = layout.getPrimaryHorizontal(min);
                float scrollY2 = (lineTop + i10) - editText.getScrollY();
                int lineForOffset2 = layout.getLineForOffset(max);
                g.this.f5711b.w(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(e.a(primaryHorizontal2)), Double.valueOf(e.a(scrollY2)), Double.valueOf(e.a(layout.getPrimaryHorizontal(max) + i11)), Double.valueOf(e.a((layout.getLineBottom(lineForOffset2) + i10) - editText.getScrollY())));
            }
            return true;
        }
    }

    public g(EditText editText, q action) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f5710a = editText;
        this.f5711b = action;
        this.f5712c = -1;
        this.f5713d = -1;
        this.f5714e = -1;
        this.f5715f = new a();
    }

    public final void i() {
        this.f5710a.getViewTreeObserver().removeOnPreDrawListener(this.f5715f);
    }

    public final void j() {
        this.f5710a.getViewTreeObserver().addOnPreDrawListener(this.f5715f);
    }
}
