package N0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private Context f6526b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f6527c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f6526b = context;
        this.f6527c = uri;
    }

    private static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // N0.a
    public boolean a() {
        return b.a(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public boolean b() {
        return b.b(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public a c(String str) {
        Uri o10 = o(this.f6526b, this.f6527c, "vnd.android.document/directory", str);
        if (o10 != null) {
            return new d(this, this.f6526b, o10);
        }
        return null;
    }

    @Override // N0.a
    public a d(String str, String str2) {
        Uri o10 = o(this.f6526b, this.f6527c, str, str2);
        if (o10 != null) {
            return new d(this, this.f6526b, o10);
        }
        return null;
    }

    @Override // N0.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f6526b.getContentResolver(), this.f6527c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // N0.a
    public boolean f() {
        return b.d(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public String i() {
        return b.e(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public Uri j() {
        return this.f6527c;
    }

    @Override // N0.a
    public boolean k() {
        return b.g(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public boolean l() {
        return b.h(this.f6526b, this.f6527c);
    }

    @Override // N0.a
    public a[] m() {
        ContentResolver contentResolver = this.f6526b.getContentResolver();
        Uri uri = this.f6527c;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f6527c, cursor.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                aVarArr[i10] = new d(this, this.f6526b, uriArr[i10]);
            }
            return aVarArr;
        } finally {
            n(cursor);
        }
    }
}
