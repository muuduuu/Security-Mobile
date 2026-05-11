package D0;

import D0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f1094a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f1095b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f1096c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f1097d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1098e;

    /* renamed from: f, reason: collision with root package name */
    protected C0019a f1099f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f1100g;

    /* renamed from: h, reason: collision with root package name */
    protected D0.b f1101h;

    /* renamed from: D0.a$a, reason: collision with other inner class name */
    private class C0019a extends ContentObserver {
        C0019a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1094a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1094a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    @Override // D0.b.a
    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override // D0.b.a
    public Cursor b() {
        return this.f1096c;
    }

    @Override // D0.b.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f1095b = true;
        } else {
            this.f1095b = false;
        }
        boolean z10 = cursor != null;
        this.f1096c = cursor;
        this.f1094a = z10;
        this.f1097d = context;
        this.f1098e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f1099f = new C0019a();
            this.f1100g = new b();
        } else {
            this.f1099f = null;
            this.f1100g = null;
        }
        if (z10) {
            C0019a c0019a = this.f1099f;
            if (c0019a != null) {
                cursor.registerContentObserver(c0019a);
            }
            DataSetObserver dataSetObserver = this.f1100g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1094a || (cursor = this.f1096c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1094a) {
            return null;
        }
        this.f1096c.moveToPosition(i10);
        if (view == null) {
            view = g(this.f1097d, this.f1096c, viewGroup);
        }
        e(view, this.f1097d, this.f1096c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1101h == null) {
            this.f1101h = new D0.b(this);
        }
        return this.f1101h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f1094a || (cursor = this.f1096c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f1096c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f1094a && (cursor = this.f1096c) != null && cursor.moveToPosition(i10)) {
            return this.f1096c.getLong(this.f1098e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f1094a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1096c.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f1097d, this.f1096c, viewGroup);
            }
            e(view, this.f1097d, this.f1096c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f1095b || (cursor = this.f1096c) == null || cursor.isClosed()) {
            return;
        }
        this.f1094a = this.f1096c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f1096c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0019a c0019a = this.f1099f;
            if (c0019a != null) {
                cursor2.unregisterContentObserver(c0019a);
            }
            DataSetObserver dataSetObserver = this.f1100g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1096c = cursor;
        if (cursor != null) {
            C0019a c0019a2 = this.f1099f;
            if (c0019a2 != null) {
                cursor.registerContentObserver(c0019a2);
            }
            DataSetObserver dataSetObserver2 = this.f1100g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1098e = cursor.getColumnIndexOrThrow("_id");
            this.f1094a = true;
            notifyDataSetChanged();
        } else {
            this.f1098e = -1;
            this.f1094a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
