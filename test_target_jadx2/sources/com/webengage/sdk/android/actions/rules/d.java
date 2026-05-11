package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.y3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static d f30461b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30462c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30463a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (d.f30461b == null) {
                d unused = d.f30461b = new d(context, null);
            }
            return d.f30461b;
        }
    }

    private d(Context context) {
        this.f30463a = null;
        this.f30463a = context.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0155. Please report as an issue. */
    public Map<String, Object> b(y3 y3Var, Object obj) {
        WebEngageConstant.d dVar;
        char c10;
        HashMap hashMap = new HashMap();
        if (obj instanceof p0) {
            ArrayList arrayList = new ArrayList();
            p0 p0Var = (p0) obj;
            String d10 = p0Var.d();
            if (d10 != null && "system".equals(p0Var.b())) {
                switch (d10.hashCode()) {
                    case -2135424194:
                        if (d10.equals("app_personalization_view")) {
                            c10 = 22;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1972881700:
                        if (d10.equals("app_installed")) {
                            c10 = 16;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1791094769:
                        if (d10.equals("app_personalization_click")) {
                            c10 = 24;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1676488036:
                        if (d10.equals("we_wk_progress_bar_push_notification_rerender")) {
                            c10 = 25;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1571863175:
                        if (d10.equals("notification_view")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1500572364:
                        if (d10.equals("notification_click")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1500566108:
                        if (d10.equals("notification_close")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1408232839:
                        if (d10.equals("push_notification_click")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1408226583:
                        if (d10.equals("push_notification_close")) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1398970167:
                        if (d10.equals("notification_control_group")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1310224610:
                        if (d10.equals("user_update_geo_info")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1203939164:
                        if (d10.equals("app_personalization_control_group")) {
                            c10 = 23;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1139037360:
                        if (d10.equals("push_notification_received")) {
                            c10 = '\r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1038562278:
                        if (d10.equals("we_wk_screen_navigated")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -995801710:
                        if (d10.equals("we_wk_push_notification_rerender")) {
                            c10 = 14;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -876147820:
                        if (d10.equals("push_notification_view")) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -687967635:
                        if (d10.equals("we_wk_page_delay")) {
                            c10 = 19;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -228093336:
                        if (d10.equals("app_crashed")) {
                            c10 = 21;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -217294450:
                        if (d10.equals("user_logged_in")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -96895043:
                        if (d10.equals("user_update")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 170551543:
                        if (d10.equals("user_delete_attributes")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 503961794:
                        if (d10.equals("push_notification_item_view")) {
                            c10 = 15;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 793481382:
                        if (d10.equals("visitor_new_session")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1220490790:
                        if (d10.equals("app_upgraded")) {
                            c10 = 17;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1555512768:
                        if (d10.equals("we_wk_session_delay")) {
                            c10 = 20;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1853812741:
                        if (d10.equals("user_logged_out")) {
                            c10 = 18;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        arrayList.add(WebEngageConstant.d.SESSION_RULE);
                    case 4:
                        dVar = WebEngageConstant.d.PAGE_RULE;
                        arrayList.add(dVar);
                        hashMap.put("execution_chain", arrayList);
                        break;
                    case 5:
                        arrayList.add(WebEngageConstant.d.SESSION_RULE);
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                        arrayList.add(WebEngageConstant.d.PAGE_RULE);
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case '\f':
                    case '\r':
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                    case 19:
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        dVar = WebEngageConstant.d.EVENT_RULE;
                        arrayList.add(dVar);
                        hashMap.put("execution_chain", arrayList);
                        break;
                }
                hashMap.put("event_state_data", p0Var);
            }
            dVar = WebEngageConstant.d.EVENT_RULE;
            arrayList.add(dVar);
            hashMap.put("execution_chain", arrayList);
            hashMap.put("event_state_data", p0Var);
        } else {
            hashMap.put("execution_chain", obj);
        }
        return hashMap;
    }

    /* synthetic */ d(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        Map<String, Object> b10 = b(y3Var, obj);
        if (b10.get("execution_chain") != null) {
            new c(this.f30463a).d(b10);
        }
    }
}
