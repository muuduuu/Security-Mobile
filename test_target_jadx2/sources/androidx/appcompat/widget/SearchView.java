package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3170a;
import g.AbstractC3173d;
import g.AbstractC3175f;
import g.AbstractC3176g;
import g.AbstractC3177h;
import g.AbstractC3179j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class SearchView extends T implements androidx.appcompat.view.c {

    /* renamed from: I0, reason: collision with root package name */
    static final o f13798I0;

    /* renamed from: A, reason: collision with root package name */
    private Rect f13799A;

    /* renamed from: A0, reason: collision with root package name */
    private Runnable f13800A0;

    /* renamed from: B, reason: collision with root package name */
    private int[] f13801B;

    /* renamed from: B0, reason: collision with root package name */
    private final WeakHashMap f13802B0;

    /* renamed from: C, reason: collision with root package name */
    private int[] f13803C;

    /* renamed from: C0, reason: collision with root package name */
    private final View.OnClickListener f13804C0;

    /* renamed from: D, reason: collision with root package name */
    private final ImageView f13805D;

    /* renamed from: D0, reason: collision with root package name */
    View.OnKeyListener f13806D0;

    /* renamed from: E, reason: collision with root package name */
    private final Drawable f13807E;

    /* renamed from: E0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f13808E0;

    /* renamed from: F, reason: collision with root package name */
    private final int f13809F;

    /* renamed from: F0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f13810F0;

    /* renamed from: G, reason: collision with root package name */
    private final int f13811G;

    /* renamed from: G0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f13812G0;

    /* renamed from: H, reason: collision with root package name */
    private final Intent f13813H;

    /* renamed from: H0, reason: collision with root package name */
    private TextWatcher f13814H0;

    /* renamed from: I, reason: collision with root package name */
    private final Intent f13815I;

    /* renamed from: J, reason: collision with root package name */
    private final CharSequence f13816J;

    /* renamed from: K, reason: collision with root package name */
    private m f13817K;

    /* renamed from: h0, reason: collision with root package name */
    private l f13818h0;

    /* renamed from: i0, reason: collision with root package name */
    View.OnFocusChangeListener f13819i0;

    /* renamed from: j0, reason: collision with root package name */
    private View.OnClickListener f13820j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f13821k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f13822l0;

    /* renamed from: m0, reason: collision with root package name */
    D0.a f13823m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f13824n0;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f13825o0;

    /* renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f13826p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f13827p0;

    /* renamed from: q, reason: collision with root package name */
    private final View f13828q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f13829q0;

    /* renamed from: r, reason: collision with root package name */
    private final View f13830r;

    /* renamed from: r0, reason: collision with root package name */
    private int f13831r0;

    /* renamed from: s, reason: collision with root package name */
    private final View f13832s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f13833s0;

    /* renamed from: t, reason: collision with root package name */
    final ImageView f13834t;

    /* renamed from: t0, reason: collision with root package name */
    private CharSequence f13835t0;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f13836u;

    /* renamed from: u0, reason: collision with root package name */
    private CharSequence f13837u0;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f13838v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f13839v0;

    /* renamed from: w, reason: collision with root package name */
    final ImageView f13840w;

    /* renamed from: w0, reason: collision with root package name */
    private int f13841w0;

    /* renamed from: x, reason: collision with root package name */
    private final View f13842x;

    /* renamed from: x0, reason: collision with root package name */
    SearchableInfo f13843x0;

    /* renamed from: y, reason: collision with root package name */
    private q f13844y;

    /* renamed from: y0, reason: collision with root package name */
    private Bundle f13845y0;

    /* renamed from: z, reason: collision with root package name */
    private Rect f13846z;

    /* renamed from: z0, reason: collision with root package name */
    private final Runnable f13847z0;

    public static class SearchAutoComplete extends C1402d {

        /* renamed from: e, reason: collision with root package name */
        private int f13848e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f13849f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f13850g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f13851h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC3170a.f33078m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f13798I0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f13850g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f13850g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f13848e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1402d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f13850g) {
                removeCallbacks(this.f13851h);
                post(this.f13851h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f13849f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f13849f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f13849f.hasFocus() && getVisibility() == 0) {
                this.f13850g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f13850g = false;
                removeCallbacks(this.f13851h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f13850g = true;
                    return;
                }
                this.f13850g = false;
                removeCallbacks(this.f13851h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f13849f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f13848e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f13851h = new a();
            this.f13848e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D0.a aVar = SearchView.this.f13823m0;
            if (aVar instanceof b0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f13819i0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f13834t) {
                searchView.V();
                return;
            }
            if (view == searchView.f13838v) {
                searchView.R();
                return;
            }
            if (view == searchView.f13836u) {
                searchView.W();
            } else if (view == searchView.f13840w) {
                searchView.a0();
            } else if (view == searchView.f13826p) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f13843x0 == null) {
                return false;
            }
            if (searchView.f13826p.isPopupShowing() && SearchView.this.f13826p.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f13826p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f13826p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean g(String str);

        boolean i(String str);
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f13863a;

        /* renamed from: b, reason: collision with root package name */
        private Method f13864b;

        /* renamed from: c, reason: collision with root package name */
        private Method f13865c;

        o() {
            this.f13863a = null;
            this.f13864b = null;
            this.f13865c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f13863a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f13864b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f13865c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13864b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13863a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13865c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends F0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f13866c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13866c + "}";
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f13866c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13866c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f13867a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f13868b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f13869c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f13870d;

        /* renamed from: e, reason: collision with root package name */
        private final int f13871e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f13872f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f13871e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f13868b = new Rect();
            this.f13870d = new Rect();
            this.f13869c = new Rect();
            a(rect, rect2);
            this.f13867a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f13868b.set(rect);
            this.f13870d.set(rect);
            Rect rect3 = this.f13870d;
            int i10 = this.f13871e;
            rect3.inset(-i10, -i10);
            this.f13869c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f13872f;
                    if (z11 && !this.f13870d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f13872f;
                        this.f13872f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f13868b.contains(x10, y10)) {
                    this.f13872f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f13869c.contains(x10, y10)) {
                Rect rect = this.f13869c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f13867a.getWidth() / 2, this.f13867a.getHeight() / 2);
            }
            return this.f13867a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f13798I0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f13837u0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f13845y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f13843x0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = b0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f13843x0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = b0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f13843x0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = b0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), b0.o(cursor, "suggest_intent_extra_data"), b0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f13845y0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f13826p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f13801B);
        getLocationInWindow(this.f13803C);
        int[] iArr = this.f13801B;
        int i10 = iArr[1];
        int[] iArr2 = this.f13803C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f13821k0 || this.f13807E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f13826p.getTextSize() * 1.25d);
        this.f13807E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f13807E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f13843x0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f13843x0.getVoiceSearchLaunchWebSearch() ? this.f13813H : this.f13843x0.getVoiceSearchLaunchRecognizer() ? this.f13815I : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f13824n0 || this.f13833s0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.f13823m0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f13847z0);
    }

    private void c0(int i10) {
        Editable text = this.f13826p.getText();
        Cursor b10 = this.f13823m0.b();
        if (b10 == null) {
            return;
        }
        if (!b10.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence c10 = this.f13823m0.c(b10);
        if (c10 != null) {
            setQuery(c10);
        } else {
            setQuery(text);
        }
    }

    private void e0() {
        boolean isEmpty = TextUtils.isEmpty(this.f13826p.getText());
        this.f13838v.setVisibility(!isEmpty || (this.f13821k0 && !this.f13839v0) ? 0 : 8);
        Drawable drawable = this.f13838v.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f13826p;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC3173d.f33105e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC3173d.f33106f);
    }

    private void h0() {
        this.f13826p.setThreshold(this.f13843x0.getSuggestThreshold());
        this.f13826p.setImeOptions(this.f13843x0.getImeOptions());
        int inputType = this.f13843x0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f13843x0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f13826p.setInputType(inputType);
        D0.a aVar = this.f13823m0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f13843x0.getSuggestAuthority() != null) {
            b0 b0Var = new b0(getContext(), this, this.f13843x0, this.f13802B0);
            this.f13823m0 = b0Var;
            this.f13826p.setAdapter(b0Var);
            ((b0) this.f13823m0).x(this.f13827p0 ? 2 : 1);
        }
    }

    private void i0() {
        this.f13832s.setVisibility((N() && (this.f13836u.getVisibility() == 0 || this.f13840w.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.f13836u.setVisibility((this.f13824n0 && N() && hasFocus() && (z10 || !this.f13833s0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.f13822l0 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f13826p.getText());
        this.f13834t.setVisibility(i11);
        j0(!isEmpty);
        this.f13828q.setVisibility(z10 ? 8 : 0);
        if (this.f13805D.getDrawable() != null && !this.f13821k0) {
            i10 = 0;
        }
        this.f13805D.setVisibility(i10);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f13833s0 && !L() && z10) {
            this.f13836u.setVisibility(8);
            i10 = 0;
        }
        this.f13840w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f13826p.setText(charSequence);
        this.f13826p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f13842x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f13830r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = s0.b(this);
            int dimensionPixelSize = this.f13821k0 ? resources.getDimensionPixelSize(AbstractC3173d.f33103c) + resources.getDimensionPixelSize(AbstractC3173d.f33104d) : 0;
            this.f13826p.getDropDownBackground().getPadding(rect);
            this.f13826p.setDropDownHorizontalOffset(b10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f13826p.setDropDownWidth((((this.f13842x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f13826p);
            return;
        }
        o oVar = f13798I0;
        oVar.b(this.f13826p);
        oVar.a(this.f13826p);
    }

    public boolean L() {
        return this.f13822l0;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f13826p.getText())) {
            this.f13826p.setText(BuildConfig.FLAVOR);
            this.f13826p.requestFocus();
            this.f13826p.setImeVisibility(true);
        } else if (this.f13821k0) {
            l lVar = this.f13818h0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    boolean S(int i10, int i11, String str) {
        Q(i10, 0, null);
        this.f13826p.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i10) {
        c0(i10);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f13826p.requestFocus();
        this.f13826p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f13820j0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f13826p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f13817K;
        if (mVar == null || !mVar.i(text.toString())) {
            if (this.f13843x0 != null) {
                P(0, null, text.toString());
            }
            this.f13826p.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f13843x0 != null && this.f13823m0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f13826p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f13826p.setSelection(i10 == 21 ? 0 : this.f13826p.length());
                this.f13826p.setListSelection(0);
                this.f13826p.clearListSelection();
                this.f13826p.b();
                return true;
            }
            if (i10 == 19) {
                this.f13826p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f13826p.getText();
        this.f13837u0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        if (this.f13817K != null && !TextUtils.equals(charSequence, this.f13835t0)) {
            this.f13817K.g(charSequence.toString());
        }
        this.f13835t0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f13826p.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f13843x0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.f13813H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.f13815I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f13839v0) {
            return;
        }
        this.f13839v0 = true;
        int imeOptions = this.f13826p.getImeOptions();
        this.f13841w0 = imeOptions;
        this.f13826p.setImeOptions(imeOptions | 33554432);
        this.f13826p.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f13829q0 = true;
        super.clearFocus();
        this.f13826p.clearFocus();
        this.f13826p.setImeVisibility(false);
        this.f13829q0 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f13826p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f13826p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f13837u0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0(BuildConfig.FLAVOR, false);
        clearFocus();
        k0(true);
        this.f13826p.setImeOptions(this.f13841w0);
        this.f13839v0 = false;
    }

    void f0() {
        int[] iArr = this.f13826p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f13830r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f13832s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f13826p.getImeOptions();
    }

    public int getInputType() {
        return this.f13826p.getInputType();
    }

    public int getMaxWidth() {
        return this.f13831r0;
    }

    public CharSequence getQuery() {
        return this.f13826p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f13825o0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f13843x0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f13816J : getContext().getText(this.f13843x0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f13811G;
    }

    int getSuggestionRowLayout() {
        return this.f13809F;
    }

    public D0.a getSuggestionsAdapter() {
        return this.f13823m0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f13847z0);
        post(this.f13800A0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f13826p, this.f13846z);
            Rect rect = this.f13799A;
            Rect rect2 = this.f13846z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f13844y;
            if (qVar != null) {
                qVar.a(this.f13799A, this.f13846z);
                return;
            }
            q qVar2 = new q(this.f13799A, this.f13846z, this.f13826p);
            this.f13844y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f13831r0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f13831r0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f13831r0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f13866c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f13866c = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f13829q0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f13826p.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f13845y0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f13821k0 == z10) {
            return;
        }
        this.f13821k0 = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.f13826p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f13826p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f13831r0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f13818h0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f13819i0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f13817K = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f13820j0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f13825o0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f13827p0 = z10;
        D0.a aVar = this.f13823m0;
        if (aVar instanceof b0) {
            ((b0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f13843x0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K10 = K();
        this.f13833s0 = K10;
        if (K10) {
            this.f13826p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f13824n0 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(D0.a aVar) {
        this.f13823m0 = aVar;
        this.f13826p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33059G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13846z = new Rect();
        this.f13799A = new Rect();
        this.f13801B = new int[2];
        this.f13803C = new int[2];
        this.f13847z0 = new b();
        this.f13800A0 = new c();
        this.f13802B0 = new WeakHashMap();
        f fVar = new f();
        this.f13804C0 = fVar;
        this.f13806D0 = new g();
        h hVar = new h();
        this.f13808E0 = hVar;
        i iVar = new i();
        this.f13810F0 = iVar;
        j jVar = new j();
        this.f13812G0 = jVar;
        this.f13814H0 = new a();
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33390f2, i10, 0);
        AbstractC1484a0.o0(this, context, AbstractC3179j.f33390f2, attributeSet, v10.r(), i10, 0);
        LayoutInflater.from(context).inflate(v10.n(AbstractC3179j.f33440p2, AbstractC3176g.f33219r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC3175f.f33163E);
        this.f13826p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f13828q = findViewById(AbstractC3175f.f33159A);
        View findViewById = findViewById(AbstractC3175f.f33162D);
        this.f13830r = findViewById;
        View findViewById2 = findViewById(AbstractC3175f.f33169K);
        this.f13832s = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC3175f.f33200y);
        this.f13834t = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC3175f.f33160B);
        this.f13836u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC3175f.f33201z);
        this.f13838v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC3175f.f33164F);
        this.f13840w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC3175f.f33161C);
        this.f13805D = imageView5;
        AbstractC1484a0.u0(findViewById, v10.g(AbstractC3179j.f33445q2));
        AbstractC1484a0.u0(findViewById2, v10.g(AbstractC3179j.f33465u2));
        imageView.setImageDrawable(v10.g(AbstractC3179j.f33460t2));
        imageView2.setImageDrawable(v10.g(AbstractC3179j.f33430n2));
        imageView3.setImageDrawable(v10.g(AbstractC3179j.f33415k2));
        imageView4.setImageDrawable(v10.g(AbstractC3179j.f33475w2));
        imageView5.setImageDrawable(v10.g(AbstractC3179j.f33460t2));
        this.f13807E = v10.g(AbstractC3179j.f33455s2);
        m0.a(imageView, getResources().getString(AbstractC3177h.f33235n));
        this.f13809F = v10.n(AbstractC3179j.f33470v2, AbstractC3176g.f33218q);
        this.f13811G = v10.n(AbstractC3179j.f33420l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f13814H0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f13806D0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(AbstractC3179j.f33435o2, true));
        int f10 = v10.f(AbstractC3179j.f33400h2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f13816J = v10.p(AbstractC3179j.f33425m2);
        this.f13825o0 = v10.p(AbstractC3179j.f33450r2);
        int k10 = v10.k(AbstractC3179j.f33410j2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(AbstractC3179j.f33405i2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(AbstractC3179j.f33395g2, true));
        v10.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f13813H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f13815I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f13842x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f13821k0);
        g0();
    }
}
