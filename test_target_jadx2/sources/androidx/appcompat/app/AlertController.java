package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.T;
import androidx.core.view.AbstractC1484a0;
import androidx.core.widget.NestedScrollView;
import g.AbstractC3170a;
import g.AbstractC3175f;
import g.AbstractC3179j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f13007A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f13009C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f13010D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f13011E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f13012F;

    /* renamed from: G, reason: collision with root package name */
    private View f13013G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f13014H;

    /* renamed from: J, reason: collision with root package name */
    private int f13016J;

    /* renamed from: K, reason: collision with root package name */
    private int f13017K;

    /* renamed from: L, reason: collision with root package name */
    int f13018L;

    /* renamed from: M, reason: collision with root package name */
    int f13019M;

    /* renamed from: N, reason: collision with root package name */
    int f13020N;

    /* renamed from: O, reason: collision with root package name */
    int f13021O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f13022P;

    /* renamed from: R, reason: collision with root package name */
    Handler f13024R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13026a;

    /* renamed from: b, reason: collision with root package name */
    final s f13027b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f13028c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13029d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f13030e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f13031f;

    /* renamed from: g, reason: collision with root package name */
    ListView f13032g;

    /* renamed from: h, reason: collision with root package name */
    private View f13033h;

    /* renamed from: i, reason: collision with root package name */
    private int f13034i;

    /* renamed from: j, reason: collision with root package name */
    private int f13035j;

    /* renamed from: k, reason: collision with root package name */
    private int f13036k;

    /* renamed from: l, reason: collision with root package name */
    private int f13037l;

    /* renamed from: m, reason: collision with root package name */
    private int f13038m;

    /* renamed from: o, reason: collision with root package name */
    Button f13040o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f13041p;

    /* renamed from: q, reason: collision with root package name */
    Message f13042q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f13043r;

    /* renamed from: s, reason: collision with root package name */
    Button f13044s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f13045t;

    /* renamed from: u, reason: collision with root package name */
    Message f13046u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f13047v;

    /* renamed from: w, reason: collision with root package name */
    Button f13048w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f13049x;

    /* renamed from: y, reason: collision with root package name */
    Message f13050y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f13051z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13039n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f13008B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f13015I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f13023Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f13025S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f13052a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13053b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33375c2);
            this.f13053b = obtainStyledAttributes.getDimensionPixelOffset(AbstractC3179j.f33380d2, -1);
            this.f13052a = obtainStyledAttributes.getDimensionPixelOffset(AbstractC3179j.f33385e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f13052a, getPaddingRight(), z11 ? getPaddingBottom() : this.f13053b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f13040o || (message3 = alertController.f13042q) == null) ? (view != alertController.f13044s || (message2 = alertController.f13046u) == null) ? (view != alertController.f13048w || (message = alertController.f13050y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f13024R.obtainMessage(1, alertController2.f13027b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f13055A;

        /* renamed from: B, reason: collision with root package name */
        public int f13056B;

        /* renamed from: C, reason: collision with root package name */
        public int f13057C;

        /* renamed from: D, reason: collision with root package name */
        public int f13058D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f13060F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f13061G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f13062H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f13064J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f13065K;

        /* renamed from: L, reason: collision with root package name */
        public String f13066L;

        /* renamed from: M, reason: collision with root package name */
        public String f13067M;

        /* renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f13068N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f13070a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f13071b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f13073d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f13075f;

        /* renamed from: g, reason: collision with root package name */
        public View f13076g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f13077h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f13078i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f13079j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f13080k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f13081l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f13082m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f13083n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f13084o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f13085p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f13086q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f13088s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f13089t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f13090u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f13091v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f13092w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f13093x;

        /* renamed from: y, reason: collision with root package name */
        public int f13094y;

        /* renamed from: z, reason: collision with root package name */
        public View f13095z;

        /* renamed from: c, reason: collision with root package name */
        public int f13072c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f13074e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f13059E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f13063I = -1;

        /* renamed from: O, reason: collision with root package name */
        public boolean f13069O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f13087r = true;

        class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f13096a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f13096a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f13060F;
                if (zArr != null && zArr[i10]) {
                    this.f13096a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0242b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f13098a;

            /* renamed from: b, reason: collision with root package name */
            private final int f13099b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f13100c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f13101d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0242b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f13100c = recycleListView;
                this.f13101d = alertController;
                Cursor cursor2 = getCursor();
                this.f13098a = cursor2.getColumnIndexOrThrow(b.this.f13066L);
                this.f13099b = cursor2.getColumnIndexOrThrow(b.this.f13067M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f13098a));
                this.f13100c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f13099b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f13071b.inflate(this.f13101d.f13019M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f13103a;

            c(AlertController alertController) {
                this.f13103a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f13093x.onClick(this.f13103a.f13027b, i10);
                if (b.this.f13062H) {
                    return;
                }
                this.f13103a.f13027b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f13105a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f13106b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f13105a = recycleListView;
                this.f13106b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f13060F;
                if (zArr != null) {
                    zArr[i10] = this.f13105a.isItemChecked(i10);
                }
                b.this.f13064J.onClick(this.f13106b.f13027b, i10, this.f13105a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f13070a = context;
            this.f13071b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f13071b.inflate(alertController.f13018L, (ViewGroup) null);
            if (this.f13061G) {
                listAdapter = this.f13065K == null ? new a(this.f13070a, alertController.f13019M, R.id.text1, this.f13091v, recycleListView) : new C0242b(this.f13070a, this.f13065K, false, recycleListView, alertController);
            } else {
                int i10 = this.f13062H ? alertController.f13020N : alertController.f13021O;
                if (this.f13065K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f13070a, i10, this.f13065K, new String[]{this.f13066L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f13092w;
                    if (listAdapter == null) {
                        listAdapter = new d(this.f13070a, i10, R.id.text1, this.f13091v);
                    }
                }
            }
            alertController.f13014H = listAdapter;
            alertController.f13015I = this.f13063I;
            if (this.f13093x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f13064J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13068N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f13062H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f13061G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f13032g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f13076g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f13075f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f13073d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f13072c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f13074e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f13077h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f13078i;
            if (charSequence3 != null || this.f13079j != null) {
                alertController.j(-1, charSequence3, this.f13080k, null, this.f13079j);
            }
            CharSequence charSequence4 = this.f13081l;
            if (charSequence4 != null || this.f13082m != null) {
                alertController.j(-2, charSequence4, this.f13083n, null, this.f13082m);
            }
            CharSequence charSequence5 = this.f13084o;
            if (charSequence5 != null || this.f13085p != null) {
                alertController.j(-3, charSequence5, this.f13086q, null, this.f13085p);
            }
            if (this.f13091v != null || this.f13065K != null || this.f13092w != null) {
                b(alertController);
            }
            View view2 = this.f13095z;
            if (view2 != null) {
                if (this.f13059E) {
                    alertController.s(view2, this.f13055A, this.f13056B, this.f13057C, this.f13058D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f13094y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f13108a;

        public c(DialogInterface dialogInterface) {
            this.f13108a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f13108a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, s sVar, Window window) {
        this.f13026a = context;
        this.f13027b = sVar;
        this.f13028c = window;
        this.f13024R = new c(sVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3179j.f33265F, AbstractC3170a.f33076k, 0);
        this.f13016J = obtainStyledAttributes.getResourceId(AbstractC3179j.f33270G, 0);
        this.f13017K = obtainStyledAttributes.getResourceId(AbstractC3179j.f33280I, 0);
        this.f13018L = obtainStyledAttributes.getResourceId(AbstractC3179j.f33290K, 0);
        this.f13019M = obtainStyledAttributes.getResourceId(AbstractC3179j.f33295L, 0);
        this.f13020N = obtainStyledAttributes.getResourceId(AbstractC3179j.f33305N, 0);
        this.f13021O = obtainStyledAttributes.getResourceId(AbstractC3179j.f33285J, 0);
        this.f13022P = obtainStyledAttributes.getBoolean(AbstractC3179j.f33300M, true);
        this.f13029d = obtainStyledAttributes.getDimensionPixelSize(AbstractC3179j.f33275H, 0);
        obtainStyledAttributes.recycle();
        sVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f13017K;
        return i10 == 0 ? this.f13016J : this.f13023Q == 1 ? i10 : this.f13016J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f13028c.findViewById(AbstractC3175f.f33198w);
        View findViewById2 = this.f13028c.findViewById(AbstractC3175f.f33197v);
        AbstractC1484a0.J0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f13040o = button;
        button.setOnClickListener(this.f13025S);
        if (TextUtils.isEmpty(this.f13041p) && this.f13043r == null) {
            this.f13040o.setVisibility(8);
            i10 = 0;
        } else {
            this.f13040o.setText(this.f13041p);
            Drawable drawable = this.f13043r;
            if (drawable != null) {
                int i11 = this.f13029d;
                drawable.setBounds(0, 0, i11, i11);
                this.f13040o.setCompoundDrawables(this.f13043r, null, null, null);
            }
            this.f13040o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f13044s = button2;
        button2.setOnClickListener(this.f13025S);
        if (TextUtils.isEmpty(this.f13045t) && this.f13047v == null) {
            this.f13044s.setVisibility(8);
        } else {
            this.f13044s.setText(this.f13045t);
            Drawable drawable2 = this.f13047v;
            if (drawable2 != null) {
                int i12 = this.f13029d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f13044s.setCompoundDrawables(this.f13047v, null, null, null);
            }
            this.f13044s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f13048w = button3;
        button3.setOnClickListener(this.f13025S);
        if (TextUtils.isEmpty(this.f13049x) && this.f13051z == null) {
            this.f13048w.setVisibility(8);
        } else {
            this.f13048w.setText(this.f13049x);
            Drawable drawable3 = this.f13051z;
            if (drawable3 != null) {
                int i13 = this.f13029d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f13048w.setCompoundDrawables(this.f13051z, null, null, null);
            }
            this.f13048w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f13026a)) {
            if (i10 == 1) {
                b(this.f13040o);
            } else if (i10 == 2) {
                b(this.f13044s);
            } else if (i10 == 4) {
                b(this.f13048w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13028c.findViewById(AbstractC3175f.f33199x);
        this.f13007A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13007A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f13012F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f13031f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f13007A.removeView(this.f13012F);
        if (this.f13032g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f13007A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f13007A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f13032g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f13033h;
        if (view == null) {
            view = this.f13034i != 0 ? LayoutInflater.from(this.f13026a).inflate(this.f13034i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f13028c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f13028c.findViewById(AbstractC3175f.f33190o);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f13039n) {
            frameLayout.setPadding(this.f13035j, this.f13036k, this.f13037l, this.f13038m);
        }
        if (this.f13032g != null) {
            ((LinearLayout.LayoutParams) ((T.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f13013G != null) {
            viewGroup.addView(this.f13013G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f13028c.findViewById(AbstractC3175f.f33174P).setVisibility(8);
            return;
        }
        this.f13010D = (ImageView) this.f13028c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f13030e) || !this.f13022P) {
            this.f13028c.findViewById(AbstractC3175f.f33174P).setVisibility(8);
            this.f13010D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f13028c.findViewById(AbstractC3175f.f33186k);
        this.f13011E = textView;
        textView.setText(this.f13030e);
        int i10 = this.f13008B;
        if (i10 != 0) {
            this.f13010D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f13009C;
        if (drawable != null) {
            this.f13010D.setImageDrawable(drawable);
        } else {
            this.f13011E.setPadding(this.f13010D.getPaddingLeft(), this.f13010D.getPaddingTop(), this.f13010D.getPaddingRight(), this.f13010D.getPaddingBottom());
            this.f13010D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f13028c.findViewById(AbstractC3175f.f33196u);
        View findViewById4 = findViewById3.findViewById(AbstractC3175f.f33175Q);
        View findViewById5 = findViewById3.findViewById(AbstractC3175f.f33189n);
        View findViewById6 = findViewById3.findViewById(AbstractC3175f.f33187l);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(AbstractC3175f.f33191p);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(AbstractC3175f.f33175Q);
        View findViewById8 = viewGroup.findViewById(AbstractC3175f.f33189n);
        View findViewById9 = viewGroup.findViewById(AbstractC3175f.f33187l);
        ViewGroup h10 = h(findViewById7, findViewById4);
        ViewGroup h11 = h(findViewById8, findViewById5);
        ViewGroup h12 = h(findViewById9, findViewById6);
        u(h11);
        t(h12);
        w(h10);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (h10 == null || h10.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (h12 == null || h12.getVisibility() == 8) ? false : true;
        if (!z12 && h11 != null && (findViewById2 = h11.findViewById(AbstractC3175f.f33170L)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f13007A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f13031f == null && this.f13032g == null) ? null : h10.findViewById(AbstractC3175f.f33173O);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h11 != null && (findViewById = h11.findViewById(AbstractC3175f.f33171M)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f13032g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f13032g;
            if (view == null) {
                view = this.f13007A;
            }
            if (view != null) {
                o(h11, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f13032g;
        if (listView2 == null || (listAdapter = this.f13014H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f13015I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC3170a.f33075j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f13026a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f13032g;
    }

    public void e() {
        this.f13027b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13007A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13007A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13024R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f13049x = charSequence;
            this.f13050y = message;
            this.f13051z = drawable;
        } else if (i10 == -2) {
            this.f13045t = charSequence;
            this.f13046u = message;
            this.f13047v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f13041p = charSequence;
            this.f13042q = message;
            this.f13043r = drawable;
        }
    }

    public void k(View view) {
        this.f13013G = view;
    }

    public void l(int i10) {
        this.f13009C = null;
        this.f13008B = i10;
        ImageView imageView = this.f13010D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13010D.setImageResource(this.f13008B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f13009C = drawable;
        this.f13008B = 0;
        ImageView imageView = this.f13010D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13010D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f13031f = charSequence;
        TextView textView = this.f13012F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f13030e = charSequence;
        TextView textView = this.f13011E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f13033h = null;
        this.f13034i = i10;
        this.f13039n = false;
    }

    public void r(View view) {
        this.f13033h = view;
        this.f13034i = 0;
        this.f13039n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f13033h = view;
        this.f13034i = 0;
        this.f13039n = true;
        this.f13035j = i10;
        this.f13036k = i11;
        this.f13037l = i12;
        this.f13038m = i13;
    }
}
