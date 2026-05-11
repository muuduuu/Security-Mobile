package com.facebook.react.devsupport;

import C4.i;
import Td.D;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.AbstractC1901p;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;
import r4.AbstractC4012a;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public class e0 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private C4.e f21589a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f21590b;

    /* renamed from: c, reason: collision with root package name */
    private Button f21591c;

    /* renamed from: d, reason: collision with root package name */
    private Button f21592d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21593e;

    /* renamed from: f, reason: collision with root package name */
    private i.a f21594f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f21595g;

    class a implements i.a {
        a() {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e0.b(e0.this);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C4.e) AbstractC4012a.c(e0.this.f21589a)).q();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C4.e) AbstractC4012a.c(e0.this.f21589a)).o();
        }
    }

    private static class e extends AsyncTask {

        /* renamed from: b, reason: collision with root package name */
        private static final Td.z f21600b = Td.z.g("application/json; charset=utf-8");

        /* renamed from: a, reason: collision with root package name */
        private final C4.e f21601a;

        private static JSONObject b(C4.j jVar) {
            return new JSONObject(AbstractC4929e.g("file", jVar.b(), "methodName", jVar.c(), "lineNumber", Integer.valueOf(jVar.a()), "column", Integer.valueOf(jVar.e())));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(C4.j... jVarArr) {
            try {
                String uri = Uri.parse(this.f21601a.v()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                Td.B b10 = new Td.B();
                for (C4.j jVar : jVarArr) {
                    b10.a(new D.a().x(uri).o(Td.E.create(f21600b, b(jVar).toString())).b()).j();
                }
            } catch (Exception e10) {
                AbstractC1721a.n("ReactNative", "Could not open stack frame", e10);
            }
            return null;
        }

        private e(C4.e eVar) {
            this.f21601a = eVar;
        }
    }

    private static class f extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String f21602a;

        /* renamed from: b, reason: collision with root package name */
        private final C4.j[] f21603b;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            private final TextView f21604a;

            /* renamed from: b, reason: collision with root package name */
            private final TextView f21605b;

            private a(View view) {
                this.f21604a = (TextView) view.findViewById(AbstractC1899n.f21902u);
                this.f21605b = (TextView) view.findViewById(AbstractC1899n.f21901t);
            }
        }

        public f(String str, C4.j[] jVarArr) {
            this.f21602a = str;
            this.f21603b = jVarArr;
            AbstractC4012a.c(str);
            AbstractC4012a.c(jVarArr);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f21603b.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return i10 == 0 ? this.f21602a : this.f21603b[i10 - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return i10 == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (i10 == 0) {
                TextView textView = view != null ? (TextView) view : (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1901p.f21913e, viewGroup, false);
                String str = this.f21602a;
                if (str == null) {
                    str = "<unknown title>";
                }
                textView.setText(str.replaceAll("\\x1b\\[[0-9;]*m", BuildConfig.FLAVOR));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC1901p.f21912d, viewGroup, false);
                view.setTag(new a(view));
            }
            C4.j jVar = this.f21603b[i10 - 1];
            a aVar = (a) view.getTag();
            aVar.f21604a.setText(jVar.c());
            aVar.f21605b.setText(l0.d(jVar));
            aVar.f21604a.setTextColor(jVar.d() ? -5592406 : -1);
            aVar.f21605b.setTextColor(jVar.d() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return i10 > 0;
        }
    }

    public e0(Context context) {
        super(context);
        this.f21593e = false;
        this.f21594f = new a();
        this.f21595g = new b();
    }

    static /* bridge */ /* synthetic */ C4.i b(e0 e0Var) {
        e0Var.getClass();
        return null;
    }

    public void c() {
        LayoutInflater.from(getContext()).inflate(AbstractC1901p.f21914f, this);
        ListView listView = (ListView) findViewById(AbstractC1899n.f21905x);
        this.f21590b = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(AbstractC1899n.f21904w);
        this.f21591c = button;
        button.setOnClickListener(new c());
        Button button2 = (Button) findViewById(AbstractC1899n.f21903v);
        this.f21592d = button2;
        button2.setOnClickListener(new d());
    }

    public void d() {
        String l10 = this.f21589a.l();
        C4.j[] B10 = this.f21589a.B();
        this.f21589a.u();
        Pair s10 = this.f21589a.s(Pair.create(l10, B10));
        f((String) s10.first, (C4.j[]) s10.second);
        this.f21589a.y();
    }

    public e0 e(C4.e eVar) {
        this.f21589a = eVar;
        return this;
    }

    public void f(String str, C4.j[] jVarArr) {
        this.f21590b.setAdapter((ListAdapter) new f(str, jVarArr));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        new e((C4.e) AbstractC4012a.c(this.f21589a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (C4.j) this.f21590b.getAdapter().getItem(i10));
    }

    public e0 g(C4.i iVar) {
        return this;
    }
}
