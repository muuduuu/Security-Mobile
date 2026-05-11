package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.h0;
import g.AbstractC3170a;
import g.AbstractC3175f;
import g.AbstractC3176g;
import g.AbstractC3179j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private g f13402a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f13403b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f13404c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f13405d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f13406e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f13407f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f13408g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f13409h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f13410i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f13411j;

    /* renamed from: k, reason: collision with root package name */
    private int f13412k;

    /* renamed from: l, reason: collision with root package name */
    private Context f13413l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13414m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f13415n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13416o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f13417p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13418q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33054B);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f13410i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC3176g.f33209h, (ViewGroup) this, false);
        this.f13406e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC3176g.f33210i, (ViewGroup) this, false);
        this.f13403b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC3176g.f33212k, (ViewGroup) this, false);
        this.f13404c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f13417p == null) {
            this.f13417p = LayoutInflater.from(getContext());
        }
        return this.f13417p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f13408g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f13409h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13409h.getLayoutParams();
        rect.top += this.f13409h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f13402a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f13402a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f13402a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f13407f.setText(this.f13402a.h());
        }
        if (this.f13407f.getVisibility() != i10) {
            this.f13407f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f13411j);
        TextView textView = (TextView) findViewById(AbstractC3175f.f33172N);
        this.f13405d = textView;
        int i10 = this.f13412k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f13413l, i10);
        }
        this.f13407f = (TextView) findViewById(AbstractC3175f.f33165G);
        ImageView imageView = (ImageView) findViewById(AbstractC3175f.f33168J);
        this.f13408g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f13415n);
        }
        this.f13409h = (ImageView) findViewById(AbstractC3175f.f33194s);
        this.f13410i = (LinearLayout) findViewById(AbstractC3175f.f33188m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f13403b != null && this.f13414m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13403b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f13404c == null && this.f13406e == null) {
            return;
        }
        if (this.f13402a.m()) {
            if (this.f13404c == null) {
                g();
            }
            compoundButton = this.f13404c;
            view = this.f13406e;
        } else {
            if (this.f13406e == null) {
                c();
            }
            compoundButton = this.f13406e;
            view = this.f13404c;
        }
        if (z10) {
            compoundButton.setChecked(this.f13402a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f13406e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f13404c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f13402a.m()) {
            if (this.f13404c == null) {
                g();
            }
            compoundButton = this.f13404c;
        } else {
            if (this.f13406e == null) {
                c();
            }
            compoundButton = this.f13406e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f13418q = z10;
        this.f13414m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f13409h;
        if (imageView != null) {
            imageView.setVisibility((this.f13416o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f13402a.z() || this.f13418q;
        if (z10 || this.f13414m) {
            ImageView imageView = this.f13403b;
            if (imageView == null && drawable == null && !this.f13414m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f13414m) {
                this.f13403b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f13403b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f13403b.getVisibility() != 0) {
                this.f13403b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f13405d.getVisibility() != 8) {
                this.f13405d.setVisibility(8);
            }
        } else {
            this.f13405d.setText(charSequence);
            if (this.f13405d.getVisibility() != 0) {
                this.f13405d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        h0 v10 = h0.v(getContext(), attributeSet, AbstractC3179j.f33336T1, i10, 0);
        this.f13411j = v10.g(AbstractC3179j.f33344V1);
        this.f13412k = v10.n(AbstractC3179j.f33340U1, -1);
        this.f13414m = v10.a(AbstractC3179j.f33348W1, false);
        this.f13413l = context;
        this.f13415n = v10.g(AbstractC3179j.f33352X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC3170a.f33090y, 0);
        this.f13416o = obtainStyledAttributes.hasValue(0);
        v10.x();
        obtainStyledAttributes.recycle();
    }
}
