package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import g.AbstractC3170a;
import g.AbstractC3175f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class b0 extends D0.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    private final SearchView f14026l;

    /* renamed from: m, reason: collision with root package name */
    private final SearchableInfo f14027m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f14028n;

    /* renamed from: o, reason: collision with root package name */
    private final WeakHashMap f14029o;

    /* renamed from: p, reason: collision with root package name */
    private final int f14030p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14031q;

    /* renamed from: r, reason: collision with root package name */
    private int f14032r;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f14033s;

    /* renamed from: t, reason: collision with root package name */
    private int f14034t;

    /* renamed from: u, reason: collision with root package name */
    private int f14035u;

    /* renamed from: v, reason: collision with root package name */
    private int f14036v;

    /* renamed from: w, reason: collision with root package name */
    private int f14037w;

    /* renamed from: x, reason: collision with root package name */
    private int f14038x;

    /* renamed from: y, reason: collision with root package name */
    private int f14039y;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f14040a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f14041b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f14042c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f14043d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f14044e;

        public a(View view) {
            this.f14040a = (TextView) view.findViewById(R.id.text1);
            this.f14041b = (TextView) view.findViewById(R.id.text2);
            this.f14042c = (ImageView) view.findViewById(R.id.icon1);
            this.f14043d = (ImageView) view.findViewById(R.id.icon2);
            this.f14044e = (ImageView) view.findViewById(AbstractC3175f.f33193r);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f14031q = false;
        this.f14032r = 1;
        this.f14034t = -1;
        this.f14035u = -1;
        this.f14036v = -1;
        this.f14037w = -1;
        this.f14038x = -1;
        this.f14039y = -1;
        this.f14026l = searchView;
        this.f14027m = searchableInfo;
        this.f14030p = searchView.getSuggestionCommitIconResId();
        this.f14028n = context;
        this.f14029o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f14029o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14029o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f14033s == null) {
            TypedValue typedValue = new TypedValue();
            this.f14028n.getTheme().resolveAttribute(AbstractC3170a.f33063K, typedValue, true);
            this.f14033s = this.f14028n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f14033s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f14028n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f14029o.containsKey(flattenToShortString)) {
            Drawable m10 = m(componentName);
            this.f14029o.put(flattenToShortString, m10 != null ? m10.getConstantState() : null);
            return m10;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14029o.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f14028n.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f14027m.getSearchActivity());
        return n10 != null ? n10 : this.f14028n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f14028n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f14028n.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable e10 = androidx.core.content.a.e(this.f14028n, parseInt);
            A(str2, e10);
            return e10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f14037w;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        return s10 != null ? s10 : p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f14038x;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // D0.a, D0.b.a
    public void a(Cursor cursor) {
        if (this.f14031q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f14034t = cursor.getColumnIndex("suggest_text_1");
                this.f14035u = cursor.getColumnIndex("suggest_text_2");
                this.f14036v = cursor.getColumnIndex("suggest_text_2_url");
                this.f14037w = cursor.getColumnIndex("suggest_icon_1");
                this.f14038x = cursor.getColumnIndex("suggest_icon_2");
                this.f14039y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // D0.a, D0.b.a
    public CharSequence c(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (this.f14027m.shouldRewriteQueryFromData() && (o11 = o(cursor, "suggest_intent_data")) != null) {
            return o11;
        }
        if (!this.f14027m.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o10;
    }

    @Override // D0.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f14026l.getVisibility() == 0 && this.f14026l.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f14027m, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // D0.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f14039y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f14040a != null) {
            z(aVar.f14040a, w(cursor, this.f14034t));
        }
        if (aVar.f14041b != null) {
            String w10 = w(cursor, this.f14036v);
            CharSequence l10 = w10 != null ? l(w10) : w(cursor, this.f14035u);
            if (TextUtils.isEmpty(l10)) {
                TextView textView = aVar.f14040a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f14040a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f14040a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f14040a.setMaxLines(1);
                }
            }
            z(aVar.f14041b, l10);
        }
        ImageView imageView = aVar.f14042c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f14043d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f14032r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f14044e.setVisibility(8);
            return;
        }
        aVar.f14044e.setVisibility(0);
        aVar.f14044e.setTag(aVar.f14040a.getText());
        aVar.f14044e.setOnClickListener(this);
    }

    @Override // D0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f14028n, b(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f14040a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // D0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View h10 = h(this.f14028n, b(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f14040a.setText(e10.toString());
            }
            return h10;
        }
    }

    @Override // D0.c, D0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(AbstractC3175f.f33193r)).setImageResource(this.f14030p);
        return h10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14026l.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f14028n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f14028n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.f14032r = i10;
    }
}
