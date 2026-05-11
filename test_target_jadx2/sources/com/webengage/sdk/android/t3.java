package com.webengage.sdk.android;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;
import android.text.style.ImageSpan;
import com.webengage.sdk.android.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class t3 extends u3 {

    /* renamed from: f, reason: collision with root package name */
    private boolean f30832f;

    /* renamed from: b, reason: collision with root package name */
    private int f30828b = 500;

    /* renamed from: c, reason: collision with root package name */
    private Typeface f30829c = Typeface.DEFAULT;

    /* renamed from: d, reason: collision with root package name */
    private float f30830d = 26.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f30831e = -16777216;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30833g = true;

    class a implements AlignmentSpan {
        a() {
        }

        @Override // android.text.style.AlignmentSpan
        public Layout.Alignment getAlignment() {
            return Layout.Alignment.ALIGN_CENTER;
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f30835a;

        /* renamed from: b, reason: collision with root package name */
        private final List<List<Spanned>> f30836b;

        private b(boolean z10) {
            this.f30836b = new ArrayList();
            this.f30835a = z10;
        }

        public void a() {
            this.f30836b.add(new ArrayList());
        }

        public List<Spanned> b() {
            return this.f30836b.get(r0.size() - 1);
        }

        public List<List<Spanned>> c() {
            return this.f30836b;
        }

        public boolean d() {
            return this.f30835a;
        }

        /* synthetic */ b(t3 t3Var, boolean z10, a aVar) {
            this(z10);
        }

        public void a(Spanned spanned) {
            if (this.f30836b.isEmpty()) {
                throw new IllegalStateException("No rows added yet");
            }
            b().add(spanned);
        }
    }

    private class c extends Drawable {

        /* renamed from: a, reason: collision with root package name */
        private final Layout.Alignment f30838a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Spanned> f30839b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30840c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f30841d;

        public c(List<Spanned> list, boolean z10, Layout.Alignment alignment) {
            this.f30839b = list;
            this.f30840c = t3.this.a(list);
            this.f30841d = z10;
            this.f30838a = alignment;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(t3.this.f30831e);
            paint.setStyle(Paint.Style.STROKE);
            int size = this.f30839b.size();
            if (size == 0) {
                return;
            }
            int i10 = t3.this.f30828b / size;
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = i11 * i10;
                if (this.f30841d) {
                    canvas.drawRect(i12, 0.0f, i12 + i10, this.f30840c, paint);
                }
                StaticLayout staticLayout = new StaticLayout(this.f30839b.get(i11), t3.this.c(), i10 - 10, this.f30838a, 1.0f, 0.0f, true);
                canvas.translate(i12 + 5, 0.0f);
                staticLayout.draw(canvas);
                canvas.translate(r12 * (-1), 0.0f);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f30840c;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return t3.this.f30828b;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextPaint c() {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(this.f30831e);
        textPaint.linkColor = this.f30831e;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f30830d);
        textPaint.setTypeface(this.f30829c);
        return textPaint;
    }

    @Override // com.webengage.sdk.android.u3
    public boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(List<Spanned> list) {
        int i10 = 0;
        if (list.size() == 0) {
            return 0;
        }
        TextPaint c10 = c();
        int size = this.f30828b / list.size();
        Iterator<Spanned> it = list.iterator();
        while (it.hasNext()) {
            StaticLayout staticLayout = new StaticLayout(it.next(), c10, size - 10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (staticLayout.getHeight() > i10) {
                i10 = staticLayout.getHeight();
            }
        }
        return i10;
    }

    private b a(ze.D d10) {
        String l10 = d10.l("border");
        b bVar = new b(this, ("0".equals(l10) || l10 == null) ? false : true, null);
        a(d10, bVar);
        return bVar;
    }

    public void a(float f10) {
        this.f30830d = f10;
    }

    public void a(int i10) {
        this.f30831e = i10;
    }

    private void a(Object obj, b bVar) {
        if (obj instanceof ze.D) {
            ze.D d10 = (ze.D) obj;
            if (!d10.e().equals("td")) {
                if (!d10.e().equals("th")) {
                    if (d10.e().equals("tr")) {
                        bVar.a();
                    }
                    Iterator it = d10.k().iterator();
                    while (it.hasNext()) {
                        a(it.next(), bVar);
                    }
                    return;
                }
                this.f30832f = this.f30833g;
            }
            bVar.a(a().a(d10, (f1.a) null));
        }
    }

    @Override // com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var) {
        b a10 = a(d10);
        int i12 = 0;
        while (i12 < a10.c().size()) {
            List<Spanned> list = a10.c().get(i12);
            spannableStringBuilder.append("￼");
            c cVar = new c(list, a10.d(), (i12 == 0 && this.f30832f) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
            cVar.setBounds(0, 0, cVar.getIntrinsicWidth(), cVar.getIntrinsicHeight());
            int length = i12 == 0 ? i10 : spannableStringBuilder.length() - 1;
            spannableStringBuilder.append("\n");
            spannableStringBuilder.setSpan(new ImageSpan(cVar), length, spannableStringBuilder.length(), 33);
            i12++;
        }
        spannableStringBuilder.append("￼");
        c cVar2 = new c(new ArrayList(), a10.d(), Layout.Alignment.ALIGN_NORMAL);
        cVar2.setBounds(0, 0, this.f30828b, 1);
        spannableStringBuilder.setSpan(new ImageSpan(cVar2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new a(), i10, spannableStringBuilder.length(), 33);
    }

    public void a(boolean z10) {
        this.f30833g = z10;
    }
}
