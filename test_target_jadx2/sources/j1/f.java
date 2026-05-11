package j1;

import android.database.Cursor;
import j1.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import l1.g;

/* loaded from: classes.dex */
public abstract class f {
    private static final Map a(g gVar, String str) {
        Cursor X02 = gVar.X0("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = X02;
            if (cursor.getColumnCount() <= 0) {
                Map h10 = G.h();
                kotlin.io.c.a(X02, null);
                return h10;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            Map c10 = G.c();
            while (cursor.moveToNext()) {
                String name = cursor.getString(columnIndex);
                String type = cursor.getString(columnIndex2);
                boolean z10 = cursor.getInt(columnIndex3) != 0;
                int i10 = cursor.getInt(columnIndex4);
                String string = cursor.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                c10.put(name, new e.a(name, type, z10, i10, string, 2));
            }
            Map b10 = G.b(c10);
            kotlin.io.c.a(X02, null);
            return b10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.c.a(X02, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c10 = CollectionsKt.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            c10.add(new e.d(i10, i11, string, string2));
        }
        return CollectionsKt.E0(CollectionsKt.a(c10));
    }

    private static final Set c(g gVar, String str) {
        Cursor X02 = gVar.X0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = X02;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List b10 = b(cursor);
            cursor.moveToPosition(-1);
            Set b11 = O.b();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i10 = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : b10) {
                        if (((e.d) obj).d() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.c());
                        arrayList2.add(dVar.e());
                    }
                    String string = cursor.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursor.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursor.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    b11.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a10 = O.a(b11);
            kotlin.io.c.a(X02, null);
            return a10;
        } finally {
        }
    }

    private static final e.C0515e d(g gVar, String str, boolean z10) {
        Cursor X02 = gVar.X0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = X02;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i10 = cursor.getInt(columnIndex);
                        String columnName = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i10);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List O02 = CollectionsKt.O0(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                e.C0515e c0515e = new e.C0515e(str, z10, O02, CollectionsKt.O0(values2));
                kotlin.io.c.a(X02, null);
                return c0515e;
            }
            kotlin.io.c.a(X02, null);
            return null;
        } finally {
        }
    }

    private static final Set e(g gVar, String str) {
        Cursor X02 = gVar.X0("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = X02;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set b10 = O.b();
                while (cursor.moveToNext()) {
                    if (Intrinsics.b("c", cursor.getString(columnIndex2))) {
                        String name = cursor.getString(columnIndex);
                        boolean z10 = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        e.C0515e d10 = d(gVar, name, z10);
                        if (d10 == null) {
                            kotlin.io.c.a(X02, null);
                            return null;
                        }
                        b10.add(d10);
                    }
                }
                Set a10 = O.a(b10);
                kotlin.io.c.a(X02, null);
                return a10;
            }
            kotlin.io.c.a(X02, null);
            return null;
        } finally {
        }
    }

    public static final e f(g database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
