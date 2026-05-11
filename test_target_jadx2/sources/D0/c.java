package D0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i, reason: collision with root package name */
    private int f1105i;

    /* renamed from: j, reason: collision with root package name */
    private int f1106j;

    /* renamed from: k, reason: collision with root package name */
    private LayoutInflater f1107k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f1106j = i10;
        this.f1105i = i10;
        this.f1107k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // D0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1107k.inflate(this.f1106j, viewGroup, false);
    }

    @Override // D0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1107k.inflate(this.f1105i, viewGroup, false);
    }
}
