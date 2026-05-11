package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import g.AbstractC3170a;

/* loaded from: classes.dex */
public class c extends s implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f13149f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f13150a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13151b;

        public a(Context context) {
            this(context, c.j(context, 0));
        }

        public c a() {
            c cVar = new c(this.f13150a.f13070a, this.f13151b);
            this.f13150a.a(cVar.f13149f);
            cVar.setCancelable(this.f13150a.f13087r);
            if (this.f13150a.f13087r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f13150a.f13088s);
            cVar.setOnDismissListener(this.f13150a.f13089t);
            DialogInterface.OnKeyListener onKeyListener = this.f13150a.f13090u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f13150a.f13070a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13092w = listAdapter;
            bVar.f13093x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f13150a.f13087r = z10;
            return this;
        }

        public a e(View view) {
            this.f13150a.f13076g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f13150a.f13073d = drawable;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13091v = charSequenceArr;
            bVar.f13093x = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f13150a.f13077h = charSequence;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13081l = charSequence;
            bVar.f13083n = onClickListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13084o = charSequence;
            bVar.f13086q = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f13150a.f13090u = onKeyListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13078i = charSequence;
            bVar.f13080k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13150a;
            bVar.f13092w = listAdapter;
            bVar.f13093x = onClickListener;
            bVar.f13063I = i10;
            bVar.f13062H = true;
            return this;
        }

        public a n(int i10) {
            AlertController.b bVar = this.f13150a;
            bVar.f13075f = bVar.f13070a.getText(i10);
            return this;
        }

        public a o(CharSequence charSequence) {
            this.f13150a.f13075f = charSequence;
            return this;
        }

        public a p(View view) {
            AlertController.b bVar = this.f13150a;
            bVar.f13095z = view;
            bVar.f13094y = 0;
            bVar.f13059E = false;
            return this;
        }

        public c q() {
            c a10 = a();
            a10.show();
            return a10;
        }

        public a(Context context, int i10) {
            this.f13150a = new AlertController.b(new ContextThemeWrapper(context, c.j(context, i10)));
            this.f13151b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, j(context, i10));
        this.f13149f = new AlertController(getContext(), this, getWindow());
    }

    static int j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC3170a.f33077l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView i() {
        return this.f13149f.d();
    }

    @Override // androidx.appcompat.app.s, androidx.activity.j, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13149f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f13149f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f13149f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.s, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f13149f.p(charSequence);
    }
}
